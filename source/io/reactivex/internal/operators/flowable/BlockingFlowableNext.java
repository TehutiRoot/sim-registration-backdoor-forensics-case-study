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
    public final Publisher f64019a;

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableNext$a */
    /* loaded from: classes5.dex */
    public static final class C10808a implements Iterator {

        /* renamed from: a */
        public final C10809b f64020a;

        /* renamed from: b */
        public final Publisher f64021b;

        /* renamed from: c */
        public Object f64022c;

        /* renamed from: d */
        public boolean f64023d = true;

        /* renamed from: e */
        public boolean f64024e = true;

        /* renamed from: f */
        public Throwable f64025f;

        /* renamed from: g */
        public boolean f64026g;

        public C10808a(Publisher publisher, C10809b c10809b) {
            this.f64021b = publisher;
            this.f64020a = c10809b;
        }

        /* renamed from: a */
        public final boolean m30068a() {
            try {
                if (!this.f64026g) {
                    this.f64026g = true;
                    this.f64020a.m30066b();
                    Flowable.fromPublisher(this.f64021b).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) this.f64020a);
                }
                Notification m30065c = this.f64020a.m30065c();
                if (m30065c.isOnNext()) {
                    this.f64024e = false;
                    this.f64022c = m30065c.getValue();
                    return true;
                }
                this.f64023d = false;
                if (m30065c.isOnComplete()) {
                    return false;
                }
                if (m30065c.isOnError()) {
                    Throwable error = m30065c.getError();
                    this.f64025f = error;
                    throw ExceptionHelper.wrapOrThrow(error);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.f64020a.dispose();
                this.f64025f = e;
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f64025f;
            if (th2 == null) {
                if (!this.f64023d) {
                    return false;
                }
                if (this.f64024e && !m30068a()) {
                    return false;
                }
                return true;
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // java.util.Iterator
        public Object next() {
            Throwable th2 = this.f64025f;
            if (th2 == null) {
                if (hasNext()) {
                    this.f64024e = true;
                    return this.f64022c;
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
    public static final class C10809b extends DisposableSubscriber {

        /* renamed from: b */
        public final BlockingQueue f64027b = new ArrayBlockingQueue(1);

        /* renamed from: c */
        public final AtomicInteger f64028c = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f64028c.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f64027b.offer(notification)) {
                    Notification notification2 = (Notification) this.f64027b.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }

        /* renamed from: b */
        public void m30066b() {
            this.f64028c.set(1);
        }

        /* renamed from: c */
        public Notification m30065c() {
            m30066b();
            BlockingHelper.verifyNonBlocking();
            return (Notification) this.f64027b.take();
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
        this.f64019a = publisher;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C10808a(this.f64019a, new C10809b());
    }
}
