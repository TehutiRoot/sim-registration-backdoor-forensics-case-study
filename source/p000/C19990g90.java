package p000;

import org.brotli.dec.AbstractC12895b;
import org.brotli.dec.C12894a;

/* renamed from: g90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19990g90 {

    /* renamed from: a */
    public int f62063a;

    /* renamed from: b */
    public int[] f62064b;

    /* renamed from: c */
    public int[] f62065c;

    /* renamed from: a */
    public static void m31223a(C19990g90 c19990g90, C12894a c12894a) {
        int length = c19990g90.f62065c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            c19990g90.f62065c[i2] = i;
            AbstractC12895b.m24390n(c19990g90.f62063a, c19990g90.f62064b, i, c12894a);
            i += 1080;
        }
    }

    /* renamed from: b */
    public static void m31222b(C19990g90 c19990g90, int i, int i2) {
        c19990g90.f62063a = i;
        c19990g90.f62064b = new int[i2 * 1080];
        c19990g90.f62065c = new int[i2];
    }
}
