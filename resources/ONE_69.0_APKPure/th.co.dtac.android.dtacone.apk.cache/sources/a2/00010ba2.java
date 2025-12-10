package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.SingleOnErrorReturn */
/* loaded from: classes7.dex */
public final class SingleOnErrorReturn<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79187a;

    /* renamed from: b */
    public final Func1 f79188b;

    /* renamed from: rx.internal.operators.SingleOnErrorReturn$a */
    /* loaded from: classes7.dex */
    public static final class C13712a extends SingleSubscriber {

        /* renamed from: b */
        public final SingleSubscriber f79189b;

        /* renamed from: c */
        public final Func1 f79190c;

        public C13712a(SingleSubscriber singleSubscriber, Func1 func1) {
            this.f79189b = singleSubscriber;
            this.f79190c = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            try {
                this.f79189b.onSuccess(this.f79190c.call(th2));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f79189b.onError(th3);
            }
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79189b.onSuccess(obj);
        }
    }

    public SingleOnErrorReturn(Single.OnSubscribe<T> onSubscribe, Func1<Throwable, ? extends T> func1) {
        this.f79187a = onSubscribe;
        this.f79188b = func1;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13712a c13712a = new C13712a(singleSubscriber, this.f79188b);
        singleSubscriber.add(c13712a);
        this.f79187a.call(c13712a);
    }
}