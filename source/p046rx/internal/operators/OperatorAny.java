package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.producers.SingleDelayedProducer;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorAny */
/* loaded from: classes7.dex */
public final class OperatorAny<T> implements Observable.Operator<Boolean, T> {

    /* renamed from: a */
    public final Func1 f78208a;

    /* renamed from: b */
    public final boolean f78209b;

    /* renamed from: rx.internal.operators.OperatorAny$a */
    /* loaded from: classes7.dex */
    public class C13529a extends Subscriber {

        /* renamed from: a */
        public boolean f78210a;

        /* renamed from: b */
        public boolean f78211b;

        /* renamed from: c */
        public final /* synthetic */ SingleDelayedProducer f78212c;

        /* renamed from: d */
        public final /* synthetic */ Subscriber f78213d;

        public C13529a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78212c = singleDelayedProducer;
            this.f78213d = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78211b) {
                this.f78211b = true;
                if (this.f78210a) {
                    this.f78212c.setValue(Boolean.FALSE);
                } else {
                    this.f78212c.setValue(Boolean.valueOf(OperatorAny.this.f78209b));
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78211b) {
                this.f78211b = true;
                this.f78213d.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78211b) {
                return;
            }
            this.f78210a = true;
            try {
                if (((Boolean) OperatorAny.this.f78208a.call(obj)).booleanValue()) {
                    this.f78211b = true;
                    this.f78212c.setValue(Boolean.valueOf(true ^ OperatorAny.this.f78209b));
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public OperatorAny(Func1<? super T, Boolean> func1, boolean z) {
        this.f78208a = func1;
        this.f78209b = z;
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
