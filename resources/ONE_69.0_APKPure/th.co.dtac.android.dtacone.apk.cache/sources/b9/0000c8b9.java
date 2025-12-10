package p000;

import android.os.SystemClock;
import coil.util.Logger;
import java.io.File;

/* renamed from: hX */
/* loaded from: classes3.dex */
public final class C10369hX {

    /* renamed from: a */
    public static final C10369hX f62500a = new C10369hX();

    /* renamed from: b */
    public static final File f62501b = new File("/proc/self/fd");

    /* renamed from: c */
    public static int f62502c = 30;

    /* renamed from: d */
    public static long f62503d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public static boolean f62504e = true;

    /* renamed from: a */
    public final boolean m31232a() {
        int i = f62502c;
        f62502c = i + 1;
        if (i < 30 && SystemClock.uptimeMillis() <= f62503d + 30000) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean m31231b(Logger logger) {
        try {
            if (m31232a()) {
                boolean z = false;
                f62502c = 0;
                f62503d = SystemClock.uptimeMillis();
                String[] list = f62501b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 800) {
                    z = true;
                }
                f62504e = z;
                if (!z && logger != null && logger.getLevel() <= 5) {
                    logger.log("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f62504e;
    }
}