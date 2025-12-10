package p046rx.internal.operators;

import java.util.NoSuchElementException;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.internal.producers.SingleProducer;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorSingle */
/* loaded from: classes7.dex */
public final class OperatorSingle<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final boolean f78657a;

    /* renamed from: b */
    public final Object f78658b;

    /* renamed from: rx.internal.operators.OperatorSingle$a */
    /* loaded from: classes7.dex */
    public static final class C13638a {

        /* renamed from: a */
        public static final OperatorSingle f78659a = new OperatorSingle();
    }

    /* renamed from: rx.internal.operators.OperatorSingle$b */
    /* loaded from: classes7.dex */
    public static final class C13639b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78660a;

        /* renamed from: b */
        public final boolean f78661b;

        /* renamed from: c */
        public final Object f78662c;

        /* renamed from: d */
        public Object f78663d;

        /* renamed from: e */
        public boolean f78664e;

        /* renamed from: f */
        public boolean f78665f;

        public C13639b(Subscriber subscriber, boolean z, Object obj) {
            this.f78660a = subscriber;
            this.f78661b = z;
            this.f78662c = obj;
            request(2L);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78665f) {
                if (this.f78664e) {
                    this.f78660a.setProducer(new SingleProducer(this.f78660a, this.f78663d));
                } else if (this.f78661b) {
                    this.f78660a.setProducer(new SingleProducer(this.f78660a, this.f78662c));
                } else {
                    this.f78660a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78665f) {
                RxJavaHooks.onError(th2);
            } else {
                this.f78660a.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78665f) {
                if (this.f78664e) {
                    this.f78665f = true;
                    this.f78660a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                    unsubscribe();
                    return;
                }
                this.f78663d = obj;
                this.f78664e = true;
            }
        }
    }

    public OperatorSingle() {
        this(false, null);
    }

    public static <T> OperatorSingle<T> instance() {
        return C13638a.f78659a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSingle(T t) {
        this(true, t);
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13639b c13639b = new C13639b(subscriber, this.f78657a, this.f78658b);
        subscriber.add(c13639b);
        return c13639b;
    }

    public OperatorSingle(boolean z, Object obj) {
        this.f78657a = z;
        this.f78658b = obj;
    }
}
