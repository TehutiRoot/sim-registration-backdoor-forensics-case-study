package p000;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: rd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC21958rd0 {
    /* renamed from: a */
    public static void m23306a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* renamed from: b */
    public static Image m23305b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* renamed from: c */
    public static ImageWriter m23304c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* renamed from: d */
    public static void m23303d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
