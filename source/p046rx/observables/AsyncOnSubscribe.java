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
    public static class C13795a implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action3 f79284a;

        public C13795a(Action3 action3) {
            this.f79284a = action3;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Object call(Object obj, Long l, Observer observer) {
            this.f79284a.call(obj, l, observer);
            return obj;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$b */
    /* loaded from: classes7.dex */
    public static class C13796b implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action3 f79285a;

        public C13796b(Action3 action3) {
            this.f79285a = action3;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Object call(Object obj, Long l, Observer observer) {
            this.f79285a.call(obj, l, observer);
            return obj;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$c */
    /* loaded from: classes7.dex */
    public static class C13797c implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f79286a;

        public C13797c(Action2 action2) {
            this.f79286a = action2;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Void call(Void r2, Long l, Observer observer) {
            this.f79286a.call(l, observer);
            return r2;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$d */
    /* loaded from: classes7.dex */
    public static class C13798d implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f79287a;

        public C13798d(Action2 action2) {
            this.f79287a = action2;
        }

        @Override // p046rx.functions.Func3
        /* renamed from: a */
        public Void call(Void r1, Long l, Observer observer) {
            this.f79287a.call(l, observer);
            return null;
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$e */
    /* loaded from: classes7.dex */
    public static class C13799e implements Action1 {

        /* renamed from: a */
        public final /* synthetic */ Action0 f79288a;

        public C13799e(Action0 action0) {
            this.f79288a = action0;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Void r1) {
            this.f79288a.call();
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$f */
    /* loaded from: classes7.dex */
    public class C13800f extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f79289a;

        /* renamed from: b */
        public final /* synthetic */ C13803i f79290b;

        public C13800f(Subscriber subscriber, C13803i c13803i) {
            this.f79289a = subscriber;
            this.f79290b = c13803i;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79289a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79289a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79289a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f79290b.m22800f(producer);
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$g */
    /* loaded from: classes7.dex */
    public class C13801g implements Func1 {
        public C13801g() {
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return observable.onBackpressureBuffer();
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$i */
    /* loaded from: classes7.dex */
    public static final class C13803i implements Producer, Subscription, Observer {

        /* renamed from: b */
        public final AsyncOnSubscribe f79297b;

        /* renamed from: e */
        public boolean f79300e;

        /* renamed from: f */
        public boolean f79301f;

        /* renamed from: g */
        public Object f79302g;

        /* renamed from: h */
        public final C13806j f79303h;

        /* renamed from: i */
        public boolean f79304i;

        /* renamed from: j */
        public List f79305j;

        /* renamed from: k */
        public Producer f79306k;

        /* renamed from: l */
        public long f79307l;

        /* renamed from: d */
        public final CompositeSubscription f79299d = new CompositeSubscription();

        /* renamed from: c */
        public final SerializedObserver f79298c = new SerializedObserver(this);

        /* renamed from: a */
        public final AtomicBoolean f79296a = new AtomicBoolean();

        /* renamed from: rx.observables.AsyncOnSubscribe$i$a */
        /* loaded from: classes7.dex */
        public class C13804a extends Subscriber {

            /* renamed from: a */
            public long f79308a;

            /* renamed from: b */
            public final /* synthetic */ long f79309b;

            /* renamed from: c */
            public final /* synthetic */ BufferUntilSubscriber f79310c;

            public C13804a(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.f79309b = j;
                this.f79310c = bufferUntilSubscriber;
                this.f79308a = j;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f79310c.onCompleted();
                long j = this.f79308a;
                if (j > 0) {
                    C13803i.this.m22801e(j);
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f79310c.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                this.f79308a--;
                this.f79310c.onNext(obj);
            }
        }

        /* renamed from: rx.observables.AsyncOnSubscribe$i$b */
        /* loaded from: classes7.dex */
        public class C13805b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f79312a;

            public C13805b(Subscriber subscriber) {
                this.f79312a = subscriber;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13803i.this.f79299d.remove(this.f79312a);
            }
        }

        public C13803i(AsyncOnSubscribe asyncOnSubscribe, Object obj, C13806j c13806j) {
            this.f79297b = asyncOnSubscribe;
            this.f79302g = obj;
            this.f79303h = c13806j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m22805a() {
            this.f79299d.unsubscribe();
            try {
                this.f79297b.onUnsubscribe(this.f79302g);
            } catch (Throwable th2) {
                m22804b(th2);
            }
        }

        /* renamed from: b */
        public final void m22804b(Throwable th2) {
            if (this.f79300e) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f79300e = true;
            this.f79303h.onError(th2);
            m22805a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public void m22803c(long j) {
            this.f79302g = this.f79297b.next(this.f79302g, j, this.f79298c);
        }

        @Override // p046rx.Observer
        /* renamed from: d */
        public void onNext(Observable observable) {
            if (!this.f79301f) {
                this.f79301f = true;
                if (this.f79300e) {
                    return;
                }
                m22799g(observable);
                return;
            }
            throw new IllegalStateException("onNext called multiple times!");
        }

        /* renamed from: e */
        public void m22801e(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                return;
            }
            if (i >= 0) {
                synchronized (this) {
                    try {
                        if (this.f79304i) {
                            List list = this.f79305j;
                            if (list == null) {
                                list = new ArrayList();
                                this.f79305j = list;
                            }
                            list.add(Long.valueOf(j));
                            return;
                        }
                        this.f79304i = true;
                        if (m22798h(j)) {
                            return;
                        }
                        while (true) {
                            synchronized (this) {
                                try {
                                    List<Long> list2 = this.f79305j;
                                    if (list2 == null) {
                                        this.f79304i = false;
                                        return;
                                    }
                                    this.f79305j = null;
                                    for (Long l : list2) {
                                        if (m22798h(l.longValue())) {
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
        public void m22800f(Producer producer) {
            if (this.f79306k == null) {
                this.f79306k = producer;
                return;
            }
            throw new IllegalStateException("setConcatProducer may be called at most once!");
        }

        /* renamed from: g */
        public final void m22799g(Observable observable) {
            BufferUntilSubscriber create = BufferUntilSubscriber.create();
            C13804a c13804a = new C13804a(this.f79307l, create);
            this.f79299d.add(c13804a);
            observable.doOnTerminate(new C13805b(c13804a)).subscribe((Subscriber) c13804a);
            this.f79303h.onNext(create);
        }

        /* renamed from: h */
        public boolean m22798h(long j) {
            if (isUnsubscribed()) {
                m22805a();
                return true;
            }
            try {
                this.f79301f = false;
                this.f79307l = j;
                m22803c(j);
                if (this.f79300e) {
                    if (this.f79299d.hasSubscriptions()) {
                    }
                    m22805a();
                    return true;
                }
                if (!isUnsubscribed()) {
                    if (this.f79301f) {
                        return false;
                    }
                    m22804b(new IllegalStateException("No events emitted!"));
                    return true;
                }
                m22805a();
                return true;
            } catch (Throwable th2) {
                m22804b(th2);
                return true;
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79296a.get();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f79300e) {
                this.f79300e = true;
                this.f79303h.onCompleted();
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f79300e) {
                this.f79300e = true;
                this.f79303h.onError(th2);
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
                        if (this.f79304i) {
                            List list = this.f79305j;
                            if (list == null) {
                                list = new ArrayList();
                                this.f79305j = list;
                            }
                            list.add(Long.valueOf(j));
                        } else {
                            this.f79304i = true;
                            z = false;
                        }
                    } finally {
                    }
                }
                this.f79306k.request(j);
                if (z || m22798h(j)) {
                    return;
                }
                while (true) {
                    synchronized (this) {
                        try {
                            List<Long> list2 = this.f79305j;
                            if (list2 == null) {
                                this.f79304i = false;
                                return;
                            }
                            this.f79305j = null;
                            for (Long l : list2) {
                                if (m22798h(l.longValue())) {
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
            if (this.f79296a.compareAndSet(false, true)) {
                synchronized (this) {
                    try {
                        if (this.f79304i) {
                            ArrayList arrayList = new ArrayList();
                            this.f79305j = arrayList;
                            arrayList.add(0L);
                            return;
                        }
                        this.f79304i = true;
                        m22805a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$j */
    /* loaded from: classes7.dex */
    public static final class C13806j extends Observable implements Observer {

        /* renamed from: b */
        public final C13807a f79314b;

        /* renamed from: rx.observables.AsyncOnSubscribe$j$a */
        /* loaded from: classes7.dex */
        public static final class C13807a implements Observable.OnSubscribe {

            /* renamed from: a */
            public Subscriber f79315a;

            @Override // p046rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber subscriber) {
                synchronized (this) {
                    try {
                        if (this.f79315a == null) {
                            this.f79315a = subscriber;
                        } else {
                            subscriber.onError(new IllegalStateException("There can be only one subscriber"));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public C13806j(C13807a c13807a) {
            super(c13807a);
            this.f79314b = c13807a;
        }

        /* renamed from: c */
        public static C13806j m22797c() {
            return new C13806j(new C13807a());
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f79314b.f79315a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79314b.f79315a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f79314b.f79315a.onNext(obj);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3) {
        return new C13802h(func0, new C13795a(action3));
    }

    public static <S, T> AsyncOnSubscribe<S, T> createStateful(Func0<? extends S> func0, Func3<? super S, Long, ? super Observer<Observable<? extends T>>, ? extends S> func3, Action1<? super S> action1) {
        return new C13802h(func0, func3, action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(Action2<Long, ? super Observer<Observable<? extends T>>> action2) {
        return new C13802h(new C13797c(action2));
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
        return new C13802h(func0, func3);
    }

    public final void call(Subscriber<? super T> subscriber) {
        try {
            S generateState = generateState();
            C13806j m22797c = C13806j.m22797c();
            C13803i c13803i = new C13803i(this, generateState, m22797c);
            C13800f c13800f = new C13800f(subscriber, c13803i);
            m22797c.onBackpressureBuffer().concatMap(new C13801g()).unsafeSubscribe(c13800f);
            subscriber.add(c13800f);
            subscriber.add(c13803i);
            subscriber.setProducer(c13803i);
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    public static <S, T> AsyncOnSubscribe<S, T> createSingleState(Func0<? extends S> func0, Action3<? super S, Long, ? super Observer<Observable<? extends T>>> action3, Action1<? super S> action1) {
        return new C13802h(func0, new C13796b(action3), action1);
    }

    public static <T> AsyncOnSubscribe<Void, T> createStateless(Action2<Long, ? super Observer<Observable<? extends T>>> action2, Action0 action0) {
        return new C13802h(new C13798d(action2), new C13799e(action0));
    }

    /* renamed from: rx.observables.AsyncOnSubscribe$h */
    /* loaded from: classes7.dex */
    public static final class C13802h extends AsyncOnSubscribe {

        /* renamed from: a */
        public final Func0 f79293a;

        /* renamed from: b */
        public final Func3 f79294b;

        /* renamed from: c */
        public final Action1 f79295c;

        public C13802h(Func0 func0, Func3 func3, Action1 action1) {
            this.f79293a = func0;
            this.f79294b = func3;
            this.f79295c = action1;
        }

        @Override // p046rx.observables.AsyncOnSubscribe, p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((Subscriber) ((Subscriber) obj));
        }

        @Override // p046rx.observables.AsyncOnSubscribe
        public Object generateState() {
            Func0 func0 = this.f79293a;
            if (func0 == null) {
                return null;
            }
            return func0.call();
        }

        @Override // p046rx.observables.AsyncOnSubscribe
        public Object next(Object obj, long j, Observer observer) {
            return this.f79294b.call(obj, Long.valueOf(j), observer);
        }

        @Override // p046rx.observables.AsyncOnSubscribe
        public void onUnsubscribe(Object obj) {
            Action1 action1 = this.f79295c;
            if (action1 != null) {
                action1.call(obj);
            }
        }

        public C13802h(Func0 func0, Func3 func3) {
            this(func0, func3, null);
        }

        public C13802h(Func3 func3, Action1 action1) {
            this(null, func3, action1);
        }

        public C13802h(Func3 func3) {
            this(null, func3, null);
        }
    }
}
