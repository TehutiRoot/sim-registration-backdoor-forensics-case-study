package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: bv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19310bv2 {

    /* renamed from: a */
    public static final Unsafe f39258a;

    /* renamed from: b */
    public static final Class f39259b;

    /* renamed from: c */
    public static final boolean f39260c;

    /* renamed from: d */
    public static final Wu2 f39261d;

    /* renamed from: e */
    public static final boolean f39262e;

    /* renamed from: f */
    public static final boolean f39263f;

    /* renamed from: g */
    public static final long f39264g;

    /* renamed from: h */
    public static final boolean f39265h;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    static {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC19310bv2.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m51823A(Class cls) {
        int i = AbstractC21344nh2.f72547a;
        try {
            Class cls2 = f39259b;
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
    public static boolean m51822B(Object obj, long j) {
        return f39261d.mo65645g(obj, j);
    }

    /* renamed from: C */
    public static boolean m51821C() {
        return f39263f;
    }

    /* renamed from: D */
    public static boolean m51820D() {
        return f39262e;
    }

    /* renamed from: E */
    public static int m51819E(Class cls) {
        if (f39263f) {
            return f39261d.f7422a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m51818a(Class cls) {
        if (f39263f) {
            return f39261d.f7422a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m51817b() {
        int i = AbstractC21344nh2.f72547a;
        Field m51816c = m51816c(Buffer.class, "effectiveDirectAddress");
        if (m51816c == null) {
            Field m51816c2 = m51816c(Buffer.class, "address");
            if (m51816c2 != null && m51816c2.getType() == Long.TYPE) {
                return m51816c2;
            }
            return null;
        }
        return m51816c;
    }

    /* renamed from: c */
    public static Field m51816c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m51815d(Object obj, long j, byte b) {
        Wu2 wu2 = f39261d;
        long j2 = (-4) & j;
        int i = wu2.f7422a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        wu2.f7422a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* renamed from: e */
    public static void m51814e(Object obj, long j, byte b) {
        Wu2 wu2 = f39261d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        wu2.f7422a.putInt(obj, j2, ((255 & b) << i) | (wu2.f7422a.getInt(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m51813f(Object obj, long j) {
        return f39261d.mo65651a(obj, j);
    }

    /* renamed from: g */
    public static float m51812g(Object obj, long j) {
        return f39261d.mo65650b(obj, j);
    }

    /* renamed from: h */
    public static int m51811h(Object obj, long j) {
        return f39261d.f7422a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m51810i(Object obj, long j) {
        return f39261d.f7422a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m51809j(Class cls) {
        try {
            return f39258a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m51808k(Object obj, long j) {
        return f39261d.f7422a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m51807l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Gu2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m51806m(Throwable th2) {
        Logger.getLogger(AbstractC19310bv2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* renamed from: r */
    public static void m51801r(Object obj, long j, boolean z) {
        f39261d.mo65649c(obj, j, z);
    }

    /* renamed from: s */
    public static void m51800s(byte[] bArr, long j, byte b) {
        f39261d.mo65648d(bArr, f39264g + j, b);
    }

    /* renamed from: t */
    public static void m51799t(Object obj, long j, double d) {
        f39261d.mo65647e(obj, j, d);
    }

    /* renamed from: u */
    public static void m51798u(Object obj, long j, float f) {
        f39261d.mo65646f(obj, j, f);
    }

    /* renamed from: v */
    public static void m51797v(Object obj, long j, int i) {
        f39261d.f7422a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m51796w(Object obj, long j, long j2) {
        f39261d.f7422a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m51795x(Object obj, long j, Object obj2) {
        f39261d.f7422a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m51794y(Object obj, long j) {
        if (((byte) ((f39261d.f7422a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m51793z(Object obj, long j) {
        if (((byte) ((f39261d.f7422a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}