package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p046rx.Notification;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorMaterialize */
/* loaded from: classes7.dex */
public final class OperatorMaterialize<T> implements Observable.Operator<Notification<T>, T> {

    /* renamed from: rx.internal.operators.OperatorMaterialize$a */
    /* loaded from: classes7.dex */
    public class C13583a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13585c f78451a;

        public C13583a(C13585c c13585c) {
            this.f78451a = c13585c;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j > 0) {
                this.f78451a.requestMore(j);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMaterialize$b */
    /* loaded from: classes7.dex */
    public static final class C13584b {

        /* renamed from: a */
        public static final OperatorMaterialize f78453a = new OperatorMaterialize();
    }

    /* renamed from: rx.internal.operators.OperatorMaterialize$c */
    /* loaded from: classes7.dex */
    public static class C13585c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78454a;

        /* renamed from: b */
        public volatile Notification f78455b;

        /* renamed from: c */
        public boolean f78456c;

        /* renamed from: d */
        public boolean f78457d;

        /* renamed from: e */
        public final AtomicLong f78458e = new AtomicLong();

        public C13585c(Subscriber subscriber) {
            this.f78454a = subscriber;
        }

        /* renamed from: c */
        private void m23045c() {
            synchronized (this) {
                try {
                    if (this.f78456c) {
                        this.f78457d = true;
                        return;
                    }
                    this.f78456c = true;
                    AtomicLong atomicLong = this.f78458e;
                    while (!this.f78454a.isUnsubscribed()) {
                        Notification notification = this.f78455b;
                        if (notification != null && atomicLong.get() > 0) {
                            this.f78455b = null;
                            this.f78454a.onNext(notification);
                            if (!this.f78454a.isUnsubscribed()) {
                                this.f78454a.onCompleted();
                                return;
                            }
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.f78457d) {
                                    this.f78456c = false;
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* renamed from: b */
        public final void m23046b() {
            long j;
            AtomicLong atomicLong = this.f78458e;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78455b = Notification.createOnCompleted();
            m23045c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78455b = Notification.createOnError(th2);
            RxJavaHooks.onError(th2);
            m23045c();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78454a.onNext(Notification.createOnNext(obj));
            m23046b();
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        public void requestMore(long j) {
            BackpressureUtils.getAndAddRequest(this.f78458e, j);
            request(j);
            m23045c();
        }
    }

    public static <T> OperatorMaterialize<T> instance() {
        return C13584b.f78453a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Notification<T>> subscriber) {
        C13585c c13585c = new C13585c(subscriber);
        subscriber.add(c13585c);
        subscriber.setProducer(new C13583a(c13585c));
        return c13585c;
    }
}
