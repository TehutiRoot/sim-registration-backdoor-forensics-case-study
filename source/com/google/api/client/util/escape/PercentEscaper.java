package com.google.api.client.util.escape;

import ch.qos.logback.core.CoreConstants;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class PercentEscaper extends UnicodeEscaper {
    public static final String SAFECHARS_URLENCODER = "-_.*";
    public static final String SAFEPATHCHARS_URLENCODER = "-_.!~*'()@:$&,;=+";
    public static final String SAFEQUERYSTRINGCHARS_URLENCODER = "-_.!~*'()@:$,;/?:";
    public static final String SAFEUSERINFOCHARS_URLENCODER = "-_.!~*'():$&,;=";
    public static final String SAFE_PLUS_RESERVED_CHARS_URLENCODER = "-_.!~*'()@:$&,;=+/?#[]";

    /* renamed from: c */
    public static final char[] f52376c = {'+'};

    /* renamed from: d */
    public static final char[] f52377d = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public final boolean f52378a;

    /* renamed from: b */
    public final boolean[] f52379b;

    public PercentEscaper(String str) {
        this(str, false);
    }

    /* renamed from: b */
    public static boolean[] m41687b(String str) {
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
        return zArr;
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper, com.google.api.client.util.escape.Escaper
    public String escape(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.f52379b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.f52379b;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Deprecated
    public PercentEscaper(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            if (z && str.contains(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            if (!str.contains("%")) {
                this.f52378a = z;
                this.f52379b = m41687b(str);
                return;
            }
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper
    public char[] escape(int i) {
        boolean[] zArr = this.f52379b;
        if (i >= zArr.length || !zArr[i]) {
            if (i == 32 && this.f52378a) {
                return f52376c;
            }
            if (i <= 127) {
                char[] cArr = f52377d;
                return new char[]{CoreConstants.PERCENT_CHAR, cArr[i >>> 4], cArr[i & 15]};
            } else if (i <= 2047) {
                char[] cArr2 = f52377d;
                return new char[]{CoreConstants.PERCENT_CHAR, cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr2[((i >>> 4) & 3) | 8], cArr2[i & 15]};
            } else if (i <= 65535) {
                char[] cArr3 = f52377d;
                return new char[]{CoreConstants.PERCENT_CHAR, 'E', cArr3[i >>> 12], CoreConstants.PERCENT_CHAR, cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr3[((i >>> 4) & 3) | 8], cArr3[i & 15]};
            } else if (i <= 1114111) {
                char[] cArr4 = f52377d;
                return new char[]{CoreConstants.PERCENT_CHAR, 'F', cArr4[(i >>> 18) & 7], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 10) & 3) | 8], cArr4[(i >>> 6) & 15], CoreConstants.PERCENT_CHAR, cArr4[((i >>> 4) & 3) | 8], cArr4[i & 15]};
            } else {
                throw new IllegalArgumentException("Invalid unicode character value " + i);
            }
        }
        return null;
    }
}
