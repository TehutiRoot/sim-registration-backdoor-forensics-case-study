package p046rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: rx.internal.util.atomic.SpscAtomicArrayQueue */
/* loaded from: classes7.dex */
public final class SpscAtomicArrayQueue<E> extends AbstractC10429i7 {

    /* renamed from: e */
    public static final Integer f79451e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a */
    public final AtomicLong f79452a;

    /* renamed from: b */
    public long f79453b;

    /* renamed from: c */
    public final AtomicLong f79454c;

    /* renamed from: d */
    public final int f79455d;

    public SpscAtomicArrayQueue(int i) {
        super(i);
        this.f79452a = new AtomicLong();
        this.f79454c = new AtomicLong();
        this.f79455d = Math.min(i / 4, f79451e.intValue());
    }

    /* renamed from: a */
    public final long m23054a() {
        return this.f79454c.get();
    }

    /* renamed from: b */
    public final long m23053b() {
        return this.f79452a.get();
    }

    /* renamed from: c */
    public final void m23052c(long j) {
        this.f79454c.lazySet(j);
    }

    @Override // p000.AbstractC10429i7, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* renamed from: d */
    public final void m23051d(long j) {
        this.f79452a.lazySet(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (m23053b() == m23054a()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC10429i7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
            int i = this.mask;
            long j = this.f79452a.get();
            int calcElementOffset = calcElementOffset(j, i);
            if (j >= this.f79453b) {
                long j2 = this.f79455d + j;
                if (lvElement(atomicReferenceArray, calcElementOffset(j2, i)) == null) {
                    this.f79453b = j2;
                } else if (lvElement(atomicReferenceArray, calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(atomicReferenceArray, calcElementOffset, e);
            m23051d(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // java.util.Queue
    public E peek() {
        return (E) lvElement(calcElementOffset(this.f79454c.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.f79454c.get();
        int calcElementOffset = calcElementOffset(j);
        AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
        E e = (E) lvElement(atomicReferenceArray, calcElementOffset);
        if (e == null) {
            return null;
        }
        soElement(atomicReferenceArray, calcElementOffset, null);
        m23052c(j + 1);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long m23054a = m23054a();
        while (true) {
            long m23053b = m23053b();
            long m23054a2 = m23054a();
            if (m23054a == m23054a2) {
                return (int) (m23053b - m23054a2);
            }
            m23054a = m23054a2;
        }
    }
}