package p046rx.internal.util;

import p046rx.Notification;
import p046rx.Observer;
import p046rx.functions.Action1;

/* renamed from: rx.internal.util.ActionNotificationObserver */
/* loaded from: classes7.dex */
public final class ActionNotificationObserver<T> implements Observer<T> {

    /* renamed from: a */
    public final Action1 f79164a;

    public ActionNotificationObserver(Action1<Notification<? super T>> action1) {
        this.f79164a = action1;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79164a.call(Notification.createOnCompleted());
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79164a.call(Notification.createOnError(th2));
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79164a.call(Notification.createOnNext(t));
    }
}
