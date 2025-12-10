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
public final class ObservableCollect<T, U> extends AbstractC11078a {

    /* renamed from: a */
    public final Callable f65176a;

    /* renamed from: b */
    public final BiConsumer f65177b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCollect$a */
    /* loaded from: classes5.dex */
    public static final class C10967a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65178a;

        /* renamed from: b */
        public final BiConsumer f65179b;

        /* renamed from: c */
        public final Object f65180c;

        /* renamed from: d */
        public Disposable f65181d;

        /* renamed from: e */
        public boolean f65182e;

        public C10967a(Observer observer, Object obj, BiConsumer biConsumer) {
            this.f65178a = observer;
            this.f65179b = biConsumer;
            this.f65180c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65181d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65181d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65182e) {
                return;
            }
            this.f65182e = true;
            this.f65178a.onNext(this.f65180c);
            this.f65178a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65182e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65182e = true;
            this.f65178a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65182e) {
                return;
            }
            try {
                this.f65179b.accept(this.f65180c, obj);
            } catch (Throwable th2) {
                this.f65181d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65181d, disposable)) {
                this.f65181d = disposable;
                this.f65178a.onSubscribe(this);
            }
        }
    }

    public ObservableCollect(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.f65176a = callable;
        this.f65177b = biConsumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new C10967a(observer, ObjectHelper.requireNonNull(this.f65176a.call(), "The initialSupplier returned a null value"), this.f65177b));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, observer);
        }
    }
}