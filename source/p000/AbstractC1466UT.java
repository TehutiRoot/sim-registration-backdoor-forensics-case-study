package p000;

import com.google.protobuf.ExtensionRegistryLite;

/* renamed from: UT */
/* loaded from: classes4.dex */
public abstract class AbstractC1466UT {

    /* renamed from: a */
    public static final Class f6345a = m66029e();

    /* renamed from: a */
    public static ExtensionRegistryLite m66033a() {
        ExtensionRegistryLite m66031c = m66031c("newInstance");
        if (m66031c == null) {
            return new ExtensionRegistryLite();
        }
        return m66031c;
    }

    /* renamed from: b */
    public static ExtensionRegistryLite m66032b() {
        ExtensionRegistryLite m66031c = m66031c("getEmptyRegistry");
        if (m66031c == null) {
            return ExtensionRegistryLite.f57296e;
        }
        return m66031c;
    }

    /* renamed from: c */
    public static final ExtensionRegistryLite m66031c(String str) {
        Class cls = f6345a;
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
    public static boolean m66030d(ExtensionRegistryLite extensionRegistryLite) {
        Class cls = f6345a;
        if (cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m66029e() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
