package p000;

/* renamed from: C70 */
/* loaded from: classes4.dex */
public abstract class C70 {
    /* renamed from: a */
    public static int m68997a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 <= 0) {
                return 1073741824;
            }
            return i2;
        }
        return highestOneBit;
    }

    /* renamed from: b */
    public static boolean m68996b(int i, int i2, double d) {
        if (i > d * i2 && i2 < 1073741824) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m68995c(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: d */
    public static int m68994d(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m68995c(hashCode);
    }
}