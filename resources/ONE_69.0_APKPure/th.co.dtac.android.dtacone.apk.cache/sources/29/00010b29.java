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
    public final boolean f78863a;

    /* renamed from: b */
    public final Object f78864b;

    /* renamed from: rx.internal.operators.OperatorSingle$a */
    /* loaded from: classes7.dex */
    public static final class C13639a {

        /* renamed from: a */
        public static final OperatorSingle f78865a = new OperatorSingle();
    }

    /* renamed from: rx.internal.operators.OperatorSingle$b */
    /* loaded from: classes7.dex */
    public static final class C13640b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78866a;

        /* renamed from: b */
        public final boolean f78867b;

        /* renamed from: c */
        public final Object f78868c;

        /* renamed from: d */
        public Object f78869d;

        /* renamed from: e */
        public boolean f78870e;

        /* renamed from: f */
        public boolean f78871f;

        public C13640b(Subscriber subscriber, boolean z, Object obj) {
            this.f78866a = subscriber;
            this.f78867b = z;
            this.f78868c = obj;
            request(2L);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78871f) {
                if (this.f78870e) {
                    this.f78866a.setProducer(new SingleProducer(this.f78866a, this.f78869d));
                } else if (this.f78867b) {
                    this.f78866a.setProducer(new SingleProducer(this.f78866a, this.f78868c));
                } else {
                    this.f78866a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78871f) {
                RxJavaHooks.onError(th2);
            } else {
                this.f78866a.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78871f) {
                if (this.f78870e) {
                    this.f78871f = true;
                    this.f78866a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                    unsubscribe();
                    return;
                }
                this.f78869d = obj;
                this.f78870e = true;
            }
        }
    }

    public OperatorSingle() {
        this(false, null);
    }

    public static <T> OperatorSingle<T> instance() {
        return C13639a.f78865a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSingle(T t) {
        this(true, t);
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13640b c13640b = new C13640b(subscriber, this.f78863a, this.f78864b);
        subscriber.add(c13640b);
        return c13640b;
    }

    public OperatorSingle(boolean z, Object obj) {
        this.f78863a = z;
        this.f78864b = obj;
    }
}