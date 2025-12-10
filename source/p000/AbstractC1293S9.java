package p000;

import androidx.core.view.ViewCompat;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: S9 */
/* loaded from: classes6.dex */
public abstract class AbstractC1293S9 {

    /* renamed from: a */
    public static final char[] f5535a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    /* renamed from: a */
    public static void m66366a(byte b, byte b2, byte b3, int i, StringBuilder sb) {
        int i2 = ((b << 16) & ViewCompat.MEASURED_SIZE_MASK) | ((b2 << 8) & 65535) | (b3 & 255);
        while (true) {
            int i3 = i - 1;
            if (i > 0) {
                sb.append(f5535a[i2 & 63]);
                i2 >>= 6;
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static String m66365b(int i) {
        return m66364c(i, new SecureRandom());
    }

    /* renamed from: c */
    public static String m66364c(int i, Random random) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(64)));
        }
        return sb.toString();
    }
}
