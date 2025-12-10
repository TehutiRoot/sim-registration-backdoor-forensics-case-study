package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: tZ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22358tZ1 {

    /* renamed from: a */
    public static final Unsafe f80209a = m22659I();

    /* renamed from: b */
    public static final Class f80210b = AbstractC1482V2.m66072b();

    /* renamed from: c */
    public static final boolean f80211c = m22623r(Long.TYPE);

    /* renamed from: d */
    public static final boolean f80212d = m22623r(Integer.TYPE);

    /* renamed from: e */
    public static final AbstractC13996e f80213e = m22661G();

    /* renamed from: f */
    public static final boolean f80214f = m22640a0();

    /* renamed from: g */
    public static final boolean f80215g = m22642Z();

    /* renamed from: h */
    public static final long f80216h;

    /* renamed from: i */
    public static final long f80217i;

    /* renamed from: j */
    public static final long f80218j;

    /* renamed from: k */
    public static final long f80219k;

    /* renamed from: l */
    public static final long f80220l;

    /* renamed from: m */
    public static final long f80221m;

    /* renamed from: n */
    public static final long f80222n;

    /* renamed from: o */
    public static final long f80223o;

    /* renamed from: p */
    public static final long f80224p;

    /* renamed from: q */
    public static final long f80225q;

    /* renamed from: r */
    public static final long f80226r;

    /* renamed from: s */
    public static final long f80227s;

    /* renamed from: t */
    public static final long f80228t;

    /* renamed from: u */
    public static final long f80229u;

    /* renamed from: v */
    public static final int f80230v;

    /* renamed from: w */
    public static final boolean f80231w;

    /* renamed from: tZ1$a */
    /* loaded from: classes4.dex */
    public class C13992a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: tZ1$b */
    /* loaded from: classes4.dex */
    public static final class C13993b extends AbstractC13996e {
        public C13993b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: c */
        public void mo22611c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: d */
        public void mo22610d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: e */
        public boolean mo22609e(Object obj, long j) {
            return AbstractC22358tZ1.f80231w ? AbstractC22358tZ1.m22619v(obj, j) : AbstractC22358tZ1.m22618w(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: f */
        public byte mo22608f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: g */
        public byte mo22607g(Object obj, long j) {
            return AbstractC22358tZ1.f80231w ? AbstractC22358tZ1.m22615z(obj, j) : AbstractC22358tZ1.m22667A(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: h */
        public double mo22606h(Object obj, long j) {
            return Double.longBitsToDouble(m22602l(obj, j));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: i */
        public float mo22605i(Object obj, long j) {
            return Float.intBitsToFloat(m22604j(obj, j));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: k */
        public long mo22603k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: o */
        public void mo22599o(Object obj, long j, boolean z) {
            if (AbstractC22358tZ1.f80231w) {
                AbstractC22358tZ1.m22653O(obj, j, z);
            } else {
                AbstractC22358tZ1.m22652P(obj, j, z);
            }
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: p */
        public void mo22598p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: q */
        public void mo22597q(Object obj, long j, byte b) {
            if (AbstractC22358tZ1.f80231w) {
                AbstractC22358tZ1.m22649S(obj, j, b);
            } else {
                AbstractC22358tZ1.m22648T(obj, j, b);
            }
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: r */
        public void mo22596r(Object obj, long j, double d) {
            m22593u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: s */
        public void mo22595s(Object obj, long j, float f) {
            m22594t(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: x */
        public boolean mo22590x() {
            return false;
        }
    }

    /* renamed from: tZ1$c */
    /* loaded from: classes4.dex */
    public static final class C13994c extends AbstractC13996e {
        public C13994c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: c */
        public void mo22611c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: d */
        public void mo22610d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: e */
        public boolean mo22609e(Object obj, long j) {
            return AbstractC22358tZ1.f80231w ? AbstractC22358tZ1.m22619v(obj, j) : AbstractC22358tZ1.m22618w(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: f */
        public byte mo22608f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: g */
        public byte mo22607g(Object obj, long j) {
            return AbstractC22358tZ1.f80231w ? AbstractC22358tZ1.m22615z(obj, j) : AbstractC22358tZ1.m22667A(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: h */
        public double mo22606h(Object obj, long j) {
            return Double.longBitsToDouble(m22602l(obj, j));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: i */
        public float mo22605i(Object obj, long j) {
            return Float.intBitsToFloat(m22604j(obj, j));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: k */
        public long mo22603k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: o */
        public void mo22599o(Object obj, long j, boolean z) {
            if (AbstractC22358tZ1.f80231w) {
                AbstractC22358tZ1.m22653O(obj, j, z);
            } else {
                AbstractC22358tZ1.m22652P(obj, j, z);
            }
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: p */
        public void mo22598p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: q */
        public void mo22597q(Object obj, long j, byte b) {
            if (AbstractC22358tZ1.f80231w) {
                AbstractC22358tZ1.m22649S(obj, j, b);
            } else {
                AbstractC22358tZ1.m22648T(obj, j, b);
            }
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: r */
        public void mo22596r(Object obj, long j, double d) {
            m22593u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: s */
        public void mo22595s(Object obj, long j, float f) {
            m22594t(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: x */
        public boolean mo22590x() {
            return false;
        }
    }

    /* renamed from: tZ1$d */
    /* loaded from: classes4.dex */
    public static final class C13995d extends AbstractC13996e {
        public C13995d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: c */
        public void mo22611c(long j, byte[] bArr, long j2, long j3) {
            this.f80232a.copyMemory((Object) null, j, bArr, AbstractC22358tZ1.f80216h + j2, j3);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: d */
        public void mo22610d(byte[] bArr, long j, long j2, long j3) {
            this.f80232a.copyMemory(bArr, AbstractC22358tZ1.f80216h + j, (Object) null, j2, j3);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: e */
        public boolean mo22609e(Object obj, long j) {
            return this.f80232a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: f */
        public byte mo22608f(long j) {
            return this.f80232a.getByte(j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: g */
        public byte mo22607g(Object obj, long j) {
            return this.f80232a.getByte(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: h */
        public double mo22606h(Object obj, long j) {
            return this.f80232a.getDouble(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: i */
        public float mo22605i(Object obj, long j) {
            return this.f80232a.getFloat(obj, j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: k */
        public long mo22603k(long j) {
            return this.f80232a.getLong(j);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: o */
        public void mo22599o(Object obj, long j, boolean z) {
            this.f80232a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: p */
        public void mo22598p(long j, byte b) {
            this.f80232a.putByte(j, b);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: q */
        public void mo22597q(Object obj, long j, byte b) {
            this.f80232a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: r */
        public void mo22596r(Object obj, long j, double d) {
            this.f80232a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: s */
        public void mo22595s(Object obj, long j, float f) {
            this.f80232a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: w */
        public boolean mo22591w() {
            if (!super.mo22591w()) {
                return false;
            }
            try {
                Class<?> cls = this.f80232a.getClass();
                Class<?> cls2 = Long.TYPE;
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
                AbstractC22358tZ1.m22656L(th2);
                return false;
            }
        }

        @Override // p000.AbstractC22358tZ1.AbstractC13996e
        /* renamed from: x */
        public boolean mo22590x() {
            if (!super.mo22590x()) {
                return false;
            }
            try {
                Class<?> cls = this.f80232a.getClass();
                Class<?> cls2 = Long.TYPE;
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
                AbstractC22358tZ1.m22656L(th2);
                return false;
            }
        }
    }

    /* renamed from: tZ1$e */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC13996e {

        /* renamed from: a */
        public Unsafe f80232a;

        public AbstractC13996e(Unsafe unsafe) {
            this.f80232a = unsafe;
        }

        /* renamed from: a */
        public final int m22613a(Class cls) {
            return this.f80232a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m22612b(Class cls) {
            return this.f80232a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo22611c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo22610d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo22609e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo22608f(long j);

        /* renamed from: g */
        public abstract byte mo22607g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo22606h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo22605i(Object obj, long j);

        /* renamed from: j */
        public final int m22604j(Object obj, long j) {
            return this.f80232a.getInt(obj, j);
        }

        /* renamed from: k */
        public abstract long mo22603k(long j);

        /* renamed from: l */
        public final long m22602l(Object obj, long j) {
            return this.f80232a.getLong(obj, j);
        }

        /* renamed from: m */
        public final Object m22601m(Object obj, long j) {
            return this.f80232a.getObject(obj, j);
        }

        /* renamed from: n */
        public final long m22600n(Field field) {
            return this.f80232a.objectFieldOffset(field);
        }

        /* renamed from: o */
        public abstract void mo22599o(Object obj, long j, boolean z);

        /* renamed from: p */
        public abstract void mo22598p(long j, byte b);

        /* renamed from: q */
        public abstract void mo22597q(Object obj, long j, byte b);

        /* renamed from: r */
        public abstract void mo22596r(Object obj, long j, double d);

        /* renamed from: s */
        public abstract void mo22595s(Object obj, long j, float f);

        /* renamed from: t */
        public final void m22594t(Object obj, long j, int i) {
            this.f80232a.putInt(obj, j, i);
        }

        /* renamed from: u */
        public final void m22593u(Object obj, long j, long j2) {
            this.f80232a.putLong(obj, j, j2);
        }

        /* renamed from: v */
        public final void m22592v(Object obj, long j, Object obj2) {
            this.f80232a.putObject(obj, j, obj2);
        }

        /* renamed from: w */
        public boolean mo22591w() {
            Unsafe unsafe = this.f80232a;
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
                return true;
            } catch (Throwable th2) {
                AbstractC22358tZ1.m22656L(th2);
                return false;
            }
        }

        /* renamed from: x */
        public boolean mo22590x() {
            Unsafe unsafe = this.f80232a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (AbstractC22358tZ1.m22626o() != null) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                AbstractC22358tZ1.m22656L(th2);
                return false;
            }
        }
    }

    static {
        boolean z;
        long m22628m = m22628m(byte[].class);
        f80216h = m22628m;
        f80217i = m22628m(boolean[].class);
        f80218j = m22627n(boolean[].class);
        f80219k = m22628m(int[].class);
        f80220l = m22627n(int[].class);
        f80221m = m22628m(long[].class);
        f80222n = m22627n(long[].class);
        f80223o = m22628m(float[].class);
        f80224p = m22627n(float[].class);
        f80225q = m22628m(double[].class);
        f80226r = m22627n(double[].class);
        f80227s = m22628m(Object[].class);
        f80228t = m22627n(Object[].class);
        f80229u = m22621t(m22626o());
        f80230v = (int) (m22628m & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f80231w = z;
    }

    /* renamed from: A */
    public static byte m22667A(Object obj, long j) {
        return (byte) ((m22664D(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: B */
    public static double m22666B(Object obj, long j) {
        return f80213e.mo22606h(obj, j);
    }

    /* renamed from: C */
    public static float m22665C(Object obj, long j) {
        return f80213e.mo22605i(obj, j);
    }

    /* renamed from: D */
    public static int m22664D(Object obj, long j) {
        return f80213e.m22604j(obj, j);
    }

    /* renamed from: E */
    public static long m22663E(long j) {
        return f80213e.mo22603k(j);
    }

    /* renamed from: F */
    public static long m22662F(Object obj, long j) {
        return f80213e.m22602l(obj, j);
    }

    /* renamed from: G */
    public static AbstractC13996e m22661G() {
        Unsafe unsafe = f80209a;
        if (unsafe == null) {
            return null;
        }
        if (AbstractC1482V2.m66071c()) {
            if (f80211c) {
                return new C13994c(unsafe);
            }
            if (!f80212d) {
                return null;
            }
            return new C13993b(unsafe);
        }
        return new C13995d(unsafe);
    }

    /* renamed from: H */
    public static Object m22660H(Object obj, long j) {
        return f80213e.m22601m(obj, j);
    }

    /* renamed from: I */
    public static Unsafe m22659I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C13992a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static boolean m22658J() {
        return f80215g;
    }

    /* renamed from: K */
    public static boolean m22657K() {
        return f80214f;
    }

    /* renamed from: L */
    public static void m22656L(Throwable th2) {
        Logger logger = Logger.getLogger(AbstractC22358tZ1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* renamed from: M */
    public static long m22655M(Field field) {
        return f80213e.m22600n(field);
    }

    /* renamed from: N */
    public static void m22654N(Object obj, long j, boolean z) {
        f80213e.mo22599o(obj, j, z);
    }

    /* renamed from: O */
    public static void m22653O(Object obj, long j, boolean z) {
        m22649S(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: P */
    public static void m22652P(Object obj, long j, boolean z) {
        m22648T(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: Q */
    public static void m22651Q(long j, byte b) {
        f80213e.mo22598p(j, b);
    }

    /* renamed from: R */
    public static void m22650R(byte[] bArr, long j, byte b) {
        f80213e.mo22597q(bArr, f80216h + j, b);
    }

    /* renamed from: S */
    public static void m22649S(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m22664D = m22664D(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m22645W(obj, j2, ((255 & b) << i) | (m22664D & (~(255 << i))));
    }

    /* renamed from: T */
    public static void m22648T(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m22645W(obj, j2, ((255 & b) << i) | (m22664D(obj, j2) & (~(255 << i))));
    }

    /* renamed from: U */
    public static void m22647U(Object obj, long j, double d) {
        f80213e.mo22596r(obj, j, d);
    }

    /* renamed from: V */
    public static void m22646V(Object obj, long j, float f) {
        f80213e.mo22595s(obj, j, f);
    }

    /* renamed from: W */
    public static void m22645W(Object obj, long j, int i) {
        f80213e.m22594t(obj, j, i);
    }

    /* renamed from: X */
    public static void m22644X(Object obj, long j, long j2) {
        f80213e.m22593u(obj, j, j2);
    }

    /* renamed from: Y */
    public static void m22643Y(Object obj, long j, Object obj2) {
        f80213e.m22592v(obj, j, obj2);
    }

    /* renamed from: Z */
    public static boolean m22642Z() {
        AbstractC13996e abstractC13996e = f80213e;
        if (abstractC13996e == null) {
            return false;
        }
        return abstractC13996e.mo22591w();
    }

    /* renamed from: a0 */
    public static boolean m22640a0() {
        AbstractC13996e abstractC13996e = f80213e;
        if (abstractC13996e == null) {
            return false;
        }
        return abstractC13996e.mo22590x();
    }

    /* renamed from: k */
    public static long m22630k(ByteBuffer byteBuffer) {
        return f80213e.m22602l(byteBuffer, f80229u);
    }

    /* renamed from: l */
    public static Object m22629l(Class cls) {
        try {
            return f80209a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    public static int m22628m(Class cls) {
        if (f80215g) {
            return f80213e.m22613a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static int m22627n(Class cls) {
        if (f80215g) {
            return f80213e.m22612b(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static Field m22626o() {
        Field m22622s;
        if (AbstractC1482V2.m66071c() && (m22622s = m22622s(Buffer.class, "effectiveDirectAddress")) != null) {
            return m22622s;
        }
        Field m22622s2 = m22622s(Buffer.class, "address");
        if (m22622s2 == null || m22622s2.getType() != Long.TYPE) {
            return null;
        }
        return m22622s2;
    }

    /* renamed from: p */
    public static void m22625p(long j, byte[] bArr, long j2, long j3) {
        f80213e.mo22611c(j, bArr, j2, j3);
    }

    /* renamed from: q */
    public static void m22624q(byte[] bArr, long j, long j2, long j3) {
        f80213e.mo22610d(bArr, j, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static boolean m22623r(Class cls) {
        if (!AbstractC1482V2.m66071c()) {
            return false;
        }
        try {
            Class cls2 = f80210b;
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

    /* renamed from: s */
    public static Field m22622s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static long m22621t(Field field) {
        AbstractC13996e abstractC13996e;
        if (field != null && (abstractC13996e = f80213e) != null) {
            return abstractC13996e.m22600n(field);
        }
        return -1L;
    }

    /* renamed from: u */
    public static boolean m22620u(Object obj, long j) {
        return f80213e.mo22609e(obj, j);
    }

    /* renamed from: v */
    public static boolean m22619v(Object obj, long j) {
        if (m22615z(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m22618w(Object obj, long j) {
        if (m22667A(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static byte m22617x(long j) {
        return f80213e.mo22608f(j);
    }

    /* renamed from: y */
    public static byte m22616y(byte[] bArr, long j) {
        return f80213e.mo22607g(bArr, f80216h + j);
    }

    /* renamed from: z */
    public static byte m22615z(Object obj, long j) {
        return (byte) ((m22664D(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }
}