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
    public final Func1 f78414a;

    /* renamed from: b */
    public final boolean f78415b;

    /* renamed from: rx.internal.operators.OperatorAny$a */
    /* loaded from: classes7.dex */
    public class C13530a extends Subscriber {

        /* renamed from: a */
        public boolean f78416a;

        /* renamed from: b */
        public boolean f78417b;

        /* renamed from: c */
        public final /* synthetic */ SingleDelayedProducer f78418c;

        /* renamed from: d */
        public final /* synthetic */ Subscriber f78419d;

        public C13530a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78418c = singleDelayedProducer;
            this.f78419d = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78417b) {
                this.f78417b = true;
                if (this.f78416a) {
                    this.f78418c.setValue(Boolean.FALSE);
                } else {
                    this.f78418c.setValue(Boolean.valueOf(OperatorAny.this.f78415b));
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78417b) {
                this.f78417b = true;
                this.f78419d.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78417b) {
                return;
            }
            this.f78416a = true;
            try {
                if (((Boolean) OperatorAny.this.f78414a.call(obj)).booleanValue()) {
                    this.f78417b = true;
                    this.f78418c.setValue(Boolean.valueOf(true ^ OperatorAny.this.f78415b));
                    unsubscribe();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this, obj);
            }
        }
    }

    public OperatorAny(Func1<? super T, Boolean> func1, boolean z) {
        this.f78414a = func1;
        this.f78415b = z;
    }

    @Override // p046rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Boolean> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13530a c13530a = new C13530a(singleDelayedProducer, subscriber);
        subscriber.add(c13530a);
        subscriber.setProducer(singleDelayedProducer);
        return c13530a;
    }
}