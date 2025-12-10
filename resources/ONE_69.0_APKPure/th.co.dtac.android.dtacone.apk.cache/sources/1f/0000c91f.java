package hu.akarnokd.rxjava.interop;

import hu.akarnokd.rxjava.interop.C10408a;
import hu.akarnokd.rxjava.interop.FlowableV2ToObservableV1;
import io.reactivex.BackpressureStrategy;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.FlowableOperator;
import io.reactivex.FlowableTransformer;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.processors.FlowableProcessor;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import p046rx.Completable;
import p046rx.Observable;
import p046rx.Single;
import p046rx.observers.Subscribers;
import p046rx.subjects.Subject;

/* loaded from: classes5.dex */
public final class RxJavaInterop {

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$a */
    /* loaded from: classes5.dex */
    public static class C10399a implements FlowableTransformer {

        /* renamed from: a */
        public final /* synthetic */ Observable.Transformer f62688a;

        public C10399a(Observable.Transformer transformer) {
            this.f62688a = transformer;
        }

        @Override // io.reactivex.FlowableTransformer
        public Publisher apply(Flowable flowable) {
            return RxJavaInterop.toV2Flowable(this.f62688a.call(RxJavaInterop.toV1Observable(flowable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$b */
    /* loaded from: classes5.dex */
    public static class C10400b implements SingleTransformer {

        /* renamed from: a */
        public final /* synthetic */ Single.Transformer f62689a;

        public C10400b(Single.Transformer transformer) {
            this.f62689a = transformer;
        }

        @Override // io.reactivex.SingleTransformer
        /* renamed from: a */
        public io.reactivex.Single apply(io.reactivex.Single single) {
            return RxJavaInterop.toV2Single(this.f62689a.call(RxJavaInterop.toV1Single(single)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$c */
    /* loaded from: classes5.dex */
    public static class C10401c implements CompletableTransformer {

        /* renamed from: a */
        public final /* synthetic */ Completable.Transformer f62690a;

        public C10401c(Completable.Transformer transformer) {
            this.f62690a = transformer;
        }

        @Override // io.reactivex.CompletableTransformer
        /* renamed from: a */
        public io.reactivex.Completable apply(io.reactivex.Completable completable) {
            return RxJavaInterop.toV2Completable(this.f62690a.call(RxJavaInterop.toV1Completable(completable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$d */
    /* loaded from: classes5.dex */
    public static class C10402d implements FlowableOperator {

        /* renamed from: a */
        public final /* synthetic */ Observable.Operator f62691a;

        public C10402d(Observable.Operator operator) {
            this.f62691a = operator;
        }

        @Override // io.reactivex.FlowableOperator
        public Subscriber apply(Subscriber subscriber) {
            p046rx.Subscriber empty;
            C10408a.C10409a c10409a = new C10408a.C10409a(subscriber);
            subscriber.onSubscribe(new C10408a.C10410b(c10409a));
            try {
                empty = (p046rx.Subscriber) ObjectHelper.requireNonNull(this.f62691a.call(c10409a), "The operator returned a null rx.Subscriber");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                p046rx.exceptions.Exceptions.throwIfFatal(th2);
                subscriber.onError(th2);
                empty = Subscribers.empty();
                empty.unsubscribe();
            }
            FlowableV2ToObservableV1.SourceSubscriber sourceSubscriber = new FlowableV2ToObservableV1.SourceSubscriber(empty);
            empty.add(sourceSubscriber);
            empty.setProducer(sourceSubscriber);
            return sourceSubscriber;
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$e */
    /* loaded from: classes5.dex */
    public static class C10403e implements Observable.Transformer {

        /* renamed from: a */
        public final /* synthetic */ FlowableTransformer f62692a;

        public C10403e(FlowableTransformer flowableTransformer) {
            this.f62692a = flowableTransformer;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return RxJavaInterop.toV1Observable(this.f62692a.apply(RxJavaInterop.toV2Flowable(observable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$f */
    /* loaded from: classes5.dex */
    public static class C10404f implements Single.Transformer {

        /* renamed from: a */
        public final /* synthetic */ SingleTransformer f62693a;

        public C10404f(SingleTransformer singleTransformer) {
            this.f62693a = singleTransformer;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Single call(Single single) {
            return RxJavaInterop.toV1Single(this.f62693a.apply(RxJavaInterop.toV2Single(single)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$g */
    /* loaded from: classes5.dex */
    public static class C10405g implements Completable.Transformer {

        /* renamed from: a */
        public final /* synthetic */ CompletableTransformer f62694a;

        public C10405g(CompletableTransformer completableTransformer) {
            this.f62694a = completableTransformer;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable call(Completable completable) {
            return RxJavaInterop.toV1Completable(this.f62694a.apply(RxJavaInterop.toV2Completable(completable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$h */
    /* loaded from: classes5.dex */
    public static class C10406h implements Observable.Operator {

        /* renamed from: a */
        public final /* synthetic */ FlowableOperator f62695a;

        public C10406h(FlowableOperator flowableOperator) {
            this.f62695a = flowableOperator;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public p046rx.Subscriber call(p046rx.Subscriber subscriber) {
            FlowableV2ToObservableV1.SourceSubscriber sourceSubscriber = new FlowableV2ToObservableV1.SourceSubscriber(subscriber);
            subscriber.add(sourceSubscriber);
            subscriber.setProducer(sourceSubscriber);
            try {
                Subscriber subscriber2 = (Subscriber) ObjectHelper.requireNonNull(this.f62695a.apply(sourceSubscriber), "The operator returned a null Subscriber");
                C10408a.C10409a c10409a = new C10408a.C10409a(subscriber2);
                subscriber2.onSubscribe(new C10408a.C10410b(c10409a));
                return c10409a;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                p046rx.exceptions.Exceptions.throwIfFatal(th2);
                subscriber.onError(th2);
                p046rx.Subscriber empty = Subscribers.empty();
                empty.unsubscribe();
                return empty;
            }
        }
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static Completable toV1Completable(CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "source is null");
        return Completable.create(new C0551Hu(completableSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Observable<T> toV1Observable(Publisher<T> publisher) {
        ObjectHelper.requireNonNull(publisher, "source is null");
        return Observable.unsafeCreate(new FlowableV2ToObservableV1(publisher));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> Observable.Operator<R, T> toV1Operator(FlowableOperator<R, T> flowableOperator) {
        ObjectHelper.requireNonNull(flowableOperator, "operator is null");
        return new C10406h(flowableOperator);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Single<T> toV1Single(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "source is null");
        return Single.create(new SingleV2ToSingleV1(singleSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Subject<T, T> toV1Subject(io.reactivex.subjects.Subject<T> subject) {
        ObjectHelper.requireNonNull(subject, "subject is null");
        return SubjectV2ToSubjectV1.m31078c(subject);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> Observable.Transformer<T, R> toV1Transformer(FlowableTransformer<T, R> flowableTransformer) {
        ObjectHelper.requireNonNull(flowableTransformer, "transformer is null");
        return new C10403e(flowableTransformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static io.reactivex.Completable toV2Completable(Completable completable) {
        ObjectHelper.requireNonNull(completable, "source is null");
        return new C0412Fu(completable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Flowable<T> toV2Flowable(Observable<T> observable) {
        ObjectHelper.requireNonNull(observable, "source is null");
        return new C10408a(observable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Maybe<T> toV2Maybe(Completable completable) {
        ObjectHelper.requireNonNull(completable, "source is null");
        return new C0482Gu(completable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> io.reactivex.Observable<T> toV2Observable(Observable<T> observable) {
        ObjectHelper.requireNonNull(observable, "source is null");
        return new C20767kK0(observable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> FlowableOperator<R, T> toV2Operator(Observable.Operator<R, T> operator) {
        ObjectHelper.requireNonNull(operator, "operator is null");
        return new C10402d(operator);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> FlowableProcessor<T> toV2Processor(Subject<T, T> subject) {
        ObjectHelper.requireNonNull(subject, "subject is null");
        return new C10413c(subject);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> io.reactivex.Single<T> toV2Single(Single<T> single) {
        ObjectHelper.requireNonNull(single, "source is null");
        return new FK1(single);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> io.reactivex.subjects.Subject<T> toV2Subject(Subject<T, T> subject) {
        ObjectHelper.requireNonNull(subject, "subject is null");
        return new C21127mP1(subject);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> FlowableTransformer<T, R> toV2Transformer(Observable.Transformer<T, R> transformer) {
        ObjectHelper.requireNonNull(transformer, "transformer is null");
        return new C10399a(transformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Completable toV1Completable(MaybeSource<T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "source is null");
        return Completable.create(new MaybeV2ToCompletableV1(maybeSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Observable<T> toV1Observable(ObservableSource<T> observableSource, BackpressureStrategy backpressureStrategy) {
        ObjectHelper.requireNonNull(observableSource, "source is null");
        ObjectHelper.requireNonNull(backpressureStrategy, "strategy is null");
        return toV1Observable(io.reactivex.Observable.wrap(observableSource).toFlowable(backpressureStrategy));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Single<T> toV1Single(MaybeSource<T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "source is null");
        return Single.create(new MaybeV2ToSingleV1(maybeSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Subject<T, T> toV1Subject(FlowableProcessor<T> flowableProcessor) {
        ObjectHelper.requireNonNull(flowableProcessor, "processor is null");
        return C10411b.m31072c(flowableProcessor);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> Single.Transformer<T, R> toV1Transformer(SingleTransformer<T, R> singleTransformer) {
        ObjectHelper.requireNonNull(singleTransformer, "transformer is null");
        return new C10404f(singleTransformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Maybe<T> toV2Maybe(Single<T> single) {
        ObjectHelper.requireNonNull(single, "source is null");
        return new EK1(single);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> SingleTransformer<T, R> toV2Transformer(Single.Transformer<T, R> transformer) {
        ObjectHelper.requireNonNull(transformer, "transformer is null");
        return new C10400b(transformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static Completable.Transformer toV1Transformer(CompletableTransformer completableTransformer) {
        ObjectHelper.requireNonNull(completableTransformer, "transformer is null");
        return new C10405g(completableTransformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static CompletableTransformer toV2Transformer(Completable.Transformer transformer) {
        ObjectHelper.requireNonNull(transformer, "transformer is null");
        return new C10401c(transformer);
    }
}