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
    public final Iterable f79139a;

    /* renamed from: b */
    public final Func2 f79140b;

    /* renamed from: rx.internal.operators.OperatorZipIterable$a */
    /* loaded from: classes7.dex */
    public class C13705a extends Subscriber {

        /* renamed from: a */
        public boolean f79141a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f79142b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f79143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13705a(Subscriber subscriber, Subscriber subscriber2, Iterator it) {
            super(subscriber);
            this.f79142b = subscriber2;
            this.f79143c = it;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f79141a) {
                return;
            }
            this.f79141a = true;
            this.f79142b.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f79141a) {
                Exceptions.throwIfFatal(th2);
                return;
            }
            this.f79141a = true;
            this.f79142b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f79141a) {
                return;
            }
            try {
                this.f79142b.onNext(OperatorZipIterable.this.f79140b.call(obj, this.f79143c.next()));
                if (!this.f79143c.hasNext()) {
                    onCompleted();
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this);
            }
        }
    }

    public OperatorZipIterable(Iterable<? extends T2> iterable, Func2<? super T1, ? super T2, ? extends R> func2) {
        this.f79139a = iterable;
        this.f79140b = func2;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T1> call(Subscriber<? super R> subscriber) {
        Iterator it = this.f79139a.iterator();
        try {
            if (!it.hasNext()) {
                subscriber.onCompleted();
                return Subscribers.empty();
            }
            return new C13705a(subscriber, subscriber, it);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
            return Subscribers.empty();
        }
    }
}