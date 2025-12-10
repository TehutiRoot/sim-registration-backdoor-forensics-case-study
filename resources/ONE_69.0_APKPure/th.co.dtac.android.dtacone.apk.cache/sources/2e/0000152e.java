package p000;

import com.google.android.gms.internal.measurement.C6518c;

/* renamed from: WB2 */
/* loaded from: classes3.dex */
public abstract class WB2 {

    /* renamed from: a */
    public static final HB2 f7215a = new C6518c();

    /* renamed from: b */
    public static final HB2 f7216b;

    static {
        HB2 hb2 = null;
        try {
            hb2 = (HB2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f7216b = hb2;
    }

    /* renamed from: a */
    public static HB2 m65796a() {
        HB2 hb2 = f7216b;
        if (hb2 != null) {
            return hb2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static HB2 m65795b() {
        return f7215a;
    }
}