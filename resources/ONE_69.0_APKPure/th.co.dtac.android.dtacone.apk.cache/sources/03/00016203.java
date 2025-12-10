package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: yI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23185yI2 {

    /* renamed from: a */
    public static final Unsafe f109005a;

    /* renamed from: b */
    public static final Class f109006b;

    /* renamed from: c */
    public static final boolean f109007c;

    /* renamed from: d */
    public static final AbstractC22493uI2 f109008d;

    /* renamed from: e */
    public static final boolean f109009e;

    /* renamed from: f */
    public static final boolean f109010f;

    /* renamed from: g */
    public static final long f109011g;

    /* renamed from: h */
    public static final boolean f109012h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    static {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC23185yI2.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m374A(Class cls) {
        int i = Zy2.f8318a;
        try {
            Class cls2 = f109006b;
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
    public static boolean m373B(Object obj, long j) {
        return f109008d.mo1215g(obj, j);
    }

    /* renamed from: C */
    public static boolean m372C() {
        return f109010f;
    }

    /* renamed from: D */
    public static boolean m371D() {
        return f109009e;
    }

    /* renamed from: E */
    public static int m370E(Class cls) {
        if (f109010f) {
            return f109008d.m1214h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m369a(Class cls) {
        if (f109010f) {
            return f109008d.m1213i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m368b() {
        int i = Zy2.f8318a;
        Field m367c = m367c(Buffer.class, "effectiveDirectAddress");
        if (m367c == null) {
            Field m367c2 = m367c(Buffer.class, "address");
            if (m367c2 != null && m367c2.getType() == Long.TYPE) {
                return m367c2;
            }
            return null;
        }
        return m367c;
    }

    /* renamed from: c */
    public static Field m367c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m366d(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC22493uI2 abstractC22493uI2 = f109008d;
        int m1212j = abstractC22493uI2.m1212j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        abstractC22493uI2.m1208n(obj, j2, ((255 & b) << i) | (m1212j & (~(255 << i))));
    }

    /* renamed from: e */
    public static void m365e(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        AbstractC22493uI2 abstractC22493uI2 = f109008d;
        int i = (((int) j) & 3) << 3;
        abstractC22493uI2.m1208n(obj, j2, ((255 & b) << i) | (abstractC22493uI2.m1212j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m364f(Object obj, long j) {
        return f109008d.mo1221a(obj, j);
    }

    /* renamed from: g */
    public static float m363g(Object obj, long j) {
        return f109008d.mo1220b(obj, j);
    }

    /* renamed from: h */
    public static int m362h(Object obj, long j) {
        return f109008d.m1212j(obj, j);
    }

    /* renamed from: i */
    public static long m361i(Object obj, long j) {
        return f109008d.m1211k(obj, j);
    }

    /* renamed from: j */
    public static Object m360j(Class cls) {
        try {
            return f109005a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m359k(Object obj, long j) {
        return f109008d.m1209m(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m358l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C21282nI2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m357m(Throwable th2) {
        Logger.getLogger(AbstractC23185yI2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* renamed from: r */
    public static void m352r(Object obj, long j, boolean z) {
        f109008d.mo1219c(obj, j, z);
    }

    /* renamed from: s */
    public static void m351s(byte[] bArr, long j, byte b) {
        f109008d.mo1218d(bArr, f109011g + j, b);
    }

    /* renamed from: t */
    public static void m350t(Object obj, long j, double d) {
        f109008d.mo1217e(obj, j, d);
    }

    /* renamed from: u */
    public static void m349u(Object obj, long j, float f) {
        f109008d.mo1216f(obj, j, f);
    }

    /* renamed from: v */
    public static void m348v(Object obj, long j, int i) {
        f109008d.m1208n(obj, j, i);
    }

    /* renamed from: w */
    public static void m347w(Object obj, long j, long j2) {
        f109008d.m1207o(obj, j, j2);
    }

    /* renamed from: x */
    public static void m346x(Object obj, long j, Object obj2) {
        f109008d.m1206p(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m345y(Object obj, long j) {
        if (((byte) ((f109008d.m1212j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m344z(Object obj, long j) {
        if (((byte) ((f109008d.m1212j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}