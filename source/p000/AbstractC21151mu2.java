package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.common.base.Ascii;
import okio.Utf8;

/* renamed from: mu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21151mu2 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m26181a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m26177e(b2) && (((b << Ascii.f52686FS) + (b2 + 112)) >> 30) == 0 && !m26177e(b3) && !m26177e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
            cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzeo.zzc();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m26180b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m26177e(b2)) {
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
            if (!m26177e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                return;
            }
        }
        throw zzeo.zzc();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m26179c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !m26177e(b2)) {
            cArr[i] = (char) (((b & Ascii.f52695US) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzeo.zzc();
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m26178d(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m26177e(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
