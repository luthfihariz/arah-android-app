package arah.android.app.util;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * Created by adani on 17/11/2015.
 */
public class TypefaceUtils {
    private static final String TAG = "Typefaces";

    public static final String PATH_ROBOTO_BLACK = "fonts/roboto_black.ttf";
    public static final String PATH_ROBOTO_LIGHT = "fonts/roboto_light.ttf";

    private static final Hashtable<String, Typeface> cache = new Hashtable<>();

    /**
     * Get the specified typeface
     *
     * @param c
     * @param assetPath one of the defined PATH_* constant or your custom typeface path
     * @return the typeface
     */
    public static Typeface get(Context c, String assetPath) {
        synchronized (cache) {
            if (!cache.containsKey(assetPath)) {
                try {
                    Typeface t = Typeface.createFromAsset(c.getAssets(), assetPath);
                    cache.put(assetPath, t);
                } catch (Exception e) {
                    Throwable t = new Throwable("Could not get typeface '" + assetPath + "'", e);
                    return null;
                }
            }
            return cache.get(assetPath);
        }
    }
}
