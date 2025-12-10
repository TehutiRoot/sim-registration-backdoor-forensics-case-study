package p046rx.internal.util;

/* renamed from: rx.internal.util.PlatformDependent */
/* loaded from: classes7.dex */
public final class PlatformDependent {
    public static final int ANDROID_API_VERSION_IS_NOT_ANDROID = 0;

    /* renamed from: a */
    public static final int f79416a;

    /* renamed from: b */
    public static final boolean f79417b;

    static {
        boolean z;
        int m23066a = m23066a();
        f79416a = m23066a;
        if (m23066a != 0) {
            z = true;
        } else {
            z = false;
        }
        f79417b = z;
    }

    /* renamed from: a */
    public static int m23066a() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getAndroidApiVersion() {
        return f79416a;
    }

    public static boolean isAndroid() {
        return f79417b;
    }
}