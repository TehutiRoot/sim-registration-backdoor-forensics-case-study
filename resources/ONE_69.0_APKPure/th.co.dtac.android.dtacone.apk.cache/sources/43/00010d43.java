package p000;

/* renamed from: sM2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22159sM2 {

    /* renamed from: a */
    public static final InterfaceC21813qM2 f79875a = m22818c();

    /* renamed from: b */
    public static final InterfaceC21813qM2 f79876b = new C21640pM2();

    /* renamed from: a */
    public static InterfaceC21813qM2 m22820a() {
        return f79875a;
    }

    /* renamed from: b */
    public static InterfaceC21813qM2 m22819b() {
        return f79876b;
    }

    /* renamed from: c */
    public static InterfaceC21813qM2 m22818c() {
        try {
            return (InterfaceC21813qM2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}