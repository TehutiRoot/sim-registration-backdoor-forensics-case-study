package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableDebounceTimed<T> extends AbstractC11091a {

    /* renamed from: a */
    public final long f65163a;

    /* renamed from: b */
    public final TimeUnit f65164b;

    /* renamed from: c */
    public final Scheduler f65165c;

    /* loaded from: classes5.dex */
    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final C10986a parent;
        final T value;

        public DebounceEmitter(T t, long j, C10986a c10986a) {
            this.value = t;
            this.idx = j;
            this.parent = c10986a;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.m29974a(this.idx, this.value, this);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounceTimed$a */
    /* loaded from: classes5.dex */
    public static final class C10986a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65166a;

        /* renamed from: b */
        public final long f65167b;

        /* renamed from: c */
        public final TimeUnit f65168c;

        /* renamed from: d */
        public final Scheduler.Worker f65169d;

        /* renamed from: e */
        public Disposable f65170e;

        /* renamed from: f */
        public Disposable f65171f;

        /* renamed from: g */
        public volatile long f65172g;

        /* renamed from: h */
        public boolean f65173h;

        public C10986a(Observer observer, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f65166a = observer;
            this.f65167b = j;
            this.f65168c = timeUnit;
            this.f65169d = worker;
        }

        /* renamed from: a */
        public void m29974a(long j, Object obj, DebounceEmitter debounceEmitter) {
            if (j == this.f65172g) {
                this.f65166a.onNext(obj);
                debounceEmitter.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65170e.dispose();
            this.f65169d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65169d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65173h) {
                return;
            }
            this.f65173h = true;
            Disposable disposable = this.f65171f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f65166a.onComplete();
            this.f65169d.dispose();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65173h) {
                RxJavaPlugins.onError(th2);
                return;
            }
            Disposable disposable = this.f65171f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f65173h = true;
            this.f65166a.onError(th2);
            this.f65169d.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65173h) {
                return;
            }
            long j = this.f65172g + 1;
            this.f65172g = j;
            Disposable disposable = this.f65171f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.f65171f = debounceEmitter;
            debounceEmitter.setResource(this.f65169d.schedule(debounceEmitter, this.f65167b, this.f65168c));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65170e, disposable)) {
                this.f65170e = disposable;
                this.f65166a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f65163a = j;
        this.f65164b = timeUnit;
        this.f65165c = scheduler;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10986a(new SerializedObserver(observer), this.f65163a, this.f65164b, this.f65165c.createWorker()));
    }
}
