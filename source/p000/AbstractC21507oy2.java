package p000;

import com.google.android.gms.internal.vision.C6648y;

/* renamed from: oy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21507oy2 {

    /* renamed from: a */
    public static final AbstractC20303hy2 f76445a = new C6648y();

    /* renamed from: b */
    public static final AbstractC20303hy2 f76446b = m23742c();

    /* renamed from: a */
    public static AbstractC20303hy2 m23744a() {
        return f76445a;
    }

    /* renamed from: b */
    public static AbstractC20303hy2 m23743b() {
        AbstractC20303hy2 abstractC20303hy2 = f76446b;
        if (abstractC20303hy2 != null) {
            return abstractC20303hy2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    public static AbstractC20303hy2 m23742c() {
        try {
            return (AbstractC20303hy2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
