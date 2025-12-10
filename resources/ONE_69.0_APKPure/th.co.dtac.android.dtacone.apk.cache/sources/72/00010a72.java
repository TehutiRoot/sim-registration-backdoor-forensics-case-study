package p046rx.internal.operators;

import java.util.HashMap;
import java.util.Map;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.functions.Func1;

/* renamed from: rx.internal.operators.OnSubscribeToMap */
/* loaded from: classes7.dex */
public final class OnSubscribeToMap<T, K, V> implements Observable.OnSubscribe<Map<K, V>>, Func0<Map<K, V>> {

    /* renamed from: a */
    public final Observable f78386a;

    /* renamed from: b */
    public final Func1 f78387b;

    /* renamed from: c */
    public final Func1 f78388c;

    /* renamed from: d */
    public final Func0 f78389d;

    /* renamed from: rx.internal.operators.OnSubscribeToMap$a */
    /* loaded from: classes7.dex */
    public static final class C13524a extends DeferredScalarSubscriberSafe {

        /* renamed from: b */
        public final Func1 f78390b;

        /* renamed from: c */
        public final Func1 f78391c;

        /* JADX WARN: Multi-variable type inference failed */
        public C13524a(Subscriber subscriber, Map map, Func1 func1, Func1 func12) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.f78390b = func1;
            this.f78391c = func12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                ((Map) this.value).put(this.f78390b.call(obj), this.f78391c.call(obj));
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

    public OnSubscribeToMap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null);
    }

    public OnSubscribeToMap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, V>> func0) {
        this.f78386a = observable;
        this.f78387b = func1;
        this.f78388c = func12;
        if (func0 == null) {
            this.f78389d = this;
        } else {
            this.f78389d = func0;
        }
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    @Override // p046rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, V> call() {
        return new HashMap();
    }

    public void call(Subscriber<? super Map<K, V>> subscriber) {
        try {
            new C13524a(subscriber, (Map) this.f78389d.call(), this.f78387b, this.f78388c).subscribeTo(this.f78386a);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}