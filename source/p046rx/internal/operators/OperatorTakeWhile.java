package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.functions.Func2;

/* renamed from: rx.internal.operators.OperatorTakeWhile */
/* loaded from: classes7.dex */
public final class OperatorTakeWhile<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func2 f78766a;

    /* renamed from: rx.internal.operators.OperatorTakeWhile$a */
    /* loaded from: classes7.dex */
    public class C13667a implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78767a;

        public C13667a(Func1 func1) {
            this.f78767a = func1;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Boolean call(Object obj, Integer num) {
            return (Boolean) this.f78767a.call(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeWhile$b */
    /* loaded from: classes7.dex */
    public class C13668b extends Subscriber {

        /* renamed from: a */
        public int f78768a;

        /* renamed from: b */
        public boolean f78769b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78770c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13668b(Subscriber subscriber, boolean z, Subscriber subscriber2) {
            super(subscriber, z);
            this.f78770c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78769b) {
                this.f78770c.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78769b) {
                this.f78770c.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Func2 func2 = OperatorTakeWhile.this.f78766a;
                int i = this.f78768a;
                this.f78768a = i + 1;
                if (((Boolean) func2.call(obj, Integer.valueOf(i))).booleanValue()) {
                    this.f78770c.onNext(obj);
                    return;
                }
                this.f78769b = true;
                this.f78770c.onCompleted();
                unsubscribe();
            } catch (Throwable th2) {
                this.f78769b = true;
                Exceptions.throwOrReport(th2, this.f78770c, obj);
                unsubscribe();
            }
        }
    }

    public OperatorTakeWhile(Func1<? super T, Boolean> func1) {
        this(new C13667a(func1));
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeWhile(Func2<? super T, ? super Integer, Boolean> func2) {
        this.f78766a = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13668b c13668b = new C13668b(subscriber, false, subscriber);
        subscriber.add(c13668b);
        return c13668b;
    }
}
