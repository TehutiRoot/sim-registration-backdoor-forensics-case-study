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
    public final Action1 f78527a;

    /* renamed from: rx.internal.operators.OperatorOnBackpressureDrop$a */
    /* loaded from: classes7.dex */
    public class C13598a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ AtomicLong f78528a;

        public C13598a(AtomicLong atomicLong) {
            this.f78528a = atomicLong;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            BackpressureUtils.getAndAddRequest(this.f78528a, j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureDrop$b */
    /* loaded from: classes7.dex */
    public class C13599b extends Subscriber {

        /* renamed from: a */
        public boolean f78530a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78531b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f78532c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13599b(Subscriber subscriber, Subscriber subscriber2, AtomicLong atomicLong) {
            super(subscriber);
            this.f78531b = subscriber2;
            this.f78532c = atomicLong;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78530a) {
                this.f78530a = true;
                this.f78531b.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78530a) {
                this.f78530a = true;
                this.f78531b.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78530a) {
                return;
            }
            if (this.f78532c.get() > 0) {
                this.f78531b.onNext(obj);
                this.f78532c.decrementAndGet();
                return;
            }
            Action1 action1 = OperatorOnBackpressureDrop.this.f78527a;
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
    public static final class C13600c {

        /* renamed from: a */
        public static final OperatorOnBackpressureDrop f78534a = new OperatorOnBackpressureDrop();
    }

    public OperatorOnBackpressureDrop() {
        this(null);
    }

    public static <T> OperatorOnBackpressureDrop<T> instance() {
        return C13600c.f78534a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorOnBackpressureDrop(Action1<? super T> action1) {
        this.f78527a = action1;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        AtomicLong atomicLong = new AtomicLong();
        subscriber.setProducer(new C13598a(atomicLong));
        return new C13599b(subscriber, subscriber, atomicLong);
    }
}
