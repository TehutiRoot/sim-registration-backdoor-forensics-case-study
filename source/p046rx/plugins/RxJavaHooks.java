package p046rx.plugins;

import java.io.PrintStream;
import java.util.concurrent.ScheduledExecutorService;
import p046rx.Completable;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Single;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.internal.operators.OnSubscribeOnAssembly;
import p046rx.internal.operators.OnSubscribeOnAssemblyCompletable;
import p046rx.internal.operators.OnSubscribeOnAssemblySingle;
import p046rx.internal.operators.SingleFromObservable;
import p046rx.internal.operators.SingleToObservable;

/* renamed from: rx.plugins.RxJavaHooks */
/* loaded from: classes7.dex */
public final class RxJavaHooks {

    /* renamed from: a */
    public static volatile boolean f79398a;

    /* renamed from: b */
    public static volatile Action1 f79399b;

    /* renamed from: c */
    public static volatile Func1 f79400c;

    /* renamed from: d */
    public static volatile Func1 f79401d;

    /* renamed from: e */
    public static volatile Func1 f79402e;

    /* renamed from: f */
    public static volatile Func2 f79403f;

    /* renamed from: g */
    public static volatile Func2 f79404g;

    /* renamed from: h */
    public static volatile Func2 f79405h;

    /* renamed from: i */
    public static volatile Func1 f79406i;

    /* renamed from: j */
    public static volatile Func1 f79407j;

    /* renamed from: k */
    public static volatile Func1 f79408k;

    /* renamed from: l */
    public static volatile Func1 f79409l;

    /* renamed from: m */
    public static volatile Func1 f79410m;

    /* renamed from: n */
    public static volatile Func1 f79411n;

    /* renamed from: o */
    public static volatile Func0 f79412o;

    /* renamed from: p */
    public static volatile Func1 f79413p;

    /* renamed from: q */
    public static volatile Func1 f79414q;

    /* renamed from: r */
    public static volatile Func1 f79415r;

    /* renamed from: s */
    public static volatile Func1 f79416s;

    /* renamed from: t */
    public static volatile Func1 f79417t;

    /* renamed from: u */
    public static volatile Func1 f79418u;

