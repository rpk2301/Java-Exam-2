package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String ret="";
        for(int i=string1.length()-1; i>=0;i--)
        {
            ret+=string1.charAt(i);
        }
        return ret;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String ret1 = BasicStringUtils.reverse(string1);
        String ret2 = BasicStringUtils.reverse(string2);
        return ret1+ret2;


    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String ret="";
        Character[] remove = new Character[charactersToRemove.length()];


        for(int i =0; i<string.length();i++)
        {
            boolean hit = false;
            for(int f = 0;f<charactersToRemove.length();f++)
            {
                   if(string.charAt(i)==charactersToRemove.charAt(f))
                   {
                       hit = true;
                   }

            }
            if(hit==false)
            {
                ret+=string.charAt(i);
            }
        }

        return ret;

    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        String ret =BasicStringUtils.removeCharacters(string,charactersToRemove);
        ret = BasicStringUtils.reverse(ret);
        return ret;


    }
}
