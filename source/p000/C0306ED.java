package p000;

/* renamed from: ED */
/* loaded from: classes2.dex */
public final class C0306ED extends RL1 {

    /* renamed from: a */
    public final Object f1235a;

    /* renamed from: b */
    public final int f1236b;

    public C0306ED(Object obj, int i) {
        super(null);
        this.f1235a = obj;
        this.f1236b = i;
    }

    /* renamed from: a */
    public final void m68525a() {
        int i;
        Object obj = this.f1235a;
        boolean z = false;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (i == this.f1236b) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }

    /* renamed from: b */
    public final Object m68524b() {
        return this.f1235a;
    }
}
