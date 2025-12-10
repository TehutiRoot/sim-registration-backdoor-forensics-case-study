package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: BH2 */
/* loaded from: classes3.dex */
public abstract class BH2 {

    /* renamed from: a */
    public static final Unsafe f356a;

    /* renamed from: b */
    public static final Class f357b;

    /* renamed from: c */
    public static final boolean f358c;

    /* renamed from: d */
    public static final AbstractC22940xH2 f359d;

    /* renamed from: e */
    public static final boolean f360e;

    /* renamed from: f */
    public static final boolean f361f;

    /* renamed from: g */
    public static final long f362g;

    /* renamed from: h */
    public static final boolean f363h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    static {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.BH2.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m68954A(Class cls) {
        int i = AbstractC19443cy2.f61022a;
        try {
            Class cls2 = f357b;
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
    public static boolean m68953B(Object obj, long j) {
        return f359d.mo575g(obj, j);
    }

    /* renamed from: C */
    public static boolean m68952C() {
        return f361f;
    }

    /* renamed from: D */
    public static boolean m68951D() {
        return f360e;
    }

    /* renamed from: E */
    public static int m68950E(Class cls) {
        if (f361f) {
            return f359d.m574h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m68949a(Class cls) {
        if (f361f) {
            return f359d.m573i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m68948b() {
        int i = AbstractC19443cy2.f61022a;
        Field m68947c = m68947c(Buffer.class, "effectiveDirectAddress");
        if (m68947c == null) {
            Field m68947c2 = m68947c(Buffer.class, "address");
            if (m68947c2 != null && m68947c2.getType() == Long.TYPE) {
                return m68947c2;
            }
            return null;
        }
        return m68947c;
    }

    /* renamed from: c */
    public static Field m68947c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m68946d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC22940xH2 abstractC22940xH2 = f359d;
        int m572j = abstractC22940xH2.m572j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        abstractC22940xH2.m568n(obj, j2, ((255 & b) << i) | (m572j & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m68945e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC22940xH2 abstractC22940xH2 = f359d;
        int i = (((int) j) & 3) << 3;
        abstractC22940xH2.m568n(obj, j2, ((255 & b) << i) | (abstractC22940xH2.m572j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m68944f(Object obj, long j) {
        return f359d.mo581a(obj, j);
    }

    /* renamed from: g */
    public static float m68943g(Object obj, long j) {
        return f359d.mo580b(obj, j);
    }

    /* renamed from: h */
    public static int m68942h(Object obj, long j) {
        return f359d.m572j(obj, j);
    }

    /* renamed from: i */
    public static long m68941i(Object obj, long j) {
        return f359d.m571k(obj, j);
    }

    /* renamed from: j */
    public static Object m68940j(Class cls) {
        try {
            return f356a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m68939k(Object obj, long j) {
        return f359d.m569m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m68938l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C21736qH2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m68937m(Throwable th2) {
        Logger.getLogger(BH2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* renamed from: r */
    public static void m68932r(Object obj, long j, boolean z) {
        f359d.mo579c(obj, j, z);
    }

    /* renamed from: s */
    public static void m68931s(byte[] bArr, long j, byte b) {
        f359d.mo578d(bArr, f362g + j, b);
    }

    /* renamed from: t */
    public static void m68930t(Object obj, long j, double d) {
        f359d.mo577e(obj, j, d);
    }

    /* renamed from: u */
    public static void m68929u(Object obj, long j, float f) {
        f359d.mo576f(obj, j, f);
    }

    /* renamed from: v */
    public static void m68928v(Object obj, long j, int i) {
        f359d.m568n(obj, j, i);
    }

    /* renamed from: w */
    public static void m68927w(Object obj, long j, long j2) {
        f359d.m567o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m68926x(Object obj, long j, Object obj2) {
        f359d.m566p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m68925y(Object obj, long j) {
        if (((byte) ((f359d.m572j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m68924z(Object obj, long j) {
        if (((byte) ((f359d.m572j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
