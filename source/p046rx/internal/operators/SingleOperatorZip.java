package p046rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.FuncN;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.SingleOperatorZip */
/* loaded from: classes7.dex */
public final class SingleOperatorZip {

    /* renamed from: rx.internal.operators.SingleOperatorZip$a */
    /* loaded from: classes7.dex */
    public static class C13718a implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Single[] f79011a;

        /* renamed from: b */
        public final /* synthetic */ FuncN f79012b;

        /* renamed from: rx.internal.operators.SingleOperatorZip$a$a */
        /* loaded from: classes7.dex */
        public class C13719a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ Object[] f79013b;

            /* renamed from: c */
            public final /* synthetic */ int f79014c;

            /* renamed from: d */
            public final /* synthetic */ AtomicInteger f79015d;

            /* renamed from: e */
            public final /* synthetic */ SingleSubscriber f79016e;

            /* renamed from: f */
            public final /* synthetic */ AtomicBoolean f79017f;

            public C13719a(Object[] objArr, int i, AtomicInteger atomicInteger, SingleSubscriber singleSubscriber, AtomicBoolean atomicBoolean) {
                this.f79013b = objArr;
                this.f79014c = i;
                this.f79015d = atomicInteger;
                this.f79016e = singleSubscriber;
                this.f79017f = atomicBoolean;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                if (this.f79017f.compareAndSet(false, true)) {
                    this.f79016e.onError(th2);
                } else {
                    RxJavaHooks.onError(th2);
                }
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f79013b[this.f79014c] = obj;
                if (this.f79015d.decrementAndGet() == 0) {
                    try {
                        this.f79016e.onSuccess(C13718a.this.f79012b.call(this.f79013b));
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        onError(th2);
                    }
                }
            }
        }

        public C13718a(Single[] singleArr, FuncN funcN) {
            this.f79011a = singleArr;
            this.f79012b = funcN;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            if (this.f79011a.length == 0) {
                singleSubscriber.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f79011a.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f79011a.length];
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            singleSubscriber.add(compositeSubscription);
            for (int i = 0; i < this.f79011a.length && !compositeSubscription.isUnsubscribed() && !atomicBoolean.get(); i++) {
                C13719a c13719a = new C13719a(objArr, i, atomicInteger, singleSubscriber, atomicBoolean);
                compositeSubscription.add(c13719a);
                if (!compositeSubscription.isUnsubscribed() && !atomicBoolean.get()) {
                    this.f79011a[i].subscribe(c13719a);
                } else {
                    return;
                }
            }
        }
    }

    public static <T, R> Single<R> zip(Single<? extends T>[] singleArr, FuncN<? extends R> funcN) {
        return Single.create(new C13718a(singleArr, funcN));
    }
}
