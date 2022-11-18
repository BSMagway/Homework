package by.itstep.StringHomework.StringHomeworkTest;

import by.itstep.StringHomework.StringHomework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHomeworkTest {

    @Test
    void sentenceFirstLetterToUp() {
        assertEquals("From. The. List on the. Main toolbar.", StringHomework.sentenceFirstLetterToUp("from. the. list on the. main toolbar."));
    }

    @Test
    void letterInStringTwoTimes() {
        assertEquals('c', StringHomework.letterInStringTwoTimes("abcdfrecghj"));
        assertEquals('f', StringHomework.letterInStringTwoTimes("fbcdreghjf"));
    }

    @Test
    void letterInStringMoreThanOther() {
        assertEquals('d', StringHomework.letterInStringMoreThanOther("dadabcdfdrcdecgchjd"));
    }

    @Test
    void changeCaseString() {
        assertEquals("FroM THe lIST", StringHomework.changeCaseString("fROm thE List"));
    }

    @Test
    void showStringsBetweenWhiteSpace() {
        assertArrayEquals((new String[] {"From", "the", "list"}), StringHomework.showStringsBetweenWhiteSpace("From the list"));
    }

    @Test
    void findSubstringFromThreeLetter() {
        assertEquals("ddd", StringHomework.findSubstringFromThreeLetter("Fromddd dddthe ldddist"));
        assertEquals("der", StringHomework.findSubstringFromThreeLetter("From dertheder listder"));
    }

    @Test
    void howManyWordsInStringBetweenWhiteSpace() {
        assertEquals(3, StringHomework.howManyWordsInStringBetweenWhiteSpace("From the list"));

    }

    @Test
    void howManyUpperAndLowerCaseLettersInString() {
        assertArrayEquals(new int[] {5, 6}, StringHomework.howManyUpperAndLowerCaseLettersInString("FroM The LiSt"));

    }

    @Test
    void longestWord() {
        assertEquals("lists", StringHomework.longestWord("From the lists"));
    }

    @Test
    void removeRepeatLetterAndWhiteSpace() {
        assertEquals("abcdef", StringHomework.removeRepeatLetterAndWhiteSpace("abc cde def"));
    }

    @Test
    void findAllDigitsInString() {
        assertArrayEquals(new int[] {48, 9, 13, 0}, StringHomework.findAllDigitsInString("data 48 call 9 read13 blank0a"));

    }

    @Test
    void palindromeStringBuilder() {

        assertTrue(StringHomework.palindromeStringBuilder("Vol    OV"));
        assertFalse(StringHomework.palindromeStringBuilder("volsd"));
    }

    @Test
    void palindromeString() {
        assertTrue(StringHomework.palindromeString("Vol    OV"));
        assertFalse(StringHomework.palindromeString("volsd"));
    }

    @Test
    void deleteLetterFromStringReplaceAll() {
        assertEquals("From he lis", StringHomework.deleteLetterFromStringReplaceAll("From the list", 't'));
    }

    @Test
    void deleteLetterFromStringWithoutReplace() {
        assertEquals("From he lis", StringHomework.deleteLetterFromStringWithoutReplace("From the list", 't'));
    }
}