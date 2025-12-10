package p000;

import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.p028io.function.IOPredicate;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ta0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22293ta0 {
    /* renamed from: a */
    public static IOPredicate m22406a(final IOPredicate iOPredicate, final IOPredicate iOPredicate2) {
        Objects.requireNonNull(iOPredicate2);
        return new IOPredicate() { // from class: ra0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate3) {
                return AbstractC22293ta0.m22406a(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC22293ta0.m22405b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC22293ta0.m22404c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo23321or(IOPredicate iOPredicate3) {
                return AbstractC22293ta0.m22403d(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj) {
                return AbstractC22293ta0.m22402e(iOPredicate, iOPredicate2, obj);
            }
        };
    }

    /* renamed from: b */
    public static Predicate m22405b(final IOPredicate iOPredicate) {
        return new Predicate() { // from class: sa0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC22293ta0.m22401f(iOPredicate, obj);
            }
        };
    }

    /* renamed from: c */
    public static IOPredicate m22404c(final IOPredicate iOPredicate) {
        return new IOPredicate() { // from class: na0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate2) {
                return AbstractC22293ta0.m22406a(this, iOPredicate2);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC22293ta0.m22405b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC22293ta0.m22404c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo23321or(IOPredicate iOPredicate2) {
                return AbstractC22293ta0.m22403d(this, iOPredicate2);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj) {
                return AbstractC22293ta0.m22400g(iOPredicate, obj);
            }
        };
    }

    /* renamed from: d */
    public static IOPredicate m22403d(final IOPredicate iOPredicate, final IOPredicate iOPredicate2) {
        Objects.requireNonNull(iOPredicate2);
        return new IOPredicate() { // from class: qa0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate3) {
                return AbstractC22293ta0.m22406a(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC22293ta0.m22405b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC22293ta0.m22404c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo23321or(IOPredicate iOPredicate3) {
                return AbstractC22293ta0.m22403d(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj) {
                return AbstractC22293ta0.m22399h(iOPredicate, iOPredicate2, obj);
            }
        };
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m22402e(IOPredicate iOPredicate, IOPredicate iOPredicate2, Object obj) {
        if (iOPredicate.test(obj) && iOPredicate2.test(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m22401f(IOPredicate iOPredicate, Object obj) {
        return Uncheck.test(iOPredicate, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m22400g(IOPredicate iOPredicate, Object obj) {
        return !iOPredicate.test(obj);
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m22399h(IOPredicate iOPredicate, IOPredicate iOPredicate2, Object obj) {
        if (!iOPredicate.test(obj) && !iOPredicate2.test(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static IOPredicate m22398i() {
        return AbstractC12253lx.f71782e;
    }

    /* renamed from: j */
    public static IOPredicate m22397j() {
        return AbstractC12253lx.f71783f;
    }

    /* renamed from: k */
    public static IOPredicate m22396k(final Object obj) {
        if (obj == null) {
            return new IOPredicate() { // from class: oa0
                @Override // org.apache.commons.p028io.function.IOPredicate
                public /* synthetic */ IOPredicate and(IOPredicate iOPredicate) {
                    return AbstractC22293ta0.m22406a(this, iOPredicate);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                public /* synthetic */ Predicate asPredicate() {
                    return AbstractC22293ta0.m22405b(this);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                public /* synthetic */ IOPredicate negate() {
                    return AbstractC22293ta0.m22404c(this);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                /* renamed from: or */
                public /* synthetic */ IOPredicate mo23321or(IOPredicate iOPredicate) {
                    return AbstractC22293ta0.m22403d(this, iOPredicate);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                public final boolean test(Object obj2) {
                    return AbstractC19406cm1.m51304a(obj2);
                }
            };
        }
        return new IOPredicate() { // from class: pa0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate) {
                return AbstractC22293ta0.m22406a(this, iOPredicate);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC22293ta0.m22405b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC22293ta0.m22404c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo23321or(IOPredicate iOPredicate) {
                return AbstractC22293ta0.m22403d(this, iOPredicate);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj2) {
                return AbstractC22293ta0.m22395l(obj, obj2);
            }
        };
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m22395l(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
