package p000;

/* renamed from: jf0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20588jf0 {

    /* renamed from: a */
    public byte[] f67325a;

    /* renamed from: b */
    public int[] f67326b;

    /* renamed from: a */
    public static void m29163a(C20588jf0 c20588jf0, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = c20588jf0.f67326b;
            byte[] bArr = c20588jf0.f67325a;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }

    /* renamed from: b */
    public static void m29162b(C20588jf0 c20588jf0, byte[] bArr, int[] iArr) {
        c20588jf0.f67325a = bArr;
        c20588jf0.f67326b = iArr;
    }
}
