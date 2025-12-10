package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.observers.SerializedSubscriber;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeJoin */
/* loaded from: classes7.dex */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f78010a;

    /* renamed from: b */
    public final Observable f78011b;

    /* renamed from: c */
    public final Func1 f78012c;

    /* renamed from: d */
    public final Func1 f78013d;

    /* renamed from: e */
    public final Func2 f78014e;

    /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink */
    /* loaded from: classes7.dex */
    public final class ResultSink extends HashMap<Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        boolean leftDone;
        int leftId;
        boolean rightDone;
        int rightId;
        final Subscriber<? super R> subscriber;
        final CompositeSubscription group = new CompositeSubscription();
        final Map<Integer, TRight> rightMap = new HashMap();

        /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$a */
        /* loaded from: classes7.dex */
        public final class C13485a extends Subscriber {

            /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$a$a */
            /* loaded from: classes7.dex */
            public final class C13486a extends Subscriber {

                /* renamed from: a */
                public final int f78016a;

                /* renamed from: b */
                public boolean f78017b = true;

                public C13486a(int i) {
                    this.f78016a = i;
                }

                @Override // p046rx.Observer
                public void onCompleted() {
                    if (this.f78017b) {
                        this.f78017b = false;
                        C13485a.this.m23114b(this.f78016a, this);
                    }
                }

                @Override // p046rx.Observer
                public void onError(Throwable th2) {
                    C13485a.this.onError(th2);
                }

                @Override // p046rx.Observer
                public void onNext(Object obj) {
                    onCompleted();
                }
            }

            public C13485a() {
            }

            /* renamed from: b */
            public void m23114b(int i, Subscription subscription) {
                boolean z;
                synchronized (ResultSink.this) {
                    try {
                        if (ResultSink.this.leftMap().remove(Integer.valueOf(i)) != null && ResultSink.this.leftMap().isEmpty() && ResultSink.this.leftDone) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.remove(subscription);
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                boolean z;
                synchronized (ResultSink.this) {
                    try {
                        ResultSink resultSink = ResultSink.this;
                        z = true;
                        resultSink.leftDone = true;
                        if (!resultSink.rightDone && !resultSink.leftMap().isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.remove(this);
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                ResultSink.this.subscriber.onError(th2);
                ResultSink.this.subscriber.unsubscribe();
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                int i;
                ResultSink resultSink;
                int i2;
                synchronized (ResultSink.this) {
                    ResultSink resultSink2 = ResultSink.this;
                    i = resultSink2.leftId;
                    resultSink2.leftId = i + 1;
                    resultSink2.leftMap().put(Integer.valueOf(i), obj);
                    resultSink = ResultSink.this;
                    i2 = resultSink.rightId;
                }
                try {
                    C13486a c13486a = new C13486a(i);
                    ResultSink.this.group.add(c13486a);
                    ((Observable) OnSubscribeJoin.this.f78012c.call(obj)).unsafeSubscribe(c13486a);
                    ArrayList<Object> arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        for (Map.Entry<Integer, TRight> entry : ResultSink.this.rightMap.entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    for (Object obj2 : arrayList) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.f78014e.call(obj, obj2));
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$b */
        /* loaded from: classes7.dex */
        public final class C13487b extends Subscriber {

            /* renamed from: rx.internal.operators.OnSubscribeJoin$ResultSink$b$a */
            /* loaded from: classes7.dex */
            public final class C13488a extends Subscriber {

                /* renamed from: a */
                public final int f78020a;

                /* renamed from: b */
                public boolean f78021b = true;

                public C13488a(int i) {
                    this.f78020a = i;
                }

                @Override // p046rx.Observer
                public void onCompleted() {
                    if (this.f78021b) {
                        this.f78021b = false;
                        C13487b.this.m23113b(this.f78020a, this);
                    }
                }

                @Override // p046rx.Observer
                public void onError(Throwable th2) {
                    C13487b.this.onError(th2);
                }

                @Override // p046rx.Observer
                public void onNext(Object obj) {
                    onCompleted();
                }
            }

            public C13487b() {
            }

            /* renamed from: b */
            public void m23113b(int i, Subscription subscription) {
                boolean z;
                synchronized (ResultSink.this) {
                    try {
                        if (ResultSink.this.rightMap.remove(Integer.valueOf(i)) != null && ResultSink.this.rightMap.isEmpty() && ResultSink.this.rightDone) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.remove(subscription);
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                boolean z;
                synchronized (ResultSink.this) {
                    try {
                        ResultSink resultSink = ResultSink.this;
                        z = true;
                        resultSink.rightDone = true;
                        if (!resultSink.leftDone && !resultSink.rightMap.isEmpty()) {
                            z = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    ResultSink.this.subscriber.onCompleted();
                    ResultSink.this.subscriber.unsubscribe();
                    return;
                }
                ResultSink.this.group.remove(this);
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                ResultSink.this.subscriber.onError(th2);
                ResultSink.this.subscriber.unsubscribe();
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                int i;
                int i2;
                synchronized (ResultSink.this) {
                    ResultSink resultSink = ResultSink.this;
                    i = resultSink.rightId;
                    resultSink.rightId = i + 1;
                    resultSink.rightMap.put(Integer.valueOf(i), obj);
                    i2 = ResultSink.this.leftId;
                }
                ResultSink.this.group.add(new SerialSubscription());
                try {
                    C13488a c13488a = new C13488a(i);
                    ResultSink.this.group.add(c13488a);
                    ((Observable) OnSubscribeJoin.this.f78013d.call(obj)).unsafeSubscribe(c13488a);
                    ArrayList<Object> arrayList = new ArrayList();
                    synchronized (ResultSink.this) {
                        for (Map.Entry<Integer, TLeft> entry : ResultSink.this.leftMap().entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    for (Object obj2 : arrayList) {
                        ResultSink.this.subscriber.onNext(OnSubscribeJoin.this.f78014e.call(obj2, obj));
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        public ResultSink(Subscriber<? super R> subscriber) {
            this.subscriber = subscriber;
        }

        public HashMap<Integer, TLeft> leftMap() {
            return this;
        }

        public void run() {
            this.subscriber.add(this.group);
            C13485a c13485a = new C13485a();
            C13487b c13487b = new C13487b();
            this.group.add(c13485a);
            this.group.add(c13487b);
            OnSubscribeJoin.this.f78010a.unsafeSubscribe(c13485a);
            OnSubscribeJoin.this.f78011b.unsafeSubscribe(c13487b);
        }
    }

    public OnSubscribeJoin(Observable<TLeft> observable, Observable<TRight> observable2, Func1<TLeft, Observable<TLeftDuration>> func1, Func1<TRight, Observable<TRightDuration>> func12, Func2<TLeft, TRight, R> func2) {
        this.f78010a = observable;
        this.f78011b = observable2;
        this.f78012c = func1;
        this.f78013d = func12;
        this.f78014e = func2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        new ResultSink(new SerializedSubscriber(subscriber)).run();
    }
}
