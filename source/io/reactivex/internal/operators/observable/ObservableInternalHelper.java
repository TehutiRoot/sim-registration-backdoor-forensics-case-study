package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ObservableInternalHelper {

    /* loaded from: classes5.dex */
    public enum MapToInt implements Function<Object, Object> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$a */
    /* loaded from: classes5.dex */
    public static final class CallableC11013a implements Callable {

        /* renamed from: a */
        public final Observable f65325a;

        /* renamed from: b */
        public final int f65326b;

        public CallableC11013a(Observable observable, int i) {
            this.f65325a = observable;
            this.f65326b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65325a.replay(this.f65326b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$b */
    /* loaded from: classes5.dex */
    public static final class CallableC11014b implements Callable {

        /* renamed from: a */
        public final Observable f65327a;

        /* renamed from: b */
        public final int f65328b;

        /* renamed from: c */
        public final long f65329c;

        /* renamed from: d */
        public final TimeUnit f65330d;

        /* renamed from: e */
        public final Scheduler f65331e;

        public CallableC11014b(Observable observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65327a = observable;
            this.f65328b = i;
            this.f65329c = j;
            this.f65330d = timeUnit;
            this.f65331e = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65327a.replay(this.f65328b, this.f65329c, this.f65330d, this.f65331e);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$c */
    /* loaded from: classes5.dex */
    public static final class C11015c implements Function {

        /* renamed from: a */
        public final Function f65332a;

        public C11015c(Function function) {
            this.f65332a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Object obj) {
            return new ObservableFromIterable((Iterable) ObjectHelper.requireNonNull(this.f65332a.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$d */
    /* loaded from: classes5.dex */
    public static final class C11016d implements Function {

        /* renamed from: a */
        public final BiFunction f65333a;

        /* renamed from: b */
        public final Object f65334b;

        public C11016d(BiFunction biFunction, Object obj) {
            this.f65333a = biFunction;
            this.f65334b = obj;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return this.f65333a.apply(this.f65334b, obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$e */
    /* loaded from: classes5.dex */
    public static final class C11017e implements Function {

        /* renamed from: a */
        public final BiFunction f65335a;

        /* renamed from: b */
        public final Function f65336b;

        public C11017e(BiFunction biFunction, Function function) {
            this.f65335a = biFunction;
            this.f65336b = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Object obj) {
            return new ObservableMap((ObservableSource) ObjectHelper.requireNonNull(this.f65336b.apply(obj), "The mapper returned a null ObservableSource"), new C11016d(this.f65335a, obj));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$f */
    /* loaded from: classes5.dex */
    public static final class C11018f implements Function {

        /* renamed from: a */
        public final Function f65337a;

        public C11018f(Function function) {
            this.f65337a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Object obj) {
            return new ObservableTake((ObservableSource) ObjectHelper.requireNonNull(this.f65337a.apply(obj), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$g */
    /* loaded from: classes5.dex */
    public static final class C11019g implements Action {

        /* renamed from: a */
        public final Observer f65338a;

        public C11019g(Observer observer) {
            this.f65338a = observer;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.f65338a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$h */
    /* loaded from: classes5.dex */
    public static final class C11020h implements Consumer {

        /* renamed from: a */
        public final Observer f65339a;

        public C11020h(Observer observer) {
            this.f65339a = observer;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            this.f65339a.onError(th2);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$i */
    /* loaded from: classes5.dex */
    public static final class C11021i implements Consumer {

        /* renamed from: a */
        public final Observer f65340a;

        public C11021i(Observer observer) {
            this.f65340a = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f65340a.onNext(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$j */
    /* loaded from: classes5.dex */
    public static final class CallableC11022j implements Callable {

        /* renamed from: a */
        public final Observable f65341a;

        public CallableC11022j(Observable observable) {
            this.f65341a = observable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65341a.replay();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$k */
    /* loaded from: classes5.dex */
    public static final class C11023k implements Function {

        /* renamed from: a */
        public final Function f65342a;

        /* renamed from: b */
        public final Scheduler f65343b;

        public C11023k(Function function, Scheduler scheduler) {
            this.f65342a = function;
            this.f65343b = scheduler;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Observable observable) {
            return Observable.wrap((ObservableSource) ObjectHelper.requireNonNull(this.f65342a.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.f65343b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$l */
    /* loaded from: classes5.dex */
    public static final class C11024l implements BiFunction {

        /* renamed from: a */
        public final BiConsumer f65344a;

        public C11024l(BiConsumer biConsumer) {
            this.f65344a = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f65344a.accept(obj, emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$m */
    /* loaded from: classes5.dex */
    public static final class C11025m implements BiFunction {

        /* renamed from: a */
        public final Consumer f65345a;

        public C11025m(Consumer consumer) {
            this.f65345a = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f65345a.accept(emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$n */
    /* loaded from: classes5.dex */
    public static final class CallableC11026n implements Callable {

        /* renamed from: a */
        public final Observable f65346a;

        /* renamed from: b */
        public final long f65347b;

        /* renamed from: c */
        public final TimeUnit f65348c;

        /* renamed from: d */
        public final Scheduler f65349d;

        public CallableC11026n(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65346a = observable;
            this.f65347b = j;
            this.f65348c = timeUnit;
            this.f65349d = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65346a.replay(this.f65347b, this.f65348c, this.f65349d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$o */
    /* loaded from: classes5.dex */
    public static final class C11027o implements Function {

        /* renamed from: a */
        public final Function f65350a;

        public C11027o(Function function) {
            this.f65350a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(List list) {
            return Observable.zipIterable(list, this.f65350a, false, Observable.bufferSize());
        }
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new C11015c(function);
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new C11017e(biFunction, function);
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> function) {
        return new C11018f(function);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new C11019g(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new C11020h(observer);
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new C11021i(observer);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable) {
        return new CallableC11022j(observable);
    }

    public static <T, R> Function<Observable<T>, ObservableSource<R>> replayFunction(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        return new C11023k(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new C11024l(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new C11025m(consumer);
    }

    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new C11027o(function);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i) {
        return new CallableC11013a(observable, i);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC11014b(observable, i, j, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC11026n(observable, j, timeUnit, scheduler);
    }
}
