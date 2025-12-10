package p046rx.subjects;

import java.util.ArrayList;
import p046rx.Observable;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;
import p046rx.internal.operators.NotificationLite;
import p046rx.internal.producers.SingleProducer;
import p046rx.subjects.SubjectSubscriptionManager;

/* renamed from: rx.subjects.AsyncSubject */
/* loaded from: classes7.dex */
public final class AsyncSubject<T> extends Subject<T, T> {

    /* renamed from: b */
    public final SubjectSubscriptionManager f79454b;

    /* renamed from: c */
    public volatile Object f79455c;

    /* renamed from: rx.subjects.AsyncSubject$a */
    /* loaded from: classes7.dex */
    public static class C13865a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f79456a;

        public C13865a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f79456a = subjectSubscriptionManager;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SubjectSubscriptionManager.SubjectObserver subjectObserver) {
            Object latest = this.f79456a.getLatest();
            if (latest != null && !NotificationLite.isCompleted(latest)) {
                if (NotificationLite.isError(latest)) {
                    subjectObserver.onError(NotificationLite.getError(latest));
                    return;
                } else {
                    subjectObserver.f79492a.setProducer(new SingleProducer(subjectObserver.f79492a, NotificationLite.getValue(latest)));
                    return;
                }
            }
            subjectObserver.onCompleted();
        }
    }

    public AsyncSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.f79454b = subjectSubscriptionManager;
    }

    public static <T> AsyncSubject<T> create() {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new C13865a(subjectSubscriptionManager);
        return new AsyncSubject<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    public Throwable getThrowable() {
        Object latest = this.f79454b.getLatest();
        if (NotificationLite.isError(latest)) {
            return NotificationLite.getError(latest);
        }
        return null;
    }

    public T getValue() {
        Object obj = this.f79455c;
        if (!NotificationLite.isError(this.f79454b.getLatest()) && NotificationLite.isNext(obj)) {
            return (T) NotificationLite.getValue(obj);
        }
        return null;
    }

    public boolean hasCompleted() {
        Object latest = this.f79454b.getLatest();
        if (latest != null && !NotificationLite.isError(latest)) {
            return true;
        }
        return false;
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        if (this.f79454b.observers().length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        return NotificationLite.isError(this.f79454b.getLatest());
    }

    public boolean hasValue() {
        Object obj = this.f79455c;
        if (!NotificationLite.isError(this.f79454b.getLatest()) && NotificationLite.isNext(obj)) {
            return true;
        }
        return false;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        SubjectSubscriptionManager.SubjectObserver<T>[] terminate;
        if (this.f79454b.active) {
            Object obj = this.f79455c;
            if (obj == null) {
                obj = NotificationLite.completed();
            }
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79454b.terminate(obj)) {
                if (obj == NotificationLite.completed()) {
                    subjectObserver.onCompleted();
                } else {
                    subjectObserver.f79492a.setProducer(new SingleProducer(subjectObserver.f79492a, NotificationLite.getValue(obj)));
                }
            }
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        if (this.f79454b.active) {
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79454b.terminate(NotificationLite.error(th2))) {
                try {
                    subjectObserver.onError(th2);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79455c = NotificationLite.next(t);
    }
}
