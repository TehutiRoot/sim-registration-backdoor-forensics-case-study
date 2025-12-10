package p046rx.internal.util;

/* renamed from: rx.internal.util.PlatformDependent */
/* loaded from: classes7.dex */
public final class PlatformDependent {
    public static final int ANDROID_API_VERSION_IS_NOT_ANDROID = 0;

    /* renamed from: a */
    public static final int f79210a;

    /* renamed from: b */
    public static final boolean f79211b;

    static {
        boolean z;
        int m22878a = m22878a();
        f79210a = m22878a;
        if (m22878a != 0) {
            z = true;
        } else {
            z = false;
        }
        f79211b = z;
    }

    /* renamed from: a */
    public static int m22878a() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getAndroidApiVersion() {
        return f79210a;
    }

    public static boolean isAndroid() {
        return f79211b;
    }
}
