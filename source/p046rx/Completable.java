package p046rx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Single;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Actions;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.internal.observers.AssertableSubscriberObservable;
import p046rx.internal.operators.CompletableFromEmitter;
import p046rx.internal.operators.CompletableOnSubscribeConcat;
import p046rx.internal.operators.CompletableOnSubscribeConcatArray;
import p046rx.internal.operators.CompletableOnSubscribeConcatIterable;
import p046rx.internal.operators.CompletableOnSubscribeMerge;
import p046rx.internal.operators.CompletableOnSubscribeMergeArray;
import p046rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray;
import p046rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable;
import p046rx.internal.operators.CompletableOnSubscribeMergeIterable;
import p046rx.internal.operators.CompletableOnSubscribeTimeout;
import p046rx.internal.util.SubscriptionList;
import p046rx.internal.util.UtilityFunctions;
import p046rx.observers.AssertableSubscriber;
import p046rx.observers.SafeCompletableSubscriber;
import p046rx.observers.SafeSubscriber;
import p046rx.plugins.RxJavaHooks;
import p046rx.schedulers.Schedulers;
import p046rx.subscriptions.BooleanSubscription;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.MultipleAssignmentSubscription;
import p046rx.subscriptions.SerialSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.Completable */
/* loaded from: classes5.dex */
public class Completable {

    /* renamed from: b */
    public static final Completable f77519b = new Completable(new C13348k(), false);

    /* renamed from: c */
    public static final Completable f77520c = new Completable(new C13365v(), false);

    /* renamed from: a */
    public final OnSubscribe f77521a;

    /* renamed from: rx.Completable$A */
    /* loaded from: classes5.dex */
    public class C13314A implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func0 f77522a;

        /* renamed from: rx.Completable$A$a */
        /* loaded from: classes5.dex */
        public class C13315a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ SingleSubscriber f77524a;

            public C13315a(SingleSubscriber singleSubscriber) {
                this.f77524a = singleSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                try {
                    Object call = C13314A.this.f77522a.call();
                    if (call == null) {
                        this.f77524a.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f77524a.onSuccess(call);
                    }
                } catch (Throwable th2) {
                    this.f77524a.onError(th2);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                this.f77524a.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77524a.add(subscription);
            }
        }

