package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableDematerialize<T, R> extends AbstractC11078a {

    /* renamed from: a */
    public final Function f65260a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDematerialize$a */
    /* loaded from: classes5.dex */
    public static final class C10980a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65261a;

        /* renamed from: b */
        public final Function f65262b;

        /* renamed from: c */
        public boolean f65263c;

        /* renamed from: d */
        public Disposable f65264d;

        public C10980a(Observer observer, Function function) {
            this.f65261a = observer;
            this.f65262b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65264d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65264d.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65263c) {
                return;
            }
            this.f65263c = true;
            this.f65261a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65263c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65263c = true;
            this.f65261a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65263c) {
                if (obj instanceof Notification) {
                    Notification notification = (Notification) obj;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.f65262b.apply(obj), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.f65264d.dispose();
                    onError(notification2.getError());
                } else if (notification2.isOnComplete()) {
                    this.f65264d.dispose();
                    onComplete();
                } else {
                    this.f65261a.onNext(notification2.getValue());
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65264d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65264d, disposable)) {
                this.f65264d = disposable;
                this.f65261a.onSubscribe(this);
            }
        }
    }

    public ObservableDematerialize(ObservableSource<T> observableSource, Function<? super T, ? extends Notification<R>> function) {
        super(observableSource);
        this.f65260a = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new C10980a(observer, this.f65260a));
    }
}