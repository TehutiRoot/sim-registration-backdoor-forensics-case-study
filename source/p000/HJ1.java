package p000;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import p046rx.Single;
import p046rx.SingleSubscriber;

/* renamed from: HJ1 */
/* loaded from: classes5.dex */
public final class HJ1 extends Maybe {

    /* renamed from: a */
    public final Single f2193a;

    /* renamed from: HJ1$a */
    /* loaded from: classes5.dex */
    public static final class C0517a extends SingleSubscriber implements Disposable {

        /* renamed from: b */
        public final MaybeObserver f2194b;

        public C0517a(MaybeObserver maybeObserver) {
            this.f2194b = maybeObserver;
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
            this.f2194b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (obj == null) {
                this.f2194b.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f2194b.onSuccess(obj);
            }
        }
    }

    public HJ1(Single single) {
        this.f2193a = single;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver) {
        C0517a c0517a = new C0517a(maybeObserver);
        maybeObserver.onSubscribe(c0517a);
        this.f2193a.subscribe(c0517a);
    }
}
