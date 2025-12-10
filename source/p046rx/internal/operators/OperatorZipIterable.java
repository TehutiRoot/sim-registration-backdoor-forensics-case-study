package p046rx.internal.operators;

import java.util.Iterator;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func2;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OperatorZipIterable */
/* loaded from: classes7.dex */
public final class OperatorZipIterable<T1, T2, R> implements Observable.Operator<R, T1> {

    /* renamed from: a */
    public final Iterable f78933a;

    /* renamed from: b */
    public final Func2 f78934b;

    /* renamed from: rx.internal.operators.OperatorZipIterable$a */
    /* loaded from: classes7.dex */
    public class C13704a extends Subscriber {

        /* renamed from: a */
        public boolean f78935a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78936b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f78937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13704a(Subscriber subscriber, Subscriber subscriber2, Iterator it) {
            super(subscriber);
            this.f78936b = subscriber2;
            this.f78937c = it;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78935a) {
                return;
            }
            this.f78935a = true;
            this.f78936b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78935a) {
                Exceptions.throwIfFatal(th2);
                return;
            }
            this.f78935a = true;
            this.f78936b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78935a) {
                return;
            }
            try {
                this.f78936b.onNext(OperatorZipIterable.this.f78934b.call(obj, this.f78937c.next()));
                if (!this.f78937c.hasNext()) {
                    onCompleted();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }
    }

    public OperatorZipIterable(Iterable<? extends T2> iterable, Func2<? super T1, ? super T2, ? extends R> func2) {
        this.f78933a = iterable;
        this.f78934b = func2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T1> call(Subscriber<? super R> subscriber) {
        Iterator it = this.f78933a.iterator();
        try {
            if (!it.hasNext()) {
                subscriber.onCompleted();
                return Subscribers.empty();
            }
            return new C13704a(subscriber, subscriber, it);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            return Subscribers.empty();
        }
    }
}
