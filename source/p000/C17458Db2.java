package p000;

/* renamed from: Db2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17458Db2 {

    /* renamed from: a */
    public final Object f1052a;

    /* renamed from: b */
    public final Object f1053b;

    /* renamed from: c */
    public final Object f1054c;

    public C17458Db2(Object obj, Object obj2, Object obj3) {
        this.f1052a = obj;
        this.f1053b = obj2;
        this.f1054c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m68598a() {
        Object obj = this.f1054c;
        Object obj2 = this.f1053b;
        Object obj3 = this.f1052a;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
