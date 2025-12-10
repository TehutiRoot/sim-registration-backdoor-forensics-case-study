package p046rx.internal.operators;

import java.util.NoSuchElementException;
import p046rx.Observable;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleFromObservable */
/* loaded from: classes7.dex */
public final class SingleFromObservable<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable.OnSubscribe f78968a;

    /* renamed from: rx.internal.operators.SingleFromObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13708a extends Subscriber {

        /* renamed from: a */
        public final SingleSubscriber f78969a;

        /* renamed from: b */
        public Object f78970b;

        /* renamed from: c */
        public int f78971c;

        public C13708a(SingleSubscriber singleSubscriber) {
            this.f78969a = singleSubscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            int i = this.f78971c;
            if (i == 0) {
                this.f78969a.onError(new NoSuchElementException());
            } else if (i == 1) {
                this.f78971c = 2;
                Object obj = this.f78970b;
                this.f78970b = null;
                this.f78969a.onSuccess(obj);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78971c == 2) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78970b = null;
            this.f78969a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f78971c;
            if (i == 0) {
                this.f78971c = 1;
                this.f78970b = obj;
            } else if (i == 1) {
                this.f78971c = 2;
                this.f78969a.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public SingleFromObservable(Observable.OnSubscribe<T> onSubscribe) {
        this.f78968a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13708a c13708a = new C13708a(singleSubscriber);
        singleSubscriber.add(c13708a);
        this.f78968a.call(c13708a);
    }
}
