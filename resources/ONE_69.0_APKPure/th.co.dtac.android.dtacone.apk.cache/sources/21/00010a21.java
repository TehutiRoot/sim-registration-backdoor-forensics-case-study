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
    public final Observable f78176a;

    /* renamed from: b */
    public final Func1 f78177b;

    /* renamed from: c */
    public final int f78178c;

    /* renamed from: rx.internal.operators.OnSubscribeFlattenIterable$a */
    /* loaded from: classes7.dex */
    public class C13477a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13478b f78179a;

        public C13477a(C13478b c13478b) {
            this.f78179a = c13478b;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78179a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeFlattenIterable$b */
    /* loaded from: classes7.dex */
    public static final class C13478b extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78181a;

        /* renamed from: b */
        public final Func1 f78182b;

        /* renamed from: c */
        public final long f78183c;

        /* renamed from: d */
        public final Queue f78184d;

        /* renamed from: h */
        public volatile boolean f78188h;

        /* renamed from: i */
        public long f78189i;

        /* renamed from: j */
        public Iterator f78190j;

        /* renamed from: e */
        public final AtomicReference f78185e = new AtomicReference();

        /* renamed from: g */
        public final AtomicInteger f78187g = new AtomicInteger();

        /* renamed from: f */
        public final AtomicLong f78186f = new AtomicLong();

        public C13478b(Subscriber subscriber, Func1 func1, int i) {
            this.f78181a = subscriber;
            this.f78182b = func1;
            if (i == Integer.MAX_VALUE) {
                this.f78183c = Long.MAX_VALUE;
                this.f78184d = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);
            } else {
                this.f78183c = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.f78184d = new SpscArrayQueue(i);
                } else {
                    this.f78184d = new SpscAtomicArrayQueue(i);
                }
            }
            request(i);
        }

        /* renamed from: b */
        public boolean m23306b(boolean z, boolean z2, Subscriber subscriber, Queue queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.f78190j = null;
                return true;
            } else if (z) {
                if (((Throwable) this.f78185e.get()) != null) {
                    Throwable terminate = ExceptionsUtils.terminate(this.f78185e);
                    unsubscribe();
                    queue.clear();
                    this.f78190j = null;
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
        public void m23305c() {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OnSubscribeFlattenIterable.C13478b.m23305c():void");
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78188h = true;
            m23305c();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (ExceptionsUtils.addThrowable(this.f78185e, th2)) {
                this.f78188h = true;
                m23305c();
                return;
            }
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78184d.offer(NotificationLite.next(obj))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            m23305c();
        }

        public void requestMore(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                BackpressureUtils.getAndAddRequest(this.f78186f, j);
                m23305c();
            } else if (i >= 0) {
            } else {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeFlattenIterable$c */
    /* loaded from: classes7.dex */
    public static final class C13479c implements Observable.OnSubscribe {

        /* renamed from: a */
        public final Object f78191a;

        /* renamed from: b */
        public final Func1 f78192b;

        public C13479c(Object obj, Func1 func1) {
            this.f78191a = obj;
            this.f78192b = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            try {
                Iterator<T> it = ((Iterable) this.f78192b.call(this.f78191a)).iterator();
                if (!it.hasNext()) {
                    subscriber.onCompleted();
                } else {
                    subscriber.setProducer(new OnSubscribeFromIterable.IterableProducer(subscriber, it));
                }
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber, this.f78191a);
            }
        }
    }

    public OnSubscribeFlattenIterable(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        this.f78176a = observable;
        this.f78177b = func1;
        this.f78178c = i;
    }

    public static <T, R> Observable<R> createFrom(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        if (observable instanceof ScalarSynchronousObservable) {
            return Observable.unsafeCreate(new C13479c(((ScalarSynchronousObservable) observable).get(), func1));
        }
        return Observable.unsafeCreate(new OnSubscribeFlattenIterable(observable, func1, i));
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        C13478b c13478b = new C13478b(subscriber, this.f78177b, this.f78178c);
        subscriber.add(c13478b);
        subscriber.setProducer(new C13477a(c13478b));
        this.f78176a.unsafeSubscribe(c13478b);
    }
}