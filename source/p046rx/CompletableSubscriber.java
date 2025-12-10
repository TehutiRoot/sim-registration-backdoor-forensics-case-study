package p046rx;

/* renamed from: rx.CompletableSubscriber */
/* loaded from: classes5.dex */
public interface CompletableSubscriber {
    void onCompleted();

    void onError(Throwable th2);

    void onSubscribe(Subscription subscription);
}
