package p000;

import android.os.SystemClock;
import coil.util.Logger;
import java.io.File;

/* renamed from: dX */
/* loaded from: classes3.dex */
public final class C10082dX {

    /* renamed from: a */
    public static final C10082dX f61180a = new C10082dX();

    /* renamed from: b */
    public static final File f61181b = new File("/proc/self/fd");

    /* renamed from: c */
    public static int f61182c = 30;

    /* renamed from: d */
    public static long f61183d = SystemClock.uptimeMillis();

    /* renamed from: e */
    public static boolean f61184e = true;

    /* renamed from: a */
    public final boolean m31862a() {
        int i = f61182c;
        f61182c = i + 1;
        if (i < 30 && SystemClock.uptimeMillis() <= f61183d + 30000) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized boolean m31861b(Logger logger) {
        try {
            if (m31862a()) {
                boolean z = false;
                f61182c = 0;
                f61183d = SystemClock.uptimeMillis();
                String[] list = f61181b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                if (length < 800) {
                    z = true;
                }
                f61184e = z;
                if (!z && logger != null && logger.getLevel() <= 5) {
                    logger.log("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61184e;
    }
}
