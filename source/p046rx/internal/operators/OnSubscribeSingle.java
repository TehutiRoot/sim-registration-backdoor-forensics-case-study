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
    public final Observable f78107a;

    /* renamed from: rx.internal.operators.OnSubscribeSingle$a */
    /* loaded from: classes7.dex */
    public class C13511a extends Subscriber {

        /* renamed from: a */
        public boolean f78108a;

        /* renamed from: b */
        public boolean f78109b;

        /* renamed from: c */
        public Object f78110c;

        /* renamed from: d */
        public final /* synthetic */ SingleSubscriber f78111d;

        public C13511a(SingleSubscriber singleSubscriber) {
            this.f78111d = singleSubscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78108a) {
                if (this.f78109b) {
                    this.f78111d.onSuccess(this.f78110c);
                } else {
                    this.f78111d.onError(new NoSuchElementException("Observable emitted no items"));
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78111d.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78109b) {
                this.f78108a = true;
                this.f78111d.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
                return;
            }
            this.f78109b = true;
            this.f78110c = obj;
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(2L);
        }
    }

    public OnSubscribeSingle(Observable<T> observable) {
        this.f78107a = observable;
    }

    public static <T> OnSubscribeSingle<T> create(Observable<T> observable) {
        return new OnSubscribeSingle<>(observable);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13511a c13511a = new C13511a(singleSubscriber);
        singleSubscriber.add(c13511a);
        this.f78107a.unsafeSubscribe(c13511a);
    }
}
