package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OperatorMapNotification */
/* loaded from: classes7.dex */
public final class OperatorMapNotification<T, R> implements Observable.Operator<R, T> {

    /* renamed from: a */
    public final Func1 f78634a;

    /* renamed from: b */
    public final Func1 f78635b;

    /* renamed from: c */
    public final Func0 f78636c;

    /* renamed from: rx.internal.operators.OperatorMapNotification$a */
    /* loaded from: classes7.dex */
    public class C13579a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13580b f78637a;

        public C13579a(C13580b c13580b) {
            this.f78637a = c13580b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78637a.m23237c(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorMapNotification$b */
    /* loaded from: classes7.dex */
    public static final class C13580b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78639a;

        /* renamed from: b */
        public final Func1 f78640b;

        /* renamed from: c */
        public final Func1 f78641c;

        /* renamed from: d */
        public final Func0 f78642d;

        /* renamed from: e */
        public final AtomicLong f78643e = new AtomicLong();

        /* renamed from: f */
        public final AtomicLong f78644f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference f78645g = new AtomicReference();

        /* renamed from: h */
        public long f78646h;

        /* renamed from: i */
        public Object f78647i;

        public C13580b(Subscriber subscriber, Func1 func1, Func1 func12, Func0 func0) {
            this.f78639a = subscriber;
            this.f78640b = func1;
            this.f78641c = func12;
            this.f78642d = func0;
        }

        /* renamed from: b */
        public void m23238b() {
            long j = this.f78646h;
            if (j != 0 && this.f78645g.get() != null) {
                BackpressureUtils.produced(this.f78643e, j);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m23237c(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i == 0) {
                    return;
                }
                while (true) {
                    long j2 = this.f78643e.get();
                    if ((j2 & Long.MIN_VALUE) != 0) {
                        long j3 = Long.MAX_VALUE & j2;
                        if (this.f78643e.compareAndSet(j2, Long.MIN_VALUE | BackpressureUtils.addCap(j3, j))) {
                            if (j3 == 0) {
                                if (!this.f78639a.isUnsubscribed()) {
                                    this.f78639a.onNext(this.f78647i);
                                }
                                if (!this.f78639a.isUnsubscribed()) {
                                    this.f78639a.onCompleted();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        if (this.f78643e.compareAndSet(j2, BackpressureUtils.addCap(j2, j))) {
                            AtomicReference atomicReference = this.f78645g;
                            Producer producer = (Producer) atomicReference.get();
                            if (producer != null) {
                                producer.request(j);
                                return;
                            }
                            BackpressureUtils.getAndAddRequest(this.f78644f, j);
                            Producer producer2 = (Producer) atomicReference.get();
                            if (producer2 != null) {
                                long andSet = this.f78644f.getAndSet(0L);
                                if (andSet != 0) {
                                    producer2.request(andSet);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public void m23236d() {
            long j;
            do {
                j = this.f78643e.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f78643e.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.f78645g.get() == null) {
                if (!this.f78639a.isUnsubscribed()) {
                    this.f78639a.onNext(this.f78647i);
                }
                if (!this.f78639a.isUnsubscribed()) {
                    this.f78639a.onCompleted();
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23238b();
            try {
                this.f78647i = this.f78642d.call();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78639a);
            }
            m23236d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            m23238b();
            try {
                this.f78647i = this.f78641c.call(th2);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78639a, th2);
            }
            m23236d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78646h++;
                this.f78639a.onNext(this.f78640b.call(obj));
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78639a, obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (AbstractC23094xo1.m479a(this.f78645g, null, producer)) {
                long andSet = this.f78644f.getAndSet(0L);
                if (andSet != 0) {
                    producer.request(andSet);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Producer already set!");
        }
    }

    public OperatorMapNotification(Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func12, Func0<? extends R> func0) {
        this.f78634a = func1;
        this.f78635b = func12;
        this.f78636c = func0;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        C13580b c13580b = new C13580b(subscriber, this.f78634a, this.f78635b, this.f78636c);
        subscriber.add(c13580b);
        subscriber.setProducer(new C13579a(c13580b));
        return c13580b;
    }
}