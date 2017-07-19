package phonetowords;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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
		assertEquals(null, PhoneToWords.getKeyCharacter(0, 5));

		assertEquals(null, PhoneToWords.getKeyCharacter(1, 0));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 1));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(1, 5));

		assertEquals(null, PhoneToWords.getKeyCharacter(26, 0));
		assertEquals(null, PhoneToWords.getKeyCharacter(-1, 1));
		assertEquals(null, PhoneToWords.getKeyCharacter(15, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(105, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(6000, 4));
		assertEquals(null, PhoneToWords.getKeyCharacter(244, 5));
	}

	@Test
	public void getKeyCharacter() {
		assertEquals(null, PhoneToWords.getKeyCharacter(2, -1));
		assertEquals("A", PhoneToWords.getKeyCharacter(2, 0));
		assertEquals("B", PhoneToWords.getKeyCharacter(2, 1));
		assertEquals("C", PhoneToWords.getKeyCharacter(2, 2));
		assertEquals(null, PhoneToWords.getKeyCharacter(2, 3));
		assertEquals(null, PhoneToWords.getKeyCharacter(2, 4));
		assertEquals(null, PhoneToWords.getKeyCharacter(2, 5));
	}

	@Test
	public void phoneToWords() {
		assertEquals(new TreeSet<String>(Arrays.asList("AA", "AB", "AC", "BA", "BB", "BC", "CA", "CB", "CC")),
				PhoneToWords.phoneNumberToWords("22"));
	}

	@Test(expected = IllegalArgumentException.class)
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

	@Test
	public void phoneToWordsPhoneNumberHasAll3LetterMappings() {
		Set<String> words = PhoneToWords.phoneNumberToWords("2345568");
		assertEquals(Math.pow(3, 7), words.size(), 0.01);
	}

	@Test
	public void phoneToWordsPhoneNumberHasAll4LetterMappings() {
		Set<String> words = PhoneToWords.phoneNumberToWords("797");
		assertEquals(Math.pow(4, 3), words.size(), 0.01);
	}

	@Test
	public void phoneToWordsPhoneNumberHas3And4LetterMappings() {
		Set<String> words = PhoneToWords.phoneNumberToWords("2345769");
		assertEquals(Math.pow(4, 2) * Math.pow(3, 5), words.size(), 0.01);
	}

	@Test
	public void phoneToWordsPhoneNumberHas4LetterMappingsAnd0And1() {
		Set<String> words = PhoneToWords.phoneNumberToWords("197907");
		assertEquals(Math.pow(4, 4), words.size(), 0.01);
	}

	@Test
	public void phoneToWordsPhoneNumberHas3LetterMappingsAnd0And1() {
		Set<String> words = PhoneToWords.phoneNumberToWords("125603");
		assertEquals(Math.pow(3, 4), words.size(), 0.01);
	}

	@Test
	public void phoneToWordsContainsWords() {
		Set<String> words = PhoneToWords.phoneNumberToWords("2222222");
		assertTrue(words.contains("CABABAB"));
		assertTrue(words.contains("BABACAB"));
		assertTrue(words.contains("BACACAC"));

		assertTrue(words.contains("AAAAAAA"));
		assertTrue(words.contains("BBBBBBB"));
		assertTrue(words.contains("CCCCCCC"));
	}

	@Test
	public void phoneToWordsContainsWords2() {
		Set<String> words = PhoneToWords.phoneNumberToWords("228728");
		assertTrue(words.contains("CATRAT"));
		assertTrue(words.contains("BATRAT"));
	}

}





