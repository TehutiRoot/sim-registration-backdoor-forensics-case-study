package p000;

import com.google.android.gms.internal.clearcut.C6396d;

/* renamed from: ff2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19902ff2 {

    /* renamed from: a */
    public static final AbstractC18171Oe2 f61879a = new C6396d();

    /* renamed from: b */
    public static final AbstractC18171Oe2 f61880b = m31273a();

    /* renamed from: a */
    public static AbstractC18171Oe2 m31273a() {
        try {
            return (AbstractC18171Oe2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static AbstractC18171Oe2 m31272b() {
        return f61879a;
    }

    /* renamed from: c */
    public static AbstractC18171Oe2 m31271c() {
        AbstractC18171Oe2 abstractC18171Oe2 = f61880b;
        if (abstractC18171Oe2 != null) {
            return abstractC18171Oe2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
