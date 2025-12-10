package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.internal.util.UtilityFunctions;

/* renamed from: rx.internal.operators.OperatorDistinctUntilChanged */
/* loaded from: classes7.dex */
public final class OperatorDistinctUntilChanged<T, U> implements Observable.Operator<T, T>, Func2<U, U, Boolean> {

    /* renamed from: a */
    public final Func1 f78331a;

    /* renamed from: b */
    public final Func2 f78332b;

    /* renamed from: rx.internal.operators.OperatorDistinctUntilChanged$a */
    /* loaded from: classes7.dex */
    public class C13561a extends Subscriber {

        /* renamed from: a */
        public Object f78333a;

        /* renamed from: b */
        public boolean f78334b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13561a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78335c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78335c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78335c.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Object obj2;
            try {
                Object call = OperatorDistinctUntilChanged.this.f78331a.call(obj);
                Object obj3 = this.f78333a;
                this.f78333a = call;
                if (this.f78334b) {
                    try {
                        if (!((Boolean) OperatorDistinctUntilChanged.this.f78332b.call(obj3, call)).booleanValue()) {
                            this.f78335c.onNext(obj);
                            return;
                        } else {
                            request(1L);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this.f78335c, obj2);
                        return;
                    }
                }
                this.f78334b = true;
                this.f78335c.onNext(obj);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78335c, obj);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDistinctUntilChanged$b */
    /* loaded from: classes7.dex */
    public static final class C13562b {

        /* renamed from: a */
        public static final OperatorDistinctUntilChanged f78337a = new OperatorDistinctUntilChanged(UtilityFunctions.identity());
    }

    public OperatorDistinctUntilChanged(Func1<? super T, ? extends U> func1) {
        this.f78331a = func1;
        this.f78332b = this;
    }

    public static <T> OperatorDistinctUntilChanged<T, T> instance() {
        return C13562b.f78337a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p046rx.functions.Func2
    public Boolean call(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    public OperatorDistinctUntilChanged(Func2<? super U, ? super U, Boolean> func2) {
        this.f78331a = UtilityFunctions.identity();
        this.f78332b = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13561a(subscriber, subscriber);
    }
}
