package p046rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleTakeUntilObservable */
/* loaded from: classes7.dex */
public final class SingleTakeUntilObservable<T, U> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79023a;

    /* renamed from: b */
    public final Observable f79024b;

    /* renamed from: rx.internal.operators.SingleTakeUntilObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13721a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79025b;

        /* renamed from: c */
        public final AtomicBoolean f79026c = new AtomicBoolean();

        /* renamed from: d */
        public final Subscriber f79027d;

        /* renamed from: rx.internal.operators.SingleTakeUntilObservable$a$a */
        /* loaded from: classes7.dex */
        public final class C13722a extends Subscriber {
            public C13722a() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13721a.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        public C13721a(SingleSubscriber singleSubscriber) {
            this.f79025b = singleSubscriber;
            C13722a c13722a = new C13722a();
            this.f79027d = c13722a;
            add(c13722a);
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79026c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79025b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79026c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79025b.onSuccess(obj);
            }
        }
    }

    public SingleTakeUntilObservable(Single.OnSubscribe<T> onSubscribe, Observable<? extends U> observable) {
        this.f79023a = onSubscribe;
        this.f79024b = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13721a c13721a = new C13721a(singleSubscriber);
        singleSubscriber.add(c13721a);
        this.f79024b.subscribe((Subscriber) c13721a.f79027d);
        this.f79023a.call(c13721a);
    }
}
