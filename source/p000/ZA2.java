package p000;

import com.google.android.gms.internal.measurement.C6529c;

/* renamed from: ZA2 */
/* loaded from: classes3.dex */
public abstract class ZA2 {

    /* renamed from: a */
    public static final KA2 f7971a = new C6529c();

    /* renamed from: b */
    public static final KA2 f7972b;

    static {
        KA2 ka2 = null;
        try {
            ka2 = (KA2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f7972b = ka2;
    }

    /* renamed from: a */
    public static KA2 m65262a() {
        KA2 ka2 = f7972b;
        if (ka2 != null) {
            return ka2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static KA2 m65261b() {
        return f7971a;
    }
}
