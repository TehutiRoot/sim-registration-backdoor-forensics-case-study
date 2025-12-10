package hu.akarnokd.rxjava.interop;

import io.reactivex.Flowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;
import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: hu.akarnokd.rxjava.interop.a */
/* loaded from: classes5.dex */
public final class C10422a extends Flowable {

    /* renamed from: b */
    public final Observable f62640b;

    /* renamed from: hu.akarnokd.rxjava.interop.a$a */
    /* loaded from: classes5.dex */
    public static final class C10423a extends Subscriber {

        /* renamed from: a */
        public final org.reactivestreams.Subscriber f62641a;

        /* renamed from: b */
        public boolean f62642b;

        public C10423a(org.reactivestreams.Subscriber subscriber) {
            this.f62641a = subscriber;
            request(0L);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f62642b) {
                return;
            }
            this.f62642b = true;
            this.f62641a.onComplete();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f62642b) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f62642b = true;
            this.f62641a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f62642b) {
                return;
            }
            if (obj == null) {
                unsubscribe();
                onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                return;
            }
            this.f62641a.onNext(obj);
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    /* renamed from: hu.akarnokd.rxjava.interop.a$b */
    /* loaded from: classes5.dex */
    public static final class C10424b implements Subscription {

        /* renamed from: a */
        public final C10423a f62643a;

        public C10424b(C10423a c10423a) {
            this.f62643a = c10423a;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62643a.unsubscribe();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f62643a.requestMore(j);
        }
    }

    public C10422a(Observable observable) {
        this.f62640b = observable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber subscriber) {
        C10423a c10423a = new C10423a(subscriber);
        subscriber.onSubscribe(new C10424b(c10423a));
        this.f62640b.unsafeSubscribe(c10423a);
    }
}
