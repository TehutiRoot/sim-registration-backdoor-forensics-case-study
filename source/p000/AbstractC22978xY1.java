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

/* renamed from: xY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22978xY1 {

    /* renamed from: a */
    public static final Logger f108404a = Logger.getLogger(AbstractC22978xY1.class.getName());

    /* renamed from: b */
    public static final Unsafe f108405b = m492G();

    /* renamed from: c */
    public static final Class f108406c = AbstractC1582W2.m65706b();

    /* renamed from: d */
    public static final boolean f108407d = m459p(Long.TYPE);

    /* renamed from: e */
    public static final boolean f108408e = m459p(Integer.TYPE);

    /* renamed from: f */
    public static final AbstractC17060e f108409f = m494E();

    /* renamed from: g */
    public static final boolean f108410g = m475X();

    /* renamed from: h */
    public static final boolean f108411h = m476W();

    /* renamed from: i */
    public static final long f108412i;

    /* renamed from: j */
    public static final long f108413j;

    /* renamed from: k */
    public static final long f108414k;

    /* renamed from: l */
    public static final long f108415l;

    /* renamed from: m */
    public static final long f108416m;

    /* renamed from: n */
    public static final long f108417n;

    /* renamed from: o */
    public static final long f108418o;

    /* renamed from: p */
    public static final long f108419p;

    /* renamed from: q */
    public static final long f108420q;

    /* renamed from: r */
    public static final long f108421r;

    /* renamed from: s */
    public static final long f108422s;

    /* renamed from: t */
    public static final long f108423t;

    /* renamed from: u */
    public static final long f108424u;

    /* renamed from: v */
    public static final long f108425v;

    /* renamed from: w */
    public static final int f108426w;

    /* renamed from: x */
    public static final boolean f108427x;

    /* renamed from: xY1$a */
    /* loaded from: classes2.dex */
    public static class C17056a implements PrivilegedExceptionAction {
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

    /* renamed from: xY1$b */
    /* loaded from: classes2.dex */
    public static final class C17057b extends AbstractC17060e {
        public C17057b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: c */
        public void mo445c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: d */
        public void mo444d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: e */
        public boolean mo443e(Object obj, long j) {
            return AbstractC22978xY1.f108427x ? AbstractC22978xY1.m455t(obj, j) : AbstractC22978xY1.m454u(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: f */
        public byte mo442f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: g */
        public byte mo441g(Object obj, long j) {
            return AbstractC22978xY1.f108427x ? AbstractC22978xY1.m451x(obj, j) : AbstractC22978xY1.m450y(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: h */
        public double mo440h(Object obj, long j) {
            return Double.longBitsToDouble(m436l(obj, j));
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: i */
        public float mo439i(Object obj, long j) {
            return Float.intBitsToFloat(m438j(obj, j));
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: k */
        public long mo437k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: o */
        public void mo433o(Object obj, long j, boolean z) {
            if (AbstractC22978xY1.f108427x) {
                AbstractC22978xY1.m487L(obj, j, z);
            } else {
                AbstractC22978xY1.m486M(obj, j, z);
            }
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: p */
        public void mo432p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: q */
        public void mo431q(Object obj, long j, byte b) {
            if (AbstractC22978xY1.f108427x) {
                AbstractC22978xY1.m483P(obj, j, b);
            } else {
                AbstractC22978xY1.m482Q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: r */
        public void mo430r(Object obj, long j, double d) {
            m427u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: s */
        public void mo429s(Object obj, long j, float f) {
            m428t(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: xY1$c */
    /* loaded from: classes2.dex */
    public static final class C17058c extends AbstractC17060e {
        public C17058c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: c */
        public void mo445c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: d */
        public void mo444d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: e */
        public boolean mo443e(Object obj, long j) {
            return AbstractC22978xY1.f108427x ? AbstractC22978xY1.m455t(obj, j) : AbstractC22978xY1.m454u(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: f */
        public byte mo442f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: g */
        public byte mo441g(Object obj, long j) {
            return AbstractC22978xY1.f108427x ? AbstractC22978xY1.m451x(obj, j) : AbstractC22978xY1.m450y(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: h */
        public double mo440h(Object obj, long j) {
            return Double.longBitsToDouble(m436l(obj, j));
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: i */
        public float mo439i(Object obj, long j) {
            return Float.intBitsToFloat(m438j(obj, j));
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: k */
        public long mo437k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: o */
        public void mo433o(Object obj, long j, boolean z) {
            if (AbstractC22978xY1.f108427x) {
                AbstractC22978xY1.m487L(obj, j, z);
            } else {
                AbstractC22978xY1.m486M(obj, j, z);
            }
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: p */
        public void mo432p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: q */
        public void mo431q(Object obj, long j, byte b) {
            if (AbstractC22978xY1.f108427x) {
                AbstractC22978xY1.m483P(obj, j, b);
            } else {
                AbstractC22978xY1.m482Q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: r */
        public void mo430r(Object obj, long j, double d) {
            m427u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: s */
        public void mo429s(Object obj, long j, float f) {
            m428t(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: xY1$d */
    /* loaded from: classes2.dex */
    public static final class C17059d extends AbstractC17060e {
        public C17059d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: c */
        public void mo445c(long j, byte[] bArr, long j2, long j3) {
            this.f108428a.copyMemory((Object) null, j, bArr, AbstractC22978xY1.f108412i + j2, j3);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: d */
        public void mo444d(byte[] bArr, long j, long j2, long j3) {
            this.f108428a.copyMemory(bArr, AbstractC22978xY1.f108412i + j, (Object) null, j2, j3);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: e */
        public boolean mo443e(Object obj, long j) {
            return this.f108428a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: f */
        public byte mo442f(long j) {
            return this.f108428a.getByte(j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: g */
        public byte mo441g(Object obj, long j) {
            return this.f108428a.getByte(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: h */
        public double mo440h(Object obj, long j) {
            return this.f108428a.getDouble(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: i */
        public float mo439i(Object obj, long j) {
            return this.f108428a.getFloat(obj, j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: k */
        public long mo437k(long j) {
            return this.f108428a.getLong(j);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: o */
        public void mo433o(Object obj, long j, boolean z) {
            this.f108428a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: p */
        public void mo432p(long j, byte b) {
            this.f108428a.putByte(j, b);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: q */
        public void mo431q(Object obj, long j, byte b) {
            this.f108428a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: r */
        public void mo430r(Object obj, long j, double d) {
            this.f108428a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC22978xY1.AbstractC17060e
        /* renamed from: s */
        public void mo429s(Object obj, long j, float f) {
            this.f108428a.putFloat(obj, j, f);
        }
    }

    /* renamed from: xY1$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC17060e {

        /* renamed from: a */
        public Unsafe f108428a;

        public AbstractC17060e(Unsafe unsafe) {
            this.f108428a = unsafe;
        }

        /* renamed from: a */
        public final int m447a(Class cls) {
            return this.f108428a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m446b(Class cls) {
            return this.f108428a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo445c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo444d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo443e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo442f(long j);

        /* renamed from: g */
        public abstract byte mo441g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo440h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo439i(Object obj, long j);

        /* renamed from: j */
        public final int m438j(Object obj, long j) {
            return this.f108428a.getInt(obj, j);
        }

        /* renamed from: k */
        public abstract long mo437k(long j);

        /* renamed from: l */
        public final long m436l(Object obj, long j) {
            return this.f108428a.getLong(obj, j);
        }

        /* renamed from: m */
        public final Object m435m(Object obj, long j) {
            return this.f108428a.getObject(obj, j);
        }

        /* renamed from: n */
        public final long m434n(Field field) {
            return this.f108428a.objectFieldOffset(field);
        }

        /* renamed from: o */
        public abstract void mo433o(Object obj, long j, boolean z);

        /* renamed from: p */
        public abstract void mo432p(long j, byte b);

        /* renamed from: q */
        public abstract void mo431q(Object obj, long j, byte b);

        /* renamed from: r */
        public abstract void mo430r(Object obj, long j, double d);

        /* renamed from: s */
        public abstract void mo429s(Object obj, long j, float f);

        /* renamed from: t */
        public final void m428t(Object obj, long j, int i) {
            this.f108428a.putInt(obj, j, i);
        }

        /* renamed from: u */
        public final void m427u(Object obj, long j, long j2) {
            this.f108428a.putLong(obj, j, j2);
        }

        /* renamed from: v */
        public final void m426v(Object obj, long j, Object obj2) {
            this.f108428a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z;
        long m464k = m464k(byte[].class);
        f108412i = m464k;
        f108413j = m464k(boolean[].class);
        f108414k = m463l(boolean[].class);
        f108415l = m464k(int[].class);
        f108416m = m463l(int[].class);
        f108417n = m464k(long[].class);
        f108418o = m463l(long[].class);
        f108419p = m464k(float[].class);
        f108420q = m463l(float[].class);
        f108421r = m464k(double[].class);
        f108422s = m463l(double[].class);
        f108423t = m464k(Object[].class);
        f108424u = m463l(Object[].class);
        f108425v = m457r(m462m());
        f108426w = (int) (m464k & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f108427x = z;
    }

    /* renamed from: A */
    public static float m498A(Object obj, long j) {
        return f108409f.mo439i(obj, j);
    }

    /* renamed from: B */
    public static int m497B(Object obj, long j) {
        return f108409f.m438j(obj, j);
    }

    /* renamed from: C */
    public static long m496C(long j) {
        return f108409f.mo437k(j);
    }

    /* renamed from: D */
    public static long m495D(Object obj, long j) {
        return f108409f.m436l(obj, j);
    }

    /* renamed from: E */
    public static AbstractC17060e m494E() {
        Unsafe unsafe = f108405b;
        if (unsafe == null) {
            return null;
        }
        if (AbstractC1582W2.m65705c()) {
            if (f108407d) {
                return new C17058c(unsafe);
            }
            if (!f108408e) {
                return null;
            }
            return new C17057b(unsafe);
        }
        return new C17059d(unsafe);
    }

    /* renamed from: F */
    public static Object m493F(Object obj, long j) {
        return f108409f.m435m(obj, j);
    }

    /* renamed from: G */
    public static Unsafe m492G() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C17056a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static boolean m491H() {
        return f108411h;
    }

    /* renamed from: I */
    public static boolean m490I() {
        return f108410g;
    }

    /* renamed from: J */
    public static long m489J(Field field) {
        return f108409f.m434n(field);
    }

    /* renamed from: K */
    public static void m488K(Object obj, long j, boolean z) {
        f108409f.mo433o(obj, j, z);
    }

    /* renamed from: L */
    public static void m487L(Object obj, long j, boolean z) {
        m483P(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: M */
    public static void m486M(Object obj, long j, boolean z) {
        m482Q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: N */
    public static void m485N(long j, byte b) {
        f108409f.mo432p(j, b);
    }

    /* renamed from: O */
    public static void m484O(byte[] bArr, long j, byte b) {
        f108409f.mo431q(bArr, f108412i + j, b);
    }

    /* renamed from: P */
    public static void m483P(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m497B = m497B(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m479T(obj, j2, ((255 & b) << i) | (m497B & (~(255 << i))));
    }

    /* renamed from: Q */
    public static void m482Q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m479T(obj, j2, ((255 & b) << i) | (m497B(obj, j2) & (~(255 << i))));
    }

    /* renamed from: R */
    public static void m481R(Object obj, long j, double d) {
        f108409f.mo430r(obj, j, d);
    }

    /* renamed from: S */
    public static void m480S(Object obj, long j, float f) {
        f108409f.mo429s(obj, j, f);
    }

    /* renamed from: T */
    public static void m479T(Object obj, long j, int i) {
        f108409f.m428t(obj, j, i);
    }

    /* renamed from: U */
    public static void m478U(Object obj, long j, long j2) {
        f108409f.m427u(obj, j, j2);
    }

    /* renamed from: V */
    public static void m477V(Object obj, long j, Object obj2) {
        f108409f.m426v(obj, j, obj2);
    }

    /* renamed from: W */
    public static boolean m476W() {
        Unsafe unsafe = f108405b;
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
            if (AbstractC1582W2.m65705c()) {
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
            Logger logger = f108404a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* renamed from: X */
    public static boolean m475X() {
        Unsafe unsafe = f108405b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m462m() == null) {
                return false;
            }
            if (AbstractC1582W2.m65705c()) {
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
            Logger logger = f108404a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* renamed from: i */
    public static long m466i(ByteBuffer byteBuffer) {
        return f108409f.m436l(byteBuffer, f108425v);
    }

    /* renamed from: j */
    public static Object m465j(Class cls) {
        try {
            return f108405b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static int m464k(Class cls) {
        if (f108411h) {
            return f108409f.m447a(cls);
        }
        return -1;
    }

    /* renamed from: l */
    public static int m463l(Class cls) {
        if (f108411h) {
            return f108409f.m446b(cls);
        }
        return -1;
    }

    /* renamed from: m */
    public static Field m462m() {
        Field m458q;
        if (AbstractC1582W2.m65705c() && (m458q = m458q(Buffer.class, "effectiveDirectAddress")) != null) {
            return m458q;
        }
        Field m458q2 = m458q(Buffer.class, "address");
        if (m458q2 == null || m458q2.getType() != Long.TYPE) {
            return null;
        }
        return m458q2;
    }

    /* renamed from: n */
    public static void m461n(long j, byte[] bArr, long j2, long j3) {
        f108409f.mo445c(j, bArr, j2, j3);
    }

    /* renamed from: o */
    public static void m460o(byte[] bArr, long j, long j2, long j3) {
        f108409f.mo444d(bArr, j, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static boolean m459p(Class cls) {
        if (!AbstractC1582W2.m65705c()) {
            return false;
        }
        try {
            Class cls2 = f108406c;
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

    /* renamed from: q */
    public static Field m458q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static long m457r(Field field) {
        AbstractC17060e abstractC17060e;
        if (field != null && (abstractC17060e = f108409f) != null) {
            return abstractC17060e.m434n(field);
        }
        return -1L;
    }

    /* renamed from: s */
    public static boolean m456s(Object obj, long j) {
        return f108409f.mo443e(obj, j);
    }

    /* renamed from: t */
    public static boolean m455t(Object obj, long j) {
        if (m451x(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m454u(Object obj, long j) {
        if (m450y(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static byte m453v(long j) {
        return f108409f.mo442f(j);
    }

    /* renamed from: w */
    public static byte m452w(byte[] bArr, long j) {
        return f108409f.mo441g(bArr, f108412i + j);
    }

    /* renamed from: x */
    public static byte m451x(Object obj, long j) {
        return (byte) ((m497B(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: y */
    public static byte m450y(Object obj, long j) {
        return (byte) ((m497B(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: z */
    public static double m449z(Object obj, long j) {
        return f108409f.mo440h(obj, j);
    }
}
