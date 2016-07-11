package arah.android.app.util;

import android.util.Log;


/**
 * Created by adani on 06/11/2015.
 */
public class LogHandler {

    public static final String DEFAULT_TAG = "KudoLogHandler";
    public static final boolean IS_DEBUG = true;

    public static void logDebug(String message) {
        logDebug(DEFAULT_TAG, message);
    }

    public static void logDebug(String tag, String message) {
        if (IS_DEBUG && message != null) {
            Log.d(tag, message);
        }
    }

    public static void logInfo(String message) {
        logInfo(DEFAULT_TAG, message);
    }

    public static void logInfo(String tag, String message) {
        if (IS_DEBUG && message != null) {
            Log.i(tag, message);
        }
    }

    public static void logError(String message) {
        logError(DEFAULT_TAG, message);
    }

    public static void logError(String tag, String message) {
        if (IS_DEBUG && message != null) {
            Log.e(tag, message);
        }
    }

    public static void logWarning(String message) {
        logWarning(DEFAULT_TAG, message);
    }

    public static void logWarning(String tag, String message) {
        if (IS_DEBUG && message != null) {
            Log.w(tag, message);
        }
    }

    public static void logWtf(String message) {
        logWtf(DEFAULT_TAG, message);
    }

    public static void logWtf(String tag, String message) {
        if (IS_DEBUG && message != null) {
            Log.wtf(tag, message);
        }
    }

    public static void logException(Throwable e) {
        logException(DEFAULT_TAG, e);
    }

    public static void logException(String tag, Throwable e) {
        logException(tag, e != null ? "" + e.getMessage() : "Exception", e);
    }

    public static void logException(String tag, String message, Throwable e) {
        if (IS_DEBUG) {
            Log.e(tag, message, e);
        }
    }

    public static void logVerbose(String message) {
        logVerbose(DEFAULT_TAG, message);
    }

    public static void logVerbose(String tag, String message) {
        if (IS_DEBUG && message != null) {
            Log.v(tag, message);
        }
    }
}
