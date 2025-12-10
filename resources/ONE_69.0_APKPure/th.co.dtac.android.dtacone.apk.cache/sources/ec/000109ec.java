package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.EmptyObservableHolder */
/* loaded from: classes7.dex */
public enum EmptyObservableHolder implements Observable.OnSubscribe<Object> {
    INSTANCE;
    
    static final Observable<Object> EMPTY = Observable.unsafeCreate(INSTANCE);

    public static <T> Observable<T> instance() {
        return (Observable<T>) EMPTY;
    }

    @Override // p046rx.functions.Action1
    public void call(Subscriber<? super Object> subscriber) {
        subscriber.onCompleted();
    }
}