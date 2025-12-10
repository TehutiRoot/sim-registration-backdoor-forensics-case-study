package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: Ab2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17289Ab2 {

    /* renamed from: a */
    public static final Logger f135a = Logger.getLogger(AbstractC17289Ab2.class.getName());

    /* renamed from: b */
    public static final Unsafe f136b;

    /* renamed from: c */
    public static final Class f137c;

    /* renamed from: d */
    public static final boolean f138d;

    /* renamed from: e */
    public static final boolean f139e;

    /* renamed from: f */
    public static final AbstractC0044d f140f;

    /* renamed from: g */
    public static final boolean f141g;

    /* renamed from: h */
    public static final boolean f142h;

    /* renamed from: i */
    public static final long f143i;

    /* renamed from: j */
    public static final long f144j;

    /* renamed from: k */
    public static final long f145k;

    /* renamed from: l */
    public static final long f146l;

    /* renamed from: m */
    public static final long f147m;

    /* renamed from: n */
    public static final long f148n;

    /* renamed from: o */
    public static final long f149o;

    /* renamed from: p */
    public static final long f150p;

    /* renamed from: q */
    public static final long f151q;

    /* renamed from: r */
    public static final long f152r;

    /* renamed from: s */
    public static final long f153s;

    /* renamed from: t */
    public static final long f154t;

    /* renamed from: u */
    public static final long f155u;

    /* renamed from: v */
    public static final long f156v;

    /* renamed from: w */
    public static final int f157w;

    /* renamed from: x */
    public static final boolean f158x;

    /* renamed from: Ab2$a */
    /* loaded from: classes3.dex */
    public static final class C0041a extends AbstractC0044d {
        public C0041a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: a */
        public final void mo69225a(Object obj, long j, double d) {
            m69222d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: b */
        public final void mo69224b(Object obj, long j, float f) {
            m69223c(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: e */
        public final void mo69221e(Object obj, long j, boolean z) {
            if (AbstractC17289Ab2.f158x) {
                AbstractC17289Ab2.m69240l(obj, j, z);
            } else {
                AbstractC17289Ab2.m69238n(obj, j, z);
            }
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: f */
        public final void mo69220f(Object obj, long j, byte b) {
            if (AbstractC17289Ab2.f158x) {
                AbstractC17289Ab2.m69250b(obj, j, b);
            } else {
                AbstractC17289Ab2.m69241k(obj, j, b);
            }
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: i */
        public final boolean mo69217i(Object obj, long j) {
            return AbstractC17289Ab2.f158x ? AbstractC17289Ab2.m69263D(obj, j) : AbstractC17289Ab2.m69262E(obj, j);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: j */
        public final float mo69216j(Object obj, long j) {
            return Float.intBitsToFloat(m69219g(obj, j));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: k */
        public final double mo69215k(Object obj, long j) {
            return Double.longBitsToDouble(m69218h(obj, j));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: l */
        public final byte mo69214l(Object obj, long j) {
            return AbstractC17289Ab2.f158x ? AbstractC17289Ab2.m69266A(obj, j) : AbstractC17289Ab2.m69264C(obj, j);
        }
    }

    /* renamed from: Ab2$b */
    /* loaded from: classes3.dex */
    public static final class C0042b extends AbstractC0044d {
        public C0042b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: a */
        public final void mo69225a(Object obj, long j, double d) {
            this.f159a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: b */
        public final void mo69224b(Object obj, long j, float f) {
            this.f159a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: e */
        public final void mo69221e(Object obj, long j, boolean z) {
            this.f159a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: f */
        public final void mo69220f(Object obj, long j, byte b) {
            this.f159a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: i */
        public final boolean mo69217i(Object obj, long j) {
            return this.f159a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: j */
        public final float mo69216j(Object obj, long j) {
            return this.f159a.getFloat(obj, j);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: k */
        public final double mo69215k(Object obj, long j) {
            return this.f159a.getDouble(obj, j);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: l */
        public final byte mo69214l(Object obj, long j) {
            return this.f159a.getByte(obj, j);
        }
    }

    /* renamed from: Ab2$c */
    /* loaded from: classes3.dex */
    public static final class C0043c extends AbstractC0044d {
        public C0043c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: a */
        public final void mo69225a(Object obj, long j, double d) {
            m69222d(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: b */
        public final void mo69224b(Object obj, long j, float f) {
            m69223c(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: e */
        public final void mo69221e(Object obj, long j, boolean z) {
            if (AbstractC17289Ab2.f158x) {
                AbstractC17289Ab2.m69240l(obj, j, z);
            } else {
                AbstractC17289Ab2.m69238n(obj, j, z);
            }
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: f */
        public final void mo69220f(Object obj, long j, byte b) {
            if (AbstractC17289Ab2.f158x) {
                AbstractC17289Ab2.m69250b(obj, j, b);
            } else {
                AbstractC17289Ab2.m69241k(obj, j, b);
            }
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: i */
        public final boolean mo69217i(Object obj, long j) {
            return AbstractC17289Ab2.f158x ? AbstractC17289Ab2.m69263D(obj, j) : AbstractC17289Ab2.m69262E(obj, j);
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: j */
        public final float mo69216j(Object obj, long j) {
            return Float.intBitsToFloat(m69219g(obj, j));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: k */
        public final double mo69215k(Object obj, long j) {
            return Double.longBitsToDouble(m69218h(obj, j));
        }

        @Override // p000.AbstractC17289Ab2.AbstractC0044d
        /* renamed from: l */
        public final byte mo69214l(Object obj, long j) {
            return AbstractC17289Ab2.f158x ? AbstractC17289Ab2.m69266A(obj, j) : AbstractC17289Ab2.m69264C(obj, j);
        }
    }

    /* renamed from: Ab2$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0044d {

        /* renamed from: a */
        public Unsafe f159a;

        public AbstractC0044d(Unsafe unsafe) {
            this.f159a = unsafe;
        }

        /* renamed from: a */
        public abstract void mo69225a(Object obj, long j, double d);

        /* renamed from: b */
        public abstract void mo69224b(Object obj, long j, float f);

        /* renamed from: c */
        public final void m69223c(Object obj, long j, int i) {
            this.f159a.putInt(obj, j, i);
        }

        /* renamed from: d */
        public final void m69222d(Object obj, long j, long j2) {
            this.f159a.putLong(obj, j, j2);
        }

        /* renamed from: e */
        public abstract void mo69221e(Object obj, long j, boolean z);

        /* renamed from: f */
        public abstract void mo69220f(Object obj, long j, byte b);

        /* renamed from: g */
        public final int m69219g(Object obj, long j) {
            return this.f159a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m69218h(Object obj, long j) {
            return this.f159a.getLong(obj, j);
        }

        /* renamed from: i */
        public abstract boolean mo69217i(Object obj, long j);

        /* renamed from: j */
        public abstract float mo69216j(Object obj, long j);

        /* renamed from: k */
        public abstract double mo69215k(Object obj, long j);

        /* renamed from: l */
        public abstract byte mo69214l(Object obj, long j);
    }

    static {
        long j;
        boolean z;
        Unsafe m69255L = m69255L();
        f136b = m69255L;
        f137c = AbstractC21464oL2.m26125c();
        boolean m69265B = m69265B(Long.TYPE);
        f138d = m69265B;
        boolean m69265B2 = m69265B(Integer.TYPE);
        f139e = m69265B2;
        AbstractC0044d abstractC0044d = null;
        if (m69255L != null) {
            if (AbstractC21464oL2.m26126b()) {
                if (m69265B) {
                    abstractC0044d = new C0043c(m69255L);
                } else if (m69265B2) {
                    abstractC0044d = new C0041a(m69255L);
                }
            } else {
                abstractC0044d = new C0042b(m69255L);
            }
        }
        f140f = abstractC0044d;
        f141g = m69253N();
        f142h = m69254M();
        long m69228x = m69228x(byte[].class);
        f143i = m69228x;
        f144j = m69228x(boolean[].class);
        f145k = m69227y(boolean[].class);
        f146l = m69228x(int[].class);
        f147m = m69227y(int[].class);
        f148n = m69228x(long[].class);
        f149o = m69227y(long[].class);
        f150p = m69228x(float[].class);
        f151q = m69227y(float[].class);
        f152r = m69228x(double[].class);
        f153s = m69227y(double[].class);
        f154t = m69228x(Object[].class);
        f155u = m69227y(Object[].class);
        Field m69252O = m69252O();
        if (m69252O != null && abstractC0044d != null) {
            j = abstractC0044d.f159a.objectFieldOffset(m69252O);
        } else {
            j = -1;
        }
        f156v = j;
        f157w = (int) (m69228x & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f158x = z;
    }

    /* renamed from: A */
    public static byte m69266A(Object obj, long j) {
        return (byte) (m69234r(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static boolean m69265B(Class cls) {
        if (!AbstractC21464oL2.m26126b()) {
            return false;
        }
        try {
            Class cls2 = f137c;
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
    public static byte m69264C(Object obj, long j) {
        return (byte) (m69234r(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: D */
    public static boolean m69263D(Object obj, long j) {
        if (m69266A(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m69262E(Object obj, long j) {
        if (m69264C(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m69257J() {
        return f142h;
    }

    /* renamed from: K */
    public static boolean m69256K() {
        return f141g;
    }

    /* renamed from: L */
    public static Unsafe m69255L() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C17419Cb2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static boolean m69254M() {
        Unsafe unsafe = f136b;
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
            if (AbstractC21464oL2.m26126b()) {
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
            Logger logger = f135a;
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
    public static boolean m69253N() {
        Unsafe unsafe = f136b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m69252O() == null) {
                return false;
            }
            if (AbstractC21464oL2.m26126b()) {
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
            Logger logger = f135a;
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
    public static Field m69252O() {
        Field m69242j;
        if (AbstractC21464oL2.m26126b() && (m69242j = m69242j(Buffer.class, "effectiveDirectAddress")) != null) {
            return m69242j;
        }
        Field m69242j2 = m69242j(Buffer.class, "address");
        if (m69242j2 != null && m69242j2.getType() == Long.TYPE) {
            return m69242j2;
        }
        return null;
    }

    /* renamed from: a */
    public static byte m69251a(byte[] bArr, long j) {
        return f140f.mo69214l(bArr, f143i + j);
    }

    /* renamed from: b */
    public static void m69250b(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m69234r = m69234r(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m69247e(obj, j2, ((255 & b) << i) | (m69234r & (~(255 << i))));
    }

    /* renamed from: c */
    public static void m69249c(Object obj, long j, double d) {
        f140f.mo69225a(obj, j, d);
    }

    /* renamed from: d */
    public static void m69248d(Object obj, long j, float f) {
        f140f.mo69224b(obj, j, f);
    }

    /* renamed from: e */
    public static void m69247e(Object obj, long j, int i) {
        f140f.m69223c(obj, j, i);
    }

    /* renamed from: f */
    public static void m69246f(Object obj, long j, long j2) {
        f140f.m69222d(obj, j, j2);
    }

    /* renamed from: g */
    public static void m69245g(Object obj, long j, Object obj2) {
        f140f.f159a.putObject(obj, j, obj2);
    }

    /* renamed from: h */
    public static void m69244h(Object obj, long j, boolean z) {
        f140f.mo69221e(obj, j, z);
    }

    /* renamed from: i */
    public static void m69243i(byte[] bArr, long j, byte b) {
        f140f.mo69220f(bArr, f143i + j, b);
    }

    /* renamed from: j */
    public static Field m69242j(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static void m69241k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m69247e(obj, j2, ((255 & b) << i) | (m69234r(obj, j2) & (~(255 << i))));
    }

    /* renamed from: l */
    public static void m69240l(Object obj, long j, boolean z) {
        m69250b(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: n */
    public static void m69238n(Object obj, long j, boolean z) {
        m69241k(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: r */
    public static int m69234r(Object obj, long j) {
        return f140f.m69219g(obj, j);
    }

    /* renamed from: s */
    public static long m69233s(Object obj, long j) {
        return f140f.m69218h(obj, j);
    }

    /* renamed from: t */
    public static boolean m69232t(Object obj, long j) {
        return f140f.mo69217i(obj, j);
    }

    /* renamed from: u */
    public static float m69231u(Object obj, long j) {
        return f140f.mo69216j(obj, j);
    }

    /* renamed from: v */
    public static Object m69230v(Class cls) {
        try {
            return f136b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: w */
    public static double m69229w(Object obj, long j) {
        return f140f.mo69215k(obj, j);
    }

    /* renamed from: x */
    public static int m69228x(Class cls) {
        if (f142h) {
            return f140f.f159a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: y */
    public static int m69227y(Class cls) {
        if (f142h) {
            return f140f.f159a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: z */
    public static Object m69226z(Object obj, long j) {
        return f140f.f159a.getObject(obj, j);
    }
}