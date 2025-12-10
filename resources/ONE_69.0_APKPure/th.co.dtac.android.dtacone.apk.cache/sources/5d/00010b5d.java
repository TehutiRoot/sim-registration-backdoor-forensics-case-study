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
    public class C13673a extends Subscriber {

        /* renamed from: a */
        public boolean f78990a;

        /* renamed from: b */
        public List f78991b = new LinkedList();

        /* renamed from: c */
        public final /* synthetic */ SingleDelayedProducer f78992c;

        /* renamed from: d */
        public final /* synthetic */ Subscriber f78993d;

        public C13673a(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78992c = singleDelayedProducer;
            this.f78993d = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78990a) {
                this.f78990a = true;
                try {
                    ArrayList arrayList = new ArrayList(this.f78991b);
                    this.f78991b = null;
                    this.f78992c.setValue(arrayList);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78993d.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78990a) {
                this.f78991b.add(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorToObservableList$b */
    /* loaded from: classes7.dex */
    public static final class C13674b {

        /* renamed from: a */
        public static final OperatorToObservableList f78995a = new OperatorToObservableList();
    }

    public static <T> OperatorToObservableList<T> instance() {
        return C13674b.f78995a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13673a c13673a = new C13673a(singleDelayedProducer, subscriber);
        subscriber.add(c13673a);
        subscriber.setProducer(singleDelayedProducer);
        return c13673a;
    }
}