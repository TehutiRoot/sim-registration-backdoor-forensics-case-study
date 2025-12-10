package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscriber;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther */
/* loaded from: classes7.dex */
public final class SingleOnSubscribeDelaySubscriptionOther<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single f78985a;

    /* renamed from: b */
    public final Observable f78986b;

    /* renamed from: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther$a */
    /* loaded from: classes7.dex */
    public class C13712a extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ SingleSubscriber f78987b;

        public C13712a(SingleSubscriber singleSubscriber) {
            this.f78987b = singleSubscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f78987b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f78987b.onSuccess(obj);
        }
    }

    /* renamed from: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther$b */
    /* loaded from: classes7.dex */
    public class C13713b extends Subscriber {

        /* renamed from: a */
        public boolean f78989a;

        /* renamed from: b */
        public final /* synthetic */ SingleSubscriber f78990b;

        /* renamed from: c */
        public final /* synthetic */ SerialSubscription f78991c;

        public C13713b(SingleSubscriber singleSubscriber, SerialSubscription serialSubscription) {
            this.f78990b = singleSubscriber;
            this.f78991c = serialSubscription;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78989a) {
                return;
            }
            this.f78989a = true;
            this.f78991c.set(this.f78990b);
            SingleOnSubscribeDelaySubscriptionOther.this.f78985a.subscribe(this.f78990b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78989a) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78989a = true;
            this.f78990b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public SingleOnSubscribeDelaySubscriptionOther(Single<? extends T> single, Observable<?> observable) {
        this.f78985a = single;
        this.f78986b = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13712a c13712a = new C13712a(singleSubscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        singleSubscriber.add(serialSubscription);
        C13713b c13713b = new C13713b(c13712a, serialSubscription);
        serialSubscription.set(c13713b);
        this.f78986b.subscribe((Subscriber) c13713b);
    }
}
