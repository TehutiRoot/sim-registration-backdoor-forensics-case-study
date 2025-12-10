package p046rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.internal.producers.SingleProducer;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OnSubscribeToObservableFuture */
/* loaded from: classes7.dex */
public final class OnSubscribeToObservableFuture {
    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future) {
        return new C13527a(future);
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new C13527a(future, j, timeUnit);
    }

    /* renamed from: rx.internal.operators.OnSubscribeToObservableFuture$a */
    /* loaded from: classes7.dex */
    public static class C13527a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final Future f78401a;

        /* renamed from: b */
        public final long f78402b;

        /* renamed from: c */
        public final TimeUnit f78403c;

        /* renamed from: rx.internal.operators.OnSubscribeToObservableFuture$a$a */
        /* loaded from: classes7.dex */
        public class C13528a implements Action0 {
            public C13528a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13527a.this.f78401a.cancel(true);
            }
        }

        public C13527a(Future future) {
            this.f78401a = future;
            this.f78402b = 0L;
            this.f78403c = null;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            Object obj;
            subscriber.add(Subscriptions.create(new C13528a()));
            try {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.f78403c;
                if (timeUnit == null) {
                    obj = this.f78401a.get();
                } else {
                    obj = this.f78401a.get(this.f78402b, timeUnit);
                }
                subscriber.setProducer(new SingleProducer(subscriber, obj));
            } catch (Throwable th2) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                Exceptions.throwOrReport(th2, subscriber);
            }
        }

        public C13527a(Future future, long j, TimeUnit timeUnit) {
            this.f78401a = future;
            this.f78402b = j;
            this.f78403c = timeUnit;
        }
    }
}