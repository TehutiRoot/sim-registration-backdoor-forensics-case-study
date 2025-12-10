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

/* renamed from: wY1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22806wY1 {

    /* renamed from: a */
    public static final Unsafe f108031a = m819I();

    /* renamed from: b */
    public static final Class f108032b = AbstractC1503V2.m65949b();

    /* renamed from: c */
    public static final boolean f108033c = m783r(Long.TYPE);

    /* renamed from: d */
    public static final boolean f108034d = m783r(Integer.TYPE);

    /* renamed from: e */
    public static final AbstractC16980e f108035e = m821G();

    /* renamed from: f */
    public static final boolean f108036f = m800a0();

    /* renamed from: g */
    public static final boolean f108037g = m802Z();

    /* renamed from: h */
    public static final long f108038h;

    /* renamed from: i */
    public static final long f108039i;

    /* renamed from: j */
    public static final long f108040j;

    /* renamed from: k */
    public static final long f108041k;

    /* renamed from: l */
    public static final long f108042l;

    /* renamed from: m */
    public static final long f108043m;

    /* renamed from: n */
    public static final long f108044n;

    /* renamed from: o */
    public static final long f108045o;

    /* renamed from: p */
    public static final long f108046p;

    /* renamed from: q */
    public static final long f108047q;

    /* renamed from: r */
    public static final long f108048r;

    /* renamed from: s */
    public static final long f108049s;

    /* renamed from: t */
    public static final long f108050t;

    /* renamed from: u */
    public static final long f108051u;

    /* renamed from: v */
    public static final int f108052v;

    /* renamed from: w */
    public static final boolean f108053w;

    /* renamed from: wY1$a */
    /* loaded from: classes4.dex */
    public class C16976a implements PrivilegedExceptionAction {
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

    /* renamed from: wY1$b */
    /* loaded from: classes4.dex */
    public static final class C16977b extends AbstractC16980e {
        public C16977b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: c */
        public void mo771c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: d */
        public void mo770d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: e */
        public boolean mo769e(Object obj, long j) {
            return AbstractC22806wY1.f108053w ? AbstractC22806wY1.m779v(obj, j) : AbstractC22806wY1.m778w(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: f */
        public byte mo768f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: g */
        public byte mo767g(Object obj, long j) {
            return AbstractC22806wY1.f108053w ? AbstractC22806wY1.m775z(obj, j) : AbstractC22806wY1.m827A(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: h */
        public double mo766h(Object obj, long j) {
            return Double.longBitsToDouble(m762l(obj, j));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: i */
        public float mo765i(Object obj, long j) {
            return Float.intBitsToFloat(m764j(obj, j));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: k */
        public long mo763k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: o */
        public void mo759o(Object obj, long j, boolean z) {
            if (AbstractC22806wY1.f108053w) {
                AbstractC22806wY1.m813O(obj, j, z);
            } else {
                AbstractC22806wY1.m812P(obj, j, z);
            }
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: p */
        public void mo758p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: q */
        public void mo757q(Object obj, long j, byte b) {
            if (AbstractC22806wY1.f108053w) {
                AbstractC22806wY1.m809S(obj, j, b);
            } else {
                AbstractC22806wY1.m808T(obj, j, b);
            }
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: r */
        public void mo756r(Object obj, long j, double d) {
            m753u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: s */
        public void mo755s(Object obj, long j, float f) {
            m754t(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: x */
        public boolean mo750x() {
            return false;
        }
    }

    /* renamed from: wY1$c */
    /* loaded from: classes4.dex */
    public static final class C16978c extends AbstractC16980e {
        public C16978c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: c */
        public void mo771c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: d */
        public void mo770d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: e */
        public boolean mo769e(Object obj, long j) {
            return AbstractC22806wY1.f108053w ? AbstractC22806wY1.m779v(obj, j) : AbstractC22806wY1.m778w(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: f */
        public byte mo768f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: g */
        public byte mo767g(Object obj, long j) {
            return AbstractC22806wY1.f108053w ? AbstractC22806wY1.m775z(obj, j) : AbstractC22806wY1.m827A(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: h */
        public double mo766h(Object obj, long j) {
            return Double.longBitsToDouble(m762l(obj, j));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: i */
        public float mo765i(Object obj, long j) {
            return Float.intBitsToFloat(m764j(obj, j));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: k */
        public long mo763k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: o */
        public void mo759o(Object obj, long j, boolean z) {
            if (AbstractC22806wY1.f108053w) {
                AbstractC22806wY1.m813O(obj, j, z);
            } else {
                AbstractC22806wY1.m812P(obj, j, z);
            }
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: p */
        public void mo758p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: q */
        public void mo757q(Object obj, long j, byte b) {
            if (AbstractC22806wY1.f108053w) {
                AbstractC22806wY1.m809S(obj, j, b);
            } else {
                AbstractC22806wY1.m808T(obj, j, b);
            }
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: r */
        public void mo756r(Object obj, long j, double d) {
            m753u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: s */
        public void mo755s(Object obj, long j, float f) {
            m754t(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: x */
        public boolean mo750x() {
            return false;
        }
    }

    /* renamed from: wY1$d */
    /* loaded from: classes4.dex */
    public static final class C16979d extends AbstractC16980e {
        public C16979d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: c */
        public void mo771c(long j, byte[] bArr, long j2, long j3) {
            this.f108054a.copyMemory((Object) null, j, bArr, AbstractC22806wY1.f108038h + j2, j3);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: d */
        public void mo770d(byte[] bArr, long j, long j2, long j3) {
            this.f108054a.copyMemory(bArr, AbstractC22806wY1.f108038h + j, (Object) null, j2, j3);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: e */
        public boolean mo769e(Object obj, long j) {
            return this.f108054a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: f */
        public byte mo768f(long j) {
            return this.f108054a.getByte(j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: g */
        public byte mo767g(Object obj, long j) {
            return this.f108054a.getByte(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: h */
        public double mo766h(Object obj, long j) {
            return this.f108054a.getDouble(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: i */
        public float mo765i(Object obj, long j) {
            return this.f108054a.getFloat(obj, j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: k */
        public long mo763k(long j) {
            return this.f108054a.getLong(j);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: o */
        public void mo759o(Object obj, long j, boolean z) {
            this.f108054a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: p */
        public void mo758p(long j, byte b) {
            this.f108054a.putByte(j, b);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: q */
        public void mo757q(Object obj, long j, byte b) {
            this.f108054a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: r */
        public void mo756r(Object obj, long j, double d) {
            this.f108054a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: s */
        public void mo755s(Object obj, long j, float f) {
            this.f108054a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: w */
        public boolean mo751w() {
            if (!super.mo751w()) {
                return false;
            }
            try {
                Class<?> cls = this.f108054a.getClass();
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
                AbstractC22806wY1.m816L(th2);
                return false;
            }
        }

        @Override // p000.AbstractC22806wY1.AbstractC16980e
        /* renamed from: x */
        public boolean mo750x() {
            if (!super.mo750x()) {
                return false;
            }
            try {
                Class<?> cls = this.f108054a.getClass();
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
                AbstractC22806wY1.m816L(th2);
                return false;
            }
        }
    }

    /* renamed from: wY1$e */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC16980e {

        /* renamed from: a */
        public Unsafe f108054a;

        public AbstractC16980e(Unsafe unsafe) {
            this.f108054a = unsafe;
        }

        /* renamed from: a */
        public final int m773a(Class cls) {
            return this.f108054a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m772b(Class cls) {
            return this.f108054a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo771c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo770d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo769e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo768f(long j);

        /* renamed from: g */
        public abstract byte mo767g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo766h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo765i(Object obj, long j);

        /* renamed from: j */
        public final int m764j(Object obj, long j) {
            return this.f108054a.getInt(obj, j);
        }

        /* renamed from: k */
        public abstract long mo763k(long j);

        /* renamed from: l */
        public final long m762l(Object obj, long j) {
            return this.f108054a.getLong(obj, j);
        }

        /* renamed from: m */
        public final Object m761m(Object obj, long j) {
            return this.f108054a.getObject(obj, j);
        }

        /* renamed from: n */
        public final long m760n(Field field) {
            return this.f108054a.objectFieldOffset(field);
        }

        /* renamed from: o */
        public abstract void mo759o(Object obj, long j, boolean z);

        /* renamed from: p */
        public abstract void mo758p(long j, byte b);

        /* renamed from: q */
        public abstract void mo757q(Object obj, long j, byte b);

        /* renamed from: r */
        public abstract void mo756r(Object obj, long j, double d);

        /* renamed from: s */
        public abstract void mo755s(Object obj, long j, float f);

        /* renamed from: t */
        public final void m754t(Object obj, long j, int i) {
            this.f108054a.putInt(obj, j, i);
        }

        /* renamed from: u */
        public final void m753u(Object obj, long j, long j2) {
            this.f108054a.putLong(obj, j, j2);
        }

        /* renamed from: v */
        public final void m752v(Object obj, long j, Object obj2) {
            this.f108054a.putObject(obj, j, obj2);
        }

        /* renamed from: w */
        public boolean mo751w() {
            Unsafe unsafe = this.f108054a;
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
                AbstractC22806wY1.m816L(th2);
                return false;
            }
        }

        /* renamed from: x */
        public boolean mo750x() {
            Unsafe unsafe = this.f108054a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (AbstractC22806wY1.m786o() != null) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                AbstractC22806wY1.m816L(th2);
                return false;
            }
        }
    }

    static {
        boolean z;
        long m788m = m788m(byte[].class);
        f108038h = m788m;
        f108039i = m788m(boolean[].class);
        f108040j = m787n(boolean[].class);
        f108041k = m788m(int[].class);
        f108042l = m787n(int[].class);
        f108043m = m788m(long[].class);
        f108044n = m787n(long[].class);
        f108045o = m788m(float[].class);
        f108046p = m787n(float[].class);
        f108047q = m788m(double[].class);
        f108048r = m787n(double[].class);
        f108049s = m788m(Object[].class);
        f108050t = m787n(Object[].class);
        f108051u = m781t(m786o());
        f108052v = (int) (m788m & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f108053w = z;
    }

    /* renamed from: A */
    public static byte m827A(Object obj, long j) {
        return (byte) ((m824D(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: B */
    public static double m826B(Object obj, long j) {
        return f108035e.mo766h(obj, j);
    }

    /* renamed from: C */
    public static float m825C(Object obj, long j) {
        return f108035e.mo765i(obj, j);
    }

    /* renamed from: D */
    public static int m824D(Object obj, long j) {
        return f108035e.m764j(obj, j);
    }

    /* renamed from: E */
    public static long m823E(long j) {
        return f108035e.mo763k(j);
    }

    /* renamed from: F */
    public static long m822F(Object obj, long j) {
        return f108035e.m762l(obj, j);
    }

    /* renamed from: G */
    public static AbstractC16980e m821G() {
        Unsafe unsafe = f108031a;
        if (unsafe == null) {
            return null;
        }
        if (AbstractC1503V2.m65948c()) {
            if (f108033c) {
                return new C16978c(unsafe);
            }
            if (!f108034d) {
                return null;
            }
            return new C16977b(unsafe);
        }
        return new C16979d(unsafe);
    }

    /* renamed from: H */
    public static Object m820H(Object obj, long j) {
        return f108035e.m761m(obj, j);
    }

    /* renamed from: I */
    public static Unsafe m819I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16976a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static boolean m818J() {
        return f108037g;
    }

    /* renamed from: K */
    public static boolean m817K() {
        return f108036f;
    }

    /* renamed from: L */
    public static void m816L(Throwable th2) {
        Logger logger = Logger.getLogger(AbstractC22806wY1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* renamed from: M */
    public static long m815M(Field field) {
        return f108035e.m760n(field);
    }

    /* renamed from: N */
    public static void m814N(Object obj, long j, boolean z) {
        f108035e.mo759o(obj, j, z);
    }

    /* renamed from: O */
    public static void m813O(Object obj, long j, boolean z) {
        m809S(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: P */
    public static void m812P(Object obj, long j, boolean z) {
        m808T(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: Q */
    public static void m811Q(long j, byte b) {
        f108035e.mo758p(j, b);
    }

    /* renamed from: R */
    public static void m810R(byte[] bArr, long j, byte b) {
        f108035e.mo757q(bArr, f108038h + j, b);
    }

    /* renamed from: S */
    public static void m809S(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m824D = m824D(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m805W(obj, j2, ((255 & b) << i) | (m824D & (~(255 << i))));
    }

    /* renamed from: T */
    public static void m808T(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m805W(obj, j2, ((255 & b) << i) | (m824D(obj, j2) & (~(255 << i))));
    }

    /* renamed from: U */
    public static void m807U(Object obj, long j, double d) {
        f108035e.mo756r(obj, j, d);
    }

    /* renamed from: V */
    public static void m806V(Object obj, long j, float f) {
        f108035e.mo755s(obj, j, f);
    }

    /* renamed from: W */
    public static void m805W(Object obj, long j, int i) {
        f108035e.m754t(obj, j, i);
    }

    /* renamed from: X */
    public static void m804X(Object obj, long j, long j2) {
        f108035e.m753u(obj, j, j2);
    }

    /* renamed from: Y */
    public static void m803Y(Object obj, long j, Object obj2) {
        f108035e.m752v(obj, j, obj2);
    }

    /* renamed from: Z */
    public static boolean m802Z() {
        AbstractC16980e abstractC16980e = f108035e;
        if (abstractC16980e == null) {
            return false;
        }
        return abstractC16980e.mo751w();
    }

    /* renamed from: a0 */
    public static boolean m800a0() {
        AbstractC16980e abstractC16980e = f108035e;
        if (abstractC16980e == null) {
            return false;
        }
        return abstractC16980e.mo750x();
    }

    /* renamed from: k */
    public static long m790k(ByteBuffer byteBuffer) {
        return f108035e.m762l(byteBuffer, f108051u);
    }

    /* renamed from: l */
    public static Object m789l(Class cls) {
        try {
            return f108031a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    public static int m788m(Class cls) {
        if (f108037g) {
            return f108035e.m773a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static int m787n(Class cls) {
        if (f108037g) {
            return f108035e.m772b(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static Field m786o() {
        Field m782s;
        if (AbstractC1503V2.m65948c() && (m782s = m782s(Buffer.class, "effectiveDirectAddress")) != null) {
            return m782s;
        }
        Field m782s2 = m782s(Buffer.class, "address");
        if (m782s2 == null || m782s2.getType() != Long.TYPE) {
            return null;
        }
        return m782s2;
    }

    /* renamed from: p */
    public static void m785p(long j, byte[] bArr, long j2, long j3) {
        f108035e.mo771c(j, bArr, j2, j3);
    }

    /* renamed from: q */
    public static void m784q(byte[] bArr, long j, long j2, long j3) {
        f108035e.mo770d(bArr, j, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static boolean m783r(Class cls) {
        if (!AbstractC1503V2.m65948c()) {
            return false;
        }
        try {
            Class cls2 = f108032b;
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
    public static Field m782s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static long m781t(Field field) {
        AbstractC16980e abstractC16980e;
        if (field != null && (abstractC16980e = f108035e) != null) {
            return abstractC16980e.m760n(field);
        }
        return -1L;
    }

    /* renamed from: u */
    public static boolean m780u(Object obj, long j) {
        return f108035e.mo769e(obj, j);
    }

    /* renamed from: v */
    public static boolean m779v(Object obj, long j) {
        if (m775z(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m778w(Object obj, long j) {
        if (m827A(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static byte m777x(long j) {
        return f108035e.mo768f(j);
    }

    /* renamed from: y */
    public static byte m776y(byte[] bArr, long j) {
        return f108035e.mo767g(bArr, f108038h + j);
    }

    /* renamed from: z */
    public static byte m775z(Object obj, long j) {
        return (byte) ((m824D(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }
}
