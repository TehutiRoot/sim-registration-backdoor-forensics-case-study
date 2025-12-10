package p000;

/* renamed from: oH0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21450oH0 {

    /* renamed from: a */
    public static final InterfaceC20931lH0 f72733a = m26140c();

    /* renamed from: b */
    public static final InterfaceC20931lH0 f72734b = new C21277nH0();

    /* renamed from: a */
    public static InterfaceC20931lH0 m26142a() {
        return f72733a;
    }

    /* renamed from: b */
    public static InterfaceC20931lH0 m26141b() {
        return f72734b;
    }

    /* renamed from: c */
    public static InterfaceC20931lH0 m26140c() {
        try {
            return (InterfaceC20931lH0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}