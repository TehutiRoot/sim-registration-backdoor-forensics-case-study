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
    public static class C13719a implements Single.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Single[] f79217a;

        /* renamed from: b */
        public final /* synthetic */ FuncN f79218b;

        /* renamed from: rx.internal.operators.SingleOperatorZip$a$a */
        /* loaded from: classes7.dex */
        public class C13720a extends SingleSubscriber {

            /* renamed from: b */
            public final /* synthetic */ Object[] f79219b;

            /* renamed from: c */
            public final /* synthetic */ int f79220c;

            /* renamed from: d */
            public final /* synthetic */ AtomicInteger f79221d;

            /* renamed from: e */
            public final /* synthetic */ SingleSubscriber f79222e;

            /* renamed from: f */
            public final /* synthetic */ AtomicBoolean f79223f;

            public C13720a(Object[] objArr, int i, AtomicInteger atomicInteger, SingleSubscriber singleSubscriber, AtomicBoolean atomicBoolean) {
                this.f79219b = objArr;
                this.f79220c = i;
                this.f79221d = atomicInteger;
                this.f79222e = singleSubscriber;
                this.f79223f = atomicBoolean;
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                if (this.f79223f.compareAndSet(false, true)) {
                    this.f79222e.onError(th2);
                } else {
                    RxJavaHooks.onError(th2);
                }
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.f79219b[this.f79220c] = obj;
                if (this.f79221d.decrementAndGet() == 0) {
                    try {
                        this.f79222e.onSuccess(C13719a.this.f79218b.call(this.f79219b));
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        onError(th2);
                    }
                }
            }
        }

        public C13719a(Single[] singleArr, FuncN funcN) {
            this.f79217a = singleArr;
            this.f79218b = funcN;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber singleSubscriber) {
            if (this.f79217a.length == 0) {
                singleSubscriber.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f79217a.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f79217a.length];
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            singleSubscriber.add(compositeSubscription);
            for (int i = 0; i < this.f79217a.length && !compositeSubscription.isUnsubscribed() && !atomicBoolean.get(); i++) {
                C13720a c13720a = new C13720a(objArr, i, atomicInteger, singleSubscriber, atomicBoolean);
                compositeSubscription.add(c13720a);
                if (!compositeSubscription.isUnsubscribed() && !atomicBoolean.get()) {
                    this.f79217a[i].subscribe(c13720a);
                } else {
                    return;
                }
            }
        }
    }

    public static <T, R> Single<R> zip(Single<? extends T>[] singleArr, FuncN<? extends R> funcN) {
        return Single.create(new C13719a(singleArr, funcN));
    }
}