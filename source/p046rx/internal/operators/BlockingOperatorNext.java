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
    public static class C13435a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Observable f77757a;

        public C13435a(Observable observable) {
            this.f77757a = observable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C13436b(this.f77757a, new C13437c());
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorNext$b */
    /* loaded from: classes7.dex */
    public static final class C13436b implements Iterator {

        /* renamed from: a */
        public final C13437c f77758a;

        /* renamed from: b */
        public final Observable f77759b;

        /* renamed from: c */
        public Object f77760c;

        /* renamed from: d */
        public boolean f77761d = true;

        /* renamed from: e */
        public boolean f77762e = true;

        /* renamed from: f */
        public Throwable f77763f;

        /* renamed from: g */
        public boolean f77764g;

        public C13436b(Observable observable, C13437c c13437c) {
            this.f77759b = observable;
            this.f77758a = c13437c;
        }

        /* renamed from: a */
        public final boolean m23159a() {
            try {
                if (!this.f77764g) {
                    this.f77764g = true;
                    this.f77758a.m23158b(1);
                    this.f77759b.materialize().subscribe((Subscriber) this.f77758a);
                }
                Notification m23157c = this.f77758a.m23157c();
                if (m23157c.isOnNext()) {
                    this.f77762e = false;
                    this.f77760c = m23157c.getValue();
                    return true;
                }
                this.f77761d = false;
                if (m23157c.isOnCompleted()) {
                    return false;
                }
                if (m23157c.isOnError()) {
                    Throwable throwable = m23157c.getThrowable();
                    this.f77763f = throwable;
                    throw Exceptions.propagate(throwable);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e) {
                this.f77758a.unsubscribe();
                Thread.currentThread().interrupt();
                this.f77763f = e;
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f77763f;
            if (th2 == null) {
                if (!this.f77761d) {
                    return false;
                }
                if (this.f77762e && !m23159a()) {
                    return false;
                }
                return true;
            }
            throw Exceptions.propagate(th2);
        }

        @Override // java.util.Iterator
        public Object next() {
            Throwable th2 = this.f77763f;
            if (th2 == null) {
                if (hasNext()) {
                    this.f77762e = true;
                    return this.f77760c;
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
    public static final class C13437c extends Subscriber {

        /* renamed from: a */
        public final BlockingQueue f77765a = new ArrayBlockingQueue(1);

        /* renamed from: b */
        public final AtomicInteger f77766b = new AtomicInteger();

        /* renamed from: b */
        public void m23158b(int i) {
            this.f77766b.set(i);
        }

        /* renamed from: c */
        public Notification m23157c() {
            m23158b(1);
            return (Notification) this.f77765a.take();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
        }

        @Override // p046rx.Observer
        public void onNext(Notification notification) {
            if (this.f77766b.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.f77765a.offer(notification)) {
                    Notification notification2 = (Notification) this.f77765a.poll();
                    if (notification2 != null && !notification2.isOnNext()) {
                        notification = notification2;
                    }
                }
            }
        }
    }

    public static <T> Iterable<T> next(Observable<? extends T> observable) {
        return new C13435a(observable);
    }
}
