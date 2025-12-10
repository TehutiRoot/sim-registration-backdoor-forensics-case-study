package com.google.common.net;

import ch.qos.logback.core.CoreConstants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import javax.annotation.CheckForNull;
import org.apache.commons.cli.HelpFormatter;

@GwtCompatible
/* loaded from: classes4.dex */
public final class PercentEscaper extends UnicodeEscaper {

    /* renamed from: d */
    public static final char[] f54063d = {'+'};

    /* renamed from: e */
    public static final char[] f54064e = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    public final boolean f54065b;

    /* renamed from: c */
    public final boolean[] f54066c;

    public PercentEscaper(String str, boolean z) {
        Preconditions.checkNotNull(str);
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String str2 = str + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            if (z && str2.contains(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            this.f54065b = z;
            this.f54066c = m39878b(str2);
            return;
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    /* renamed from: b */
    public static boolean[] m39878b(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.f54066c;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        Preconditions.checkNotNull(charSequence);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.f54066c;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    public char[] escape(int i) {
        boolean[] zArr = this.f54066c;
        if (i >= zArr.length || !zArr[i]) {
            if (i == 32 && this.f54065b) {
                return f54063d;
            }
            if (i <= 127) {
                char[] cArr = f54064e;
                return new char[]{CoreConstants.PERCENT_CHAR, cArr[i >>> 4], cArr[i & 15]};
            } else if (i <= 2047) {
                char[] cArr2 = f54064e;
                return new char[]{CoreConstants.PERCENT_CHAR, cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr2[((i >>> 4) & 3) | 8], cArr2[i & 15]};
            } else if (i <= 65535) {
                char[] cArr3 = f54064e;
                return new char[]{CoreConstants.PERCENT_CHAR, 'E', cArr3[i >>> 12], CoreConstants.PERCENT_CHAR, cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr3[((i >>> 4) & 3) | 8], cArr3[i & 15]};
            } else if (i <= 1114111) {
                char[] cArr4 = f54064e;
                return new char[]{CoreConstants.PERCENT_CHAR, 'F', cArr4[(i >>> 18) & 7], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 10) & 3) | 8], cArr4[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 4) & 3) | 8], cArr4[i & 15]};
            } else {
                throw new IllegalArgumentException("Invalid unicode character value " + i);
            }
        }
        return null;
    }
}
