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
    public final Observable.OnSubscribe f79174a;

    /* renamed from: rx.internal.operators.SingleFromObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13709a extends Subscriber {

        /* renamed from: a */
        public final SingleSubscriber f79175a;

        /* renamed from: b */
        public Object f79176b;

        /* renamed from: c */
        public int f79177c;

        public C13709a(SingleSubscriber singleSubscriber) {
            this.f79175a = singleSubscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            int i = this.f79177c;
            if (i == 0) {
                this.f79175a.onError(new NoSuchElementException());
            } else if (i == 1) {
                this.f79177c = 2;
                Object obj = this.f79176b;
                this.f79176b = null;
                this.f79175a.onSuccess(obj);
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f79177c == 2) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79176b = null;
            this.f79175a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            int i = this.f79177c;
            if (i == 0) {
                this.f79177c = 1;
                this.f79176b = obj;
            } else if (i == 1) {
                this.f79177c = 2;
                this.f79175a.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public SingleFromObservable(Observable.OnSubscribe<T> onSubscribe) {
        this.f79174a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13709a c13709a = new C13709a(singleSubscriber);
        singleSubscriber.add(c13709a);
        this.f79174a.call(c13709a);
    }
}