package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OnSubscribeAmb */
/* loaded from: classes7.dex */
public final class OnSubscribeAmb<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Iterable f77866a;

    /* renamed from: rx.internal.operators.OnSubscribeAmb$Selection */
    /* loaded from: classes7.dex */
    public static final class Selection<T> extends AtomicReference<C13460c> {
        final Collection<C13460c> ambSubscribers = new ConcurrentLinkedQueue();

        public void unsubscribeLosers() {
            C13460c c13460c = get();
            if (c13460c != null) {
                unsubscribeOthers(c13460c);
            }
        }

        public void unsubscribeOthers(C13460c c13460c) {
            for (C13460c c13460c2 : this.ambSubscribers) {
                if (c13460c2 != c13460c) {
                    c13460c2.unsubscribe();
                }
            }
            this.ambSubscribers.clear();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$a */
    /* loaded from: classes7.dex */
    public class C13458a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Selection f77867a;

        public C13458a(Selection selection) {
            this.f77867a = selection;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            C13460c c13460c = this.f77867a.get();
            if (c13460c != null) {
                c13460c.unsubscribe();
            }
            OnSubscribeAmb.m23135a(this.f77867a.ambSubscribers);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$b */
    /* loaded from: classes7.dex */
    public class C13459b implements Producer {

        /* renamed from: a */
        public final /* synthetic */ Selection f77869a;

        public C13459b(Selection selection) {
            this.f77869a = selection;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            C13460c c13460c = this.f77869a.get();
            if (c13460c != null) {
                c13460c.requestMore(j);
                return;
            }
            for (C13460c c13460c2 : this.f77869a.ambSubscribers) {
                if (!c13460c2.isUnsubscribed()) {
                    if (this.f77869a.get() == c13460c2) {
                        c13460c2.requestMore(j);
                        return;
                    }
                    c13460c2.requestMore(j);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$c */
    /* loaded from: classes7.dex */
    public static final class C13460c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f77871a;

        /* renamed from: b */
        public final Selection f77872b;

        /* renamed from: c */
        public boolean f77873c;

        public C13460c(long j, Subscriber subscriber, Selection selection) {
            this.f77871a = subscriber;
            this.f77872b = selection;
            request(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j) {
            request(j);
        }

        /* renamed from: c */
        public final boolean m23133c() {
            if (this.f77873c) {
                return true;
            }
            if (this.f77872b.get() == this) {
                this.f77873c = true;
                return true;
            } else if (this.f77872b.compareAndSet(null, this)) {
                this.f77872b.unsubscribeOthers(this);
                this.f77873c = true;
                return true;
            } else {
                this.f77872b.unsubscribeLosers();
                return false;
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (m23133c()) {
                this.f77871a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (m23133c()) {
                this.f77871a.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (m23133c()) {
                this.f77871a.onNext(obj);
            }
        }
    }

    public OnSubscribeAmb(Iterable iterable) {
        this.f77866a = iterable;
    }

    /* renamed from: a */
    public static void m23135a(Collection collection) {
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((C13460c) it.next()).unsubscribe();
            }
            collection.clear();
        }
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        return amb(arrayList);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Selection selection = new Selection();
        subscriber.add(Subscriptions.create(new C13458a(selection)));
        for (Observable observable : this.f77866a) {
            if (subscriber.isUnsubscribed()) {
                break;
            }
            C13460c c13460c = new C13460c(0L, subscriber, selection);
            selection.ambSubscribers.add(c13460c);
            C13460c c13460c2 = selection.get();
            if (c13460c2 != null) {
                selection.unsubscribeOthers(c13460c2);
                return;
            }
            observable.unsafeSubscribe(c13460c);
        }
        if (subscriber.isUnsubscribed()) {
            m23135a(selection.ambSubscribers);
        }
        subscriber.setProducer(new C13459b(selection));
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7, Observable<? extends T> observable8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7, Observable<? extends T> observable8, Observable<? extends T> observable9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        arrayList.add(observable9);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Iterable<? extends Observable<? extends T>> iterable) {
        return new OnSubscribeAmb(iterable);
    }
}
