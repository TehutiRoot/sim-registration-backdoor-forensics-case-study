package p000;

/* renamed from: Si2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18439Si2 {

    /* renamed from: a */
    public static final InterfaceC17671Gi2 f5680a = m66299c();

    /* renamed from: b */
    public static final InterfaceC17671Gi2 f5681b = new C18119Ni2();

    /* renamed from: a */
    public static InterfaceC17671Gi2 m66301a() {
        return f5680a;
    }

    /* renamed from: b */
    public static InterfaceC17671Gi2 m66300b() {
        return f5681b;
    }

    /* renamed from: c */
    public static InterfaceC17671Gi2 m66299c() {
        try {
            return (InterfaceC17671Gi2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
