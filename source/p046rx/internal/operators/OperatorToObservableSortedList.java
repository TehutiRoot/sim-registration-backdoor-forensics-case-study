package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func2;
import p046rx.internal.producers.SingleDelayedProducer;

/* renamed from: rx.internal.operators.OperatorToObservableSortedList */
/* loaded from: classes7.dex */
public final class OperatorToObservableSortedList<T> implements Observable.Operator<List<T>, T> {

    /* renamed from: c */
    public static final Comparator f78790c = new C13676c();

    /* renamed from: a */
    public final Comparator f78791a;

    /* renamed from: b */
    public final int f78792b;

    /* renamed from: rx.internal.operators.OperatorToObservableSortedList$a */
    /* loaded from: classes7.dex */
    public class C13674a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Func2 f78793a;

        public C13674a(Func2 func2) {
            this.f78793a = func2;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Integer) this.f78793a.call(obj, obj2)).intValue();
        }
    }

    /* renamed from: rx.internal.operators.OperatorToObservableSortedList$b */
    /* loaded from: classes7.dex */
    public class C13675b extends Subscriber {

        /* renamed from: a */
        public List f78795a;

        /* renamed from: b */
        public boolean f78796b;

        /* renamed from: c */
        public final /* synthetic */ SingleDelayedProducer f78797c;

        /* renamed from: d */
        public final /* synthetic */ Subscriber f78798d;

        public C13675b(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f78797c = singleDelayedProducer;
            this.f78798d = subscriber;
            this.f78795a = new ArrayList(OperatorToObservableSortedList.this.f78792b);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f78796b) {
                this.f78796b = true;
                List list = this.f78795a;
                this.f78795a = null;
                try {
                    Collections.sort(list, OperatorToObservableSortedList.this.f78791a);
                    this.f78797c.setValue(list);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78798d.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78796b) {
                this.f78795a.add(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorToObservableSortedList$c */
    /* loaded from: classes7.dex */
    public static final class C13676c implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public OperatorToObservableSortedList(int i) {
        this.f78791a = f78790c;
        this.f78792b = i;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13675b c13675b = new C13675b(singleDelayedProducer, subscriber);
        subscriber.add(c13675b);
        subscriber.setProducer(singleDelayedProducer);
        return c13675b;
    }

    public OperatorToObservableSortedList(Func2<? super T, ? super T, Integer> func2, int i) {
        this.f78792b = i;
        this.f78791a = new C13674a(func2);
    }
}
