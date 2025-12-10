package retrofit2.adapter.rxjava;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.CompositeException;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnCompletedFailedException;
import p046rx.exceptions.OnErrorFailedException;
import p046rx.exceptions.OnErrorNotImplementedException;
import p046rx.plugins.RxJavaPlugins;
import retrofit2.Response;

/* loaded from: classes5.dex */
final class ResultOnSubscribe<T> implements Observable.OnSubscribe<Result<T>> {
    private final Observable.OnSubscribe<Response<T>> upstream;

    /* loaded from: classes5.dex */
    public static class ResultSubscriber<R> extends Subscriber<Response<R>> {
        private final Subscriber<? super Result<R>> subscriber;

        public ResultSubscriber(Subscriber<? super Result<R>> subscriber) {
            super(subscriber);
            this.subscriber = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.subscriber.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.subscriber.onNext(Result.error(th2));
                this.subscriber.onCompleted();
            } catch (Throwable th3) {
                try {
                    this.subscriber.onError(th3);
                } catch (OnCompletedFailedException e) {
                    e = e;
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
                } catch (OnErrorFailedException e2) {
                    e = e2;
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
                } catch (OnErrorNotImplementedException e3) {
                    e = e3;
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(th3, th4));
                }
            }
        }

        @Override // p046rx.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Response) ((Response) obj));
        }

        public void onNext(Response<R> response) {
            this.subscriber.onNext(Result.response(response));
        }
    }

    public ResultOnSubscribe(Observable.OnSubscribe<Response<T>> onSubscribe) {
        this.upstream = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super Result<T>> subscriber) {
        this.upstream.call(new ResultSubscriber(subscriber));
    }
}
