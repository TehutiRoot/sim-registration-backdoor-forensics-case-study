package p000;

/* renamed from: cG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19373cG2 {

    /* renamed from: a */
    public static final C19200bG2 f39383a;

    /* renamed from: b */
    public static final C19200bG2 f39384b;

    static {
        C19200bG2 c19200bG2 = null;
        try {
            c19200bG2 = (C19200bG2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39383a = c19200bG2;
        f39384b = new C19200bG2();
    }

    /* renamed from: a */
    public static C19200bG2 m51715a() {
        return f39383a;
    }

    /* renamed from: b */
    public static C19200bG2 m51714b() {
        return f39384b;
    }
}