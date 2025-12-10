package p000;

import com.google.android.gms.internal.firebase_ml.C6433E0;

/* renamed from: VK2 */
/* loaded from: classes3.dex */
public abstract class VK2 {

    /* renamed from: a */
    public static final NK2 f6622a = new C6433E0();

    /* renamed from: b */
    public static final NK2 f6623b = m65863a();

    /* renamed from: a */
    public static NK2 m65863a() {
        try {
            return (NK2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static NK2 m65862b() {
        return f6622a;
    }

    /* renamed from: c */
    public static NK2 m65861c() {
        NK2 nk2 = f6623b;
        if (nk2 != null) {
            return nk2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
