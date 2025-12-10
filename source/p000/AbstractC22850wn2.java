package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: wn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22850wn2 {

    /* renamed from: a */
    public static final Logger f108129a = Logger.getLogger(AbstractC22850wn2.class.getName());

    /* renamed from: b */
    public static final Unsafe f108130b;

    /* renamed from: c */
    public static final Class f108131c;

    /* renamed from: d */
    public static final boolean f108132d;

    /* renamed from: e */
    public static final boolean f108133e;

    /* renamed from: f */
    public static final AbstractC16999d f108134f;

    /* renamed from: g */
    public static final boolean f108135g;

    /* renamed from: h */
    public static final boolean f108136h;

    /* renamed from: i */
    public static final long f108137i;

    /* renamed from: j */
    public static final long f108138j;

    /* renamed from: k */
    public static final long f108139k;

    /* renamed from: l */
    public static final long f108140l;

    /* renamed from: m */
    public static final long f108141m;

    /* renamed from: n */
    public static final long f108142n;

    /* renamed from: o */
    public static final long f108143o;

    /* renamed from: p */
    public static final long f108144p;

    /* renamed from: q */
    public static final long f108145q;

    /* renamed from: r */
    public static final long f108146r;

    /* renamed from: s */
    public static final long f108147s;

    /* renamed from: t */
    public static final long f108148t;

    /* renamed from: u */
    public static final long f108149u;

    /* renamed from: v */
    public static final long f108150v;

    /* renamed from: w */
    public static final long f108151w;

    /* renamed from: x */
    public static final boolean f108152x;

    /* renamed from: wn2$a */
    /* loaded from: classes3.dex */
    public static final class C16996a extends AbstractC16999d {
        public C16996a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: b */
        public final void mo665b(long j, byte b) {
            Memory.pokeByte((int) j, b);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: c */
        public final void mo664c(Object obj, long j, double d) {
            m661f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: d */
        public final void mo663d(Object obj, long j, float f) {
            m662e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: g */
        public final void mo660g(Object obj, long j, boolean z) {
            if (AbstractC22850wn2.f108152x) {
                AbstractC22850wn2.m675r(obj, j, z);
            } else {
                AbstractC22850wn2.m673t(obj, j, z);
            }
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: h */
        public final void mo659h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) j2, bArr, (int) j, (int) j3);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: i */
        public final void mo658i(Object obj, long j, byte b) {
            if (AbstractC22850wn2.f108152x) {
                AbstractC22850wn2.m689d(obj, j, b);
            } else {
                AbstractC22850wn2.m676q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: l */
        public final boolean mo655l(Object obj, long j) {
            return AbstractC22850wn2.f108152x ? AbstractC22850wn2.m698P(obj, j) : AbstractC22850wn2.m697Q(obj, j);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: m */
        public final float mo654m(Object obj, long j) {
            return Float.intBitsToFloat(m657j(obj, j));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: n */
        public final double mo653n(Object obj, long j) {
            return Double.longBitsToDouble(m656k(obj, j));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: o */
        public final byte mo652o(Object obj, long j) {
            return AbstractC22850wn2.f108152x ? AbstractC22850wn2.m700N(obj, j) : AbstractC22850wn2.m699O(obj, j);
        }
    }

    /* renamed from: wn2$b */
    /* loaded from: classes3.dex */
    public static final class C16997b extends AbstractC16999d {
        public C16997b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: b */
        public final void mo665b(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: c */
        public final void mo664c(Object obj, long j, double d) {
            m661f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: d */
        public final void mo663d(Object obj, long j, float f) {
            m662e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: g */
        public final void mo660g(Object obj, long j, boolean z) {
            if (AbstractC22850wn2.f108152x) {
                AbstractC22850wn2.m675r(obj, j, z);
            } else {
                AbstractC22850wn2.m673t(obj, j, z);
            }
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: h */
        public final void mo659h(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: i */
        public final void mo658i(Object obj, long j, byte b) {
            if (AbstractC22850wn2.f108152x) {
                AbstractC22850wn2.m689d(obj, j, b);
            } else {
                AbstractC22850wn2.m676q(obj, j, b);
            }
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: l */
        public final boolean mo655l(Object obj, long j) {
            return AbstractC22850wn2.f108152x ? AbstractC22850wn2.m698P(obj, j) : AbstractC22850wn2.m697Q(obj, j);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: m */
        public final float mo654m(Object obj, long j) {
            return Float.intBitsToFloat(m657j(obj, j));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: n */
        public final double mo653n(Object obj, long j) {
            return Double.longBitsToDouble(m656k(obj, j));
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: o */
        public final byte mo652o(Object obj, long j) {
            return AbstractC22850wn2.f108152x ? AbstractC22850wn2.m700N(obj, j) : AbstractC22850wn2.m699O(obj, j);
        }
    }

    /* renamed from: wn2$c */
    /* loaded from: classes3.dex */
    public static final class C16998c extends AbstractC16999d {
        public C16998c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: b */
        public final void mo665b(long j, byte b) {
            this.f108153a.putByte(j, b);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: c */
        public final void mo664c(Object obj, long j, double d) {
            this.f108153a.putDouble(obj, j, d);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: d */
        public final void mo663d(Object obj, long j, float f) {
            this.f108153a.putFloat(obj, j, f);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: g */
        public final void mo660g(Object obj, long j, boolean z) {
            this.f108153a.putBoolean(obj, j, z);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: h */
        public final void mo659h(byte[] bArr, long j, long j2, long j3) {
            this.f108153a.copyMemory(bArr, AbstractC22850wn2.f108137i + j, (Object) null, j2, j3);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: i */
        public final void mo658i(Object obj, long j, byte b) {
            this.f108153a.putByte(obj, j, b);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: l */
        public final boolean mo655l(Object obj, long j) {
            return this.f108153a.getBoolean(obj, j);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: m */
        public final float mo654m(Object obj, long j) {
            return this.f108153a.getFloat(obj, j);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: n */
        public final double mo653n(Object obj, long j) {
            return this.f108153a.getDouble(obj, j);
        }

        @Override // p000.AbstractC22850wn2.AbstractC16999d
        /* renamed from: o */
        public final byte mo652o(Object obj, long j) {
            return this.f108153a.getByte(obj, j);
        }
    }

    /* renamed from: wn2$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC16999d {

        /* renamed from: a */
        public Unsafe f108153a;

        public AbstractC16999d(Unsafe unsafe) {
            this.f108153a = unsafe;
        }

        /* renamed from: a */
        public final long m666a(Field field) {
            return this.f108153a.objectFieldOffset(field);
        }

        /* renamed from: b */
        public abstract void mo665b(long j, byte b);

        /* renamed from: c */
        public abstract void mo664c(Object obj, long j, double d);

        /* renamed from: d */
        public abstract void mo663d(Object obj, long j, float f);

        /* renamed from: e */
        public final void m662e(Object obj, long j, int i) {
            this.f108153a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final void m661f(Object obj, long j, long j2) {
            this.f108153a.putLong(obj, j, j2);
        }

        /* renamed from: g */
        public abstract void mo660g(Object obj, long j, boolean z);

        /* renamed from: h */
        public abstract void mo659h(byte[] bArr, long j, long j2, long j3);

        /* renamed from: i */
        public abstract void mo658i(Object obj, long j, byte b);

        /* renamed from: j */
        public final int m657j(Object obj, long j) {
            return this.f108153a.getInt(obj, j);
        }

        /* renamed from: k */
        public final long m656k(Object obj, long j) {
            return this.f108153a.getLong(obj, j);
        }

        /* renamed from: l */
        public abstract boolean mo655l(Object obj, long j);

        /* renamed from: m */
        public abstract float mo654m(Object obj, long j);

        /* renamed from: n */
        public abstract double mo653n(Object obj, long j);

        /* renamed from: o */
        public abstract byte mo652o(Object obj, long j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    static {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC22850wn2.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m713A() {
        Unsafe unsafe = f108130b;
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
            if (AbstractC18485Tc2.m66188b()) {
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
            Logger logger = f108129a;
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
    public static boolean m712B() {
        Unsafe unsafe = f108130b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m711C() == null) {
                return false;
            }
            if (AbstractC18485Tc2.m66188b()) {
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
            Logger logger = f108129a;
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
    public static Field m711C() {
        Field m677p;
        if (AbstractC18485Tc2.m66188b() && (m677p = m677p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m677p;
        }
        Field m677p2 = m677p(Buffer.class, "address");
        if (m677p2 != null && m677p2.getType() == Long.TYPE) {
            return m677p2;
        }
        return null;
    }

    /* renamed from: E */
    public static int m709E(Class cls) {
        if (f108136h) {
            return f108134f.f108153a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: F */
    public static int m708F(Class cls) {
        if (f108136h) {
            return f108134f.f108153a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public static boolean m707G(Class cls) {
        if (!AbstractC18485Tc2.m66188b()) {
            return false;
        }
        try {
            Class cls2 = f108131c;
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
    public static int m706H(Object obj, long j) {
        return f108134f.m657j(obj, j);
    }

    /* renamed from: I */
    public static long m705I(Object obj, long j) {
        return f108134f.m656k(obj, j);
    }

    /* renamed from: J */
    public static boolean m704J(Object obj, long j) {
        return f108134f.mo655l(obj, j);
    }

    /* renamed from: K */
    public static float m703K(Object obj, long j) {
        return f108134f.mo654m(obj, j);
    }

    /* renamed from: L */
    public static double m702L(Object obj, long j) {
        return f108134f.mo653n(obj, j);
    }

    /* renamed from: M */
    public static Object m701M(Object obj, long j) {
        return f108134f.f108153a.getObject(obj, j);
    }

    /* renamed from: N */
    public static byte m700N(Object obj, long j) {
        return (byte) (m706H(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* renamed from: O */
    public static byte m699O(Object obj, long j) {
        return (byte) (m706H(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: P */
    public static boolean m698P(Object obj, long j) {
        if (m700N(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m697Q(Object obj, long j) {
        if (m699O(obj, j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static byte m692a(byte[] bArr, long j) {
        return f108134f.mo652o(bArr, f108137i + j);
    }

    /* renamed from: b */
    public static long m691b(Field field) {
        return f108134f.m666a(field);
    }

    /* renamed from: c */
    public static void m690c(long j, byte b) {
        f108134f.mo665b(j, b);
    }

    /* renamed from: d */
    public static void m689d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m706H = m706H(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m686g(obj, j2, ((255 & b) << i) | (m706H & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m688e(Object obj, long j, double d) {
        f108134f.mo664c(obj, j, d);
    }

    /* renamed from: f */
    public static void m687f(Object obj, long j, float f) {
        f108134f.mo663d(obj, j, f);
    }

    /* renamed from: g */
    public static void m686g(Object obj, long j, int i) {
        f108134f.m662e(obj, j, i);
    }

    /* renamed from: h */
    public static void m685h(Object obj, long j, long j2) {
        f108134f.m661f(obj, j, j2);
    }

    /* renamed from: i */
    public static void m684i(Object obj, long j, Object obj2) {
        f108134f.f108153a.putObject(obj, j, obj2);
    }

    /* renamed from: j */
    public static void m683j(Object obj, long j, boolean z) {
        f108134f.mo660g(obj, j, z);
    }

    /* renamed from: k */
    public static void m682k(byte[] bArr, long j, byte b) {
        f108134f.mo658i(bArr, f108137i + j, b);
    }

    /* renamed from: l */
    public static void m681l(byte[] bArr, long j, long j2, long j3) {
        f108134f.mo659h(bArr, j, j2, j3);
    }

    /* renamed from: n */
    public static long m679n(Field field) {
        AbstractC16999d abstractC16999d;
        if (field != null && (abstractC16999d = f108134f) != null) {
            return abstractC16999d.m666a(field);
        }
        return -1L;
    }

    /* renamed from: o */
    public static long m678o(ByteBuffer byteBuffer) {
        return f108134f.m656k(byteBuffer, f108150v);
    }

    /* renamed from: p */
    public static Field m677p(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m676q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m686g(obj, j2, ((255 & b) << i) | (m706H(obj, j2) & (~(255 << i))));
    }

    /* renamed from: r */
    public static void m675r(Object obj, long j, boolean z) {
        m689d(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: t */
    public static void m673t(Object obj, long j, boolean z) {
        m676q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: x */
    public static boolean m669x() {
        return f108136h;
    }

    /* renamed from: y */
    public static boolean m668y() {
        return f108135g;
    }

    /* renamed from: z */
    public static Unsafe m667z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Ln2());
        } catch (Throwable unused) {
            return null;
        }
    }
}
