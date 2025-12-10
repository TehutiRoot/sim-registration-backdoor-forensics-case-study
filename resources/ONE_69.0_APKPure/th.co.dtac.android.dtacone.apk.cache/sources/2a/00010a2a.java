package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.observers.SerializedObserver;
import p046rx.observers.SerializedSubscriber;
import p046rx.subjects.PublishSubject;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.RefCountSubscription;

/* renamed from: rx.internal.operators.OnSubscribeGroupJoin */
/* loaded from: classes7.dex */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f78198a;

    /* renamed from: b */
    public final Observable f78199b;

    /* renamed from: c */
    public final Func1 f78200c;

    /* renamed from: d */
    public final Func1 f78201d;

    /* renamed from: e */
    public final Func2 f78202e;

    /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager */
    /* loaded from: classes7.dex */
    public final class ResultManager extends HashMap<Integer, Observer<T2>> implements Subscription {
        private static final long serialVersionUID = -3035156013812425335L;
        final RefCountSubscription cancel;
        final CompositeSubscription group;
        boolean leftDone;
        int leftIds;
        boolean rightDone;
        int rightIds;
        final Map<Integer, T2> rightMap = new HashMap();
        final Subscriber<? super R> subscriber;

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$a */
        /* loaded from: classes7.dex */
        public final class C13480a extends Subscriber {

            /* renamed from: a */
            public final int f78203a;

            /* renamed from: b */
            public boolean f78204b = true;

            public C13480a(int i) {
                this.f78203a = i;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                Observer<T2> remove;
                if (this.f78204b) {
                    this.f78204b = false;
                    synchronized (ResultManager.this) {
                        remove = ResultManager.this.leftMap().remove(Integer.valueOf(this.f78203a));
                    }
                    if (remove != null) {
                        remove.onCompleted();
                    }
                    ResultManager.this.group.remove(this);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorMain(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$b */
        /* loaded from: classes7.dex */
        public final class C13481b extends Subscriber {
            public C13481b() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    try {
                        ResultManager resultManager = ResultManager.this;
                        resultManager.leftDone = true;
                        if (resultManager.rightDone) {
                            arrayList = new ArrayList(ResultManager.this.leftMap().values());
                            ResultManager.this.leftMap().clear();
                            ResultManager.this.rightMap.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorAll(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                int i;
                ArrayList<Object> arrayList;
                try {
                    PublishSubject create = PublishSubject.create();
                    SerializedObserver serializedObserver = new SerializedObserver(create);
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i = resultManager.leftIds;
                        resultManager.leftIds = i + 1;
                        resultManager.leftMap().put(Integer.valueOf(i), serializedObserver);
                    }
                    Observable unsafeCreate = Observable.unsafeCreate(new C13484a(create, ResultManager.this.cancel));
                    C13480a c13480a = new C13480a(i);
                    ResultManager.this.group.add(c13480a);
                    ((Observable) OnSubscribeGroupJoin.this.f78200c.call(obj)).unsafeSubscribe(c13480a);
                    Object call = OnSubscribeGroupJoin.this.f78202e.call(obj, unsafeCreate);
                    synchronized (ResultManager.this) {
                        arrayList = new ArrayList(ResultManager.this.rightMap.values());
                    }
                    ResultManager.this.subscriber.onNext(call);
                    for (Object obj2 : arrayList) {
                        serializedObserver.onNext(obj2);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$c */
        /* loaded from: classes7.dex */
        public final class C13482c extends Subscriber {

            /* renamed from: a */
            public final int f78207a;

            /* renamed from: b */
            public boolean f78208b = true;

            public C13482c(int i) {
                this.f78207a = i;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (this.f78208b) {
                    this.f78208b = false;
                    synchronized (ResultManager.this) {
                        ResultManager.this.rightMap.remove(Integer.valueOf(this.f78207a));
                    }
                    ResultManager.this.group.remove(this);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorMain(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$ResultManager$d */
        /* loaded from: classes7.dex */
        public final class C13483d extends Subscriber {
            public C13483d() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (ResultManager.this) {
                    try {
                        ResultManager resultManager = ResultManager.this;
                        resultManager.rightDone = true;
                        if (resultManager.leftDone) {
                            arrayList = new ArrayList(ResultManager.this.leftMap().values());
                            ResultManager.this.leftMap().clear();
                            ResultManager.this.rightMap.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ResultManager.this.complete(arrayList);
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                ResultManager.this.errorAll(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                int i;
                ArrayList<Observer> arrayList;
                try {
                    synchronized (ResultManager.this) {
                        ResultManager resultManager = ResultManager.this;
                        i = resultManager.rightIds;
                        resultManager.rightIds = i + 1;
                        resultManager.rightMap.put(Integer.valueOf(i), obj);
                    }
                    C13482c c13482c = new C13482c(i);
                    ResultManager.this.group.add(c13482c);
                    ((Observable) OnSubscribeGroupJoin.this.f78201d.call(obj)).unsafeSubscribe(c13482c);
                    synchronized (ResultManager.this) {
                        arrayList = new ArrayList(ResultManager.this.leftMap().values());
                    }
                    for (Observer observer : arrayList) {
                        observer.onNext(obj);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        public ResultManager(Subscriber<? super R> subscriber) {
            this.subscriber = subscriber;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.group = compositeSubscription;
            this.cancel = new RefCountSubscription(compositeSubscription);
        }

        public void complete(List<Observer<T2>> list) {
            if (list != null) {
                for (Observer<T2> observer : list) {
                    observer.onCompleted();
                }
                this.subscriber.onCompleted();
                this.cancel.unsubscribe();
            }
        }

        public void errorAll(Throwable th2) {
            ArrayList<Observer> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(leftMap().values());
                leftMap().clear();
                this.rightMap.clear();
            }
            for (Observer observer : arrayList) {
                observer.onError(th2);
            }
            this.subscriber.onError(th2);
            this.cancel.unsubscribe();
        }

        public void errorMain(Throwable th2) {
            synchronized (this) {
                leftMap().clear();
                this.rightMap.clear();
            }
            this.subscriber.onError(th2);
            this.cancel.unsubscribe();
        }

        public void init() {
            C13481b c13481b = new C13481b();
            C13483d c13483d = new C13483d();
            this.group.add(c13481b);
            this.group.add(c13483d);
            OnSubscribeGroupJoin.this.f78198a.unsafeSubscribe(c13481b);
            OnSubscribeGroupJoin.this.f78199b.unsafeSubscribe(c13483d);
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.cancel.isUnsubscribed();
        }

        public Map<Integer, Observer<T2>> leftMap() {
            return this;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.cancel.unsubscribe();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$a */
    /* loaded from: classes7.dex */
    public static final class C13484a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final RefCountSubscription f78211a;

        /* renamed from: b */
        public final Observable f78212b;

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$a$a */
        /* loaded from: classes7.dex */
        public final class C13485a extends Subscriber {

            /* renamed from: a */
            public final Subscriber f78213a;

            /* renamed from: b */
            public final Subscription f78214b;

            public C13485a(Subscriber subscriber, Subscription subscription) {
                super(subscriber);
                this.f78213a = subscriber;
                this.f78214b = subscription;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f78213a.onCompleted();
                this.f78214b.unsubscribe();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f78213a.onError(th2);
                this.f78214b.unsubscribe();
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                this.f78213a.onNext(obj);
            }
        }

        public C13484a(Observable observable, RefCountSubscription refCountSubscription) {
            this.f78211a = refCountSubscription;
            this.f78212b = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            Subscription subscription = this.f78211a.get();
            C13485a c13485a = new C13485a(subscriber, subscription);
            c13485a.add(subscription);
            this.f78212b.unsafeSubscribe(c13485a);
        }
    }

    public OnSubscribeGroupJoin(Observable<T1> observable, Observable<T2> observable2, Func1<? super T1, ? extends Observable<D1>> func1, Func1<? super T2, ? extends Observable<D2>> func12, Func2<? super T1, ? super Observable<T2>, ? extends R> func2) {
        this.f78198a = observable;
        this.f78199b = observable2;
        this.f78200c = func1;
        this.f78201d = func12;
        this.f78202e = func2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        ResultManager resultManager = new ResultManager(new SerializedSubscriber(subscriber));
        subscriber.add(resultManager);
        resultManager.init();
    }
}