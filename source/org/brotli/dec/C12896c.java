package org.brotli.dec;

import java.io.InputStream;

/* renamed from: org.brotli.dec.c */
/* loaded from: classes6.dex */
public final class C12896c {

    /* renamed from: A */
    public byte[] f75621A;

    /* renamed from: B */
    public int f75622B;

    /* renamed from: C */
    public int f75623C;

    /* renamed from: D */
    public int f75624D;

    /* renamed from: E */
    public int f75625E;

    /* renamed from: F */
    public int f75626F;

    /* renamed from: G */
    public int f75627G;

    /* renamed from: H */
    public byte[] f75628H;

    /* renamed from: I */
    public int f75629I;

    /* renamed from: J */
    public int f75630J;

    /* renamed from: K */
    public int f75631K;

    /* renamed from: L */
    public int f75632L;

    /* renamed from: M */
    public int f75633M;

    /* renamed from: N */
    public int f75634N;

    /* renamed from: O */
    public int f75635O;

    /* renamed from: P */
    public int f75636P;

    /* renamed from: U */
    public int f75641U;

    /* renamed from: V */
    public int f75642V;

    /* renamed from: W */
    public int f75643W;

    /* renamed from: X */
    public int f75644X;

    /* renamed from: Y */
    public int f75645Y;

    /* renamed from: Z */
    public byte[] f75646Z;

    /* renamed from: b */
    public int f75648b;

    /* renamed from: d */
    public byte[] f75650d;

    /* renamed from: g */
    public int f75653g;

    /* renamed from: h */
    public boolean f75654h;

    /* renamed from: i */
    public boolean f75655i;

    /* renamed from: j */
    public boolean f75656j;

    /* renamed from: w */
    public int f75669w;

    /* renamed from: x */
    public int f75670x;

    /* renamed from: y */
    public int f75671y;

    /* renamed from: z */
    public byte[] f75672z;

    /* renamed from: a */
    public int f75647a = 0;

    /* renamed from: c */
    public final C12894a f75649c = new C12894a();

    /* renamed from: e */
    public final int[] f75651e = new int[3240];

    /* renamed from: f */
    public final int[] f75652f = new int[3240];

    /* renamed from: k */
    public final C19990g90 f75657k = new C19990g90();

    /* renamed from: l */
    public final C19990g90 f75658l = new C19990g90();

    /* renamed from: m */
    public final C19990g90 f75659m = new C19990g90();

    /* renamed from: n */
    public final int[] f75660n = new int[3];

    /* renamed from: o */
    public final int[] f75661o = new int[3];

    /* renamed from: p */
    public final int[] f75662p = new int[6];

    /* renamed from: q */
    public final int[] f75663q = {16, 15, 11, 4};

    /* renamed from: r */
    public int f75664r = 0;

    /* renamed from: s */
    public int f75665s = 0;

    /* renamed from: t */
    public int f75666t = 0;

    /* renamed from: u */
    public boolean f75667u = false;

    /* renamed from: v */
    public int f75668v = 0;

    /* renamed from: Q */
    public int f75637Q = 0;

    /* renamed from: R */
    public long f75638R = 0;

    /* renamed from: S */
    public byte[] f75639S = new byte[0];

    /* renamed from: T */
    public int f75640T = 0;

    /* renamed from: a */
    public static void m24382a(C12896c c12896c) {
        int i = c12896c.f75647a;
        if (i != 0) {
            if (i == 11) {
                return;
            }
            c12896c.f75647a = 11;
            C12894a.m24413b(c12896c.f75649c);
            return;
        }
        throw new IllegalStateException("State MUST be initialized");
    }

    /* renamed from: b */
    public static int m24381b(C12894a c12894a) {
        if (C12894a.m24406i(c12894a, 1) == 0) {
            return 16;
        }
        int m24406i = C12894a.m24406i(c12894a, 3);
        if (m24406i != 0) {
            return m24406i + 17;
        }
        int m24406i2 = C12894a.m24406i(c12894a, 3);
        if (m24406i2 == 0) {
            return 17;
        }
        return m24406i2 + 8;
    }

    /* renamed from: c */
    public static void m24380c(C12896c c12896c, InputStream inputStream) {
        if (c12896c.f75647a == 0) {
            C12894a.m24410e(c12896c.f75649c, inputStream);
            int m24381b = m24381b(c12896c.f75649c);
            if (m24381b != 9) {
                int i = 1 << m24381b;
                c12896c.f75636P = i;
                c12896c.f75635O = i - 16;
                c12896c.f75647a = 1;
                return;
            }
            throw new BrotliRuntimeException("Invalid 'windowBits' code");
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
}
