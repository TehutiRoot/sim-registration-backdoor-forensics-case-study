package p046rx.observables;

import p046rx.Observable;
import p046rx.Subscription;
import p046rx.functions.Action1;
import p046rx.functions.Actions;
import p046rx.internal.operators.OnSubscribeAutoConnect;
import p046rx.internal.operators.OnSubscribeRefCount;

/* renamed from: rx.observables.ConnectableObservable */
/* loaded from: classes7.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {

    /* renamed from: rx.observables.ConnectableObservable$a */
    /* loaded from: classes7.dex */
    public class C13817a implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Subscription[] f79344a;

        public C13817a(Subscription[] subscriptionArr) {
            this.f79344a = subscriptionArr;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscription subscription) {
            this.f79344a[0] = subscription;
        }
    }

    public ConnectableObservable(Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
    }

    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public final Subscription connect() {
        Subscription[] subscriptionArr = new Subscription[1];
        connect(new C13817a(subscriptionArr));
        return subscriptionArr[0];
    }

    public abstract void connect(Action1<? super Subscription> action1);

    public Observable<T> refCount() {
        return Observable.unsafeCreate(new OnSubscribeRefCount(this));
    }

    public Observable<T> autoConnect(int i) {
        return autoConnect(i, Actions.empty());
    }

    public Observable<T> autoConnect(int i, Action1<? super Subscription> action1) {
        if (i <= 0) {
            connect(action1);
            return this;
        }
        return Observable.unsafeCreate(new OnSubscribeAutoConnect(this, i, action1));
    }
}
