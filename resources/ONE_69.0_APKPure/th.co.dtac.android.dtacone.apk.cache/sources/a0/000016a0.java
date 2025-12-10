package p000;

/* renamed from: Xj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18808Xj2 {

    /* renamed from: a */
    public final Object f7640a;

    /* renamed from: b */
    public final int f7641b;

    public C18808Xj2(Object obj, int i) {
        this.f7640a = obj;
        this.f7641b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18808Xj2)) {
            return false;
        }
        C18808Xj2 c18808Xj2 = (C18808Xj2) obj;
        if (this.f7640a != c18808Xj2.f7640a || this.f7641b != c18808Xj2.f7641b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7640a) * 65535) + this.f7641b;
    }
}