package p000;

/* renamed from: re2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21963re2 {

    /* renamed from: a */
    public final Object f77340a;

    /* renamed from: b */
    public final Object f77341b;

    /* renamed from: c */
    public final Object f77342c;

    public C21963re2(Object obj, Object obj2, Object obj3) {
        this.f77340a = obj;
        this.f77341b = obj2;
        this.f77342c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m23302a() {
        Object obj = this.f77342c;
        Object obj2 = this.f77341b;
        Object obj3 = this.f77340a;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
