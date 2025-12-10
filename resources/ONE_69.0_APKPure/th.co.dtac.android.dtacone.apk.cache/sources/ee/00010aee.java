package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action1;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorOnBackpressureDrop */
/* loaded from: classes7.dex */
public class OperatorOnBackpressureDrop<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Action1 f78733a;

    /* renamed from: rx.internal.operators.OperatorOnBackpressureDrop$a */
    /* loaded from: classes7.dex */
    public class C13599a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ AtomicLong f78734a;

        public C13599a(AtomicLong atomicLong) {
            this.f78734a = atomicLong;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            BackpressureUtils.getAndAddRequest(this.f78734a, j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureDrop$b */
    /* loaded from: classes7.dex */
    public class C13600b extends Subscriber {

        /* renamed from: a */
        public boolean f78736a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78737b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f78738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13600b(Subscriber subscriber, Subscriber subscriber2, AtomicLong atomicLong) {
            super(subscriber);
            this.f78737b = subscriber2;
            this.f78738c = atomicLong;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78736a) {
                this.f78736a = true;
                this.f78737b.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78736a) {
                this.f78736a = true;
                this.f78737b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78736a) {
                return;
            }
            if (this.f78738c.get() > 0) {
                this.f78737b.onNext(obj);
                this.f78738c.decrementAndGet();
                return;
            }
            Action1 action1 = OperatorOnBackpressureDrop.this.f78733a;
            if (action1 != null) {
                try {
                    action1.call(obj);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this, obj);
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureDrop$c */
    /* loaded from: classes7.dex */
    public static final class C13601c {

        /* renamed from: a */
        public static final OperatorOnBackpressureDrop f78740a = new OperatorOnBackpressureDrop();
    }

    public OperatorOnBackpressureDrop() {
        this(null);
    }

    public static <T> OperatorOnBackpressureDrop<T> instance() {
        return C13601c.f78740a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorOnBackpressureDrop(Action1<? super T> action1) {
        this.f78733a = action1;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        AtomicLong atomicLong = new AtomicLong();
        subscriber.setProducer(new C13599a(atomicLong));
        return new C13600b(subscriber, subscriber, atomicLong);
    }
}