package p046rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorSkipLast */
/* loaded from: classes7.dex */
public class OperatorSkipLast<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final int f78876a;

    /* renamed from: rx.internal.operators.OperatorSkipLast$a */
    /* loaded from: classes7.dex */
    public class C13642a extends Subscriber {

        /* renamed from: a */
        public final Deque f78877a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13642a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78878b = subscriber2;
            this.f78877a = new ArrayDeque();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78878b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78878b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (OperatorSkipLast.this.f78876a == 0) {
                this.f78878b.onNext(obj);
                return;
            }
            if (this.f78877a.size() == OperatorSkipLast.this.f78876a) {
                this.f78878b.onNext(NotificationLite.getValue(this.f78877a.removeFirst()));
            } else {
                request(1L);
            }
            this.f78877a.offerLast(NotificationLite.next(obj));
        }
    }

    public OperatorSkipLast(int i) {
        if (i >= 0) {
            this.f78876a = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new C13642a(subscriber, subscriber);
    }
}