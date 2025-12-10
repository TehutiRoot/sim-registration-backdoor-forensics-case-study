package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import com.google.common.util.concurrent.Striped;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class Striped<L> {

    /* loaded from: classes4.dex */
    public static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    /* loaded from: classes4.dex */
    public static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        public PaddedSemaphore(int i) {
            super(i, false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$b */
    /* loaded from: classes4.dex */
    public static class C8282b extends AbstractC8284d {

        /* renamed from: b */
        public final Object[] f54423b;

        @Override // com.google.common.util.concurrent.Striped
        public Object getAt(int i) {
            return this.f54423b[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f54423b.length;
        }

        public C8282b(int i, Supplier supplier) {
            super(i);
            int i2 = 0;
            Preconditions.checkArgument(i <= 1073741824, "Stripes must be <= 2^30)");
            this.f54423b = new Object[this.f54427a + 1];
            while (true) {
                Object[] objArr = this.f54423b;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = supplier.get();
                i2++;
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$c */
    /* loaded from: classes4.dex */
    public static class C8283c extends AbstractC8284d {

        /* renamed from: b */
        public final ConcurrentMap f54424b;

        /* renamed from: c */
        public final Supplier f54425c;

        /* renamed from: d */
        public final int f54426d;

        public C8283c(int i, Supplier supplier) {
            super(i);
            int i2;
            int i3 = this.f54427a;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f54426d = i2;
            this.f54425c = supplier;
            this.f54424b = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public Object getAt(int i) {
            if (this.f54426d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            Object obj = this.f54424b.get(Integer.valueOf(i));
            if (obj != null) {
                return obj;
            }
            Object obj2 = this.f54425c.get();
            return MoreObjects.firstNonNull(this.f54424b.putIfAbsent(Integer.valueOf(i), obj2), obj2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f54426d;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$d */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8284d extends Striped {

        /* renamed from: a */
        public final int f54427a;

        public AbstractC8284d(int i) {
            super();
            boolean z;
            int m39407f;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Stripes must be positive");
            if (i > 1073741824) {
                m39407f = -1;
            } else {
                m39407f = Striped.m39407f(i) - 1;
            }
            this.f54427a = m39407f;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final Object get(Object obj) {
            return getAt(mo39400h(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        /* renamed from: h */
        public final int mo39400h(Object obj) {
            return Striped.m39401m(obj.hashCode()) & this.f54427a;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$e */
    /* loaded from: classes4.dex */
    public static class C8285e extends AbstractC8284d {

        /* renamed from: b */
        public final AtomicReferenceArray f54428b;

        /* renamed from: c */
        public final Supplier f54429c;

        /* renamed from: d */
        public final int f54430d;

        /* renamed from: e */
        public final ReferenceQueue f54431e;

        /* renamed from: com.google.common.util.concurrent.Striped$e$a */
        /* loaded from: classes4.dex */
        public static final class C8286a extends WeakReference {

            /* renamed from: a */
            public final int f54432a;

            public C8286a(Object obj, int i, ReferenceQueue referenceQueue) {
                super(obj, referenceQueue);
                this.f54432a = i;
            }
        }

        public C8285e(int i, Supplier supplier) {
            super(i);
            int i2;
            this.f54431e = new ReferenceQueue();
            int i3 = this.f54427a;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f54430d = i2;
            this.f54428b = new AtomicReferenceArray(i2);
            this.f54429c = supplier;
        }

        @Override // com.google.common.util.concurrent.Striped
        public Object getAt(int i) {
            Object obj;
            Object obj2;
            if (this.f54430d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            C8286a c8286a = (C8286a) this.f54428b.get(i);
            if (c8286a == null) {
                obj = null;
            } else {
                obj = c8286a.get();
            }
            if (obj != null) {
                return obj;
            }
            Object obj3 = this.f54429c.get();
            C8286a c8286a2 = new C8286a(obj3, i, this.f54431e);
            while (!AbstractC21408oN1.m25928a(this.f54428b, i, c8286a, c8286a2)) {
                c8286a = (C8286a) this.f54428b.get(i);
                if (c8286a == null) {
                    obj2 = null;
                    continue;
                } else {
                    obj2 = c8286a.get();
                    continue;
                }
                if (obj2 != null) {
                    return obj2;
                }
            }
            m39399n();
            return obj3;
        }

        /* renamed from: n */
        public final void m39399n() {
            while (true) {
                Reference poll = this.f54431e.poll();
                if (poll != null) {
                    C8286a c8286a = (C8286a) poll;
                    AbstractC21408oN1.m25928a(this.f54428b, c8286a.f54432a, c8286a, null);
                } else {
                    return;
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f54430d;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$f */
    /* loaded from: classes4.dex */
    public static final class C8287f extends B40 {

        /* renamed from: a */
        public final Condition f54433a;

        /* renamed from: b */
        public final locksReadWriteLockC8289h f54434b;

        public C8287f(Condition condition, locksReadWriteLockC8289h locksreadwritelockc8289h) {
            this.f54433a = condition;
            this.f54434b = locksreadwritelockc8289h;
        }

        @Override // p000.B40
        /* renamed from: a */
        public Condition mo39398a() {
            return this.f54433a;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$g */
    /* loaded from: classes4.dex */
    public static final class C8288g extends G40 {

        /* renamed from: a */
        public final Lock f54435a;

        /* renamed from: b */
        public final locksReadWriteLockC8289h f54436b;

        public C8288g(Lock lock, locksReadWriteLockC8289h locksreadwritelockc8289h) {
            this.f54435a = lock;
            this.f54436b = locksreadwritelockc8289h;
        }

        @Override // p000.G40
        /* renamed from: a */
        public Lock mo39397a() {
            return this.f54435a;
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new C8287f(this.f54435a.newCondition(), this.f54436b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$h */
    /* loaded from: classes4.dex */
    public static final class locksReadWriteLockC8289h implements ReadWriteLock {

        /* renamed from: a */
        public final ReadWriteLock f54437a = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new C8288g(this.f54437a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new C8288g(this.f54437a.writeLock(), this);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Semaphore m39412a(int i) {
        return m39403k(i);
    }

    /* renamed from: b */
    public static /* synthetic */ Lock m39411b() {
        return m39405i();
    }

    /* renamed from: c */
    public static /* synthetic */ Semaphore m39410c(int i) {
        return m39404j(i);
    }

    /* renamed from: f */
    public static int m39407f(int i) {
        return 1 << IntMath.log2(i, RoundingMode.CEILING);
    }

    /* renamed from: g */
    public static Striped m39406g(int i, Supplier supplier) {
        return new C8282b(i, supplier);
    }

    /* renamed from: i */
    public static /* synthetic */ Lock m39405i() {
        return new ReentrantLock(false);
    }

    /* renamed from: j */
    public static /* synthetic */ Semaphore m39404j(int i) {
        return new Semaphore(i, false);
    }

    /* renamed from: k */
    public static /* synthetic */ Semaphore m39403k(int i) {
        return new PaddedSemaphore(i);
    }

    /* renamed from: l */
    public static Striped m39402l(int i, Supplier supplier) {
        if (i < 1024) {
            return new C8285e(i, supplier);
        }
        return new C8283c(i, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i) {
        return m39402l(i, new Supplier() { // from class: mN1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m39411b();
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i) {
        return m39402l(i, new Supplier() { // from class: jN1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.locksReadWriteLockC8289h();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i, final int i2) {
        return m39402l(i, new Supplier() { // from class: lN1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m39410c(i2);
            }
        });
    }

    public static Striped<Lock> lock(int i) {
        return m39406g(i, new Supplier() { // from class: com.google.common.util.concurrent.i
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    /* renamed from: m */
    public static int m39401m(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public static Striped<ReadWriteLock> readWriteLock(int i) {
        return m39406g(i, new Supplier() { // from class: nN1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i, final int i2) {
        return m39406g(i, new Supplier() { // from class: kN1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m39412a(i2);
            }
        });
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList newArrayList = Lists.newArrayList(iterable);
        if (newArrayList.isEmpty()) {
            return ImmutableList.m40998of();
        }
        int[] iArr = new int[newArrayList.size()];
        for (int i = 0; i < newArrayList.size(); i++) {
            iArr[i] = mo39400h(newArrayList.get(i));
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        newArrayList.set(0, getAt(i2));
        for (int i3 = 1; i3 < newArrayList.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                newArrayList.set(i3, newArrayList.get(i3 - 1));
            } else {
                newArrayList.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(newArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i);

    /* renamed from: h */
    public abstract int mo39400h(Object obj);

    public abstract int size();

    public Striped() {
    }
}
