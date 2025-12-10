package p000;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: xd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23060xd0 {
    /* renamed from: a */
    public static void m499a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* renamed from: b */
    public static Image m498b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* renamed from: c */
    public static ImageWriter m497c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* renamed from: d */
    public static void m496d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}