package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {

    /* renamed from: a */
    public final Flowable f64077a;

    /* renamed from: b */
    public final Object f64078b;

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$a */
    /* loaded from: classes5.dex */
    public static final class C10793a extends DefaultSubscriber {

        /* renamed from: b */
        public volatile Object f64079b;

        /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$a$a */
        /* loaded from: classes5.dex */
        public final class C10794a implements Iterator {

            /* renamed from: a */
            public Object f64080a;

            public C10794a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C10793a.this.f64079b;
                this.f64080a = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    if (this.f64080a == null) {
                        this.f64080a = C10793a.this.f64079b;
                    }
                    if (!NotificationLite.isComplete(this.f64080a)) {
                        if (!NotificationLite.isError(this.f64080a)) {
                            Object value = NotificationLite.getValue(this.f64080a);
                            this.f64080a = null;
                            return value;
                        }
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.f64080a));
                    }
                    throw new NoSuchElementException();
                } catch (Throwable th2) {
                    this.f64080a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C10793a(Object obj) {
            this.f64079b = NotificationLite.next(obj);
        }

        /* renamed from: a */
        public C10794a m30409a() {
            return new C10794a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64079b = NotificationLite.complete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64079b = NotificationLite.error(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64079b = NotificationLite.next(obj);
        }
    }

    public BlockingFlowableMostRecent(Flowable<T> flowable, T t) {
        this.f64077a = flowable;
        this.f64078b = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10793a c10793a = new C10793a(this.f64078b);
        this.f64077a.subscribe((FlowableSubscriber) c10793a);
        return c10793a.m30409a();
    }
}