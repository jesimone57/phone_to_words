package phonetowords;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jsimone on 7/18/17.
 * <p>
 * List all the words than can be generated from a N-digit phone number.
 * <p>
 * A completely original solution.  Please run the unit tests to validate.
 */
public class PhoneToWords {

	private static Map<Integer, String> map = new HashMap<>();

	static {
		map.put(0, null);
		map.put(1, null);
		map.put(2, "ABC");
		map.put(3, "DEF");
		map.put(4, "GHI");
		map.put(5, "JKL");
		map.put(6, "MNO");
		map.put(7, "PQRS");
		map.put(8, "TUV");
		map.put(9, "WXYZ");
	}

	public static String getKeyCharacter(int telephoneKey, int placeIndex) {
		String result = null;
		String s = map.get(telephoneKey);
		if (s != null && placeIndex < s.length() && placeIndex >= 0) {
			result = String.valueOf(s.charAt(placeIndex));
		}
		return result;
	}

	public static Set<String> phoneNumberToWords(String phoneNumber) {
		Set<String> words = new TreeSet<>();

		String zeroPadFormat = "%0" + String.valueOf(phoneNumber.length()) + "d";
		String phoneNormalized = phoneNumber.toString().replaceAll("[01]", "");
		//System.out.println("normalize-> "+phoneNormalized);

		// Note; keypad 7 and 9 need 4 character mapping while all other keys only need 3 character mapping.
		int radix = phoneNormalized.contains("7") || phoneNormalized.contains("9") ? 4 : 3;

		for (int i = 0; i < Math.pow(radix, phoneNumber.length()); i++) {
			String radixString = Long.toString(i, radix);

			String radixStringPadded = String.format(zeroPadFormat, Long.valueOf(radixString));
			//System.out.println(i+"   "+ radixStringPadded);

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < phoneNumber.length(); j++) {
				try {
					int keyIndex = Integer.valueOf(String.valueOf(phoneNumber.charAt(j)));
					//System.out.println("-->"+keyIndex);
					int place = Integer.valueOf(String.valueOf(radixStringPadded.charAt(j)));
					//System.out.println("-->"+place);
					String letter = getKeyCharacter(keyIndex, place);
					if (letter != null) {
						sb.append(letter);
					}
				} catch (NumberFormatException nfex) {
					throw new IllegalArgumentException("Phone number contains non digit 0-9 characters.  Only digits 0-9 allowed.");
				}
			}


			if (sb.length() > 0 && sb.length() == phoneNormalized.length()) {
				words.add(sb.toString());
			}
		}
		return words;
	}

	public static void main(String[] args) {
		String phoneNumber = "228";
		if (args.length != 0) {
			phoneNumber = args[0];
		}
		System.out.println("Phone Number: " + phoneNumber);
		Set<String> words = phoneNumberToWords(phoneNumber);
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("Total Number of words: " + words.size());
	}

}
