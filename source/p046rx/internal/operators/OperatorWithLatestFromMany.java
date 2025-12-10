package p046rx.internal.operators;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.FuncN;
import p046rx.observers.SerializedSubscriber;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorWithLatestFromMany */
/* loaded from: classes7.dex */
public final class OperatorWithLatestFromMany<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f78913a;

    /* renamed from: b */
    public final Observable[] f78914b;

    /* renamed from: c */
    public final Iterable f78915c;

    /* renamed from: d */
    public final FuncN f78916d;

    /* renamed from: rx.internal.operators.OperatorWithLatestFromMany$a */
    /* loaded from: classes7.dex */
    public static final class C13700a extends Subscriber {

        /* renamed from: f */
        public static final Object f78917f = new Object();

        /* renamed from: a */
        public final Subscriber f78918a;

        /* renamed from: b */
        public final FuncN f78919b;

        /* renamed from: c */
        public final AtomicReferenceArray f78920c;

        /* renamed from: d */
        public final AtomicInteger f78921d;

        /* renamed from: e */
        public boolean f78922e;

        public C13700a(Subscriber subscriber, FuncN funcN, int i) {
            this.f78918a = subscriber;
            this.f78919b = funcN;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, f78917f);
            }
            this.f78920c = atomicReferenceArray;
            this.f78921d = new AtomicInteger(i);
            request(0L);
        }

        /* renamed from: b */
        public void m22933b(int i) {
            if (this.f78920c.get(i) == f78917f) {
                onCompleted();
            }
        }

        /* renamed from: c */
        public void m22932c(int i, Throwable th2) {
            onError(th2);
        }

        /* renamed from: d */
        public void m22931d(int i, Object obj) {
            if (this.f78920c.getAndSet(i, obj) == f78917f) {
                this.f78921d.decrementAndGet();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78922e) {
                return;
            }
            this.f78922e = true;
            unsubscribe();
            this.f78918a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78922e) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78922e = true;
            unsubscribe();
            this.f78918a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78922e) {
                return;
            }
            if (this.f78921d.get() == 0) {
                AtomicReferenceArray atomicReferenceArray = this.f78920c;
                int length = atomicReferenceArray.length();
                atomicReferenceArray.lazySet(0, obj);
                Object[] objArr = new Object[atomicReferenceArray.length()];
                for (int i = 0; i < length; i++) {
                    objArr[i] = atomicReferenceArray.get(i);
                }
                try {
                    this.f78918a.onNext(this.f78919b.call(objArr));
                    return;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    onError(th2);
                    return;
                }
            }
            request(1L);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.f78918a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWithLatestFromMany$b */
    /* loaded from: classes7.dex */
    public static final class C13701b extends Subscriber {

        /* renamed from: a */
        public final C13700a f78923a;

        /* renamed from: b */
        public final int f78924b;

        public C13701b(C13700a c13700a, int i) {
            this.f78923a = c13700a;
            this.f78924b = i;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78923a.m22933b(this.f78924b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78923a.m22932c(this.f78924b, th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78923a.m22931d(this.f78924b, obj);
        }
    }

    public OperatorWithLatestFromMany(Observable<T> observable, Observable<?>[] observableArr, Iterable<Observable<?>> iterable, FuncN<R> funcN) {
        this.f78913a = observable;
        this.f78914b = observableArr;
        this.f78915c = iterable;
        this.f78916d = funcN;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        int i;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Observable[] observableArr = this.f78914b;
        int i2 = 0;
        if (observableArr != null) {
            i = observableArr.length;
        } else {
            observableArr = new Observable[8];
            int i3 = 0;
            for (Observable observable : this.f78915c) {
                if (i3 == observableArr.length) {
                    observableArr = (Observable[]) Arrays.copyOf(observableArr, (i3 >> 2) + i3);
                }
                observableArr[i3] = observable;
                i3++;
            }
            i = i3;
        }
        C13700a c13700a = new C13700a(subscriber, this.f78916d, i);
        serializedSubscriber.add(c13700a);
        while (i2 < i) {
            if (serializedSubscriber.isUnsubscribed()) {
                return;
            }
            int i4 = i2 + 1;
            C13701b c13701b = new C13701b(c13700a, i4);
            c13700a.add(c13701b);
            observableArr[i2].unsafeSubscribe(c13701b);
            i2 = i4;
        }
        this.f78913a.unsafeSubscribe(c13700a);
    }
}
