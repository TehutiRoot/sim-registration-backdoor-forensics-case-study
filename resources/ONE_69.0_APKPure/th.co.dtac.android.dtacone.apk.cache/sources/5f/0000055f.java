package p000;

import com.google.android.gms.internal.clearcut.zzbt;

/* renamed from: Ff2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17626Ff2 {

    /* renamed from: a */
    public static final Class f1742a = m68399a();

    /* renamed from: a */
    public static Class m68399a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzbt m68398b() {
        Class cls = f1742a;
        if (cls != null) {
            try {
                return (zzbt) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return zzbt.f45567c;
    }
}