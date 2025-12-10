package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: to2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22403to2 {

    /* renamed from: a */
    public static final Logger f107525a = Logger.getLogger(AbstractC22403to2.class.getName());

    /* renamed from: b */
    public static final Unsafe f107526b;

    /* renamed from: c */
    public static final Class f107527c;

    /* renamed from: d */
    public static final boolean f107528d;

    /* renamed from: e */
    public static final boolean f107529e;

    /* renamed from: f */
    public static final AbstractC16790d f107530f;

    /* renamed from: g */
    public static final boolean f107531g;

    /* renamed from: h */
    public static final boolean f107532h;

    /* renamed from: i */
    public static final long f107533i;

    /* renamed from: j */
    public static final long f107534j;

    /* renamed from: k */
    public static final long f107535k;

    /* renamed from: l */
    public static final long f107536l;

    /* renamed from: m */
    public static final long f107537m;

    /* renamed from: n */
    public static final long f107538n;

    /* renamed from: o */
    public static final long f107539o;

    /* renamed from: p */
    public static final long f107540p;

    /* renamed from: q */
    public static final long f107541q;

    /* renamed from: r */
    public static final long f107542r;

    /* renamed from: s */
    public static final long f107543s;

    /* renamed from: t */
    public static final long f107544t;

    /* renamed from: u */
    public static final long f107545u;

    /* renamed from: v */
    public static final long f107546v;

    /* renamed from: w */
    public static final long f107547w;

    /* renamed from: x */
    public static final boolean f107548x;

    /* renamed from: to2$a */
    /* loaded from: classes3.dex */
    public static final class C16787a extends AbstractC16790d {
        public C16787a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: b */
        public final void mo1329b(long j, byte b) {
            Memory.pokeByte((int) j, b);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: c */
        public final void mo1328c(Object obj, long j, double d) {
            m1325f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: d */
        public final void mo1327d(Object obj, long j, float f) {
            m1326e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: g */
        public final void mo1324g(Object obj, long j, boolean z) {
            if (AbstractC22403to2.f107548x) {
                AbstractC22403to2.m1339r(obj, j, z);
            } else {
                AbstractC22403to2.m1337t(obj, j, z);
            }
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: h */
        public final void mo1323h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) j2, bArr, (int) j, (int) j3);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: i */
        public final void mo1322i(Object obj, long j, byte b) {
            if (AbstractC22403to2.f107548x) {
                AbstractC22403to2.m1353d(obj, j, b);
            } else {
                AbstractC22403to2.m1340q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: l */
        public final boolean mo1319l(Object obj, long j) {
            return AbstractC22403to2.f107548x ? AbstractC22403to2.m1362P(obj, j) : AbstractC22403to2.m1361Q(obj, j);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: m */
        public final float mo1318m(Object obj, long j) {
            return Float.intBitsToFloat(m1321j(obj, j));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: n */
        public final double mo1317n(Object obj, long j) {
            return Double.longBitsToDouble(m1320k(obj, j));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: o */
        public final byte mo1316o(Object obj, long j) {
            return AbstractC22403to2.f107548x ? AbstractC22403to2.m1364N(obj, j) : AbstractC22403to2.m1363O(obj, j);
        }
    }

    /* renamed from: to2$b */
    /* loaded from: classes3.dex */
    public static final class C16788b extends AbstractC16790d {
        public C16788b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: b */
        public final void mo1329b(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: c */
        public final void mo1328c(Object obj, long j, double d) {
            m1325f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: d */
        public final void mo1327d(Object obj, long j, float f) {
            m1326e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: g */
        public final void mo1324g(Object obj, long j, boolean z) {
            if (AbstractC22403to2.f107548x) {
                AbstractC22403to2.m1339r(obj, j, z);
            } else {
                AbstractC22403to2.m1337t(obj, j, z);
            }
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: h */
        public final void mo1323h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: i */
        public final void mo1322i(Object obj, long j, byte b) {
            if (AbstractC22403to2.f107548x) {
                AbstractC22403to2.m1353d(obj, j, b);
            } else {
                AbstractC22403to2.m1340q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: l */
        public final boolean mo1319l(Object obj, long j) {
            return AbstractC22403to2.f107548x ? AbstractC22403to2.m1362P(obj, j) : AbstractC22403to2.m1361Q(obj, j);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: m */
        public final float mo1318m(Object obj, long j) {
            return Float.intBitsToFloat(m1321j(obj, j));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: n */
        public final double mo1317n(Object obj, long j) {
            return Double.longBitsToDouble(m1320k(obj, j));
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: o */
        public final byte mo1316o(Object obj, long j) {
            return AbstractC22403to2.f107548x ? AbstractC22403to2.m1364N(obj, j) : AbstractC22403to2.m1363O(obj, j);
        }
    }

    /* renamed from: to2$c */
    /* loaded from: classes3.dex */
    public static final class C16789c extends AbstractC16790d {
        public C16789c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: b */
        public final void mo1329b(long j, byte b) {
            this.f107549a.putByte(j, b);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: c */
        public final void mo1328c(Object obj, long j, double d) {
            this.f107549a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: d */
        public final void mo1327d(Object obj, long j, float f) {
            this.f107549a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: g */
        public final void mo1324g(Object obj, long j, boolean z) {
            this.f107549a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: h */
        public final void mo1323h(byte[] bArr, long j, long j2, long j3) {
            this.f107549a.copyMemory(bArr, AbstractC22403to2.f107533i + j, (Object) null, j2, j3);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: i */
        public final void mo1322i(Object obj, long j, byte b) {
            this.f107549a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: l */
        public final boolean mo1319l(Object obj, long j) {
            return this.f107549a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: m */
        public final float mo1318m(Object obj, long j) {
            return this.f107549a.getFloat(obj, j);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: n */
        public final double mo1317n(Object obj, long j) {
            return this.f107549a.getDouble(obj, j);
        }

        @Override // p000.AbstractC22403to2.AbstractC16790d
        /* renamed from: o */
        public final byte mo1316o(Object obj, long j) {
            return this.f107549a.getByte(obj, j);
        }
    }

    /* renamed from: to2$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC16790d {

        /* renamed from: a */
        public Unsafe f107549a;

        public AbstractC16790d(Unsafe unsafe) {
            this.f107549a = unsafe;
        }

        /* renamed from: a */
        public final long m1330a(Field field) {
            return this.f107549a.objectFieldOffset(field);
        }

        /* renamed from: b */
        public abstract void mo1329b(long j, byte b);

        /* renamed from: c */
        public abstract void mo1328c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo1327d(Object obj, long j, float f);

        /* renamed from: e */
        public final void m1326e(Object obj, long j, int i) {
            this.f107549a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void m1325f(Object obj, long j, long j2) {
            this.f107549a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo1324g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract void mo1323h(byte[] bArr, long j, long j2, long j3);

        /* renamed from: i */
        public abstract void mo1322i(Object obj, long j, byte b);

        /* renamed from: j */
        public final int m1321j(Object obj, long j) {
            return this.f107549a.getInt(obj, j);
        }

        /* renamed from: k */
        public final long m1320k(Object obj, long j) {
            return this.f107549a.getLong(obj, j);
        }

        /* renamed from: l */
        public abstract boolean mo1319l(Object obj, long j);

        /* renamed from: m */
        public abstract float mo1318m(Object obj, long j);

        /* renamed from: n */
        public abstract double mo1317n(Object obj, long j);

        /* renamed from: o */
        public abstract byte mo1316o(Object obj, long j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    static {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC22403to2.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m1377A() {
        Unsafe unsafe = f107526b;
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
            if (AbstractC18335Qd2.m66753b()) {
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
            Logger logger = f107525a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    public static boolean m1376B() {
        Unsafe unsafe = f107526b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m1375C() == null) {
                return false;
            }
            if (AbstractC18335Qd2.m66753b()) {
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
            Logger logger = f107525a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: C */
    public static Field m1375C() {
        Field m1341p;
        if (AbstractC18335Qd2.m66753b() && (m1341p = m1341p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m1341p;
        }
        Field m1341p2 = m1341p(Buffer.class, "address");
        if (m1341p2 != null && m1341p2.getType() == Long.TYPE) {
            return m1341p2;
        }
        return null;
    }

    /* renamed from: E */
    public static int m1373E(Class cls) {
        if (f107532h) {
            return f107530f.f107549a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: F */
    public static int m1372F(Class cls) {
        if (f107532h) {
            return f107530f.f107549a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public static boolean m1371G(Class cls) {
        if (!AbstractC18335Qd2.m66753b()) {
            return false;
        }
        try {
            Class cls2 = f107527c;
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

    /* renamed from: H */
    public static int m1370H(Object obj, long j) {
        return f107530f.m1321j(obj, j);
    }

    /* renamed from: I */
    public static long m1369I(Object obj, long j) {
        return f107530f.m1320k(obj, j);
    }

    /* renamed from: J */
    public static boolean m1368J(Object obj, long j) {
        return f107530f.mo1319l(obj, j);
    }

    /* renamed from: K */
    public static float m1367K(Object obj, long j) {
        return f107530f.mo1318m(obj, j);
    }

    /* renamed from: L */
    public static double m1366L(Object obj, long j) {
        return f107530f.mo1317n(obj, j);
    }

    /* renamed from: M */
    public static Object m1365M(Object obj, long j) {
        return f107530f.f107549a.getObject(obj, j);
    }

    /* renamed from: N */
    public static byte m1364N(Object obj, long j) {
        return (byte) (m1370H(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: O */
    public static byte m1363O(Object obj, long j) {
        return (byte) (m1370H(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: P */
    public static boolean m1362P(Object obj, long j) {
        if (m1364N(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m1361Q(Object obj, long j) {
        if (m1363O(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static byte m1356a(byte[] bArr, long j) {
        return f107530f.mo1316o(bArr, f107533i + j);
    }

    /* renamed from: b */
    public static long m1355b(Field field) {
        return f107530f.m1330a(field);
    }

    /* renamed from: c */
    public static void m1354c(long j, byte b) {
        f107530f.mo1329b(j, b);
    }

    /* renamed from: d */
    public static void m1353d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m1370H = m1370H(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m1350g(obj, j2, ((255 & b) << i) | (m1370H & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m1352e(Object obj, long j, double d) {
        f107530f.mo1328c(obj, j, d);
    }

    /* renamed from: f */
    public static void m1351f(Object obj, long j, float f) {
        f107530f.mo1327d(obj, j, f);
    }

    /* renamed from: g */
    public static void m1350g(Object obj, long j, int i) {
        f107530f.m1326e(obj, j, i);
    }

    /* renamed from: h */
    public static void m1349h(Object obj, long j, long j2) {
        f107530f.m1325f(obj, j, j2);
    }

    /* renamed from: i */
    public static void m1348i(Object obj, long j, Object obj2) {
        f107530f.f107549a.putObject(obj, j, obj2);
    }

    /* renamed from: j */
    public static void m1347j(Object obj, long j, boolean z) {
        f107530f.mo1324g(obj, j, z);
    }

    /* renamed from: k */
    public static void m1346k(byte[] bArr, long j, byte b) {
        f107530f.mo1322i(bArr, f107533i + j, b);
    }

    /* renamed from: l */
    public static void m1345l(byte[] bArr, long j, long j2, long j3) {
        f107530f.mo1323h(bArr, j, j2, j3);
    }

    /* renamed from: n */
    public static long m1343n(Field field) {
        AbstractC16790d abstractC16790d;
        if (field != null && (abstractC16790d = f107530f) != null) {
            return abstractC16790d.m1330a(field);
        }
        return -1L;
    }

    /* renamed from: o */
    public static long m1342o(ByteBuffer byteBuffer) {
        return f107530f.m1320k(byteBuffer, f107546v);
    }

    /* renamed from: p */
    public static Field m1341p(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m1340q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m1350g(obj, j2, ((255 & b) << i) | (m1370H(obj, j2) & (~(255 << i))));
    }

    /* renamed from: r */
    public static void m1339r(Object obj, long j, boolean z) {
        m1353d(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: t */
    public static void m1337t(Object obj, long j, boolean z) {
        m1340q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: x */
    public static boolean m1333x() {
        return f107532h;
    }

    /* renamed from: y */
    public static boolean m1332y() {
        return f107531g;
    }

    /* renamed from: z */
    public static Unsafe m1331z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Io2());
        } catch (Throwable unused) {
            return null;
        }
    }
}