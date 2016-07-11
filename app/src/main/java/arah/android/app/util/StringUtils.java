package arah.android.app.util;

import java.text.BreakIterator;
import java.util.List;

/**
 * Created by Luthfi on 27/11/2015.
 */
public class StringUtils {
    /**
     * Build comma separated list item
     *
     * @param listItem
     * @return string
     */
    public static String buildListItemToString(List<?> listItem) {
        if (listItem == null || listItem.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean foundOne = false;

        for (int i = 0; i < listItem.size(); ++i) {
            if (foundOne) {
                sb.append(", ");
            }
            sb.append(listItem.get(i).toString());
            foundOne = true;
        }

        return sb.toString();
    }

    /**
     * Truncate string to the maximum length without have to cut the word
     *
     * @param string
     * @param maximumLength
     * @return truncated string
     */
    public static String truncateToTheClosestWord(String string, int maximumLength) {
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(string);
        int firstAfter = breakIterator.following(maximumLength);
        String result = string.substring(0, firstAfter);
        if (result.length() < string.length()) {
            result += "...";
        }

        return result;
    }


    /**
     * Capitalize each word
     *
     * @param param
     * @return Ex : "Lorem Ipsum Sit Dolor Amet"
     */
    public static String capitalizeFirstWord(String param) {
        StringBuffer res = new StringBuffer();
        String[] strArr = param.split(" ");
        for (String str : strArr) {
            char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            str = new String(stringArray);

            res.append(str).append(" ");
        }

        return res.toString();
    }
}
