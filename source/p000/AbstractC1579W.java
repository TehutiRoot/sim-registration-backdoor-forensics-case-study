package p000;

/* renamed from: W */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC1579W {
    /* renamed from: a */
    public static /* synthetic */ String m65717a(long j, int i) {
        long m66444a;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        i = (i < 2 || i > 36) ? 10 : 10;
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                m66444a = (j >>> 1) / (i >>> 1);
            } else {
                m66444a = RW1.m66444a(j, i);
            }
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m66444a * j2)), i);
            i3 = 63;
            while (m66444a > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (m66444a % j2), i);
                m66444a /= j2;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
