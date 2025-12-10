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
    public final Func1 f78648a;

    /* renamed from: b */
    public final Func2 f78649b;

    /* renamed from: rx.internal.operators.OperatorMapPair$a */
    /* loaded from: classes7.dex */
    public static class C13581a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78650a;

        public C13581a(Func1 func1) {
            this.f78650a = func1;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Object obj) {
            return Observable.from((Iterable) this.f78650a.call(obj));
        }
    }

    /* renamed from: rx.internal.operators.OperatorMapPair$b */
    /* loaded from: classes7.dex */
    public static final class C13582b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78651a;

        /* renamed from: b */
        public final Func1 f78652b;

        /* renamed from: c */
        public final Func2 f78653c;

        /* renamed from: d */
        public boolean f78654d;

        public C13582b(Subscriber subscriber, Func1 func1, Func2 func2) {
            this.f78651a = subscriber;
            this.f78652b = func1;
            this.f78653c = func2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78654d) {
                return;
            }
            this.f78651a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78654d) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78654d = true;
            this.f78651a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                this.f78651a.onNext(((Observable) this.f78652b.call(obj)).map(new C13583c(obj, this.f78653c)));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78651a.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OperatorMapPair$c */
    /* loaded from: classes7.dex */
    public static final class C13583c implements Func1 {

        /* renamed from: a */
        public final Object f78655a;

        /* renamed from: b */
        public final Func2 f78656b;

        public C13583c(Object obj, Func2 func2) {
            this.f78655a = obj;
            this.f78656b = func2;
        }

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            return this.f78656b.call(this.f78655a, obj);
        }
    }

    public OperatorMapPair(Func1<? super T, ? extends Observable<? extends U>> func1, Func2<? super T, ? super U, ? extends R> func2) {
        this.f78648a = func1;
        this.f78649b = func2;
    }

    public static <T, U> Func1<T, Observable<U>> convertSelector(Func1<? super T, ? extends Iterable<? extends U>> func1) {
        return new C13581a(func1);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<? extends R>> subscriber) {
        C13582b c13582b = new C13582b(subscriber, this.f78648a, this.f78649b);
        subscriber.add(c13582b);
        return c13582b;
    }
}