package p000;

import org.brotli.dec.AbstractC12895b;
import org.brotli.dec.C12894a;

/* renamed from: m90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21080m90 {

    /* renamed from: a */
    public int f71911a;

    /* renamed from: b */
    public int[] f71912b;

    /* renamed from: c */
    public int[] f71913c;

    /* renamed from: a */
    public static void m26729a(C21080m90 c21080m90, C12894a c12894a) {
        int length = c21080m90.f71913c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            c21080m90.f71913c[i2] = i;
            AbstractC12895b.m24580n(c21080m90.f71911a, c21080m90.f71912b, i, c12894a);
            i += 1080;
        }
    }

    /* renamed from: b */
    public static void m26728b(C21080m90 c21080m90, int i, int i2) {
        c21080m90.f71911a = i;
        c21080m90.f71912b = new int[i2 * 1080];
        c21080m90.f71913c = new int[i2];
    }
}