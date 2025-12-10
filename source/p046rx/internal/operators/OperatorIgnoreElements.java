package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorIgnoreElements */
/* loaded from: classes7.dex */
public class OperatorIgnoreElements<T> implements Observable.Operator<T, T> {

    /* renamed from: rx.internal.operators.OperatorIgnoreElements$a */
    /* loaded from: classes7.dex */
    public class C13576a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78425a;

        public C13576a(Subscriber subscriber) {
            this.f78425a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78425a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78425a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    /* renamed from: rx.internal.operators.OperatorIgnoreElements$b */
    /* loaded from: classes7.dex */
    public static final class C13577b {

        /* renamed from: a */
        public static final OperatorIgnoreElements f78427a = new OperatorIgnoreElements();
    }

    public static <T> OperatorIgnoreElements<T> instance() {
        return C13577b.f78427a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13576a c13576a = new C13576a(subscriber);
        subscriber.add(c13576a);
        return c13576a;
    }
}
