package th.p047co.dtac.android.dtacone.manager.bus;

import p046rx.Observable;
import p046rx.subjects.BehaviorSubject;
import p046rx.subjects.PublishSubject;
import p046rx.subjects.ReplaySubject;
import p046rx.subjects.Subject;

/* renamed from: th.co.dtac.android.dtacone.manager.bus.RxBus */
/* loaded from: classes7.dex */
public class RxBus<T> {

    /* renamed from: a */
    public final Subject f84807a;

    public RxBus() {
        this(PublishSubject.create());
    }

    public static <T> RxBus<T> createRepeating(int i) {
        return new RxBus<>(ReplaySubject.createWithSize(i));
    }

    public static <T> RxBus<T> createSimple() {
        return new RxBus<>();
    }

    public static <T> RxBus<T> createWithLatest() {
        return new RxBus<>(BehaviorSubject.create());
    }

    public Observable<T> observe() {
        return this.f84807a;
    }

    public <E extends T> Observable<E> observeEvents(Class<E> cls) {
        return (Observable<E>) this.f84807a.ofType(cls);
    }

    public <E extends T> void post(E e) {
        this.f84807a.onNext(e);
    }

    public RxBus(Subject<T, T> subject) {
        this.f84807a = subject;
    }
}
