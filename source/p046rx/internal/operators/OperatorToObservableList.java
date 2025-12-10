package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.internal.producers.SingleDelayedProducer;

/* renamed from: rx.internal.operators.OperatorToObservableList */
/* loaded from: classes7.dex */
public final class OperatorToObservableList<T> implements Observable.Operator<List<T>, T> {

    /* renamed from: rx.internal.operators.OperatorToObservableList$a */
    /* loaded from: classes7.dex */
    public class C13672a extends Subscriber {

        /* renamed from: a */
        public boolean f78784a;

        /* renamed from: b */
        public List f78785b = new LinkedList();

        /* renamed from: c */
        public final /* synthetic */ SingleDelayedProducer f78786c;

        /* renamed from: d */
        public final /* synthetic */ Subscriber f78787d;

        public C13672a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78786c = singleDelayedProducer;
            this.f78787d = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78784a) {
                this.f78784a = true;
                try {
                    ArrayList arrayList = new ArrayList(this.f78785b);
                    this.f78785b = null;
                    this.f78786c.setValue(arrayList);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78787d.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78784a) {
                this.f78785b.add(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorToObservableList$b */
    /* loaded from: classes7.dex */
    public static final class C13673b {

        /* renamed from: a */
        public static final OperatorToObservableList f78789a = new OperatorToObservableList();
    }

    public static <T> OperatorToObservableList<T> instance() {
        return C13673b.f78789a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13672a c13672a = new C13672a(singleDelayedProducer, subscriber);
        subscriber.add(c13672a);
        subscriber.setProducer(singleDelayedProducer);
        return c13672a;
    }
}
