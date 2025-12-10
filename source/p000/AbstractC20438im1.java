package p000;

import androidx.core.util.Predicate;
import java.util.Objects;

/* renamed from: im1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC20438im1 {
    /* renamed from: a */
    public static Predicate m30576a(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: gm1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return AbstractC20438im1.m30576a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC20438im1.m30575b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo62or(Predicate predicate3) {
                return AbstractC20438im1.m30574c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC20438im1.m30573d(Predicate.this, predicate2, obj);
            }
        };
    }

    /* renamed from: b */
    public static Predicate m30575b(final Predicate predicate) {
        return new Predicate() { // from class: hm1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return AbstractC20438im1.m30576a(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC20438im1.m30575b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo62or(Predicate predicate2) {
                return AbstractC20438im1.m30574c(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC20438im1.m30572e(Predicate.this, obj);
            }
        };
    }

    /* renamed from: c */
    public static Predicate m30574c(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: dm1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return AbstractC20438im1.m30576a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC20438im1.m30575b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo62or(Predicate predicate3) {
                return AbstractC20438im1.m30574c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC20438im1.m30571f(Predicate.this, predicate2, obj);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m30573d(Predicate predicate, Predicate predicate2, Object obj) {
        if (predicate.test(obj) && predicate2.test(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m30572e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m30571f(Predicate predicate, Predicate predicate2, Object obj) {
        if (!predicate.test(obj) && !predicate2.test(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static Predicate m30570g(final Object obj) {
        if (obj == null) {
            return new Predicate() { // from class: em1
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
                public final boolean test(Object obj2) {
                    return AbstractC20438im1.m30569h(obj2);
                }
            };
        }
        return new Predicate() { // from class: fm1
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
            public final boolean test(Object obj2) {
                return AbstractC20438im1.m30568i(obj, obj2);
            }
        };
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m30569h(Object obj) {
        return AbstractC19406cm1.m51304a(obj);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m30568i(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: j */
    public static Predicate m30567j(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
