package p000;

/* renamed from: CC2 */
/* loaded from: classes3.dex */
public abstract class CC2 {

    /* renamed from: a */
    public static final InterfaceC22409uC2 f639a = m68816c();

    /* renamed from: b */
    public static final InterfaceC22409uC2 f640b = new C21721qC2();

    /* renamed from: a */
    public static InterfaceC22409uC2 m68818a() {
        return f639a;
    }

    /* renamed from: b */
    public static InterfaceC22409uC2 m68817b() {
        return f640b;
    }

    /* renamed from: c */
    public static InterfaceC22409uC2 m68816c() {
        try {
            return (InterfaceC22409uC2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
