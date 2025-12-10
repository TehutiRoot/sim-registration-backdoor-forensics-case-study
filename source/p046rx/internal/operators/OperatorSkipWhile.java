package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.functions.Func2;

/* renamed from: rx.internal.operators.OperatorSkipWhile */
/* loaded from: classes7.dex */
public final class OperatorSkipWhile<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func2 f78686a;

    /* renamed from: rx.internal.operators.OperatorSkipWhile$a */
    /* loaded from: classes7.dex */
    public class C13645a extends Subscriber {

        /* renamed from: a */
        public boolean f78687a;

        /* renamed from: b */
        public int f78688b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78689c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13645a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78689c = subscriber2;
            this.f78687a = true;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78689c.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78689c.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78687a) {
                this.f78689c.onNext(obj);
                return;
            }
            try {
                Func2 func2 = OperatorSkipWhile.this.f78686a;
                int i = this.f78688b;
                this.f78688b = i + 1;
                if (!((Boolean) func2.call(obj, Integer.valueOf(i))).booleanValue()) {
                    this.f78687a = false;
                    this.f78689c.onNext(obj);
                    return;
                }
                request(1L);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f78689c, obj);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorSkipWhile$b */
    /* loaded from: classes7.dex */
    public static class C13646b implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Func1 f78691a;

        public C13646b(Func1 func1) {
            this.f78691a = func1;
        }

        @Override // p046rx.functions.Func2
        /* renamed from: a */
        public Boolean call(Object obj, Integer num) {
            return (Boolean) this.f78691a.call(obj);
        }
    }

    public OperatorSkipWhile(Func2<? super T, Integer, Boolean> func2) {
        this.f78686a = func2;
    }

    public static <T> Func2<T, Integer, Boolean> toPredicate2(Func1<? super T, Boolean> func1) {
        return new C13646b(func1);
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13645a(subscriber, subscriber);
    }
}
