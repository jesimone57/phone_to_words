package phonetowords;

import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;


/**
 * Created by jsimone on 7/18/17.
 */
public class PhoneToWordsTest {

	@Test
	public void getKeyCharacterAsNull() {
		assertEquals(null, PhoneToWords.getKeyCharacter(0, 0));
		assertEquals(null, PhoneToWords.getKeyCharacter(0, 1));
		assertEquals(null, PhoneToWords.getKeyCharacter(0, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(0, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(0, 4));

		assertEquals(null, PhoneToWords.getKeyCharacter(1, 0));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 1));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 4));

		assertEquals(null, PhoneToWords.getKeyCharacter(26, 0));
		assertEquals(null, PhoneToWords.getKeyCharacter(-1, 1));
		assertEquals(null, PhoneToWords.getKeyCharacter(15, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(105, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(6000, 4));
	}

	@Test
	public void getKeyCharacter() {
		assertEquals(null, PhoneToWords.getKeyCharacter(2, -1));
		assertEquals("A", PhoneToWords.getKeyCharacter(2, 0));
		assertEquals("B", PhoneToWords.getKeyCharacter(2, 1));
		assertEquals("C", PhoneToWords.getKeyCharacter(2, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(2, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(2, 4));
	}

	@Test
	public void phoneToWords() {
		assertEquals(new TreeSet<String>(Arrays.asList("AA", "AB", "AC", "BA", "BB", "BC", "CA", "CB", "CC")), PhoneToWords.phoneNumberToWords("22"));
	}

	@Test(expected=IllegalArgumentException.class)
	public void phoneToWordsInvalidCharacters() {
		PhoneToWords.phoneNumberToWords("2-.abcd$");
	}

	@Test
	public void phoneToWordsNumberTwo() {
		assertEquals(new TreeSet<String>(Arrays.asList("A", "B", "C")), PhoneToWords.phoneNumberToWords("2"));
		assertEquals(new TreeSet<String>(Arrays.asList("A", "B", "C")), PhoneToWords.phoneNumberToWords("12"));
		assertEquals(new TreeSet<String>(Arrays.asList("A", "B", "C")), PhoneToWords.phoneNumberToWords("21"));
		assertEquals(new TreeSet<String>(Arrays.asList("A", "B", "C")), PhoneToWords.phoneNumberToWords("10210"));
		assertEquals(new TreeSet<String>(Arrays.asList("A", "B", "C")), PhoneToWords.phoneNumberToWords("01210"));
	}

	@Test
	public void phoneToWordsNumberNine() {
		assertEquals(new TreeSet<String>(Arrays.asList("W", "X", "Y", "Z")), PhoneToWords.phoneNumberToWords("9"));
		assertEquals(new TreeSet<String>(Arrays.asList("W", "X", "Y", "Z")), PhoneToWords.phoneNumberToWords("19"));
		assertEquals(new TreeSet<String>(Arrays.asList("W", "X", "Y", "Z")), PhoneToWords.phoneNumberToWords("91"));
		assertEquals(new TreeSet<String>(Arrays.asList("W", "X", "Y", "Z")), PhoneToWords.phoneNumberToWords("10910"));
		assertEquals(new TreeSet<String>(Arrays.asList("W", "X", "Y", "Z")), PhoneToWords.phoneNumberToWords("01910"));
	}

	@Test
	public void phoneToWordsEmptySet() {
		assertEquals(new TreeSet<String>(), PhoneToWords.phoneNumberToWords("01101"));
	}

	@Test
	public void phoneToWordsNines() {
		assertEquals(new TreeSet<String>(Arrays.asList(
				"WW", "WX", "WY", "WZ",
				"XW", "XX", "XY", "XZ",
				"YW", "YX", "YY", "YZ",
				"ZW", "ZX", "ZY", "ZZ"
		)), PhoneToWords.phoneNumberToWords("99"));
	}

	@Test
	public void phoneToWordsTwoNine() {
		assertEquals(new TreeSet<String>(Arrays.asList(
				"AW", "AX", "AY", "AZ",
				"BW", "BX", "BY", "BZ",
				"CW", "CX", "CY", "CZ"
		)), PhoneToWords.phoneNumberToWords("29"));
	}

}





