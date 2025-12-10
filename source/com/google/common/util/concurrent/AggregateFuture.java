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
public abstract class AggregateFuture extends AbstractC8300c {

    /* renamed from: o */
    public static final C23005xi0 f54242o = new C23005xi0(AggregateFuture.class);

    /* renamed from: l */
    public ImmutableCollection f54243l;

    /* renamed from: m */
    public final boolean f54244m;

    /* renamed from: n */
    public final boolean f54245n;

    /* loaded from: classes4.dex */
    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AggregateFuture(ImmutableCollection immutableCollection, boolean z, boolean z2) {
        super(immutableCollection.size());
        this.f54243l = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
        this.f54244m = z;
        this.f54245n = z2;
    }

    /* renamed from: G */
    public static /* synthetic */ void m39613G(AggregateFuture aggregateFuture, ImmutableCollection immutableCollection) {
        aggregateFuture.m39605Q(immutableCollection);
    }

    /* renamed from: H */
    public static /* synthetic */ void m39612H(AggregateFuture aggregateFuture, int i, ListenableFuture listenableFuture) {
        aggregateFuture.m39606P(i, listenableFuture);
    }

    /* renamed from: I */
    public static boolean m39611I(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    /* renamed from: R */
    public static void m39604R(Throwable th2) {
        String str;
        if (th2 instanceof Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        f54242o.m405a().log(Level.SEVERE, str, th2);
    }

    @Override // com.google.common.util.concurrent.AbstractC8300c
    /* renamed from: C */
    public final void mo39370C(Set set) {
        Preconditions.checkNotNull(set);
        if (!isCancelled()) {
            Throwable tryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
            Objects.requireNonNull(tryInternalFastPathGetFailure);
            m39611I(set, tryInternalFastPathGetFailure);
        }
    }

    /* renamed from: J */
    public abstract void mo39363J(int i, Object obj);

    /* renamed from: K */
    public final void m39610K(int i, Future future) {
        try {
            mo39363J(i, Uninterruptibles.getUninterruptibly(future));
        } catch (ExecutionException e) {
            m39608N(e.getCause());
        } catch (Throwable th2) {
            m39608N(th2);
        }
    }

    /* renamed from: L */
    public final void m39605Q(ImmutableCollection immutableCollection) {
        boolean z;
        int m39368E = m39368E();
        if (m39368E >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Less than 0 remaining futures");
        if (m39368E == 0) {
            m39602T(immutableCollection);
        }
    }

    /* renamed from: M */
    public abstract void mo39362M();

    /* renamed from: N */
    public final void m39608N(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (this.f54244m && !setException(th2) && m39611I(m39367F(), th2)) {
            m39604R(th2);
        } else if (th2 instanceof Error) {
            m39604R(th2);
        }
    }

    /* renamed from: O */
    public final void m39607O() {
        final ImmutableCollection immutableCollection;
        Objects.requireNonNull(this.f54243l);
        if (this.f54243l.isEmpty()) {
            mo39362M();
        } else if (this.f54244m) {
            UnmodifiableIterator it = this.f54243l.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    m39606P(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: A2
                        {
                            AggregateFuture.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AggregateFuture.m39612H(AggregateFuture.this, i, listenableFuture);
                        }
                    }, MoreExecutors.directExecutor());
                }
                i = i2;
            }
        } else {
            if (this.f54245n) {
                immutableCollection = this.f54243l;
            } else {
                immutableCollection = null;
            }
            Runnable runnable = new Runnable() { // from class: B2
                @Override // java.lang.Runnable
                public final void run() {
                    AggregateFuture.m39613G(AggregateFuture.this, immutableCollection);
                }
            };
            UnmodifiableIterator it2 = this.f54243l.iterator();
            while (it2.hasNext()) {
                ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
                if (listenableFuture2.isDone()) {
                    m39605Q(immutableCollection);
                } else {
                    listenableFuture2.addListener(runnable, MoreExecutors.directExecutor());
                }
            }
        }
    }

    /* renamed from: S */
    public final void m39606P(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.f54243l = null;
                cancel(false);
            } else {
                m39610K(i, listenableFuture);
            }
            m39605Q(null);
        } catch (Throwable th2) {
            m39605Q(null);
            throw th2;
        }
    }

    /* renamed from: T */
    public final void m39602T(ImmutableCollection immutableCollection) {
        if (immutableCollection != null) {
            UnmodifiableIterator it = immutableCollection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future future = (Future) it.next();
                if (!future.isCancelled()) {
                    m39610K(i, future);
                }
                i++;
            }
        }
        m39369D();
        mo39362M();
        mo39361U(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    /* renamed from: U */
    public void mo39361U(ReleaseResourcesReason releaseResourcesReason) {
        Preconditions.checkNotNull(releaseResourcesReason);
        this.f54243l = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        boolean z;
        super.afterDone();
        ImmutableCollection immutableCollection = this.f54243l;
        mo39361U(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
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
        ImmutableCollection immutableCollection = this.f54243l;
        if (immutableCollection != null) {
            return "futures=" + immutableCollection;
        }
        return super.pendingToString();
    }
}
