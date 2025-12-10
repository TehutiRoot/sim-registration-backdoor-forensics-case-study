package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorSerialize */
/* loaded from: classes7.dex */
public final class OperatorSerialize<T> implements Observable.Operator<T, T> {

    /* renamed from: rx.internal.operators.OperatorSerialize$a */
    /* loaded from: classes7.dex */
    public class C13637a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13637a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78860a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78860a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78860a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78860a.onNext(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorSerialize$b */
    /* loaded from: classes7.dex */
    public static final class C13638b {

        /* renamed from: a */
        public static final OperatorSerialize f78862a = new OperatorSerialize();
    }

    public static <T> OperatorSerialize<T> instance() {
        return C13638b.f78862a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new SerializedSubscriber(new C13637a(subscriber, subscriber));
    }
}