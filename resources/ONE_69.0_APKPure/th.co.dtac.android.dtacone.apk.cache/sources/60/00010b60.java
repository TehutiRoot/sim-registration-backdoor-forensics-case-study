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
    public static final Comparator f78996c = new C13677c();

    /* renamed from: a */
    public final Comparator f78997a;

    /* renamed from: b */
    public final int f78998b;

    /* renamed from: rx.internal.operators.OperatorToObservableSortedList$a */
    /* loaded from: classes7.dex */
    public class C13675a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Func2 f78999a;

        public C13675a(Func2 func2) {
            this.f78999a = func2;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Integer) this.f78999a.call(obj, obj2)).intValue();
        }
    }

    /* renamed from: rx.internal.operators.OperatorToObservableSortedList$b */
    /* loaded from: classes7.dex */
    public class C13676b extends Subscriber {

        /* renamed from: a */
        public List f79001a;

        /* renamed from: b */
        public boolean f79002b;

        /* renamed from: c */
        public final /* synthetic */ SingleDelayedProducer f79003c;

        /* renamed from: d */
        public final /* synthetic */ Subscriber f79004d;

        public C13676b(SingleDelayedProducer singleDelayedProducer, Subscriber subscriber) {
            this.f79003c = singleDelayedProducer;
            this.f79004d = subscriber;
            this.f79001a = new ArrayList(OperatorToObservableSortedList.this.f78998b);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f79002b) {
                this.f79002b = true;
                List list = this.f79001a;
                this.f79001a = null;
                try {
                    Collections.sort(list, OperatorToObservableSortedList.this.f78997a);
                    this.f79003c.setValue(list);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79004d.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f79002b) {
                this.f79001a.add(obj);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.internal.operators.OperatorToObservableSortedList$c */
    /* loaded from: classes7.dex */
    public static final class C13677c implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public OperatorToObservableSortedList(int i) {
        this.f78997a = f78996c;
        this.f78998b = i;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C13676b c13676b = new C13676b(singleDelayedProducer, subscriber);
        subscriber.add(c13676b);
        subscriber.setProducer(singleDelayedProducer);
        return c13676b;
    }

    public OperatorToObservableSortedList(Func2<? super T, ? super T, Integer> func2, int i) {
        this.f78998b = i;
        this.f78997a = new C13675a(func2);
    }
}