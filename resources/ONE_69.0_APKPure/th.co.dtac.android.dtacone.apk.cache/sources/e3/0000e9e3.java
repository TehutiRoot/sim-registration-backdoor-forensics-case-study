package p000;

import com.google.android.gms.internal.vision.C6637y;

/* renamed from: lz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21052lz2 {

    /* renamed from: a */
    public static final AbstractC19841ez2 f71879a = new C6637y();

    /* renamed from: b */
    public static final AbstractC19841ez2 f71880b = m26746c();

    /* renamed from: a */
    public static AbstractC19841ez2 m26748a() {
        return f71879a;
    }

    /* renamed from: b */
    public static AbstractC19841ez2 m26747b() {
        AbstractC19841ez2 abstractC19841ez2 = f71880b;
        if (abstractC19841ez2 != null) {
            return abstractC19841ez2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    public static AbstractC19841ez2 m26746c() {
        try {
            return (AbstractC19841ez2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}