        public C13314A(Func0 func0) {
            this.f77522a = func0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            Completable.this.unsafeSubscribe(new C13315a(singleSubscriber));
        }
    }

    /* renamed from: rx.Completable$B */
    /* loaded from: classes5.dex */
    public class C13316B implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ Object f77526a;

        public C13316B(Object obj) {
            this.f77526a = obj;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return this.f77526a;
        }
    }

    /* renamed from: rx.Completable$C */
    /* loaded from: classes5.dex */
    public class C13317C implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77528a;

        /* renamed from: rx.Completable$C$a */
        /* loaded from: classes5.dex */
        public class C13318a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77530a;

            /* renamed from: rx.Completable$C$a$a */
            /* loaded from: classes5.dex */
            public class C13319a implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ Subscription f77532a;

                /* renamed from: rx.Completable$C$a$a$a */
                /* loaded from: classes5.dex */
                public class C13320a implements Action0 {

                    /* renamed from: a */
                    public final /* synthetic */ Scheduler.Worker f77534a;

                    public C13320a(Scheduler.Worker worker) {
                        this.f77534a = worker;
                    }

                    @Override // p046rx.functions.Action0
                    public void call() {
                        try {
                            C13319a.this.f77532a.unsubscribe();
                        } finally {
                            this.f77534a.unsubscribe();
                        }
                    }
                }

                public C13319a(Subscription subscription) {
                    this.f77532a = subscription;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    Scheduler.Worker createWorker = C13317C.this.f77528a.createWorker();
                    createWorker.schedule(new C13320a(createWorker));
                }
            }

            public C13318a(CompletableSubscriber completableSubscriber) {
                this.f77530a = completableSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                this.f77530a.onCompleted();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                this.f77530a.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77530a.onSubscribe(Subscriptions.create(new C13319a(subscription)));
            }
        }

        public C13317C(Scheduler scheduler) {
            this.f77528a = scheduler;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new C13318a(completableSubscriber));
        }
    }

    /* renamed from: rx.Completable$D */
    /* loaded from: classes5.dex */
    public static class C13321D implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Iterable f77536a;

        /* renamed from: rx.Completable$D$a */
        /* loaded from: classes5.dex */
        public class C13322a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ AtomicBoolean f77537a;

            /* renamed from: b */
            public final /* synthetic */ CompositeSubscription f77538b;

            /* renamed from: c */
            public final /* synthetic */ CompletableSubscriber f77539c;

            public C13322a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
                this.f77537a = atomicBoolean;
                this.f77538b = compositeSubscription;
                this.f77539c = completableSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                if (this.f77537a.compareAndSet(false, true)) {
                    this.f77538b.unsubscribe();
                    this.f77539c.onCompleted();
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (this.f77537a.compareAndSet(false, true)) {
                    this.f77538b.unsubscribe();
                    this.f77539c.onError(th2);
                    return;
                }
                RxJavaHooks.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77538b.add(subscription);
            }
        }

        public C13321D(Iterable iterable) {
            this.f77536a = iterable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            completableSubscriber.onSubscribe(compositeSubscription);
            try {
                Iterator it = this.f77536a.iterator();
                if (it == null) {
                    completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                C13322a c13322a = new C13322a(atomicBoolean, compositeSubscription, completableSubscriber);
                boolean z = true;
                while (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                    try {
                        if (!it.hasNext()) {
                            if (z) {
                                completableSubscriber.onCompleted();
                                return;
                            }
                            return;
                        } else if (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                            try {
                                Completable completable = (Completable) it.next();
                                if (completable == null) {
                                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        compositeSubscription.unsubscribe();
                                        completableSubscriber.onError(nullPointerException);
                                        return;
                                    }
                                    RxJavaHooks.onError(nullPointerException);
                                    return;
                                } else if (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                                    completable.unsafeSubscribe(c13322a);
                                    z = false;
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                if (atomicBoolean.compareAndSet(false, true)) {
                                    compositeSubscription.unsubscribe();
                                    completableSubscriber.onError(th2);
                                    return;
                                }
                                RxJavaHooks.onError(th2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            compositeSubscription.unsubscribe();
                            completableSubscriber.onError(th3);
                            return;
                        }
                        RxJavaHooks.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                completableSubscriber.onError(th4);
            }
        }
    }

    /* renamed from: rx.Completable$E */
    /* loaded from: classes5.dex */
    public static class C13323E implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func0 f77541a;

        public C13323E(Func0 func0) {
            this.f77541a = func0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            try {
                Completable completable = (Completable) this.f77541a.call();
                if (completable == null) {
                    completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                    completableSubscriber.onError(new NullPointerException("The completable returned is null"));
                    return;
                }
                completable.unsafeSubscribe(completableSubscriber);
            } catch (Throwable th2) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(th2);
            }
        }
    }

    /* renamed from: rx.Completable$F */
    /* loaded from: classes5.dex */
    public static class C13324F implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func0 f77542a;

        public C13324F(Func0 func0) {
            this.f77542a = func0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            try {
                th = (Throwable) this.f77542a.call();
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                th = new NullPointerException("The error supplied is null");
            }
            completableSubscriber.onError(th);
        }
    }

    /* renamed from: rx.Completable$G */
    /* loaded from: classes5.dex */
    public static class C13325G implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Throwable f77543a;

        public C13325G(Throwable th2) {
            this.f77543a = th2;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onError(this.f77543a);
        }
    }

    /* renamed from: rx.Completable$H */
    /* loaded from: classes5.dex */
    public static class C13326H implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Action0 f77544a;

        public C13326H(Action0 action0) {
            this.f77544a = action0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            BooleanSubscription booleanSubscription = new BooleanSubscription();
            completableSubscriber.onSubscribe(booleanSubscription);
            try {
                this.f77544a.call();
                if (!booleanSubscription.isUnsubscribed()) {
                    completableSubscriber.onCompleted();
                }
            } catch (Throwable th2) {
                if (!booleanSubscription.isUnsubscribed()) {
                    completableSubscriber.onError(th2);
                }
            }
        }
    }

    /* renamed from: rx.Completable$I */
    /* loaded from: classes5.dex */
    public static class C13327I implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Callable f77545a;

        public C13327I(Callable callable) {
            this.f77545a = callable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            BooleanSubscription booleanSubscription = new BooleanSubscription();
            completableSubscriber.onSubscribe(booleanSubscription);
            try {
                this.f77545a.call();
                if (!booleanSubscription.isUnsubscribed()) {
                    completableSubscriber.onCompleted();
                }
            } catch (Throwable th2) {
                if (!booleanSubscription.isUnsubscribed()) {
                    completableSubscriber.onError(th2);
                }
            }
        }
    }

    /* renamed from: rx.Completable$OnSubscribe */
    /* loaded from: classes5.dex */
    public interface OnSubscribe extends Action1<CompletableSubscriber> {
    }

    /* renamed from: rx.Completable$Operator */
    /* loaded from: classes5.dex */
    public interface Operator extends Func1<CompletableSubscriber, CompletableSubscriber> {
    }

    /* renamed from: rx.Completable$Transformer */
    /* loaded from: classes5.dex */
    public interface Transformer extends Func1<Completable, Completable> {
    }

    /* renamed from: rx.Completable$a */
    /* loaded from: classes5.dex */
    public static class C13328a implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Observable f77546a;

        /* renamed from: rx.Completable$a$a */
        /* loaded from: classes5.dex */
        public class C13329a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77547a;

            public C13329a(CompletableSubscriber completableSubscriber) {
                this.f77547a = completableSubscriber;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f77547a.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f77547a.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
            }
        }

        public C13328a(Observable observable) {
            this.f77546a = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            C13329a c13329a = new C13329a(completableSubscriber);
            completableSubscriber.onSubscribe(c13329a);
            this.f77546a.unsafeSubscribe(c13329a);
        }
    }

    /* renamed from: rx.Completable$b */
    /* loaded from: classes5.dex */
    public static class C13330b implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Single f77549a;

        /* renamed from: rx.Completable$b$a */
        /* loaded from: classes5.dex */
        public class C13331a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ CompletableSubscriber f77550b;

            public C13331a(CompletableSubscriber completableSubscriber) {
                this.f77550b = completableSubscriber;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                this.f77550b.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f77550b.onCompleted();
            }
        }

        public C13330b(Single single) {
            this.f77549a = single;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            C13331a c13331a = new C13331a(completableSubscriber);
            completableSubscriber.onSubscribe(c13331a);
            this.f77549a.subscribe(c13331a);
        }
    }

    /* renamed from: rx.Completable$c */
    /* loaded from: classes5.dex */
    public static class C13332c implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77552a;

        /* renamed from: b */
        public final /* synthetic */ long f77553b;

        /* renamed from: c */
        public final /* synthetic */ TimeUnit f77554c;

        /* renamed from: rx.Completable$c$a */
        /* loaded from: classes5.dex */
        public class C13333a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77555a;

            /* renamed from: b */
            public final /* synthetic */ Scheduler.Worker f77556b;

            public C13333a(CompletableSubscriber completableSubscriber, Scheduler.Worker worker) {
                this.f77555a = completableSubscriber;
                this.f77556b = worker;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                try {
                    this.f77555a.onCompleted();
                } finally {
                    this.f77556b.unsubscribe();
                }
            }
        }

        public C13332c(Scheduler scheduler, long j, TimeUnit timeUnit) {
            this.f77552a = scheduler;
            this.f77553b = j;
            this.f77554c = timeUnit;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
            completableSubscriber.onSubscribe(multipleAssignmentSubscription);
            if (!multipleAssignmentSubscription.isUnsubscribed()) {
                Scheduler.Worker createWorker = this.f77552a.createWorker();
                multipleAssignmentSubscription.set(createWorker);
                createWorker.schedule(new C13333a(completableSubscriber, createWorker), this.f77553b, this.f77554c);
            }
        }
    }

    /* renamed from: rx.Completable$d */
    /* loaded from: classes5.dex */
    public static class C13334d implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func0 f77558a;

        /* renamed from: b */
        public final /* synthetic */ Func1 f77559b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f77560c;

        /* renamed from: d */
        public final /* synthetic */ boolean f77561d;

        /* renamed from: rx.Completable$d$a */
        /* loaded from: classes5.dex */
        public class C13335a implements CompletableSubscriber {

            /* renamed from: a */
            public Subscription f77562a;

            /* renamed from: b */
            public final /* synthetic */ AtomicBoolean f77563b;

            /* renamed from: c */
            public final /* synthetic */ Object f77564c;

            /* renamed from: d */
            public final /* synthetic */ CompletableSubscriber f77565d;

            /* renamed from: rx.Completable$d$a$a */
            /* loaded from: classes5.dex */
            public class C13336a implements Action0 {
                public C13336a() {
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    C13335a.this.m23201a();
                }
            }

            public C13335a(AtomicBoolean atomicBoolean, Object obj, CompletableSubscriber completableSubscriber) {
                this.f77563b = atomicBoolean;
                this.f77564c = obj;
                this.f77565d = completableSubscriber;
            }

            /* renamed from: a */
            public void m23201a() {
                this.f77562a.unsubscribe();
                if (this.f77563b.compareAndSet(false, true)) {
                    try {
                        C13334d.this.f77560c.call(this.f77564c);
                    } catch (Throwable th2) {
                        RxJavaHooks.onError(th2);
                    }
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                if (C13334d.this.f77561d && this.f77563b.compareAndSet(false, true)) {
                    try {
                        C13334d.this.f77560c.call(this.f77564c);
                    } catch (Throwable th2) {
                        this.f77565d.onError(th2);
                        return;
                    }
                }
                this.f77565d.onCompleted();
                if (!C13334d.this.f77561d) {
                    m23201a();
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (C13334d.this.f77561d && this.f77563b.compareAndSet(false, true)) {
                    try {
                        C13334d.this.f77560c.call(this.f77564c);
                    } catch (Throwable th3) {
                        th2 = new CompositeException(Arrays.asList(th2, th3));
                    }
                }
                this.f77565d.onError(th2);
                if (!C13334d.this.f77561d) {
                    m23201a();
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77562a = subscription;
                this.f77565d.onSubscribe(Subscriptions.create(new C13336a()));
            }
        }

        public C13334d(Func0 func0, Func1 func1, Action1 action1, boolean z) {
            this.f77558a = func0;
            this.f77559b = func1;
            this.f77560c = action1;
            this.f77561d = z;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            try {
                Object call = this.f77558a.call();
                try {
                    Completable completable = (Completable) this.f77559b.call(call);
                    if (completable == null) {
                        try {
                            this.f77560c.call(call);
                            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                            completableSubscriber.onError(new NullPointerException("The completable supplied is null"));
                            return;
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                            completableSubscriber.onError(new CompositeException(Arrays.asList(new NullPointerException("The completable supplied is null"), th2)));
                            return;
                        }
                    }
                    completable.unsafeSubscribe(new C13335a(new AtomicBoolean(), call, completableSubscriber));
                } catch (Throwable th3) {
                    try {
                        this.f77560c.call(call);
                        Exceptions.throwIfFatal(th3);
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(th3);
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th3);
                        Exceptions.throwIfFatal(th4);
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(new CompositeException(Arrays.asList(th3, th4)));
                    }
                }
            } catch (Throwable th5) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(th5);
            }
        }
    }

    /* renamed from: rx.Completable$e */
    /* loaded from: classes5.dex */
    public class C13337e implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77568a;

        /* renamed from: b */
        public final /* synthetic */ Throwable[] f77569b;

        public C13337e(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f77568a = countDownLatch;
            this.f77569b = thArr;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77568a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77569b[0] = th2;
            this.f77568a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* renamed from: rx.Completable$f */
    /* loaded from: classes5.dex */
    public class C13338f implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77571a;

        /* renamed from: b */
        public final /* synthetic */ Throwable[] f77572b;

        public C13338f(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f77571a = countDownLatch;
            this.f77572b = thArr;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77571a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77572b[0] = th2;
            this.f77571a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* renamed from: rx.Completable$g */
    /* loaded from: classes5.dex */
    public class C13339g implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77574a;

        /* renamed from: b */
        public final /* synthetic */ long f77575b;

        /* renamed from: c */
        public final /* synthetic */ TimeUnit f77576c;

        /* renamed from: d */
        public final /* synthetic */ boolean f77577d;

        /* renamed from: rx.Completable$g$a */
        /* loaded from: classes5.dex */
        public class C13340a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ CompositeSubscription f77579a;

            /* renamed from: b */
            public final /* synthetic */ Scheduler.Worker f77580b;

            /* renamed from: c */
            public final /* synthetic */ CompletableSubscriber f77581c;

            /* renamed from: rx.Completable$g$a$a */
            /* loaded from: classes5.dex */
            public class C13341a implements Action0 {
                public C13341a() {
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    try {
                        C13340a.this.f77581c.onCompleted();
                    } finally {
                        C13340a.this.f77580b.unsubscribe();
                    }
                }
            }

            /* renamed from: rx.Completable$g$a$b */
            /* loaded from: classes5.dex */
            public class C13342b implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ Throwable f77584a;

                public C13342b(Throwable th2) {
                    this.f77584a = th2;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    try {
                        C13340a.this.f77581c.onError(this.f77584a);
                    } finally {
                        C13340a.this.f77580b.unsubscribe();
                    }
                }
            }

            public C13340a(CompositeSubscription compositeSubscription, Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
                this.f77579a = compositeSubscription;
                this.f77580b = worker;
                this.f77581c = completableSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                CompositeSubscription compositeSubscription = this.f77579a;
                Scheduler.Worker worker = this.f77580b;
                C13341a c13341a = new C13341a();
                C13339g c13339g = C13339g.this;
                compositeSubscription.add(worker.schedule(c13341a, c13339g.f77575b, c13339g.f77576c));
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (C13339g.this.f77577d) {
                    CompositeSubscription compositeSubscription = this.f77579a;
                    Scheduler.Worker worker = this.f77580b;
                    C13342b c13342b = new C13342b(th2);
                    C13339g c13339g = C13339g.this;
                    compositeSubscription.add(worker.schedule(c13342b, c13339g.f77575b, c13339g.f77576c));
                    return;
                }
                this.f77581c.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77579a.add(subscription);
                this.f77581c.onSubscribe(this.f77579a);
            }
        }

        public C13339g(Scheduler scheduler, long j, TimeUnit timeUnit, boolean z) {
            this.f77574a = scheduler;
            this.f77575b = j;
            this.f77576c = timeUnit;
            this.f77577d = z;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            Scheduler.Worker createWorker = this.f77574a.createWorker();
            compositeSubscription.add(createWorker);
            Completable.this.unsafeSubscribe(new C13340a(compositeSubscription, createWorker, completableSubscriber));
        }
    }

    /* renamed from: rx.Completable$h */
    /* loaded from: classes5.dex */
    public class C13343h implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f77586a;

        public C13343h(Action1 action1) {
            this.f77586a = action1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            this.f77586a.call(Notification.createOnError(th2));
        }
    }

    /* renamed from: rx.Completable$i */
    /* loaded from: classes5.dex */
    public class C13344i implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f77588a;

        public C13344i(Action1 action1) {
            this.f77588a = action1;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f77588a.call(Notification.createOnCompleted());
        }
    }

    /* renamed from: rx.Completable$j */
    /* loaded from: classes5.dex */
    public class C13345j implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Action0 f77590a;

        /* renamed from: b */
        public final /* synthetic */ Action0 f77591b;

        /* renamed from: c */
        public final /* synthetic */ Action1 f77592c;

        /* renamed from: d */
        public final /* synthetic */ Action1 f77593d;

        /* renamed from: e */
        public final /* synthetic */ Action0 f77594e;

        /* renamed from: rx.Completable$j$a */
        /* loaded from: classes5.dex */
        public class C13346a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77596a;

            /* renamed from: rx.Completable$j$a$a */
            /* loaded from: classes5.dex */
            public class C13347a implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ Subscription f77598a;

                public C13347a(Subscription subscription) {
                    this.f77598a = subscription;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    try {
                        C13345j.this.f77594e.call();
                    } catch (Throwable th2) {
                        RxJavaHooks.onError(th2);
                    }
                    this.f77598a.unsubscribe();
                }
            }

            public C13346a(CompletableSubscriber completableSubscriber) {
                this.f77596a = completableSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                try {
                    C13345j.this.f77590a.call();
                    this.f77596a.onCompleted();
                    try {
                        C13345j.this.f77591b.call();
                    } catch (Throwable th2) {
                        RxJavaHooks.onError(th2);
                    }
                } catch (Throwable th3) {
                    this.f77596a.onError(th3);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                try {
                    C13345j.this.f77592c.call(th2);
                } catch (Throwable th3) {
                    th2 = new CompositeException(Arrays.asList(th2, th3));
                }
                this.f77596a.onError(th2);
                try {
                    C13345j.this.f77591b.call();
                } catch (Throwable th4) {
                    RxJavaHooks.onError(th4);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                try {
                    C13345j.this.f77593d.call(subscription);
                    this.f77596a.onSubscribe(Subscriptions.create(new C13347a(subscription)));
                } catch (Throwable th2) {
                    subscription.unsubscribe();
                    this.f77596a.onSubscribe(Subscriptions.unsubscribed());
                    this.f77596a.onError(th2);
                }
            }
        }

        public C13345j(Action0 action0, Action0 action02, Action1 action1, Action1 action12, Action0 action03) {
            this.f77590a = action0;
            this.f77591b = action02;
            this.f77592c = action1;
            this.f77593d = action12;
            this.f77594e = action03;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new C13346a(completableSubscriber));
        }
    }

    /* renamed from: rx.Completable$k */
    /* loaded from: classes5.dex */
    public static class C13348k implements OnSubscribe {
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onCompleted();
        }
    }

    /* renamed from: rx.Completable$l */
    /* loaded from: classes5.dex */
    public class C13349l implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action0 f77600a;

        public C13349l(Action0 action0) {
            this.f77600a = action0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            this.f77600a.call();
        }
    }

    /* renamed from: rx.Completable$m */
    /* loaded from: classes5.dex */
    public class C13350m implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77602a;

        /* renamed from: b */
        public final /* synthetic */ Throwable[] f77603b;

        public C13350m(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f77602a = countDownLatch;
            this.f77603b = thArr;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77602a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77603b[0] = th2;
            this.f77602a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* renamed from: rx.Completable$n */
    /* loaded from: classes5.dex */
    public class C13351n implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f77605a;

        /* renamed from: b */
        public final /* synthetic */ Throwable[] f77606b;

        public C13351n(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f77605a = countDownLatch;
            this.f77606b = thArr;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77605a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77606b[0] = th2;
            this.f77605a.countDown();
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* renamed from: rx.Completable$o */
    /* loaded from: classes5.dex */
    public class C13352o implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Operator f77608a;

        public C13352o(Operator operator) {
            this.f77608a = operator;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            try {
                Completable.this.unsafeSubscribe(RxJavaHooks.onCompletableLift(this.f77608a).call(completableSubscriber));
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                throw Completable.m23216c(th2);
            }
        }
    }

    /* renamed from: rx.Completable$p */
    /* loaded from: classes5.dex */
    public class C13353p implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77610a;

        /* renamed from: rx.Completable$p$a */
        /* loaded from: classes5.dex */
        public class C13354a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ Scheduler.Worker f77612a;

            /* renamed from: b */
            public final /* synthetic */ CompletableSubscriber f77613b;

            /* renamed from: c */
            public final /* synthetic */ SubscriptionList f77614c;

            /* renamed from: rx.Completable$p$a$a */
            /* loaded from: classes5.dex */
            public class C13355a implements Action0 {
                public C13355a() {
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    try {
                        C13354a.this.f77613b.onCompleted();
                    } finally {
                        C13354a.this.f77614c.unsubscribe();
                    }
                }
            }

            /* renamed from: rx.Completable$p$a$b */
            /* loaded from: classes5.dex */
            public class C13356b implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ Throwable f77617a;

                public C13356b(Throwable th2) {
                    this.f77617a = th2;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    try {
                        C13354a.this.f77613b.onError(this.f77617a);
                    } finally {
                        C13354a.this.f77614c.unsubscribe();
                    }
                }
            }

            public C13354a(Scheduler.Worker worker, CompletableSubscriber completableSubscriber, SubscriptionList subscriptionList) {
                this.f77612a = worker;
                this.f77613b = completableSubscriber;
                this.f77614c = subscriptionList;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                this.f77612a.schedule(new C13355a());
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                this.f77612a.schedule(new C13356b(th2));
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77614c.add(subscription);
            }
        }

        public C13353p(Scheduler scheduler) {
            this.f77610a = scheduler;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            SubscriptionList subscriptionList = new SubscriptionList();
            Scheduler.Worker createWorker = this.f77610a.createWorker();
            subscriptionList.add(createWorker);
            completableSubscriber.onSubscribe(subscriptionList);
            Completable.this.unsafeSubscribe(new C13354a(createWorker, completableSubscriber, subscriptionList));
        }
    }

    /* renamed from: rx.Completable$q */
    /* loaded from: classes5.dex */
    public class C13357q implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func1 f77619a;

        /* renamed from: rx.Completable$q$a */
        /* loaded from: classes5.dex */
        public class C13358a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77621a;

            public C13358a(CompletableSubscriber completableSubscriber) {
                this.f77621a = completableSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                this.f77621a.onCompleted();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                boolean z = false;
                try {
                    z = ((Boolean) C13357q.this.f77619a.call(th2)).booleanValue();
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(Arrays.asList(th2, th3));
                }
                if (z) {
                    this.f77621a.onCompleted();
                } else {
                    this.f77621a.onError(th2);
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77621a.onSubscribe(subscription);
            }
        }

        public C13357q(Func1 func1) {
            this.f77619a = func1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new C13358a(completableSubscriber));
        }
    }

    /* renamed from: rx.Completable$r */
    /* loaded from: classes5.dex */
    public class C13359r implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func1 f77623a;

        /* renamed from: rx.Completable$r$a */
        /* loaded from: classes5.dex */
        public class C13360a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77625a;

            /* renamed from: b */
            public final /* synthetic */ SerialSubscription f77626b;

            /* renamed from: rx.Completable$r$a$a */
            /* loaded from: classes5.dex */
            public class C13361a implements CompletableSubscriber {
                public C13361a() {
                }

                @Override // p046rx.CompletableSubscriber
                public void onCompleted() {
                    C13360a.this.f77625a.onCompleted();
                }

                @Override // p046rx.CompletableSubscriber
                public void onError(Throwable th2) {
                    C13360a.this.f77625a.onError(th2);
                }

                @Override // p046rx.CompletableSubscriber
                public void onSubscribe(Subscription subscription) {
                    C13360a.this.f77626b.set(subscription);
                }
            }

            public C13360a(CompletableSubscriber completableSubscriber, SerialSubscription serialSubscription) {
                this.f77625a = completableSubscriber;
                this.f77626b = serialSubscription;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                this.f77625a.onCompleted();
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                try {
                    Completable completable = (Completable) C13359r.this.f77623a.call(th2);
                    if (completable == null) {
                        this.f77625a.onError(new CompositeException(Arrays.asList(th2, new NullPointerException("The completable returned is null"))));
                    } else {
                        completable.unsafeSubscribe(new C13361a());
                    }
                } catch (Throwable th3) {
                    this.f77625a.onError(new CompositeException(Arrays.asList(th2, th3)));
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77626b.set(subscription);
            }
        }

        public C13359r(Func1 func1) {
            this.f77623a = func1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            SerialSubscription serialSubscription = new SerialSubscription();
            completableSubscriber.onSubscribe(serialSubscription);
            Completable.this.unsafeSubscribe(new C13360a(completableSubscriber, serialSubscription));
        }
    }

    /* renamed from: rx.Completable$s */
    /* loaded from: classes5.dex */
    public class C13362s implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ MultipleAssignmentSubscription f77629a;

        public C13362s(MultipleAssignmentSubscription multipleAssignmentSubscription) {
            this.f77629a = multipleAssignmentSubscription;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77629a.unsubscribe();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            RxJavaHooks.onError(th2);
            this.f77629a.unsubscribe();
            Completable.m23218a(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77629a.set(subscription);
        }
    }

    /* renamed from: rx.Completable$t */
    /* loaded from: classes5.dex */
    public class C13363t implements CompletableSubscriber {

        /* renamed from: a */
        public boolean f77631a;

        /* renamed from: b */
        public final /* synthetic */ Action0 f77632b;

        /* renamed from: c */
        public final /* synthetic */ MultipleAssignmentSubscription f77633c;

        public C13363t(Action0 action0, MultipleAssignmentSubscription multipleAssignmentSubscription) {
            this.f77632b = action0;
            this.f77633c = multipleAssignmentSubscription;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (!this.f77631a) {
                this.f77631a = true;
                try {
                    this.f77632b.call();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            RxJavaHooks.onError(th2);
            this.f77633c.unsubscribe();
            Completable.m23218a(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77633c.set(subscription);
        }
    }

    /* renamed from: rx.Completable$u */
    /* loaded from: classes5.dex */
    public class C13364u implements CompletableSubscriber {

        /* renamed from: a */
        public boolean f77635a;

        /* renamed from: b */
        public final /* synthetic */ Action0 f77636b;

        /* renamed from: c */
        public final /* synthetic */ MultipleAssignmentSubscription f77637c;

        /* renamed from: d */
        public final /* synthetic */ Action1 f77638d;

        public C13364u(Action0 action0, MultipleAssignmentSubscription multipleAssignmentSubscription, Action1 action1) {
            this.f77636b = action0;
            this.f77637c = multipleAssignmentSubscription;
            this.f77638d = action1;
        }

        /* renamed from: a */
        public void m23191a(Throwable th2) {
            try {
                this.f77638d.call(th2);
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            if (!this.f77635a) {
                this.f77635a = true;
                try {
                    this.f77636b.call();
                    this.f77637c.unsubscribe();
                } catch (Throwable th2) {
                    m23191a(th2);
                }
            }
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            if (!this.f77635a) {
                this.f77635a = true;
                m23191a(th2);
                return;
            }
            RxJavaHooks.onError(th2);
            Completable.m23218a(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77637c.set(subscription);
        }
    }

    /* renamed from: rx.Completable$v */
    /* loaded from: classes5.dex */
    public static class C13365v implements OnSubscribe {
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
        }
    }

    /* renamed from: rx.Completable$w */
    /* loaded from: classes5.dex */
    public static class C13366w implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Completable[] f77640a;

        /* renamed from: rx.Completable$w$a */
        /* loaded from: classes5.dex */
        public class C13367a implements CompletableSubscriber {

            /* renamed from: a */
            public final /* synthetic */ AtomicBoolean f77641a;

            /* renamed from: b */
            public final /* synthetic */ CompositeSubscription f77642b;

            /* renamed from: c */
            public final /* synthetic */ CompletableSubscriber f77643c;

            public C13367a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
                this.f77641a = atomicBoolean;
                this.f77642b = compositeSubscription;
                this.f77643c = completableSubscriber;
            }

            @Override // p046rx.CompletableSubscriber
            public void onCompleted() {
                if (this.f77641a.compareAndSet(false, true)) {
                    this.f77642b.unsubscribe();
                    this.f77643c.onCompleted();
                }
            }

            @Override // p046rx.CompletableSubscriber
            public void onError(Throwable th2) {
                if (this.f77641a.compareAndSet(false, true)) {
                    this.f77642b.unsubscribe();
                    this.f77643c.onError(th2);
                    return;
                }
                RxJavaHooks.onError(th2);
            }

            @Override // p046rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.f77642b.add(subscription);
            }
        }

        public C13366w(Completable[] completableArr) {
            this.f77640a = completableArr;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable[] completableArr;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            completableSubscriber.onSubscribe(compositeSubscription);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            C13367a c13367a = new C13367a(atomicBoolean, compositeSubscription, completableSubscriber);
            for (Completable completable : this.f77640a) {
                if (compositeSubscription.isUnsubscribed()) {
                    return;
                }
                if (completable == null) {
                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                    if (atomicBoolean.compareAndSet(false, true)) {
                        compositeSubscription.unsubscribe();
                        completableSubscriber.onError(nullPointerException);
                        return;
                    }
                    RxJavaHooks.onError(nullPointerException);
                    return;
                } else if (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                    completable.unsafeSubscribe(c13367a);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: rx.Completable$x */
    /* loaded from: classes5.dex */
    public class C13368x implements CompletableSubscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f77645a;

        public C13368x(Subscriber subscriber) {
            this.f77645a = subscriber;
        }

        @Override // p046rx.CompletableSubscriber
        public void onCompleted() {
            this.f77645a.onCompleted();
        }

        @Override // p046rx.CompletableSubscriber
        public void onError(Throwable th2) {
            this.f77645a.onError(th2);
        }

        @Override // p046rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.f77645a.add(subscription);
        }
    }

    /* renamed from: rx.Completable$y */
    /* loaded from: classes5.dex */
    public class C13369y implements OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f77647a;

        /* renamed from: rx.Completable$y$a */
        /* loaded from: classes5.dex */
        public class C13370a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ CompletableSubscriber f77649a;

            /* renamed from: b */
            public final /* synthetic */ Scheduler.Worker f77650b;

            public C13370a(CompletableSubscriber completableSubscriber, Scheduler.Worker worker) {
                this.f77649a = completableSubscriber;
                this.f77650b = worker;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                try {
                    Completable.this.unsafeSubscribe(this.f77649a);
                } finally {
                    this.f77650b.unsubscribe();
                }
            }
        }

        public C13369y(Scheduler scheduler) {
            this.f77647a = scheduler;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(CompletableSubscriber completableSubscriber) {
            Scheduler.Worker createWorker = this.f77647a.createWorker();
            createWorker.schedule(new C13370a(completableSubscriber, createWorker));
        }
    }

    /* renamed from: rx.Completable$z */
    /* loaded from: classes5.dex */
    public class C13371z implements Observable.OnSubscribe {
        public C13371z() {
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            Completable.this.unsafeSubscribe(subscriber);
        }
    }

    public Completable(OnSubscribe onSubscribe) {
        this.f77521a = RxJavaHooks.onCreate(onSubscribe);
    }

    /* renamed from: a */
    public static void m23218a(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    public static Completable amb(Completable... completableArr) {
        m23217b(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return create(new C13366w(completableArr));
    }

    /* renamed from: b */
    public static Object m23217b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static NullPointerException m23216c(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static Completable complete() {
        Completable completable = f77519b;
        OnSubscribe onCreate = RxJavaHooks.onCreate(completable.f77521a);
        if (onCreate == completable.f77521a) {
            return completable;
        }
        return new Completable(onCreate, false);
    }

    public static Completable concat(Completable... completableArr) {
        m23217b(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return create(new CompletableOnSubscribeConcatArray(completableArr));
    }

    public static Completable create(OnSubscribe onSubscribe) {
        m23217b(onSubscribe);
        try {
            return new Completable(onSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            RxJavaHooks.onError(th2);
            throw m23216c(th2);
        }
    }

    public static Completable defer(Func0<? extends Completable> func0) {
        m23217b(func0);
        return create(new C13323E(func0));
    }

    public static Completable error(Func0<? extends Throwable> func0) {
        m23217b(func0);
        return create(new C13324F(func0));
    }

    public static Completable fromAction(Action0 action0) {
        m23217b(action0);
        return create(new C13326H(action0));
    }

    public static Completable fromCallable(Callable<?> callable) {
        m23217b(callable);
        return create(new C13327I(callable));
    }

    public static Completable fromEmitter(Action1<CompletableEmitter> action1) {
        return create(new CompletableFromEmitter(action1));
    }

    public static Completable fromFuture(Future<?> future) {
        m23217b(future);
        return fromObservable(Observable.from(future));
    }

    public static Completable fromObservable(Observable<?> observable) {
        m23217b(observable);
        return create(new C13328a(observable));
    }

    public static Completable fromSingle(Single<?> single) {
        m23217b(single);
        return create(new C13330b(single));
    }

    public static Completable merge(Completable... completableArr) {
        m23217b(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return create(new CompletableOnSubscribeMergeArray(completableArr));
    }

    public static Completable merge0(Observable<? extends Completable> observable, int i, boolean z) {
        m23217b(observable);
        if (i >= 1) {
            return create(new CompletableOnSubscribeMerge(observable, i, z));
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
    }

    public static Completable mergeDelayError(Completable... completableArr) {
        m23217b(completableArr);
        return create(new CompletableOnSubscribeMergeDelayErrorArray(completableArr));
    }

    public static Completable never() {
        Completable completable = f77520c;
        OnSubscribe onCreate = RxJavaHooks.onCreate(completable.f77521a);
        if (onCreate == completable.f77521a) {
            return completable;
        }
        return new Completable(onCreate, false);
    }

    public static Completable timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.computation());
    }

    public static <R> Completable using(Func0<R> func0, Func1<? super R, ? extends Completable> func1, Action1<? super R> action1) {
        return using(func0, func1, action1, true);
    }

    public final Completable ambWith(Completable completable) {
        m23217b(completable);
        return amb(this, completable);
    }

    public final <T> Observable<T> andThen(Observable<T> observable) {
        m23217b(observable);
        return observable.delaySubscription(toObservable());
    }

    public final void await() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new C13337e(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            Throwable th2 = thArr[0];
            if (th2 != null) {
                Exceptions.propagate(th2);
                return;
            }
            return;
        }
        try {
            countDownLatch.await();
            Throwable th3 = thArr[0];
            if (th3 != null) {
                Exceptions.propagate(th3);
            }
        } catch (InterruptedException e) {
            throw Exceptions.propagate(e);
        }
    }

    public final Completable compose(Transformer transformer) {
        return (Completable) m23214to(transformer);
    }

    public final Completable concatWith(Completable completable) {
        m23217b(completable);
        return concat(this, completable);
    }

    /* renamed from: d */
    public final void m23215d(Subscriber subscriber, boolean z) {
        m23217b(subscriber);
        if (z) {
            try {
                subscriber.onStart();
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                Throwable onObservableError = RxJavaHooks.onObservableError(th2);
                RxJavaHooks.onError(onObservableError);
                throw m23216c(onObservableError);
            }
        }
        unsafeSubscribe(new C13368x(subscriber));
        RxJavaHooks.onObservableReturn(subscriber);
    }

    public final Completable delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.computation(), false);
    }

    public final Completable doAfterTerminate(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), Actions.empty(), action0, Actions.empty());
    }

    public final Completable doOnCompleted(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), action0, Actions.empty(), Actions.empty());
    }

    public final Completable doOnEach(Action1<Notification<Object>> action1) {
        if (action1 != null) {
            return doOnLifecycle(Actions.empty(), new C13343h(action1), new C13344i(action1), Actions.empty(), Actions.empty());
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final Completable doOnError(Action1<? super Throwable> action1) {
        return doOnLifecycle(Actions.empty(), action1, Actions.empty(), Actions.empty(), Actions.empty());
    }

    public final Completable doOnLifecycle(Action1<? super Subscription> action1, Action1<? super Throwable> action12, Action0 action0, Action0 action02, Action0 action03) {
        m23217b(action1);
        m23217b(action12);
        m23217b(action0);
        m23217b(action02);
        m23217b(action03);
        return create(new C13345j(action0, action02, action12, action1, action03));
    }

    public final Completable doOnSubscribe(Action1<? super Subscription> action1) {
        return doOnLifecycle(action1, Actions.empty(), Actions.empty(), Actions.empty(), Actions.empty());
    }

    public final Completable doOnTerminate(Action0 action0) {
        return doOnLifecycle(Actions.empty(), new C13349l(action0), action0, Actions.empty(), Actions.empty());
    }

    public final Completable doOnUnsubscribe(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), Actions.empty(), Actions.empty(), action0);
    }

    public final Throwable get() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new C13350m(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (InterruptedException e) {
            throw Exceptions.propagate(e);
        }
    }

    public final Completable lift(Operator operator) {
        m23217b(operator);
        return create(new C13352o(operator));
    }

    public final Completable mergeWith(Completable completable) {
        m23217b(completable);
        return merge(this, completable);
    }

    public final Completable observeOn(Scheduler scheduler) {
        m23217b(scheduler);
        return create(new C13353p(scheduler));
    }

    public final Completable onErrorComplete() {
        return onErrorComplete(UtilityFunctions.alwaysTrue());
    }

    public final Completable onErrorResumeNext(Func1<? super Throwable, ? extends Completable> func1) {
        m23217b(func1);
        return create(new C13359r(func1));
    }

    public final Completable repeat() {
        return fromObservable(toObservable().repeat());
    }

    public final Completable repeatWhen(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        m23217b(func1);
        return fromObservable(toObservable().repeatWhen(func1));
    }

    public final Completable retry() {
        return fromObservable(toObservable().retry());
    }

    public final Completable retryWhen(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return fromObservable(toObservable().retryWhen(func1));
    }

    public final Completable startWith(Completable completable) {
        m23217b(completable);
        return concat(completable, this);
    }

    public final Subscription subscribe() {
        MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new C13362s(multipleAssignmentSubscription));
        return multipleAssignmentSubscription;
    }

    public final Completable subscribeOn(Scheduler scheduler) {
        m23217b(scheduler);
        return create(new C13369y(scheduler));
    }

    public final AssertableSubscriber<Void> test() {
        AssertableSubscriberObservable create = AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe(create);
        return create;
    }

    public final Completable timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, Schedulers.computation(), null);
    }

    public final Completable timeout0(long j, TimeUnit timeUnit, Scheduler scheduler, Completable completable) {
        m23217b(timeUnit);
        m23217b(scheduler);
        return create(new CompletableOnSubscribeTimeout(this, j, timeUnit, scheduler, completable));
    }

    /* renamed from: to */
    public final <R> R m23214to(Func1<? super Completable, R> func1) {
        return func1.call(this);
    }

    public final <T> Observable<T> toObservable() {
        return Observable.unsafeCreate(new C13371z());
    }

    public final <T> Single<T> toSingle(Func0<? extends T> func0) {
        m23217b(func0);
        return Single.create(new C13314A(func0));
    }

    public final <T> Single<T> toSingleDefault(T t) {
        m23217b(t);
        return toSingle(new C13316B(t));
    }

    public final void unsafeSubscribe(CompletableSubscriber completableSubscriber) {
        m23217b(completableSubscriber);
        try {
            RxJavaHooks.onCompletableStart(this, this.f77521a).call(completableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            Throwable onCompletableError = RxJavaHooks.onCompletableError(th2);
            RxJavaHooks.onError(onCompletableError);
            throw m23216c(onCompletableError);
        }
    }

    public final Completable unsubscribeOn(Scheduler scheduler) {
        m23217b(scheduler);
        return create(new C13317C(scheduler));
    }

    public static Completable timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        m23217b(timeUnit);
        m23217b(scheduler);
        return create(new C13332c(scheduler, j, timeUnit));
    }

    public static <R> Completable using(Func0<R> func0, Func1<? super R, ? extends Completable> func1, Action1<? super R> action1, boolean z) {
        m23217b(func0);
        m23217b(func1);
        m23217b(action1);
        return create(new C13334d(func0, func1, action1, z));
    }

    public final Completable delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    public final Completable onErrorComplete(Func1<? super Throwable, Boolean> func1) {
        m23217b(func1);
        return create(new C13357q(func1));
    }

    public final Completable repeat(long j) {
        return fromObservable(toObservable().repeat(j));
    }

    public final Completable retry(Func2<Integer, Throwable, Boolean> func2) {
        return fromObservable(toObservable().retry(func2));
    }

    public final Completable timeout(long j, TimeUnit timeUnit, Completable completable) {
        m23217b(completable);
        return timeout0(j, timeUnit, Schedulers.computation(), completable);
    }

    public Completable(OnSubscribe onSubscribe, boolean z) {
        this.f77521a = z ? RxJavaHooks.onCreate(onSubscribe) : onSubscribe;
    }

    public static Completable error(Throwable th2) {
        m23217b(th2);
        return create(new C13325G(th2));
    }

    public static Completable mergeDelayError(Iterable<? extends Completable> iterable) {
        m23217b(iterable);
        return create(new CompletableOnSubscribeMergeDelayErrorIterable(iterable));
    }

    public final <T> Single<T> andThen(Single<T> single) {
        m23217b(single);
        return single.delaySubscription(toObservable());
    }

    public final Completable delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        m23217b(timeUnit);
        m23217b(scheduler);
        return create(new C13339g(scheduler, j, timeUnit, z));
    }

    public final Completable retry(long j) {
        return fromObservable(toObservable().retry(j));
    }

    public final <T> Observable<T> startWith(Observable<T> observable) {
        m23217b(observable);
        return toObservable().startWith((Observable) observable);
    }

    public final Subscription subscribe(Action0 action0) {
        m23217b(action0);
        MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new C13363t(action0, multipleAssignmentSubscription));
        return multipleAssignmentSubscription;
    }

    public final Completable timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    public static Completable mergeDelayError(Observable<? extends Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, true);
    }

    public final Completable andThen(Completable completable) {
        return concatWith(completable);
    }

    public final Completable timeout(long j, TimeUnit timeUnit, Scheduler scheduler, Completable completable) {
        m23217b(completable);
        return timeout0(j, timeUnit, scheduler, completable);
    }

    public static Completable mergeDelayError(Observable<? extends Completable> observable, int i) {
        return merge0(observable, i, true);
    }

    public final Subscription subscribe(Action0 action0, Action1<? super Throwable> action1) {
        m23217b(action0);
        m23217b(action1);
        MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new C13364u(action0, multipleAssignmentSubscription, action1));
        return multipleAssignmentSubscription;
    }

    public static Completable amb(Iterable<? extends Completable> iterable) {
        m23217b(iterable);
        return create(new C13321D(iterable));
    }

    public static Completable concat(Iterable<? extends Completable> iterable) {
        m23217b(iterable);
        return create(new CompletableOnSubscribeConcatIterable(iterable));
    }

    public static Completable merge(Iterable<? extends Completable> iterable) {
        m23217b(iterable);
        return create(new CompletableOnSubscribeMergeIterable(iterable));
    }

    public static Completable concat(Observable<? extends Completable> observable) {
        return concat(observable, 2);
    }

    public static Completable merge(Observable<? extends Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, false);
    }

    public final Throwable get(long j, TimeUnit timeUnit) {
        m23217b(timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new C13351n(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            if (countDownLatch.await(j, timeUnit)) {
                return thArr[0];
            }
            Exceptions.propagate(new TimeoutException());
            return null;
        } catch (InterruptedException e) {
            throw Exceptions.propagate(e);
        }
    }

    public final <T> void unsafeSubscribe(Subscriber<T> subscriber) {
        m23215d(subscriber, true);
    }

    public static Completable concat(Observable<? extends Completable> observable, int i) {
        m23217b(observable);
        if (i >= 1) {
            return create(new CompletableOnSubscribeConcat(observable, i));
        }
        throw new IllegalArgumentException("prefetch > 0 required but it was " + i);
    }

    public static Completable merge(Observable<? extends Completable> observable, int i) {
        return merge0(observable, i, false);
    }

    public final void subscribe(CompletableSubscriber completableSubscriber) {
        if (!(completableSubscriber instanceof SafeCompletableSubscriber)) {
            completableSubscriber = new SafeCompletableSubscriber(completableSubscriber);
        }
        unsafeSubscribe(completableSubscriber);
    }

    public final boolean await(long j, TimeUnit timeUnit) {
        Throwable th2;
        m23217b(timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new C13338f(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            Throwable th3 = thArr[0];
            if (th3 != null) {
                Exceptions.propagate(th3);
            }
            return true;
        }
        try {
            boolean await = countDownLatch.await(j, timeUnit);
            if (await && (th2 = thArr[0]) != null) {
                Exceptions.propagate(th2);
            }
            return await;
        } catch (InterruptedException e) {
            throw Exceptions.propagate(e);
        }
    }

    public final <T> void subscribe(Subscriber<T> subscriber) {
        subscriber.onStart();
        if (!(subscriber instanceof SafeSubscriber)) {
            subscriber = new SafeSubscriber(subscriber);
        }
        m23215d(subscriber, false);
    }
}
