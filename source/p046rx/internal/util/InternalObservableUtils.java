package p046rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p046rx.Notification;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.functions.Action1;
import p046rx.functions.Action2;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.internal.operators.OperatorAny;
import p046rx.observables.ConnectableObservable;

/* renamed from: rx.internal.util.InternalObservableUtils */
/* loaded from: classes7.dex */
public enum InternalObservableUtils {
    ;
    
    public static final C13764h LONG_COUNTER = new C13764h();
    public static final C13762f OBJECT_EQUALS = new C13762f();
    public static final C13773q TO_ARRAY = new C13773q();
    static final C13771o RETURNS_VOID = new C13771o();
    public static final C13763g COUNTER = new C13763g();
    static final C13761e ERROR_EXTRACTOR = new C13761e();
    public static final Action1<Throwable> ERROR_NOT_IMPLEMENTED = new Action1() { // from class: rx.internal.util.InternalObservableUtils.c
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    };
    public static final Observable.Operator<Boolean, Object> IS_EMPTY = new OperatorAny(UtilityFunctions.alwaysTrue(), true);

    /* renamed from: rx.internal.util.InternalObservableUtils$a */
    /* loaded from: classes7.dex */
    public static final class C13757a implements Func2 {

        /* renamed from: a */
        public final Action2 f79180a;

        public C13757a(Action2 action2) {
            this.f79180a = action2;
        }

        @Override // p046rx.functions.Func2
        public Object call(Object obj, Object obj2) {
            this.f79180a.call(obj, obj2);
            return obj;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$b */
    /* loaded from: classes7.dex */
    public static final class C13758b implements Func1 {

        /* renamed from: a */
        public final Object f79181a;

        public C13758b(Object obj) {
            this.f79181a = obj;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            boolean z;
            Object obj2 = this.f79181a;
            if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$d */
    /* loaded from: classes7.dex */
    public static final class C13760d implements Func1 {

        /* renamed from: a */
        public final Class f79182a;

        public C13760d(Class cls) {
            this.f79182a = cls;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f79182a.isInstance(obj));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$e */
    /* loaded from: classes7.dex */
    public static final class C13761e implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Throwable call(Notification notification) {
            return notification.getThrowable();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$f */
    /* loaded from: classes7.dex */
    public static final class C13762f implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Boolean call(Object obj, Object obj2) {
            boolean z;
            if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$g */
    /* loaded from: classes7.dex */
    public static final class C13763g implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$h */
    /* loaded from: classes7.dex */
    public static final class C13764h implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Long call(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$i */
    /* loaded from: classes7.dex */
    public static final class C13765i implements Func1 {

        /* renamed from: a */
        public final Func1 f79183a;

        public C13765i(Func1 func1) {
            this.f79183a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return (Observable) this.f79183a.call(observable.map(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$j */
    /* loaded from: classes7.dex */
    public static final class C13766j implements Func0 {

        /* renamed from: a */
        public final Observable f79184a;

        /* renamed from: b */
        public final int f79185b;

        public C13766j(Observable observable, int i) {
            this.f79184a = observable;
            this.f79185b = i;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79184a.replay(this.f79185b);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$k */
    /* loaded from: classes7.dex */
    public static final class C13767k implements Func0 {

        /* renamed from: a */
        public final TimeUnit f79186a;

        /* renamed from: b */
        public final Observable f79187b;

        /* renamed from: c */
        public final long f79188c;

        /* renamed from: d */
        public final Scheduler f79189d;

        public C13767k(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f79186a = timeUnit;
            this.f79187b = observable;
            this.f79188c = j;
            this.f79189d = scheduler;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79187b.replay(this.f79188c, this.f79186a, this.f79189d);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$l */
    /* loaded from: classes7.dex */
    public static final class C13768l implements Func0 {

        /* renamed from: a */
        public final Observable f79190a;

        public C13768l(Observable observable) {
            this.f79190a = observable;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79190a.replay();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$m */
    /* loaded from: classes7.dex */
    public static final class C13769m implements Func0 {

        /* renamed from: a */
        public final long f79191a;

        /* renamed from: b */
        public final TimeUnit f79192b;

        /* renamed from: c */
        public final Scheduler f79193c;

        /* renamed from: d */
        public final int f79194d;

        /* renamed from: e */
        public final Observable f79195e;

        public C13769m(Observable observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f79191a = j;
            this.f79192b = timeUnit;
            this.f79193c = scheduler;
            this.f79194d = i;
            this.f79195e = observable;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79195e.replay(this.f79194d, this.f79191a, this.f79192b, this.f79193c);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$n */
    /* loaded from: classes7.dex */
    public static final class C13770n implements Func1 {

        /* renamed from: a */
        public final Func1 f79196a;

        public C13770n(Func1 func1) {
            this.f79196a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return (Observable) this.f79196a.call(observable.map(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$o */
    /* loaded from: classes7.dex */
    public static final class C13771o implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Void call(Object obj) {
            return null;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$p */
    /* loaded from: classes7.dex */
    public static final class C13772p implements Func1 {

        /* renamed from: a */
        public final Func1 f79197a;

        /* renamed from: b */
        public final Scheduler f79198b;

        public C13772p(Func1 func1, Scheduler scheduler) {
            this.f79197a = func1;
            this.f79198b = scheduler;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return ((Observable) this.f79197a.call(observable)).observeOn(this.f79198b);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$q */
    /* loaded from: classes7.dex */
    public static final class C13773q implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable[] call(List list) {
            return (Observable[]) list.toArray(new Observable[list.size()]);
        }
    }

    public static <T, R> Func2<R, T, R> createCollectorCaller(Action2<R, ? super T> action2) {
        return new C13757a(action2);
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRepeatDematerializer(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        return new C13765i(func1);
    }

    public static <T, R> Func1<Observable<T>, Observable<R>> createReplaySelectorAndObserveOn(Func1<? super Observable<T>, ? extends Observable<R>> func1, Scheduler scheduler) {
        return new C13772p(func1, scheduler);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable) {
        return new C13768l(observable);
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRetryDematerializer(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return new C13770n(func1);
    }

    public static Func1<Object, Boolean> equalsWith(Object obj) {
        return new C13758b(obj);
    }

    public static Func1<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C13760d(cls);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, int i) {
        return new C13766j(observable, i);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new C13767k(observable, j, timeUnit, scheduler);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new C13769m(observable, i, j, timeUnit, scheduler);
    }
}
