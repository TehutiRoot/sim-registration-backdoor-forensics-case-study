package p046rx.subjects;

import p046rx.Observable;
import p046rx.Observer;

/* renamed from: rx.subjects.Subject */
/* loaded from: classes7.dex */
public abstract class Subject<T, R> extends Observable<R> implements Observer<T> {
    public Subject(Observable.OnSubscribe<R> onSubscribe) {
        super(onSubscribe);
    }

    public abstract boolean hasObservers();

    public final SerializedSubject<T, R> toSerialized() {
        if (getClass() == SerializedSubject.class) {
            return (SerializedSubject) this;
        }
        return new SerializedSubject<>(this);
    }
}
