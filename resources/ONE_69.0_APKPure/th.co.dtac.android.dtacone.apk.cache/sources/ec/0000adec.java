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
    public static class C8271b extends AbstractC8273d {

        /* renamed from: b */
        public final Object[] f54435b;

        @Override // com.google.common.util.concurrent.Striped
        public Object getAt(int i) {
            return this.f54435b[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f54435b.length;
        }

        public C8271b(int i, Supplier supplier) {
            super(i);
            int i2 = 0;
            Preconditions.checkArgument(i <= 1073741824, "Stripes must be <= 2^30)");
            this.f54435b = new Object[this.f54439a + 1];
            while (true) {
                Object[] objArr = this.f54435b;
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
    public static class C8272c extends AbstractC8273d {

        /* renamed from: b */
        public final ConcurrentMap f54436b;

        /* renamed from: c */
        public final Supplier f54437c;

        /* renamed from: d */
        public final int f54438d;

        public C8272c(int i, Supplier supplier) {
            super(i);
            int i2;
            int i3 = this.f54439a;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f54438d = i2;
            this.f54437c = supplier;
            this.f54436b = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public Object getAt(int i) {
            if (this.f54438d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            Object obj = this.f54436b.get(Integer.valueOf(i));
            if (obj != null) {
                return obj;
            }
            Object obj2 = this.f54437c.get();
            return MoreObjects.firstNonNull(this.f54436b.putIfAbsent(Integer.valueOf(i), obj2), obj2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f54438d;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$d */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8273d extends Striped {

        /* renamed from: a */
        public final int f54439a;

        public AbstractC8273d(int i) {
            super();
            boolean z;
            int m39399f;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Stripes must be positive");
            if (i > 1073741824) {
                m39399f = -1;
            } else {
                m39399f = Striped.m39399f(i) - 1;
            }
            this.f54439a = m39399f;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final Object get(Object obj) {
            return getAt(mo39392h(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        /* renamed from: h */
        public final int mo39392h(Object obj) {
            return Striped.m39393m(obj.hashCode()) & this.f54439a;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$e */
    /* loaded from: classes4.dex */
    public static class C8274e extends AbstractC8273d {

        /* renamed from: b */
        public final AtomicReferenceArray f54440b;

        /* renamed from: c */
        public final Supplier f54441c;

        /* renamed from: d */
        public final int f54442d;

        /* renamed from: e */
        public final ReferenceQueue f54443e;

        /* renamed from: com.google.common.util.concurrent.Striped$e$a */
        /* loaded from: classes4.dex */
        public static final class C8275a extends WeakReference {

            /* renamed from: a */
            public final int f54444a;

            public C8275a(Object obj, int i, ReferenceQueue referenceQueue) {
                super(obj, referenceQueue);
                this.f54444a = i;
            }
        }

        public C8274e(int i, Supplier supplier) {
            super(i);
            int i2;
            this.f54443e = new ReferenceQueue();
            int i3 = this.f54439a;
            if (i3 == -1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i3 + 1;
            }
            this.f54442d = i2;
            this.f54440b = new AtomicReferenceArray(i2);
            this.f54441c = supplier;
        }

        @Override // com.google.common.util.concurrent.Striped
        public Object getAt(int i) {
            Object obj;
            Object obj2;
            if (this.f54442d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            C8275a c8275a = (C8275a) this.f54440b.get(i);
            if (c8275a == null) {
                obj = null;
            } else {
                obj = c8275a.get();
            }
            if (obj != null) {
                return obj;
            }
            Object obj3 = this.f54441c.get();
            C8275a c8275a2 = new C8275a(obj3, i, this.f54443e);
            while (!AbstractC20952lO1.m26814a(this.f54440b, i, c8275a, c8275a2)) {
                c8275a = (C8275a) this.f54440b.get(i);
                if (c8275a == null) {
                    obj2 = null;
                    continue;
                } else {
                    obj2 = c8275a.get();
                    continue;
                }
                if (obj2 != null) {
                    return obj2;
                }
            }
            m39391n();
            return obj3;
        }

        /* renamed from: n */
        public final void m39391n() {
            while (true) {
                Reference poll = this.f54443e.poll();
                if (poll != null) {
                    C8275a c8275a = (C8275a) poll;
                    AbstractC20952lO1.m26814a(this.f54440b, c8275a.f54444a, c8275a, null);
                } else {
                    return;
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f54442d;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$f */
    /* loaded from: classes4.dex */
    public static final class C8276f extends F40 {

        /* renamed from: a */
        public final Condition f54445a;

        /* renamed from: b */
        public final locksReadWriteLockC8278h f54446b;

        public C8276f(Condition condition, locksReadWriteLockC8278h locksreadwritelockc8278h) {
            this.f54445a = condition;
            this.f54446b = locksreadwritelockc8278h;
        }

        @Override // p000.F40
        /* renamed from: a */
        public Condition mo39390a() {
            return this.f54445a;
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$g */
    /* loaded from: classes4.dex */
    public static final class C8277g extends K40 {

        /* renamed from: a */
        public final Lock f54447a;

        /* renamed from: b */
        public final locksReadWriteLockC8278h f54448b;

        public C8277g(Lock lock, locksReadWriteLockC8278h locksreadwritelockc8278h) {
            this.f54447a = lock;
            this.f54448b = locksreadwritelockc8278h;
        }

        @Override // p000.K40
        /* renamed from: a */
        public Lock mo39389a() {
            return this.f54447a;
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new C8276f(this.f54447a.newCondition(), this.f54448b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$h */
    /* loaded from: classes4.dex */
    public static final class locksReadWriteLockC8278h implements ReadWriteLock {

        /* renamed from: a */
        public final ReadWriteLock f54449a = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new C8277g(this.f54449a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new C8277g(this.f54449a.writeLock(), this);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Semaphore m39404a(int i) {
        return m39395k(i);
    }

    /* renamed from: b */
    public static /* synthetic */ Lock m39403b() {
        return m39397i();
    }

    /* renamed from: c */
    public static /* synthetic */ Semaphore m39402c(int i) {
        return m39396j(i);
    }

    /* renamed from: f */
    public static int m39399f(int i) {
        return 1 << IntMath.log2(i, RoundingMode.CEILING);
    }

    /* renamed from: g */
    public static Striped m39398g(int i, Supplier supplier) {
        return new C8271b(i, supplier);
    }

    /* renamed from: i */
    public static /* synthetic */ Lock m39397i() {
        return new ReentrantLock(false);
    }

    /* renamed from: j */
    public static /* synthetic */ Semaphore m39396j(int i) {
        return new Semaphore(i, false);
    }

    /* renamed from: k */
    public static /* synthetic */ Semaphore m39395k(int i) {
        return new PaddedSemaphore(i);
    }

    /* renamed from: l */
    public static Striped m39394l(int i, Supplier supplier) {
        if (i < 1024) {
            return new C8274e(i, supplier);
        }
        return new C8272c(i, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i) {
        return m39394l(i, new Supplier() { // from class: jO1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m39403b();
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i) {
        return m39394l(i, new Supplier() { // from class: gO1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.locksReadWriteLockC8278h();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i, final int i2) {
        return m39394l(i, new Supplier() { // from class: iO1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m39402c(i2);
            }
        });
    }

    public static Striped<Lock> lock(int i) {
        return m39398g(i, new Supplier() { // from class: com.google.common.util.concurrent.i
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    /* renamed from: m */
    public static int m39393m(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public static Striped<ReadWriteLock> readWriteLock(int i) {
        return m39398g(i, new Supplier() { // from class: kO1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i, final int i2) {
        return m39398g(i, new Supplier() { // from class: hO1
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m39404a(i2);
            }
        });
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList newArrayList = Lists.newArrayList(iterable);
        if (newArrayList.isEmpty()) {
            return ImmutableList.m40987of();
        }
        int[] iArr = new int[newArrayList.size()];
        for (int i = 0; i < newArrayList.size(); i++) {
            iArr[i] = mo39392h(newArrayList.get(i));
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
    public abstract int mo39392h(Object obj);

    public abstract int size();

    public Striped() {
    }
}