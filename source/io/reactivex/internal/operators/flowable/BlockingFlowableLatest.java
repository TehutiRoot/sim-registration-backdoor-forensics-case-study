package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* loaded from: classes5.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {

    /* renamed from: a */
    public final Publisher f64010a;

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableLatest$a */
    /* loaded from: classes5.dex */
    public static final class C10805a extends DisposableSubscriber implements Iterator {

        /* renamed from: b */
        public final Semaphore f64011b = new Semaphore(0);

        /* renamed from: c */
        public final AtomicReference f64012c = new AtomicReference();

        /* renamed from: d */
        public Notification f64013d;

        @Override // org.reactivestreams.Subscriber
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f64012c.getAndSet(notification) == null) {
                this.f64011b.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification notification = this.f64013d;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f64013d.getError());
            }
            Notification notification2 = this.f64013d;
            if ((notification2 == null || notification2.isOnNext()) && this.f64013d == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f64011b.acquire();
                    Notification notification3 = (Notification) this.f64012c.getAndSet(null);
                    this.f64013d = notification3;
                    if (notification3.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(notification3.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f64013d = Notification.createOnError(e);
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.f64013d.isOnNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() && this.f64013d.isOnNext()) {
                Object value = this.f64013d.getValue();
                this.f64013d = null;
                return value;
            }
            throw new NoSuchElementException();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public BlockingFlowableLatest(Publisher<? extends T> publisher) {
        this.f64010a = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10805a c10805a = new C10805a();
        Flowable.fromPublisher(this.f64010a).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) c10805a);
        return c10805a;
    }
}
