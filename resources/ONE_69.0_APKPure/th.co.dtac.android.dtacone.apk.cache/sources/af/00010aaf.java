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
    public final Func1 f78537a;

    /* renamed from: b */
    public final Func2 f78538b;

    /* renamed from: rx.internal.operators.OperatorDistinctUntilChanged$a */
    /* loaded from: classes7.dex */
    public class C13562a extends Subscriber {

        /* renamed from: a */
        public Object f78539a;

        /* renamed from: b */
        public boolean f78540b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13562a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78541c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78541c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78541c.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Object obj2;
            try {
                Object call = OperatorDistinctUntilChanged.this.f78537a.call(obj);
                Object obj3 = this.f78539a;
                this.f78539a = call;
                if (this.f78540b) {
                    try {
                        if (!((Boolean) OperatorDistinctUntilChanged.this.f78538b.call(obj3, call)).booleanValue()) {
                            this.f78541c.onNext(obj);
                            return;
                        } else {
                            request(1L);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwOrReport(th2, this.f78541c, obj2);
                        return;
                    }
                }
                this.f78540b = true;
                this.f78541c.onNext(obj);
            } catch (Throwable th3) {
                Exceptions.throwOrReport(th3, this.f78541c, obj);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorDistinctUntilChanged$b */
    /* loaded from: classes7.dex */
    public static final class C13563b {

        /* renamed from: a */
        public static final OperatorDistinctUntilChanged f78543a = new OperatorDistinctUntilChanged(UtilityFunctions.identity());
    }

    public OperatorDistinctUntilChanged(Func1<? super T, ? extends U> func1) {
        this.f78537a = func1;
        this.f78538b = this;
    }

    public static <T> OperatorDistinctUntilChanged<T, T> instance() {
        return C13563b.f78543a;
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
        this.f78537a = UtilityFunctions.identity();
        this.f78538b = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13562a(subscriber, subscriber);
    }
}