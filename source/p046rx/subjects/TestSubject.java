package p046rx.subjects;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.internal.operators.NotificationLite;
import p046rx.schedulers.TestScheduler;
import p046rx.subjects.SubjectSubscriptionManager;

/* renamed from: rx.subjects.TestSubject */
/* loaded from: classes7.dex */
public final class TestSubject<T> extends Subject<T, T> {

    /* renamed from: b */
    public final SubjectSubscriptionManager f79500b;

    /* renamed from: c */
    public final Scheduler.Worker f79501c;

    /* renamed from: rx.subjects.TestSubject$a */
    /* loaded from: classes7.dex */
    public static class C13871a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f79502a;

        public C13871a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f79502a = subjectSubscriptionManager;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SubjectSubscriptionManager.SubjectObserver subjectObserver) {
            subjectObserver.m22743b(this.f79502a.getLatest());
        }
    }

    /* renamed from: rx.subjects.TestSubject$b */
    /* loaded from: classes7.dex */
    public class C13872b implements Action0 {
        public C13872b() {
        }

        @Override // p046rx.functions.Action0
        public void call() {
            TestSubject.this.m22740c();
        }
    }

    /* renamed from: rx.subjects.TestSubject$c */
    /* loaded from: classes7.dex */
    public class C13873c implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f79504a;

        public C13873c(Throwable th2) {
            this.f79504a = th2;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            TestSubject.this.m22739d(this.f79504a);
        }
    }

    /* renamed from: rx.subjects.TestSubject$d */
    /* loaded from: classes7.dex */
    public class C13874d implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Object f79506a;

        public C13874d(Object obj) {
            this.f79506a = obj;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            TestSubject.this.m22738e(this.f79506a);
        }
    }

    public TestSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager, TestScheduler testScheduler) {
        super(onSubscribe);
        this.f79500b = subjectSubscriptionManager;
        this.f79501c = testScheduler.createWorker();
    }

    public static <T> TestSubject<T> create(TestScheduler testScheduler) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        C13871a c13871a = new C13871a(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = c13871a;
        subjectSubscriptionManager.onTerminated = c13871a;
        return new TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    /* renamed from: c */
    public void m22740c() {
        SubjectSubscriptionManager subjectSubscriptionManager = this.f79500b;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.completed())) {
                subjectObserver.onCompleted();
            }
        }
    }

    /* renamed from: d */
    public void m22739d(Throwable th2) {
        SubjectSubscriptionManager subjectSubscriptionManager = this.f79500b;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.error(th2))) {
                subjectObserver.onError(th2);
            }
        }
    }

    /* renamed from: e */
    public void m22738e(Object obj) {
        for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79500b.observers()) {
            subjectObserver.onNext(obj);
        }
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        if (this.f79500b.observers().length > 0) {
            return true;
        }
        return false;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        onCompleted(0L);
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        onError(th2, 0L);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        onNext(t, 0L);
    }

    public void onCompleted(long j) {
        this.f79501c.schedule(new C13872b(), j, TimeUnit.MILLISECONDS);
    }

    public void onError(Throwable th2, long j) {
        this.f79501c.schedule(new C13873c(th2), j, TimeUnit.MILLISECONDS);
    }

    public void onNext(T t, long j) {
        this.f79501c.schedule(new C13874d(t), j, TimeUnit.MILLISECONDS);
    }
}
