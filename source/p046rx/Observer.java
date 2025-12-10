package p046rx;

/* renamed from: rx.Observer */
/* loaded from: classes5.dex */
public interface Observer<T> {
    void onCompleted();

    void onError(Throwable th2);

    void onNext(T t);
}
