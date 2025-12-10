package p046rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Notification;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.internal.operators.BlockingOperatorLatest */
/* loaded from: classes7.dex */
public final class BlockingOperatorLatest {

    /* renamed from: rx.internal.operators.BlockingOperatorLatest$a */
    /* loaded from: classes7.dex */
    public static class C13430a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Observable f77748a;

        public C13430a(Observable observable) {
            this.f77748a = observable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            C13431b c13431b = new C13431b();
            this.f77748a.materialize().subscribe((Subscriber) c13431b);
            return c13431b;
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorLatest$b */
    /* loaded from: classes7.dex */
    public static final class C13431b extends Subscriber implements Iterator {

        /* renamed from: a */
        public final Semaphore f77749a = new Semaphore(0);

        /* renamed from: b */
        public final AtomicReference f77750b = new AtomicReference();

        /* renamed from: c */
        public Notification f77751c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification notification = this.f77751c;
            if (notification != null && notification.isOnError()) {
                throw Exceptions.propagate(this.f77751c.getThrowable());
            }
            Notification notification2 = this.f77751c;
            if ((notification2 == null || !notification2.isOnCompleted()) && this.f77751c == null) {
                try {
                    this.f77749a.acquire();
                    Notification notification3 = (Notification) this.f77750b.getAndSet(null);
                    this.f77751c = notification3;
                    if (notification3.isOnError()) {
                        throw Exceptions.propagate(this.f77751c.getThrowable());
                    }
                } catch (InterruptedException e) {
                    unsubscribe();
                    Thread.currentThread().interrupt();
                    this.f77751c = Notification.createOnError(e);
                    throw Exceptions.propagate(e);
                }
            }
            return !this.f77751c.isOnCompleted();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() && this.f77751c.isOnNext()) {
                Object value = this.f77751c.getValue();
                this.f77751c = null;
                return value;
            }
            throw new NoSuchElementException();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // p046rx.Observer
        public void onNext(Notification notification) {
            if (this.f77750b.getAndSet(notification) == null) {
                this.f77749a.release();
            }
        }
    }

    public static <T> Iterable<T> latest(Observable<? extends T> observable) {
        return new C13430a(observable);
    }
}
