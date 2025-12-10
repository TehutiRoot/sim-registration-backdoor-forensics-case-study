package p046rx.observables;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.observables.GroupedObservable */
/* loaded from: classes7.dex */
public class GroupedObservable<K, T> extends Observable<T> {

    /* renamed from: b */
    public final Object f79346b;

    /* renamed from: rx.observables.GroupedObservable$a */
    /* loaded from: classes7.dex */
    public static class C13818a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Observable f79347a;

        public C13818a(Observable observable) {
            this.f79347a = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            this.f79347a.unsafeSubscribe(subscriber);
        }
    }

    public GroupedObservable(K k, Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
        this.f79346b = k;
    }

    public static <K, T> GroupedObservable<K, T> create(K k, Observable.OnSubscribe<T> onSubscribe) {
        return new GroupedObservable<>(k, onSubscribe);
    }

    public static <K, T> GroupedObservable<K, T> from(K k, Observable<T> observable) {
        return new GroupedObservable<>(k, new C13818a(observable));
    }

    public K getKey() {
        return (K) this.f79346b;
    }
}
