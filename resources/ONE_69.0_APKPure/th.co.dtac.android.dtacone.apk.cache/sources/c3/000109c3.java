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
        public static final int f77981d = (RxRingBuffer.SIZE * 3) / 4;

        /* renamed from: a */
        public final BlockingQueue f77982a = new LinkedBlockingQueue();

        /* renamed from: b */
        public Notification f77983b;

        /* renamed from: c */
        public int f77984c;

        /* renamed from: b */
        public final Notification m23343b() {
            try {
                Notification notification = (Notification) this.f77982a.poll();
                if (notification != null) {
                    return notification;
                }
                return (Notification) this.f77982a.take();
            } catch (InterruptedException e) {
                unsubscribe();
                throw Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f77983b == null) {
                this.f77983b = m23343b();
                int i = this.f77984c + 1;
                this.f77984c = i;
                if (i >= f77981d) {
                    request(i);
                    this.f77984c = 0;
                }
            }
            if (!this.f77983b.isOnError()) {
                return !this.f77983b.isOnCompleted();
            }
            throw Exceptions.propagate(this.f77983b.getThrowable());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) this.f77983b.getValue();
                this.f77983b = null;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77982a.offer(Notification.createOnError(th2));
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
            this.f77982a.offer(notification);
        }
    }

    public static <T> Iterator<T> toIterator(Observable<? extends T> observable) {
        SubscriberIterator subscriberIterator = new SubscriberIterator();
        observable.materialize().subscribe((Subscriber<? super Notification<? extends T>>) subscriberIterator);
        return subscriberIterator;
    }
}