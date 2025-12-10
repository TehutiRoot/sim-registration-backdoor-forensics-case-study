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
    public final Flowable f64992a;

    /* renamed from: b */
    public final Function f64993b;

    /* renamed from: c */
    public final boolean f64994c;

    /* loaded from: classes5.dex */
    public static final class SwitchMapCompletableObserver implements FlowableSubscriber, Disposable {

        /* renamed from: h */
        public static final SwitchMapInnerObserver f64995h = new SwitchMapInnerObserver(null);

        /* renamed from: a */
        public final CompletableObserver f64996a;

        /* renamed from: b */
        public final Function f64997b;

        /* renamed from: c */
        public final boolean f64998c;

        /* renamed from: d */
        public final AtomicThrowable f64999d = new AtomicThrowable();

        /* renamed from: e */
        public final AtomicReference f65000e = new AtomicReference();

        /* renamed from: f */
        public volatile boolean f65001f;

        /* renamed from: g */
        public Subscription f65002g;

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
                this.parent.m30344b(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.m30343c(this, th2);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function function, boolean z) {
            this.f64996a = completableObserver;
            this.f64997b = function;
            this.f64998c = z;
        }

        /* renamed from: a */
        public void m30345a() {
            AtomicReference atomicReference = this.f65000e;
            SwitchMapInnerObserver switchMapInnerObserver = f64995h;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                switchMapInnerObserver2.dispose();
            }
        }

        /* renamed from: b */
        public void m30344b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (AbstractC23094xo1.m479a(this.f65000e, switchMapInnerObserver, null) && this.f65001f) {
                Throwable terminate = this.f64999d.terminate();
                if (terminate == null) {
                    this.f64996a.onComplete();
                } else {
                    this.f64996a.onError(terminate);
                }
            }
        }

        /* renamed from: c */
        public void m30343c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (AbstractC23094xo1.m479a(this.f65000e, switchMapInnerObserver, null) && this.f64999d.addThrowable(th2)) {
                if (this.f64998c) {
                    if (this.f65001f) {
                        this.f64996a.onError(this.f64999d.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                Throwable terminate = this.f64999d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f64996a.onError(terminate);
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65002g.cancel();
            m30345a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65000e.get() == f64995h) {
                return true;
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f65001f = true;
            if (this.f65000e.get() == null) {
                Throwable terminate = this.f64999d.terminate();
                if (terminate == null) {
                    this.f64996a.onComplete();
                } else {
                    this.f64996a.onError(terminate);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f64999d.addThrowable(th2)) {
                if (this.f64998c) {
                    onComplete();
                    return;
                }
                m30345a();
                Throwable terminate = this.f64999d.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.f64996a.onError(terminate);
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
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f64997b.apply(obj), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = (SwitchMapInnerObserver) this.f65000e.get();
                    if (switchMapInnerObserver == f64995h) {
                        return;
                    }
                } while (!AbstractC23094xo1.m479a(this.f65000e, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65002g.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65002g, subscription)) {
                this.f65002g = subscription;
                this.f64996a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.f64992a = flowable;
        this.f64993b = function;
        this.f64994c = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64992a.subscribe((FlowableSubscriber) new SwitchMapCompletableObserver(completableObserver, this.f64993b, this.f64994c));
    }
}