package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: dH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19549dH2 {

    /* renamed from: a */
    public static final Unsafe f61177a;

    /* renamed from: b */
    public static final Class f61178b;

    /* renamed from: c */
    public static final boolean f61179c;

    /* renamed from: d */
    public static final boolean f61180d;

    /* renamed from: e */
    public static final AbstractC10057d f61181e;

    /* renamed from: f */
    public static final boolean f61182f;

    /* renamed from: g */
    public static final boolean f61183g;

    /* renamed from: h */
    public static final long f61184h;

    /* renamed from: i */
    public static final long f61185i;

    /* renamed from: j */
    public static final long f61186j;

    /* renamed from: k */
    public static final long f61187k;

    /* renamed from: l */
    public static final long f61188l;

    /* renamed from: m */
    public static final long f61189m;

    /* renamed from: n */
    public static final long f61190n;

    /* renamed from: o */
    public static final long f61191o;

    /* renamed from: p */
    public static final long f61192p;

    /* renamed from: q */
    public static final long f61193q;

    /* renamed from: r */
    public static final long f61194r;

    /* renamed from: s */
    public static final long f61195s;

    /* renamed from: t */
    public static final long f61196t;

    /* renamed from: u */
    public static final long f61197u;

    /* renamed from: v */
    public static final int f61198v;

    /* renamed from: w */
    public static final boolean f61199w;

    /* renamed from: dH2$a */
    /* loaded from: classes3.dex */
    public static final class C10054a extends AbstractC10057d {
        public C10054a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: a */
        public final byte mo31865a(Object obj, long j) {
            return AbstractC19549dH2.f61199w ? AbstractC19549dH2.m31895L(obj, j) : AbstractC19549dH2.m31894M(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: b */
        public final void mo31864b(Object obj, long j, byte b) {
            if (AbstractC19549dH2.f61199w) {
                AbstractC19549dH2.m31871u(obj, j, b);
            } else {
                AbstractC19549dH2.m31867y(obj, j, b);
            }
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: c */
        public final void mo31863c(Object obj, long j, double d) {
            m31860f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: d */
        public final void mo31862d(Object obj, long j, float f) {
            m31861e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: g */
        public final void mo31859g(Object obj, long j, boolean z) {
            if (AbstractC19549dH2.f61199w) {
                AbstractC19549dH2.m31866z(obj, j, z);
            } else {
                AbstractC19549dH2.m31903D(obj, j, z);
            }
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: h */
        public final boolean mo31858h(Object obj, long j) {
            return AbstractC19549dH2.f61199w ? AbstractC19549dH2.m31893N(obj, j) : AbstractC19549dH2.m31892O(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: i */
        public final float mo31857i(Object obj, long j) {
            return Float.intBitsToFloat(m31855k(obj, j));
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: j */
        public final double mo31856j(Object obj, long j) {
            return Double.longBitsToDouble(m31854l(obj, j));
        }
    }

    /* renamed from: dH2$b */
    /* loaded from: classes3.dex */
    public static final class C10055b extends AbstractC10057d {
        public C10055b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: a */
        public final byte mo31865a(Object obj, long j) {
            return this.f61200a.getByte(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: b */
        public final void mo31864b(Object obj, long j, byte b) {
            this.f61200a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: c */
        public final void mo31863c(Object obj, long j, double d) {
            this.f61200a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: d */
        public final void mo31862d(Object obj, long j, float f) {
            this.f61200a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: g */
        public final void mo31859g(Object obj, long j, boolean z) {
            this.f61200a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: h */
        public final boolean mo31858h(Object obj, long j) {
            return this.f61200a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: i */
        public final float mo31857i(Object obj, long j) {
            return this.f61200a.getFloat(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: j */
        public final double mo31856j(Object obj, long j) {
            return this.f61200a.getDouble(obj, j);
        }
    }

    /* renamed from: dH2$c */
    /* loaded from: classes3.dex */
    public static final class C10056c extends AbstractC10057d {
        public C10056c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: a */
        public final byte mo31865a(Object obj, long j) {
            return AbstractC19549dH2.f61199w ? AbstractC19549dH2.m31895L(obj, j) : AbstractC19549dH2.m31894M(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: b */
        public final void mo31864b(Object obj, long j, byte b) {
            if (AbstractC19549dH2.f61199w) {
                AbstractC19549dH2.m31871u(obj, j, b);
            } else {
                AbstractC19549dH2.m31867y(obj, j, b);
            }
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: c */
        public final void mo31863c(Object obj, long j, double d) {
            m31860f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: d */
        public final void mo31862d(Object obj, long j, float f) {
            m31861e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: g */
        public final void mo31859g(Object obj, long j, boolean z) {
            if (AbstractC19549dH2.f61199w) {
                AbstractC19549dH2.m31866z(obj, j, z);
            } else {
                AbstractC19549dH2.m31903D(obj, j, z);
            }
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: h */
        public final boolean mo31858h(Object obj, long j) {
            return AbstractC19549dH2.f61199w ? AbstractC19549dH2.m31893N(obj, j) : AbstractC19549dH2.m31892O(obj, j);
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: i */
        public final float mo31857i(Object obj, long j) {
            return Float.intBitsToFloat(m31855k(obj, j));
        }

        @Override // p000.AbstractC19549dH2.AbstractC10057d
        /* renamed from: j */
        public final double mo31856j(Object obj, long j) {
            return Double.longBitsToDouble(m31854l(obj, j));
        }
    }

    /* renamed from: dH2$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC10057d {

        /* renamed from: a */
        public Unsafe f61200a;

        public AbstractC10057d(Unsafe unsafe) {
            this.f61200a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo31865a(Object obj, long j);

        /* renamed from: b */
        public abstract void mo31864b(Object obj, long j, byte b);

        /* renamed from: c */
        public abstract void mo31863c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo31862d(Object obj, long j, float f);

        /* renamed from: e */
        public final void m31861e(Object obj, long j, int i) {
            this.f61200a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void m31860f(Object obj, long j, long j2) {
            this.f61200a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo31859g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract boolean mo31858h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo31857i(Object obj, long j);

        /* renamed from: j */
        public abstract double mo31856j(Object obj, long j);

        /* renamed from: k */
        public final int m31855k(Object obj, long j) {
            return this.f61200a.getInt(obj, j);
        }

        /* renamed from: l */
        public final long m31854l(Object obj, long j) {
            return this.f61200a.getLong(obj, j);
        }
    }

    static {
        long j;
        boolean z;
        Unsafe m31872t = m31872t();
        f61177a = m31872t;
        f61178b = AbstractC19829ev2.m31580c();
        boolean m31905B = m31905B(Long.TYPE);
        f61179c = m31905B;
        boolean m31905B2 = m31905B(Integer.TYPE);
        f61180d = m31905B2;
        AbstractC10057d abstractC10057d = null;
        if (m31872t != null) {
            if (AbstractC19829ev2.m31581b()) {
                if (m31905B) {
                    abstractC10057d = new C10056c(m31872t);
                } else if (m31905B2) {
                    abstractC10057d = new C10054a(m31872t);
                }
            } else {
                abstractC10057d = new C10055b(m31872t);
            }
        }
        f61181e = abstractC10057d;
        f61182f = m31902E();
        f61183g = m31906A();
        long m31878n = m31878n(byte[].class);
        f61184h = m31878n;
        f61185i = m31878n(boolean[].class);
        f61186j = m31873s(boolean[].class);
        f61187k = m31878n(int[].class);
        f61188l = m31873s(int[].class);
        f61189m = m31878n(long[].class);
        f61190n = m31873s(long[].class);
        f61191o = m31878n(float[].class);
        f61192p = m31873s(float[].class);
        f61193q = m31878n(double[].class);
        f61194r = m31873s(double[].class);
        f61195s = m31878n(Object[].class);
        f61196t = m31873s(Object[].class);
        Field m31900G = m31900G();
        if (m31900G != null && abstractC10057d != null) {
            j = abstractC10057d.f61200a.objectFieldOffset(m31900G);
        } else {
            j = -1;
        }
        f61197u = j;
        f61198v = (int) (m31878n & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f61199w = z;
    }

    /* renamed from: A */
    public static boolean m31906A() {
        Unsafe unsafe = f61177a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (AbstractC19829ev2.m31581b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            Logger logger = Logger.getLogger(AbstractC19549dH2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static boolean m31905B(Class cls) {
        if (!AbstractC19829ev2.m31581b()) {
            return false;
        }
        try {
            Class cls2 = f61178b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: C */
    public static double m31904C(Object obj, long j) {
        return f61181e.mo31856j(obj, j);
    }

    /* renamed from: D */
    public static void m31903D(Object obj, long j, boolean z) {
        m31867y(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: E */
    public static boolean m31902E() {
        Unsafe unsafe = f61177a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m31900G() == null) {
                return false;
            }
            if (AbstractC19829ev2.m31581b()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            Logger logger = Logger.getLogger(AbstractC19549dH2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: F */
    public static Object m31901F(Object obj, long j) {
        return f61181e.f61200a.getObject(obj, j);
    }

    /* renamed from: G */
    public static Field m31900G() {
        Field m31888d;
        if (AbstractC19829ev2.m31581b() && (m31888d = m31888d(Buffer.class, "effectiveDirectAddress")) != null) {
            return m31888d;
        }
        Field m31888d2 = m31888d(Buffer.class, "address");
        if (m31888d2 != null && m31888d2.getType() == Long.TYPE) {
            return m31888d2;
        }
        return null;
    }

    /* renamed from: L */
    public static byte m31895L(Object obj, long j) {
        return (byte) (m31890b(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: M */
    public static byte m31894M(Object obj, long j) {
        return (byte) (m31890b(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: N */
    public static boolean m31893N(Object obj, long j) {
        if (m31895L(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m31892O(Object obj, long j) {
        if (m31894M(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static byte m31891a(byte[] bArr, long j) {
        return f61181e.mo31865a(bArr, f61184h + j);
    }

    /* renamed from: b */
    public static int m31890b(Object obj, long j) {
        return f61181e.m31855k(obj, j);
    }

    /* renamed from: c */
    public static Object m31889c(Class cls) {
        try {
            return f61177a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public static Field m31888d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m31886f(Object obj, long j, double d) {
        f61181e.mo31863c(obj, j, d);
    }

    /* renamed from: g */
    public static void m31885g(Object obj, long j, float f) {
        f61181e.mo31862d(obj, j, f);
    }

    /* renamed from: h */
    public static void m31884h(Object obj, long j, int i) {
        f61181e.m31861e(obj, j, i);
    }

    /* renamed from: i */
    public static void m31883i(Object obj, long j, long j2) {
        f61181e.m31860f(obj, j, j2);
    }

    /* renamed from: j */
    public static void m31882j(Object obj, long j, Object obj2) {
        f61181e.f61200a.putObject(obj, j, obj2);
    }

    /* renamed from: k */
    public static void m31881k(Object obj, long j, boolean z) {
        f61181e.mo31859g(obj, j, z);
    }

    /* renamed from: l */
    public static void m31880l(byte[] bArr, long j, byte b) {
        f61181e.mo31864b(bArr, f61184h + j, b);
    }

    /* renamed from: m */
    public static boolean m31879m() {
        return f61183g;
    }

    /* renamed from: n */
    public static int m31878n(Class cls) {
        if (f61183g) {
            return f61181e.f61200a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static long m31877o(Object obj, long j) {
        return f61181e.m31854l(obj, j);
    }

    /* renamed from: r */
    public static boolean m31874r() {
        return f61182f;
    }

    /* renamed from: s */
    public static int m31873s(Class cls) {
        if (f61183g) {
            return f61181e.f61200a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    public static Unsafe m31872t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C21106mH2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static void m31871u(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m31890b = m31890b(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m31884h(obj, j2, ((255 & b) << i) | (m31890b & (~(255 << i))));
    }

    /* renamed from: w */
    public static boolean m31869w(Object obj, long j) {
        return f61181e.mo31858h(obj, j);
    }

    /* renamed from: x */
    public static float m31868x(Object obj, long j) {
        return f61181e.mo31857i(obj, j);
    }

    /* renamed from: y */
    public static void m31867y(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m31884h(obj, j2, ((255 & b) << i) | (m31890b(obj, j2) & (~(255 << i))));
    }

    /* renamed from: z */
    public static void m31866z(Object obj, long j, boolean z) {
        m31871u(obj, j, z ? (byte) 1 : (byte) 0);
    }
}