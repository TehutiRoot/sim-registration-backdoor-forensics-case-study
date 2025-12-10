package p046rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OnSubscribeToMultimap */
/* loaded from: classes7.dex */
public final class OnSubscribeToMultimap<T, K, V> implements Observable.OnSubscribe<Map<K, Collection<V>>>, Func0<Map<K, Collection<V>>> {

    /* renamed from: a */
    public final Func1 f78186a;

    /* renamed from: b */
    public final Func1 f78187b;

    /* renamed from: c */
    public final Func0 f78188c;

    /* renamed from: d */
    public final Func1 f78189d;

    /* renamed from: e */
    public final Observable f78190e;

    /* renamed from: rx.internal.operators.OnSubscribeToMultimap$a */
    /* loaded from: classes7.dex */
    public static final class C13524a implements Func1 {

        /* renamed from: a */
        public static final C13524a f78191a = new C13524a();

        /* renamed from: b */
        public static C13524a m23091b() {
            return f78191a;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Collection call(Object obj) {
            return new ArrayList();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeToMultimap$b */
    /* loaded from: classes7.dex */
    public static final class C13525b extends DeferredScalarSubscriberSafe {

        /* renamed from: b */
        public final Func1 f78192b;

        /* renamed from: c */
        public final Func1 f78193c;

        /* renamed from: d */
        public final Func1 f78194d;

        /* JADX WARN: Multi-variable type inference failed */
        public C13525b(Subscriber subscriber, Map map, Func1 func1, Func1 func12, Func1 func13) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.f78192b = func1;
            this.f78193c = func12;
            this.f78194d = func13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                Object call = this.f78192b.call(obj);
                Object call2 = this.f78193c.call(obj);
                Collection collection = (Collection) ((Map) this.value).get(call);
                if (collection == null) {
                    collection = (Collection) this.f78194d.call(call);
                    ((Map) this.value).put(call, collection);
                }
                collection.add(call2);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null, C13524a.m23091b());
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0) {
        this(observable, func1, func12, func0, C13524a.m23091b());
    }

    @Override // p046rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, Collection<V>> call() {
        return new HashMap();
    }

    public void call(Subscriber<? super Map<K, Collection<V>>> subscriber) {
        try {
            new C13525b(subscriber, (Map) this.f78188c.call(), this.f78186a, this.f78187b, this.f78189d).subscribeTo(this.f78190e);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0, Func1<? super K, ? extends Collection<V>> func13) {
        this.f78190e = observable;
        this.f78186a = func1;
        this.f78187b = func12;
        if (func0 == null) {
            this.f78188c = this;
        } else {
            this.f78188c = func0;
        }
        this.f78189d = func13;
    }
}
