package p000;

/* renamed from: FD */
/* loaded from: classes2.dex */
public final class C0368FD extends OM1 {

    /* renamed from: a */
    public final Object f1614a;

    /* renamed from: b */
    public final int f1615b;

    public C0368FD(Object obj, int i) {
        super(null);
        this.f1614a = obj;
        this.f1615b = i;
    }

    /* renamed from: a */
    public final void m68502a() {
        int i;
        Object obj = this.f1614a;
        boolean z = false;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (i == this.f1615b) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }

    /* renamed from: b */
    public final Object m68501b() {
        return this.f1614a;
    }
}