package p000;

import com.google.android.gms.internal.measurement.zzko;
import com.google.common.base.Ascii;
import okio.Utf8;

/* renamed from: DH2 */
/* loaded from: classes3.dex */
public abstract class DH2 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m68668a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m68664e(b2) && (((b << Ascii.f52686FS) + (b2 + 112)) >> 30) == 0 && !m68664e(b3) && !m68664e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
            cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzko.zzc();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m68667b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m68664e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m68664e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                return;
            }
        }
        throw zzko.zzc();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m68666c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m68664e(b2)) {
            cArr[i] = (char) (((b & Ascii.f52695US) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzko.zzc();
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m68665d(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m68664e(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
