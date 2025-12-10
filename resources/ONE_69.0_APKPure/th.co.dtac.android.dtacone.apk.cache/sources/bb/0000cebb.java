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
    public final Publisher f64073a;

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableLatest$a */
    /* loaded from: classes5.dex */
    public static final class C10792a extends DisposableSubscriber implements Iterator {

        /* renamed from: b */
        public final Semaphore f64074b = new Semaphore(0);

        /* renamed from: c */
        public final AtomicReference f64075c = new AtomicReference();

        /* renamed from: d */
        public Notification f64076d;

        @Override // org.reactivestreams.Subscriber
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f64075c.getAndSet(notification) == null) {
                this.f64074b.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification notification = this.f64076d;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f64076d.getError());
            }
            Notification notification2 = this.f64076d;
            if ((notification2 == null || notification2.isOnNext()) && this.f64076d == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f64074b.acquire();
                    Notification notification3 = (Notification) this.f64075c.getAndSet(null);
                    this.f64076d = notification3;
                    if (notification3.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(notification3.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f64076d = Notification.createOnError(e);
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.f64076d.isOnNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() && this.f64076d.isOnNext()) {
                Object value = this.f64076d.getValue();
                this.f64076d = null;
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
        this.f64073a = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10792a c10792a = new C10792a();
        Flowable.fromPublisher(this.f64073a).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) c10792a);
        return c10792a;
    }
}