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
    public final Func1 f78203a;

    /* renamed from: rx.internal.operators.OperatorAll$a */
    /* loaded from: classes7.dex */
    public class C13528a extends Subscriber {

        /* renamed from: a */
        public boolean f78204a;

        /* renamed from: b */
        public final /* synthetic */ SingleDelayedProducer f78205b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78206c;

        public C13528a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78205b = singleDelayedProducer;
            this.f78206c = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78204a) {
                this.f78204a = true;
                this.f78205b.setValue(Boolean.TRUE);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78204a) {
                this.f78204a = true;
                this.f78206c.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78204a) {
                return;
            }
            try {
                if (!((Boolean) OperatorAll.this.f78203a.call(obj)).booleanValue()) {
                    this.f78204a = true;
                    this.f78205b.setValue(Boolean.FALSE);
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public OperatorAll(Func1<? super T, Boolean> func1) {
        this.f78203a = func1;
    }

    @Override // p046rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Boolean> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13528a c13528a = new C13528a(singleDelayedProducer, subscriber);
        subscriber.add(c13528a);
        subscriber.setProducer(singleDelayedProducer);
        return c13528a;
    }
}
