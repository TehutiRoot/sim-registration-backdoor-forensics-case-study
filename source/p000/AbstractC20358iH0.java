package p000;

/* renamed from: iH0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20358iH0 {

    /* renamed from: a */
    public static final InterfaceC19842fH0 f62761a = m30654c();

    /* renamed from: b */
    public static final InterfaceC19842fH0 f62762b = new C20186hH0();

    /* renamed from: a */
    public static InterfaceC19842fH0 m30656a() {
        return f62761a;
    }

    /* renamed from: b */
    public static InterfaceC19842fH0 m30655b() {
        return f62762b;
    }

    /* renamed from: c */
    public static InterfaceC19842fH0 m30654c() {
        try {
            return (InterfaceC19842fH0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
