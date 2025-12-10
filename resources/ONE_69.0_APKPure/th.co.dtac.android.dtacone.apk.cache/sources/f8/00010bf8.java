package p046rx.internal.util;

import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.functions.Action1;

/* renamed from: rx.internal.util.ActionSubscriber */
/* loaded from: classes7.dex */
public final class ActionSubscriber<T> extends Subscriber<T> {

    /* renamed from: a */
    public final Action1 f79374a;

    /* renamed from: b */
    public final Action1 f79375b;

    /* renamed from: c */
    public final Action0 f79376c;

    public ActionSubscriber(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        this.f79374a = action1;
        this.f79375b = action12;
        this.f79376c = action0;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79376c.call();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79375b.call(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79374a.call(t);
    }
}