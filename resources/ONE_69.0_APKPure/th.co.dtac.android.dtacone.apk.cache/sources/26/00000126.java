package p000;

/* renamed from: BB2 */
/* loaded from: classes3.dex */
public final class BB2 {

    /* renamed from: a */
    public final Object f338a;

    /* renamed from: b */
    public final int f339b;

    public BB2(Object obj, int i) {
        this.f338a = obj;
        this.f339b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BB2)) {
            return false;
        }
        BB2 bb2 = (BB2) obj;
        if (this.f338a != bb2.f338a || this.f339b != bb2.f339b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f338a) * 65535) + this.f339b;
    }
}