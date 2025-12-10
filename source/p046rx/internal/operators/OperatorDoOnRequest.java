package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.functions.Action1;

/* renamed from: rx.internal.operators.OperatorDoOnRequest */
/* loaded from: classes7.dex */
public class OperatorDoOnRequest<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Action1 f78341a;

    /* renamed from: rx.internal.operators.OperatorDoOnRequest$a */
    /* loaded from: classes7.dex */
    public class C13564a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13565b f78342a;

        public C13564a(C13565b c13565b) {
            this.f78342a = c13565b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            OperatorDoOnRequest.this.f78341a.call(Long.valueOf(j));
            this.f78342a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorDoOnRequest$b */
    /* loaded from: classes7.dex */
    public static final class C13565b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78344a;

        public C13565b(Subscriber subscriber) {
            this.f78344a = subscriber;
            request(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j) {
            request(j);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78344a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78344a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78344a.onNext(obj);
        }
    }

    public OperatorDoOnRequest(Action1<? super Long> action1) {
        this.f78341a = action1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13565b c13565b = new C13565b(subscriber);
        subscriber.setProducer(new C13564a(c13565b));
        subscriber.add(c13565b);
        return c13565b;
    }
}
