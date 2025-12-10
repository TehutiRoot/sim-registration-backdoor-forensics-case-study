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
    public final Single f79655a;

    /* renamed from: rx.singles.BlockingSingle$a */
    /* loaded from: classes7.dex */
    public class C13865a extends SingleSubscriber {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f79656b;

        /* renamed from: c */
        public final /* synthetic */ CountDownLatch f79657c;

        /* renamed from: d */
        public final /* synthetic */ AtomicReference f79658d;

        public C13865a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f79656b = atomicReference;
            this.f79657c = countDownLatch;
            this.f79658d = atomicReference2;
        }

        @Override // p046rx.SingleSubscriber
        public void onError(Throwable th2) {
            this.f79658d.set(th2);
            this.f79657c.countDown();
        }

        @Override // p046rx.SingleSubscriber
        public void onSuccess(Object obj) {
            this.f79656b.set(obj);
            this.f79657c.countDown();
        }
    }

    public BlockingSingle(Single single) {
        this.f79655a = single;
    }

    public static <T> BlockingSingle<T> from(Single<? extends T> single) {
        return new BlockingSingle<>(single);
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.f79655a.toObservable());
    }

    public T value() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, this.f79655a.subscribe(new C13865a(atomicReference, countDownLatch, atomicReference2)));
        Throwable th2 = (Throwable) atomicReference2.get();
        if (th2 == null) {
            return (T) atomicReference.get();
        }
        throw Exceptions.propagate(th2);
    }
}