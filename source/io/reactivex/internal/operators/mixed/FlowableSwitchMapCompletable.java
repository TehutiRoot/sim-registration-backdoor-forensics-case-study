package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {

    /* renamed from: a */
    public final Flowable f64929a;

    /* renamed from: b */
    public final Function f64930b;

    /* renamed from: c */
    public final boolean f64931c;

    /* loaded from: classes5.dex */
    public static final class SwitchMapCompletableObserver implements FlowableSubscriber, Disposable {

        /* renamed from: h */
        public static final SwitchMapInnerObserver f64932h = new SwitchMapInnerObserver(null);

        /* renamed from: a */
        public final CompletableObserver f64933a;

        /* renamed from: b */
        public final Function f64934b;

        /* renamed from: c */
        public final boolean f64935c;

        /* renamed from: d */
        public final AtomicThrowable f64936d = new AtomicThrowable();

        /* renamed from: e */
        public final AtomicReference f64937e = new AtomicReference();

        /* renamed from: f */
        public volatile boolean f64938f;

        /* renamed from: g */
        public Subscription f64939g;

        /* loaded from: classes5.dex */
        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver parent;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                this.parent.m30004b(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.m30003c(this, th2);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function function, boolean z) {
            this.f64933a = completableObserver;
            this.f64934b = function;
            this.f64935c = z;
        }

        /* renamed from: a */
        public void m30005a() {
            AtomicReference atomicReference = this.f64937e;
            SwitchMapInnerObserver switchMapInnerObserver = f64932h;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                switchMapInnerObserver2.dispose();
            }
        }

        /* renamed from: b */
        public void m30004b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (AbstractC17300An1.m69050a(this.f64937e, switchMapInnerObserver, null) && this.f64938f) {
                Throwable terminate = this.f64936d.terminate();
                if (terminate == null) {
                    this.f64933a.onComplete();
                } else {
                    this.f64933a.onError(terminate);
                }
            }
        }

        /* renamed from: c */
        public void m30003c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (AbstractC17300An1.m69050a(this.f64937e, switchMapInnerObserver, null) && this.f64936d.addThrowable(th2)) {
                if (this.f64935c) {
                    if (this.f64938f) {
                        this.f64933a.onError(this.f64936d.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                Throwable terminate = this.f64936d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f64933a.onError(terminate);
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64939g.cancel();
            m30005a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f64937e.get() == f64932h) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f64938f = true;
            if (this.f64937e.get() == null) {
                Throwable terminate = this.f64936d.terminate();
                if (terminate == null) {
                    this.f64933a.onComplete();
                } else {
                    this.f64933a.onError(terminate);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64936d.addThrowable(th2)) {
                if (this.f64935c) {
                    onComplete();
                    return;
                }
                m30005a();
                Throwable terminate = this.f64936d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f64933a.onError(terminate);
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f64934b.apply(obj), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = (SwitchMapInnerObserver) this.f64937e.get();
                    if (switchMapInnerObserver == f64932h) {
                        return;
                    }
                } while (!AbstractC17300An1.m69050a(this.f64937e, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64939g.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f64939g, subscription)) {
                this.f64939g = subscription;
                this.f64933a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.f64929a = flowable;
        this.f64930b = function;
        this.f64931c = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64929a.subscribe((FlowableSubscriber) new SwitchMapCompletableObserver(completableObserver, this.f64930b, this.f64931c));
    }
}