    /* renamed from: rx.plugins.RxJavaHooks$a */
    /* loaded from: classes7.dex */
    public static class C13838a implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Throwable call(Throwable th2) {
            return RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeError(th2);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$b */
    /* loaded from: classes7.dex */
    public static class C13839b implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable.Operator call(Observable.Operator operator) {
            return RxJavaPlugins.getInstance().getSingleExecutionHook().onLift(operator);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$c */
    /* loaded from: classes7.dex */
    public static class C13840c implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Throwable call(Throwable th2) {
            return RxJavaPlugins.getInstance().getCompletableExecutionHook().onSubscribeError(th2);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$d */
    /* loaded from: classes7.dex */
    public static class C13841d implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable.Operator call(Completable.Operator operator) {
            return RxJavaPlugins.getInstance().getCompletableExecutionHook().onLift(operator);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$e */
    /* loaded from: classes7.dex */
    public static class C13842e implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable.OnSubscribe call(Observable.OnSubscribe onSubscribe) {
            return RxJavaPlugins.getInstance().getObservableExecutionHook().onCreate(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$f */
    /* loaded from: classes7.dex */
    public static class C13843f implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Single.OnSubscribe call(Single.OnSubscribe onSubscribe) {
            return RxJavaPlugins.getInstance().getSingleExecutionHook().onCreate(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$g */
    /* loaded from: classes7.dex */
    public static class C13844g implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable.OnSubscribe call(Completable.OnSubscribe onSubscribe) {
            return RxJavaPlugins.getInstance().getCompletableExecutionHook().onCreate(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$h */
    /* loaded from: classes7.dex */
    public static class C13845h implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable.OnSubscribe call(Observable.OnSubscribe onSubscribe) {
            return new OnSubscribeOnAssembly(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$i */
    /* loaded from: classes7.dex */
    public static class C13846i implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Single.OnSubscribe call(Single.OnSubscribe onSubscribe) {
            return new OnSubscribeOnAssemblySingle(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$j */
    /* loaded from: classes7.dex */
    public static class C13847j implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Completable.OnSubscribe call(Completable.OnSubscribe onSubscribe) {
            return new OnSubscribeOnAssemblyCompletable(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$k */
    /* loaded from: classes7.dex */
    public static class C13848k implements Action1 {
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Throwable th2) {
            RxJavaPlugins.getInstance().getErrorHandler().handleError(th2);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$l */
    /* loaded from: classes7.dex */
    public static class C13849l implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Observable.OnSubscribe call(Observable observable, Observable.OnSubscribe onSubscribe) {
            return RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeStart(observable, onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$m */
    /* loaded from: classes7.dex */
    public static class C13850m implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscription call(Subscription subscription) {
            return RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeReturn(subscription);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$n */
    /* loaded from: classes7.dex */
    public static class C13851n implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Single.OnSubscribe call(Single single, Single.OnSubscribe onSubscribe) {
            RxJavaSingleExecutionHook singleExecutionHook = RxJavaPlugins.getInstance().getSingleExecutionHook();
            if (singleExecutionHook == CB1.m68820a()) {
                return onSubscribe;
            }
            return new SingleFromObservable(singleExecutionHook.onSubscribeStart(single, new SingleToObservable(onSubscribe)));
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$o */
    /* loaded from: classes7.dex */
    public static class C13852o implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscription call(Subscription subscription) {
            return RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeReturn(subscription);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$p */
    /* loaded from: classes7.dex */
    public static class C13853p implements Func2 {
        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Completable.OnSubscribe call(Completable completable, Completable.OnSubscribe onSubscribe) {
            return RxJavaPlugins.getInstance().getCompletableExecutionHook().onSubscribeStart(completable, onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$q */
    /* loaded from: classes7.dex */
    public static class C13854q implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Action0 call(Action0 action0) {
            return RxJavaPlugins.getInstance().getSchedulersHook().onSchedule(action0);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$r */
    /* loaded from: classes7.dex */
    public static class C13855r implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Throwable call(Throwable th2) {
            return RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeError(th2);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$s */
    /* loaded from: classes7.dex */
    public static class C13856s implements Func1 {
        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable.Operator call(Observable.Operator operator) {
            return RxJavaPlugins.getInstance().getObservableExecutionHook().onLift(operator);
        }
    }

    static {
        m22782a();
    }

    /* renamed from: a */
    public static void m22782a() {
        f79399b = new C13848k();
        f79403f = new C13849l();
        f79410m = new C13850m();
        f79404g = new C13851n();
        f79411n = new C13852o();
        f79405h = new C13853p();
        f79409l = new C13854q();
        f79413p = new C13855r();
        f79416s = new C13856s();
        f79414q = new C13838a();
        f79417t = new C13839b();
        f79415r = new C13840c();
        f79418u = new C13841d();
        m22781b();
    }

    /* renamed from: b */
    public static void m22781b() {
        f79400c = new C13842e();
        f79401d = new C13843f();
        f79402e = new C13844g();
    }

    /* renamed from: c */
    public static void m22780c(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    public static void clear() {
        if (f79398a) {
            return;
        }
        f79399b = null;
        f79400c = null;
        f79403f = null;
        f79410m = null;
        f79413p = null;
        f79416s = null;
        f79401d = null;
        f79404g = null;
        f79411n = null;
        f79414q = null;
        f79417t = null;
        f79402e = null;
        f79405h = null;
        f79415r = null;
        f79418u = null;
        f79406i = null;
        f79407j = null;
        f79408k = null;
        f79409l = null;
        f79412o = null;
    }

    public static void clearAssemblyTracking() {
        if (f79398a) {
            return;
        }
        f79400c = null;
        f79401d = null;
        f79402e = null;
    }

    public static void enableAssemblyTracking() {
        if (f79398a) {
            return;
        }
        f79400c = new C13845h();
        f79401d = new C13846i();
        f79402e = new C13847j();
    }

    public static Func1<Completable.OnSubscribe, Completable.OnSubscribe> getOnCompletableCreate() {
        return f79402e;
    }

    public static Func1<Completable.Operator, Completable.Operator> getOnCompletableLift() {
        return f79418u;
    }

    public static Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe> getOnCompletableStart() {
        return f79405h;
    }

    public static Func1<Throwable, Throwable> getOnCompletableSubscribeError() {
        return f79415r;
    }

    public static Func1<Scheduler, Scheduler> getOnComputationScheduler() {
        return f79406i;
    }

    public static Action1<Throwable> getOnError() {
        return f79399b;
    }

    public static Func0<? extends ScheduledExecutorService> getOnGenericScheduledExecutorService() {
        return f79412o;
    }

    public static Func1<Scheduler, Scheduler> getOnIOScheduler() {
        return f79407j;
    }

    public static Func1<Scheduler, Scheduler> getOnNewThreadScheduler() {
        return f79408k;
    }

    public static Func1<Observable.OnSubscribe, Observable.OnSubscribe> getOnObservableCreate() {
        return f79400c;
    }

    public static Func1<Observable.Operator, Observable.Operator> getOnObservableLift() {
        return f79416s;
    }

    public static Func1<Subscription, Subscription> getOnObservableReturn() {
        return f79410m;
    }

    public static Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe> getOnObservableStart() {
        return f79403f;
    }

    public static Func1<Throwable, Throwable> getOnObservableSubscribeError() {
        return f79413p;
    }

    public static Func1<Action0, Action0> getOnScheduleAction() {
        return f79409l;
    }

    public static Func1<Single.OnSubscribe, Single.OnSubscribe> getOnSingleCreate() {
        return f79401d;
    }

    public static Func1<Observable.Operator, Observable.Operator> getOnSingleLift() {
        return f79417t;
    }

    public static Func1<Subscription, Subscription> getOnSingleReturn() {
        return f79411n;
    }

    public static Func2<Single, Single.OnSubscribe, Single.OnSubscribe> getOnSingleStart() {
        return f79404g;
    }

    public static Func1<Throwable, Throwable> getOnSingleSubscribeError() {
        return f79414q;
    }

    public static boolean isLockdown() {
        return f79398a;
    }

    public static void lockdown() {
        f79398a = true;
    }

    public static Throwable onCompletableError(Throwable th2) {
        Func1 func1 = f79415r;
        if (func1 != null) {
            return (Throwable) func1.call(th2);
        }
        return th2;
    }

    public static <T, R> Completable.Operator onCompletableLift(Completable.Operator operator) {
        Func1 func1 = f79418u;
        if (func1 != null) {
            return (Completable.Operator) func1.call(operator);
        }
        return operator;
    }

    public static <T> Completable.OnSubscribe onCompletableStart(Completable completable, Completable.OnSubscribe onSubscribe) {
        Func2 func2 = f79405h;
        if (func2 != null) {
            return (Completable.OnSubscribe) func2.call(completable, onSubscribe);
        }
        return onSubscribe;
    }

    public static Scheduler onComputationScheduler(Scheduler scheduler) {
        Func1 func1 = f79406i;
        if (func1 != null) {
            return (Scheduler) func1.call(scheduler);
        }
        return scheduler;
    }

    public static <T> Observable.OnSubscribe<T> onCreate(Observable.OnSubscribe<T> onSubscribe) {
        Func1 func1 = f79400c;
        return func1 != null ? (Observable.OnSubscribe) func1.call(onSubscribe) : onSubscribe;
    }

    public static void onError(Throwable th2) {
        Action1 action1 = f79399b;
        if (action1 != null) {
            try {
                action1.call(th2);
                return;
            } catch (Throwable th3) {
                PrintStream printStream = System.err;
                printStream.println("The onError handler threw an Exception. It shouldn't. => " + th3.getMessage());
                th3.printStackTrace();
                m22780c(th3);
            }
        }
        m22780c(th2);
    }

    public static Scheduler onIOScheduler(Scheduler scheduler) {
        Func1 func1 = f79407j;
        if (func1 != null) {
            return (Scheduler) func1.call(scheduler);
        }
        return scheduler;
    }

    public static Scheduler onNewThreadScheduler(Scheduler scheduler) {
        Func1 func1 = f79408k;
        if (func1 != null) {
            return (Scheduler) func1.call(scheduler);
        }
        return scheduler;
    }

    public static Throwable onObservableError(Throwable th2) {
        Func1 func1 = f79413p;
        if (func1 != null) {
            return (Throwable) func1.call(th2);
        }
        return th2;
    }

    public static <T, R> Observable.Operator<R, T> onObservableLift(Observable.Operator<R, T> operator) {
        Func1 func1 = f79416s;
        if (func1 != null) {
            return (Observable.Operator) func1.call(operator);
        }
        return operator;
    }

    public static Subscription onObservableReturn(Subscription subscription) {
        Func1 func1 = f79410m;
        if (func1 != null) {
            return (Subscription) func1.call(subscription);
        }
        return subscription;
    }

    public static <T> Observable.OnSubscribe<T> onObservableStart(Observable<T> observable, Observable.OnSubscribe<T> onSubscribe) {
        Func2 func2 = f79403f;
        if (func2 != null) {
            return (Observable.OnSubscribe) func2.call(observable, onSubscribe);
        }
        return onSubscribe;
    }

    public static Action0 onScheduledAction(Action0 action0) {
        Func1 func1 = f79409l;
        if (func1 != null) {
            return (Action0) func1.call(action0);
        }
        return action0;
    }

    public static Throwable onSingleError(Throwable th2) {
        Func1 func1 = f79414q;
        if (func1 != null) {
            return (Throwable) func1.call(th2);
        }
        return th2;
    }

    public static <T, R> Observable.Operator<R, T> onSingleLift(Observable.Operator<R, T> operator) {
        Func1 func1 = f79417t;
        if (func1 != null) {
            return (Observable.Operator) func1.call(operator);
        }
        return operator;
    }

    public static Subscription onSingleReturn(Subscription subscription) {
        Func1 func1 = f79411n;
        if (func1 != null) {
            return (Subscription) func1.call(subscription);
        }
        return subscription;
    }

    public static <T> Single.OnSubscribe<T> onSingleStart(Single<T> single, Single.OnSubscribe<T> onSubscribe) {
        Func2 func2 = f79404g;
        if (func2 != null) {
            return (Single.OnSubscribe) func2.call(single, onSubscribe);
        }
        return onSubscribe;
    }

    public static void reset() {
        if (f79398a) {
            return;
        }
        m22782a();
        f79406i = null;
        f79407j = null;
        f79408k = null;
        f79412o = null;
    }

    public static void resetAssemblyTracking() {
        if (f79398a) {
            return;
        }
        m22781b();
    }

    public static void setOnCompletableCreate(Func1<Completable.OnSubscribe, Completable.OnSubscribe> func1) {
        if (f79398a) {
            return;
        }
        f79402e = func1;
    }

    public static void setOnCompletableLift(Func1<Completable.Operator, Completable.Operator> func1) {
        if (f79398a) {
            return;
        }
        f79418u = func1;
    }

    public static void setOnCompletableStart(Func2<Completable, Completable.OnSubscribe, Completable.OnSubscribe> func2) {
        if (f79398a) {
            return;
        }
        f79405h = func2;
    }

    public static void setOnCompletableSubscribeError(Func1<Throwable, Throwable> func1) {
        if (f79398a) {
            return;
        }
        f79415r = func1;
    }

    public static void setOnComputationScheduler(Func1<Scheduler, Scheduler> func1) {
        if (f79398a) {
            return;
        }
        f79406i = func1;
    }

    public static void setOnError(Action1<Throwable> action1) {
        if (f79398a) {
            return;
        }
        f79399b = action1;
    }

    public static void setOnGenericScheduledExecutorService(Func0<? extends ScheduledExecutorService> func0) {
        if (f79398a) {
            return;
        }
        f79412o = func0;
    }

    public static void setOnIOScheduler(Func1<Scheduler, Scheduler> func1) {
        if (f79398a) {
            return;
        }
        f79407j = func1;
    }

    public static void setOnNewThreadScheduler(Func1<Scheduler, Scheduler> func1) {
        if (f79398a) {
            return;
        }
        f79408k = func1;
    }

    public static void setOnObservableCreate(Func1<Observable.OnSubscribe, Observable.OnSubscribe> func1) {
        if (f79398a) {
            return;
        }
        f79400c = func1;
    }

    public static void setOnObservableLift(Func1<Observable.Operator, Observable.Operator> func1) {
        if (f79398a) {
            return;
        }
        f79416s = func1;
    }

    public static void setOnObservableReturn(Func1<Subscription, Subscription> func1) {
        if (f79398a) {
            return;
        }
        f79410m = func1;
    }

    public static void setOnObservableStart(Func2<Observable, Observable.OnSubscribe, Observable.OnSubscribe> func2) {
        if (f79398a) {
            return;
        }
        f79403f = func2;
    }

    public static void setOnObservableSubscribeError(Func1<Throwable, Throwable> func1) {
        if (f79398a) {
            return;
        }
        f79413p = func1;
    }

    public static void setOnScheduleAction(Func1<Action0, Action0> func1) {
        if (f79398a) {
            return;
        }
        f79409l = func1;
    }

    public static void setOnSingleCreate(Func1<Single.OnSubscribe, Single.OnSubscribe> func1) {
        if (f79398a) {
            return;
        }
        f79401d = func1;
    }

    public static void setOnSingleLift(Func1<Observable.Operator, Observable.Operator> func1) {
        if (f79398a) {
            return;
        }
        f79417t = func1;
    }

    public static void setOnSingleReturn(Func1<Subscription, Subscription> func1) {
        if (f79398a) {
            return;
        }
        f79411n = func1;
    }

    public static void setOnSingleStart(Func2<Single, Single.OnSubscribe, Single.OnSubscribe> func2) {
        if (f79398a) {
            return;
        }
        f79404g = func2;
    }

    public static void setOnSingleSubscribeError(Func1<Throwable, Throwable> func1) {
        if (f79398a) {
            return;
        }
        f79414q = func1;
    }

    public static <T> Single.OnSubscribe<T> onCreate(Single.OnSubscribe<T> onSubscribe) {
        Func1 func1 = f79401d;
        return func1 != null ? (Single.OnSubscribe) func1.call(onSubscribe) : onSubscribe;
    }

    public static Completable.OnSubscribe onCreate(Completable.OnSubscribe onSubscribe) {
        Func1 func1 = f79402e;
        return func1 != null ? (Completable.OnSubscribe) func1.call(onSubscribe) : onSubscribe;
    }
}
