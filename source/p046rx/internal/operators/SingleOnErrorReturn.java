package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.SingleOnErrorReturn */
/* loaded from: classes7.dex */
public final class SingleOnErrorReturn<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f78981a;

    /* renamed from: b */
    public final Func1 f78982b;

    /* renamed from: rx.internal.operators.SingleOnErrorReturn$a */
    /* loaded from: classes7.dex */
    public static final class C13711a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f78983b;

        /* renamed from: c */
        public final Func1 f78984c;

        public C13711a(SingleSubscriber singleSubscriber, Func1 func1) {
            this.f78983b = singleSubscriber;
            this.f78984c = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.f78983b.onSuccess(this.f78984c.call(th2));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f78983b.onError(th3);
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78983b.onSuccess(obj);
        }
    }

    public SingleOnErrorReturn(Single.OnSubscribe<T> onSubscribe, Func1<Throwable, ? extends T> func1) {
        this.f78981a = onSubscribe;
        this.f78982b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13711a c13711a = new C13711a(singleSubscriber, this.f78982b);
        singleSubscriber.add(c13711a);
        this.f78981a.call(c13711a);
    }
}
