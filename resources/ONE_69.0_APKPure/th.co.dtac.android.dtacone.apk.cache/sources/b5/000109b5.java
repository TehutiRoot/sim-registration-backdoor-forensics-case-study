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
    public static class C13431a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Observable f77954a;

        public C13431a(Observable observable) {
            this.f77954a = observable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            C13432b c13432b = new C13432b();
            this.f77954a.materialize().subscribe((Subscriber) c13432b);
            return c13432b;
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorLatest$b */
    /* loaded from: classes7.dex */
    public static final class C13432b extends Subscriber implements Iterator {

        /* renamed from: a */
        public final Semaphore f77955a = new Semaphore(0);

        /* renamed from: b */
        public final AtomicReference f77956b = new AtomicReference();

        /* renamed from: c */
        public Notification f77957c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification notification = this.f77957c;
            if (notification != null && notification.isOnError()) {
                throw Exceptions.propagate(this.f77957c.getThrowable());
            }
            Notification notification2 = this.f77957c;
            if ((notification2 == null || !notification2.isOnCompleted()) && this.f77957c == null) {
                try {
                    this.f77955a.acquire();
                    Notification notification3 = (Notification) this.f77956b.getAndSet(null);
                    this.f77957c = notification3;
                    if (notification3.isOnError()) {
                        throw Exceptions.propagate(this.f77957c.getThrowable());
                    }
                } catch (InterruptedException e) {
                    unsubscribe();
                    Thread.currentThread().interrupt();
                    this.f77957c = Notification.createOnError(e);
                    throw Exceptions.propagate(e);
                }
            }
            return !this.f77957c.isOnCompleted();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext() && this.f77957c.isOnNext()) {
                Object value = this.f77957c.getValue();
                this.f77957c = null;
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
            if (this.f77956b.getAndSet(notification) == null) {
                this.f77955a.release();
            }
        }
    }

    public static <T> Iterable<T> latest(Observable<? extends T> observable) {
        return new C13431a(observable);
    }
}