package p046rx.internal.util.unsafe;

import java.util.Iterator;
import p046rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.SpscUnboundedArrayQueue */
/* loaded from: classes7.dex */
public class SpscUnboundedArrayQueue<E> extends NK1 implements QueueProgressIndicators {

    /* renamed from: b */
    public static final long f79275b;

    /* renamed from: c */
    public static final long f79276c;

    /* renamed from: d */
    public static final long f79277d;

    /* renamed from: e */
    public static final int f79278e;

    /* renamed from: a */
    public static final int f79274a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: f */
    public static final Object f79279f = new Object();

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        int arrayIndexScale = unsafe.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f79278e = 2;
        } else if (8 == arrayIndexScale) {
            f79278e = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        f79277d = unsafe.arrayBaseOffset(Object[].class);
        try {
            f79275b = unsafe.objectFieldOffset(QK1.class.getDeclaredField("producerIndex"));
            try {
                f79276c = unsafe.objectFieldOffset(NK1.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e) {
                InternalError internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (NoSuchFieldException e2) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e2);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        long j = roundToPowerOfTwo - 1;
        Object[] objArr = new Object[roundToPowerOfTwo + 1];
        this.producerBuffer = objArr;
        this.producerMask = j;
        m22826a(roundToPowerOfTwo);
        this.consumerBuffer = objArr;
        this.consumerMask = j;
        this.producerLookAhead = j - 1;
        m22813n(0L);
    }

    /* renamed from: b */
    public static long m22825b(long j) {
        return f79277d + (j << f79278e);
    }

    /* renamed from: c */
    public static long m22824c(long j, long j2) {
        return m22825b(j & j2);
    }

    /* renamed from: e */
    public static Object m22822e(Object[] objArr, long j) {
        return UnsafeAccess.UNSAFE.getObjectVolatile(objArr, j);
    }

    /* renamed from: l */
    public static void m22815l(Object[] objArr, long j, Object obj) {
        UnsafeAccess.UNSAFE.putOrderedObject(objArr, j, obj);
    }

    /* renamed from: a */
    public final void m22826a(int i) {
        this.producerLookAheadStep = Math.min(i / 4, f79274a);
    }

    @Override // p046rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return m22823d();
    }

    @Override // p046rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return m22820g();
    }

    /* renamed from: d */
    public final long m22823d() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, f79276c);
    }

    /* renamed from: f */
    public final Object[] m22821f(Object[] objArr) {
        return (Object[]) m22822e(objArr, m22825b(objArr.length - 1));
    }

    /* renamed from: g */
    public final long m22820g() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, f79275b);
    }

    /* renamed from: h */
    public final Object m22819h(Object[] objArr, long j, long j2) {
        this.consumerBuffer = objArr;
        return m22822e(objArr, m22824c(j, j2));
    }

    /* renamed from: i */
    public final Object m22818i(Object[] objArr, long j, long j2) {
        this.consumerBuffer = objArr;
        long m22824c = m22824c(j, j2);
        Object m22822e = m22822e(objArr, m22824c);
        if (m22822e == null) {
            return null;
        }
        m22815l(objArr, m22824c, null);
        m22816k(j + 1);
        return m22822e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public final void m22817j(Object[] objArr, long j, long j2, Object obj, long j3) {
        Object[] objArr2 = new Object[objArr.length];
        this.producerBuffer = objArr2;
        this.producerLookAhead = (j3 + j) - 1;
        m22815l(objArr2, j2, obj);
        m22814m(objArr, objArr2);
        m22815l(objArr, j2, f79279f);
        m22813n(j + 1);
    }

    /* renamed from: k */
    public final void m22816k(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, f79276c, j);
    }

    /* renamed from: m */
    public final void m22814m(Object[] objArr, Object[] objArr2) {
        m22815l(objArr, m22825b(objArr.length - 1), objArr2);
    }

    /* renamed from: n */
    public final void m22813n(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, f79275b, j);
    }

    /* renamed from: o */
    public final boolean m22812o(Object[] objArr, Object obj, long j, long j2) {
        m22815l(objArr, j2, obj);
        m22813n(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e != null) {
            Object[] objArr = this.producerBuffer;
            long j = this.producerIndex;
            long j2 = this.producerMask;
            long m22824c = m22824c(j, j2);
            if (j < this.producerLookAhead) {
                return m22812o(objArr, e, j, m22824c);
            }
            long j3 = this.producerLookAheadStep + j;
            if (m22822e(objArr, m22824c(j3, j2)) == null) {
                this.producerLookAhead = j3 - 1;
                return m22812o(objArr, e, j, m22824c);
            } else if (m22822e(objArr, m22824c(1 + j, j2)) != null) {
                return m22812o(objArr, e, j, m22824c);
            } else {
                m22817j(objArr, j, m22824c, e, j2);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // java.util.Queue
    public final E peek() {
        Object[] objArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        E e = (E) m22822e(objArr, m22824c(j, j2));
        if (e == f79279f) {
            return (E) m22819h(m22821f(objArr), j, j2);
        }
        return e;
    }

    @Override // java.util.Queue
    public final E poll() {
        boolean z;
        Object[] objArr = this.consumerBuffer;
        long j = this.consumerIndex;
        long j2 = this.consumerMask;
        long m22824c = m22824c(j, j2);
        E e = (E) m22822e(objArr, m22824c);
        if (e == f79279f) {
            z = true;
        } else {
            z = false;
        }
        if (e != null && !z) {
            m22815l(objArr, m22824c, null);
            m22816k(j + 1);
            return e;
        } else if (!z) {
            return null;
        } else {
            return (E) m22818i(m22821f(objArr), j, j2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long m22823d = m22823d();
        while (true) {
            long m22820g = m22820g();
            long m22823d2 = m22823d();
            if (m22823d == m22823d2) {
                return (int) (m22820g - m22823d2);
            }
            m22823d = m22823d2;
        }
    }
}
