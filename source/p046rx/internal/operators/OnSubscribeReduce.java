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
    public final Observable f78082a;

    /* renamed from: b */
    public final Func2 f78083b;

    /* renamed from: rx.internal.operators.OnSubscribeReduce$a */
    /* loaded from: classes7.dex */
    public class C13505a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13506b f78084a;

        public C13505a(C13506b c13506b) {
            this.f78084a = c13506b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78084a.m23105b(j);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeReduce$b */
    /* loaded from: classes7.dex */
    public static final class C13506b extends Subscriber {

        /* renamed from: e */
        public static final Object f78086e = new Object();

        /* renamed from: a */
        public final Subscriber f78087a;

        /* renamed from: b */
        public final Func2 f78088b;

        /* renamed from: c */
        public Object f78089c = f78086e;

        /* renamed from: d */
        public boolean f78090d;

        public C13506b(Subscriber subscriber, Func2 func2) {
            this.f78087a = subscriber;
            this.f78088b = func2;
            request(0L);
        }

        /* renamed from: b */
        public void m23105b(long j) {
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
            if (this.f78090d) {
                return;
            }
            this.f78090d = true;
            Object obj = this.f78089c;
            if (obj != f78086e) {
                this.f78087a.onNext(obj);
                this.f78087a.onCompleted();
                return;
            }
            this.f78087a.onError(new NoSuchElementException());
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f78090d) {
                this.f78090d = true;
                this.f78087a.onError(th2);
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78090d) {
                return;
            }
            Object obj2 = this.f78089c;
            if (obj2 == f78086e) {
                this.f78089c = obj;
                return;
            }
            try {
                this.f78089c = this.f78088b.call(obj2, obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeReduce(Observable<T> observable, Func2<T, T, T> func2) {
        this.f78082a = observable;
        this.f78083b = func2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        C13506b c13506b = new C13506b(subscriber, this.f78083b);
        subscriber.add(c13506b);
        subscriber.setProducer(new C13505a(c13506b));
        this.f78082a.unsafeSubscribe(c13506b);
    }
}
