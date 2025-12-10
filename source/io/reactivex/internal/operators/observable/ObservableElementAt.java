package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class ObservableElementAt<T> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65231a;

    /* renamed from: b */
    public final Object f65232b;

    /* renamed from: c */
    public final boolean f65233c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAt$a */
    /* loaded from: classes5.dex */
    public static final class C10999a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65234a;

        /* renamed from: b */
        public final long f65235b;

        /* renamed from: c */
        public final Object f65236c;

        /* renamed from: d */
        public final boolean f65237d;

        /* renamed from: e */
        public Disposable f65238e;

        /* renamed from: f */
        public long f65239f;

        /* renamed from: g */
        public boolean f65240g;

        public C10999a(Observer observer, long j, Object obj, boolean z) {
            this.f65234a = observer;
            this.f65235b = j;
            this.f65236c = obj;
            this.f65237d = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65238e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65238e.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65240g) {
                this.f65240g = true;
                Object obj = this.f65236c;
                if (obj == null && this.f65237d) {
                    this.f65234a.onError(new NoSuchElementException());
                    return;
                }
                if (obj != null) {
                    this.f65234a.onNext(obj);
                }
                this.f65234a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65240g) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65240g = true;
            this.f65234a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65240g) {
                return;
            }
            long j = this.f65239f;
            if (j == this.f65235b) {
                this.f65240g = true;
                this.f65238e.dispose();
                this.f65234a.onNext(obj);
                this.f65234a.onComplete();
                return;
            }
            this.f65239f = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65238e, disposable)) {
                this.f65238e = disposable;
                this.f65234a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.f65231a = j;
        this.f65232b = t;
        this.f65233c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10999a(observer, this.f65231a, this.f65232b, this.f65233c));
    }
}
