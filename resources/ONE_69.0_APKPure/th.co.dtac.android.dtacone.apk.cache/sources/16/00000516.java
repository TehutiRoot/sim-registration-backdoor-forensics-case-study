package p000;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import p046rx.SingleSubscriber;

/* renamed from: FK1 */
/* loaded from: classes5.dex */
public final class FK1 extends Single {

    /* renamed from: a */
    public final p046rx.Single f1660a;

    /* renamed from: FK1$a */
    /* loaded from: classes5.dex */
    public static final class C0376a extends SingleSubscriber implements Disposable {

        /* renamed from: b */
        public final SingleObserver f1661b;

        public C0376a(SingleObserver singleObserver) {
            this.f1661b = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            unsubscribe();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return isUnsubscribed();
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f1661b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (obj == null) {
                this.f1661b.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f1661b.onSuccess(obj);
            }
        }
    }

    public FK1(p046rx.Single single) {
        this.f1660a = single;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver) {
        C0376a c0376a = new C0376a(singleObserver);
        singleObserver.onSubscribe(c0376a);
        this.f1660a.subscribe(c0376a);
    }
}