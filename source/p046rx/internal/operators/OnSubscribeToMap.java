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
    public final Observable f78180a;

    /* renamed from: b */
    public final Func1 f78181b;

    /* renamed from: c */
    public final Func1 f78182c;

    /* renamed from: d */
    public final Func0 f78183d;

    /* renamed from: rx.internal.operators.OnSubscribeToMap$a */
    /* loaded from: classes7.dex */
    public static final class C13523a extends DeferredScalarSubscriberSafe {

        /* renamed from: b */
        public final Func1 f78184b;

        /* renamed from: c */
        public final Func1 f78185c;

        /* JADX WARN: Multi-variable type inference failed */
        public C13523a(Subscriber subscriber, Map map, Func1 func1, Func1 func12) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.f78184b = func1;
            this.f78185c = func12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                ((Map) this.value).put(this.f78184b.call(obj), this.f78185c.call(obj));
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
        this.f78180a = observable;
        this.f78181b = func1;
        this.f78182c = func12;
        if (func0 == null) {
            this.f78183d = this;
        } else {
            this.f78183d = func0;
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
            new C13523a(subscriber, (Map) this.f78183d.call(), this.f78181b, this.f78182c).subscribeTo(this.f78180a);
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}
