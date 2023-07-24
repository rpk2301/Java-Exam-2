package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String ret = "";
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            ret += " ";
        }
        ret = ret + stringToBePadded;
        return ret;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String ret = "";
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            ret += " ";
        }
        ret = stringToBePadded + ret;
        return ret;


    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String ret = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            ret += stringToBeRepeated;
        }
        return ret;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean hit = true;
        String ret = string.replace(" ", "");
        for (int i = 0; i < ret.length(); i++) {
            if (!Character.isAlphabetic(ret.charAt(i))) {
                hit = false;
            }
        }
        return hit;


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        Boolean hit = true;
        String ret = string.replace(" ", "");
        for (int i = 0; i < ret.length(); i++) {
            if (!Character.isDigit(ret.charAt(i))) {
                hit = false;
            }
        }
        return hit;


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Boolean hit = true;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)) == true || Character.isAlphabetic(string.charAt(i)) == true) {
                hit = false;
            }

        }
        return hit;
    }
}
