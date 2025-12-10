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
    public final Func1 f78428a;

    /* renamed from: b */
    public final Func1 f78429b;

    /* renamed from: c */
    public final Func0 f78430c;

    /* renamed from: rx.internal.operators.OperatorMapNotification$a */
    /* loaded from: classes7.dex */
    public class C13578a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13579b f78431a;

        public C13578a(C13579b c13579b) {
            this.f78431a = c13579b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78431a.m23049c(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorMapNotification$b */
    /* loaded from: classes7.dex */
    public static final class C13579b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78433a;

        /* renamed from: b */
        public final Func1 f78434b;

        /* renamed from: c */
        public final Func1 f78435c;

        /* renamed from: d */
        public final Func0 f78436d;

        /* renamed from: e */
        public final AtomicLong f78437e = new AtomicLong();

        /* renamed from: f */
        public final AtomicLong f78438f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference f78439g = new AtomicReference();

        /* renamed from: h */
        public long f78440h;

        /* renamed from: i */
        public Object f78441i;

        public C13579b(Subscriber subscriber, Func1 func1, Func1 func12, Func0 func0) {
            this.f78433a = subscriber;
            this.f78434b = func1;
            this.f78435c = func12;
            this.f78436d = func0;
        }

        /* renamed from: b */
        public void m23050b() {
            long j = this.f78440h;
            if (j != 0 && this.f78439g.get() != null) {
                BackpressureUtils.produced(this.f78437e, j);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m23049c(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i == 0) {
                    return;
                }
                while (true) {
                    long j2 = this.f78437e.get();
                    if ((j2 & Long.MIN_VALUE) != 0) {
                        long j3 = Long.MAX_VALUE & j2;
                        if (this.f78437e.compareAndSet(j2, Long.MIN_VALUE | BackpressureUtils.addCap(j3, j))) {
                            if (j3 == 0) {
                                if (!this.f78433a.isUnsubscribed()) {
                                    this.f78433a.onNext(this.f78441i);
                                }
                                if (!this.f78433a.isUnsubscribed()) {
                                    this.f78433a.onCompleted();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        if (this.f78437e.compareAndSet(j2, BackpressureUtils.addCap(j2, j))) {
                            AtomicReference atomicReference = this.f78439g;
                            Producer producer = (Producer) atomicReference.get();
                            if (producer != null) {
                                producer.request(j);
                                return;
                            }
                            BackpressureUtils.getAndAddRequest(this.f78438f, j);
                            Producer producer2 = (Producer) atomicReference.get();
                            if (producer2 != null) {
                                long andSet = this.f78438f.getAndSet(0L);
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
        public void m23048d() {
            long j;
            do {
                j = this.f78437e.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f78437e.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.f78439g.get() == null) {
                if (!this.f78433a.isUnsubscribed()) {
                    this.f78433a.onNext(this.f78441i);
                }
                if (!this.f78433a.isUnsubscribed()) {
                    this.f78433a.onCompleted();
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23050b();
            try {
                this.f78441i = this.f78436d.call();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78433a);
            }
            m23048d();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            m23050b();
            try {
                this.f78441i = this.f78435c.call(th2);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78433a, th2);
            }
            m23048d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78440h++;
                this.f78433a.onNext(this.f78434b.call(obj));
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78433a, obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (AbstractC17300An1.m69050a(this.f78439g, null, producer)) {
                long andSet = this.f78438f.getAndSet(0L);
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
        this.f78428a = func1;
        this.f78429b = func12;
        this.f78430c = func0;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        C13579b c13579b = new C13579b(subscriber, this.f78428a, this.f78429b, this.f78430c);
        subscriber.add(c13579b);
        subscriber.setProducer(new C13578a(c13579b));
        return c13579b;
    }
}
