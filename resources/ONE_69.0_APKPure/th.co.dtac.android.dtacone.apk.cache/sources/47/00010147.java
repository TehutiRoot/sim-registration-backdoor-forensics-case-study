package org.brotli.dec;

import java.io.InputStream;

/* renamed from: org.brotli.dec.c */
/* loaded from: classes6.dex */
public final class C12896c {

    /* renamed from: A */
    public byte[] f75705A;

    /* renamed from: B */
    public int f75706B;

    /* renamed from: C */
    public int f75707C;

    /* renamed from: D */
    public int f75708D;

    /* renamed from: E */
    public int f75709E;

    /* renamed from: F */
    public int f75710F;

    /* renamed from: G */
    public int f75711G;

    /* renamed from: H */
    public byte[] f75712H;

    /* renamed from: I */
    public int f75713I;

    /* renamed from: J */
    public int f75714J;

    /* renamed from: K */
    public int f75715K;

    /* renamed from: L */
    public int f75716L;

    /* renamed from: M */
    public int f75717M;

    /* renamed from: N */
    public int f75718N;

    /* renamed from: O */
    public int f75719O;

    /* renamed from: P */
    public int f75720P;

    /* renamed from: U */
    public int f75725U;

    /* renamed from: V */
    public int f75726V;

    /* renamed from: W */
    public int f75727W;

    /* renamed from: X */
    public int f75728X;

    /* renamed from: Y */
    public int f75729Y;

    /* renamed from: Z */
    public byte[] f75730Z;

    /* renamed from: b */
    public int f75732b;

    /* renamed from: d */
    public byte[] f75734d;

    /* renamed from: g */
    public int f75737g;

    /* renamed from: h */
    public boolean f75738h;

    /* renamed from: i */
    public boolean f75739i;

    /* renamed from: j */
    public boolean f75740j;

    /* renamed from: w */
    public int f75753w;

    /* renamed from: x */
    public int f75754x;

    /* renamed from: y */
    public int f75755y;

    /* renamed from: z */
    public byte[] f75756z;

    /* renamed from: a */
    public int f75731a = 0;

    /* renamed from: c */
    public final C12894a f75733c = new C12894a();

    /* renamed from: e */
    public final int[] f75735e = new int[3240];

    /* renamed from: f */
    public final int[] f75736f = new int[3240];

    /* renamed from: k */
    public final C21080m90 f75741k = new C21080m90();

    /* renamed from: l */
    public final C21080m90 f75742l = new C21080m90();

    /* renamed from: m */
    public final C21080m90 f75743m = new C21080m90();

    /* renamed from: n */
    public final int[] f75744n = new int[3];

    /* renamed from: o */
    public final int[] f75745o = new int[3];

    /* renamed from: p */
    public final int[] f75746p = new int[6];

    /* renamed from: q */
    public final int[] f75747q = {16, 15, 11, 4};

    /* renamed from: r */
    public int f75748r = 0;

    /* renamed from: s */
    public int f75749s = 0;

    /* renamed from: t */
    public int f75750t = 0;

    /* renamed from: u */
    public boolean f75751u = false;

    /* renamed from: v */
    public int f75752v = 0;

    /* renamed from: Q */
    public int f75721Q = 0;

    /* renamed from: R */
    public long f75722R = 0;

    /* renamed from: S */
    public byte[] f75723S = new byte[0];

    /* renamed from: T */
    public int f75724T = 0;

    /* renamed from: a */
    public static void m24572a(C12896c c12896c) {
        int i = c12896c.f75731a;
        if (i != 0) {
            if (i == 11) {
                return;
            }
            c12896c.f75731a = 11;
            C12894a.m24603b(c12896c.f75733c);
            return;
        }
        throw new IllegalStateException("State MUST be initialized");
    }

    /* renamed from: b */
    public static int m24571b(C12894a c12894a) {
        if (C12894a.m24596i(c12894a, 1) == 0) {
            return 16;
        }
        int m24596i = C12894a.m24596i(c12894a, 3);
        if (m24596i != 0) {
            return m24596i + 17;
        }
        int m24596i2 = C12894a.m24596i(c12894a, 3);
        if (m24596i2 == 0) {
            return 17;
        }
        return m24596i2 + 8;
    }

    /* renamed from: c */
    public static void m24570c(C12896c c12896c, InputStream inputStream) {
        if (c12896c.f75731a == 0) {
            C12894a.m24600e(c12896c.f75733c, inputStream);
            int m24571b = m24571b(c12896c.f75733c);
            if (m24571b != 9) {
                int i = 1 << m24571b;
                c12896c.f75720P = i;
                c12896c.f75719O = i - 16;
                c12896c.f75731a = 1;
                return;
            }
            throw new BrotliRuntimeException("Invalid 'windowBits' code");
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
}