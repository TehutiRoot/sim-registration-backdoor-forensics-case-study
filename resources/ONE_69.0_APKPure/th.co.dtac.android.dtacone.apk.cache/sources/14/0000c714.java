package p000;

import androidx.core.util.Predicate;
import java.util.Objects;

/* renamed from: fn1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC19977fn1 {
    /* renamed from: a */
    public static Predicate m31478a(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: dn1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return AbstractC19977fn1.m31478a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC19977fn1.m31477b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo89or(Predicate predicate3) {
                return AbstractC19977fn1.m31476c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC19977fn1.m31475d(Predicate.this, predicate2, obj);
            }
        };
    }

    /* renamed from: b */
    public static Predicate m31477b(final Predicate predicate) {
        return new Predicate() { // from class: en1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return AbstractC19977fn1.m31478a(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC19977fn1.m31477b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo89or(Predicate predicate2) {
                return AbstractC19977fn1.m31476c(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC19977fn1.m31474e(Predicate.this, obj);
            }
        };
    }

    /* renamed from: c */
    public static Predicate m31476c(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: an1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return AbstractC19977fn1.m31478a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC19977fn1.m31477b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo89or(Predicate predicate3) {
                return AbstractC19977fn1.m31476c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC19977fn1.m31473f(Predicate.this, predicate2, obj);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m31475d(Predicate predicate, Predicate predicate2, Object obj) {
        if (predicate.test(obj) && predicate2.test(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m31474e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m31473f(Predicate predicate, Predicate predicate2, Object obj) {
        if (!predicate.test(obj) && !predicate2.test(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static Predicate m31472g(final Object obj) {
        if (obj == null) {
            return new Predicate() { // from class: bn1
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return AbstractC19977fn1.m31478a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return AbstractC19977fn1.m31477b(this);
                }

                @Override // androidx.core.util.Predicate
                /* renamed from: or */
                public /* synthetic */ Predicate mo89or(Predicate predicate) {
                    return AbstractC19977fn1.m31476c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj2) {
                    return AbstractC19977fn1.m31471h(obj2);
                }
            };
        }
        return new Predicate() { // from class: cn1
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return AbstractC19977fn1.m31478a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC19977fn1.m31477b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo89or(Predicate predicate) {
                return AbstractC19977fn1.m31476c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return AbstractC19977fn1.m31470i(obj, obj2);
            }
        };
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m31471h(Object obj) {
        return AbstractC18945Zm1.m65200a(obj);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m31470i(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: j */
    public static Predicate m31469j(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}