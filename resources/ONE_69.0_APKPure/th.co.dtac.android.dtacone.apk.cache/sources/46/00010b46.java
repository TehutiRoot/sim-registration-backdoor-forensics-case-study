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
    public final int f78938a;

    /* renamed from: rx.internal.operators.OperatorTakeLast$a */
    /* loaded from: classes7.dex */
    public class C13659a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13660b f78939a;

        public C13659a(C13660b c13660b) {
            this.f78939a = c13660b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78939a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeLast$b */
    /* loaded from: classes7.dex */
    public static final class C13660b extends Subscriber implements Func1 {

        /* renamed from: a */
        public final Subscriber f78941a;

        /* renamed from: b */
        public final AtomicLong f78942b = new AtomicLong();

        /* renamed from: c */
        public final ArrayDeque f78943c = new ArrayDeque();

        /* renamed from: d */
        public final int f78944d;

        public C13660b(Subscriber subscriber, int i) {
            this.f78941a = subscriber;
            this.f78944d = i;
        }

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            return NotificationLite.getValue(obj);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            BackpressureUtils.postCompleteDone(this.f78942b, this.f78943c, this.f78941a, this);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78943c.clear();
            this.f78941a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78943c.size() == this.f78944d) {
                this.f78943c.poll();
            }
            this.f78943c.offer(NotificationLite.next(obj));
        }

        public void requestMore(long j) {
            if (j > 0) {
                BackpressureUtils.postCompleteRequest(this.f78942b, j, this.f78943c, this.f78941a, this);
            }
        }
    }

    public OperatorTakeLast(int i) {
        if (i >= 0) {
            this.f78938a = i;
            return;
        }
        throw new IndexOutOfBoundsException("count cannot be negative");
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13660b c13660b = new C13660b(subscriber, this.f78938a);
        subscriber.add(c13660b);
        subscriber.setProducer(new C13659a(c13660b));
        return c13660b;
    }
}