package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes5.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* renamed from: a */
    public final Object[] f65341a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFromArray$a */
    /* loaded from: classes5.dex */
    public static final class C10991a extends BasicQueueDisposable {

        /* renamed from: a */
        public final Observer f65342a;

        /* renamed from: b */
        public final Object[] f65343b;

        /* renamed from: c */
        public int f65344c;

        /* renamed from: d */
        public boolean f65345d;

        /* renamed from: e */
        public volatile boolean f65346e;

        public C10991a(Observer observer, Object[] objArr) {
            this.f65342a = observer;
            this.f65343b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m30313a() {
            Object[] objArr = this.f65343b;
            int length = objArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    Observer observer = this.f65342a;
                    observer.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f65342a.onNext(obj);
            }
            if (!isDisposed()) {
                this.f65342a.onComplete();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f65344c = this.f65343b.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65346e = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65346e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.f65344c == this.f65343b.length) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public Object poll() {
            int i = this.f65344c;
            Object[] objArr = this.f65343b;
            if (i != objArr.length) {
                this.f65344c = i + 1;
                return ObjectHelper.requireNonNull(objArr[i], "The array element is null");
            }
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.f65345d = true;
                return 1;
            }
            return 0;
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.f65341a = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C10991a c10991a = new C10991a(observer, this.f65341a);
        observer.onSubscribe(c10991a);
        if (c10991a.f65345d) {
            return;
        }
        c10991a.m30313a();
    }
}