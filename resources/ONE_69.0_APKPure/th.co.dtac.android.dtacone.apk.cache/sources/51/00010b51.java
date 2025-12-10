package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OperatorTakeUntilPredicate */
/* loaded from: classes7.dex */
public final class OperatorTakeUntilPredicate<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Func1 f78966a;

    /* renamed from: rx.internal.operators.OperatorTakeUntilPredicate$a */
    /* loaded from: classes7.dex */
    public class C13666a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13667b f78967a;

        public C13666a(C13667b c13667b) {
            this.f78967a = c13667b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78967a.m23162b(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorTakeUntilPredicate$b */
    /* loaded from: classes7.dex */
    public final class C13667b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78969a;

        /* renamed from: b */
        public boolean f78970b;

        public C13667b(Subscriber subscriber) {
            this.f78969a = subscriber;
        }

        /* renamed from: b */
        public void m23162b(long j) {
            request(j);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78970b) {
                this.f78969a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78970b) {
                this.f78969a.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78969a.onNext(obj);
            try {
                if (((Boolean) OperatorTakeUntilPredicate.this.f78966a.call(obj)).booleanValue()) {
                    this.f78970b = true;
                    this.f78969a.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th2) {
                this.f78970b = true;
                Exceptions.throwOrReport(th2, this.f78969a, obj);
                unsubscribe();
            }
        }
    }

    public OperatorTakeUntilPredicate(Func1<? super T, Boolean> func1) {
        this.f78966a = func1;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        C13667b c13667b = new C13667b(subscriber);
        subscriber.add(c13667b);
        subscriber.setProducer(new C13666a(c13667b));
        return c13667b;
    }
}