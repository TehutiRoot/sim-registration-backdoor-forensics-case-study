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
    public final ObservableSource f65057a;

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableNext$a */
    /* loaded from: classes5.dex */
    public static final class C10949a implements Iterator {

        /* renamed from: a */
        public final C10950b f65058a;

        /* renamed from: b */
        public final ObservableSource f65059b;

        /* renamed from: c */
        public Object f65060c;

        /* renamed from: d */
        public boolean f65061d = true;

        /* renamed from: e */
        public boolean f65062e = true;

        /* renamed from: f */
        public Throwable f65063f;

        /* renamed from: g */
        public boolean f65064g;

        public C10949a(ObservableSource observableSource, C10950b c10950b) {
            this.f65059b = observableSource;
            this.f65058a = c10950b;
        }

        /* renamed from: a */
        public final boolean m30337a() {
            if (!this.f65064g) {
                this.f65064g = true;
                this.f65058a.m30335b();
                new ObservableMaterialize(this.f65059b).subscribe(this.f65058a);
            }
            try {
                Notification m30334c = this.f65058a.m30334c();
                if (m30334c.isOnNext()) {
                    this.f65062e = false;
                    this.f65060c = m30334c.getValue();
                    return true;
                }
                this.f65061d = false;
                if (m30334c.isOnComplete()) {
                    return false;
                }
                Throwable error = m30334c.getError();
                this.f65063f = error;
                throw ExceptionHelper.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.f65058a.dispose();
                this.f65063f = e;
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f65063f;
            if (th2 == null) {
                if (!this.f65061d) {
                    return false;
                }
                if (this.f65062e && !m30337a()) {
                    return false;
                }
                return true;
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // java.util.Iterator
        public Object next() {
            Throwable th2 = this.f65063f;
            if (th2 == null) {
                if (hasNext()) {
                    this.f65062e = true;
                    return this.f65060c;
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
    public static final class C10950b extends DisposableObserver {

        /* renamed from: b */
        public final BlockingQueue f65065b = new ArrayBlockingQueue(1);

        /* renamed from: c */
        public final AtomicInteger f65066c = new AtomicInteger();

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f65066c.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f65065b.offer(notification)) {
                    Notification notification2 = (Notification) this.f65065b.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }

        /* renamed from: b */
        public void m30335b() {
            this.f65066c.set(1);
        }

        /* renamed from: c */
        public Notification m30334c() {
            m30335b();
            BlockingHelper.verifyNonBlocking();
            return (Notification) this.f65065b.take();
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
        this.f65057a = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C10949a(this.f65057a, new C10950b());
    }
}