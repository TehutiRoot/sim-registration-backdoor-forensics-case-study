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
    public final Flowable f64014a;

    /* renamed from: b */
    public final Object f64015b;

    /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$a */
    /* loaded from: classes5.dex */
    public static final class C10806a extends DefaultSubscriber {

        /* renamed from: b */
        public volatile Object f64016b;

        /* renamed from: io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent$a$a */
        /* loaded from: classes5.dex */
        public final class C10807a implements Iterator {

            /* renamed from: a */
            public Object f64017a;

            public C10807a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C10806a.this.f64016b;
                this.f64017a = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    if (this.f64017a == null) {
                        this.f64017a = C10806a.this.f64016b;
                    }
                    if (!NotificationLite.isComplete(this.f64017a)) {
                        if (!NotificationLite.isError(this.f64017a)) {
                            Object value = NotificationLite.getValue(this.f64017a);
                            this.f64017a = null;
                            return value;
                        }
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.f64017a));
                    }
                    throw new NoSuchElementException();
                } catch (Throwable th2) {
                    this.f64017a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C10806a(Object obj) {
            this.f64016b = NotificationLite.next(obj);
        }

        /* renamed from: a */
        public C10807a m30069a() {
            return new C10807a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64016b = NotificationLite.complete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            this.f64016b = NotificationLite.error(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f64016b = NotificationLite.next(obj);
        }
    }

    public BlockingFlowableMostRecent(Flowable<T> flowable, T t) {
        this.f64014a = flowable;
        this.f64015b = t;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        C10806a c10806a = new C10806a(this.f64015b);
        this.f64014a.subscribe((FlowableSubscriber) c10806a);
        return c10806a.m30069a();
    }
}
