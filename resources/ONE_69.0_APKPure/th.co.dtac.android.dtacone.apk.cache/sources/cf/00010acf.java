package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorIgnoreElements */
/* loaded from: classes7.dex */
public class OperatorIgnoreElements<T> implements Observable.Operator<T, T> {

    /* renamed from: rx.internal.operators.OperatorIgnoreElements$a */
    /* loaded from: classes7.dex */
    public class C13577a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78631a;

        public C13577a(Subscriber subscriber) {
            this.f78631a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78631a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78631a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.internal.operators.OperatorIgnoreElements$b */
    /* loaded from: classes7.dex */
    public static final class C13578b {

        /* renamed from: a */
        public static final OperatorIgnoreElements f78633a = new OperatorIgnoreElements();
    }

    public static <T> OperatorIgnoreElements<T> instance() {
        return C13578b.f78633a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13577a c13577a = new C13577a(subscriber);
        subscriber.add(c13577a);
        return c13577a;
    }
}