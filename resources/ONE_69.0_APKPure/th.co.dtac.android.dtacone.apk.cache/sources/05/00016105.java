package p000;

import com.google.android.gms.internal.vision.zzjk;
import com.google.common.base.Ascii;
import okio.Utf8;

/* renamed from: xH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23009xH2 {
    /* renamed from: f */
    public static void m578f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m569o(b2) && (((b << Ascii.f52698FS) + (b2 + 112)) >> 30) == 0 && !m569o(b3) && !m569o(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
            cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzjk.zzh();
    }

    /* renamed from: g */
    public static void m577g(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m569o(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m569o(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzjk.zzh();
    }

    /* renamed from: h */
    public static void m576h(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m569o(b2)) {
            cArr[i] = (char) (((b & Ascii.f52707US) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzjk.zzh();
    }

    /* renamed from: i */
    public static void m575i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: l */
    public static boolean m572l(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m571m(byte b) {
        if (b < -32) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m570n(byte b) {
        if (b < -16) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m569o(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}