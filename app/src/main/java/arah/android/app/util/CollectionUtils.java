package arah.android.app.util;

import java.util.Collection;

/**
 * Created by Luthfi on 15/12/2015.
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection collection) {
        return (collection == null || collection.isEmpty());
    }
}
