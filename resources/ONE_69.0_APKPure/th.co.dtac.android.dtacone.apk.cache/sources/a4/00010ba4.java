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
    public final Single f79191a;

    /* renamed from: b */
    public final Observable f79192b;

    /* renamed from: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther$a */
    /* loaded from: classes7.dex */
    public class C13713a extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ SingleSubscriber f79193b;

        public C13713a(SingleSubscriber singleSubscriber) {
            this.f79193b = singleSubscriber;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f79193b.onError(th2);
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79193b.onSuccess(obj);
        }
    }

    /* renamed from: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther$b */
    /* loaded from: classes7.dex */
    public class C13714b extends Subscriber {

        /* renamed from: a */
        public boolean f79195a;

        /* renamed from: b */
        public final /* synthetic */ SingleSubscriber f79196b;

        /* renamed from: c */
        public final /* synthetic */ SerialSubscription f79197c;

        public C13714b(SingleSubscriber singleSubscriber, SerialSubscription serialSubscription) {
            this.f79196b = singleSubscriber;
            this.f79197c = serialSubscription;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f79195a) {
                return;
            }
            this.f79195a = true;
            this.f79197c.set(this.f79196b);
            SingleOnSubscribeDelaySubscriptionOther.this.f79191a.subscribe(this.f79196b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f79195a) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79195a = true;
            this.f79196b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public SingleOnSubscribeDelaySubscriptionOther(Single<? extends T> single, Observable<?> observable) {
        this.f79191a = single;
        this.f79192b = observable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        C13713a c13713a = new C13713a(singleSubscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        singleSubscriber.add(serialSubscription);
        C13714b c13714b = new C13714b(c13713a, serialSubscription);
        serialSubscription.set(c13714b);
        this.f79192b.subscribe((Subscriber) c13714b);
    }
}