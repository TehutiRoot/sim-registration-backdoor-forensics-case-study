package androidx.core.p005os;

import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.ProcessCompat */
/* loaded from: classes2.dex */
public final class ProcessCompat {

    /* renamed from: androidx.core.os.ProcessCompat$a */
    /* loaded from: classes2.dex */
    public static class C4048a {

        /* renamed from: a */
        public static final Object f33957a = new Object();

        /* renamed from: b */
        public static Method f33958b;

        /* renamed from: c */
        public static boolean f33959c;

        /* renamed from: a */
        public static boolean m57165a(int i) {
            try {
                synchronized (f33957a) {
                    if (!f33959c) {
                        f33959c = true;
                        f33958b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f33958b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    /* renamed from: androidx.core.os.ProcessCompat$b */
    /* loaded from: classes2.dex */
    public static class C4049b {
        /* renamed from: a */
        public static boolean m57164a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    public static boolean isApplicationUid(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4049b.m57164a(i);
        }
        return C4048a.m57165a(i);
    }
}
