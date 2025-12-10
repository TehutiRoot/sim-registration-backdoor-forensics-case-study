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
    public final Iterable f65351a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFromIterable$a */
    /* loaded from: classes5.dex */
    public static final class C10992a extends BasicQueueDisposable {

        /* renamed from: a */
        public final Observer f65352a;

        /* renamed from: b */
        public final Iterator f65353b;

        /* renamed from: c */
        public volatile boolean f65354c;

        /* renamed from: d */
        public boolean f65355d;

        /* renamed from: e */
        public boolean f65356e;

        /* renamed from: f */
        public boolean f65357f;

        public C10992a(Observer observer, Iterator it) {
            this.f65352a = observer;
            this.f65353b = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m30312a() {
            while (!isDisposed()) {
                try {
                    this.f65352a.onNext(ObjectHelper.requireNonNull(this.f65353b.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f65353b.hasNext()) {
                            if (!isDisposed()) {
                                this.f65352a.onComplete();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f65352a.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f65352a.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f65356e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65354c = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65354c;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f65356e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            if (this.f65356e) {
                return null;
            }
            if (this.f65357f) {
                if (!this.f65353b.hasNext()) {
                    this.f65356e = true;
                    return null;
                }
            } else {
                this.f65357f = true;
            }
            return ObjectHelper.requireNonNull(this.f65353b.next(), "The iterator returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.f65355d = true;
                return 1;
            }
            return 0;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.f65351a = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<T> it = this.f65351a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                C10992a c10992a = new C10992a(observer, it);
                observer.onSubscribe(c10992a);
                if (!c10992a.f65355d) {
                    c10992a.m30312a();
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