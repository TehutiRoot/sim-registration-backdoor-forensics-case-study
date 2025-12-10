package p046rx.internal.operators;

import java.util.NoSuchElementException;
import p046rx.Observable;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OnSubscribeSingle */
/* loaded from: classes7.dex */
public class OnSubscribeSingle<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78313a;

    /* renamed from: rx.internal.operators.OnSubscribeSingle$a */
    /* loaded from: classes7.dex */
    public class C13512a extends Subscriber {

        /* renamed from: a */
        public boolean f78314a;

        /* renamed from: b */
        public boolean f78315b;

        /* renamed from: c */
        public Object f78316c;

        /* renamed from: d */
        public final /* synthetic */ SingleSubscriber f78317d;

        public C13512a(SingleSubscriber singleSubscriber) {
            this.f78317d = singleSubscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78314a) {
                if (this.f78315b) {
                    this.f78317d.onSuccess(this.f78316c);
                } else {
                    this.f78317d.onError(new NoSuchElementException("Observable emitted no items"));
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78317d.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78315b) {
                this.f78314a = true;
                this.f78317d.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
                return;
            }
            this.f78315b = true;
            this.f78316c = obj;
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(2L);
        }
    }

    public OnSubscribeSingle(Observable<T> observable) {
        this.f78313a = observable;
    }

    public static <T> OnSubscribeSingle<T> create(Observable<T> observable) {
        return new OnSubscribeSingle<>(observable);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13512a c13512a = new C13512a(singleSubscriber);
        singleSubscriber.add(c13512a);
        this.f78313a.unsafeSubscribe(c13512a);
    }
}