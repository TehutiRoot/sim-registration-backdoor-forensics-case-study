package com.google.api.client.util.escape;

/* loaded from: classes4.dex */
public abstract class UnicodeEscaper extends Escaper {
    /* renamed from: a */
    public static char[] m41686a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public static int codePointAt(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt >= 55296 && charAt <= 57343) {
                if (charAt <= 56319) {
                    if (i3 == i2) {
                        return -charAt;
                    }
                    char charAt2 = charSequence.charAt(i3);
                    if (Character.isLowSurrogate(charAt2)) {
                        return Character.toCodePoint(charAt, charAt2);
                    }
                    throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3);
                }
                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + i);
            }
            return charAt;
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    @Override // com.google.api.client.util.escape.Escaper
    public abstract String escape(String str);

    public abstract char[] escape(int i);

    public final String escapeSlow(String str, int i) {
        int i2;
        int length = str.length();
        char[] m69054a = AbstractC17292Ak1.m69054a();
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            int codePointAt = codePointAt(str, i, length);
            if (codePointAt >= 0) {
                char[] escape = escape(codePointAt);
                if (Character.isSupplementaryCodePoint(codePointAt)) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i5 = i2 + i;
                if (escape != null) {
                    int i6 = i - i3;
                    int i7 = i4 + i6;
                    int length2 = escape.length + i7;
                    if (m69054a.length < length2) {
                        m69054a = m41686a(m69054a, i4, ((length2 + length) - i) + 32);
                    }
                    if (i6 > 0) {
                        str.getChars(i3, i, m69054a, i4);
                        i4 = i7;
                    }
                    if (escape.length > 0) {
                        System.arraycopy(escape, 0, m69054a, i4, escape.length);
                        i4 += escape.length;
                    }
                    i3 = i5;
                }
                i = nextEscapeIndex(str, i5, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i8 + i4;
            if (m69054a.length < i9) {
                m69054a = m41686a(m69054a, i4, i9);
            }
            str.getChars(i3, length, m69054a, i4);
            i4 = i9;
        }
        return new String(m69054a, 0, i4);
    }

    public abstract int nextEscapeIndex(CharSequence charSequence, int i, int i2);
}
