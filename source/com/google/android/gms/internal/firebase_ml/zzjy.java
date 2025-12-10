package com.google.android.gms.internal.firebase_ml;

import ch.qos.logback.core.CoreConstants;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zzjy extends zzkd {

    /* renamed from: c */
    public static final char[] f45938c = {'+'};

    /* renamed from: d */
    public static final char[] f45939d = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public final boolean f45940a;

    /* renamed from: b */
    public final boolean[] f45941b;

    public zzjy(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            if (z && str.contains(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            if (!str.contains("%")) {
                this.f45940a = z;
                char[] charArray = str.toCharArray();
                int i = 122;
                for (char c : charArray) {
                    i = Math.max((int) c, i);
                }
                boolean[] zArr = new boolean[i + 1];
                for (int i2 = 48; i2 <= 57; i2++) {
                    zArr[i2] = true;
                }
                for (int i3 = 65; i3 <= 90; i3++) {
                    zArr[i3] = true;
                }
                for (int i4 = 97; i4 <= 122; i4++) {
                    zArr[i4] = true;
                }
                for (char c2 : charArray) {
                    zArr[c2] = true;
                }
                this.f45941b = zArr;
                return;
            }
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkd
    public final int zza(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.f45941b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkd
    public final char[] zzan(int i) {
        boolean[] zArr = this.f45941b;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.f45940a) {
            return f45938c;
        }
        if (i <= 127) {
            char[] cArr = f45939d;
            return new char[]{CoreConstants.PERCENT_CHAR, cArr[i >>> 4], cArr[i & 15]};
        } else if (i <= 2047) {
            char[] cArr2 = f45939d;
            return new char[]{CoreConstants.PERCENT_CHAR, cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr2[((i >>> 4) & 3) | 8], cArr2[i & 15]};
        } else if (i <= 65535) {
            char[] cArr3 = f45939d;
            return new char[]{CoreConstants.PERCENT_CHAR, 'E', cArr3[i >>> 12], CoreConstants.PERCENT_CHAR, cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr3[((i >>> 4) & 3) | 8], cArr3[i & 15]};
        } else if (i <= 1114111) {
            char[] cArr4 = f45939d;
            return new char[]{CoreConstants.PERCENT_CHAR, 'F', cArr4[(i >>> 18) & 7], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 10) & 3) | 8], cArr4[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 4) & 3) | 8], cArr4[i & 15]};
        } else {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid unicode character value ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjz
    public final String zzaw(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.f45941b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return zza(str, i);
            }
        }
        return str;
    }
}
