package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {

    /* renamed from: a */
    public final ParallelFlowable f65797a;

    /* renamed from: b */
    public final Function f65798b;

    /* renamed from: c */
    public final BiFunction f65799c;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11105a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65800a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f65800a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65800a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65800a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$b */
    /* loaded from: classes5.dex */
    public static final class C11106b implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final ConditionalSubscriber f65801a;

        /* renamed from: b */
        public final Function f65802b;

        /* renamed from: c */
        public final BiFunction f65803c;

        /* renamed from: d */
        public Subscription f65804d;

        /* renamed from: e */
        public boolean f65805e;

        public C11106b(ConditionalSubscriber conditionalSubscriber, Function function, BiFunction biFunction) {
            this.f65801a = conditionalSubscriber;
            this.f65802b = function;
            this.f65803c = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65804d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65805e) {
                return;
            }
            this.f65805e = true;
            this.f65801a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65805e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65805e = true;
            this.f65801a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj) && !this.f65805e) {
                this.f65804d.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65804d, subscription)) {
                this.f65804d = subscription;
                this.f65801a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65804d.request(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
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
                boolean r2 = r9.f65805e
                r3 = 0
                if (r2 == 0) goto L8
                return r3
            L8:
                r4 = 0
            La:
                io.reactivex.functions.Function r2 = r9.f65802b     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r2 = r2.apply(r10)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r6 = "The mapper returned a null value"
                java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r6)     // Catch: java.lang.Throwable -> L1d
                io.reactivex.internal.fuseable.ConditionalSubscriber r0 = r9.f65801a
                boolean r10 = r0.tryOnNext(r10)
                return r10
            L1d:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.functions.BiFunction r6 = r9.f65803c     // Catch: java.lang.Throwable -> L53
                r7 = 1
                long r4 = r4 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L53
                java.lang.Object r6 = r6.apply(r7, r2)     // Catch: java.lang.Throwable -> L53
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L53
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L53
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelMapTry.C11105a.f65800a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r1) goto La
                if (r6 == r0) goto L52
                r10 = 3
                if (r6 == r10) goto L4c
                r9.cancel()
                r9.onError(r2)
                return r3
            L4c:
                r9.cancel()
                r9.onComplete()
            L52:
                return r3
            L53:
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelMapTry.C11106b.tryOnNext(java.lang.Object):boolean");
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$c */
    /* loaded from: classes5.dex */
    public static final class C11107c implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final Subscriber f65806a;

        /* renamed from: b */
        public final Function f65807b;

        /* renamed from: c */
        public final BiFunction f65808c;

        /* renamed from: d */
        public Subscription f65809d;

        /* renamed from: e */
        public boolean f65810e;

        public C11107c(Subscriber subscriber, Function function, BiFunction biFunction) {
            this.f65806a = subscriber;
            this.f65807b = function;
            this.f65808c = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f65809d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f65810e) {
                return;
            }
            this.f65810e = true;
            this.f65806a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65810e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65810e = true;
            this.f65806a.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!tryOnNext(obj) && !this.f65810e) {
                this.f65809d.request(1L);
            }
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65809d, subscription)) {
                this.f65809d = subscription;
                this.f65806a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.f65809d.request(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
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
                boolean r2 = r9.f65810e
                r3 = 0
                if (r2 == 0) goto L8
                return r3
            L8:
                r4 = 0
            La:
                io.reactivex.functions.Function r2 = r9.f65807b     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r2 = r2.apply(r10)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r6 = "The mapper returned a null value"
                java.lang.Object r10 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r6)     // Catch: java.lang.Throwable -> L1c
                org.reactivestreams.Subscriber r0 = r9.f65806a
                r0.onNext(r10)
                return r1
            L1c:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.functions.BiFunction r6 = r9.f65808c     // Catch: java.lang.Throwable -> L52
                r7 = 1
                long r4 = r4 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L52
                java.lang.Object r6 = r6.apply(r7, r2)     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L52
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L52
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelMapTry.C11105a.f65800a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r1) goto La
                if (r6 == r0) goto L51
                r10 = 3
                if (r6 == r10) goto L4b
                r9.cancel()
                r9.onError(r2)
                return r3
            L4b:
                r9.cancel()
                r9.onComplete()
            L51:
                return r3
            L52:
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelMapTry.C11107c.tryOnNext(java.lang.Object):boolean");
        }
    }

    public ParallelMapTry(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f65797a = parallelFlowable;
        this.f65798b = function;
        this.f65799c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65797a.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (!validate(subscriberArr)) {
            return;
        }
        int length = subscriberArr.length;
        Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
        for (int i = 0; i < length; i++) {
            Subscriber<? super R> subscriber = subscriberArr[i];
            if (subscriber instanceof ConditionalSubscriber) {
                subscriberArr2[i] = new C11106b((ConditionalSubscriber) subscriber, this.f65798b, this.f65799c);
            } else {
                subscriberArr2[i] = new C11107c(subscriber, this.f65798b, this.f65799c);
            }
        }
        this.f65797a.subscribe(subscriberArr2);
    }
}
