package p000;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: sd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22130sd0 {

    /* renamed from: a */
    public static Method f79844a;

    static {
        try {
            Class cls = Integer.TYPE;
            f79844a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static ImageWriter m22564a(Surface surface, int i, int i2) {
        Throwable th2 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) Preconditions.checkNotNull(f79844a.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i2)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                th2 = e;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th2);
    }
}
