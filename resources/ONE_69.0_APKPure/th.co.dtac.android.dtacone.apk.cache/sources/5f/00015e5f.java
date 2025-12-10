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

/* renamed from: uZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22531uZ1 {

    /* renamed from: a */
    public static final Logger f107785a = Logger.getLogger(AbstractC22531uZ1.class.getName());

    /* renamed from: b */
    public static final Unsafe f107786b = m1153G();

    /* renamed from: c */
    public static final Class f107787c = AbstractC1569W2.m65825b();

    /* renamed from: d */
    public static final boolean f107788d = m1120p(Long.TYPE);

    /* renamed from: e */
    public static final boolean f107789e = m1120p(Integer.TYPE);

    /* renamed from: f */
    public static final AbstractC16847e f107790f = m1155E();

    /* renamed from: g */
    public static final boolean f107791g = m1136X();

    /* renamed from: h */
    public static final boolean f107792h = m1137W();

    /* renamed from: i */
    public static final long f107793i;

    /* renamed from: j */
    public static final long f107794j;

    /* renamed from: k */
    public static final long f107795k;

    /* renamed from: l */
    public static final long f107796l;

    /* renamed from: m */
    public static final long f107797m;

    /* renamed from: n */
    public static final long f107798n;

    /* renamed from: o */
    public static final long f107799o;

    /* renamed from: p */
    public static final long f107800p;

    /* renamed from: q */
    public static final long f107801q;

    /* renamed from: r */
    public static final long f107802r;

    /* renamed from: s */
    public static final long f107803s;

    /* renamed from: t */
    public static final long f107804t;

    /* renamed from: u */
    public static final long f107805u;

    /* renamed from: v */
    public static final long f107806v;

    /* renamed from: w */
    public static final int f107807w;

    /* renamed from: x */
    public static final boolean f107808x;

    /* renamed from: uZ1$a */
    /* loaded from: classes2.dex */
    public static class C16843a implements PrivilegedExceptionAction {
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

    /* renamed from: uZ1$b */
    /* loaded from: classes2.dex */
    public static final class C16844b extends AbstractC16847e {
        public C16844b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: c */
        public void mo1106c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: d */
        public void mo1105d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: e */
        public boolean mo1104e(Object obj, long j) {
            return AbstractC22531uZ1.f107808x ? AbstractC22531uZ1.m1116t(obj, j) : AbstractC22531uZ1.m1115u(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: f */
        public byte mo1103f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: g */
        public byte mo1102g(Object obj, long j) {
            return AbstractC22531uZ1.f107808x ? AbstractC22531uZ1.m1112x(obj, j) : AbstractC22531uZ1.m1111y(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: h */
        public double mo1101h(Object obj, long j) {
            return Double.longBitsToDouble(m1097l(obj, j));
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: i */
        public float mo1100i(Object obj, long j) {
            return Float.intBitsToFloat(m1099j(obj, j));
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: k */
        public long mo1098k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: o */
        public void mo1094o(Object obj, long j, boolean z) {
            if (AbstractC22531uZ1.f107808x) {
                AbstractC22531uZ1.m1148L(obj, j, z);
            } else {
                AbstractC22531uZ1.m1147M(obj, j, z);
            }
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: p */
        public void mo1093p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: q */
        public void mo1092q(Object obj, long j, byte b) {
            if (AbstractC22531uZ1.f107808x) {
                AbstractC22531uZ1.m1144P(obj, j, b);
            } else {
                AbstractC22531uZ1.m1143Q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: r */
        public void mo1091r(Object obj, long j, double d) {
            m1088u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: s */
        public void mo1090s(Object obj, long j, float f) {
            m1089t(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: uZ1$c */
    /* loaded from: classes2.dex */
    public static final class C16845c extends AbstractC16847e {
        public C16845c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: c */
        public void mo1106c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: d */
        public void mo1105d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: e */
        public boolean mo1104e(Object obj, long j) {
            return AbstractC22531uZ1.f107808x ? AbstractC22531uZ1.m1116t(obj, j) : AbstractC22531uZ1.m1115u(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: f */
        public byte mo1103f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: g */
        public byte mo1102g(Object obj, long j) {
            return AbstractC22531uZ1.f107808x ? AbstractC22531uZ1.m1112x(obj, j) : AbstractC22531uZ1.m1111y(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: h */
        public double mo1101h(Object obj, long j) {
            return Double.longBitsToDouble(m1097l(obj, j));
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: i */
        public float mo1100i(Object obj, long j) {
            return Float.intBitsToFloat(m1099j(obj, j));
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: k */
        public long mo1098k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: o */
        public void mo1094o(Object obj, long j, boolean z) {
            if (AbstractC22531uZ1.f107808x) {
                AbstractC22531uZ1.m1148L(obj, j, z);
            } else {
                AbstractC22531uZ1.m1147M(obj, j, z);
            }
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: p */
        public void mo1093p(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: q */
        public void mo1092q(Object obj, long j, byte b) {
            if (AbstractC22531uZ1.f107808x) {
                AbstractC22531uZ1.m1144P(obj, j, b);
            } else {
                AbstractC22531uZ1.m1143Q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: r */
        public void mo1091r(Object obj, long j, double d) {
            m1088u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: s */
        public void mo1090s(Object obj, long j, float f) {
            m1089t(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: uZ1$d */
    /* loaded from: classes2.dex */
    public static final class C16846d extends AbstractC16847e {
        public C16846d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: c */
        public void mo1106c(long j, byte[] bArr, long j2, long j3) {
            this.f107809a.copyMemory((Object) null, j, bArr, AbstractC22531uZ1.f107793i + j2, j3);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: d */
        public void mo1105d(byte[] bArr, long j, long j2, long j3) {
            this.f107809a.copyMemory(bArr, AbstractC22531uZ1.f107793i + j, (Object) null, j2, j3);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: e */
        public boolean mo1104e(Object obj, long j) {
            return this.f107809a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: f */
        public byte mo1103f(long j) {
            return this.f107809a.getByte(j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: g */
        public byte mo1102g(Object obj, long j) {
            return this.f107809a.getByte(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: h */
        public double mo1101h(Object obj, long j) {
            return this.f107809a.getDouble(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: i */
        public float mo1100i(Object obj, long j) {
            return this.f107809a.getFloat(obj, j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: k */
        public long mo1098k(long j) {
            return this.f107809a.getLong(j);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: o */
        public void mo1094o(Object obj, long j, boolean z) {
            this.f107809a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: p */
        public void mo1093p(long j, byte b) {
            this.f107809a.putByte(j, b);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: q */
        public void mo1092q(Object obj, long j, byte b) {
            this.f107809a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: r */
        public void mo1091r(Object obj, long j, double d) {
            this.f107809a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC22531uZ1.AbstractC16847e
        /* renamed from: s */
        public void mo1090s(Object obj, long j, float f) {
            this.f107809a.putFloat(obj, j, f);
        }
    }

    /* renamed from: uZ1$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC16847e {

        /* renamed from: a */
        public Unsafe f107809a;

        public AbstractC16847e(Unsafe unsafe) {
            this.f107809a = unsafe;
        }

        /* renamed from: a */
        public final int m1108a(Class cls) {
            return this.f107809a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m1107b(Class cls) {
            return this.f107809a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo1106c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo1105d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo1104e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo1103f(long j);

        /* renamed from: g */
        public abstract byte mo1102g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo1101h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo1100i(Object obj, long j);

        /* renamed from: j */
        public final int m1099j(Object obj, long j) {
            return this.f107809a.getInt(obj, j);
        }

        /* renamed from: k */
        public abstract long mo1098k(long j);

        /* renamed from: l */
        public final long m1097l(Object obj, long j) {
            return this.f107809a.getLong(obj, j);
        }

        /* renamed from: m */
        public final Object m1096m(Object obj, long j) {
            return this.f107809a.getObject(obj, j);
        }

        /* renamed from: n */
        public final long m1095n(Field field) {
            return this.f107809a.objectFieldOffset(field);
        }

        /* renamed from: o */
        public abstract void mo1094o(Object obj, long j, boolean z);

        /* renamed from: p */
        public abstract void mo1093p(long j, byte b);

        /* renamed from: q */
        public abstract void mo1092q(Object obj, long j, byte b);

        /* renamed from: r */
        public abstract void mo1091r(Object obj, long j, double d);

        /* renamed from: s */
        public abstract void mo1090s(Object obj, long j, float f);

        /* renamed from: t */
        public final void m1089t(Object obj, long j, int i) {
            this.f107809a.putInt(obj, j, i);
        }

        /* renamed from: u */
        public final void m1088u(Object obj, long j, long j2) {
            this.f107809a.putLong(obj, j, j2);
        }

        /* renamed from: v */
        public final void m1087v(Object obj, long j, Object obj2) {
            this.f107809a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z;
        long m1125k = m1125k(byte[].class);
        f107793i = m1125k;
        f107794j = m1125k(boolean[].class);
        f107795k = m1124l(boolean[].class);
        f107796l = m1125k(int[].class);
        f107797m = m1124l(int[].class);
        f107798n = m1125k(long[].class);
        f107799o = m1124l(long[].class);
        f107800p = m1125k(float[].class);
        f107801q = m1124l(float[].class);
        f107802r = m1125k(double[].class);
        f107803s = m1124l(double[].class);
        f107804t = m1125k(Object[].class);
        f107805u = m1124l(Object[].class);
        f107806v = m1118r(m1123m());
        f107807w = (int) (m1125k & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f107808x = z;
    }

    /* renamed from: A */
    public static float m1159A(Object obj, long j) {
        return f107790f.mo1100i(obj, j);
    }

    /* renamed from: B */
    public static int m1158B(Object obj, long j) {
        return f107790f.m1099j(obj, j);
    }

    /* renamed from: C */
    public static long m1157C(long j) {
        return f107790f.mo1098k(j);
    }

    /* renamed from: D */
    public static long m1156D(Object obj, long j) {
        return f107790f.m1097l(obj, j);
    }

    /* renamed from: E */
    public static AbstractC16847e m1155E() {
        Unsafe unsafe = f107786b;
        if (unsafe == null) {
            return null;
        }
        if (AbstractC1569W2.m65824c()) {
            if (f107788d) {
                return new C16845c(unsafe);
            }
            if (!f107789e) {
                return null;
            }
            return new C16844b(unsafe);
        }
        return new C16846d(unsafe);
    }

    /* renamed from: F */
    public static Object m1154F(Object obj, long j) {
        return f107790f.m1096m(obj, j);
    }

    /* renamed from: G */
    public static Unsafe m1153G() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16843a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static boolean m1152H() {
        return f107792h;
    }

    /* renamed from: I */
    public static boolean m1151I() {
        return f107791g;
    }

    /* renamed from: J */
    public static long m1150J(Field field) {
        return f107790f.m1095n(field);
    }

    /* renamed from: K */
    public static void m1149K(Object obj, long j, boolean z) {
        f107790f.mo1094o(obj, j, z);
    }

    /* renamed from: L */
    public static void m1148L(Object obj, long j, boolean z) {
        m1144P(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: M */
    public static void m1147M(Object obj, long j, boolean z) {
        m1143Q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: N */
    public static void m1146N(long j, byte b) {
        f107790f.mo1093p(j, b);
    }

    /* renamed from: O */
    public static void m1145O(byte[] bArr, long j, byte b) {
        f107790f.mo1092q(bArr, f107793i + j, b);
    }

    /* renamed from: P */
    public static void m1144P(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m1158B = m1158B(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m1140T(obj, j2, ((255 & b) << i) | (m1158B & (~(255 << i))));
    }

    /* renamed from: Q */
    public static void m1143Q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m1140T(obj, j2, ((255 & b) << i) | (m1158B(obj, j2) & (~(255 << i))));
    }

    /* renamed from: R */
    public static void m1142R(Object obj, long j, double d) {
        f107790f.mo1091r(obj, j, d);
    }

    /* renamed from: S */
    public static void m1141S(Object obj, long j, float f) {
        f107790f.mo1090s(obj, j, f);
    }

    /* renamed from: T */
    public static void m1140T(Object obj, long j, int i) {
        f107790f.m1089t(obj, j, i);
    }

    /* renamed from: U */
    public static void m1139U(Object obj, long j, long j2) {
        f107790f.m1088u(obj, j, j2);
    }

    /* renamed from: V */
    public static void m1138V(Object obj, long j, Object obj2) {
        f107790f.m1087v(obj, j, obj2);
    }

    /* renamed from: W */
    public static boolean m1137W() {
        Unsafe unsafe = f107786b;
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
            if (AbstractC1569W2.m65824c()) {
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
            Logger logger = f107785a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* renamed from: X */
    public static boolean m1136X() {
        Unsafe unsafe = f107786b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m1123m() == null) {
                return false;
            }
            if (AbstractC1569W2.m65824c()) {
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
            Logger logger = f107785a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* renamed from: i */
    public static long m1127i(ByteBuffer byteBuffer) {
        return f107790f.m1097l(byteBuffer, f107806v);
    }

    /* renamed from: j */
    public static Object m1126j(Class cls) {
        try {
            return f107786b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static int m1125k(Class cls) {
        if (f107792h) {
            return f107790f.m1108a(cls);
        }
        return -1;
    }

    /* renamed from: l */
    public static int m1124l(Class cls) {
        if (f107792h) {
            return f107790f.m1107b(cls);
        }
        return -1;
    }

    /* renamed from: m */
    public static Field m1123m() {
        Field m1119q;
        if (AbstractC1569W2.m65824c() && (m1119q = m1119q(Buffer.class, "effectiveDirectAddress")) != null) {
            return m1119q;
        }
        Field m1119q2 = m1119q(Buffer.class, "address");
        if (m1119q2 == null || m1119q2.getType() != Long.TYPE) {
            return null;
        }
        return m1119q2;
    }

    /* renamed from: n */
    public static void m1122n(long j, byte[] bArr, long j2, long j3) {
        f107790f.mo1106c(j, bArr, j2, j3);
    }

    /* renamed from: o */
    public static void m1121o(byte[] bArr, long j, long j2, long j3) {
        f107790f.mo1105d(bArr, j, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static boolean m1120p(Class cls) {
        if (!AbstractC1569W2.m65824c()) {
            return false;
        }
        try {
            Class cls2 = f107787c;
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
    public static Field m1119q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static long m1118r(Field field) {
        AbstractC16847e abstractC16847e;
        if (field != null && (abstractC16847e = f107790f) != null) {
            return abstractC16847e.m1095n(field);
        }
        return -1L;
    }

    /* renamed from: s */
    public static boolean m1117s(Object obj, long j) {
        return f107790f.mo1104e(obj, j);
    }

    /* renamed from: t */
    public static boolean m1116t(Object obj, long j) {
        if (m1112x(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m1115u(Object obj, long j) {
        if (m1111y(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static byte m1114v(long j) {
        return f107790f.mo1103f(j);
    }

    /* renamed from: w */
    public static byte m1113w(byte[] bArr, long j) {
        return f107790f.mo1102g(bArr, f107793i + j);
    }

    /* renamed from: x */
    public static byte m1112x(Object obj, long j) {
        return (byte) ((m1158B(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: y */
    public static byte m1111y(Object obj, long j) {
        return (byte) ((m1158B(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: z */
    public static double m1110z(Object obj, long j) {
        return f107790f.mo1101h(obj, j);
    }
}