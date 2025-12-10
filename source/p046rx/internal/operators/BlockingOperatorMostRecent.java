package p046rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.internal.operators.BlockingOperatorMostRecent */
/* loaded from: classes7.dex */
public final class BlockingOperatorMostRecent {

    /* renamed from: rx.internal.operators.BlockingOperatorMostRecent$a */
    /* loaded from: classes7.dex */
    public static class C13432a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Object f77752a;

        /* renamed from: b */
        public final /* synthetic */ Observable f77753b;

        public C13432a(Object obj, Observable observable) {
            this.f77752a = obj;
            this.f77753b = observable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            C13433b c13433b = new C13433b(this.f77752a);
            this.f77753b.subscribe((Subscriber) c13433b);
            return c13433b.m23160b();
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorMostRecent$b */
    /* loaded from: classes7.dex */
    public static final class C13433b extends Subscriber {

        /* renamed from: a */
        public volatile Object f77754a;

        /* renamed from: rx.internal.operators.BlockingOperatorMostRecent$b$a */
        /* loaded from: classes7.dex */
        public class C13434a implements Iterator {

            /* renamed from: a */
            public Object f77755a;

            public C13434a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C13433b.this.f77754a;
                this.f77755a = obj;
                return !NotificationLite.isCompleted(obj);
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    if (this.f77755a == null) {
                        this.f77755a = C13433b.this.f77754a;
                    }
                    if (!NotificationLite.isCompleted(this.f77755a)) {
                        if (!NotificationLite.isError(this.f77755a)) {
                            Object value = NotificationLite.getValue(this.f77755a);
                            this.f77755a = null;
                            return value;
                        }
                        throw Exceptions.propagate(NotificationLite.getError(this.f77755a));
                    }
                    throw new NoSuchElementException();
                } catch (Throwable th2) {
                    this.f77755a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C13433b(Object obj) {
            this.f77754a = NotificationLite.next(obj);
        }

        /* renamed from: b */
        public Iterator m23160b() {
            return new C13434a();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77754a = NotificationLite.completed();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77754a = NotificationLite.error(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f77754a = NotificationLite.next(obj);
        }
    }

    public static <T> Iterable<T> mostRecent(Observable<? extends T> observable, T t) {
        return new C13432a(t, observable);
    }
}
