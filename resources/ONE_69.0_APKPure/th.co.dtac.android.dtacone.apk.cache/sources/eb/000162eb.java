package p000;

/* renamed from: zD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23343zD2 {

    /* renamed from: a */
    public static final InterfaceC21959rD2 f109289a = m170c();

    /* renamed from: b */
    public static final InterfaceC21959rD2 f109290b = new C21267nD2();

    /* renamed from: a */
    public static InterfaceC21959rD2 m172a() {
        return f109289a;
    }

    /* renamed from: b */
    public static InterfaceC21959rD2 m171b() {
        return f109290b;
    }

    /* renamed from: c */
    public static InterfaceC21959rD2 m170c() {
        try {
            return (InterfaceC21959rD2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}