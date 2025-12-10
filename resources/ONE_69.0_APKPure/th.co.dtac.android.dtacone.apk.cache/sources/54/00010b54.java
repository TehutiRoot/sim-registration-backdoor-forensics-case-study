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
    public final Func2 f78972a;

    /* renamed from: rx.internal.operators.OperatorTakeWhile$a */
    /* loaded from: classes7.dex */
    public class C13668a implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78973a;

        public C13668a(Func1 func1) {
            this.f78973a = func1;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Boolean call(Object obj, Integer num) {
            return (Boolean) this.f78973a.call(obj);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeWhile$b */
    /* loaded from: classes7.dex */
    public class C13669b extends Subscriber {

        /* renamed from: a */
        public int f78974a;

        /* renamed from: b */
        public boolean f78975b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13669b(Subscriber subscriber, boolean z, Subscriber subscriber2) {
            super(subscriber, z);
            this.f78976c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78975b) {
                this.f78976c.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78975b) {
                this.f78976c.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Func2 func2 = OperatorTakeWhile.this.f78972a;
                int i = this.f78974a;
                this.f78974a = i + 1;
                if (((Boolean) func2.call(obj, Integer.valueOf(i))).booleanValue()) {
                    this.f78976c.onNext(obj);
                    return;
                }
                this.f78975b = true;
                this.f78976c.onCompleted();
                unsubscribe();
            } catch (Throwable th2) {
                this.f78975b = true;
                Exceptions.throwOrReport(th2, this.f78976c, obj);
                unsubscribe();
            }
        }
    }

    public OperatorTakeWhile(Func1<? super T, Boolean> func1) {
        this(new C13668a(func1));
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeWhile(Func2<? super T, ? super Integer, Boolean> func2) {
        this.f78972a = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13669b c13669b = new C13669b(subscriber, false, subscriber);
        subscriber.add(c13669b);
        return c13669b;
    }
}