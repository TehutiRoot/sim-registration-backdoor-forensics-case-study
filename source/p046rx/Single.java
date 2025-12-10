package p046rx;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.annotations.Experimental;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Actions;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.functions.Func3;
import p046rx.functions.Func4;
import p046rx.functions.Func5;
import p046rx.functions.Func6;
import p046rx.functions.Func7;
import p046rx.functions.Func8;
import p046rx.functions.Func9;
import p046rx.functions.FuncN;
import p046rx.internal.observers.AssertableSubscriberObservable;
import p046rx.internal.operators.CompletableFlatMapSingleToCompletable;
import p046rx.internal.operators.SingleDelay;
import p046rx.internal.operators.SingleDoAfterTerminate;
import p046rx.internal.operators.SingleDoOnEvent;
import p046rx.internal.operators.SingleDoOnSubscribe;
import p046rx.internal.operators.SingleDoOnUnsubscribe;
import p046rx.internal.operators.SingleFromCallable;
import p046rx.internal.operators.SingleFromEmitter;
import p046rx.internal.operators.SingleFromFuture;
import p046rx.internal.operators.SingleFromObservable;
import p046rx.internal.operators.SingleLiftObservableOperator;
import p046rx.internal.operators.SingleObserveOn;
import p046rx.internal.operators.SingleOnErrorReturn;
import p046rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther;
import p046rx.internal.operators.SingleOnSubscribeMap;
import p046rx.internal.operators.SingleOnSubscribeUsing;
import p046rx.internal.operators.SingleOperatorCast;
import p046rx.internal.operators.SingleOperatorOnErrorResumeNext;
import p046rx.internal.operators.SingleOperatorZip;
import p046rx.internal.operators.SingleTakeUntilCompletable;
import p046rx.internal.operators.SingleTakeUntilObservable;
import p046rx.internal.operators.SingleTakeUntilSingle;
import p046rx.internal.operators.SingleTimeout;
import p046rx.internal.operators.SingleToObservable;
import p046rx.internal.util.ScalarSynchronousSingle;
import p046rx.internal.util.UtilityFunctions;
import p046rx.observers.AssertableSubscriber;
import p046rx.observers.SafeSubscriber;
import p046rx.plugins.RxJavaHooks;
import p046rx.schedulers.Schedulers;
import p046rx.singles.BlockingSingle;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.Single */
/* loaded from: classes5.dex */
public class Single<T> {

    /* renamed from: a */
    public final OnSubscribe f77658a;

    /* renamed from: rx.Single$OnSubscribe */
    /* loaded from: classes5.dex */
    public interface OnSubscribe<T> extends Action1<SingleSubscriber<? super T>> {
    }

    /* renamed from: rx.Single$Transformer */
    /* loaded from: classes5.dex */
    public interface Transformer<T, R> extends Func1<Single<T>, Single<R>> {
    }

    /* renamed from: rx.Single$a */
    /* loaded from: classes5.dex */
    public static class C13372a implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func9 f77659a;

