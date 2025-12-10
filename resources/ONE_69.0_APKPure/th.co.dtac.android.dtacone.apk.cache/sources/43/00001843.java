package p000;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;

/* renamed from: ZT */
/* loaded from: classes2.dex */
public abstract class AbstractC1806ZT {

    /* renamed from: a */
    public static final Class f8189a = m65225e();

    /* renamed from: a */
    public static ExtensionRegistryLite m65229a() {
        if (f8189a != null) {
            try {
                return m65227c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new ExtensionRegistryLite();
    }

    /* renamed from: b */
    public static ExtensionRegistryLite m65228b() {
        if (f8189a != null) {
            try {
                return m65227c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return ExtensionRegistryLite.f34845f;
    }

    /* renamed from: c */
    public static final ExtensionRegistryLite m65227c(String str) {
        return (ExtensionRegistryLite) f8189a.getDeclaredMethod(str, null).invoke(null, null);
    }

    /* renamed from: d */
    public static boolean m65226d(ExtensionRegistryLite extensionRegistryLite) {
        Class cls = f8189a;
        if (cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m65225e() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}