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
    public final Class f78274a;

    /* renamed from: rx.internal.operators.OperatorCast$a */
    /* loaded from: classes7.dex */
    public static final class C13544a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78275a;

        /* renamed from: b */
        public final Class f78276b;

        /* renamed from: c */
        public boolean f78277c;

        public C13544a(Subscriber subscriber, Class cls) {
            this.f78275a = subscriber;
            this.f78276b = cls;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78277c) {
                return;
            }
            this.f78275a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78277c) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78277c = true;
            this.f78275a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78275a.onNext(this.f78276b.cast(obj));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78275a.setProducer(producer);
        }
    }

    public OperatorCast(Class<R> cls) {
        this.f78274a = cls;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        C13544a c13544a = new C13544a(subscriber, this.f78274a);
        subscriber.add(c13544a);
        return c13544a;
    }
}
