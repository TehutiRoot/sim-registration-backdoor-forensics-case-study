package io.reactivex.internal.functions;

import io.reactivex.Notification;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class Functions {

    /* renamed from: a */
    public static final Function f63824a = new C10782v();
    public static final Runnable EMPTY_RUNNABLE = new RunnableC10777q();
    public static final Action EMPTY_ACTION = new C10774n();

    /* renamed from: b */
    public static final Consumer f63825b = new C10775o();
    public static final Consumer<Throwable> ERROR_CONSUMER = new C10779s();
    public static final Consumer<Throwable> ON_ERROR_MISSING = new C10755E();
    public static final LongConsumer EMPTY_LONG_CONSUMER = new C10776p();

    /* renamed from: c */
    public static final Predicate f63826c = new C10760J();

    /* renamed from: d */
    public static final Predicate f63827d = new C10780t();

    /* renamed from: e */
    public static final Callable f63828e = new CallableC10754D();

    /* renamed from: f */
    public static final Comparator f63829f = new C10786z();
    public static final Consumer<Subscription> REQUEST_MAX = new C10785y();

    /* renamed from: io.reactivex.internal.functions.Functions$A */
    /* loaded from: classes5.dex */
    public static final class C10751A implements Action {

        /* renamed from: a */
        public final Consumer f63830a;

        public C10751A(Consumer consumer) {
            this.f63830a = consumer;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.f63830a.accept(Notification.createOnComplete());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$B */
    /* loaded from: classes5.dex */
    public static final class C10752B implements Consumer {

        /* renamed from: a */
        public final Consumer f63831a;

        public C10752B(Consumer consumer) {
            this.f63831a = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            this.f63831a.accept(Notification.createOnError(th2));
        }
    }

    /* loaded from: classes5.dex */
    public static class BoundedConsumer implements Consumer<Subscription> {

        /* renamed from: a */
        public final int f63832a;

        public BoundedConsumer(int i) {
            this.f63832a = i;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(this.f63832a);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$C */
    /* loaded from: classes5.dex */
    public static final class C10753C implements Consumer {

        /* renamed from: a */
        public final Consumer f63833a;

        public C10753C(Consumer consumer) {
            this.f63833a = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f63833a.accept(Notification.createOnNext(obj));
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$D */
    /* loaded from: classes5.dex */
    public static final class CallableC10754D implements Callable {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$E */
    /* loaded from: classes5.dex */
    public static final class C10755E implements Consumer {
        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            RxJavaPlugins.onError(new OnErrorNotImplementedException(th2));
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$F */
    /* loaded from: classes5.dex */
    public static final class C10756F implements Function {

        /* renamed from: a */
        public final TimeUnit f63834a;

        /* renamed from: b */
        public final Scheduler f63835b;

        public C10756F(TimeUnit timeUnit, Scheduler scheduler) {
            this.f63834a = timeUnit;
            this.f63835b = scheduler;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Timed apply(Object obj) {
            return new Timed(obj, this.f63835b.now(this.f63834a), this.f63834a);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$G */
    /* loaded from: classes5.dex */
    public static final class C10757G implements BiConsumer {

        /* renamed from: a */
        public final Function f63836a;

        public C10757G(Function function) {
            this.f63836a = function;
        }

        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void accept(Map map, Object obj) {
            map.put(this.f63836a.apply(obj), obj);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$H */
    /* loaded from: classes5.dex */
    public static final class C10758H implements BiConsumer {

        /* renamed from: a */
        public final Function f63837a;

        /* renamed from: b */
        public final Function f63838b;

        public C10758H(Function function, Function function2) {
            this.f63837a = function;
            this.f63838b = function2;
        }

        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void accept(Map map, Object obj) {
            map.put(this.f63838b.apply(obj), this.f63837a.apply(obj));
        }
    }

    /* loaded from: classes5.dex */
    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$I */
    /* loaded from: classes5.dex */
    public static final class C10759I implements BiConsumer {

        /* renamed from: a */
        public final Function f63839a;

        /* renamed from: b */
        public final Function f63840b;

        /* renamed from: c */
        public final Function f63841c;

        public C10759I(Function function, Function function2, Function function3) {
            this.f63839a = function;
            this.f63840b = function2;
            this.f63841c = function3;
        }

        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void accept(Map map, Object obj) {
            Object apply = this.f63841c.apply(obj);
            Collection collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = (Collection) this.f63839a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f63840b.apply(obj));
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$J */
    /* loaded from: classes5.dex */
    public static final class C10760J implements Predicate {
        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$a */
    /* loaded from: classes5.dex */
    public static final class C10761a implements Consumer {

        /* renamed from: a */
        public final Action f63842a;

        public C10761a(Action action) {
            this.f63842a = action;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f63842a.run();
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$b */
    /* loaded from: classes5.dex */
    public static final class C10762b implements Function {

        /* renamed from: a */
        public final BiFunction f63843a;

        public C10762b(BiFunction biFunction) {
            this.f63843a = biFunction;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f63843a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$c */
    /* loaded from: classes5.dex */
    public static final class C10763c implements Function {

        /* renamed from: a */
        public final Function3 f63844a;

        public C10763c(Function3 function3) {
            this.f63844a = function3;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.f63844a.apply(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$d */
    /* loaded from: classes5.dex */
    public static final class C10764d implements Function {

        /* renamed from: a */
        public final Function4 f63845a;

        public C10764d(Function4 function4) {
            this.f63845a = function4;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 4) {
                return this.f63845a.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$e */
    /* loaded from: classes5.dex */
    public static final class C10765e implements Function {

        /* renamed from: a */
        public final Function5 f63846a;

        public C10765e(Function5 function5) {
            this.f63846a = function5;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 5) {
                return this.f63846a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$f */
    /* loaded from: classes5.dex */
    public static final class C10766f implements Function {

        /* renamed from: a */
        public final Function6 f63847a;

        public C10766f(Function6 function6) {
            this.f63847a = function6;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 6) {
                return this.f63847a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$g */
    /* loaded from: classes5.dex */
    public static final class C10767g implements Function {

        /* renamed from: a */
        public final Function7 f63848a;

        public C10767g(Function7 function7) {
            this.f63848a = function7;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 7) {
                return this.f63848a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$h */
    /* loaded from: classes5.dex */
    public static final class C10768h implements Function {

        /* renamed from: a */
        public final Function8 f63849a;

        public C10768h(Function8 function8) {
            this.f63849a = function8;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 8) {
                return this.f63849a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$i */
    /* loaded from: classes5.dex */
    public static final class C10769i implements Function {

        /* renamed from: a */
        public final Function9 f63850a;

        public C10769i(Function9 function9) {
            this.f63850a = function9;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Object apply(Object[] objArr) {
            if (objArr.length == 9) {
                return this.f63850a.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$j */
    /* loaded from: classes5.dex */
    public static final class CallableC10770j implements Callable {

        /* renamed from: a */
        public final int f63851a;

        public CallableC10770j(int i) {
            this.f63851a = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            return new ArrayList(this.f63851a);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$k */
    /* loaded from: classes5.dex */
    public static final class C10771k implements Predicate {

        /* renamed from: a */
        public final BooleanSupplier f63852a;

        public C10771k(BooleanSupplier booleanSupplier) {
            this.f63852a = booleanSupplier;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return !this.f63852a.getAsBoolean();
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$l */
    /* loaded from: classes5.dex */
    public static final class C10772l implements Function {

        /* renamed from: a */
        public final Class f63853a;

        public C10772l(Class cls) {
            this.f63853a = cls;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return this.f63853a.cast(obj);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$m */
    /* loaded from: classes5.dex */
    public static final class C10773m implements Predicate {

        /* renamed from: a */
        public final Class f63854a;

        public C10773m(Class cls) {
            this.f63854a = cls;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return this.f63854a.isInstance(obj);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$n */
    /* loaded from: classes5.dex */
    public static final class C10774n implements Action {
        @Override // io.reactivex.functions.Action
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$o */
    /* loaded from: classes5.dex */
    public static final class C10775o implements Consumer {
        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$p */
    /* loaded from: classes5.dex */
    public static final class C10776p implements LongConsumer {
        @Override // io.reactivex.functions.LongConsumer
        public void accept(long j) {
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$q */
    /* loaded from: classes5.dex */
    public static final class RunnableC10777q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$r */
    /* loaded from: classes5.dex */
    public static final class C10778r implements Predicate {

        /* renamed from: a */
        public final Object f63855a;

        public C10778r(Object obj) {
            this.f63855a = obj;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return ObjectHelper.equals(obj, this.f63855a);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$s */
    /* loaded from: classes5.dex */
    public static final class C10779s implements Consumer {
        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$t */
    /* loaded from: classes5.dex */
    public static final class C10780t implements Predicate {
        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$u */
    /* loaded from: classes5.dex */
    public static final class C10781u implements Action {

        /* renamed from: a */
        public final Future f63856a;

        public C10781u(Future future) {
            this.f63856a = future;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.f63856a.get();
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$v */
    /* loaded from: classes5.dex */
    public static final class C10782v implements Function {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$w */
    /* loaded from: classes5.dex */
    public static final class CallableC10783w implements Callable, Function {

        /* renamed from: a */
        public final Object f63857a;

        public CallableC10783w(Object obj) {
            this.f63857a = obj;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return this.f63857a;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return this.f63857a;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$x */
    /* loaded from: classes5.dex */
    public static final class C10784x implements Function {

        /* renamed from: a */
        public final Comparator f63858a;

        public C10784x(Comparator comparator) {
            this.f63858a = comparator;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public List apply(List list) {
            Collections.sort(list, this.f63858a);
            return list;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$y */
    /* loaded from: classes5.dex */
    public static final class C10785y implements Consumer {
        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$z */
    /* loaded from: classes5.dex */
    public static final class C10786z implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static <T> Consumer<T> actionConsumer(Action action) {
        return new C10761a(action);
    }

    public static <T> Predicate<T> alwaysFalse() {
        return f63827d;
    }

    public static <T> Predicate<T> alwaysTrue() {
        return f63826c;
    }

    public static <T> Consumer<T> boundedConsumer(int i) {
        return new BoundedConsumer(i);
    }

    public static <T, U> Function<T, U> castFunction(Class<U> cls) {
        return new C10772l(cls);
    }

    public static <T> Callable<List<T>> createArrayList(int i) {
        return new CallableC10770j(i);
    }

    public static <T> Callable<Set<T>> createHashSet() {
        return HashSetCallable.INSTANCE;
    }

    public static <T> Consumer<T> emptyConsumer() {
        return f63825b;
    }

    public static <T> Predicate<T> equalsWith(T t) {
        return new C10778r(t);
    }

    public static Action futureAction(Future<?> future) {
        return new C10781u(future);
    }

    public static <T> Function<T, T> identity() {
        return f63824a;
    }

    public static <T, U> Predicate<T> isInstanceOf(Class<U> cls) {
        return new C10773m(cls);
    }

    public static <T> Callable<T> justCallable(T t) {
        return new CallableC10783w(t);
    }

    public static <T, U> Function<T, U> justFunction(U u) {
        return new CallableC10783w(u);
    }

    public static <T> Function<List<T>, List<T>> listSorter(Comparator<? super T> comparator) {
        return new C10784x(comparator);
    }

    public static <T> Comparator<T> naturalComparator() {
        return NaturalComparator.INSTANCE;
    }

    public static <T> Comparator<T> naturalOrder() {
        return f63829f;
    }

    public static <T> Action notificationOnComplete(Consumer<? super Notification<T>> consumer) {
        return new C10751A(consumer);
    }

    public static <T> Consumer<Throwable> notificationOnError(Consumer<? super Notification<T>> consumer) {
        return new C10752B(consumer);
    }

    public static <T> Consumer<T> notificationOnNext(Consumer<? super Notification<T>> consumer) {
        return new C10753C(consumer);
    }

    public static <T> Callable<T> nullSupplier() {
        return f63828e;
    }

    public static <T> Predicate<T> predicateReverseFor(BooleanSupplier booleanSupplier) {
        return new C10771k(booleanSupplier);
    }

    public static <T> Function<T, Timed<T>> timestampWith(TimeUnit timeUnit, Scheduler scheduler) {
        return new C10756F(timeUnit, scheduler);
    }

    public static <T1, T2, R> Function<Object[], R> toFunction(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "f is null");
        return new C10762b(biFunction);
    }

    public static <T, K> BiConsumer<Map<K, T>, T> toMapKeySelector(Function<? super T, ? extends K> function) {
        return new C10757G(function);
    }

    public static <T, K, V> BiConsumer<Map<K, V>, T> toMapKeyValueSelector(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return new C10758H(function2, function);
    }

    public static <T, K, V> BiConsumer<Map<K, Collection<V>>, T> toMultimapKeyValueSelector(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Function<? super K, ? extends Collection<? super V>> function3) {
        return new C10759I(function3, function2, function);
    }

    public static <T1, T2, T3, R> Function<Object[], R> toFunction(Function3<T1, T2, T3, R> function3) {
        ObjectHelper.requireNonNull(function3, "f is null");
        return new C10763c(function3);
    }

    public static <T1, T2, T3, T4, R> Function<Object[], R> toFunction(Function4<T1, T2, T3, T4, R> function4) {
        ObjectHelper.requireNonNull(function4, "f is null");
        return new C10764d(function4);
    }

    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> toFunction(Function5<T1, T2, T3, T4, T5, R> function5) {
        ObjectHelper.requireNonNull(function5, "f is null");
        return new C10765e(function5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> toFunction(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        ObjectHelper.requireNonNull(function6, "f is null");
        return new C10766f(function6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Object[], R> toFunction(Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
        ObjectHelper.requireNonNull(function7, "f is null");
        return new C10767g(function7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> toFunction(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        ObjectHelper.requireNonNull(function8, "f is null");
        return new C10768h(function8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<Object[], R> toFunction(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
        ObjectHelper.requireNonNull(function9, "f is null");
        return new C10769i(function9);
    }
}
