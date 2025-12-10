package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OperatorTakeUntilPredicate */
/* loaded from: classes7.dex */
public final class OperatorTakeUntilPredicate<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func1 f78760a;

    /* renamed from: rx.internal.operators.OperatorTakeUntilPredicate$a */
    /* loaded from: classes7.dex */
    public class C13665a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13666b f78761a;

        public C13665a(C13666b c13666b) {
            this.f78761a = c13666b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78761a.m22974b(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeUntilPredicate$b */
    /* loaded from: classes7.dex */
    public final class C13666b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78763a;

        /* renamed from: b */
        public boolean f78764b;

        public C13666b(Subscriber subscriber) {
            this.f78763a = subscriber;
        }

        /* renamed from: b */
        public void m22974b(long j) {
            request(j);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78764b) {
                this.f78763a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78764b) {
                this.f78763a.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78763a.onNext(obj);
            try {
                if (((Boolean) OperatorTakeUntilPredicate.this.f78760a.call(obj)).booleanValue()) {
                    this.f78764b = true;
                    this.f78763a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                this.f78764b = true;
                Exceptions.throwOrReport(th2, this.f78763a, obj);
                unsubscribe();
            }
        }
    }

    public OperatorTakeUntilPredicate(Func1<? super T, Boolean> func1) {
        this.f78760a = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13666b c13666b = new C13666b(subscriber);
        subscriber.add(c13666b);
        subscriber.setProducer(new C13665a(c13666b));
        return c13666b;
    }
}
