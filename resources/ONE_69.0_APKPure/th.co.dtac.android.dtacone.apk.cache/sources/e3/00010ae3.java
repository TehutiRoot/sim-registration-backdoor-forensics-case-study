package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func0;
import p046rx.observables.ConnectableObservable;
import p046rx.observers.Subscribers;
import p046rx.subjects.Subject;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorMulticast */
/* loaded from: classes7.dex */
public final class OperatorMulticast<T, R> extends ConnectableObservable<R> {

    /* renamed from: b */
    public final Observable f78693b;

    /* renamed from: c */
    public final Object f78694c;

    /* renamed from: d */
    public final Func0 f78695d;

    /* renamed from: e */
    public final AtomicReference f78696e;

    /* renamed from: f */
    public final List f78697f;

    /* renamed from: g */
    public Subscriber f78698g;

    /* renamed from: h */
    public Subscription f78699h;

    /* renamed from: rx.internal.operators.OperatorMulticast$a */
    /* loaded from: classes7.dex */
    public class C13591a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Object f78700a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f78701b;

        /* renamed from: c */
        public final /* synthetic */ List f78702c;

        public C13591a(Object obj, AtomicReference atomicReference, List list) {
            this.f78700a = obj;
            this.f78701b = atomicReference;
            this.f78702c = list;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            synchronized (this.f78700a) {
                try {
                    if (this.f78701b.get() == null) {
                        this.f78702c.add(subscriber);
                    } else {
                        ((Subject) this.f78701b.get()).unsafeSubscribe(subscriber);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMulticast$b */
    /* loaded from: classes7.dex */
    public class C13592b implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78703a;

        public C13592b(AtomicReference atomicReference) {
            this.f78703a = atomicReference;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            synchronized (OperatorMulticast.this.f78694c) {
                if (OperatorMulticast.this.f78699h == this.f78703a.get()) {
                    OperatorMulticast operatorMulticast = OperatorMulticast.this;
                    Subscriber subscriber = operatorMulticast.f78698g;
                    operatorMulticast.f78698g = null;
                    operatorMulticast.f78699h = null;
                    operatorMulticast.f78696e.set(null);
                    if (subscriber != null) {
                        subscriber.unsubscribe();
                    }
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMulticast$c */
    /* loaded from: classes7.dex */
    public class C13593c extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13593c(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78705a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78705a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78705a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78705a.onNext(obj);
        }
    }

    public OperatorMulticast(Observable<? extends T> observable, Func0<? extends Subject<? super T, ? extends R>> func0) {
        this(new Object(), new AtomicReference(), new ArrayList(), observable, func0);
    }

    @Override // p046rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        Subscriber<? super T> subscriber;
        synchronized (this.f78694c) {
            try {
                if (this.f78698g != null) {
                    action1.call(this.f78699h);
                    return;
                }
                Subject subject = (Subject) this.f78695d.call();
                this.f78698g = Subscribers.from(subject);
                AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(Subscriptions.create(new C13592b(atomicReference)));
                this.f78699h = (Subscription) atomicReference.get();
                for (Subscriber subscriber2 : this.f78697f) {
                    subject.unsafeSubscribe(new C13593c(subscriber2, subscriber2));
                }
                this.f78697f.clear();
                this.f78696e.set(subject);
                action1.call(this.f78699h);
                synchronized (this.f78694c) {
                    subscriber = this.f78698g;
                }
                if (subscriber != null) {
                    this.f78693b.subscribe((Subscriber) subscriber);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public OperatorMulticast(Object obj, AtomicReference atomicReference, List list, Observable observable, Func0 func0) {
        super(new C13591a(obj, atomicReference, list));
        this.f78694c = obj;
        this.f78696e = atomicReference;
        this.f78697f = list;
        this.f78693b = observable;
        this.f78695d = func0;
    }
}