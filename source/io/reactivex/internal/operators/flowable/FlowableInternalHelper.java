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
    public static final class CallableC10856a implements Callable {

        /* renamed from: a */
        public final Flowable f64332a;

        /* renamed from: b */
        public final int f64333b;

        public CallableC10856a(Flowable flowable, int i) {
            this.f64332a = flowable;
            this.f64333b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64332a.replay(this.f64333b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$b */
    /* loaded from: classes5.dex */
    public static final class CallableC10857b implements Callable {

        /* renamed from: a */
        public final Flowable f64334a;

        /* renamed from: b */
        public final int f64335b;

        /* renamed from: c */
        public final long f64336c;

        /* renamed from: d */
        public final TimeUnit f64337d;

        /* renamed from: e */
        public final Scheduler f64338e;

        public CallableC10857b(Flowable flowable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f64334a = flowable;
            this.f64335b = i;
            this.f64336c = j;
            this.f64337d = timeUnit;
            this.f64338e = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64334a.replay(this.f64335b, this.f64336c, this.f64337d, this.f64338e);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$c */
    /* loaded from: classes5.dex */
    public static final class C10858c implements Function {

        /* renamed from: a */
        public final Function f64339a;

        public C10858c(Function function) {
            this.f64339a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Object obj) {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.f64339a.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$d */
    /* loaded from: classes5.dex */
    public static final class C10859d implements Function {

        /* renamed from: a */
        public final BiFunction f64340a;

        /* renamed from: b */
        public final Object f64341b;

        public C10859d(BiFunction biFunction, Object obj) {
            this.f64340a = biFunction;
            this.f64341b = obj;
        }

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) {
            return this.f64340a.apply(this.f64341b, obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$e */
    /* loaded from: classes5.dex */
    public static final class C10860e implements Function {

        /* renamed from: a */
        public final BiFunction f64342a;

        /* renamed from: b */
        public final Function f64343b;

        public C10860e(BiFunction biFunction, Function function) {
            this.f64342a = biFunction;
            this.f64343b = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Object obj) {
            return new FlowableMapPublisher((Publisher) ObjectHelper.requireNonNull(this.f64343b.apply(obj), "The mapper returned a null Publisher"), new C10859d(this.f64342a, obj));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$f */
    /* loaded from: classes5.dex */
    public static final class C10861f implements Function {

        /* renamed from: a */
        public final Function f64344a;

        public C10861f(Function function) {
            this.f64344a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Object obj) {
            return new FlowableTakePublisher((Publisher) ObjectHelper.requireNonNull(this.f64344a.apply(obj), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$g */
    /* loaded from: classes5.dex */
    public static final class CallableC10862g implements Callable {

        /* renamed from: a */
        public final Flowable f64345a;

        public CallableC10862g(Flowable flowable) {
            this.f64345a = flowable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64345a.replay();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$h */
    /* loaded from: classes5.dex */
    public static final class C10863h implements Function {

        /* renamed from: a */
        public final Function f64346a;

        /* renamed from: b */
        public final Scheduler f64347b;

        public C10863h(Function function, Scheduler scheduler) {
            this.f64346a = function;
            this.f64347b = scheduler;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(Flowable flowable) {
            return Flowable.fromPublisher((Publisher) ObjectHelper.requireNonNull(this.f64346a.apply(flowable), "The selector returned a null Publisher")).observeOn(this.f64347b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$i */
    /* loaded from: classes5.dex */
    public static final class C10864i implements BiFunction {

        /* renamed from: a */
        public final BiConsumer f64348a;

        public C10864i(BiConsumer biConsumer) {
            this.f64348a = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f64348a.accept(obj, emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$j */
    /* loaded from: classes5.dex */
    public static final class C10865j implements BiFunction {

        /* renamed from: a */
        public final Consumer f64349a;

        public C10865j(Consumer consumer) {
            this.f64349a = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a */
        public Object apply(Object obj, Emitter emitter) {
            this.f64349a.accept(emitter);
            return obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$k */
    /* loaded from: classes5.dex */
    public static final class C10866k implements Action {

        /* renamed from: a */
        public final Subscriber f64350a;

        public C10866k(Subscriber subscriber) {
            this.f64350a = subscriber;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.f64350a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$l */
    /* loaded from: classes5.dex */
    public static final class C10867l implements Consumer {

        /* renamed from: a */
        public final Subscriber f64351a;

        public C10867l(Subscriber subscriber) {
            this.f64351a = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th2) {
            this.f64351a.onError(th2);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$m */
    /* loaded from: classes5.dex */
    public static final class C10868m implements Consumer {

        /* renamed from: a */
        public final Subscriber f64352a;

        public C10868m(Subscriber subscriber) {
            this.f64352a = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) {
            this.f64352a.onNext(obj);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$n */
    /* loaded from: classes5.dex */
    public static final class CallableC10869n implements Callable {

        /* renamed from: a */
        public final Flowable f64353a;

        /* renamed from: b */
        public final long f64354b;

        /* renamed from: c */
        public final TimeUnit f64355c;

        /* renamed from: d */
        public final Scheduler f64356d;

        public CallableC10869n(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f64353a = flowable;
            this.f64354b = j;
            this.f64355c = timeUnit;
            this.f64356d = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableFlowable call() {
            return this.f64353a.replay(this.f64354b, this.f64355c, this.f64356d);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableInternalHelper$o */
    /* loaded from: classes5.dex */
    public static final class C10870o implements Function {

        /* renamed from: a */
        public final Function f64357a;

        public C10870o(Function function) {
            this.f64357a = function;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public Publisher apply(List list) {
            return Flowable.zipIterable(list, this.f64357a, false, Flowable.bufferSize());
        }
    }

    public static <T, U> Function<T, Publisher<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new C10858c(function);
    }

    public static <T, U, R> Function<T, Publisher<R>> flatMapWithCombiner(Function<? super T, ? extends Publisher<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new C10860e(biFunction, function);
    }

    public static <T, U> Function<T, Publisher<T>> itemDelay(Function<? super T, ? extends Publisher<U>> function) {
        return new C10861f(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new CallableC10862g(flowable);
    }

    public static <T, R> Function<Flowable<T>, Publisher<R>> replayFunction(Function<? super Flowable<T>, ? extends Publisher<R>> function, Scheduler scheduler) {
        return new C10863h(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new C10864i(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new C10865j(consumer);
    }

    public static <T> Action subscriberOnComplete(Subscriber<T> subscriber) {
        return new C10866k(subscriber);
    }

    public static <T> Consumer<Throwable> subscriberOnError(Subscriber<T> subscriber) {
        return new C10867l(subscriber);
    }

    public static <T> Consumer<T> subscriberOnNext(Subscriber<T> subscriber) {
        return new C10868m(subscriber);
    }

    public static <T, R> Function<List<Publisher<? extends T>>, Publisher<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new C10870o(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i) {
        return new CallableC10856a(flowable, i);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC10857b(flowable, i, j, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new CallableC10869n(flowable, j, timeUnit, scheduler);
    }
}
