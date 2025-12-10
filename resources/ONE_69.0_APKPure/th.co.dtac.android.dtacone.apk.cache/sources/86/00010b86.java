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
    public final Observable f79119a;

    /* renamed from: b */
    public final Observable[] f79120b;

    /* renamed from: c */
    public final Iterable f79121c;

    /* renamed from: d */
    public final FuncN f79122d;

    /* renamed from: rx.internal.operators.OperatorWithLatestFromMany$a */
    /* loaded from: classes7.dex */
    public static final class C13701a extends Subscriber {

        /* renamed from: f */
        public static final Object f79123f = new Object();

        /* renamed from: a */
        public final Subscriber f79124a;

        /* renamed from: b */
        public final FuncN f79125b;

        /* renamed from: c */
        public final AtomicReferenceArray f79126c;

        /* renamed from: d */
        public final AtomicInteger f79127d;

        /* renamed from: e */
        public boolean f79128e;

        public C13701a(Subscriber subscriber, FuncN funcN, int i) {
            this.f79124a = subscriber;
            this.f79125b = funcN;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
            for (int i2 = 0; i2 <= i; i2++) {
                atomicReferenceArray.lazySet(i2, f79123f);
            }
            this.f79126c = atomicReferenceArray;
            this.f79127d = new AtomicInteger(i);
            request(0L);
        }

        /* renamed from: b */
        public void m23121b(int i) {
            if (this.f79126c.get(i) == f79123f) {
                onCompleted();
            }
        }

        /* renamed from: c */
        public void m23120c(int i, Throwable th2) {
            onError(th2);
        }

        /* renamed from: d */
        public void m23119d(int i, Object obj) {
            if (this.f79126c.getAndSet(i, obj) == f79123f) {
                this.f79127d.decrementAndGet();
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f79128e) {
                return;
            }
            this.f79128e = true;
            unsubscribe();
            this.f79124a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f79128e) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79128e = true;
            unsubscribe();
            this.f79124a.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f79128e) {
                return;
            }
            if (this.f79127d.get() == 0) {
                AtomicReferenceArray atomicReferenceArray = this.f79126c;
                int length = atomicReferenceArray.length();
                atomicReferenceArray.lazySet(0, obj);
                Object[] objArr = new Object[atomicReferenceArray.length()];
                for (int i = 0; i < length; i++) {
                    objArr[i] = atomicReferenceArray.get(i);
                }
                try {
                    this.f79124a.onNext(this.f79125b.call(objArr));
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
            this.f79124a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorWithLatestFromMany$b */
    /* loaded from: classes7.dex */
    public static final class C13702b extends Subscriber {

        /* renamed from: a */
        public final C13701a f79129a;

        /* renamed from: b */
        public final int f79130b;

        public C13702b(C13701a c13701a, int i) {
            this.f79129a = c13701a;
            this.f79130b = i;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79129a.m23121b(this.f79130b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79129a.m23120c(this.f79130b, th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79129a.m23119d(this.f79130b, obj);
        }
    }

    public OperatorWithLatestFromMany(Observable<T> observable, Observable<?>[] observableArr, Iterable<Observable<?>> iterable, FuncN<R> funcN) {
        this.f79119a = observable;
        this.f79120b = observableArr;
        this.f79121c = iterable;
        this.f79122d = funcN;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        int i;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Observable[] observableArr = this.f79120b;
        int i2 = 0;
        if (observableArr != null) {
            i = observableArr.length;
        } else {
            observableArr = new Observable[8];
            int i3 = 0;
            for (Observable observable : this.f79121c) {
                if (i3 == observableArr.length) {
                    observableArr = (Observable[]) Arrays.copyOf(observableArr, (i3 >> 2) + i3);
                }
                observableArr[i3] = observable;
                i3++;
            }
            i = i3;
        }
        C13701a c13701a = new C13701a(subscriber, this.f79122d, i);
        serializedSubscriber.add(c13701a);
        while (i2 < i) {
            if (serializedSubscriber.isUnsubscribed()) {
                return;
            }
            int i4 = i2 + 1;
            C13702b c13702b = new C13702b(c13701a, i4);
            c13701a.add(c13702b);
            observableArr[i2].unsafeSubscribe(c13702b);
            i2 = i4;
        }
        this.f79119a.unsafeSubscribe(c13701a);
    }
}