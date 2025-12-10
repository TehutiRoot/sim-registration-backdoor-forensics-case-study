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
    public final Single.OnSubscribe f79229a;

    /* renamed from: b */
    public final Observable f79230b;

    /* renamed from: rx.internal.operators.SingleTakeUntilObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13722a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79231b;

        /* renamed from: c */
        public final AtomicBoolean f79232c = new AtomicBoolean();

        /* renamed from: d */
        public final Subscriber f79233d;

        /* renamed from: rx.internal.operators.SingleTakeUntilObservable$a$a */
        /* loaded from: classes7.dex */
        public final class C13723a extends Subscriber {
            public C13723a() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13722a.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        public C13722a(SingleSubscriber singleSubscriber) {
            this.f79231b = singleSubscriber;
            C13723a c13723a = new C13723a();
            this.f79233d = c13723a;
            add(c13723a);
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79232c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79231b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79232c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79231b.onSuccess(obj);
            }
        }
    }

    public SingleTakeUntilObservable(Single.OnSubscribe<T> onSubscribe, Observable<? extends U> observable) {
        this.f79229a = onSubscribe;
        this.f79230b = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13722a c13722a = new C13722a(singleSubscriber);
        singleSubscriber.add(c13722a);
        this.f79230b.subscribe((Subscriber) c13722a.f79233d);
        this.f79229a.call(c13722a);
    }
}