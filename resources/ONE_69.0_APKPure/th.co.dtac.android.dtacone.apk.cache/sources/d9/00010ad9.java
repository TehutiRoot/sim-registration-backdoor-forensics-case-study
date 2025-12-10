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
    public class C13584a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13586c f78657a;

        public C13584a(C13586c c13586c) {
            this.f78657a = c13586c;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j > 0) {
                this.f78657a.requestMore(j);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMaterialize$b */
    /* loaded from: classes7.dex */
    public static final class C13585b {

        /* renamed from: a */
        public static final OperatorMaterialize f78659a = new OperatorMaterialize();
    }

    /* renamed from: rx.internal.operators.OperatorMaterialize$c */
    /* loaded from: classes7.dex */
    public static class C13586c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78660a;

        /* renamed from: b */
        public volatile Notification f78661b;

        /* renamed from: c */
        public boolean f78662c;

        /* renamed from: d */
        public boolean f78663d;

        /* renamed from: e */
        public final AtomicLong f78664e = new AtomicLong();

        public C13586c(Subscriber subscriber) {
            this.f78660a = subscriber;
        }

        /* renamed from: c */
        private void m23233c() {
            synchronized (this) {
                try {
                    if (this.f78662c) {
                        this.f78663d = true;
                        return;
                    }
                    this.f78662c = true;
                    AtomicLong atomicLong = this.f78664e;
                    while (!this.f78660a.isUnsubscribed()) {
                        Notification notification = this.f78661b;
                        if (notification != null && atomicLong.get() > 0) {
                            this.f78661b = null;
                            this.f78660a.onNext(notification);
                            if (!this.f78660a.isUnsubscribed()) {
                                this.f78660a.onCompleted();
                                return;
                            }
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.f78663d) {
                                    this.f78662c = false;
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
        public final void m23234b() {
            long j;
            AtomicLong atomicLong = this.f78664e;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78661b = Notification.createOnCompleted();
            m23233c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78661b = Notification.createOnError(th2);
            RxJavaHooks.onError(th2);
            m23233c();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78660a.onNext(Notification.createOnNext(obj));
            m23234b();
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        public void requestMore(long j) {
            BackpressureUtils.getAndAddRequest(this.f78664e, j);
            request(j);
            m23233c();
        }
    }

    public static <T> OperatorMaterialize<T> instance() {
        return C13585b.f78659a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Notification<T>> subscriber) {
        C13586c c13586c = new C13586c(subscriber);
        subscriber.add(c13586c);
        subscriber.setProducer(new C13584a(c13586c));
        return c13586c;
    }
}