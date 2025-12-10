package p000;

import androidx.core.util.Predicate;

/* renamed from: tf0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C22308tf0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f80178a;

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return AbstractC20438im1.m30576a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate negate() {
        return AbstractC20438im1.m30575b(this);
    }

    @Override // androidx.core.util.Predicate
    /* renamed from: or */
    public /* synthetic */ Predicate mo62or(Predicate predicate) {
        return AbstractC20438im1.m30574c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        return this.f80178a.equals((String) obj);
    }
}
