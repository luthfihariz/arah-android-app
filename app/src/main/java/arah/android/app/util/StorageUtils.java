package arah.android.app.util;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by adani on 11/01/2016.
 */
public final class StorageUtils {

    private StorageUtils() {}

    /* Checks if external storage is available for read and write */
    public static boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    /* Checks if external storage is available to at least read */
    public static boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) ||
            Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;
    }

    public static File getInternalStorageFolder(Context context, String folderName)
        throws FileNotFoundException {
        File dataDir = new File(context.getFilesDir(), folderName);
        if (dataDir.exists() && dataDir.isDirectory()) {
            return dataDir;
        } else if (dataDir.mkdirs()) {
            return dataDir;
        } else {
            throw new FileNotFoundException("Folder " + folderName +
                " is not found and cannot be created in internal storage");
        }
    }

    public static void wipeFolder(File folder) {
        File[] files = folder.listFiles();
        for (File file : files) {
            //noinspection ResultOfMethodCallIgnored
            file.delete();
        }
    }
}
