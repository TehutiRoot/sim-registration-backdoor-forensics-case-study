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
    public static final Object f78904c = new Object();

    /* renamed from: a */
    public final Func2 f78905a;

    /* renamed from: b */
    public final Observable f78906b;

    /* renamed from: rx.internal.operators.OperatorWithLatestFrom$a */
    /* loaded from: classes7.dex */
    public class C13698a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78907a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13698a(Subscriber subscriber, boolean z, AtomicReference atomicReference, SerializedSubscriber serializedSubscriber) {
            super(subscriber, z);
            this.f78907a = atomicReference;
            this.f78908b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78908b.onCompleted();
            this.f78908b.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78908b.onError(th2);
            this.f78908b.unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Object obj2 = this.f78907a.get();
            if (obj2 != OperatorWithLatestFrom.f78904c) {
                try {
                    this.f78908b.onNext(OperatorWithLatestFrom.this.f78905a.call(obj, obj2));
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWithLatestFrom$b */
    /* loaded from: classes7.dex */
    public class C13699b extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78910a;

        /* renamed from: b */
        public final /* synthetic */ SerializedSubscriber f78911b;

        public C13699b(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber) {
            this.f78910a = atomicReference;
            this.f78911b = serializedSubscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78910a.get() == OperatorWithLatestFrom.f78904c) {
                this.f78911b.onCompleted();
                this.f78911b.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78911b.onError(th2);
            this.f78911b.unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78910a.set(obj);
        }
    }

    public OperatorWithLatestFrom(Observable<? extends U> observable, Func2<? super T, ? super U, ? extends R> func2) {
        this.f78906b = observable;
        this.f78905a = func2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        subscriber.add(serializedSubscriber);
        AtomicReference atomicReference = new AtomicReference(f78904c);
        C13698a c13698a = new C13698a(serializedSubscriber, true, atomicReference, serializedSubscriber);
        C13699b c13699b = new C13699b(atomicReference, serializedSubscriber);
        serializedSubscriber.add(c13698a);
        serializedSubscriber.add(c13699b);
        this.f78906b.unsafeSubscribe(c13699b);
        return c13698a;
    }
}
