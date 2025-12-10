package p046rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleTakeUntilSingle */
/* loaded from: classes7.dex */
public final class SingleTakeUntilSingle<T, U> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79235a;

    /* renamed from: b */
    public final Single f79236b;

    /* renamed from: rx.internal.operators.SingleTakeUntilSingle$a */
    /* loaded from: classes7.dex */
    public static final class C13724a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79237b;

        /* renamed from: c */
        public final AtomicBoolean f79238c = new AtomicBoolean();

        /* renamed from: d */
        public final SingleSubscriber f79239d;

        /* renamed from: rx.internal.operators.SingleTakeUntilSingle$a$a */
        /* loaded from: classes7.dex */
        public final class C13725a extends SingleSubscriber {
            public C13725a() {
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                C13724a.this.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                onError(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }
        }

        public C13724a(SingleSubscriber singleSubscriber) {
            this.f79237b = singleSubscriber;
            C13725a c13725a = new C13725a();
            this.f79239d = c13725a;
            add(c13725a);
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79238c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79237b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79238c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79237b.onSuccess(obj);
            }
        }
    }

    public SingleTakeUntilSingle(Single.OnSubscribe<T> onSubscribe, Single<? extends U> single) {
        this.f79235a = onSubscribe;
        this.f79236b = single;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13724a c13724a = new C13724a(singleSubscriber);
        singleSubscriber.add(c13724a);
        this.f79236b.subscribe(c13724a.f79239d);
        this.f79235a.call(c13724a);
    }
}