package p000;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import p046rx.Single;
import p046rx.SingleSubscriber;

/* renamed from: EK1 */
/* loaded from: classes5.dex */
public final class EK1 extends Maybe {

    /* renamed from: a */
    public final Single f1335a;

    /* renamed from: EK1$a */
    /* loaded from: classes5.dex */
    public static final class C0308a extends SingleSubscriber implements Disposable {

        /* renamed from: b */
        public final MaybeObserver f1336b;

        public C0308a(MaybeObserver maybeObserver) {
            this.f1336b = maybeObserver;
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
            this.f1336b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            if (obj == null) {
                this.f1336b.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f1336b.onSuccess(obj);
            }
        }
    }

    public EK1(Single single) {
        this.f1335a = single;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver maybeObserver) {
        C0308a c0308a = new C0308a(maybeObserver);
        maybeObserver.onSubscribe(c0308a);
        this.f1335a.subscribe(c0308a);
    }
}