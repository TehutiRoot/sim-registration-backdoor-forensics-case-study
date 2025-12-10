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
    public final Observable f78487b;

    /* renamed from: c */
    public final Object f78488c;

    /* renamed from: d */
    public final Func0 f78489d;

    /* renamed from: e */
    public final AtomicReference f78490e;

    /* renamed from: f */
    public final List f78491f;

    /* renamed from: g */
    public Subscriber f78492g;

    /* renamed from: h */
    public Subscription f78493h;

    /* renamed from: rx.internal.operators.OperatorMulticast$a */
    /* loaded from: classes7.dex */
    public class C13590a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Object f78494a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f78495b;

        /* renamed from: c */
        public final /* synthetic */ List f78496c;

        public C13590a(Object obj, AtomicReference atomicReference, List list) {
            this.f78494a = obj;
            this.f78495b = atomicReference;
            this.f78496c = list;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            synchronized (this.f78494a) {
                try {
                    if (this.f78495b.get() == null) {
                        this.f78496c.add(subscriber);
                    } else {
                        ((Subject) this.f78495b.get()).unsafeSubscribe(subscriber);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMulticast$b */
    /* loaded from: classes7.dex */
    public class C13591b implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78497a;

        public C13591b(AtomicReference atomicReference) {
            this.f78497a = atomicReference;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            synchronized (OperatorMulticast.this.f78488c) {
                if (OperatorMulticast.this.f78493h == this.f78497a.get()) {
                    OperatorMulticast operatorMulticast = OperatorMulticast.this;
                    Subscriber subscriber = operatorMulticast.f78492g;
                    operatorMulticast.f78492g = null;
                    operatorMulticast.f78493h = null;
                    operatorMulticast.f78490e.set(null);
                    if (subscriber != null) {
                        subscriber.unsubscribe();
                    }
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMulticast$c */
    /* loaded from: classes7.dex */
    public class C13592c extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78499a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13592c(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f78499a = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78499a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78499a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78499a.onNext(obj);
        }
    }

    public OperatorMulticast(Observable<? extends T> observable, Func0<? extends Subject<? super T, ? extends R>> func0) {
        this(new Object(), new AtomicReference(), new ArrayList(), observable, func0);
    }

    @Override // p046rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        Subscriber<? super T> subscriber;
        synchronized (this.f78488c) {
            try {
                if (this.f78492g != null) {
                    action1.call(this.f78493h);
                    return;
                }
                Subject subject = (Subject) this.f78489d.call();
                this.f78492g = Subscribers.from(subject);
                AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(Subscriptions.create(new C13591b(atomicReference)));
                this.f78493h = (Subscription) atomicReference.get();
                for (Subscriber subscriber2 : this.f78491f) {
                    subject.unsafeSubscribe(new C13592c(subscriber2, subscriber2));
                }
                this.f78491f.clear();
                this.f78490e.set(subject);
                action1.call(this.f78493h);
                synchronized (this.f78488c) {
                    subscriber = this.f78492g;
                }
                if (subscriber != null) {
                    this.f78487b.subscribe((Subscriber) subscriber);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public OperatorMulticast(Object obj, AtomicReference atomicReference, List list, Observable observable, Func0 func0) {
        super(new C13590a(obj, atomicReference, list));
        this.f78488c = obj;
        this.f78490e = atomicReference;
        this.f78491f = list;
        this.f78487b = observable;
        this.f78489d = func0;
    }
}
