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
    public final Iterable f78072a;

    /* renamed from: rx.internal.operators.OnSubscribeAmb$Selection */
    /* loaded from: classes7.dex */
    public static final class Selection<T> extends AtomicReference<C13461c> {
        final Collection<C13461c> ambSubscribers = new ConcurrentLinkedQueue();

        public void unsubscribeLosers() {
            C13461c c13461c = get();
            if (c13461c != null) {
                unsubscribeOthers(c13461c);
            }
        }

        public void unsubscribeOthers(C13461c c13461c) {
            for (C13461c c13461c2 : this.ambSubscribers) {
                if (c13461c2 != c13461c) {
                    c13461c2.unsubscribe();
                }
            }
            this.ambSubscribers.clear();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$a */
    /* loaded from: classes7.dex */
    public class C13459a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Selection f78073a;

        public C13459a(Selection selection) {
            this.f78073a = selection;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            C13461c c13461c = this.f78073a.get();
            if (c13461c != null) {
                c13461c.unsubscribe();
            }
            OnSubscribeAmb.m23323a(this.f78073a.ambSubscribers);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$b */
    /* loaded from: classes7.dex */
    public class C13460b implements Producer {

        /* renamed from: a */
        public final /* synthetic */ Selection f78075a;

        public C13460b(Selection selection) {
            this.f78075a = selection;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            C13461c c13461c = this.f78075a.get();
            if (c13461c != null) {
                c13461c.requestMore(j);
                return;
            }
            for (C13461c c13461c2 : this.f78075a.ambSubscribers) {
                if (!c13461c2.isUnsubscribed()) {
                    if (this.f78075a.get() == c13461c2) {
                        c13461c2.requestMore(j);
                        return;
                    }
                    c13461c2.requestMore(j);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeAmb$c */
    /* loaded from: classes7.dex */
    public static final class C13461c extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78077a;

        /* renamed from: b */
        public final Selection f78078b;

        /* renamed from: c */
        public boolean f78079c;

        public C13461c(long j, Subscriber subscriber, Selection selection) {
            this.f78077a = subscriber;
            this.f78078b = selection;
            request(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMore(long j) {
            request(j);
        }

        /* renamed from: c */
        public final boolean m23321c() {
            if (this.f78079c) {
                return true;
            }
            if (this.f78078b.get() == this) {
                this.f78079c = true;
                return true;
            } else if (this.f78078b.compareAndSet(null, this)) {
                this.f78078b.unsubscribeOthers(this);
                this.f78079c = true;
                return true;
            } else {
                this.f78078b.unsubscribeLosers();
                return false;
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (m23321c()) {
                this.f78077a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (m23321c()) {
                this.f78077a.onError(th2);
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (m23321c()) {
                this.f78077a.onNext(obj);
            }
        }
    }

    public OnSubscribeAmb(Iterable iterable) {
        this.f78072a = iterable;
    }

    /* renamed from: a */
    public static void m23323a(Collection collection) {
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((C13461c) it.next()).unsubscribe();
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
        subscriber.add(Subscriptions.create(new C13459a(selection)));
        for (Observable observable : this.f78072a) {
            if (subscriber.isUnsubscribed()) {
                break;
            }
            C13461c c13461c = new C13461c(0L, subscriber, selection);
            selection.ambSubscribers.add(c13461c);
            C13461c c13461c2 = selection.get();
            if (c13461c2 != null) {
                selection.unsubscribeOthers(c13461c2);
                return;
            }
            observable.unsafeSubscribe(c13461c);
        }
        if (subscriber.isUnsubscribed()) {
            m23323a(selection.ambSubscribers);
        }
        subscriber.setProducer(new C13460b(selection));
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