package p000;

import com.google.android.gms.internal.clearcut.C6385d;

/* renamed from: cg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19438cg2 {

    /* renamed from: a */
    public static final AbstractC18016Lf2 f39501a = new C6385d();

    /* renamed from: b */
    public static final AbstractC18016Lf2 f39502b = m51660a();

    /* renamed from: a */
    public static AbstractC18016Lf2 m51660a() {
        try {
            return (AbstractC18016Lf2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static AbstractC18016Lf2 m51659b() {
        return f39501a;
    }

    /* renamed from: c */
    public static AbstractC18016Lf2 m51658c() {
        AbstractC18016Lf2 abstractC18016Lf2 = f39502b;
        if (abstractC18016Lf2 != null) {
            return abstractC18016Lf2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}