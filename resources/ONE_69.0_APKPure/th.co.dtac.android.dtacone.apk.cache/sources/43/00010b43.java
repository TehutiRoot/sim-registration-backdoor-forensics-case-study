package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorTake */
/* loaded from: classes7.dex */
public final class OperatorTake<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78930a;

    /* renamed from: rx.internal.operators.OperatorTake$a */
    /* loaded from: classes7.dex */
    public class C13657a extends Subscriber {

        /* renamed from: a */
        public int f78931a;

        /* renamed from: b */
        public boolean f78932b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78933c;

        /* renamed from: rx.internal.operators.OperatorTake$a$a */
        /* loaded from: classes7.dex */
        public class C13658a implements Producer {

            /* renamed from: a */
            public final AtomicLong f78935a = new AtomicLong(0);

            /* renamed from: b */
            public final /* synthetic */ Producer f78936b;

            public C13658a(Producer producer) {
                this.f78936b = producer;
            }

            @Override // p046rx.Producer
            public void request(long j) {
                long j2;
                long min;
                if (j > 0 && !C13657a.this.f78932b) {
                    do {
                        j2 = this.f78935a.get();
                        min = Math.min(j, OperatorTake.this.f78930a - j2);
                        if (min == 0) {
                            return;
                        }
                    } while (!this.f78935a.compareAndSet(j2, j2 + min));
                    this.f78936b.request(min);
                }
            }
        }

        public C13657a(Subscriber subscriber) {
            this.f78933c = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78932b) {
                this.f78932b = true;
                this.f78933c.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78932b) {
                this.f78932b = true;
                try {
                    this.f78933c.onError(th2);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            boolean z;
            if (!isUnsubscribed()) {
                int i = this.f78931a;
                int i2 = i + 1;
                this.f78931a = i2;
                int i3 = OperatorTake.this.f78930a;
                if (i < i3) {
                    if (i2 == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f78933c.onNext(obj);
                    if (z && !this.f78932b) {
                        this.f78932b = true;
                        try {
                            this.f78933c.onCompleted();
                        } finally {
                            unsubscribe();
                        }
                    }
                }
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78933c.setProducer(new C13658a(producer));
        }
    }

    public OperatorTake(int i) {
        if (i >= 0) {
            this.f78930a = i;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13657a c13657a = new C13657a(subscriber);
        if (this.f78930a == 0) {
            subscriber.onCompleted();
            c13657a.unsubscribe();
        }
        subscriber.add(c13657a);
        return c13657a;
    }
}