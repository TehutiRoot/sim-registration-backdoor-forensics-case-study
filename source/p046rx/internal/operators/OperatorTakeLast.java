package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OperatorTakeLast */
/* loaded from: classes7.dex */
public final class OperatorTakeLast<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78732a;

    /* renamed from: rx.internal.operators.OperatorTakeLast$a */
    /* loaded from: classes7.dex */
    public class C13658a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13659b f78733a;

        public C13658a(C13659b c13659b) {
            this.f78733a = c13659b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78733a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeLast$b */
    /* loaded from: classes7.dex */
    public static final class C13659b extends Subscriber implements Func1 {

        /* renamed from: a */
        public final Subscriber f78735a;

        /* renamed from: b */
        public final AtomicLong f78736b = new AtomicLong();

        /* renamed from: c */
        public final ArrayDeque f78737c = new ArrayDeque();

        /* renamed from: d */
        public final int f78738d;

        public C13659b(Subscriber subscriber, int i) {
            this.f78735a = subscriber;
            this.f78738d = i;
        }

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            return NotificationLite.getValue(obj);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            BackpressureUtils.postCompleteDone(this.f78736b, this.f78737c, this.f78735a, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78737c.clear();
            this.f78735a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78737c.size() == this.f78738d) {
                this.f78737c.poll();
            }
            this.f78737c.offer(NotificationLite.next(obj));
        }

        public void requestMore(long j) {
            if (j > 0) {
                BackpressureUtils.postCompleteRequest(this.f78736b, j, this.f78737c, this.f78735a, this);
            }
        }
    }

    public OperatorTakeLast(int i) {
        if (i >= 0) {
            this.f78732a = i;
            return;
        }
        throw new IndexOutOfBoundsException("count cannot be negative");
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13659b c13659b = new C13659b(subscriber, this.f78732a);
        subscriber.add(c13659b);
        subscriber.setProducer(new C13658a(c13659b));
        return c13659b;
    }
}
