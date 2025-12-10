package p000;

/* renamed from: pf0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C21682pf0 {

    /* renamed from: a */
    public byte[] f76869a;

    /* renamed from: b */
    public int[] f76870b;

    /* renamed from: a */
    public static void m23797a(C21682pf0 c21682pf0, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = c21682pf0.f76870b;
            byte[] bArr = c21682pf0.f76869a;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }

    /* renamed from: b */
    public static void m23796b(C21682pf0 c21682pf0, byte[] bArr, int[] iArr) {
        c21682pf0.f76869a = bArr;
        c21682pf0.f76870b = iArr;
    }
}