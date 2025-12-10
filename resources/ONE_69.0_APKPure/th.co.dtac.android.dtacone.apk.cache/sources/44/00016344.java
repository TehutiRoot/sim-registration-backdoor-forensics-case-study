package p000;

import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.p028io.function.IOPredicate;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: za0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC23397za0 {
    /* renamed from: a */
    public static IOPredicate m102a(final IOPredicate iOPredicate, final IOPredicate iOPredicate2) {
        Objects.requireNonNull(iOPredicate2);
        return new IOPredicate() { // from class: xa0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate3) {
                return AbstractC23397za0.m102a(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC23397za0.m101b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC23397za0.m100c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo501or(IOPredicate iOPredicate3) {
                return AbstractC23397za0.m99d(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj) {
                return AbstractC23397za0.m98e(iOPredicate, iOPredicate2, obj);
            }
        };
    }

    /* renamed from: b */
    public static Predicate m101b(final IOPredicate iOPredicate) {
        return new Predicate() { // from class: ya0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean test;
                test = Uncheck.test(iOPredicate, obj);
                return test;
            }
        };
    }

    /* renamed from: c */
    public static IOPredicate m100c(final IOPredicate iOPredicate) {
        return new IOPredicate() { // from class: ta0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate2) {
                return AbstractC23397za0.m102a(this, iOPredicate2);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC23397za0.m101b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC23397za0.m100c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo501or(IOPredicate iOPredicate2) {
                return AbstractC23397za0.m99d(this, iOPredicate2);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj) {
                return AbstractC23397za0.m96g(iOPredicate, obj);
            }
        };
    }

    /* renamed from: d */
    public static IOPredicate m99d(final IOPredicate iOPredicate, final IOPredicate iOPredicate2) {
        Objects.requireNonNull(iOPredicate2);
        return new IOPredicate() { // from class: wa0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate3) {
                return AbstractC23397za0.m102a(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC23397za0.m101b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC23397za0.m100c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo501or(IOPredicate iOPredicate3) {
                return AbstractC23397za0.m99d(this, iOPredicate3);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj) {
                return AbstractC23397za0.m95h(iOPredicate, iOPredicate2, obj);
            }
        };
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m98e(IOPredicate iOPredicate, IOPredicate iOPredicate2, Object obj) {
        if (iOPredicate.test(obj) && iOPredicate2.test(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m96g(IOPredicate iOPredicate, Object obj) {
        return !iOPredicate.test(obj);
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m95h(IOPredicate iOPredicate, IOPredicate iOPredicate2, Object obj) {
        if (!iOPredicate.test(obj) && !iOPredicate2.test(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static IOPredicate m94i() {
        return AbstractC12237lx.f71862e;
    }

    /* renamed from: j */
    public static IOPredicate m93j() {
        return AbstractC12237lx.f71863f;
    }

    /* renamed from: k */
    public static IOPredicate m92k(final Object obj) {
        if (obj == null) {
            return new IOPredicate() { // from class: ua0
                @Override // org.apache.commons.p028io.function.IOPredicate
                public /* synthetic */ IOPredicate and(IOPredicate iOPredicate) {
                    return AbstractC23397za0.m102a(this, iOPredicate);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                public /* synthetic */ Predicate asPredicate() {
                    return AbstractC23397za0.m101b(this);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                public /* synthetic */ IOPredicate negate() {
                    return AbstractC23397za0.m100c(this);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                /* renamed from: or */
                public /* synthetic */ IOPredicate mo501or(IOPredicate iOPredicate) {
                    return AbstractC23397za0.m99d(this, iOPredicate);
                }

                @Override // org.apache.commons.p028io.function.IOPredicate
                public final boolean test(Object obj2) {
                    return AbstractC18945Zm1.m65200a(obj2);
                }
            };
        }
        return new IOPredicate() { // from class: va0
            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate and(IOPredicate iOPredicate) {
                return AbstractC23397za0.m102a(this, iOPredicate);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ Predicate asPredicate() {
                return AbstractC23397za0.m101b(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public /* synthetic */ IOPredicate negate() {
                return AbstractC23397za0.m100c(this);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            /* renamed from: or */
            public /* synthetic */ IOPredicate mo501or(IOPredicate iOPredicate) {
                return AbstractC23397za0.m99d(this, iOPredicate);
            }

            @Override // org.apache.commons.p028io.function.IOPredicate
            public final boolean test(Object obj2) {
                boolean equals;
                equals = obj.equals(obj2);
                return equals;
            }
        };
    }
}