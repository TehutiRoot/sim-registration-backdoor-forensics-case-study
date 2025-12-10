package p000;

/* renamed from: of2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21511of2 {

    /* renamed from: a */
    public final Object f72841a;

    /* renamed from: b */
    public final Object f72842b;

    /* renamed from: c */
    public final Object f72843c;

    public C21511of2(Object obj, Object obj2, Object obj3) {
        this.f72841a = obj;
        this.f72842b = obj2;
        this.f72843c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m26090a() {
        Object obj = this.f72843c;
        Object obj2 = this.f72842b;
        Object obj3 = this.f72841a;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}