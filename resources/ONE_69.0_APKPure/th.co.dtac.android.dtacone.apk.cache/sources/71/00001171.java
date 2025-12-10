package p000;

import com.google.android.gms.internal.firebase_ml.C6422E0;

/* renamed from: SL2 */
/* loaded from: classes3.dex */
public abstract class SL2 {

    /* renamed from: a */
    public static final KL2 f5813a = new C6422E0();

    /* renamed from: b */
    public static final KL2 f5814b = m66512a();

    /* renamed from: a */
    public static KL2 m66512a() {
        try {
            return (KL2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static KL2 m66511b() {
        return f5813a;
    }

    /* renamed from: c */
    public static KL2 m66510c() {
        KL2 kl2 = f5814b;
        if (kl2 != null) {
            return kl2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}