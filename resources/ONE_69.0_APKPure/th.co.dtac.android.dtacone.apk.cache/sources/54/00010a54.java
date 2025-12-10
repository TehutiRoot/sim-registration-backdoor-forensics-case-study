package p046rx.internal.operators;

import java.util.NoSuchElementException;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func2;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeReduce */
/* loaded from: classes7.dex */
public final class OnSubscribeReduce<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78288a;

    /* renamed from: b */
    public final Func2 f78289b;

    /* renamed from: rx.internal.operators.OnSubscribeReduce$a */
    /* loaded from: classes7.dex */
    public class C13506a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13507b f78290a;

        public C13506a(C13507b c13507b) {
            this.f78290a = c13507b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78290a.m23293b(j);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeReduce$b */
    /* loaded from: classes7.dex */
    public static final class C13507b extends Subscriber {

        /* renamed from: e */
        public static final Object f78292e = new Object();

        /* renamed from: a */
        public final Subscriber f78293a;

        /* renamed from: b */
        public final Func2 f78294b;

        /* renamed from: c */
        public Object f78295c = f78292e;

        /* renamed from: d */
        public boolean f78296d;

        public C13507b(Subscriber subscriber, Func2 func2) {
            this.f78293a = subscriber;
            this.f78294b = func2;
            request(0L);
        }

        /* renamed from: b */
        public void m23293b(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    request(Long.MAX_VALUE);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78296d) {
                return;
            }
            this.f78296d = true;
            Object obj = this.f78295c;
            if (obj != f78292e) {
                this.f78293a.onNext(obj);
                this.f78293a.onCompleted();
                return;
            }
            this.f78293a.onError(new NoSuchElementException());
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78296d) {
                this.f78296d = true;
                this.f78293a.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78296d) {
                return;
            }
            Object obj2 = this.f78295c;
            if (obj2 == f78292e) {
                this.f78295c = obj;
                return;
            }
            try {
                this.f78295c = this.f78294b.call(obj2, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeReduce(Observable<T> observable, Func2<T, T, T> func2) {
        this.f78288a = observable;
        this.f78289b = func2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13507b c13507b = new C13507b(subscriber, this.f78289b);
        subscriber.add(c13507b);
        subscriber.setProducer(new C13506a(c13507b));
        this.f78288a.unsafeSubscribe(c13507b);
    }
}