package p000;

/* renamed from: AE2 */
/* loaded from: classes3.dex */
public abstract class AE2 {

    /* renamed from: a */
    public static final C22759wE2 f60a;

    /* renamed from: b */
    public static final C22759wE2 f61b;

    static {
        C22759wE2 c22759wE2 = null;
        try {
            c22759wE2 = (C22759wE2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f60a = c22759wE2;
        f61b = new C22759wE2();
    }

    /* renamed from: a */
    public static C22759wE2 m69131a() {
        return f60a;
    }

    /* renamed from: b */
    public static C22759wE2 m69130b() {
        return f61b;
    }
}
