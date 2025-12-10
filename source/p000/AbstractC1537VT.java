package p000;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;

/* renamed from: VT */
/* loaded from: classes2.dex */
public abstract class AbstractC1537VT {

    /* renamed from: a */
    public static final Class f6651a = m65845e();

    /* renamed from: a */
    public static ExtensionRegistryLite m65849a() {
        if (f6651a != null) {
            try {
                return m65847c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new ExtensionRegistryLite();
    }

    /* renamed from: b */
    public static ExtensionRegistryLite m65848b() {
        if (f6651a != null) {
            try {
                return m65847c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return ExtensionRegistryLite.f34757f;
    }

    /* renamed from: c */
    public static final ExtensionRegistryLite m65847c(String str) {
        return (ExtensionRegistryLite) f6651a.getDeclaredMethod(str, null).invoke(null, null);
    }

    /* renamed from: d */
    public static boolean m65846d(ExtensionRegistryLite extensionRegistryLite) {
        Class cls = f6651a;
        if (cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m65845e() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
