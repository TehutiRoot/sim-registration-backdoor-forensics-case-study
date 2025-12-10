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
    public static class C13433a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Object f77958a;

        /* renamed from: b */
        public final /* synthetic */ Observable f77959b;

        public C13433a(Object obj, Observable observable) {
            this.f77958a = obj;
            this.f77959b = observable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            C13434b c13434b = new C13434b(this.f77958a);
            this.f77959b.subscribe((Subscriber) c13434b);
            return c13434b.m23348b();
        }
    }

    /* renamed from: rx.internal.operators.BlockingOperatorMostRecent$b */
    /* loaded from: classes7.dex */
    public static final class C13434b extends Subscriber {

        /* renamed from: a */
        public volatile Object f77960a;

        /* renamed from: rx.internal.operators.BlockingOperatorMostRecent$b$a */
        /* loaded from: classes7.dex */
        public class C13435a implements Iterator {

            /* renamed from: a */
            public Object f77961a;

            public C13435a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = C13434b.this.f77960a;
                this.f77961a = obj;
                return !NotificationLite.isCompleted(obj);
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    if (this.f77961a == null) {
                        this.f77961a = C13434b.this.f77960a;
                    }
                    if (!NotificationLite.isCompleted(this.f77961a)) {
                        if (!NotificationLite.isError(this.f77961a)) {
                            Object value = NotificationLite.getValue(this.f77961a);
                            this.f77961a = null;
                            return value;
                        }
                        throw Exceptions.propagate(NotificationLite.getError(this.f77961a));
                    }
                    throw new NoSuchElementException();
                } catch (Throwable th2) {
                    this.f77961a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public C13434b(Object obj) {
            this.f77960a = NotificationLite.next(obj);
        }

        /* renamed from: b */
        public Iterator m23348b() {
            return new C13435a();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77960a = NotificationLite.completed();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77960a = NotificationLite.error(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f77960a = NotificationLite.next(obj);
        }
    }

    public static <T> Iterable<T> mostRecent(Observable<? extends T> observable, T t) {
        return new C13433a(t, observable);
    }
}