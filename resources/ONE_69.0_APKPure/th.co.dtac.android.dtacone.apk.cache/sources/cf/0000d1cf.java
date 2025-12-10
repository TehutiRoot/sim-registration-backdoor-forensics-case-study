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
    public static final class CallableC11000a implements Callable {

        /* renamed from: a */
        public final Observable f65388a;

        /* renamed from: b */
        public final int f65389b;

        public CallableC11000a(Observable observable, int i) {
            this.f65388a = observable;
            this.f65389b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65388a.replay(this.f65389b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$b */
    /* loaded from: classes5.dex */
    public static final class CallableC11001b implements Callable {

        /* renamed from: a */
        public final Observable f65390a;

        /* renamed from: b */
        public final int f65391b;

        /* renamed from: c */
        public final long f65392c;

        /* renamed from: d */
        public final TimeUnit f65393d;

        /* renamed from: e */
        public final Scheduler f65394e;

        public CallableC11001b(Observable observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65390a = observable;
            this.f65391b = i;
            this.f65392c = j;
            this.f65393d = timeUnit;
            this.f65394e = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65390a.replay(this.f65391b, this.f65392c, this.f65393d, this.f65394e);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$c */
    /* loaded from: classes5.dex */
    public static final class C11002c implements Function {

        /* renamed from: a */
        public final Function f65395a;

        public C11002c(Function function) {
            this.f65395a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Object obj) {
            return new ObservableFromIterable((Iterable) ObjectHelper.requireNonNull(this.f65395a.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$d */
    /* loaded from: classes5.dex */
    public static final class C11003d implements Function {

        /* renamed from: a */
        public final BiFunction f65396a;

        /* renamed from: b */
        public final Object f65397b;

        public C11003d(BiFunction biFunction, Object obj) {
            this.f65396a = biFunction;
            this.f65397b = obj;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return this.f65396a.apply(this.f65397b, obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$e */
    /* loaded from: classes5.dex */
    public static final class C11004e implements Function {

        /* renamed from: a */
        public final BiFunction f65398a;

        /* renamed from: b */
        public final Function f65399b;

        public C11004e(BiFunction biFunction, Function function) {
            this.f65398a = biFunction;
            this.f65399b = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Object obj) {
            return new ObservableMap((ObservableSource) ObjectHelper.requireNonNull(this.f65399b.apply(obj), "The mapper returned a null ObservableSource"), new C11003d(this.f65398a, obj));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$f */
    /* loaded from: classes5.dex */
    public static final class C11005f implements Function {

        /* renamed from: a */
        public final Function f65400a;

        public C11005f(Function function) {
            this.f65400a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Object obj) {
            return new ObservableTake((ObservableSource) ObjectHelper.requireNonNull(this.f65400a.apply(obj), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$g */
    /* loaded from: classes5.dex */
    public static final class C11006g implements Action {

        /* renamed from: a */
        public final Observer f65401a;

        public C11006g(Observer observer) {
            this.f65401a = observer;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.f65401a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$h */
    /* loaded from: classes5.dex */
    public static final class C11007h implements Consumer {

        /* renamed from: a */
        public final Observer f65402a;

        public C11007h(Observer observer) {
            this.f65402a = observer;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            this.f65402a.onError(th2);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$i */
    /* loaded from: classes5.dex */
    public static final class C11008i implements Consumer {

        /* renamed from: a */
        public final Observer f65403a;

        public C11008i(Observer observer) {
            this.f65403a = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f65403a.onNext(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$j */
    /* loaded from: classes5.dex */
    public static final class CallableC11009j implements Callable {

        /* renamed from: a */
        public final Observable f65404a;

        public CallableC11009j(Observable observable) {
            this.f65404a = observable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65404a.replay();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$k */
    /* loaded from: classes5.dex */
    public static final class C11010k implements Function {

        /* renamed from: a */
        public final Function f65405a;

        /* renamed from: b */
        public final Scheduler f65406b;

        public C11010k(Function function, Scheduler scheduler) {
            this.f65405a = function;
            this.f65406b = scheduler;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(Observable observable) {
            return Observable.wrap((ObservableSource) ObjectHelper.requireNonNull(this.f65405a.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.f65406b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$l */
    /* loaded from: classes5.dex */
    public static final class C11011l implements BiFunction {

        /* renamed from: a */
        public final BiConsumer f65407a;

        public C11011l(BiConsumer biConsumer) {
            this.f65407a = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f65407a.accept(obj, emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$m */
    /* loaded from: classes5.dex */
    public static final class C11012m implements BiFunction {

        /* renamed from: a */
        public final Consumer f65408a;

        public C11012m(Consumer consumer) {
            this.f65408a = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f65408a.accept(emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$n */
    /* loaded from: classes5.dex */
    public static final class CallableC11013n implements Callable {

        /* renamed from: a */
        public final Observable f65409a;

        /* renamed from: b */
        public final long f65410b;

        /* renamed from: c */
        public final TimeUnit f65411c;

        /* renamed from: d */
        public final Scheduler f65412d;

        public CallableC11013n(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f65409a = observable;
            this.f65410b = j;
            this.f65411c = timeUnit;
            this.f65412d = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f65409a.replay(this.f65410b, this.f65411c, this.f65412d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableInternalHelper$o */
    /* loaded from: classes5.dex */
    public static final class C11014o implements Function {

        /* renamed from: a */
        public final Function f65413a;

        public C11014o(Function function) {
            this.f65413a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public ObservableSource apply(List list) {
            return Observable.zipIterable(list, this.f65413a, false, Observable.bufferSize());
        }
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new C11002c(function);
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new C11004e(biFunction, function);
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> function) {
        return new C11005f(function);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new C11006g(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new C11007h(observer);
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new C11008i(observer);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable) {
        return new CallableC11009j(observable);
    }

    public static <T, R> Function<Observable<T>, ObservableSource<R>> replayFunction(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        return new C11010k(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new C11011l(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new C11012m(consumer);
    }

    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new C11014o(function);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i) {
        return new CallableC11000a(observable, i);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC11001b(observable, i, j, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC11013n(observable, j, timeUnit, scheduler);
    }
}