package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class AggregateFuture extends AbstractC8289c {

    /* renamed from: o */
    public static final C17503Di0 f54254o = new C17503Di0(AggregateFuture.class);

    /* renamed from: l */
    public ImmutableCollection f54255l;

    /* renamed from: m */
    public final boolean f54256m;

    /* renamed from: n */
    public final boolean f54257n;

    /* loaded from: classes4.dex */
    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AggregateFuture(ImmutableCollection immutableCollection, boolean z, boolean z2) {
        super(immutableCollection.size());
        this.f54255l = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.f54256m = z;
        this.f54257n = z2;
    }

    /* renamed from: G */
    public static /* synthetic */ void m39605G(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
        aggregateFuture.m39597Q(immutableCollection);
    }

    /* renamed from: H */
    public static /* synthetic */ void m39604H(AggregateFuture aggregateFuture, int i, ListenableFuture listenableFuture) {
        aggregateFuture.m39598P(i, listenableFuture);
    }

    /* renamed from: I */
    public static boolean m39603I(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    /* renamed from: R */
    public static void m39596R(Throwable th2) {
        String str;
        if (th2 instanceof Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        f54254o.m68797a().log(Level.SEVERE, str, th2);
    }

    @Override // com.google.common.util.concurrent.AbstractC8289c
    /* renamed from: C */
    public final void mo39362C(Set set) {
        Preconditions.checkNotNull(set);
        if (!isCancelled()) {
            Throwable tryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
            Objects.requireNonNull(tryInternalFastPathGetFailure);
            m39603I(set, tryInternalFastPathGetFailure);
        }
    }

    /* renamed from: J */
    public abstract void mo39355J(int i, Object obj);

    /* renamed from: K */
    public final void m39602K(int i, Future future) {
        try {
            mo39355J(i, Uninterruptibles.getUninterruptibly(future));
        } catch (ExecutionException e) {
            m39600N(e.getCause());
        } catch (Throwable th2) {
            m39600N(th2);
        }
    }

    /* renamed from: L */
    public final void m39597Q(ImmutableCollection immutableCollection) {
        boolean z;
        int m39360E = m39360E();
        if (m39360E >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Less than 0 remaining futures");
        if (m39360E == 0) {
            m39594T(immutableCollection);
        }
    }

    /* renamed from: M */
    public abstract void mo39354M();

    /* renamed from: N */
    public final void m39600N(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (this.f54256m && !setException(th2) && m39603I(m39359F(), th2)) {
            m39596R(th2);
        } else if (th2 instanceof Error) {
            m39596R(th2);
        }
    }

    /* renamed from: O */
    public final void m39599O() {
        final ImmutableCollection immutableCollection;
        Objects.requireNonNull(this.f54255l);
        if (this.f54255l.isEmpty()) {
            mo39354M();
        } else if (this.f54256m) {
            UnmodifiableIterator it = this.f54255l.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    m39598P(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: A2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AggregateFuture.m39604H(AggregateFuture.this, i, listenableFuture);
                        }
                    }, MoreExecutors.directExecutor());
                }
                i = i2;
            }
        } else {
            if (this.f54257n) {
                immutableCollection = this.f54255l;
            } else {
                immutableCollection = null;
            }
            Runnable runnable = new Runnable() { // from class: B2
                @Override // java.lang.Runnable
                public final void run() {
                    AggregateFuture.m39605G(AggregateFuture.this, immutableCollection);
                }
            };
            UnmodifiableIterator it2 = this.f54255l.iterator();
            while (it2.hasNext()) {
                ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
                if (listenableFuture2.isDone()) {
                    m39597Q(immutableCollection);
                } else {
                    listenableFuture2.addListener(runnable, MoreExecutors.directExecutor());
                }
            }
        }
    }

    /* renamed from: S */
    public final void m39598P(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f54255l = null;
                cancel(false);
            } else {
                m39602K(i, listenableFuture);
            }
            m39597Q(null);
        } catch (Throwable th2) {
            m39597Q(null);
            throw th2;
        }
    }

    /* renamed from: T */
    public final void m39594T(ImmutableCollection immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator it = immutableCollection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future future = (Future) it.next();
                if (!future.isCancelled()) {
                    m39602K(i, future);
                }
                i++;
            }
        }
        m39361D();
        mo39354M();
        mo39353U(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    /* renamed from: U */
    public void mo39353U(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.f54255l = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        boolean z;
        super.afterDone();
        ImmutableCollection immutableCollection = this.f54255l;
        mo39353U(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        boolean isCancelled = isCancelled();
        if (immutableCollection != null) {
            z = true;
        } else {
            z = false;
        }
        if (isCancelled & z) {
            boolean wasInterrupted = wasInterrupted();
            UnmodifiableIterator it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(wasInterrupted);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        ImmutableCollection immutableCollection = this.f54255l;
        if (immutableCollection != null) {
            return "futures=" + immutableCollection;
        }
        return super.pendingToString();
    }
}