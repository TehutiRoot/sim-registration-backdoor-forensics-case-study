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
    
    public static final C13765h LONG_COUNTER = new C13765h();
    public static final C13763f OBJECT_EQUALS = new C13763f();
    public static final C13774q TO_ARRAY = new C13774q();
    static final C13772o RETURNS_VOID = new C13772o();
    public static final C13764g COUNTER = new C13764g();
    static final C13762e ERROR_EXTRACTOR = new C13762e();
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
    public static final class C13758a implements Func2 {

        /* renamed from: a */
        public final Action2 f79386a;

        public C13758a(Action2 action2) {
            this.f79386a = action2;
        }

        @Override // p046rx.functions.Func2
        public Object call(Object obj, Object obj2) {
            this.f79386a.call(obj, obj2);
            return obj;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$b */
    /* loaded from: classes7.dex */
    public static final class C13759b implements Func1 {

        /* renamed from: a */
        public final Object f79387a;

        public C13759b(Object obj) {
            this.f79387a = obj;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            boolean z;
            Object obj2 = this.f79387a;
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
    public static final class C13761d implements Func1 {

        /* renamed from: a */
        public final Class f79388a;

        public C13761d(Class cls) {
            this.f79388a = cls;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.f79388a.isInstance(obj));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$e */
    /* loaded from: classes7.dex */
    public static final class C13762e implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Throwable call(Notification notification) {
            return notification.getThrowable();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$f */
    /* loaded from: classes7.dex */
    public static final class C13763f implements Func2 {
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
    public static final class C13764g implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$h */
    /* loaded from: classes7.dex */
    public static final class C13765h implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Long call(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$i */
    /* loaded from: classes7.dex */
    public static final class C13766i implements Func1 {

        /* renamed from: a */
        public final Func1 f79389a;

        public C13766i(Func1 func1) {
            this.f79389a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return (Observable) this.f79389a.call(observable.map(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$j */
    /* loaded from: classes7.dex */
    public static final class C13767j implements Func0 {

        /* renamed from: a */
        public final Observable f79390a;

        /* renamed from: b */
        public final int f79391b;

        public C13767j(Observable observable, int i) {
            this.f79390a = observable;
            this.f79391b = i;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79390a.replay(this.f79391b);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$k */
    /* loaded from: classes7.dex */
    public static final class C13768k implements Func0 {

        /* renamed from: a */
        public final TimeUnit f79392a;

        /* renamed from: b */
        public final Observable f79393b;

        /* renamed from: c */
        public final long f79394c;

        /* renamed from: d */
        public final Scheduler f79395d;

        public C13768k(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f79392a = timeUnit;
            this.f79393b = observable;
            this.f79394c = j;
            this.f79395d = scheduler;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79393b.replay(this.f79394c, this.f79392a, this.f79395d);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$l */
    /* loaded from: classes7.dex */
    public static final class C13769l implements Func0 {

        /* renamed from: a */
        public final Observable f79396a;

        public C13769l(Observable observable) {
            this.f79396a = observable;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79396a.replay();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$m */
    /* loaded from: classes7.dex */
    public static final class C13770m implements Func0 {

        /* renamed from: a */
        public final long f79397a;

        /* renamed from: b */
        public final TimeUnit f79398b;

        /* renamed from: c */
        public final Scheduler f79399c;

        /* renamed from: d */
        public final int f79400d;

        /* renamed from: e */
        public final Observable f79401e;

        public C13770m(Observable observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.f79397a = j;
            this.f79398b = timeUnit;
            this.f79399c = scheduler;
            this.f79400d = i;
            this.f79401e = observable;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        /* renamed from: a */
        public ConnectableObservable call() {
            return this.f79401e.replay(this.f79400d, this.f79397a, this.f79398b, this.f79399c);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$n */
    /* loaded from: classes7.dex */
    public static final class C13771n implements Func1 {

        /* renamed from: a */
        public final Func1 f79402a;

        public C13771n(Func1 func1) {
            this.f79402a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return (Observable) this.f79402a.call(observable.map(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$o */
    /* loaded from: classes7.dex */
    public static final class C13772o implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Void call(Object obj) {
            return null;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$p */
    /* loaded from: classes7.dex */
    public static final class C13773p implements Func1 {

        /* renamed from: a */
        public final Func1 f79403a;

        /* renamed from: b */
        public final Scheduler f79404b;

        public C13773p(Func1 func1, Scheduler scheduler) {
            this.f79403a = func1;
            this.f79404b = scheduler;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return ((Observable) this.f79403a.call(observable)).observeOn(this.f79404b);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$q */
    /* loaded from: classes7.dex */
    public static final class C13774q implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable[] call(List list) {
            return (Observable[]) list.toArray(new Observable[list.size()]);
        }
    }

    public static <T, R> Func2<R, T, R> createCollectorCaller(Action2<R, ? super T> action2) {
        return new C13758a(action2);
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRepeatDematerializer(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        return new C13766i(func1);
    }

    public static <T, R> Func1<Observable<T>, Observable<R>> createReplaySelectorAndObserveOn(Func1<? super Observable<T>, ? extends Observable<R>> func1, Scheduler scheduler) {
        return new C13773p(func1, scheduler);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable) {
        return new C13769l(observable);
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRetryDematerializer(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return new C13771n(func1);
    }

    public static Func1<Object, Boolean> equalsWith(Object obj) {
        return new C13759b(obj);
    }

    public static Func1<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C13761d(cls);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, int i) {
        return new C13767j(observable, i);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new C13768k(observable, j, timeUnit, scheduler);
    }

    public static <T> Func0<ConnectableObservable<T>> createReplaySupplier(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return new C13770m(observable, i, j, timeUnit, scheduler);
    }
}