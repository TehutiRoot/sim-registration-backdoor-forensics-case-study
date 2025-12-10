package p000;

import org.apache.commons.codec.DecoderException;

/* renamed from: H02 */
/* loaded from: classes6.dex */
public abstract class H02 {
    /* renamed from: a */
    public static int m68132a(byte b) {
        int digit = Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b));
    }

    /* renamed from: b */
    public static char m68131b(int i) {
        return Character.toUpperCase(Character.forDigit(i & 15, 16));
    }
}
