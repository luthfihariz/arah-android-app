package arah.android.app.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

/**
 * Created by adani on 16/11/2015.
 */
public class ImageLoader {

    private static com.nostra13.universalimageloader.core.ImageLoader UilImageLoader =
            com.nostra13.universalimageloader.core.ImageLoader.getInstance();

    public static void initImageLoader(Context context) {
        DisplayImageOptions displayImageOptions =
                new DisplayImageOptions.Builder().resetViewBeforeLoading(true)
                        .cacheInMemory(false)
                        .cacheOnDisk(true)
                        .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2)
                        .bitmapConfig(Bitmap.Config.RGB_565)
                        .build();
        ImageLoaderConfiguration.Builder configBuilder =
                new ImageLoaderConfiguration.Builder(context).defaultDisplayImageOptions(
                        displayImageOptions);
        UilImageLoader.init(configBuilder.build());
    }

    public static void load(String fullUrl, ImageView view) {
        UilImageLoader.displayImage(fullUrl, view);
    }

    public static void load(String fullUrl, ImageView view, DisplayImageOptions options) {
        UilImageLoader.displayImage(fullUrl, view, options);
    }

    public static void load(String fullUrl, ImageView view, ImageLoadingListener listener) {
        UilImageLoader.displayImage(fullUrl, view, listener);
    }

    public static void load(String fullUrl, ImageView view, DisplayImageOptions options,
                            ImageLoadingListener listener) {
        UilImageLoader.displayImage(fullUrl, view, options, listener);
    }

    public static com.nostra13.universalimageloader.core.ImageLoader getUilInstance() {
        return UilImageLoader;
    }
}
