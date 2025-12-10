package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class ObservableElementAt<T> extends AbstractC11078a {

    /* renamed from: a */
    public final long f65294a;

    /* renamed from: b */
    public final Object f65295b;

    /* renamed from: c */
    public final boolean f65296c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAt$a */
    /* loaded from: classes5.dex */
    public static final class C10986a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65297a;

        /* renamed from: b */
        public final long f65298b;

        /* renamed from: c */
        public final Object f65299c;

        /* renamed from: d */
        public final boolean f65300d;

        /* renamed from: e */
        public Disposable f65301e;

        /* renamed from: f */
        public long f65302f;

        /* renamed from: g */
        public boolean f65303g;

        public C10986a(Observer observer, long j, Object obj, boolean z) {
            this.f65297a = observer;
            this.f65298b = j;
            this.f65299c = obj;
            this.f65300d = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65301e.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65301e.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65303g) {
                this.f65303g = true;
                Object obj = this.f65299c;
                if (obj == null && this.f65300d) {
                    this.f65297a.onError(new NoSuchElementException());
                    return;
                }
                if (obj != null) {
                    this.f65297a.onNext(obj);
                }
                this.f65297a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65303g) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65303g = true;
            this.f65297a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65303g) {
                return;
            }
            long j = this.f65302f;
            if (j == this.f65298b) {
                this.f65303g = true;
                this.f65301e.dispose();
                this.f65297a.onNext(obj);
                this.f65297a.onComplete();
                return;
            }
            this.f65302f = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65301e, disposable)) {
                this.f65301e = disposable;
                this.f65297a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.f65294a = j;
        this.f65295b = t;
        this.f65296c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10986a(observer, this.f65294a, this.f65295b, this.f65296c));
    }
}