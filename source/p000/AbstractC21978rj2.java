package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6568b;

/* renamed from: rj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21978rj2 {

    /* renamed from: a */
    public static final AbstractC20602jj2 f77384a = new C6568b();

    /* renamed from: b */
    public static final AbstractC20602jj2 f77385b;

    static {
        AbstractC20602jj2 abstractC20602jj2 = null;
        try {
            abstractC20602jj2 = (AbstractC20602jj2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f77385b = abstractC20602jj2;
    }

    /* renamed from: a */
    public static AbstractC20602jj2 m23278a() {
        AbstractC20602jj2 abstractC20602jj2 = f77385b;
        if (abstractC20602jj2 != null) {
            return abstractC20602jj2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC20602jj2 m23277b() {
        return f77384a;
    }
}
