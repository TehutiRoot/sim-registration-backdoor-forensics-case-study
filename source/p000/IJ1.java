package p000;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import p046rx.SingleSubscriber;

/* renamed from: IJ1 */
/* loaded from: classes5.dex */
public final class IJ1 extends Single {

    /* renamed from: a */
    public final p046rx.Single f2483a;

    /* renamed from: IJ1$a */
    /* loaded from: classes5.dex */
    public static final class C0590a extends SingleSubscriber implements Disposable {

        /* renamed from: b */
        public final SingleObserver f2484b;

        public C0590a(SingleObserver singleObserver) {
            this.f2484b = singleObserver;
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
            this.f2484b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (obj == null) {
                this.f2484b.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f2484b.onSuccess(obj);
            }
        }
    }

    public IJ1(p046rx.Single single) {
        this.f2483a = single;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver) {
        C0590a c0590a = new C0590a(singleObserver);
        singleObserver.onSubscribe(c0590a);
        this.f2483a.subscribe(c0590a);
    }
}
