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
    public final Func1 f78392a;

    /* renamed from: b */
    public final Func1 f78393b;

    /* renamed from: c */
    public final Func0 f78394c;

    /* renamed from: d */
    public final Func1 f78395d;

    /* renamed from: e */
    public final Observable f78396e;

    /* renamed from: rx.internal.operators.OnSubscribeToMultimap$a */
    /* loaded from: classes7.dex */
    public static final class C13525a implements Func1 {

        /* renamed from: a */
        public static final C13525a f78397a = new C13525a();

        /* renamed from: b */
        public static C13525a m23279b() {
            return f78397a;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Collection call(Object obj) {
            return new ArrayList();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeToMultimap$b */
    /* loaded from: classes7.dex */
    public static final class C13526b extends DeferredScalarSubscriberSafe {

        /* renamed from: b */
        public final Func1 f78398b;

        /* renamed from: c */
        public final Func1 f78399c;

        /* renamed from: d */
        public final Func1 f78400d;

        /* JADX WARN: Multi-variable type inference failed */
        public C13526b(Subscriber subscriber, Map map, Func1 func1, Func1 func12, Func1 func13) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.f78398b = func1;
            this.f78399c = func12;
            this.f78400d = func13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                Object call = this.f78398b.call(obj);
                Object call2 = this.f78399c.call(obj);
                Collection collection = (Collection) ((Map) this.value).get(call);
                if (collection == null) {
                    collection = (Collection) this.f78400d.call(call);
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
        this(observable, func1, func12, null, C13525a.m23279b());
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0) {
        this(observable, func1, func12, func0, C13525a.m23279b());
    }

    @Override // p046rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, Collection<V>> call() {
        return new HashMap();
    }

    public void call(Subscriber<? super Map<K, Collection<V>>> subscriber) {
        try {
            new C13526b(subscriber, (Map) this.f78394c.call(), this.f78392a, this.f78393b, this.f78395d).subscribeTo(this.f78396e);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0, Func1<? super K, ? extends Collection<V>> func13) {
        this.f78396e = observable;
        this.f78392a = func1;
        this.f78393b = func12;
        if (func0 == null) {
            this.f78394c = this;
        } else {
            this.f78394c = func0;
        }
        this.f78395d = func13;
    }
}