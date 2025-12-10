package p046rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p046rx.Observable;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;
import p046rx.internal.operators.NotificationLite;
import p046rx.subjects.SubjectSubscriptionManager;

/* renamed from: rx.subjects.BehaviorSubject */
/* loaded from: classes7.dex */
public final class BehaviorSubject<T> extends Subject<T, T> {

    /* renamed from: c */
    public static final Object[] f79457c = new Object[0];

    /* renamed from: b */
    public final SubjectSubscriptionManager f79458b;

    /* renamed from: rx.subjects.BehaviorSubject$a */
    /* loaded from: classes7.dex */
    public static class C13866a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ SubjectSubscriptionManager f79459a;

        public C13866a(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.f79459a = subjectSubscriptionManager;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SubjectSubscriptionManager.SubjectObserver subjectObserver) {
            subjectObserver.m22743b(this.f79459a.getLatest());
        }
    }

    public BehaviorSubject(Observable.OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.f79458b = subjectSubscriptionManager;
    }

    /* renamed from: c */
    public static BehaviorSubject m22750c(Object obj, boolean z) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.setLatest(NotificationLite.next(obj));
        }
        C13866a c13866a = new C13866a(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = c13866a;
        subjectSubscriptionManager.onTerminated = c13866a;
        return new BehaviorSubject(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    public static <T> BehaviorSubject<T> create() {
        return m22750c(null, false);
    }

    public Throwable getThrowable() {
        Object latest = this.f79458b.getLatest();
        if (NotificationLite.isError(latest)) {
            return NotificationLite.getError(latest);
        }
        return null;
    }

    public T getValue() {
        Object latest = this.f79458b.getLatest();
        if (NotificationLite.isNext(latest)) {
            return (T) NotificationLite.getValue(latest);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T[] getValues(T[] tArr) {
        Object latest = this.f79458b.getLatest();
        if (NotificationLite.isNext(latest)) {
            if (tArr.length == 0) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            }
            tArr[0] = NotificationLite.getValue(latest);
            if (tArr.length > 1) {
                tArr[1] = null;
            }
        } else if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public boolean hasCompleted() {
        return NotificationLite.isCompleted(this.f79458b.getLatest());
    }

    @Override // p046rx.subjects.Subject
    public boolean hasObservers() {
        if (this.f79458b.observers().length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasThrowable() {
        return NotificationLite.isError(this.f79458b.getLatest());
    }

    public boolean hasValue() {
        return NotificationLite.isNext(this.f79458b.getLatest());
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        if (this.f79458b.getLatest() == null || this.f79458b.active) {
            Object completed = NotificationLite.completed();
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79458b.terminate(completed)) {
                subjectObserver.m22741d(completed);
            }
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        if (this.f79458b.getLatest() == null || this.f79458b.active) {
            Object error = NotificationLite.error(th2);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79458b.terminate(error)) {
                try {
                    subjectObserver.m22741d(error);
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
        if (this.f79458b.getLatest() == null || this.f79458b.active) {
            Object next = NotificationLite.next(t);
            for (SubjectSubscriptionManager.SubjectObserver<T> subjectObserver : this.f79458b.next(next)) {
                subjectObserver.m22741d(next);
            }
        }
    }

    public static <T> BehaviorSubject<T> create(T t) {
        return m22750c(t, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f79457c;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }
}
