package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes5.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* renamed from: a */
    public final Object[] f65278a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFromArray$a */
    /* loaded from: classes5.dex */
    public static final class C11004a extends BasicQueueDisposable {

        /* renamed from: a */
        public final Observer f65279a;

        /* renamed from: b */
        public final Object[] f65280b;

        /* renamed from: c */
        public int f65281c;

        /* renamed from: d */
        public boolean f65282d;

        /* renamed from: e */
        public volatile boolean f65283e;

        public C11004a(Observer observer, Object[] objArr) {
            this.f65279a = observer;
            this.f65280b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m29973a() {
            Object[] objArr = this.f65280b;
            int length = objArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    Observer observer = this.f65279a;
                    observer.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f65279a.onNext(obj);
            }
            if (!isDisposed()) {
                this.f65279a.onComplete();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f65281c = this.f65280b.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65283e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65283e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.f65281c == this.f65280b.length) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            int i = this.f65281c;
            Object[] objArr = this.f65280b;
            if (i != objArr.length) {
                this.f65281c = i + 1;
                return ObjectHelper.requireNonNull(objArr[i], "The array element is null");
            }
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.f65282d = true;
                return 1;
            }
            return 0;
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.f65278a = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11004a c11004a = new C11004a(observer, this.f65278a);
        observer.onSubscribe(c11004a);
        if (c11004a.f65282d) {
            return;
        }
        c11004a.m29973a();
    }
}
