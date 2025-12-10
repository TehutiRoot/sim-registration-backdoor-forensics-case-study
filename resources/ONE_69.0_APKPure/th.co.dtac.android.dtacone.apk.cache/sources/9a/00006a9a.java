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
    public static class C4030a {

        /* renamed from: a */
        public static final Object f34045a = new Object();

        /* renamed from: b */
        public static Method f34046b;

        /* renamed from: c */
        public static boolean f34047c;

        /* renamed from: a */
        public static boolean m57115a(int i) {
            try {
                synchronized (f34045a) {
                    if (!f34047c) {
                        f34047c = true;
                        f34046b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = f34046b;
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
    public static class C4031b {
        /* renamed from: a */
        public static boolean m57114a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    public static boolean isApplicationUid(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4031b.m57114a(i);
        }
        return C4030a.m57115a(i);
    }
}