package p000;

import com.google.protobuf.ExtensionRegistryLite;

/* renamed from: YT */
/* loaded from: classes4.dex */
public abstract class AbstractC1738YT {

    /* renamed from: a */
    public static final Class f7871a = m65449e();

    /* renamed from: a */
    public static ExtensionRegistryLite m65453a() {
        ExtensionRegistryLite m65451c = m65451c("newInstance");
        if (m65451c == null) {
            return new ExtensionRegistryLite();
        }
        return m65451c;
    }

    /* renamed from: b */
    public static ExtensionRegistryLite m65452b() {
        ExtensionRegistryLite m65451c = m65451c("getEmptyRegistry");
        if (m65451c == null) {
            return ExtensionRegistryLite.f57308e;
        }
        return m65451c;
    }

    /* renamed from: c */
    public static final ExtensionRegistryLite m65451c(String str) {
        Class cls = f7871a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m65450d(ExtensionRegistryLite extensionRegistryLite) {
        Class cls = f7871a;
        if (cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m65449e() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}