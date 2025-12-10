package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.OnErrorThrowable;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorMapPair */
/* loaded from: classes7.dex */
public final class OperatorMapPair<T, U, R> implements Observable.Operator<Observable<? extends R>, T> {

    /* renamed from: a */
    public final Func1 f78442a;

    /* renamed from: b */
    public final Func2 f78443b;

    /* renamed from: rx.internal.operators.OperatorMapPair$a */
    /* loaded from: classes7.dex */
    public static class C13580a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78444a;

        public C13580a(Func1 func1) {
            this.f78444a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Object obj) {
            return Observable.from((Iterable) this.f78444a.call(obj));
        }
    }

    /* renamed from: rx.internal.operators.OperatorMapPair$b */
    /* loaded from: classes7.dex */
    public static final class C13581b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78445a;

        /* renamed from: b */
        public final Func1 f78446b;

        /* renamed from: c */
        public final Func2 f78447c;

        /* renamed from: d */
        public boolean f78448d;

        public C13581b(Subscriber subscriber, Func1 func1, Func2 func2) {
            this.f78445a = subscriber;
            this.f78446b = func1;
            this.f78447c = func2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78448d) {
                return;
            }
            this.f78445a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78448d) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78448d = true;
            this.f78445a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78445a.onNext(((Observable) this.f78446b.call(obj)).map(new C13582c(obj, this.f78447c)));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78445a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorMapPair$c */
    /* loaded from: classes7.dex */
    public static final class C13582c implements Func1 {

        /* renamed from: a */
        public final Object f78449a;

        /* renamed from: b */
        public final Func2 f78450b;

        public C13582c(Object obj, Func2 func2) {
            this.f78449a = obj;
            this.f78450b = func2;
        }

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            return this.f78450b.call(this.f78449a, obj);
        }
    }

    public OperatorMapPair(Func1<? super T, ? extends Observable<? extends U>> func1, Func2<? super T, ? super U, ? extends R> func2) {
        this.f78442a = func1;
        this.f78443b = func2;
    }

    public static <T, U> Func1<T, Observable<U>> convertSelector(Func1<? super T, ? extends Iterable<? extends U>> func1) {
        return new C13580a(func1);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<? extends R>> subscriber) {
        C13581b c13581b = new C13581b(subscriber, this.f78442a, this.f78443b);
        subscriber.add(c13581b);
        return c13581b;
    }
}
