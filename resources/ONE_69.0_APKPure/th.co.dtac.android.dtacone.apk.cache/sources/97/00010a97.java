package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorCast */
/* loaded from: classes7.dex */
public class OperatorCast<T, R> implements Observable.Operator<R, T> {

    /* renamed from: a */
    public final Class f78480a;

    /* renamed from: rx.internal.operators.OperatorCast$a */
    /* loaded from: classes7.dex */
    public static final class C13545a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78481a;

        /* renamed from: b */
        public final Class f78482b;

        /* renamed from: c */
        public boolean f78483c;

        public C13545a(Subscriber subscriber, Class cls) {
            this.f78481a = subscriber;
            this.f78482b = cls;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78483c) {
                return;
            }
            this.f78481a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78483c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78483c = true;
            this.f78481a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78481a.onNext(this.f78482b.cast(obj));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78481a.setProducer(producer);
        }
    }

    public OperatorCast(Class<R> cls) {
        this.f78480a = cls;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        C13545a c13545a = new C13545a(subscriber, this.f78480a);
        subscriber.add(c13545a);
        return c13545a;
    }
}