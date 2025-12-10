package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {

    /* renamed from: a */
    public final ParallelFlowable f65825a;

    /* renamed from: b */
    public final Predicate f65826b;

    /* renamed from: c */
    public final BiFunction f65827c;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11085a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65828a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f65828a = iArr;
            try {
                iArr[ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65828a[ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65828a[ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11086b implements ConditionalSubscriber, Subscription {

        /* renamed from: a */
        public final Predicate f65829a;

        /* renamed from: b */
        public final BiFunction f65830b;

        /* renamed from: c */
        public Subscription f65831c;

        /* renamed from: d */
        public boolean f65832d;

        public AbstractC11086b(Predicate predicate, BiFunction biFunction) {
            this.f65829a = predicate;
            this.f65830b = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f65831c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!tryOnNext(obj) && !this.f65832d) {
                this.f65831c.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f65831c.request(j);
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$c */
    /* loaded from: classes5.dex */
    public static final class C11087c extends AbstractC11086b {

        /* renamed from: e */
        public final ConditionalSubscriber f65833e;

        public C11087c(ConditionalSubscriber conditionalSubscriber, Predicate predicate, BiFunction biFunction) {
            super(predicate, biFunction);
            this.f65833e = conditionalSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65832d) {
                this.f65832d = true;
                this.f65833e.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65832d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65832d = true;
            this.f65833e.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65831c, subscription)) {
                this.f65831c = subscription;
                this.f65833e.onSubscribe(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
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
                boolean r2 = r9.f65832d
                r3 = 0
                if (r2 != 0) goto L67
                r4 = 0
            L9:
                io.reactivex.functions.Predicate r2 = r9.f65829a     // Catch: java.lang.Throwable -> L1c
                boolean r0 = r2.test(r10)     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L1a
                io.reactivex.internal.fuseable.ConditionalSubscriber r0 = r9.f65833e
                boolean r10 = r0.tryOnNext(r10)
                if (r10 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                return r1
            L1c:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.functions.BiFunction r6 = r9.f65830b     // Catch: java.lang.Throwable -> L52
                r7 = 1
                long r4 = r4 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L52
                java.lang.Object r6 = r6.apply(r7, r2)     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L52
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L52
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelFilterTry.C11085a.f65828a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r1) goto L9
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
            L67:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFilterTry.C11087c.tryOnNext(java.lang.Object):boolean");
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$d */
    /* loaded from: classes5.dex */
    public static final class C11088d extends AbstractC11086b {

        /* renamed from: e */
        public final Subscriber f65834e;

        public C11088d(Subscriber subscriber, Predicate predicate, BiFunction biFunction) {
            super(predicate, biFunction);
            this.f65834e = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f65832d) {
                this.f65832d = true;
                this.f65834e.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            if (this.f65832d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65832d = true;
            this.f65834e.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f65831c, subscription)) {
                this.f65831c = subscription;
                this.f65834e.onSubscribe(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
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
                boolean r2 = r9.f65832d
                r3 = 0
                if (r2 != 0) goto L63
                r4 = 0
            L9:
                io.reactivex.functions.Predicate r2 = r9.f65829a     // Catch: java.lang.Throwable -> L18
                boolean r0 = r2.test(r10)     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L17
                org.reactivestreams.Subscriber r0 = r9.f65834e
                r0.onNext(r10)
                return r1
            L17:
                return r3
            L18:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.functions.BiFunction r6 = r9.f65830b     // Catch: java.lang.Throwable -> L4e
                r7 = 1
                long r4 = r4 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L4e
                java.lang.Object r6 = r6.apply(r7, r2)     // Catch: java.lang.Throwable -> L4e
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L4e
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L4e
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelFilterTry.C11085a.f65828a
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r1) goto L9
                if (r6 == r0) goto L4d
                r10 = 3
                if (r6 == r10) goto L47
                r9.cancel()
                r9.onError(r2)
                return r3
            L47:
                r9.cancel()
                r9.onComplete()
            L4d:
                return r3
            L4e:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r4 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
                r0[r3] = r2
                r0[r1] = r10
                r4.<init>(r0)
                r9.onError(r4)
            L63:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelFilterTry.C11088d.tryOnNext(java.lang.Object):boolean");
        }
    }

    public ParallelFilterTry(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate, BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> biFunction) {
        this.f65825a = parallelFlowable;
        this.f65826b = predicate;
        this.f65827c = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.f65825a.parallelism();
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
                subscriberArr2[i] = new C11087c((ConditionalSubscriber) subscriber, this.f65826b, this.f65827c);
            } else {
                subscriberArr2[i] = new C11088d(subscriber, this.f65826b, this.f65827c);
            }
        }
        this.f65825a.subscribe(subscriberArr2);
    }
}