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
    public final Publisher f66010a;

    /* renamed from: io.reactivex.internal.operators.single.SingleFromPublisher$a */
    /* loaded from: classes5.dex */
    public static final class C11114a implements FlowableSubscriber, Disposable {

        /* renamed from: a */
        public final SingleObserver f66011a;

        /* renamed from: b */
        public Subscription f66012b;

        /* renamed from: c */
        public Object f66013c;

        /* renamed from: d */
        public boolean f66014d;

        /* renamed from: e */
        public volatile boolean f66015e;

        public C11114a(SingleObserver singleObserver) {
            this.f66011a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f66015e = true;
            this.f66012b.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66015e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f66014d) {
                return;
            }
            this.f66014d = true;
            Object obj = this.f66013c;
            this.f66013c = null;
            if (obj == null) {
                this.f66011a.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f66011a.onSuccess(obj);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f66014d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f66014d = true;
            this.f66013c = null;
            this.f66011a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f66014d) {
                return;
            }
            if (this.f66013c != null) {
                this.f66012b.cancel();
                this.f66014d = true;
                this.f66013c = null;
                this.f66011a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
                return;
            }
            this.f66013c = obj;
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f66012b, subscription)) {
                this.f66012b = subscription;
                this.f66011a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(Publisher<? extends T> publisher) {
        this.f66010a = publisher;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f66010a.subscribe(new C11114a(singleObserver));
    }
}