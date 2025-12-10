package p000;

/* renamed from: D12 */
/* loaded from: classes6.dex */
public abstract class D12 {

    /* renamed from: a */
    public static final byte[] f902a = new byte[1024];

    /* renamed from: b */
    public static final int[] f903b = new int[1024];

    /* renamed from: a */
    public static void m68893a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(f902a, 0, bArr, i + i3, min);
            i3 += min;
        }
    }

    /* renamed from: b */
    public static void m68892b(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(f903b, 0, iArr, i + i3, min);
            i3 += min;
        }
    }
}