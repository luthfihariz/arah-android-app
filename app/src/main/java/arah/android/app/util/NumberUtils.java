package arah.android.app.util;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by adani on 19/11/2015.
 */
public final class NumberUtils {
    private static final Locale LOCALE = new Locale("in", "ID");

    public static String formatNumber(float number) {
        NumberFormat nf = NumberFormat.getInstance(LOCALE);
        return nf.format(number);
    }

    public static String formatPrice(double price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE);
        return nf.format(price);
    }

    public static String formatPercentage(float number) {
        NumberFormat nf = NumberFormat.getPercentInstance(LOCALE);
        return nf.format(number);
    }
}
