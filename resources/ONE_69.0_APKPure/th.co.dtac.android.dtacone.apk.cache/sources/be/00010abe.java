package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorElementAt */
/* loaded from: classes7.dex */
public final class OperatorElementAt<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78570a;

    /* renamed from: b */
    public final boolean f78571b;

    /* renamed from: c */
    public final Object f78572c;

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
    public class C13570a extends Subscriber {

        /* renamed from: a */
        public int f78573a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78574b;

        public C13570a(Subscriber subscriber) {
            this.f78574b = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            int i = this.f78573a;
            OperatorElementAt operatorElementAt = OperatorElementAt.this;
            if (i <= operatorElementAt.f78570a) {
                if (operatorElementAt.f78571b) {
                    this.f78574b.onNext(operatorElementAt.f78572c);
                    this.f78574b.onCompleted();
                    return;
                }
                Subscriber subscriber = this.f78574b;
                subscriber.onError(new IndexOutOfBoundsException(OperatorElementAt.this.f78570a + " is out of bounds"));
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78574b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78573a;
            this.f78573a = i + 1;
            if (i == OperatorElementAt.this.f78570a) {
                this.f78574b.onNext(obj);
                this.f78574b.onCompleted();
                unsubscribe();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78574b.setProducer(new InnerProducer(producer));
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
        C13570a c13570a = new C13570a(subscriber);
        subscriber.add(c13570a);
        return c13570a;
    }

    public OperatorElementAt(int i, Object obj, boolean z) {
        if (i >= 0) {
            this.f78570a = i;
            this.f78572c = obj;
            this.f78571b = z;
            return;
        }
        throw new IndexOutOfBoundsException(i + " is out of bounds");
    }
}