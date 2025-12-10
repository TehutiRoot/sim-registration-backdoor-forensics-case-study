package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {

    /* renamed from: a */
    public final ObservableSource f64989a;

    /* renamed from: b */
    public final Object f64990b;

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableMostRecent$a */
    /* loaded from: classes5.dex */
    public static final class C10960a extends DefaultObserver {

        /* renamed from: b */
        public volatile Object f64991b;

        /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableMostRecent$a$a */
        /* loaded from: classes5.dex */
        public final class C10961a implements Iterator {

            /* renamed from: a */
            public Object f64992a;

            public C10961a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C10960a.this.f64991b;
                this.f64992a = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    if (this.f64992a == null) {
                        this.f64992a = C10960a.this.f64991b;
                    }
                    if (!NotificationLite.isComplete(this.f64992a)) {
                        if (!NotificationLite.isError(this.f64992a)) {
                            Object value = NotificationLite.getValue(this.f64992a);
                            this.f64992a = null;
                            return value;
                        }
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.f64992a));
                    }
                    throw new NoSuchElementException();
                } catch (Throwable th2) {
                    this.f64992a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C10960a(Object obj) {
            this.f64991b = NotificationLite.next(obj);
        }

        /* renamed from: a */
        public C10961a m29998a() {
            return new C10961a();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f64991b = NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f64991b = NotificationLite.error(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f64991b = NotificationLite.next(obj);
        }
    }

    public BlockingObservableMostRecent(ObservableSource<T> observableSource, T t) {
        this.f64989a = observableSource;
        this.f64990b = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10960a c10960a = new C10960a(this.f64990b);
        this.f64989a.subscribe(c10960a);
        return c10960a.m29998a();
    }
}
