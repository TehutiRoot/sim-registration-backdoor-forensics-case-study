package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: gG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20013gG2 {

    /* renamed from: a */
    public static final Unsafe f62109a;

    /* renamed from: b */
    public static final Class f62110b;

    /* renamed from: c */
    public static final boolean f62111c;

    /* renamed from: d */
    public static final boolean f62112d;

    /* renamed from: e */
    public static final AbstractC10291d f62113e;

    /* renamed from: f */
    public static final boolean f62114f;

    /* renamed from: g */
    public static final boolean f62115g;

    /* renamed from: h */
    public static final long f62116h;

    /* renamed from: i */
    public static final long f62117i;

    /* renamed from: j */
    public static final long f62118j;

    /* renamed from: k */
    public static final long f62119k;

    /* renamed from: l */
    public static final long f62120l;

    /* renamed from: m */
    public static final long f62121m;

    /* renamed from: n */
    public static final long f62122n;

    /* renamed from: o */
    public static final long f62123o;

    /* renamed from: p */
    public static final long f62124p;

    /* renamed from: q */
    public static final long f62125q;

    /* renamed from: r */
    public static final long f62126r;

    /* renamed from: s */
    public static final long f62127s;

    /* renamed from: t */
    public static final long f62128t;

    /* renamed from: u */
    public static final long f62129u;

    /* renamed from: v */
    public static final int f62130v;

    /* renamed from: w */
    public static final boolean f62131w;

    /* renamed from: gG2$a */
    /* loaded from: classes3.dex */
    public static final class C10288a extends AbstractC10291d {
        public C10288a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: a */
        public final byte mo31170a(Object obj, long j) {
            return AbstractC20013gG2.f62131w ? AbstractC20013gG2.m31200L(obj, j) : AbstractC20013gG2.m31199M(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: b */
        public final void mo31169b(Object obj, long j, byte b) {
            if (AbstractC20013gG2.f62131w) {
                AbstractC20013gG2.m31176u(obj, j, b);
            } else {
                AbstractC20013gG2.m31172y(obj, j, b);
            }
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: c */
        public final void mo31168c(Object obj, long j, double d) {
            m31165f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: d */
        public final void mo31167d(Object obj, long j, float f) {
            m31166e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: g */
        public final void mo31164g(Object obj, long j, boolean z) {
            if (AbstractC20013gG2.f62131w) {
                AbstractC20013gG2.m31171z(obj, j, z);
            } else {
                AbstractC20013gG2.m31208D(obj, j, z);
            }
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: h */
        public final boolean mo31163h(Object obj, long j) {
            return AbstractC20013gG2.f62131w ? AbstractC20013gG2.m31198N(obj, j) : AbstractC20013gG2.m31197O(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: i */
        public final float mo31162i(Object obj, long j) {
            return Float.intBitsToFloat(m31160k(obj, j));
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: j */
        public final double mo31161j(Object obj, long j) {
            return Double.longBitsToDouble(m31159l(obj, j));
        }
    }

    /* renamed from: gG2$b */
    /* loaded from: classes3.dex */
    public static final class C10289b extends AbstractC10291d {
        public C10289b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: a */
        public final byte mo31170a(Object obj, long j) {
            return this.f62132a.getByte(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: b */
        public final void mo31169b(Object obj, long j, byte b) {
            this.f62132a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: c */
        public final void mo31168c(Object obj, long j, double d) {
            this.f62132a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: d */
        public final void mo31167d(Object obj, long j, float f) {
            this.f62132a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: g */
        public final void mo31164g(Object obj, long j, boolean z) {
            this.f62132a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: h */
        public final boolean mo31163h(Object obj, long j) {
            return this.f62132a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: i */
        public final float mo31162i(Object obj, long j) {
            return this.f62132a.getFloat(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: j */
        public final double mo31161j(Object obj, long j) {
            return this.f62132a.getDouble(obj, j);
        }
    }

    /* renamed from: gG2$c */
    /* loaded from: classes3.dex */
    public static final class C10290c extends AbstractC10291d {
        public C10290c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: a */
        public final byte mo31170a(Object obj, long j) {
            return AbstractC20013gG2.f62131w ? AbstractC20013gG2.m31200L(obj, j) : AbstractC20013gG2.m31199M(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: b */
        public final void mo31169b(Object obj, long j, byte b) {
            if (AbstractC20013gG2.f62131w) {
                AbstractC20013gG2.m31176u(obj, j, b);
            } else {
                AbstractC20013gG2.m31172y(obj, j, b);
            }
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: c */
        public final void mo31168c(Object obj, long j, double d) {
            m31165f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: d */
        public final void mo31167d(Object obj, long j, float f) {
            m31166e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: g */
        public final void mo31164g(Object obj, long j, boolean z) {
            if (AbstractC20013gG2.f62131w) {
                AbstractC20013gG2.m31171z(obj, j, z);
            } else {
                AbstractC20013gG2.m31208D(obj, j, z);
            }
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: h */
        public final boolean mo31163h(Object obj, long j) {
            return AbstractC20013gG2.f62131w ? AbstractC20013gG2.m31198N(obj, j) : AbstractC20013gG2.m31197O(obj, j);
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: i */
        public final float mo31162i(Object obj, long j) {
            return Float.intBitsToFloat(m31160k(obj, j));
        }

        @Override // p000.AbstractC20013gG2.AbstractC10291d
        /* renamed from: j */
        public final double mo31161j(Object obj, long j) {
            return Double.longBitsToDouble(m31159l(obj, j));
        }
    }

    /* renamed from: gG2$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC10291d {

        /* renamed from: a */
        public Unsafe f62132a;

        public AbstractC10291d(Unsafe unsafe) {
            this.f62132a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo31170a(Object obj, long j);

        /* renamed from: b */
        public abstract void mo31169b(Object obj, long j, byte b);

        /* renamed from: c */
        public abstract void mo31168c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo31167d(Object obj, long j, float f);

        /* renamed from: e */
        public final void m31166e(Object obj, long j, int i) {
            this.f62132a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void m31165f(Object obj, long j, long j2) {
            this.f62132a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo31164g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract boolean mo31163h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo31162i(Object obj, long j);

        /* renamed from: j */
        public abstract double mo31161j(Object obj, long j);

        /* renamed from: k */
        public final int m31160k(Object obj, long j) {
            return this.f62132a.getInt(obj, j);
        }

        /* renamed from: l */
        public final long m31159l(Object obj, long j) {
            return this.f62132a.getLong(obj, j);
        }
    }

    static {
        long j;
        boolean z;
        Unsafe m31177t = m31177t();
        f62109a = m31177t;
        f62110b = AbstractC20291hu2.m30707c();
        boolean m31210B = m31210B(Long.TYPE);
        f62111c = m31210B;
        boolean m31210B2 = m31210B(Integer.TYPE);
        f62112d = m31210B2;
        AbstractC10291d abstractC10291d = null;
        if (m31177t != null) {
            if (AbstractC20291hu2.m30708b()) {
                if (m31210B) {
                    abstractC10291d = new C10290c(m31177t);
                } else if (m31210B2) {
                    abstractC10291d = new C10288a(m31177t);
                }
            } else {
                abstractC10291d = new C10289b(m31177t);
            }
        }
        f62113e = abstractC10291d;
        f62114f = m31207E();
        f62115g = m31211A();
        long m31183n = m31183n(byte[].class);
        f62116h = m31183n;
        f62117i = m31183n(boolean[].class);
        f62118j = m31178s(boolean[].class);
        f62119k = m31183n(int[].class);
        f62120l = m31178s(int[].class);
        f62121m = m31183n(long[].class);
        f62122n = m31178s(long[].class);
        f62123o = m31183n(float[].class);
        f62124p = m31178s(float[].class);
        f62125q = m31183n(double[].class);
        f62126r = m31178s(double[].class);
        f62127s = m31183n(Object[].class);
        f62128t = m31178s(Object[].class);
        Field m31205G = m31205G();
        if (m31205G != null && abstractC10291d != null) {
            j = abstractC10291d.f62132a.objectFieldOffset(m31205G);
        } else {
            j = -1;
        }
        f62129u = j;
        f62130v = (int) (m31183n & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f62131w = z;
    }

    /* renamed from: A */
    public static boolean m31211A() {
        Unsafe unsafe = f62109a;
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
            if (AbstractC20291hu2.m30708b()) {
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
            Logger logger = Logger.getLogger(AbstractC20013gG2.class.getName());
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
    public static boolean m31210B(Class cls) {
        if (!AbstractC20291hu2.m30708b()) {
            return false;
        }
        try {
            Class cls2 = f62110b;
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
    public static double m31209C(Object obj, long j) {
        return f62113e.mo31161j(obj, j);
    }

    /* renamed from: D */
    public static void m31208D(Object obj, long j, boolean z) {
        m31172y(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: E */
    public static boolean m31207E() {
        Unsafe unsafe = f62109a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m31205G() == null) {
                return false;
            }
            if (AbstractC20291hu2.m30708b()) {
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
            Logger logger = Logger.getLogger(AbstractC20013gG2.class.getName());
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
    public static Object m31206F(Object obj, long j) {
        return f62113e.f62132a.getObject(obj, j);
    }

    /* renamed from: G */
    public static Field m31205G() {
        Field m31193d;
        if (AbstractC20291hu2.m30708b() && (m31193d = m31193d(Buffer.class, "effectiveDirectAddress")) != null) {
            return m31193d;
        }
        Field m31193d2 = m31193d(Buffer.class, "address");
        if (m31193d2 != null && m31193d2.getType() == Long.TYPE) {
            return m31193d2;
        }
        return null;
    }

    /* renamed from: L */
    public static byte m31200L(Object obj, long j) {
        return (byte) (m31195b(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: M */
    public static byte m31199M(Object obj, long j) {
        return (byte) (m31195b(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: N */
    public static boolean m31198N(Object obj, long j) {
        if (m31200L(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static boolean m31197O(Object obj, long j) {
        if (m31199M(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static byte m31196a(byte[] bArr, long j) {
        return f62113e.mo31170a(bArr, f62116h + j);
    }

    /* renamed from: b */
    public static int m31195b(Object obj, long j) {
        return f62113e.m31160k(obj, j);
    }

    /* renamed from: c */
    public static Object m31194c(Class cls) {
        try {
            return f62109a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: d */
    public static Field m31193d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m31191f(Object obj, long j, double d) {
        f62113e.mo31168c(obj, j, d);
    }

    /* renamed from: g */
    public static void m31190g(Object obj, long j, float f) {
        f62113e.mo31167d(obj, j, f);
    }

    /* renamed from: h */
    public static void m31189h(Object obj, long j, int i) {
        f62113e.m31166e(obj, j, i);
    }

    /* renamed from: i */
    public static void m31188i(Object obj, long j, long j2) {
        f62113e.m31165f(obj, j, j2);
    }

    /* renamed from: j */
    public static void m31187j(Object obj, long j, Object obj2) {
        f62113e.f62132a.putObject(obj, j, obj2);
    }

    /* renamed from: k */
    public static void m31186k(Object obj, long j, boolean z) {
        f62113e.mo31164g(obj, j, z);
    }

    /* renamed from: l */
    public static void m31185l(byte[] bArr, long j, byte b) {
        f62113e.mo31169b(bArr, f62116h + j, b);
    }

    /* renamed from: m */
    public static boolean m31184m() {
        return f62115g;
    }

    /* renamed from: n */
    public static int m31183n(Class cls) {
        if (f62115g) {
            return f62113e.f62132a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static long m31182o(Object obj, long j) {
        return f62113e.m31159l(obj, j);
    }

    /* renamed from: r */
    public static boolean m31179r() {
        return f62114f;
    }

    /* renamed from: s */
    public static int m31178s(Class cls) {
        if (f62115g) {
            return f62113e.f62132a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    public static Unsafe m31177t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C21561pG2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static void m31176u(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m31195b = m31195b(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m31189h(obj, j2, ((255 & b) << i) | (m31195b & (~(255 << i))));
    }

    /* renamed from: w */
    public static boolean m31174w(Object obj, long j) {
        return f62113e.mo31163h(obj, j);
    }

    /* renamed from: x */
    public static float m31173x(Object obj, long j) {
        return f62113e.mo31162i(obj, j);
    }

    /* renamed from: y */
    public static void m31172y(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m31189h(obj, j2, ((255 & b) << i) | (m31195b(obj, j2) & (~(255 << i))));
    }

    /* renamed from: z */
    public static void m31171z(Object obj, long j, boolean z) {
        m31176u(obj, j, z ? (byte) 1 : (byte) 0);
    }
}
