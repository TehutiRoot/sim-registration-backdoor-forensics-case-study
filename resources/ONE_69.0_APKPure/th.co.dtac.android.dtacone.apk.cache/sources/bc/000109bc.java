package p046rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Notification;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.internal.operators.BlockingOperatorNext */
/* loaded from: classes7.dex */
public final class BlockingOperatorNext {

    /* renamed from: rx.internal.operators.BlockingOperatorNext$a */
    /* loaded from: classes7.dex */
    public static class C13436a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Observable f77963a;

        public C13436a(Observable observable) {
            this.f77963a = observable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C13437b(this.f77963a, new C13438c());
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorNext$b */
    /* loaded from: classes7.dex */
    public static final class C13437b implements Iterator {

        /* renamed from: a */
        public final C13438c f77964a;

        /* renamed from: b */
        public final Observable f77965b;

        /* renamed from: c */
        public Object f77966c;

        /* renamed from: d */
        public boolean f77967d = true;

        /* renamed from: e */
        public boolean f77968e = true;

        /* renamed from: f */
        public Throwable f77969f;

        /* renamed from: g */
        public boolean f77970g;

        public C13437b(Observable observable, C13438c c13438c) {
            this.f77965b = observable;
            this.f77964a = c13438c;
        }

        /* renamed from: a */
        public final boolean m23347a() {
            try {
                if (!this.f77970g) {
                    this.f77970g = true;
                    this.f77964a.m23346b(1);
                    this.f77965b.materialize().subscribe((Subscriber) this.f77964a);
                }
                Notification m23345c = this.f77964a.m23345c();
                if (m23345c.isOnNext()) {
                    this.f77968e = false;
                    this.f77966c = m23345c.getValue();
                    return true;
                }
                this.f77967d = false;
                if (m23345c.isOnCompleted()) {
                    return false;
                }
                if (m23345c.isOnError()) {
                    Throwable throwable = m23345c.getThrowable();
                    this.f77969f = throwable;
                    throw Exceptions.propagate(throwable);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.f77964a.unsubscribe();
                Thread.currentThread().interrupt();
                this.f77969f = e;
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f77969f;
            if (th2 == null) {
                if (!this.f77967d) {
                    return false;
                }
                if (this.f77968e && !m23347a()) {
                    return false;
                }
                return true;
            }
            throw Exceptions.propagate(th2);
        }

        @Override // java.util.Iterator
        public Object next() {
            Throwable th2 = this.f77969f;
            if (th2 == null) {
                if (hasNext()) {
                    this.f77968e = true;
                    return this.f77966c;
                }
                throw new NoSuchElementException("No more elements");
            }
            throw Exceptions.propagate(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorNext$c */
    /* loaded from: classes7.dex */
    public static final class C13438c extends Subscriber {

        /* renamed from: a */
        public final BlockingQueue f77971a = new ArrayBlockingQueue(1);

        /* renamed from: b */
        public final AtomicInteger f77972b = new AtomicInteger();

        /* renamed from: b */
        public void m23346b(int i) {
            this.f77972b.set(i);
        }

        /* renamed from: c */
        public Notification m23345c() {
            m23346b(1);
            return (Notification) this.f77971a.take();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // p046rx.Observer
        public void onNext(Notification notification) {
            if (this.f77972b.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f77971a.offer(notification)) {
                    Notification notification2 = (Notification) this.f77971a.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }
    }

    public static <T> Iterable<T> next(Observable<? extends T> observable) {
        return new C13436a(observable);
    }
}