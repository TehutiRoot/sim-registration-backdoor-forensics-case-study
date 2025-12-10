package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: Da2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17455Da2 {

    /* renamed from: a */
    public static final Logger f1024a = Logger.getLogger(AbstractC17455Da2.class.getName());

    /* renamed from: b */
    public static final Unsafe f1025b;

    /* renamed from: c */
    public static final Class f1026c;

    /* renamed from: d */
    public static final boolean f1027d;

    /* renamed from: e */
    public static final boolean f1028e;

    /* renamed from: f */
    public static final AbstractC0264d f1029f;

    /* renamed from: g */
    public static final boolean f1030g;

    /* renamed from: h */
    public static final boolean f1031h;

    /* renamed from: i */
    public static final long f1032i;

    /* renamed from: j */
    public static final long f1033j;

    /* renamed from: k */
    public static final long f1034k;

    /* renamed from: l */
    public static final long f1035l;

    /* renamed from: m */
    public static final long f1036m;

    /* renamed from: n */
    public static final long f1037n;

    /* renamed from: o */
    public static final long f1038o;

    /* renamed from: p */
    public static final long f1039p;

    /* renamed from: q */
    public static final long f1040q;

    /* renamed from: r */
    public static final long f1041r;

    /* renamed from: s */
    public static final long f1042s;

    /* renamed from: t */
    public static final long f1043t;

    /* renamed from: u */
    public static final long f1044u;

    /* renamed from: v */
    public static final long f1045v;

    /* renamed from: w */
    public static final int f1046w;

    /* renamed from: x */
    public static final boolean f1047x;

    /* renamed from: Da2$a */
    /* loaded from: classes3.dex */
    public static final class C0261a extends AbstractC0264d {
        public C0261a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: a */
        public final void mo68610a(Object obj, long j, double d) {
            m68607d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: b */
        public final void mo68609b(Object obj, long j, float f) {
            m68608c(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: e */
        public final void mo68606e(Object obj, long j, boolean z) {
            if (AbstractC17455Da2.f1047x) {
                AbstractC17455Da2.m68625l(obj, j, z);
            } else {
                AbstractC17455Da2.m68623n(obj, j, z);
            }
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: f */
        public final void mo68605f(Object obj, long j, byte b) {
            if (AbstractC17455Da2.f1047x) {
                AbstractC17455Da2.m68635b(obj, j, b);
            } else {
                AbstractC17455Da2.m68626k(obj, j, b);
            }
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: i */
        public final boolean mo68602i(Object obj, long j) {
            return AbstractC17455Da2.f1047x ? AbstractC17455Da2.m68648D(obj, j) : AbstractC17455Da2.m68647E(obj, j);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: j */
        public final float mo68601j(Object obj, long j) {
            return Float.intBitsToFloat(m68604g(obj, j));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: k */
        public final double mo68600k(Object obj, long j) {
            return Double.longBitsToDouble(m68603h(obj, j));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: l */
        public final byte mo68599l(Object obj, long j) {
            return AbstractC17455Da2.f1047x ? AbstractC17455Da2.m68651A(obj, j) : AbstractC17455Da2.m68649C(obj, j);
        }
    }

    /* renamed from: Da2$b */
    /* loaded from: classes3.dex */
    public static final class C0262b extends AbstractC0264d {
        public C0262b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: a */
        public final void mo68610a(Object obj, long j, double d) {
            this.f1048a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: b */
        public final void mo68609b(Object obj, long j, float f) {
            this.f1048a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: e */
        public final void mo68606e(Object obj, long j, boolean z) {
            this.f1048a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: f */
        public final void mo68605f(Object obj, long j, byte b) {
            this.f1048a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: i */
        public final boolean mo68602i(Object obj, long j) {
            return this.f1048a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: j */
        public final float mo68601j(Object obj, long j) {
            return this.f1048a.getFloat(obj, j);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: k */
        public final double mo68600k(Object obj, long j) {
            return this.f1048a.getDouble(obj, j);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: l */
        public final byte mo68599l(Object obj, long j) {
            return this.f1048a.getByte(obj, j);
        }
    }

    /* renamed from: Da2$c */
    /* loaded from: classes3.dex */
    public static final class C0263c extends AbstractC0264d {
        public C0263c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: a */
        public final void mo68610a(Object obj, long j, double d) {
            m68607d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: b */
        public final void mo68609b(Object obj, long j, float f) {
            m68608c(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: e */
        public final void mo68606e(Object obj, long j, boolean z) {
            if (AbstractC17455Da2.f1047x) {
                AbstractC17455Da2.m68625l(obj, j, z);
            } else {
                AbstractC17455Da2.m68623n(obj, j, z);
            }
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: f */
        public final void mo68605f(Object obj, long j, byte b) {
            if (AbstractC17455Da2.f1047x) {
                AbstractC17455Da2.m68635b(obj, j, b);
            } else {
                AbstractC17455Da2.m68626k(obj, j, b);
            }
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: i */
        public final boolean mo68602i(Object obj, long j) {
            return AbstractC17455Da2.f1047x ? AbstractC17455Da2.m68648D(obj, j) : AbstractC17455Da2.m68647E(obj, j);
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: j */
        public final float mo68601j(Object obj, long j) {
            return Float.intBitsToFloat(m68604g(obj, j));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: k */
        public final double mo68600k(Object obj, long j) {
            return Double.longBitsToDouble(m68603h(obj, j));
        }

        @Override // p000.AbstractC17455Da2.AbstractC0264d
        /* renamed from: l */
        public final byte mo68599l(Object obj, long j) {
            return AbstractC17455Da2.f1047x ? AbstractC17455Da2.m68651A(obj, j) : AbstractC17455Da2.m68649C(obj, j);
        }
    }

    /* renamed from: Da2$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0264d {

        /* renamed from: a */
        public Unsafe f1048a;

        public AbstractC0264d(Unsafe unsafe) {
            this.f1048a = unsafe;
        }

        /* renamed from: a */
        public abstract void mo68610a(Object obj, long j, double d);

        /* renamed from: b */
        public abstract void mo68609b(Object obj, long j, float f);

        /* renamed from: c */
        public final void m68608c(Object obj, long j, int i) {
            this.f1048a.putInt(obj, j, i);
        }

        /* renamed from: d */
        public final void m68607d(Object obj, long j, long j2) {
            this.f1048a.putLong(obj, j, j2);
        }

        /* renamed from: e */
        public abstract void mo68606e(Object obj, long j, boolean z);

        /* renamed from: f */
        public abstract void mo68605f(Object obj, long j, byte b);

        /* renamed from: g */
        public final int m68604g(Object obj, long j) {
            return this.f1048a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m68603h(Object obj, long j) {
            return this.f1048a.getLong(obj, j);
        }

        /* renamed from: i */
        public abstract boolean mo68602i(Object obj, long j);

        /* renamed from: j */
        public abstract float mo68601j(Object obj, long j);

        /* renamed from: k */
        public abstract double mo68600k(Object obj, long j);

        /* renamed from: l */
        public abstract byte mo68599l(Object obj, long j);
    }

    static {
        long j;
        boolean z;
        Unsafe m68640L = m68640L();
        f1025b = m68640L;
        f1026c = AbstractC21917rK2.m23334c();
        boolean m68650B = m68650B(Long.TYPE);
        f1027d = m68650B;
        boolean m68650B2 = m68650B(Integer.TYPE);
        f1028e = m68650B2;
        AbstractC0264d abstractC0264d = null;
        if (m68640L != null) {
            if (AbstractC21917rK2.m23335b()) {
                if (m68650B) {
                    abstractC0264d = new C0263c(m68640L);
                } else if (m68650B2) {
                    abstractC0264d = new C0261a(m68640L);
                }
            } else {
                abstractC0264d = new C0262b(m68640L);
            }
        }
        f1029f = abstractC0264d;
        f1030g = m68638N();
        f1031h = m68639M();
        long m68613x = m68613x(byte[].class);
        f1032i = m68613x;
        f1033j = m68613x(boolean[].class);
        f1034k = m68612y(boolean[].class);
        f1035l = m68613x(int[].class);
        f1036m = m68612y(int[].class);
        f1037n = m68613x(long[].class);
        f1038o = m68612y(long[].class);
        f1039p = m68613x(float[].class);
        f1040q = m68612y(float[].class);
        f1041r = m68613x(double[].class);
        f1042s = m68612y(double[].class);
        f1043t = m68613x(Object[].class);
        f1044u = m68612y(Object[].class);
        Field m68637O = m68637O();
        if (m68637O != null && abstractC0264d != null) {
            j = abstractC0264d.f1048a.objectFieldOffset(m68637O);
        } else {
            j = -1;
        }
        f1045v = j;
        f1046w = (int) (m68613x & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f1047x = z;
    }

    /* renamed from: A */
    public static byte m68651A(Object obj, long j) {
        return (byte) (m68619r(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static boolean m68650B(Class cls) {
        if (!AbstractC21917rK2.m23335b()) {
            return false;
        }
        try {
            Class cls2 = f1026c;
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
    public static byte m68649C(Object obj, long j) {
        return (byte) (m68619r(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: D */
    public static boolean m68648D(Object obj, long j) {
        if (m68651A(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m68647E(Object obj, long j) {
        if (m68649C(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m68642J() {
        return f1031h;
    }

    /* renamed from: K */
    public static boolean m68641K() {
        return f1030g;
    }

    /* renamed from: L */
    public static Unsafe m68640L() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C17583Fa2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static boolean m68639M() {
        Unsafe unsafe = f1025b;
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
            if (AbstractC21917rK2.m23335b()) {
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
            Logger logger = f1024a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: N */
    public static boolean m68638N() {
        Unsafe unsafe = f1025b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m68637O() == null) {
                return false;
            }
            if (AbstractC21917rK2.m23335b()) {
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
            Logger logger = f1024a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: O */
    public static Field m68637O() {
        Field m68627j;
        if (AbstractC21917rK2.m23335b() && (m68627j = m68627j(Buffer.class, "effectiveDirectAddress")) != null) {
            return m68627j;
        }
        Field m68627j2 = m68627j(Buffer.class, "address");
        if (m68627j2 != null && m68627j2.getType() == Long.TYPE) {
            return m68627j2;
        }
        return null;
    }

    /* renamed from: a */
    public static byte m68636a(byte[] bArr, long j) {
        return f1029f.mo68599l(bArr, f1032i + j);
    }

    /* renamed from: b */
    public static void m68635b(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m68619r = m68619r(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m68632e(obj, j2, ((255 & b) << i) | (m68619r & (~(255 << i))));
    }

    /* renamed from: c */
    public static void m68634c(Object obj, long j, double d) {
        f1029f.mo68610a(obj, j, d);
    }

    /* renamed from: d */
    public static void m68633d(Object obj, long j, float f) {
        f1029f.mo68609b(obj, j, f);
    }

    /* renamed from: e */
    public static void m68632e(Object obj, long j, int i) {
        f1029f.m68608c(obj, j, i);
    }

    /* renamed from: f */
    public static void m68631f(Object obj, long j, long j2) {
        f1029f.m68607d(obj, j, j2);
    }

    /* renamed from: g */
    public static void m68630g(Object obj, long j, Object obj2) {
        f1029f.f1048a.putObject(obj, j, obj2);
    }

    /* renamed from: h */
    public static void m68629h(Object obj, long j, boolean z) {
        f1029f.mo68606e(obj, j, z);
    }

    /* renamed from: i */
    public static void m68628i(byte[] bArr, long j, byte b) {
        f1029f.mo68605f(bArr, f1032i + j, b);
    }

    /* renamed from: j */
    public static Field m68627j(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static void m68626k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m68632e(obj, j2, ((255 & b) << i) | (m68619r(obj, j2) & (~(255 << i))));
    }

    /* renamed from: l */
    public static void m68625l(Object obj, long j, boolean z) {
        m68635b(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: n */
    public static void m68623n(Object obj, long j, boolean z) {
        m68626k(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: r */
    public static int m68619r(Object obj, long j) {
        return f1029f.m68604g(obj, j);
    }

    /* renamed from: s */
    public static long m68618s(Object obj, long j) {
        return f1029f.m68603h(obj, j);
    }

    /* renamed from: t */
    public static boolean m68617t(Object obj, long j) {
        return f1029f.mo68602i(obj, j);
    }

    /* renamed from: u */
    public static float m68616u(Object obj, long j) {
        return f1029f.mo68601j(obj, j);
    }

    /* renamed from: v */
    public static Object m68615v(Class cls) {
        try {
            return f1025b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: w */
    public static double m68614w(Object obj, long j) {
        return f1029f.mo68600k(obj, j);
    }

    /* renamed from: x */
    public static int m68613x(Class cls) {
        if (f1031h) {
            return f1029f.f1048a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: y */
    public static int m68612y(Class cls) {
        if (f1031h) {
            return f1029f.f1048a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: z */
    public static Object m68611z(Object obj, long j) {
        return f1029f.f1048a.getObject(obj, j);
    }
}
