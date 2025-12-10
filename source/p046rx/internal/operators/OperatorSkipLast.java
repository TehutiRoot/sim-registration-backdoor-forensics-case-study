package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorSkipLast */
/* loaded from: classes7.dex */
public class OperatorSkipLast<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78670a;

    /* renamed from: rx.internal.operators.OperatorSkipLast$a */
    /* loaded from: classes7.dex */
    public class C13641a extends Subscriber {

        /* renamed from: a */
        public final Deque f78671a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78672b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13641a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78672b = subscriber2;
            this.f78671a = new ArrayDeque();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78672b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78672b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (OperatorSkipLast.this.f78670a == 0) {
                this.f78672b.onNext(obj);
                return;
            }
            if (this.f78671a.size() == OperatorSkipLast.this.f78670a) {
                this.f78672b.onNext(NotificationLite.getValue(this.f78671a.removeFirst()));
            } else {
                request(1L);
            }
            this.f78671a.offerLast(NotificationLite.next(obj));
        }
    }

    public OperatorSkipLast(int i) {
        if (i >= 0) {
            this.f78670a = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13641a(subscriber, subscriber);
    }
}
