package p046rx.observers;

import java.util.Arrays;
import p046rx.Subscriber;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnCompletedFailedException;
import p046rx.exceptions.OnErrorFailedException;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.exceptions.UnsubscribeFailedException;
import p046rx.plugins.RxJavaHooks;
import p046rx.plugins.RxJavaPlugins;

/* renamed from: rx.observers.SafeSubscriber */
/* loaded from: classes7.dex */
public class SafeSubscriber<T> extends Subscriber<T> {

    /* renamed from: a */
    public final Subscriber f79574a;

    /* renamed from: b */
    public boolean f79575b;

    public SafeSubscriber(Subscriber<? super T> subscriber) {
        super(subscriber);
        this.f79574a = subscriber;
    }

    public void _onError(Throwable th2) {
        RxJavaPlugins.getInstance().getErrorHandler().handleError(th2);
        try {
            this.f79574a.onError(th2);
            try {
                unsubscribe();
            } catch (Throwable th3) {
                RxJavaHooks.onError(th3);
                throw new OnErrorFailedException(th3);
            }
        } catch (OnErrorNotImplementedException e) {
            try {
                unsubscribe();
                throw e;
            } catch (Throwable th4) {
                RxJavaHooks.onError(th4);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th2, th4)));
            }
        } catch (Throwable th5) {
            RxJavaHooks.onError(th5);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th2, th5)));
            } catch (Throwable th6) {
                RxJavaHooks.onError(th6);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th2, th5, th6)));
            }
        }
    }

    public Subscriber<? super T> getActual() {
        return this.f79574a;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        UnsubscribeFailedException unsubscribeFailedException;
        if (!this.f79575b) {
            this.f79575b = true;
            try {
                this.f79574a.onCompleted();
                try {
                    unsubscribe();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    Exceptions.throwIfFatal(th2);
                    RxJavaHooks.onError(th2);
                    throw new OnCompletedFailedException(th2.getMessage(), th2);
                } catch (Throwable th3) {
                    try {
                        unsubscribe();
                        throw th3;
                    } finally {
                    }
                }
            }
        }
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        if (!this.f79575b) {
            this.f79575b = true;
            _onError(th2);
        }
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        try {
            if (!this.f79575b) {
                this.f79574a.onNext(t);
            }
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, this);
        }
    }
}