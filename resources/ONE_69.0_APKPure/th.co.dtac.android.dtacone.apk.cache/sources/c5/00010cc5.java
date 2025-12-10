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
    public final SubjectSubscriptionManager f79706b;

    /* renamed from: c */
    public final Scheduler.Worker f79707c;

    /* renamed from: rx.subjects.TestSubject$a */
    /* loaded from: classes7.dex */
    public static class C13872a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f79708a;

        public C13872a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f79708a = subjectSubscriptionManager;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SubjectSubscriptionManager.SubjectObserver subjectObserver) {
            subjectObserver.m22931b(this.f79708a.getLatest());
        }
    }

    /* renamed from: rx.subjects.TestSubject$b */
    /* loaded from: classes7.dex */
    public class C13873b implements Action0 {
        public C13873b() {
        }

        @Override // p046rx.functions.Action0
        public void call() {
            TestSubject.this.m22928c();
        }
    }

    /* renamed from: rx.subjects.TestSubject$c */
    /* loaded from: classes7.dex */
    public class C13874c implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Throwable f79710a;

        public C13874c(Throwable th2) {
            this.f79710a = th2;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            TestSubject.this.m22927d(this.f79710a);
        }
    }

    /* renamed from: rx.subjects.TestSubject$d */
    /* loaded from: classes7.dex */
    public class C13875d implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Object f79712a;

        public C13875d(Object obj) {
            this.f79712a = obj;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            TestSubject.this.m22926e(this.f79712a);
        }
    }

    public TestSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager, TestScheduler testScheduler) {
        super(onSubscribe);
        this.f79706b = subjectSubscriptionManager;
        this.f79707c = testScheduler.createWorker();
    }

    public static <T> TestSubject<T> create(TestScheduler testScheduler) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        C13872a c13872a = new C13872a(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = c13872a;
        subjectSubscriptionManager.onTerminated = c13872a;
        return new TestSubject<>(subjectSubscriptionManager, subjectSubscriptionManager, testScheduler);
    }

    /* renamed from: c */
    public void m22928c() {
        SubjectSubscriptionManager subjectSubscriptionManager = this.f79706b;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.completed())) {
                subjectObserver.onCompleted();
            }
        }
    }

    /* renamed from: d */
    public void m22927d(Throwable th2) {
        SubjectSubscriptionManager subjectSubscriptionManager = this.f79706b;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : subjectSubscriptionManager.terminate(NotificationLite.error(th2))) {
                subjectObserver.onError(th2);
            }
        }
    }

    /* renamed from: e */
    public void m22926e(Object obj) {
        for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79706b.observers()) {
            subjectObserver.onNext(obj);
        }
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        if (this.f79706b.observers().length > 0) {
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
        this.f79707c.schedule(new C13873b(), j, TimeUnit.MILLISECONDS);
    }

    public void onError(Throwable th2, long j) {
        this.f79707c.schedule(new C13874c(th2), j, TimeUnit.MILLISECONDS);
    }

    public void onNext(T t, long j) {
        this.f79707c.schedule(new C13875d(t), j, TimeUnit.MILLISECONDS);
    }
}