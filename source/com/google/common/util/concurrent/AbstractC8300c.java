package com.google.common.util.concurrent;

import com.google.common.collect.Sets;
import com.google.common.util.concurrent.AbstractFuture;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: com.google.common.util.concurrent.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8300c extends AbstractFuture.AbstractC8187i {

    /* renamed from: j */
    public static final AbstractC8302b f54460j;

    /* renamed from: k */
    public static final C23005xi0 f54461k = new C23005xi0(AbstractC8300c.class);

    /* renamed from: h */
    public volatile Set f54462h = null;

    /* renamed from: i */
    public volatile int f54463i;

    /* renamed from: com.google.common.util.concurrent.c$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8302b {
        public AbstractC8302b() {
        }

        /* renamed from: a */
        public abstract void mo39365a(AbstractC8300c abstractC8300c, Set set, Set set2);

        /* renamed from: b */
        public abstract int mo39364b(AbstractC8300c abstractC8300c);
    }

    /* renamed from: com.google.common.util.concurrent.c$c */
    /* loaded from: classes4.dex */
    public static final class C8303c extends AbstractC8302b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f54464a;

        /* renamed from: b */
        public final AtomicIntegerFieldUpdater f54465b;

        public C8303c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f54464a = atomicReferenceFieldUpdater;
            this.f54465b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AbstractC8300c.AbstractC8302b
        /* renamed from: a */
        public void mo39365a(AbstractC8300c abstractC8300c, Set set, Set set2) {
            AbstractC13055p0.m23740a(this.f54464a, abstractC8300c, set, set2);
        }

        @Override // com.google.common.util.concurrent.AbstractC8300c.AbstractC8302b
        /* renamed from: b */
        public int mo39364b(AbstractC8300c abstractC8300c) {
            return this.f54465b.decrementAndGet(abstractC8300c);
        }
    }

    /* renamed from: com.google.common.util.concurrent.c$d */
    /* loaded from: classes4.dex */
    public static final class C8304d extends AbstractC8302b {
        public C8304d() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC8300c.AbstractC8302b
        /* renamed from: a */
        public void mo39365a(AbstractC8300c abstractC8300c, Set set, Set set2) {
            synchronized (abstractC8300c) {
                try {
                    if (abstractC8300c.f54462h == set) {
                        abstractC8300c.f54462h = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC8300c.AbstractC8302b
        /* renamed from: b */
        public int mo39364b(AbstractC8300c abstractC8300c) {
            int m39371B;
            synchronized (abstractC8300c) {
                m39371B = AbstractC8300c.m39371B(abstractC8300c);
            }
            return m39371B;
        }
    }

    static {
        AbstractC8302b c8304d;
        Throwable th2 = null;
        try {
            c8304d = new C8303c(AtomicReferenceFieldUpdater.newUpdater(AbstractC8300c.class, Set.class, OperatorName.CLOSE_PATH), AtomicIntegerFieldUpdater.newUpdater(AbstractC8300c.class, "i"));
        } catch (Throwable th3) {
            c8304d = new C8304d();
            th2 = th3;
        }
        f54460j = c8304d;
        if (th2 != null) {
            f54461k.m405a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    public AbstractC8300c(int i) {
        this.f54463i = i;
    }

    /* renamed from: B */
    public static /* synthetic */ int m39371B(AbstractC8300c abstractC8300c) {
        int i = abstractC8300c.f54463i - 1;
        abstractC8300c.f54463i = i;
        return i;
    }

    /* renamed from: C */
    public abstract void mo39370C(Set set);

    /* renamed from: D */
    public final void m39369D() {
        this.f54462h = null;
    }

    /* renamed from: E */
    public final int m39368E() {
        return f54460j.mo39364b(this);
    }

    /* renamed from: F */
    public final Set m39367F() {
        Set set = this.f54462h;
        if (set == null) {
            Set newConcurrentHashSet = Sets.newConcurrentHashSet();
            mo39370C(newConcurrentHashSet);
            f54460j.mo39365a(this, null, newConcurrentHashSet);
            Set set2 = this.f54462h;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }
}
