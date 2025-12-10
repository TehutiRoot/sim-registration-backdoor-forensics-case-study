package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableInternalHelper {

    /* loaded from: classes5.dex */
    public enum RequestMax implements Consumer<Subscription> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$a */
    /* loaded from: classes5.dex */
    public static final class CallableC10843a implements Callable {

        /* renamed from: a */
        public final Flowable f64395a;

        /* renamed from: b */
        public final int f64396b;

        public CallableC10843a(Flowable flowable, int i) {
            this.f64395a = flowable;
            this.f64396b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64395a.replay(this.f64396b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$b */
    /* loaded from: classes5.dex */
    public static final class CallableC10844b implements Callable {

        /* renamed from: a */
        public final Flowable f64397a;

        /* renamed from: b */
        public final int f64398b;

        /* renamed from: c */
        public final long f64399c;

        /* renamed from: d */
        public final TimeUnit f64400d;

        /* renamed from: e */
        public final Scheduler f64401e;

        public CallableC10844b(Flowable flowable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f64397a = flowable;
            this.f64398b = i;
            this.f64399c = j;
            this.f64400d = timeUnit;
            this.f64401e = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64397a.replay(this.f64398b, this.f64399c, this.f64400d, this.f64401e);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$c */
    /* loaded from: classes5.dex */
    public static final class C10845c implements Function {

        /* renamed from: a */
        public final Function f64402a;

        public C10845c(Function function) {
            this.f64402a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Object obj) {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.f64402a.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$d */
    /* loaded from: classes5.dex */
    public static final class C10846d implements Function {

        /* renamed from: a */
        public final BiFunction f64403a;

        /* renamed from: b */
        public final Object f64404b;

        public C10846d(BiFunction biFunction, Object obj) {
            this.f64403a = biFunction;
            this.f64404b = obj;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return this.f64403a.apply(this.f64404b, obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$e */
    /* loaded from: classes5.dex */
    public static final class C10847e implements Function {

        /* renamed from: a */
        public final BiFunction f64405a;

        /* renamed from: b */
        public final Function f64406b;

        public C10847e(BiFunction biFunction, Function function) {
            this.f64405a = biFunction;
            this.f64406b = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Object obj) {
            return new FlowableMapPublisher((Publisher) ObjectHelper.requireNonNull(this.f64406b.apply(obj), "The mapper returned a null Publisher"), new C10846d(this.f64405a, obj));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$f */
    /* loaded from: classes5.dex */
    public static final class C10848f implements Function {

        /* renamed from: a */
        public final Function f64407a;

        public C10848f(Function function) {
            this.f64407a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Object obj) {
            return new FlowableTakePublisher((Publisher) ObjectHelper.requireNonNull(this.f64407a.apply(obj), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$g */
    /* loaded from: classes5.dex */
    public static final class CallableC10849g implements Callable {

        /* renamed from: a */
        public final Flowable f64408a;

        public CallableC10849g(Flowable flowable) {
            this.f64408a = flowable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64408a.replay();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$h */
    /* loaded from: classes5.dex */
    public static final class C10850h implements Function {

        /* renamed from: a */
        public final Function f64409a;

        /* renamed from: b */
        public final Scheduler f64410b;

        public C10850h(Function function, Scheduler scheduler) {
            this.f64409a = function;
            this.f64410b = scheduler;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Flowable flowable) {
            return Flowable.fromPublisher((Publisher) ObjectHelper.requireNonNull(this.f64409a.apply(flowable), "The selector returned a null Publisher")).observeOn(this.f64410b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$i */
    /* loaded from: classes5.dex */
    public static final class C10851i implements BiFunction {

        /* renamed from: a */
        public final BiConsumer f64411a;

        public C10851i(BiConsumer biConsumer) {
            this.f64411a = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f64411a.accept(obj, emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$j */
    /* loaded from: classes5.dex */
    public static final class C10852j implements BiFunction {

        /* renamed from: a */
        public final Consumer f64412a;

        public C10852j(Consumer consumer) {
            this.f64412a = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f64412a.accept(emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$k */
    /* loaded from: classes5.dex */
    public static final class C10853k implements Action {

        /* renamed from: a */
        public final Subscriber f64413a;

        public C10853k(Subscriber subscriber) {
            this.f64413a = subscriber;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.f64413a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$l */
    /* loaded from: classes5.dex */
    public static final class C10854l implements Consumer {

        /* renamed from: a */
        public final Subscriber f64414a;

        public C10854l(Subscriber subscriber) {
            this.f64414a = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            this.f64414a.onError(th2);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$m */
    /* loaded from: classes5.dex */
    public static final class C10855m implements Consumer {

        /* renamed from: a */
        public final Subscriber f64415a;

        public C10855m(Subscriber subscriber) {
            this.f64415a = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f64415a.onNext(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$n */
    /* loaded from: classes5.dex */
    public static final class CallableC10856n implements Callable {

        /* renamed from: a */
        public final Flowable f64416a;

        /* renamed from: b */
        public final long f64417b;

        /* renamed from: c */
        public final TimeUnit f64418c;

        /* renamed from: d */
        public final Scheduler f64419d;

        public CallableC10856n(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f64416a = flowable;
            this.f64417b = j;
            this.f64418c = timeUnit;
            this.f64419d = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64416a.replay(this.f64417b, this.f64418c, this.f64419d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$o */
    /* loaded from: classes5.dex */
    public static final class C10857o implements Function {

        /* renamed from: a */
        public final Function f64420a;

        public C10857o(Function function) {
            this.f64420a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(List list) {
            return Flowable.zipIterable(list, this.f64420a, false, Flowable.bufferSize());
        }
    }

    public static <T, U> Function<T, Publisher<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new C10845c(function);
    }

    public static <T, U, R> Function<T, Publisher<R>> flatMapWithCombiner(Function<? super T, ? extends Publisher<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new C10847e(biFunction, function);
    }

    public static <T, U> Function<T, Publisher<T>> itemDelay(Function<? super T, ? extends Publisher<U>> function) {
        return new C10848f(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new CallableC10849g(flowable);
    }

    public static <T, R> Function<Flowable<T>, Publisher<R>> replayFunction(Function<? super Flowable<T>, ? extends Publisher<R>> function, Scheduler scheduler) {
        return new C10850h(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new C10851i(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new C10852j(consumer);
    }

    public static <T> Action subscriberOnComplete(Subscriber<T> subscriber) {
        return new C10853k(subscriber);
    }

    public static <T> Consumer<Throwable> subscriberOnError(Subscriber<T> subscriber) {
        return new C10854l(subscriber);
    }

    public static <T> Consumer<T> subscriberOnNext(Subscriber<T> subscriber) {
        return new C10855m(subscriber);
    }

    public static <T, R> Function<List<Publisher<? extends T>>, Publisher<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new C10857o(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i) {
        return new CallableC10843a(flowable, i);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC10844b(flowable, i, j, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC10856n(flowable, j, timeUnit, scheduler);
    }
}