        public C13372a(Func9 func9) {
            this.f77659a = func9;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77659a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
        }
    }

    /* renamed from: rx.Single$b */
    /* loaded from: classes5.dex */
    public class C13373b extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ Action1 f77660b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f77661c;

        public C13373b(Action1 action1, Action1 action12) {
            Single.this = r1;
            this.f77660b = action1;
            this.f77661c = action12;
        }

        @Override // p046rx.SingleSubscriber
        public final void onError(Throwable th2) {
            try {
                this.f77660b.call(th2);
            } finally {
                unsubscribe();
            }
        }

        @Override // p046rx.SingleSubscriber
        public final void onSuccess(Object obj) {
            try {
                this.f77661c.call(obj);
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: rx.Single$c */
    /* loaded from: classes5.dex */
    public class C13374c extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ Observer f77663b;

        public C13374c(Observer observer) {
            Single.this = r1;
            this.f77663b = observer;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f77663b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f77663b.onNext(obj);
            this.f77663b.onCompleted();
        }
    }

    /* renamed from: rx.Single$d */
    /* loaded from: classes5.dex */
    public class C13375d implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77665a;

        /* renamed from: rx.Single$d$a */
        /* loaded from: classes5.dex */
        public class C13376a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ SingleSubscriber f77667a;

            /* renamed from: b */
            public final /* synthetic */ Scheduler.Worker f77668b;

            /* renamed from: rx.Single$d$a$a */
            /* loaded from: classes5.dex */
            public class C13377a extends SingleSubscriber {
                public C13377a() {
                    C13376a.this = r1;
                }

                @Override // p046rx.SingleSubscriber
                public void onError(Throwable th2) {
                    try {
                        C13376a.this.f77667a.onError(th2);
                    } finally {
                        C13376a.this.f77668b.unsubscribe();
                    }
                }

                @Override // p046rx.SingleSubscriber
                public void onSuccess(Object obj) {
                    try {
                        C13376a.this.f77667a.onSuccess(obj);
                    } finally {
                        C13376a.this.f77668b.unsubscribe();
                    }
                }
            }

            public C13376a(SingleSubscriber singleSubscriber, Scheduler.Worker worker) {
                C13375d.this = r1;
                this.f77667a = singleSubscriber;
                this.f77668b = worker;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13377a c13377a = new C13377a();
                this.f77667a.add(c13377a);
                Single.this.subscribe(c13377a);
            }
        }

        public C13375d(Scheduler scheduler) {
            Single.this = r1;
            this.f77665a = scheduler;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            Scheduler.Worker createWorker = this.f77665a.createWorker();
            singleSubscriber.add(createWorker);
            createWorker.schedule(new C13376a(singleSubscriber, createWorker));
        }
    }

    /* renamed from: rx.Single$e */
    /* loaded from: classes5.dex */
    public class C13378e implements Func0 {
        public C13378e() {
            Single.this = r1;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public Single call() {
            return Single.error(new TimeoutException());
        }
    }

    /* renamed from: rx.Single$f */
    /* loaded from: classes5.dex */
    public class C13379f implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f77672a;

        public C13379f(Action1 action1) {
            Single.this = r1;
            this.f77672a = action1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            this.f77672a.call(th2);
        }
    }

    /* renamed from: rx.Single$g */
    /* loaded from: classes5.dex */
    public class C13380g implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f77674a;

        public C13380g(Action1 action1) {
            Single.this = r1;
            this.f77674a = action1;
        }

        @Override // p046rx.functions.Action1
        public void call(Object obj) {
            this.f77674a.call(Notification.createOnNext(obj));
        }
    }

    /* renamed from: rx.Single$h */
    /* loaded from: classes5.dex */
    public class C13381h implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f77676a;

        public C13381h(Action1 action1) {
            Single.this = r1;
            this.f77676a = action1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            this.f77676a.call(Notification.createOnError(th2));
        }
    }

    /* renamed from: rx.Single$i */
    /* loaded from: classes5.dex */
    public static class C13382i implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Callable f77678a;

        public C13382i(Callable callable) {
            this.f77678a = callable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            try {
                ((Single) this.f77678a.call()).subscribe(singleSubscriber);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleSubscriber.onError(th2);
            }
        }
    }

    /* renamed from: rx.Single$j */
    /* loaded from: classes5.dex */
    public class C13383j implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77679a;

        /* renamed from: rx.Single$j$a */
        /* loaded from: classes5.dex */
        public class C13384a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ SingleSubscriber f77681b;

            public C13384a(SingleSubscriber singleSubscriber) {
                C13383j.this = r1;
                this.f77681b = singleSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f77681b.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f77681b.onSuccess(obj);
            }
        }

        /* renamed from: rx.Single$j$b */
        /* loaded from: classes5.dex */
        public class C13385b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ SingleSubscriber f77683a;

            /* renamed from: rx.Single$j$b$a */
            /* loaded from: classes5.dex */
            public class C13386a implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ Scheduler.Worker f77685a;

                public C13386a(Scheduler.Worker worker) {
                    C13385b.this = r1;
                    this.f77685a = worker;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    try {
                        C13385b.this.f77683a.unsubscribe();
                    } finally {
                        this.f77685a.unsubscribe();
                    }
                }
            }

            public C13385b(SingleSubscriber singleSubscriber) {
                C13383j.this = r1;
                this.f77683a = singleSubscriber;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                Scheduler.Worker createWorker = C13383j.this.f77679a.createWorker();
                createWorker.schedule(new C13386a(createWorker));
            }
        }

        public C13383j(Scheduler scheduler) {
            Single.this = r1;
            this.f77679a = scheduler;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            C13384a c13384a = new C13384a(singleSubscriber);
            singleSubscriber.add(Subscriptions.create(new C13385b(c13384a)));
            Single.this.subscribe(c13384a);
        }
    }

    /* renamed from: rx.Single$k */
    /* loaded from: classes5.dex */
    public static class C13387k implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Throwable f77687a;

        public C13387k(Throwable th2) {
            this.f77687a = th2;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            singleSubscriber.onError(this.f77687a);
        }
    }

    /* renamed from: rx.Single$l */
    /* loaded from: classes5.dex */
    public static class C13388l implements OnSubscribe {

        /* renamed from: rx.Single$l$a */
        /* loaded from: classes5.dex */
        public class C13389a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ SingleSubscriber f77689b;

            public C13389a(SingleSubscriber singleSubscriber) {
                C13388l.this = r1;
                this.f77689b = singleSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            /* renamed from: a */
            public void onSuccess(Single single) {
                single.subscribe(this.f77689b);
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f77689b.onError(th2);
            }
        }

        public C13388l() {
            Single.this = r1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            C13389a c13389a = new C13389a(singleSubscriber);
            singleSubscriber.add(c13389a);
            Single.this.subscribe(c13389a);
        }
    }

    /* renamed from: rx.Single$m */
    /* loaded from: classes5.dex */
    public static class C13390m implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func2 f77691a;

        public C13390m(Func2 func2) {
            this.f77691a = func2;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77691a.call(objArr[0], objArr[1]);
        }
    }

    /* renamed from: rx.Single$n */
    /* loaded from: classes5.dex */
    public static class C13391n implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func3 f77692a;

        public C13391n(Func3 func3) {
            this.f77692a = func3;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77692a.call(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* renamed from: rx.Single$o */
    /* loaded from: classes5.dex */
    public static class C13392o implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func4 f77693a;

        public C13392o(Func4 func4) {
            this.f77693a = func4;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77693a.call(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    /* renamed from: rx.Single$p */
    /* loaded from: classes5.dex */
    public static class C13393p implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func5 f77694a;

        public C13393p(Func5 func5) {
            this.f77694a = func5;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77694a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    /* renamed from: rx.Single$q */
    /* loaded from: classes5.dex */
    public static class C13394q implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func6 f77695a;

        public C13394q(Func6 func6) {
            this.f77695a = func6;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77695a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    /* renamed from: rx.Single$r */
    /* loaded from: classes5.dex */
    public static class C13395r implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func7 f77696a;

        public C13395r(Func7 func7) {
            this.f77696a = func7;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77696a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    /* renamed from: rx.Single$s */
    /* loaded from: classes5.dex */
    public static class C13396s implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ Func8 f77697a;

        public C13396s(Func8 func8) {
            this.f77697a = func8;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            return this.f77697a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
        }
    }

    public Single(OnSubscribe<T> onSubscribe) {
        this.f77658a = RxJavaHooks.onCreate(onSubscribe);
    }

    /* renamed from: a */
    public static Observable m23183a(Single single) {
        return Observable.unsafeCreate(new SingleToObservable(single.f77658a));
    }

    /* renamed from: b */
    public static Single[] m23182b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (Single[]) collection.toArray(new Single[collection.size()]);
        }
        Single[] singleArr = new Single[8];
        Iterator<T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Single single = (Single) it.next();
            if (i == singleArr.length) {
                Single[] singleArr2 = new Single[(i >> 2) + i];
                System.arraycopy(singleArr, 0, singleArr2, 0, i);
                singleArr = singleArr2;
            }
            singleArr[i] = single;
            i++;
        }
        if (singleArr.length == i) {
            return singleArr;
        }
        Single[] singleArr3 = new Single[i];
        System.arraycopy(singleArr, 0, singleArr3, 0, i);
        return singleArr3;
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.concat(m23183a(single), m23183a(single2));
    }

    public static <T> Single<T> create(OnSubscribe<T> onSubscribe) {
        return new Single<>(onSubscribe);
    }

    public static <T> Single<T> defer(Callable<Single<T>> callable) {
        return create(new C13382i(callable));
    }

    public static <T> Single<T> error(Throwable th2) {
        return create(new C13387k(th2));
    }

    public static <T> Single<T> from(Future<? extends T> future) {
        return create(new SingleFromFuture(future, 0L, null));
    }

    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        return create(new SingleFromCallable(callable));
    }

    public static <T> Single<T> fromEmitter(Action1<SingleEmitter<T>> action1) {
        if (action1 != null) {
            return create(new SingleFromEmitter(action1));
        }
        throw new NullPointerException("producer is null");
    }

    public static <T> Single<T> just(T t) {
        return ScalarSynchronousSingle.create(t);
    }

    public static <T> Single<T> merge(Single<? extends Single<? extends T>> single) {
        if (single instanceof ScalarSynchronousSingle) {
            return ((ScalarSynchronousSingle) single).scalarFlatMap(UtilityFunctions.identity());
        }
        return create(new C13388l());
    }

    public static <T> Observable<T> mergeDelayError(Observable<? extends Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1) {
        return using(func0, func1, action1, false);
    }

    public static <T1, T2, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Func2<? super T1, ? super T2, ? extends R> func2) {
        return SingleOperatorZip.zip(new Single[]{single, single2}, new C13390m(func2));
    }

    /* renamed from: c */
    public final Subscription m23181c(Subscriber subscriber, boolean z) {
        if (z) {
            try {
                subscriber.onStart();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    subscriber.onError(RxJavaHooks.onSingleError(th2));
                    return Subscriptions.unsubscribed();
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                    RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        RxJavaHooks.onSingleStart(this, this.f77658a).call(SingleLiftObservableOperator.wrap(subscriber));
        return RxJavaHooks.onSingleReturn(subscriber);
    }

    public final Single<T> cache() {
        return toObservable().cacheWithInitialCapacity(1).toSingle();
    }

    @Experimental
    public final <R> Single<R> cast(Class<R> cls) {
        return map(new SingleOperatorCast(cls));
    }

    public <R> Single<R> compose(Transformer<? super T, ? extends R> transformer) {
        return (Single) transformer.call(this);
    }

    public final Observable<T> concatWith(Single<? extends T> single) {
        return concat(this, single);
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return create(new SingleDelay(this.f77658a, j, timeUnit, scheduler));
    }

    public final Single<T> delaySubscription(Observable<?> observable) {
        observable.getClass();
        return create(new SingleOnSubscribeDelaySubscriptionOther(this, observable));
    }

    public final Single<T> doAfterTerminate(Action0 action0) {
        return create(new SingleDoAfterTerminate(this, action0));
    }

    public final Single<T> doOnEach(Action1<Notification<? extends T>> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, new C13380g(action1), new C13381h(action1)));
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final Single<T> doOnError(Action1<Throwable> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, Actions.empty(), new C13379f(action1)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    public final Single<T> doOnSubscribe(Action0 action0) {
        return create(new SingleDoOnSubscribe(this.f77658a, action0));
    }

    public final Single<T> doOnSuccess(Action1<? super T> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, action1, Actions.empty()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    public final Single<T> doOnUnsubscribe(Action0 action0) {
        return create(new SingleDoOnUnsubscribe(this.f77658a, action0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Single<R> flatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        if (this instanceof ScalarSynchronousSingle) {
            return ((ScalarSynchronousSingle) this).scalarFlatMap(func1);
        }
        return merge(map(func1));
    }

    public final Completable flatMapCompletable(Func1<? super T, ? extends Completable> func1) {
        return Completable.create(new CompletableFlatMapSingleToCompletable(this, func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> flatMapObservable(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.merge(m23183a(map(func1)));
    }

    public final <R> Single<R> lift(Observable.Operator<? extends R, ? super T> operator) {
        return create(new SingleLiftObservableOperator(this.f77658a, operator));
    }

    public final <R> Single<R> map(Func1<? super T, ? extends R> func1) {
        return create(new SingleOnSubscribeMap(this, func1));
    }

    public final Observable<T> mergeWith(Single<? extends T> single) {
        return merge(this, single);
    }

    public final Single<T> observeOn(Scheduler scheduler) {
        if (this instanceof ScalarSynchronousSingle) {
            return ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler);
        }
        if (scheduler != null) {
            return create(new SingleObserveOn(this.f77658a, scheduler));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final Single<T> onErrorResumeNext(Single<? extends T> single) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withOther(this, single));
    }

    public final Single<T> onErrorReturn(Func1<Throwable, ? extends T> func1) {
        return create(new SingleOnErrorReturn(this.f77658a, func1));
    }

    public final Single<T> retry() {
        return toObservable().retry().toSingle();
    }

    public final Single<T> retryWhen(Func1<Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return toObservable().retryWhen(func1).toSingle();
    }

    public final Subscription subscribe() {
        return subscribe(Actions.empty(), Actions.errorNotImplemented());
    }

    public final Single<T> subscribeOn(Scheduler scheduler) {
        if (this instanceof ScalarSynchronousSingle) {
            return ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler);
        }
        return create(new C13375d(scheduler));
    }

    public final Single<T> takeUntil(Completable completable) {
        return create(new SingleTakeUntilCompletable(this.f77658a, completable));
    }

    public final AssertableSubscriber<T> test() {
        AssertableSubscriberObservable create = AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe((Subscriber) create);
        return create;
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit) {
        return timeout(j, timeUnit, null, Schedulers.computation());
    }

    /* renamed from: to */
    public final <R> R m23180to(Func1<? super Single<T>, R> func1) {
        return func1.call(this);
    }

    public final BlockingSingle<T> toBlocking() {
        return BlockingSingle.from(this);
    }

    public final Completable toCompletable() {
        return Completable.fromSingle(this);
    }

    public final Observable<T> toObservable() {
        return m23183a(this);
    }

    public final Subscription unsafeSubscribe(Subscriber<? super T> subscriber) {
        return m23181c(subscriber, true);
    }

    @Experimental
    public final Single<T> unsubscribeOn(Scheduler scheduler) {
        return create(new C13383j(scheduler));
    }

    public final <T2, R> Single<R> zipWith(Single<? extends T2> single, Func2<? super T, ? super T2, ? extends R> func2) {
        return zip(this, single, func2);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3));
    }

    public static <T> Single<T> from(Future<? extends T> future, long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return create(new SingleFromFuture(future, j, timeUnit));
        }
        throw new NullPointerException("unit is null");
    }

    public static <T> Observable<T> mergeDelayError(Observable<? extends Single<? extends T>> observable, int i) {
        return (Observable<T>) observable.flatMapSingle(UtilityFunctions.identity(), true, i);
    }

    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        if (func0 != null) {
            if (func1 != null) {
                if (action1 != null) {
                    return create(new SingleOnSubscribeUsing(func0, func1, action1, z));
                }
                throw new NullPointerException("disposeAction is null");
            }
            throw new NullPointerException("singleFactory is null");
        }
        throw new NullPointerException("resourceFactory is null");
    }

    public static <T1, T2, T3, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3}, new C13391n(func3));
    }

    public final Single<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation());
    }

    public final Single<T> onErrorResumeNext(Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withFunction(this, func1));
    }

    public final Single<T> retry(long j) {
        return toObservable().retry(j).toSingle();
    }

    public final Subscription subscribe(Action1<? super T> action1) {
        return subscribe(action1, Actions.errorNotImplemented());
    }

    public final <E> Single<T> takeUntil(Observable<? extends E> observable) {
        return create(new SingleTakeUntilObservable(this.f77658a, observable));
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout(j, timeUnit, null, scheduler);
    }

    @Deprecated
    public Single(Observable.OnSubscribe<T> onSubscribe) {
        this.f77658a = RxJavaHooks.onCreate(new SingleFromObservable(onSubscribe));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4));
    }

    public static <T1, T2, T3, T4, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4}, new C13392o(func4));
    }

    public final Single<T> retry(Func2<Integer, Throwable, Boolean> func2) {
        return toObservable().retry(func2).toSingle();
    }

    public final Subscription subscribe(Action1<? super T> action1, Action1<Throwable> action12) {
        if (action1 != null) {
            if (action12 != null) {
                return subscribe(new C13373b(action12, action1));
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onSuccess can not be null");
    }

    public final <E> Single<T> takeUntil(Single<? extends E> single) {
        return create(new SingleTakeUntilSingle(this.f77658a, single));
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Single<? extends T> single) {
        return timeout(j, timeUnit, single, Schedulers.computation());
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5));
    }

    public static <T> Single<T> from(Future<? extends T> future, Scheduler scheduler) {
        return from(future).subscribeOn(scheduler);
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.merge(m23183a(single), m23183a(single2));
    }

    public static <T1, T2, T3, T4, T5, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5}, new C13393p(func5));
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Single<? extends T> single, Scheduler scheduler) {
        if (single == null) {
            single = defer(new C13378e());
        }
        return create(new SingleTimeout(this.f77658a, j, timeUnit, scheduler, single.f77658a));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6}, new C13394q(func6));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6), m23183a(single7));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7}, new C13395r(func7));
    }

    public final Subscription subscribe(Observer<? super T> observer) {
        if (observer != null) {
            return subscribe(new C13374c(observer));
        }
        throw new NullPointerException("observer is null");
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6), m23183a(single7), m23183a(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8}, new C13396s(func8));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.concat(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6), m23183a(single7), m23183a(single8), m23183a(single9));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, Single<? extends T9> single9, Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8, single9}, new C13372a(func9));
    }

    public final Subscription subscribe(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onStart();
            if (!(subscriber instanceof SafeSubscriber)) {
                return m23181c(new SafeSubscriber(subscriber), false);
            }
            return m23181c(subscriber, true);
        }
        throw new IllegalArgumentException("observer can not be null");
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6), m23183a(single7));
    }

    public static <R> Single<R> zip(Iterable<? extends Single<?>> iterable, FuncN<? extends R> funcN) {
        return SingleOperatorZip.zip(m23182b(iterable), funcN);
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6), m23183a(single7), m23183a(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.merge(m23183a(single), m23183a(single2), m23183a(single3), m23183a(single4), m23183a(single5), m23183a(single6), m23183a(single7), m23183a(single8), m23183a(single9));
    }

    public static <T> Observable<T> merge(Observable<? extends Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T> Observable<T> merge(Observable<? extends Single<? extends T>> observable, int i) {
        return (Observable<T>) observable.flatMapSingle(UtilityFunctions.identity(), false, i);
    }

    public final Subscription subscribe(SingleSubscriber<? super T> singleSubscriber) {
        if (singleSubscriber != null) {
            try {
                RxJavaHooks.onSingleStart(this, this.f77658a).call(singleSubscriber);
                return RxJavaHooks.onSingleReturn(singleSubscriber);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    singleSubscriber.onError(RxJavaHooks.onSingleError(th2));
                    return Subscriptions.empty();
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                    RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        throw new IllegalArgumentException("te is null");
    }
}
