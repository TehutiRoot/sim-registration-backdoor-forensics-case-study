package hu.akarnokd.rxjava.interop;

import hu.akarnokd.rxjava.interop.C10422a;
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
    public static class C10413a implements FlowableTransformer {

        /* renamed from: a */
        public final /* synthetic */ Observable.Transformer f62629a;

        public C10413a(Observable.Transformer transformer) {
            this.f62629a = transformer;
        }

        @Override // io.reactivex.FlowableTransformer
        public Publisher apply(Flowable flowable) {
            return RxJavaInterop.toV2Flowable(this.f62629a.call(RxJavaInterop.toV1Observable(flowable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$b */
    /* loaded from: classes5.dex */
    public static class C10414b implements SingleTransformer {

        /* renamed from: a */
        public final /* synthetic */ Single.Transformer f62630a;

        public C10414b(Single.Transformer transformer) {
            this.f62630a = transformer;
        }

        @Override // io.reactivex.SingleTransformer
        /* renamed from: a */
        public io.reactivex.Single apply(io.reactivex.Single single) {
            return RxJavaInterop.toV2Single(this.f62630a.call(RxJavaInterop.toV1Single(single)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$c */
    /* loaded from: classes5.dex */
    public static class C10415c implements CompletableTransformer {

        /* renamed from: a */
        public final /* synthetic */ Completable.Transformer f62631a;

        public C10415c(Completable.Transformer transformer) {
            this.f62631a = transformer;
        }

        @Override // io.reactivex.CompletableTransformer
        /* renamed from: a */
        public io.reactivex.Completable apply(io.reactivex.Completable completable) {
            return RxJavaInterop.toV2Completable(this.f62631a.call(RxJavaInterop.toV1Completable(completable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$d */
    /* loaded from: classes5.dex */
    public static class C10416d implements FlowableOperator {

        /* renamed from: a */
        public final /* synthetic */ Observable.Operator f62632a;

        public C10416d(Observable.Operator operator) {
            this.f62632a = operator;
        }

        @Override // io.reactivex.FlowableOperator
        public Subscriber apply(Subscriber subscriber) {
            p046rx.Subscriber empty;
            C10422a.C10423a c10423a = new C10422a.C10423a(subscriber);
            subscriber.onSubscribe(new C10422a.C10424b(c10423a));
            try {
                empty = (p046rx.Subscriber) ObjectHelper.requireNonNull(this.f62632a.call(c10423a), "The operator returned a null rx.Subscriber");
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
    public static class C10417e implements Observable.Transformer {

        /* renamed from: a */
        public final /* synthetic */ FlowableTransformer f62633a;

        public C10417e(FlowableTransformer flowableTransformer) {
            this.f62633a = flowableTransformer;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return RxJavaInterop.toV1Observable(this.f62633a.apply(RxJavaInterop.toV2Flowable(observable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$f */
    /* loaded from: classes5.dex */
    public static class C10418f implements Single.Transformer {

        /* renamed from: a */
        public final /* synthetic */ SingleTransformer f62634a;

        public C10418f(SingleTransformer singleTransformer) {
            this.f62634a = singleTransformer;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Single call(Single single) {
            return RxJavaInterop.toV1Single(this.f62634a.apply(RxJavaInterop.toV2Single(single)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$g */
    /* loaded from: classes5.dex */
    public static class C10419g implements Completable.Transformer {

        /* renamed from: a */
        public final /* synthetic */ CompletableTransformer f62635a;

        public C10419g(CompletableTransformer completableTransformer) {
            this.f62635a = completableTransformer;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable call(Completable completable) {
            return RxJavaInterop.toV1Completable(this.f62635a.apply(RxJavaInterop.toV2Completable(completable)));
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.RxJavaInterop$h */
    /* loaded from: classes5.dex */
    public static class C10420h implements Observable.Operator {

        /* renamed from: a */
        public final /* synthetic */ FlowableOperator f62636a;

        public C10420h(FlowableOperator flowableOperator) {
            this.f62636a = flowableOperator;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public p046rx.Subscriber call(p046rx.Subscriber subscriber) {
            FlowableV2ToObservableV1.SourceSubscriber sourceSubscriber = new FlowableV2ToObservableV1.SourceSubscriber(subscriber);
            subscriber.add(sourceSubscriber);
            subscriber.setProducer(sourceSubscriber);
            try {
                Subscriber subscriber2 = (Subscriber) ObjectHelper.requireNonNull(this.f62636a.apply(sourceSubscriber), "The operator returned a null Subscriber");
                C10422a.C10423a c10423a = new C10422a.C10423a(subscriber2);
                subscriber2.onSubscribe(new C10422a.C10424b(c10423a));
                return c10423a;
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
        return Completable.create(new C0559Hu(completableSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Observable<T> toV1Observable(Publisher<T> publisher) {
        ObjectHelper.requireNonNull(publisher, "source is null");
        return Observable.unsafeCreate(new FlowableV2ToObservableV1(publisher));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> Observable.Operator<R, T> toV1Operator(FlowableOperator<R, T> flowableOperator) {
        ObjectHelper.requireNonNull(flowableOperator, "operator is null");
        return new C10420h(flowableOperator);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Single<T> toV1Single(SingleSource<T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "source is null");
        return Single.create(new SingleV2ToSingleV1(singleSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Subject<T, T> toV1Subject(io.reactivex.subjects.Subject<T> subject) {
        ObjectHelper.requireNonNull(subject, "subject is null");
        return SubjectV2ToSubjectV1.m30721c(subject);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> Observable.Transformer<T, R> toV1Transformer(FlowableTransformer<T, R> flowableTransformer) {
        ObjectHelper.requireNonNull(flowableTransformer, "transformer is null");
        return new C10417e(flowableTransformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static io.reactivex.Completable toV2Completable(Completable completable) {
        ObjectHelper.requireNonNull(completable, "source is null");
        return new C0416Fu(completable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Flowable<T> toV2Flowable(Observable<T> observable) {
        ObjectHelper.requireNonNull(observable, "source is null");
        return new C10422a(observable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Maybe<T> toV2Maybe(Completable completable) {
        ObjectHelper.requireNonNull(completable, "source is null");
        return new C0488Gu(completable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> io.reactivex.Observable<T> toV2Observable(Observable<T> observable) {
        ObjectHelper.requireNonNull(observable, "source is null");
        return new C19679eK0(observable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> FlowableOperator<R, T> toV2Operator(Observable.Operator<R, T> operator) {
        ObjectHelper.requireNonNull(operator, "operator is null");
        return new C10416d(operator);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> FlowableProcessor<T> toV2Processor(Subject<T, T> subject) {
        ObjectHelper.requireNonNull(subject, "subject is null");
        return new C10427c(subject);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> io.reactivex.Single<T> toV2Single(Single<T> single) {
        ObjectHelper.requireNonNull(single, "source is null");
        return new IJ1(single);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> io.reactivex.subjects.Subject<T> toV2Subject(Subject<T, T> subject) {
        ObjectHelper.requireNonNull(subject, "subject is null");
        return new C21582pO1(subject);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> FlowableTransformer<T, R> toV2Transformer(Observable.Transformer<T, R> transformer) {
        ObjectHelper.requireNonNull(transformer, "transformer is null");
        return new C10413a(transformer);
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
        return C10425b.m30715c(flowableProcessor);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> Single.Transformer<T, R> toV1Transformer(SingleTransformer<T, R> singleTransformer) {
        ObjectHelper.requireNonNull(singleTransformer, "transformer is null");
        return new C10418f(singleTransformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T> Maybe<T> toV2Maybe(Single<T> single) {
        ObjectHelper.requireNonNull(single, "source is null");
        return new HJ1(single);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static <T, R> SingleTransformer<T, R> toV2Transformer(Single.Transformer<T, R> transformer) {
        ObjectHelper.requireNonNull(transformer, "transformer is null");
        return new C10414b(transformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static Completable.Transformer toV1Transformer(CompletableTransformer completableTransformer) {
        ObjectHelper.requireNonNull(completableTransformer, "transformer is null");
        return new C10419g(completableTransformer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    public static CompletableTransformer toV2Transformer(Completable.Transformer transformer) {
        ObjectHelper.requireNonNull(transformer, "transformer is null");
        return new C10415c(transformer);
    }
}
