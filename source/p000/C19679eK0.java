package p000;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import p046rx.Subscriber;

/* renamed from: eK0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C19679eK0 extends Observable {

    /* renamed from: a */
    public final p046rx.Observable f61470a;

    /* renamed from: eK0$a */
    /* loaded from: classes5.dex */
    public static final class C10142a extends Subscriber implements Disposable {

        /* renamed from: a */
        public final Observer f61471a;

        /* renamed from: b */
        public boolean f61472b;

        public C10142a(Observer observer) {
            this.f61471a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            unsubscribe();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return isUnsubscribed();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f61472b) {
                return;
            }
            this.f61472b = true;
            this.f61471a.onComplete();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f61472b) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f61472b = true;
            this.f61471a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f61472b) {
                return;
            }
            if (obj == null) {
                unsubscribe();
                onError(new NullPointerException("The upstream 1.x Observable signalled a null value which is not supported in 2.x"));
                return;
            }
            this.f61471a.onNext(obj);
        }
    }

    public C19679eK0(p046rx.Observable observable) {
        this.f61470a = observable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer observer) {
        C10142a c10142a = new C10142a(observer);
        observer.onSubscribe(c10142a);
        this.f61470a.unsafeSubscribe(c10142a);
    }
}
