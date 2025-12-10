package p000;

/* renamed from: Ac2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17292Ac2 {

    /* renamed from: a */
    public final Object f163a;

    /* renamed from: b */
    public final Object f164b;

    /* renamed from: c */
    public final Object f165c;

    public C17292Ac2(Object obj, Object obj2, Object obj3) {
        this.f163a = obj;
        this.f164b = obj2;
        this.f165c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m69213a() {
        Object obj = this.f165c;
        Object obj2 = this.f164b;
        Object obj3 = this.f163a;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}