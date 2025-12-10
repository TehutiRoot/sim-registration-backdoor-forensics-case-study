package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    /* renamed from: a */
    public final Publisher f65947a;

    /* renamed from: io.reactivex.internal.operators.single.SingleFromPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C11127a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f65948a;

        /* renamed from: b */
        public Subscription f65949b;

        /* renamed from: c */
        public Object f65950c;

        /* renamed from: d */
        public boolean f65951d;

        /* renamed from: e */
        public volatile boolean f65952e;

        public C11127a(SingleObserver singleObserver) {
            this.f65948a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65952e = true;
            this.f65949b.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65952e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65951d) {
                return;
            }
            this.f65951d = true;
            Object obj = this.f65950c;
            this.f65950c = null;
            if (obj == null) {
                this.f65948a.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f65948a.onSuccess(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65951d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65951d = true;
            this.f65950c = null;
            this.f65948a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f65951d) {
                return;
            }
            if (this.f65950c != null) {
                this.f65949b.cancel();
                this.f65951d = true;
                this.f65950c = null;
                this.f65948a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
                return;
            }
            this.f65950c = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65949b, subscription)) {
                this.f65949b = subscription;
                this.f65948a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(Publisher<? extends T> publisher) {
        this.f65947a = publisher;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65947a.subscribe(new C11127a(singleObserver));
    }
}
