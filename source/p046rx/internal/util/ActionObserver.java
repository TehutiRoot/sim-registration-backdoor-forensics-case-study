package p046rx.internal.util;

import p046rx.Observer;
import p046rx.functions.Action0;
import p046rx.functions.Action1;

/* renamed from: rx.internal.util.ActionObserver */
/* loaded from: classes7.dex */
public final class ActionObserver<T> implements Observer<T> {

    /* renamed from: a */
    public final Action1 f79165a;

    /* renamed from: b */
    public final Action1 f79166b;

    /* renamed from: c */
    public final Action0 f79167c;

    public ActionObserver(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        this.f79165a = action1;
        this.f79166b = action12;
        this.f79167c = action0;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79167c.call();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79166b.call(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79165a.call(t);
    }
}
