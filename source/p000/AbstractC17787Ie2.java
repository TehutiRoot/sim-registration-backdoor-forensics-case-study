package p000;

import com.google.android.gms.internal.clearcut.zzbt;

/* renamed from: Ie2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17787Ie2 {

    /* renamed from: a */
    public static final Class f2568a = m67886a();

    /* renamed from: a */
    public static Class m67886a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzbt m67885b() {
        Class cls = f2568a;
        if (cls != null) {
            try {
                return (zzbt) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return zzbt.f45555c;
    }
}
