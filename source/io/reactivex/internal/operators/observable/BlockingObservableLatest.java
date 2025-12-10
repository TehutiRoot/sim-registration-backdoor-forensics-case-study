package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {

    /* renamed from: a */
    public final ObservableSource f64985a;

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableLatest$a */
    /* loaded from: classes5.dex */
    public static final class C10959a extends DisposableObserver implements Iterator {

        /* renamed from: b */
        public Notification f64986b;

        /* renamed from: c */
        public final Semaphore f64987c = new Semaphore(0);

        /* renamed from: d */
        public final AtomicReference f64988d = new AtomicReference();

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f64988d.getAndSet(notification) == null) {
                this.f64987c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification notification = this.f64986b;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f64986b.getError());
            }
            if (this.f64986b == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f64987c.acquire();
                    Notification notification2 = (Notification) this.f64988d.getAndSet(null);
                    this.f64986b = notification2;
                    if (notification2.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(notification2.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f64986b = Notification.createOnError(e);
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.f64986b.isOnNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object value = this.f64986b.getValue();
                this.f64986b = null;
                return value;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            RxJavaPlugins.onError(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public BlockingObservableLatest(ObservableSource<T> observableSource) {
        this.f64985a = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10959a c10959a = new C10959a();
        Observable.wrap(this.f64985a).materialize().subscribe(c10959a);
        return c10959a;
    }
}
