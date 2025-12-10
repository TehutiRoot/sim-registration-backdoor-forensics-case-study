package p000;

import com.google.android.gms.internal.firebase_ml.zzxs;
import com.google.common.base.Ascii;
import okio.Utf8;

/* renamed from: Ha2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17711Ha2 {
    /* renamed from: a */
    public static void m68079a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m68068l(b2) && (((b << Ascii.f52686FS) + (b2 + 112)) >> 30) == 0 && !m68068l(b3) && !m68068l(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
            cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzxs.zzvv();
    }

    /* renamed from: b */
    public static void m68078b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m68068l(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m68068l(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzxs.zzvv();
    }

    /* renamed from: c */
    public static void m68077c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m68068l(b2)) {
            cArr[i] = (char) (((b & Ascii.f52695US) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzxs.zzvv();
    }

    /* renamed from: d */
    public static void m68076d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: i */
    public static boolean m68071i(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m68070j(byte b) {
        if (b < -32) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m68069k(byte b) {
        if (b < -16) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m68068l(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
