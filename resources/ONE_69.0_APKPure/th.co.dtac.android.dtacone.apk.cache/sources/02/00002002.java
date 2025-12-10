package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes.dex */
public final class ImageWriterCompat {
    public static void close(@NonNull ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            AbstractC23060xd0.m499a(imageWriter);
            return;
        }
        throw new RuntimeException("Unable to call close() on API " + i + ". Version 23 or higher required.");
    }

    @NonNull
    public static Image dequeueInputImage(@NonNull ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return AbstractC23060xd0.m498b(imageWriter);
        }
        throw new RuntimeException("Unable to call dequeueInputImage() on API " + i + ". Version 23 or higher required.");
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return AbstractC23406zd0.m90a(surface, i, i2);
        }
        if (i3 >= 26) {
            return AbstractC23233yd0.m269a(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }

    public static void queueInputImage(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            AbstractC23060xd0.m496d(imageWriter, image);
            return;
        }
        throw new RuntimeException("Unable to call queueInputImage() on API " + i + ". Version 23 or higher required.");
    }

    @NonNull
    public static ImageWriter newInstance(@NonNull Surface surface, @IntRange(from = 1) int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return AbstractC23060xd0.m497c(surface, i);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int) on API " + i2 + ". Version 23 or higher required.");
    }
}