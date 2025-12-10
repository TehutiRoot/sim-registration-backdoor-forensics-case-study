package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
public abstract class zzkd extends zzjz {
    /* renamed from: a */
    public static char[] m47884a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public abstract int zza(CharSequence charSequence, int i, int i2);

    public final String zza(String str, int i) {
        int length = str.length();
        char[] m65386a = YB2.m65386a();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            if (i < length) {
                int i4 = i + 1;
                char charAt = str.charAt(i);
                char c = charAt;
                if (charAt >= 55296) {
                    c = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            StringBuilder sb = new StringBuilder(82);
                            sb.append("Unexpected low surrogate character '");
                            sb.append(charAt);
                            sb.append("' with value ");
                            sb.append((int) charAt);
                            sb.append(" at index ");
                            sb.append(i);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (i4 == length) {
                            c = -charAt;
                        } else {
                            char charAt2 = str.charAt(i4);
                            if (!Character.isLowSurrogate(charAt2)) {
                                StringBuilder sb2 = new StringBuilder(83);
                                sb2.append("Expected low surrogate but got char '");
                                sb2.append(charAt2);
                                sb2.append("' with value ");
                                sb2.append((int) charAt2);
                                sb2.append(" at index ");
                                sb2.append(i4);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            c = Character.toCodePoint(charAt, charAt2);
                        }
                    }
                }
                if (c >= 0) {
                    char[] zzan = zzan(c);
                    int i5 = (Character.isSupplementaryCodePoint(c) ? 2 : 1) + i;
                    if (zzan != null) {
                        int i6 = i - i2;
                        int i7 = i3 + i6;
                        int length2 = zzan.length + i7;
                        if (m65386a.length < length2) {
                            m65386a = m47884a(m65386a, i3, ((length2 + length) - i) + 32);
                        }
                        if (i6 > 0) {
                            str.getChars(i2, i, m65386a, i3);
                            i3 = i7;
                        }
                        if (zzan.length > 0) {
                            System.arraycopy(zzan, 0, m65386a, i3, zzan.length);
                            i3 += zzan.length;
                        }
                        i2 = i5;
                    }
                    i = zza(str, i5, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i8 + i3;
            if (m65386a.length < i9) {
                m65386a = m47884a(m65386a, i3, i9);
            }
            str.getChars(i2, length, m65386a, i3);
            i3 = i9;
        }
        return new String(m65386a, 0, i3);
    }

    public abstract char[] zzan(int i);
}
