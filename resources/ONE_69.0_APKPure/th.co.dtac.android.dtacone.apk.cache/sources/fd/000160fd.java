package p000;

/* renamed from: xF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23003xF2 {

    /* renamed from: a */
    public static final C22311tF2 f108703a;

    /* renamed from: b */
    public static final C22311tF2 f108704b;

    static {
        C22311tF2 c22311tF2 = null;
        try {
            c22311tF2 = (C22311tF2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f108703a = c22311tF2;
        f108704b = new C22311tF2();
    }

    /* renamed from: a */
    public static C22311tF2 m589a() {
        return f108703a;
    }

    /* renamed from: b */
    public static C22311tF2 m588b() {
        return f108704b;
    }
}