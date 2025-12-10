package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelDoOnNextTry<T> extends ParallelFlowable<T> {

    /* renamed from: a */
    public final ParallelFlowable f65741a;

    /* renamed from: b */
    public final Consumer f65742b;

    /* renamed from: c */
    public final BiFunction f65743c;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11092a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65744a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f65744a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65744a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65744a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$b */
    /* loaded from: classes5.dex */
    public static final class C11093b implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final ConditionalSubscriber f65745a;

        /* renamed from: b */
        public final Consumer f65746b;

        /* renamed from: c */
        public final BiFunction f65747c;

        /* renamed from: d */
        public Subscription f65748d;

        /* renamed from: e */
        public boolean f65749e;

        public C11093b(ConditionalSubscriber conditionalSubscriber, Consumer consumer, BiFunction biFunction) {
            this.f65745a = conditionalSubscriber;
            this.f65746b = consumer;
            this.f65747c = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65748d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65749e) {
                return;
            }
            this.f65749e = true;
            this.f65745a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65749e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65749e = true;
            this.f65745a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj) && !this.f65749e) {
                this.f65748d.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65748d, subscription)) {
                this.f65748d = subscription;
                this.f65745a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65748d.request(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 2
                r1 = 1
                boolean r2 = r9.f65749e
                r3 = 0
                if (r2 == 0) goto L8
                return r3
            L8:
                r4 = 0
            La:
                io.reactivex.functions.Consumer r2 = r9.f65746b     // Catch: java.lang.Throwable -> L16
                r2.accept(r10)     // Catch: java.lang.Throwable -> L16
                io.reactivex.internal.fuseable.ConditionalSubscriber r0 = r9.f65745a
                boolean r10 = r0.tryOnNext(r10)
                return r10
            L16:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.functions.BiFunction r6 = r9.f65747c     // Catch: java.lang.Throwable -> L4c
                r7 = 1
                long r4 = r4 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r6 = r6.apply(r7, r2)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L4c
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L4c
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C11092a.f65744a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r1) goto La
                if (r6 == r0) goto L4b
                r10 = 3
                if (r6 == r10) goto L45
                r9.cancel()
                r9.onError(r2)
                return r3
            L45:
                r9.cancel()
                r9.onComplete()
            L4b:
                return r3
            L4c:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
                r0[r3] = r2
                r0[r1] = r10
                r4.<init>(r0)
                r9.onError(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C11093b.tryOnNext(java.lang.Object):boolean");
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$c */
    /* loaded from: classes5.dex */
    public static final class C11094c implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f65750a;

        /* renamed from: b */
        public final Consumer f65751b;

        /* renamed from: c */
        public final BiFunction f65752c;

        /* renamed from: d */
        public Subscription f65753d;

        /* renamed from: e */
        public boolean f65754e;

        public C11094c(Subscriber subscriber, Consumer consumer, BiFunction biFunction) {
            this.f65750a = subscriber;
            this.f65751b = consumer;
            this.f65752c = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65753d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65754e) {
                return;
            }
            this.f65754e = true;
            this.f65750a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65754e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65754e = true;
            this.f65750a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj)) {
                this.f65753d.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65753d, subscription)) {
                this.f65753d = subscription;
                this.f65750a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65753d.request(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tryOnNext(java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 2
                r1 = 1
                boolean r2 = r9.f65754e
                r3 = 0
                if (r2 == 0) goto L8
                return r3
            L8:
                r4 = 0
            La:
                io.reactivex.functions.Consumer r2 = r9.f65751b     // Catch: java.lang.Throwable -> L15
                r2.accept(r10)     // Catch: java.lang.Throwable -> L15
                org.reactivestreams.Subscriber r0 = r9.f65750a
                r0.onNext(r10)
                return r1
            L15:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.functions.BiFunction r6 = r9.f65752c     // Catch: java.lang.Throwable -> L4b
                r7 = 1
                long r4 = r4 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r6 = r6.apply(r7, r2)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L4b
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L4b
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C11092a.f65744a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r1) goto La
                if (r6 == r0) goto L4a
                r10 = 3
                if (r6 == r10) goto L44
                r9.cancel()
                r9.onError(r2)
                return r3
            L44:
                r9.cancel()
                r9.onComplete()
            L4a:
                return r3
            L4b:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
                r0[r3] = r2
                r0[r1] = r10
                r4.<init>(r0)
                r9.onError(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C11094c.tryOnNext(java.lang.Object):boolean");
        }
    }

    public ParallelDoOnNextTry(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f65741a = parallelFlowable;
        this.f65742b = consumer;
        this.f65743c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65741a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            Subscriber<? super T> subscriber = subscriberArr[i];
            if (subscriber instanceof ConditionalSubscriber) {
                subscriberArr2[i] = new C11093b((ConditionalSubscriber) subscriber, this.f65742b, this.f65743c);
            } else {
                subscriberArr2[i] = new C11094c(subscriber, this.f65742b, this.f65743c);
            }
        }
        this.f65741a.subscribe(subscriberArr2);
    }
}
