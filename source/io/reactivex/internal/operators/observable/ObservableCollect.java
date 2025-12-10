package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableCollect<T, U> extends AbstractC11091a {

    /* renamed from: a */
    public final Callable f65113a;

    /* renamed from: b */
    public final BiConsumer f65114b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCollect$a */
    /* loaded from: classes5.dex */
    public static final class C10980a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65115a;

        /* renamed from: b */
        public final BiConsumer f65116b;

        /* renamed from: c */
        public final Object f65117c;

        /* renamed from: d */
        public Disposable f65118d;

        /* renamed from: e */
        public boolean f65119e;

        public C10980a(Observer observer, Object obj, BiConsumer biConsumer) {
            this.f65115a = observer;
            this.f65116b = biConsumer;
            this.f65117c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65118d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65118d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65119e) {
                return;
            }
            this.f65119e = true;
            this.f65115a.onNext(this.f65117c);
            this.f65115a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65119e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65119e = true;
            this.f65115a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65119e) {
                return;
            }
            try {
                this.f65116b.accept(this.f65117c, obj);
            } catch (Throwable th2) {
                this.f65118d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65118d, disposable)) {
                this.f65118d = disposable;
                this.f65115a.onSubscribe(this);
            }
        }
    }

    public ObservableCollect(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.f65113a = callable;
        this.f65114b = biConsumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new C10980a(observer, ObjectHelper.requireNonNull(this.f65113a.call(), "The initialSupplier returned a null value"), this.f65114b));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, observer);
        }
    }
}
