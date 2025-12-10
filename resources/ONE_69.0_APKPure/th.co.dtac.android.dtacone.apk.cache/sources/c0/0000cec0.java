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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* loaded from: classes5.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {

    /* renamed from: a */
    public final Publisher f64082a;

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableNext$a */
    /* loaded from: classes5.dex */
    public static final class C10795a implements Iterator {

        /* renamed from: a */
        public final C10796b f64083a;

        /* renamed from: b */
        public final Publisher f64084b;

        /* renamed from: c */
        public Object f64085c;

        /* renamed from: d */
        public boolean f64086d = true;

        /* renamed from: e */
        public boolean f64087e = true;

        /* renamed from: f */
        public Throwable f64088f;

        /* renamed from: g */
        public boolean f64089g;

        public C10795a(Publisher publisher, C10796b c10796b) {
            this.f64084b = publisher;
            this.f64083a = c10796b;
        }

        /* renamed from: a */
        public final boolean m30408a() {
            try {
                if (!this.f64089g) {
                    this.f64089g = true;
                    this.f64083a.m30406b();
                    Flowable.fromPublisher(this.f64084b).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) this.f64083a);
                }
                Notification m30405c = this.f64083a.m30405c();
                if (m30405c.isOnNext()) {
                    this.f64087e = false;
                    this.f64085c = m30405c.getValue();
                    return true;
                }
                this.f64086d = false;
                if (m30405c.isOnComplete()) {
                    return false;
                }
                if (m30405c.isOnError()) {
                    Throwable error = m30405c.getError();
                    this.f64088f = error;
                    throw ExceptionHelper.wrapOrThrow(error);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.f64083a.dispose();
                this.f64088f = e;
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f64088f;
            if (th2 == null) {
                if (!this.f64086d) {
                    return false;
                }
                if (this.f64087e && !m30408a()) {
                    return false;
                }
                return true;
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // java.util.Iterator
        public Object next() {
            Throwable th2 = this.f64088f;
            if (th2 == null) {
                if (hasNext()) {
                    this.f64087e = true;
                    return this.f64085c;
                }
                throw new NoSuchElementException("No more elements");
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableNext$b */
    /* loaded from: classes5.dex */
    public static final class C10796b extends DisposableSubscriber {

        /* renamed from: b */
        public final BlockingQueue f64090b = new ArrayBlockingQueue(1);

        /* renamed from: c */
        public final AtomicInteger f64091c = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f64091c.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f64090b.offer(notification)) {
                    Notification notification2 = (Notification) this.f64090b.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }

        /* renamed from: b */
        public void m30406b() {
            this.f64091c.set(1);
        }

        /* renamed from: c */
        public Notification m30405c() {
            m30406b();
            BlockingHelper.verifyNonBlocking();
            return (Notification) this.f64090b.take();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }
    }

    public BlockingFlowableNext(Publisher<? extends T> publisher) {
        this.f64082a = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C10795a(this.f64082a, new C10796b());
    }
}