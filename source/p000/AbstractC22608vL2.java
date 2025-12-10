package p000;

/* renamed from: vL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22608vL2 {

    /* renamed from: a */
    public static final InterfaceC22264tL2 f107660a = m1046c();

    /* renamed from: b */
    public static final InterfaceC22264tL2 f107661b = new C22092sL2();

    /* renamed from: a */
    public static InterfaceC22264tL2 m1048a() {
        return f107660a;
    }

    /* renamed from: b */
    public static InterfaceC22264tL2 m1047b() {
        return f107661b;
    }

    /* renamed from: c */
    public static InterfaceC22264tL2 m1046c() {
        try {
            return (InterfaceC22264tL2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
