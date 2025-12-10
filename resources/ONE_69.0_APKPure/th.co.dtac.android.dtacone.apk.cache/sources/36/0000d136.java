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
    public final ObservableSource f65048a;

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableLatest$a */
    /* loaded from: classes5.dex */
    public static final class C10946a extends DisposableObserver implements Iterator {

        /* renamed from: b */
        public Notification f65049b;

        /* renamed from: c */
        public final Semaphore f65050c = new Semaphore(0);

        /* renamed from: d */
        public final AtomicReference f65051d = new AtomicReference();

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void onNext(Notification notification) {
            if (this.f65051d.getAndSet(notification) == null) {
                this.f65050c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification notification = this.f65049b;
            if (notification != null && notification.isOnError()) {
                throw ExceptionHelper.wrapOrThrow(this.f65049b.getError());
            }
            if (this.f65049b == null) {
                try {
                    BlockingHelper.verifyNonBlocking();
                    this.f65050c.acquire();
                    Notification notification2 = (Notification) this.f65051d.getAndSet(null);
                    this.f65049b = notification2;
                    if (notification2.isOnError()) {
                        throw ExceptionHelper.wrapOrThrow(notification2.getError());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.f65049b = Notification.createOnError(e);
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.f65049b.isOnNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object value = this.f65049b.getValue();
                this.f65049b = null;
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
        this.f65048a = observableSource;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10946a c10946a = new C10946a();
        Observable.wrap(this.f65048a).materialize().subscribe(c10946a);
        return c10946a;
    }
}