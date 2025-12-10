package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: eu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19775eu2 {

    /* renamed from: a */
    public static final Unsafe f61651a;

    /* renamed from: b */
    public static final Class f61652b;

    /* renamed from: c */
    public static final boolean f61653c;

    /* renamed from: d */
    public static final Zt2 f61654d;

    /* renamed from: e */
    public static final boolean f61655e;

    /* renamed from: f */
    public static final boolean f61656f;

    /* renamed from: g */
    public static final long f61657g;

    /* renamed from: h */
    public static final boolean f61658h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    static {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC19775eu2.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m31416A(Class cls) {
        int i = AbstractC21797qg2.f77029a;
        try {
            Class cls2 = f61652b;
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

    /* renamed from: B */
    public static boolean m31415B(Object obj, long j) {
        return f61654d.mo65133g(obj, j);
    }

    /* renamed from: C */
    public static boolean m31414C() {
        return f61656f;
    }

    /* renamed from: D */
    public static boolean m31413D() {
        return f61655e;
    }

    /* renamed from: E */
    public static int m31412E(Class cls) {
        if (f61656f) {
            return f61654d.f8173a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m31411a(Class cls) {
        if (f61656f) {
            return f61654d.f8173a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m31410b() {
        int i = AbstractC21797qg2.f77029a;
        Field m31409c = m31409c(Buffer.class, "effectiveDirectAddress");
        if (m31409c == null) {
            Field m31409c2 = m31409c(Buffer.class, "address");
            if (m31409c2 != null && m31409c2.getType() == Long.TYPE) {
                return m31409c2;
            }
            return null;
        }
        return m31409c;
    }

    /* renamed from: c */
    public static Field m31409c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m31408d(Object obj, long j, byte b) {
        Zt2 zt2 = f61654d;
        long j2 = (-4) & j;
        int i = zt2.f8173a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        zt2.f8173a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* renamed from: e */
    public static void m31407e(Object obj, long j, byte b) {
        Zt2 zt2 = f61654d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zt2.f8173a.putInt(obj, j2, ((255 & b) << i) | (zt2.f8173a.getInt(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m31406f(Object obj, long j) {
        return f61654d.mo65139a(obj, j);
    }

    /* renamed from: g */
    public static float m31405g(Object obj, long j) {
        return f61654d.mo65138b(obj, j);
    }

    /* renamed from: h */
    public static int m31404h(Object obj, long j) {
        return f61654d.f8173a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m31403i(Object obj, long j) {
        return f61654d.f8173a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m31402j(Class cls) {
        try {
            return f61651a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m31401k(Object obj, long j) {
        return f61654d.f8173a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m31400l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Jt2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m31399m(Throwable th2) {
        Logger.getLogger(AbstractC19775eu2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* renamed from: r */
    public static void m31394r(Object obj, long j, boolean z) {
        f61654d.mo65137c(obj, j, z);
    }

    /* renamed from: s */
    public static void m31393s(byte[] bArr, long j, byte b) {
        f61654d.mo65136d(bArr, f61657g + j, b);
    }

    /* renamed from: t */
    public static void m31392t(Object obj, long j, double d) {
        f61654d.mo65135e(obj, j, d);
    }

    /* renamed from: u */
    public static void m31391u(Object obj, long j, float f) {
        f61654d.mo65134f(obj, j, f);
    }

    /* renamed from: v */
    public static void m31390v(Object obj, long j, int i) {
        f61654d.f8173a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m31389w(Object obj, long j, long j2) {
        f61654d.f8173a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m31388x(Object obj, long j, Object obj2) {
        f61654d.f8173a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m31387y(Object obj, long j) {
        if (((byte) ((f61654d.f8173a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m31386z(Object obj, long j) {
        if (((byte) ((f61654d.f8173a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
