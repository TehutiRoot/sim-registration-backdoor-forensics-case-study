package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.producers.SingleDelayedProducer;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorAll */
/* loaded from: classes7.dex */
public final class OperatorAll<T> implements Observable.Operator<Boolean, T> {

    /* renamed from: a */
    public final Func1 f78409a;

    /* renamed from: rx.internal.operators.OperatorAll$a */
    /* loaded from: classes7.dex */
    public class C13529a extends Subscriber {

        /* renamed from: a */
        public boolean f78410a;

        /* renamed from: b */
        public final /* synthetic */ SingleDelayedProducer f78411b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78412c;

        public C13529a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78411b = singleDelayedProducer;
            this.f78412c = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78410a) {
                this.f78410a = true;
                this.f78411b.setValue(Boolean.TRUE);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78410a) {
                this.f78410a = true;
                this.f78412c.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78410a) {
                return;
            }
            try {
                if (!((Boolean) OperatorAll.this.f78409a.call(obj)).booleanValue()) {
                    this.f78410a = true;
                    this.f78411b.setValue(Boolean.FALSE);
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public OperatorAll(Func1<? super T, Boolean> func1) {
        this.f78409a = func1;
    }

    @Override // p046rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Boolean> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13529a c13529a = new C13529a(singleDelayedProducer, subscriber);
        subscriber.add(c13529a);
        subscriber.setProducer(singleDelayedProducer);
        return c13529a;
    }
}