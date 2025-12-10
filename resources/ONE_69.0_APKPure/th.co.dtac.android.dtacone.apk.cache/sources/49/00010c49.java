package p046rx.observables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.annotations.Beta;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Action2;
import p046rx.functions.Action3;
import p046rx.functions.Func0;
import p046rx.functions.Func1;
import p046rx.functions.Func3;
import p046rx.internal.operators.BufferUntilSubscriber;
import p046rx.observers.SerializedObserver;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

@Beta
/* renamed from: rx.observables.AsyncOnSubscribe */
/* loaded from: classes7.dex */
public abstract class AsyncOnSubscribe<S, T> implements Observable.OnSubscribe<T> {

    /* renamed from: rx.observables.AsyncOnSubscribe$a */
    /* loaded from: classes7.dex */
    public static class C13796a implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action3 f79490a;

        public C13796a(Action3 action3) {
            this.f79490a = action3;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Object call(Object obj, Long l, Observer observer) {
            this.f79490a.call(obj, l, observer);
            return obj;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$b */
    /* loaded from: classes7.dex */
    public static class C13797b implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action3 f79491a;

        public C13797b(Action3 action3) {
            this.f79491a = action3;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Object call(Object obj, Long l, Observer observer) {
            this.f79491a.call(obj, l, observer);
            return obj;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$c */
    /* loaded from: classes7.dex */
    public static class C13798c implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f79492a;

        public C13798c(Action2 action2) {
            this.f79492a = action2;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Void call(Void r2, Long l, Observer observer) {
            this.f79492a.call(l, observer);
            return r2;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$d */
    /* loaded from: classes7.dex */
    public static class C13799d implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f79493a;

        public C13799d(Action2 action2) {
            this.f79493a = action2;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Void call(Void r1, Long l, Observer observer) {
            this.f79493a.call(l, observer);
            return null;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$e */
    /* loaded from: classes7.dex */
    public static class C13800e implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action0 f79494a;

        public C13800e(Action0 action0) {
            this.f79494a = action0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Void r1) {
            this.f79494a.call();
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$f */
    /* loaded from: classes7.dex */
    public class C13801f extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f79495a;

        /* renamed from: b */
        public final /* synthetic */ C13804i f79496b;

        public C13801f(Subscriber subscriber, C13804i c13804i) {
            this.f79495a = subscriber;
            this.f79496b = c13804i;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79495a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79495a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79495a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f79496b.m22988f(producer);
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$g */
    /* loaded from: classes7.dex */
    public class C13802g implements Func1 {
        public C13802g() {
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return observable.onBackpressureBuffer();
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$i */
    /* loaded from: classes7.dex */
    public static final class C13804i implements Producer, Subscription, Observer {

        /* renamed from: b */
        public final AsyncOnSubscribe f79503b;

        /* renamed from: e */
        public boolean f79506e;

        /* renamed from: f */
        public boolean f79507f;

        /* renamed from: g */
        public Object f79508g;

        /* renamed from: h */
        public final C13807j f79509h;

        /* renamed from: i */
        public boolean f79510i;

        /* renamed from: j */
        public List f79511j;

        /* renamed from: k */
        public Producer f79512k;

        /* renamed from: l */
        public long f79513l;

        /* renamed from: d */
        public final CompositeSubscription f79505d = new CompositeSubscription();

        /* renamed from: c */
        public final SerializedObserver f79504c = new SerializedObserver(this);

        /* renamed from: a */
        public final AtomicBoolean f79502a = new AtomicBoolean();

        /* renamed from: rx.observables.AsyncOnSubscribe$i$a */
        /* loaded from: classes7.dex */
        public class C13805a extends Subscriber {

            /* renamed from: a */
            public long f79514a;

            /* renamed from: b */
            public final /* synthetic */ long f79515b;

            /* renamed from: c */
            public final /* synthetic */ BufferUntilSubscriber f79516c;

            public C13805a(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.f79515b = j;
                this.f79516c = bufferUntilSubscriber;
                this.f79514a = j;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f79516c.onCompleted();
                long j = this.f79514a;
                if (j > 0) {
                    C13804i.this.m22989e(j);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f79516c.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                this.f79514a--;
                this.f79516c.onNext(obj);
            }
        }

        /* renamed from: rx.observables.AsyncOnSubscribe$i$b */
        /* loaded from: classes7.dex */
        public class C13806b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f79518a;

            public C13806b(Subscriber subscriber) {
                this.f79518a = subscriber;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13804i.this.f79505d.remove(this.f79518a);
            }
        }

        public C13804i(AsyncOnSubscribe asyncOnSubscribe, Object obj, C13807j c13807j) {
            this.f79503b = asyncOnSubscribe;
            this.f79508g = obj;
            this.f79509h = c13807j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m22993a() {
            this.f79505d.unsubscribe();
            try {
                this.f79503b.onUnsubscribe(this.f79508g);
            } catch (Throwable th2) {
                m22992b(th2);
            }
        }

        /* renamed from: b */
        public final void m22992b(Throwable th2) {
            if (this.f79506e) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79506e = true;
            this.f79509h.onError(th2);
            m22993a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m22991c(long j) {
            this.f79508g = this.f79503b.next(this.f79508g, j, this.f79504c);
        }

        @Override // p046rx.Observer
        /* renamed from: d */
        public void onNext(Observable observable) {
            if (!this.f79507f) {
                this.f79507f = true;
                if (this.f79506e) {
                    return;
                }
                m22987g(observable);
                return;
            }
            throw new IllegalStateException("onNext called multiple times!");
        }

        /* renamed from: e */
        public void m22989e(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                return;
            }
            if (i >= 0) {
                synchronized (this) {
                    try {
                        if (this.f79510i) {
                            List list = this.f79511j;
                            if (list == null) {
                                list = new ArrayList();
                                this.f79511j = list;
                            }
                            list.add(Long.valueOf(j));
                            return;
                        }
                        this.f79510i = true;
                        if (m22986h(j)) {
                            return;
                        }
                        while (true) {
                            synchronized (this) {
                                try {
                                    List<Long> list2 = this.f79511j;
                                    if (list2 == null) {
                                        this.f79510i = false;
                                        return;
                                    }
                                    this.f79511j = null;
                                    for (Long l : list2) {
                                        if (m22986h(l.longValue())) {
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            } else {
                throw new IllegalStateException("Request can't be negative! " + j);
            }
        }

        /* renamed from: f */
        public void m22988f(Producer producer) {
            if (this.f79512k == null) {
                this.f79512k = producer;
                return;
            }
            throw new IllegalStateException("setConcatProducer may be called at most once!");
        }

        /* renamed from: g */
        public final void m22987g(Observable observable) {
            BufferUntilSubscriber create = BufferUntilSubscriber.create();
            C13805a c13805a = new C13805a(this.f79513l, create);
            this.f79505d.add(c13805a);
            observable.doOnTerminate(new C13806b(c13805a)).subscribe((Subscriber) c13805a);
            this.f79509h.onNext(create);
        }

        /* renamed from: h */
        public boolean m22986h(long j) {
            if (isUnsubscribed()) {
                m22993a();
                return true;
            }
            try {
                this.f79507f = false;
                this.f79513l = j;
                m22991c(j);
                if (this.f79506e) {
                    if (this.f79505d.hasSubscriptions()) {
                    }
                    m22993a();
                    return true;
                }
                if (!isUnsubscribed()) {
                    if (this.f79507f) {
                        return false;
                    }
                    m22992b(new IllegalStateException("No events emitted!"));
                    return true;
                }
                m22993a();
                return true;
            } catch (Throwable th2) {
                m22992b(th2);
                return true;
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79502a.get();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f79506e) {
                this.f79506e = true;
                this.f79509h.onCompleted();
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f79506e) {
                this.f79506e = true;
                this.f79509h.onError(th2);
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // p046rx.Producer
        public void request(long j) {
            boolean z;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                return;
            }
            if (i >= 0) {
                synchronized (this) {
                    try {
                        z = true;
                        if (this.f79510i) {
                            List list = this.f79511j;
                            if (list == null) {
                                list = new ArrayList();
                                this.f79511j = list;
                            }
                            list.add(Long.valueOf(j));
                        } else {
                            this.f79510i = true;
                            z = false;
                        }
                    } finally {
                    }
                }
                this.f79512k.request(j);
                if (z || m22986h(j)) {
                    return;
                }
                while (true) {
                    synchronized (this) {
                        try {
                            List<Long> list2 = this.f79511j;
                            if (list2 == null) {
                                this.f79510i = false;
                                return;
                            }
                            this.f79511j = null;
                            for (Long l : list2) {
                                if (m22986h(l.longValue())) {
                                    return;
                                }
                            }
                        } finally {
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Request can't be negative! " + j);
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (this.f79502a.compareAndSet(false, true)) {
                synchronized (this) {
                    try {
                        if (this.f79510i) {
                            ArrayList arrayList = new ArrayList();
                            this.f79511j = arrayList;
                            arrayList.add(0L);
                            return;
                        }
                        this.f79510i = true;
                        m22993a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$j */
    /* loaded from: classes7.dex */
    public static final class C13807j extends Observable implements Observer {

        /* renamed from: b */
        public final C13808a f79520b;

        /* renamed from: rx.observables.AsyncOnSubscribe$j$a */
        /* loaded from: classes7.dex */
        public static final class C13808a implements Observable.OnSubscribe {

            /* renamed from: a */
            public Subscriber f79521a;

            @Override // p046rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber subscriber) {
                synchronized (this) {
                    try {
                        if (this.f79521a == null) {
                            this.f79521a = subscriber;
                        } else {
                            subscriber.onError(new IllegalStateException("There can be only one subscriber"));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public C13807j(C13808a c13808a) {
            super(c13808a);
            this.f79520b = c13808a;
        }

        /* renamed from: c */
        public static C13807j m22985c() {
            return new C13807j(new C13808a());
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79520b.f79521a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79520b.f79521a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79520b.f79521a.onNext(obj);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3) {
        return new C13803h(func0, new C13796a(action3));
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
        return new C13803h(func0, func3, action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(Action2<Long, ? super Observer<Observable<? extends T>>> action2) {
        return new C13803h(new C13798c(action2));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public abstract S generateState();

    public abstract S next(S s, long j, Observer<Observable<? extends T>> observer);

    public void onUnsubscribe(S s) {
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3) {
        return new C13803h(func0, func3);
    }

    public final void call(Subscriber<? super T> subscriber) {
        try {
            S generateState = generateState();
            C13807j m22985c = C13807j.m22985c();
            C13804i c13804i = new C13804i(this, generateState, m22985c);
            C13801f c13801f = new C13801f(subscriber, c13804i);
            m22985c.onBackpressureBuffer().concatMap(new C13802g()).unsafeSubscribe(c13801f);
            subscriber.add(c13801f);
            subscriber.add(c13804i);
            subscriber.setProducer(c13804i);
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3, Action1<? super S> action1) {
        return new C13803h(func0, new C13797b(action3), action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(Action2<Long, ? super Observer<Observable<? extends T>>> action2, Action0 action0) {
        return new C13803h(new C13799d(action2), new C13800e(action0));
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$h */
    /* loaded from: classes7.dex */
    public static final class C13803h extends AsyncOnSubscribe {

        /* renamed from: a */
        public final Func0 f79499a;

        /* renamed from: b */
        public final Func3 f79500b;

        /* renamed from: c */
        public final Action1 f79501c;

        public C13803h(Func0 func0, Func3 func3, Action1 action1) {
            this.f79499a = func0;
            this.f79500b = func3;
            this.f79501c = action1;
        }

        @Override // p046rx.observables.AsyncOnSubscribe, p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) ((Subscriber) obj));
        }

        @Override // p046rx.observables.AsyncOnSubscribe
        public Object generateState() {
            Func0 func0 = this.f79499a;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // p046rx.observables.AsyncOnSubscribe
        public Object next(Object obj, long j, Observer observer) {
            return this.f79500b.call(obj, Long.valueOf(j), observer);
        }

        @Override // p046rx.observables.AsyncOnSubscribe
        public void onUnsubscribe(Object obj) {
            Action1 action1 = this.f79501c;
            if (action1 != null) {
                action1.call(obj);
            }
        }

        public C13803h(Func0 func0, Func3 func3) {
            this(func0, func3, null);
        }

        public C13803h(Func3 func3, Action1 action1) {
            this(null, func3, action1);
        }

        public C13803h(Func3 func3) {
            this(null, func3, null);
        }
    }
}