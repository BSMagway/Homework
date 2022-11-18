package by.itstep.StringHomework;

import java.util.ArrayList;

public class StringHomework {

    public static String sentenceFirstLetterToUp(String text) {
        String[] findStartWords = text.split("\\. ");
        String result = "";

        for (int i = 0; i < findStartWords.length; i++)
        {
            String words = "";
            words += Character.toString(Character.toUpperCase(findStartWords[i].charAt(0)));
            words += findStartWords[i].substring(1);

            if (i == 0)
            {
                result += words;
            } else
            {
                result += ". " + words;
            }
        }


        return result;
    }

    public static char letterInStringTwoTimes(String text) {
        char result = ' ';

        for (int i = 0; i < text.length(); i++)
        {
            int quantity;
            String[] strings = text.split(Character.toString(text.charAt(i)));

            if (text.charAt(i) == text.charAt(text.length() - 1))
            {
                quantity = strings.length + 1;
            } else
            {
                quantity = strings.length;
            }

            if (quantity == 3)
            {
                result = text.charAt(i);
                break;
            }
        }
        return result;
    }

    public static char letterInStringMoreThanOther(String text) {
        char result = ' ';
        int quantity = 0;

        for (int i = 0; i < text.length(); i++)
        {
            String[] strings = text.split(Character.toString(text.charAt(i)));

            if (strings.length > quantity)
            {
                result = text.charAt(i);
                quantity = strings.length;

                if (text.charAt(i) == text.charAt(text.length() - 1))
                {
                    quantity++;
                }
            }
        }
        return result;
    }

    public static String changeCaseString(String text) {
        String result = "";
        for (char letter : text.toCharArray())
        {
            if (Character.isUpperCase(letter))
            {
                result += Character.toLowerCase(letter);
            } else if (Character.isLowerCase(letter))
            {
                result += Character.toUpperCase(letter);
            } else
            {
                result += letter;
            }

        }
        return result;
    }

    public static String[] showStringsBetweenWhiteSpace(String text) {
        return text.split(" ");
    }

    public static String findSubstringFromThreeLetter(String text)
    {
        String result = "";
        for (int i = 2; i < text.length(); i++)
        {
            String[] arrayStrings = text.split(text.substring(i - 2, i + 1));

            int size = arrayStrings.length;

            if (i == text.length() - 1)
            {
                size++;
            }

            if (size == 4)
            {
                result = text.substring(i - 2, i + 1);
                break;
            }
        }

        return result;
    }

    public static int howManyWordsInStringBetweenWhiteSpace(String text) {
        String[] stringArray = text.trim().split(" ");
        return stringArray.length;
    }

    public static int[] howManyUpperAndLowerCaseLettersInString(String text) {
        int upper = 0;
        int lower = 0;
        char[] chars = text.toCharArray();
        for (char charCase : chars) {
            if (Character.isUpperCase(charCase))
            {
                upper++;
            }
            else if (Character.isLowerCase(charCase))
            {
                lower++;
            }
        }
        return new int[] {upper, lower};
    }

    public static String longestWord(String text) {
        String[] splitText = text.split(" ");
        int indexLongest = 0;

        for (int i = 1; i < splitText.length; i++)
        {
            if (splitText[i].length() > splitText[indexLongest].length())
            {
                indexLongest = i;
            }
        }
        return splitText[indexLongest];
    }

    public static String removeRepeatLetterAndWhiteSpace(String text) {

        text = text.trim();
        String result = Character.toString(text.charAt(0));

        for (int i = 1; i < text.length(); i++)
        {
            if (!Character.isWhitespace(text.charAt(i)))
            {
                for (int j = 0; j < result.length(); j++) {

                    if (text.charAt(i) == result.charAt(j)) {
                        break;
                    }

                    if (j == result.length() - 1) {
                        result += Character.toString(text.charAt(i));
                    }
                }

            }
        }

        return result;
    }

    public static int[] findAllDigitsInString(String text) {

        boolean findDigit = false;
        String digit = "";
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < text.length(); i++)
        {
            if (Character.isDigit(text.charAt(i)))
            {
                findDigit = true;
                digit += Character.toString(text.charAt(i));

            } else if (digit.length() > 0)
            {
                findDigit = false;
            }

            if (digit.length() > 0 && (!findDigit || i == text.length() - 1))
            {
                result.add(Integer.parseInt(digit));
                digit = "";
            }
        }

        int[] arrayInt = new int[result.size()];

        for (int i = 0; i < result.size(); i++)
        {
            arrayInt[i] = result.get(i);
        }

        return arrayInt;
    }

    public static String wordsFromLetters(String text) {
        int wordsCount = (int)(Math.random() * 10) + 2;
        String result = "";

        for (int i = 0; i < wordsCount; i++)
        {
            int wordLength = (int)(Math.random() * 10) + 3;

            for (int j = 0; j < wordLength; j++)
            {
                char letter;

                do {

                    int indexLetter = (int) (Math.random() * text.length());
                    letter = text.charAt(indexLetter);

                } while (Character.isWhitespace(letter));

                result += Character.toString(letter);

                if (j == wordLength - 1)
                {
                    result += " ";
                }
            }
        }

        return result;
    }

    public static boolean palindromeStringBuilder(String text) {
        text = text.replaceAll(" ", "").toUpperCase();
        StringBuilder stringForEquals = new StringBuilder(text);
        stringForEquals.reverse();

        return text.equals(stringForEquals.toString());
    }

    public static boolean palindromeString(String text) {
        text = text.replaceAll(" ", "").toUpperCase();
        String stringForEqual = "";
        for (int i = text.length() -1; i >= 0; i--)
        {
            stringForEqual += text.charAt(i);
        }

        return text.equals(stringForEqual);
    }

    public static String deleteLetterFromStringReplaceAll(String text, char letterForDelete) {

        return text.replaceAll(Character.toString(letterForDelete), "");
    }

    public static String deleteLetterFromStringWithoutReplace(String text, char letterForDelete) {

        String result = "";
        for (int i = 0; i < text.length(); i++)
        {
            char charForEquals = text.charAt(i);
            if (charForEquals != letterForDelete) {
                result += charForEquals;
            }
        }

        return result;
    }




}
