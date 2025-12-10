package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OnSubscribeUsing */
/* loaded from: classes7.dex */
public final class OnSubscribeUsing<T, Resource> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Func0 f78405a;

    /* renamed from: b */
    public final Func1 f78406b;

    /* renamed from: c */
    public final Action1 f78407c;

    /* renamed from: d */
    public final boolean f78408d;

    /* renamed from: rx.internal.operators.OnSubscribeUsing$DisposeAction */
    /* loaded from: classes7.dex */
    public static final class DisposeAction<Resource> extends AtomicBoolean implements Action0, Subscription {
        private static final long serialVersionUID = 4262875056400218316L;
        private Action1<? super Resource> dispose;
        private Resource resource;

        public DisposeAction(Action1<? super Resource> action1, Resource resource) {
            this.dispose = action1;
            this.resource = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, rx.functions.Action1<? super Resource>] */
        @Override // p046rx.functions.Action0
        public void call() {
            if (compareAndSet(false, true)) {
                ?? r0 = (Resource) false;
                try {
                    this.dispose.call((Resource) this.resource);
                } finally {
                    this.resource = null;
                    this.dispose = null;
                }
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Observable<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.f78405a = func0;
        this.f78406b = func1;
        this.f78407c = action1;
        this.f78408d = z;
    }

    /* renamed from: a */
    public final Throwable m23277a(Action0 action0) {
        try {
            action0.call();
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void call(Subscriber<? super T> subscriber) {
        Observable<T> doAfterTerminate;
        try {
            Object call = this.f78405a.call();
            DisposeAction disposeAction = new DisposeAction(this.f78407c, call);
            subscriber.add(disposeAction);
            Observable observable = (Observable) this.f78406b.call(call);
            if (this.f78408d) {
                doAfterTerminate = observable.doOnTerminate(disposeAction);
            } else {
                doAfterTerminate = observable.doAfterTerminate(disposeAction);
            }
            doAfterTerminate.unsafeSubscribe(Subscribers.wrap(subscriber));
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}