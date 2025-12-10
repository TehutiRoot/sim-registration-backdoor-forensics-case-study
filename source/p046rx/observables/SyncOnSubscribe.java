package p046rx.observables;

import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Action2;
import p046rx.functions.Func0;
import p046rx.functions.Func2;
import p046rx.internal.operators.BackpressureUtils;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.observables.SyncOnSubscribe */
/* loaded from: classes7.dex */
public abstract class SyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {

    /* renamed from: rx.observables.SyncOnSubscribe$SubscriptionProducer */
    /* loaded from: classes7.dex */
    public static final class SubscriptionProducer<S, T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        private static final long serialVersionUID = -3736864024352728072L;
        private final Subscriber<? super T> actualSubscriber;
        private boolean hasTerminated;
        private boolean onNextCalled;
        private final SyncOnSubscribe<S, T> parent;
        private S state;

        public SubscriptionProducer(Subscriber<? super T> subscriber, SyncOnSubscribe<S, T> syncOnSubscribe, S s) {
            this.actualSubscriber = subscriber;
            this.parent = syncOnSubscribe;
            this.state = s;
        }

        private void doUnsubscribe() {
            try {
                this.parent.onUnsubscribe(this.state);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaHooks.onError(th2);
            }
        }

        private void fastPath() {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            Subscriber<? super T> subscriber = this.actualSubscriber;
            do {
                try {
                    this.onNextCalled = false;
                    nextIteration(syncOnSubscribe);
                } catch (Throwable th2) {
                    handleThrownError(subscriber, th2);
                    return;
                }
            } while (!tryUnsubscribe());
        }

        private void handleThrownError(Subscriber<? super T> subscriber, Throwable th2) {
            if (this.hasTerminated) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.hasTerminated = true;
            subscriber.onError(th2);
            unsubscribe();
        }

        private void nextIteration(SyncOnSubscribe<S, T> syncOnSubscribe) {
            this.state = syncOnSubscribe.next(this.state, this);
        }

        private void slowPath(long j) {
            SyncOnSubscribe<S, T> syncOnSubscribe = this.parent;
            Subscriber<? super T> subscriber = this.actualSubscriber;
            do {
                long j2 = j;
                do {
                    try {
                        this.onNextCalled = false;
                        nextIteration(syncOnSubscribe);
                        if (tryUnsubscribe()) {
                            return;
                        }
                        if (this.onNextCalled) {
                            j2--;
                        }
                    } catch (Throwable th2) {
                        handleThrownError(subscriber, th2);
                        return;
                    }
                } while (j2 != 0);
                j = addAndGet(-j);
            } while (j > 0);
            tryUnsubscribe();
        }

