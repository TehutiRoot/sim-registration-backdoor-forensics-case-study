package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.functions.Action1;

/* renamed from: rx.internal.operators.OperatorDoOnRequest */
/* loaded from: classes7.dex */
public class OperatorDoOnRequest<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Action1 f78547a;

    /* renamed from: rx.internal.operators.OperatorDoOnRequest$a */
    /* loaded from: classes7.dex */
    public class C13565a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13566b f78548a;

        public C13565a(C13566b c13566b) {
            this.f78548a = c13566b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            OperatorDoOnRequest.this.f78547a.call(Long.valueOf(j));
            this.f78548a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorDoOnRequest$b */
    /* loaded from: classes7.dex */
    public static final class C13566b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78550a;

        public C13566b(Subscriber subscriber) {
            this.f78550a = subscriber;
            request(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j) {
            request(j);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78550a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78550a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78550a.onNext(obj);
        }
    }

    public OperatorDoOnRequest(Action1<? super Long> action1) {
        this.f78547a = action1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13566b c13566b = new C13566b(subscriber);
        subscriber.setProducer(new C13565a(c13566b));
        subscriber.add(c13566b);
        return c13566b;
    }
}