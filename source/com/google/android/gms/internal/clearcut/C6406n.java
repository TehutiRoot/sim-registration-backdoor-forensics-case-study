package com.google.android.gms.internal.clearcut;

import com.feitian.readerdk.Tool.C6150DK;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.n */
/* loaded from: classes3.dex */
public final class C6406n extends AbstractC6404l {
    /* renamed from: f */
    public static int m48212f(byte[] bArr, int i, long j, int i2) {
        int m48227d;
        int m48219l;
        int m48225f;
        if (i2 == 0) {
            m48227d = AbstractC6403k.m48227d(i);
            return m48227d;
        } else if (i2 == 1) {
            m48219l = AbstractC6403k.m48219l(i, AbstractC22850wn2.m692a(bArr, j));
            return m48219l;
        } else if (i2 == 2) {
            m48225f = AbstractC6403k.m48225f(i, AbstractC22850wn2.m692a(bArr, j), AbstractC22850wn2.m692a(bArr, j + 1));
            return m48225f;
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.clearcut.AbstractC6404l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo48215a(int r18, byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6406n.mo48215a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC6404l
    /* renamed from: b */
    public final int mo48214b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        String str;
        String str2;
        int i3;
        long j2;
        long j3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            AbstractC22850wn2.m682k(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= 128 || j4 >= j5) {
                if (charAt3 >= 2048 || j4 > j5 - 2) {
                    str = str3;
                    str2 = str4;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 > charAt3 || charAt3 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                                StringBuilder sb2 = new StringBuilder(46);
                                sb2.append(str2);
                                sb2.append(charAt3);
                                sb2.append(str);
                                sb2.append(j4);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            throw new zzfi(i4, length);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                j2 = 1;
                                AbstractC22850wn2.m682k(bArr, j4, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                j3 = j5;
                                AbstractC22850wn2.m682k(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                AbstractC22850wn2.m682k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                AbstractC22850wn2.m682k(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new zzfi(i4 - 1, length);
                    }
                    AbstractC22850wn2.m682k(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    AbstractC22850wn2.m682k(bArr, j4 + 1, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j4 += 3;
                    AbstractC22850wn2.m682k(bArr, j7, (byte) ((charAt3 & '?') | 128));
                } else {
                    str = str3;
                    str2 = str4;
                    long j8 = j4 + j;
                    AbstractC22850wn2.m682k(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    j4 += 2;
                    AbstractC22850wn2.m682k(bArr, j8, (byte) ((charAt3 & '?') | 128));
                }
                j3 = j5;
                j2 = 1;
            } else {
                AbstractC22850wn2.m682k(bArr, j4, (byte) charAt3);
                j3 = j5;
                str2 = str4;
                j2 = j;
                j4 += j;
                str = str3;
            }
            i4++;
            str3 = str;
            str4 = str2;
            j = j2;
            j5 = j3;
        }
        return (int) j4;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC6404l
    /* renamed from: c */
    public final void mo48213c(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        char c;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        int i3;
        char charAt;
        ByteBuffer byteBuffer2 = byteBuffer;
        long m678o = AbstractC22850wn2.m678o(byteBuffer);
        long position = byteBuffer.position() + m678o;
        long limit = byteBuffer.limit() + m678o;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            AbstractC22850wn2.m690c(position, (byte) charAt);
            i4++;
            position = 1 + position;
        }
        if (i4 == length) {
            i = (int) (position - m678o);
        } else {
            while (i4 < length) {
                char charAt3 = charSequence.charAt(i4);
                if (charAt3 < c && position < limit) {
                    AbstractC22850wn2.m690c(position, (byte) charAt3);
                    j2 = m678o;
                    j3 = limit;
                    i2 = i4;
                    j4 = j;
                    position += j;
                } else if (charAt3 >= 2048 || position > limit - 2) {
                    j2 = m678o;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                        if (position > limit - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                                throw new zzfi(i4, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(position);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        i2 = i4 + 1;
                        if (i2 != length) {
                            char charAt4 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                j4 = 1;
                                AbstractC22850wn2.m690c(position, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                j3 = limit;
                                AbstractC22850wn2.m690c(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j5 = position + 3;
                                AbstractC22850wn2.m690c(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                position += 4;
                                AbstractC22850wn2.m690c(j5, (byte) ((codePoint & 63) | 128));
                            } else {
                                i4 = i2;
                            }
                        }
                        throw new zzfi(i4 - 1, length);
                    }
                    long j6 = position + j;
                    AbstractC22850wn2.m690c(position, (byte) ((charAt3 >>> '\f') | 480));
                    long j7 = position + 2;
                    AbstractC22850wn2.m690c(j6, (byte) (((charAt3 >>> 6) & 63) | 128));
                    position += 3;
                    AbstractC22850wn2.m690c(j7, (byte) ((charAt3 & '?') | 128));
                    j3 = limit;
                    i2 = i4;
                    j4 = 1;
                    i4 = i2 + 1;
                    m678o = j2;
                    j = j4;
                    limit = j3;
                    c = 128;
                } else {
                    j2 = m678o;
                    long j8 = position + j;
                    AbstractC22850wn2.m690c(position, (byte) ((charAt3 >>> 6) | 960));
                    position += 2;
                    AbstractC22850wn2.m690c(j8, (byte) ((charAt3 & '?') | 128));
                    j3 = limit;
                    i2 = i4;
                    j4 = j;
                }
                i4 = i2 + 1;
                m678o = j2;
                j = j4;
                limit = j3;
                c = 128;
            }
            i = (int) (position - m678o);
            byteBuffer2 = byteBuffer;
        }
        byteBuffer2.position(i);
    }
}
