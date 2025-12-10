package p000;

/* renamed from: Pj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18288Pj2 {

    /* renamed from: a */
    public static final InterfaceC17508Dj2 f4869a = m66931c();

    /* renamed from: b */
    public static final InterfaceC17508Dj2 f4870b = new C17963Kj2();

    /* renamed from: a */
    public static InterfaceC17508Dj2 m66933a() {
        return f4869a;
    }

    /* renamed from: b */
    public static InterfaceC17508Dj2 m66932b() {
        return f4870b;
    }

    /* renamed from: c */
    public static InterfaceC17508Dj2 m66931c() {
        try {
            return (InterfaceC17508Dj2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}