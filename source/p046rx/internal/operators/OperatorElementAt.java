package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorElementAt */
/* loaded from: classes7.dex */
public final class OperatorElementAt<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78364a;

    /* renamed from: b */
    public final boolean f78365b;

    /* renamed from: c */
    public final Object f78366c;

    /* renamed from: rx.internal.operators.OperatorElementAt$InnerProducer */
    /* loaded from: classes7.dex */
    public static class InnerProducer extends AtomicBoolean implements Producer {
        private static final long serialVersionUID = 1;
        final Producer actual;

        public InnerProducer(Producer producer) {
            this.actual = producer;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i > 0 && compareAndSet(false, true)) {
                    this.actual.request(Long.MAX_VALUE);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required");
        }
    }

    /* renamed from: rx.internal.operators.OperatorElementAt$a */
    /* loaded from: classes7.dex */
    public class C13569a extends Subscriber {

        /* renamed from: a */
        public int f78367a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78368b;

        public C13569a(Subscriber subscriber) {
            this.f78368b = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            int i = this.f78367a;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i <= operatorElementAt.f78364a) {
                if (operatorElementAt.f78365b) {
                    this.f78368b.onNext(operatorElementAt.f78366c);
                    this.f78368b.onCompleted();
                    return;
                }
                Subscriber subscriber = this.f78368b;
                subscriber.onError(new IndexOutOfBoundsException(OperatorElementAt.this.f78364a + " is out of bounds"));
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78368b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78367a;
            this.f78367a = i + 1;
            if (i == OperatorElementAt.this.f78364a) {
                this.f78368b.onNext(obj);
                this.f78368b.onCompleted();
                unsubscribe();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78368b.setProducer(new InnerProducer(producer));
        }
    }

    public OperatorElementAt(int i) {
        this(i, null, false);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13569a c13569a = new C13569a(subscriber);
        subscriber.add(c13569a);
        return c13569a;
    }

    public OperatorElementAt(int i, Object obj, boolean z) {
        if (i >= 0) {
            this.f78364a = i;
            this.f78366c = obj;
            this.f78365b = z;
            return;
        }
        throw new IndexOutOfBoundsException(i + " is out of bounds");
    }
}
