package p046rx.singles;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.internal.operators.BlockingOperatorToFuture;
import p046rx.internal.util.BlockingUtils;

/* renamed from: rx.singles.BlockingSingle */
/* loaded from: classes7.dex */
public final class BlockingSingle<T> {

    /* renamed from: a */
    public final Single f79449a;

    /* renamed from: rx.singles.BlockingSingle$a */
    /* loaded from: classes7.dex */
    public class C13864a extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f79450b;

        /* renamed from: c */
        public final /* synthetic */ CountDownLatch f79451c;

        /* renamed from: d */
        public final /* synthetic */ AtomicReference f79452d;

        public C13864a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f79450b = atomicReference;
            this.f79451c = countDownLatch;
            this.f79452d = atomicReference2;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f79452d.set(th2);
            this.f79451c.countDown();
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79450b.set(obj);
            this.f79451c.countDown();
        }
    }

    public BlockingSingle(Single single) {
        this.f79449a = single;
    }

    public static <T> BlockingSingle<T> from(Single<? extends T> single) {
        return new BlockingSingle<>(single);
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.f79449a.toObservable());
    }

    public T value() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, this.f79449a.subscribe(new C13864a(atomicReference, countDownLatch, atomicReference2)));
        Throwable th2 = (Throwable) atomicReference2.get();
        if (th2 == null) {
            return (T) atomicReference.get();
        }
        throw Exceptions.propagate(th2);
    }
}
