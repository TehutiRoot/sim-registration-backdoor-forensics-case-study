package p000;

/* renamed from: EA2 */
/* loaded from: classes3.dex */
public final class EA2 {

    /* renamed from: a */
    public final Object f1227a;

    /* renamed from: b */
    public final int f1228b;

    public EA2(Object obj, int i) {
        this.f1227a = obj;
        this.f1228b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EA2)) {
            return false;
        }
        EA2 ea2 = (EA2) obj;
        if (this.f1227a != ea2.f1227a || this.f1228b != ea2.f1228b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f1227a) * 65535) + this.f1228b;
    }
}
