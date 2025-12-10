package p000;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOBiConsumer;
import org.apache.commons.p028io.function.IOBiFunction;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOPredicate;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOTriConsumer;

/* renamed from: lx */
/* loaded from: classes6.dex */
public abstract class AbstractC12253lx {

    /* renamed from: a */
    public static final IOBiConsumer f71778a = new IOBiConsumer() { // from class: dx
        @Override // org.apache.commons.p028io.function.IOBiConsumer
        public final void accept(Object obj, Object obj2) {
            AbstractC12253lx.m26400h(obj, obj2);
        }

        @Override // org.apache.commons.p028io.function.IOBiConsumer
        public /* synthetic */ IOBiConsumer andThen(IOBiConsumer iOBiConsumer) {
            return AbstractC23086y90.m331a(this, iOBiConsumer);
        }

        @Override // org.apache.commons.p028io.function.IOBiConsumer
        public /* synthetic */ BiConsumer asBiConsumer() {
            return AbstractC23086y90.m330b(this);
        }
    };

    /* renamed from: b */
    public static final IORunnable f71779b = new IORunnable() { // from class: ex
        @Override // org.apache.commons.p028io.function.IORunnable
        public /* synthetic */ Runnable asRunnable() {
            return AbstractC22981xa0.m424a(this);
        }

        @Override // org.apache.commons.p028io.function.IORunnable
        public final void run() {
            AbstractC12253lx.m26399i();
        }
    };

    /* renamed from: c */
    public static final IOBiFunction f71780c = new IOBiFunction() { // from class: fx
        @Override // org.apache.commons.p028io.function.IOBiFunction
        public /* synthetic */ IOBiFunction andThen(IOFunction iOFunction) {
            return B90.m68991a(this, iOFunction);
        }

        @Override // org.apache.commons.p028io.function.IOBiFunction
        public final Object apply(Object obj, Object obj2) {
            Object m26398j;
            m26398j = AbstractC12253lx.m26398j(obj, obj2);
            return m26398j;
        }

        @Override // org.apache.commons.p028io.function.IOBiFunction
        public /* synthetic */ BiFunction asBiFunction() {
            return B90.m68990b(this);
        }
    };

    /* renamed from: d */
    public static final IOFunction f71781d = new IOFunction() { // from class: gx
        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOConsumer andThen(Consumer consumer) {
            return AbstractC19197ba0.m51989a(this, consumer);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public final Object apply(Object obj) {
            Object m26397k;
            m26397k = AbstractC12253lx.m26397k(obj);
            return m26397k;
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ Function asFunction() {
            return AbstractC19197ba0.m51985e(this);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction compose(Function function) {
            return AbstractC19197ba0.m51984f(this, function);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
            return AbstractC19197ba0.m51988b(this, iOConsumer);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
            return AbstractC19197ba0.m51983g(this, iOFunction);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction andThen(Function function) {
            return AbstractC19197ba0.m51987c(this, function);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOSupplier compose(Supplier supplier) {
            return AbstractC19197ba0.m51982h(this, supplier);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
            return AbstractC19197ba0.m51986d(this, iOFunction);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
            return AbstractC19197ba0.m51981i(this, iOSupplier);
        }
    };

    /* renamed from: e */
    public static final IOPredicate f71782e = new IOPredicate() { // from class: hx
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
        public final boolean test(Object obj) {
            boolean m26396l;
            m26396l = AbstractC12253lx.m26396l(obj);
            return m26396l;
        }
    };

    /* renamed from: f */
    public static final IOPredicate f71783f = new IOPredicate() { // from class: ix
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
        public final boolean test(Object obj) {
            boolean m26395m;
            m26395m = AbstractC12253lx.m26395m(obj);
            return m26395m;
        }
    };

    /* renamed from: g */
    public static final IOTriConsumer f71784g = new IOTriConsumer() { // from class: jx
        @Override // org.apache.commons.p028io.function.IOTriConsumer
        public final void accept(Object obj, Object obj2, Object obj3) {
            AbstractC12253lx.m26394n(obj, obj2, obj3);
        }

        @Override // org.apache.commons.p028io.function.IOTriConsumer
        public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
            return AbstractC17840Jb0.m67741a(this, iOTriConsumer);
        }
    };

    /* renamed from: j */
    public static /* synthetic */ Object m26398j(Object obj, Object obj2) {
        return null;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m26396l(Object obj) {
        return false;
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m26395m(Object obj) {
        return true;
    }

    /* renamed from: i */
    public static /* synthetic */ void m26399i() {
    }

    /* renamed from: k */
    public static /* synthetic */ Object m26397k(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public static /* synthetic */ void m26400h(Object obj, Object obj2) {
    }

    /* renamed from: n */
    public static /* synthetic */ void m26394n(Object obj, Object obj2, Object obj3) {
    }
}
