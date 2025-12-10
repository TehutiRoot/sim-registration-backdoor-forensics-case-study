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
    public final Single.OnSubscribe f79029a;

    /* renamed from: b */
    public final Single f79030b;

    /* renamed from: rx.internal.operators.SingleTakeUntilSingle$a */
    /* loaded from: classes7.dex */
    public static final class C13723a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79031b;

        /* renamed from: c */
        public final AtomicBoolean f79032c = new AtomicBoolean();

        /* renamed from: d */
        public final SingleSubscriber f79033d;

        /* renamed from: rx.internal.operators.SingleTakeUntilSingle$a$a */
        /* loaded from: classes7.dex */
        public final class C13724a extends SingleSubscriber {
            public C13724a() {
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                C13723a.this.onError(th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                onError(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }
        }

        public C13723a(SingleSubscriber singleSubscriber) {
            this.f79031b = singleSubscriber;
            C13724a c13724a = new C13724a();
            this.f79033d = c13724a;
            add(c13724a);
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            if (this.f79032c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79031b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (this.f79032c.compareAndSet(false, true)) {
                unsubscribe();
                this.f79031b.onSuccess(obj);
            }
        }
    }

    public SingleTakeUntilSingle(Single.OnSubscribe<T> onSubscribe, Single<? extends U> single) {
        this.f79029a = onSubscribe;
        this.f79030b = single;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13723a c13723a = new C13723a(singleSubscriber);
        singleSubscriber.add(c13723a);
        this.f79030b.subscribe(c13723a.f79033d);
        this.f79029a.call(c13723a);
    }
}
