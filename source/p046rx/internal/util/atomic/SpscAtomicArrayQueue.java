package p046rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: rx.internal.util.atomic.SpscAtomicArrayQueue */
/* loaded from: classes7.dex */
public final class SpscAtomicArrayQueue<E> extends AbstractC10444i7 {

    /* renamed from: e */
    public static final Integer f79245e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a */
    public final AtomicLong f79246a;

    /* renamed from: b */
    public long f79247b;

    /* renamed from: c */
    public final AtomicLong f79248c;

    /* renamed from: d */
    public final int f79249d;

    public SpscAtomicArrayQueue(int i) {
        super(i);
        this.f79246a = new AtomicLong();
        this.f79248c = new AtomicLong();
        this.f79249d = Math.min(i / 4, f79245e.intValue());
    }

    /* renamed from: a */
    public final long m22866a() {
        return this.f79248c.get();
    }

    /* renamed from: b */
    public final long m22865b() {
        return this.f79246a.get();
    }

    /* renamed from: c */
    public final void m22864c(long j) {
        this.f79248c.lazySet(j);
    }

    @Override // p000.AbstractC10444i7, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* renamed from: d */
    public final void m22863d(long j) {
        this.f79246a.lazySet(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (m22865b() == m22866a()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC10444i7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
            int i = this.mask;
            long j = this.f79246a.get();
            int calcElementOffset = calcElementOffset(j, i);
            if (j >= this.f79247b) {
                long j2 = this.f79249d + j;
                if (lvElement(atomicReferenceArray, calcElementOffset(j2, i)) == null) {
                    this.f79247b = j2;
                } else if (lvElement(atomicReferenceArray, calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(atomicReferenceArray, calcElementOffset, e);
            m22863d(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // java.util.Queue
    public E peek() {
        return (E) lvElement(calcElementOffset(this.f79248c.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.f79248c.get();
        int calcElementOffset = calcElementOffset(j);
        AtomicReferenceArray<Object> atomicReferenceArray = this.buffer;
        E e = (E) lvElement(atomicReferenceArray, calcElementOffset);
        if (e == null) {
            return null;
        }
        soElement(atomicReferenceArray, calcElementOffset, null);
        m22864c(j + 1);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long m22866a = m22866a();
        while (true) {
            long m22865b = m22865b();
            long m22866a2 = m22866a();
            if (m22866a == m22866a2) {
                return (int) (m22865b - m22866a2);
            }
            m22866a = m22866a2;
        }
    }
}
