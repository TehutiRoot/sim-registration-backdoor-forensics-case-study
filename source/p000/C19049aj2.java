package p000;

/* renamed from: aj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19049aj2 {

    /* renamed from: a */
    public final Object f8415a;

    /* renamed from: b */
    public final int f8416b;

    public C19049aj2(Object obj, int i) {
        this.f8415a = obj;
        this.f8416b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19049aj2)) {
            return false;
        }
        C19049aj2 c19049aj2 = (C19049aj2) obj;
        if (this.f8415a != c19049aj2.f8415a || this.f8416b != c19049aj2.f8416b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8415a) * 65535) + this.f8416b;
    }
}
