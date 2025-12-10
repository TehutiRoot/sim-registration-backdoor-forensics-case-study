package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {

    /* renamed from: a */
    public final ObservableSource f64994a;

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableNext$a */
    /* loaded from: classes5.dex */
    public static final class C10962a implements Iterator {

        /* renamed from: a */
        public final C10963b f64995a;

        /* renamed from: b */
        public final ObservableSource f64996b;

        /* renamed from: c */
        public Object f64997c;

        /* renamed from: d */
        public boolean f64998d = true;

        /* renamed from: e */
        public boolean f64999e = true;

        /* renamed from: f */
        public Throwable f65000f;

        /* renamed from: g */
        public boolean f65001g;

        public C10962a(ObservableSource observableSource, C10963b c10963b) {
            this.f64996b = observableSource;
            this.f64995a = c10963b;
        }

        /* renamed from: a */
        public final boolean m29997a() {
            if (!this.f65001g) {
                this.f65001g = true;
                this.f64995a.m29995b();
                new ObservableMaterialize(this.f64996b).subscribe(this.f64995a);
            }
            try {
                Notification m29994c = this.f64995a.m29994c();
                if (m29994c.isOnNext()) {
                    this.f64999e = false;
                    this.f64997c = m29994c.getValue();
                    return true;
                }
                this.f64998d = false;
                if (m29994c.isOnComplete()) {
                    return false;
                }
                Throwable error = m29994c.getError();
                this.f65000f = error;
                throw ExceptionHelper.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.f64995a.dispose();
                this.f65000f = e;
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f65000f;
            if (th2 == null) {
                if (!this.f64998d) {
                    return false;
                }
                if (this.f64999e && !m29997a()) {
                    return false;
                }
                return true;
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // java.util.Iterator
        public Object next() {
            Throwable th2 = this.f65000f;
            if (th2 == null) {
                if (hasNext()) {
                    this.f64999e = true;
                    return this.f64997c;
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

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableNext$b */
    /* loaded from: classes5.dex */
    public static final class C10963b extends DisposableObserver {

        /* renamed from: b */
        public final BlockingQueue f65002b = new ArrayBlockingQueue(1);

        /* renamed from: c */
        public final AtomicInteger f65003c = new AtomicInteger();

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f65003c.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f65002b.offer(notification)) {
                    Notification notification2 = (Notification) this.f65002b.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }

        /* renamed from: b */
        public void m29995b() {
            this.f65003c.set(1);
        }

        /* renamed from: c */
        public Notification m29994c() {
            m29995b();
            BlockingHelper.verifyNonBlocking();
            return (Notification) this.f65002b.take();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }
    }

    public BlockingObservableNext(ObservableSource<T> observableSource) {
        this.f64994a = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C10962a(this.f64994a, new C10963b());
    }
}
