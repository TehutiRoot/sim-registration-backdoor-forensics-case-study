package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func2;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorWithLatestFrom */
/* loaded from: classes7.dex */
public final class OperatorWithLatestFrom<T, U, R> implements Observable.Operator<R, T> {

    /* renamed from: c */
    public static final Object f79110c = new Object();

    /* renamed from: a */
    public final Func2 f79111a;

    /* renamed from: b */
    public final Observable f79112b;

    /* renamed from: rx.internal.operators.OperatorWithLatestFrom$a */
    /* loaded from: classes7.dex */
    public class C13699a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f79113a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f79114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13699a(Subscriber subscriber, boolean z, AtomicReference atomicReference, SerializedSubscriber serializedSubscriber) {
            super(subscriber, z);
            this.f79113a = atomicReference;
            this.f79114b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79114b.onCompleted();
            this.f79114b.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79114b.onError(th2);
            this.f79114b.unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Object obj2 = this.f79113a.get();
            if (obj2 != OperatorWithLatestFrom.f79110c) {
                try {
                    this.f79114b.onNext(OperatorWithLatestFrom.this.f79111a.call(obj, obj2));
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWithLatestFrom$b */
    /* loaded from: classes7.dex */
    public class C13700b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f79116a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f79117b;

        public C13700b(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber) {
            this.f79116a = atomicReference;
            this.f79117b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f79116a.get() == OperatorWithLatestFrom.f79110c) {
                this.f79117b.onCompleted();
                this.f79117b.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79117b.onError(th2);
            this.f79117b.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79116a.set(obj);
        }
    }

    public OperatorWithLatestFrom(Observable<? extends U> observable, Func2<? super T, ? super U, ? extends R> func2) {
        this.f79112b = observable;
        this.f79111a = func2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        subscriber.add(serializedSubscriber);
        AtomicReference atomicReference = new AtomicReference(f79110c);
        C13699a c13699a = new C13699a(serializedSubscriber, true, atomicReference, serializedSubscriber);
        C13700b c13700b = new C13700b(atomicReference, serializedSubscriber);
        serializedSubscriber.add(c13699a);
        serializedSubscriber.add(c13700b);
        this.f79112b.unsafeSubscribe(c13700b);
        return c13699a;
    }
}