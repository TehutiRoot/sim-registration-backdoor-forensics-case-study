package p046rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p046rx.Notification;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.internal.util.RxRingBuffer;

/* renamed from: rx.internal.operators.BlockingOperatorToIterator */
/* loaded from: classes7.dex */
public final class BlockingOperatorToIterator {

    /* renamed from: rx.internal.operators.BlockingOperatorToIterator$SubscriberIterator */
    /* loaded from: classes7.dex */
    public static final class SubscriberIterator<T> extends Subscriber<Notification<? extends T>> implements Iterator<T> {

        /* renamed from: d */
        public static final int f77775d = (RxRingBuffer.SIZE * 3) / 4;

        /* renamed from: a */
        public final BlockingQueue f77776a = new LinkedBlockingQueue();

        /* renamed from: b */
        public Notification f77777b;

        /* renamed from: c */
        public int f77778c;

        /* renamed from: b */
        public final Notification m23155b() {
            try {
                Notification notification = (Notification) this.f77776a.poll();
                if (notification != null) {
                    return notification;
                }
                return (Notification) this.f77776a.take();
            } catch (InterruptedException e) {
                unsubscribe();
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f77777b == null) {
                this.f77777b = m23155b();
                int i = this.f77778c + 1;
                this.f77778c = i;
                if (i >= f77775d) {
                    request(i);
                    this.f77778c = 0;
                }
            }
            if (!this.f77777b.isOnError()) {
                return !this.f77777b.isOnCompleted();
            }
            throw Exceptions.propagate(this.f77777b.getThrowable());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) this.f77777b.getValue();
                this.f77777b = null;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77776a.offer(Notification.createOnError(th2));
        }

        @Override // p046rx.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Notification) ((Notification) obj));
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }

        public void onNext(Notification<? extends T> notification) {
            this.f77776a.offer(notification);
        }
    }

    public static <T> Iterator<T> toIterator(Observable<? extends T> observable) {
        SubscriberIterator subscriberIterator = new SubscriberIterator();
        observable.materialize().subscribe((Subscriber<? super Notification<? extends T>>) subscriberIterator);
        return subscriberIterator;
    }
}
