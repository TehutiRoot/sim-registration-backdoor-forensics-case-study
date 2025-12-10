package p046rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.functions.Func1;
import p046rx.internal.operators.OnSubscribeFromIterable;
import p046rx.internal.util.ExceptionsUtils;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.ScalarSynchronousObservable;
import p046rx.internal.util.atomic.SpscAtomicArrayQueue;
import p046rx.internal.util.atomic.SpscLinkedArrayQueue;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeFlattenIterable */
/* loaded from: classes7.dex */
public final class OnSubscribeFlattenIterable<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f77970a;

    /* renamed from: b */
    public final Func1 f77971b;

    /* renamed from: c */
    public final int f77972c;

    /* renamed from: rx.internal.operators.OnSubscribeFlattenIterable$a */
    /* loaded from: classes7.dex */
    public class C13476a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13477b f77973a;

        public C13476a(C13477b c13477b) {
            this.f77973a = c13477b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f77973a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeFlattenIterable$b */
    /* loaded from: classes7.dex */
    public static final class C13477b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f77975a;

        /* renamed from: b */
        public final Func1 f77976b;

        /* renamed from: c */
        public final long f77977c;

        /* renamed from: d */
        public final Queue f77978d;

        /* renamed from: h */
        public volatile boolean f77982h;

        /* renamed from: i */
        public long f77983i;

        /* renamed from: j */
        public Iterator f77984j;

        /* renamed from: e */
        public final AtomicReference f77979e = new AtomicReference();

        /* renamed from: g */
        public final AtomicInteger f77981g = new AtomicInteger();

        /* renamed from: f */
        public final AtomicLong f77980f = new AtomicLong();

        public C13477b(Subscriber subscriber, Func1 func1, int i) {
            this.f77975a = subscriber;
            this.f77976b = func1;
            if (i == Integer.MAX_VALUE) {
                this.f77977c = Long.MAX_VALUE;
                this.f77978d = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);
            } else {
                this.f77977c = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.f77978d = new SpscArrayQueue(i);
                } else {
                    this.f77978d = new SpscAtomicArrayQueue(i);
                }
            }
            request(i);
        }

        /* renamed from: b */
        public boolean m23118b(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.f77984j = null;
                return true;
            } else if (z) {
                if (((Throwable) this.f77979e.get()) != null) {
                    Throwable terminate = ExceptionsUtils.terminate(this.f77979e);
                    unsubscribe();
                    queue.clear();
                    this.f77984j = null;
                    subscriber.onError(terminate);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00d9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00d0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0010 A[SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m23117c() {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OnSubscribeFlattenIterable.C13477b.m23117c():void");
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77982h = true;
            m23117c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (ExceptionsUtils.addThrowable(this.f77979e, th2)) {
                this.f77982h = true;
                m23117c();
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f77978d.offer(NotificationLite.next(obj))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            m23117c();
        }

        public void requestMore(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                BackpressureUtils.getAndAddRequest(this.f77980f, j);
                m23117c();
            } else if (i >= 0) {
            } else {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeFlattenIterable$c */
    /* loaded from: classes7.dex */
    public static final class C13478c implements Observable.OnSubscribe {

        /* renamed from: a */
        public final Object f77985a;

        /* renamed from: b */
        public final Func1 f77986b;

        public C13478c(Object obj, Func1 func1) {
            this.f77985a = obj;
            this.f77986b = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            try {
                Iterator<T> it = ((Iterable) this.f77986b.call(this.f77985a)).iterator();
                if (!it.hasNext()) {
                    subscriber.onCompleted();
                } else {
                    subscriber.setProducer(new OnSubscribeFromIterable.IterableProducer(subscriber, it));
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber, this.f77985a);
            }
        }
    }

    public OnSubscribeFlattenIterable(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        this.f77970a = observable;
        this.f77971b = func1;
        this.f77972c = i;
    }

    public static <T, R> Observable<R> createFrom(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        if (observable instanceof ScalarSynchronousObservable) {
            return Observable.unsafeCreate(new C13478c(((ScalarSynchronousObservable) observable).get(), func1));
        }
        return Observable.unsafeCreate(new OnSubscribeFlattenIterable(observable, func1, i));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        C13477b c13477b = new C13477b(subscriber, this.f77971b, this.f77972c);
        subscriber.add(c13477b);
        subscriber.setProducer(new C13476a(c13477b));
        this.f77970a.unsafeSubscribe(c13477b);
    }
}
