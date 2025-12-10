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
    public final ObservableSource f65052a;

    /* renamed from: b */
    public final Object f65053b;

    /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableMostRecent$a */
    /* loaded from: classes5.dex */
    public static final class C10947a extends DefaultObserver {

        /* renamed from: b */
        public volatile Object f65054b;

        /* renamed from: io.reactivex.internal.operators.observable.BlockingObservableMostRecent$a$a */
        /* loaded from: classes5.dex */
        public final class C10948a implements Iterator {

            /* renamed from: a */
            public Object f65055a;

            public C10948a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C10947a.this.f65054b;
                this.f65055a = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    if (this.f65055a == null) {
                        this.f65055a = C10947a.this.f65054b;
                    }
                    if (!NotificationLite.isComplete(this.f65055a)) {
                        if (!NotificationLite.isError(this.f65055a)) {
                            Object value = NotificationLite.getValue(this.f65055a);
                            this.f65055a = null;
                            return value;
                        }
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.f65055a));
                    }
                    throw new NoSuchElementException();
                } catch (Throwable th2) {
                    this.f65055a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C10947a(Object obj) {
            this.f65054b = NotificationLite.next(obj);
        }

        /* renamed from: a */
        public C10948a m30338a() {
            return new C10948a();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65054b = NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65054b = NotificationLite.error(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65054b = NotificationLite.next(obj);
        }
    }

    public BlockingObservableMostRecent(ObservableSource<T> observableSource, T t) {
        this.f65052a = observableSource;
        this.f65053b = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10947a c10947a = new C10947a(this.f65053b);
        this.f65052a.subscribe(c10947a);
        return c10947a.m30338a();
    }
}