        private boolean tryUnsubscribe() {
            if (!this.hasTerminated && get() >= -1) {
                return false;
            }
            set(-1L);
            doUnsubscribe();
            return true;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            if (get() < 0) {
                return true;
            }
            return false;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.hasTerminated) {
                this.hasTerminated = true;
                if (!this.actualSubscriber.isUnsubscribed()) {
                    this.actualSubscriber.onCompleted();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.hasTerminated) {
                this.hasTerminated = true;
                if (!this.actualSubscriber.isUnsubscribed()) {
                    this.actualSubscriber.onError(th2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            if (!this.onNextCalled) {
                this.onNextCalled = true;
                this.actualSubscriber.onNext(t);
                return;
            }
            throw new IllegalStateException("onNext called multiple times!");
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j > 0 && BackpressureUtils.getAndAddRequest(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            long j;
            do {
                j = get();
                if (compareAndSet(0L, -1L)) {
                    doUnsubscribe();
                    return;
                }
            } while (!compareAndSet(j, -2L));
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$a */
    /* loaded from: classes7.dex */
    public static class C13819a implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f79348a;

        public C13819a(Action2 action2) {
            this.f79348a = action2;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Object call(Object obj, Observer observer) {
            this.f79348a.call(obj, observer);
            return obj;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$b */
    /* loaded from: classes7.dex */
    public static class C13820b implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f79349a;

        public C13820b(Action2 action2) {
            this.f79349a = action2;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Object call(Object obj, Observer observer) {
            this.f79349a.call(obj, observer);
            return obj;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$c */
    /* loaded from: classes7.dex */
    public static class C13821c implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79350a;

        public C13821c(Action1 action1) {
            this.f79350a = action1;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Void call(Void r2, Observer observer) {
            this.f79350a.call(observer);
            return r2;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$d */
    /* loaded from: classes7.dex */
    public static class C13822d implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f79351a;

        public C13822d(Action1 action1) {
            this.f79351a = action1;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Void call(Void r1, Observer observer) {
            this.f79351a.call(observer);
            return null;
        }
    }

    /* renamed from: rx.observables.SyncOnSubscribe$e */
    /* loaded from: classes7.dex */
    public static class C13823e implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action0 f79352a;

        public C13823e(Action0 action0) {
            this.f79352a = action0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Void r1) {
            this.f79352a.call();
        }
    }

    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action2<? super S, ? super Observer<? super T>> action2) {
        return new C13824f(func0, new C13819a(action2));
    }

    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2, Action1<? super S> action1) {
        return new C13824f(func0, func2, action1);
    }

    public static <T> SyncOnSubscribe<Void, T> createStateless(Action1<? super Observer<? super T>> action1) {
        return new C13824f(new C13821c(action1));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public abstract S generateState();

    public abstract S next(S s, Observer<? super T> observer);

    public void onUnsubscribe(S s) {
    }

    public static <S, T> SyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func2<? super S, ? super Observer<? super T>, ? extends S> func2) {
        return new C13824f(func0, func2);
    }

    public final void call(Subscriber<? super T> subscriber) {
        try {
            SubscriptionProducer subscriptionProducer = new SubscriptionProducer(subscriber, this, generateState());
            subscriber.add(subscriptionProducer);
            subscriber.setProducer(subscriptionProducer);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }

    public static <S, T> SyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action2<? super S, ? super Observer<? super T>> action2, Action1<? super S> action1) {
        return new C13824f(func0, new C13820b(action2), action1);
    }

    public static <T> SyncOnSubscribe<Void, T> createStateless(Action1<? super Observer<? super T>> action1, Action0 action0) {
        return new C13824f(new C13822d(action1), new C13823e(action0));
    }

    /* renamed from: rx.observables.SyncOnSubscribe$f */
    /* loaded from: classes7.dex */
    public static final class C13824f extends SyncOnSubscribe {

        /* renamed from: a */
        public final Func0 f79353a;

        /* renamed from: b */
        public final Func2 f79354b;

        /* renamed from: c */
        public final Action1 f79355c;

        public C13824f(Func0 func0, Func2 func2, Action1 action1) {
            this.f79353a = func0;
            this.f79354b = func2;
            this.f79355c = action1;
        }

        @Override // p046rx.observables.SyncOnSubscribe, p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) ((Subscriber) obj));
        }

        @Override // p046rx.observables.SyncOnSubscribe
        public Object generateState() {
            Func0 func0 = this.f79353a;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // p046rx.observables.SyncOnSubscribe
        public Object next(Object obj, Observer observer) {
            return this.f79354b.call(obj, observer);
        }

        @Override // p046rx.observables.SyncOnSubscribe
        public void onUnsubscribe(Object obj) {
            Action1 action1 = this.f79355c;
            if (action1 != null) {
                action1.call(obj);
            }
        }

        public C13824f(Func0 func0, Func2 func2) {
            this(func0, func2, null);
        }

        public C13824f(Func2 func2, Action1 action1) {
            this(null, func2, action1);
        }

        public C13824f(Func2 func2) {
            this(null, func2, null);
        }
    }
}
