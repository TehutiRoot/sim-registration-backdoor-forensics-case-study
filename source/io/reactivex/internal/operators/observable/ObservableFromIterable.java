package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    /* renamed from: a */
    public final Iterable f65288a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFromIterable$a */
    /* loaded from: classes5.dex */
    public static final class C11005a extends BasicQueueDisposable {

        /* renamed from: a */
        public final Observer f65289a;

        /* renamed from: b */
        public final Iterator f65290b;

        /* renamed from: c */
        public volatile boolean f65291c;

        /* renamed from: d */
        public boolean f65292d;

        /* renamed from: e */
        public boolean f65293e;

        /* renamed from: f */
        public boolean f65294f;

        public C11005a(Observer observer, Iterator it) {
            this.f65289a = observer;
            this.f65290b = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m29972a() {
            while (!isDisposed()) {
                try {
                    this.f65289a.onNext(ObjectHelper.requireNonNull(this.f65290b.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f65290b.hasNext()) {
                            if (!isDisposed()) {
                                this.f65289a.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f65289a.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f65289a.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f65293e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65291c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65291c;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f65293e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            if (this.f65293e) {
                return null;
            }
            if (this.f65294f) {
                if (!this.f65290b.hasNext()) {
                    this.f65293e = true;
                    return null;
                }
            } else {
                this.f65294f = true;
            }
            return ObjectHelper.requireNonNull(this.f65290b.next(), "The iterator returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.f65292d = true;
                return 1;
            }
            return 0;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.f65288a = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<T> it = this.f65288a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                C11005a c11005a = new C11005a(observer, it);
                observer.onSubscribe(c11005a);
                if (!c11005a.f65292d) {
                    c11005a.m29972a();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }
}
