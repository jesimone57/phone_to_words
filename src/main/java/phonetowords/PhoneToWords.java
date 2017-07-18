package phonetowords;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jsimone on 7/18/17.
 *
 * List all the words than can be generated from a N-digit phone number.
 *
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

		String base4Format = "%0" + String.valueOf(phoneNumber.length()) + "d";
		String phoneNormalized = phoneNumber.toString().replaceAll("[01]", "");
		//System.out.println("normalize-> "+phoneNormalized);

		for (int i = 0; i < Math.pow(4, phoneNumber.length()); i++) {
			String base4String = Long.toString(i, 4);

			String base4StringPadded = String.format(base4Format, Long.valueOf(base4String));
			//System.out.println(i+"   "+ base4StringPadded);

			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < phoneNumber.length(); j++) {
				try {
					int keyIndex = Integer.valueOf(String.valueOf(phoneNumber.charAt(j)));
					//System.out.println("-->"+keyIndex);
					int place = Integer.valueOf(String.valueOf(base4StringPadded.charAt(j)));
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
		String phoneNumber = "9677549";
		System.out.println("Phone Number: " + phoneNumber);
		Set<String> words = phoneNumberToWords(phoneNumber);
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("Total Number of words: " + words.size());
	}

}
