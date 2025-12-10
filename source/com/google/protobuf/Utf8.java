package com.google.protobuf;

import com.feitian.readerdk.Tool.C6150DK;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* loaded from: classes4.dex */
public abstract class Utf8 {

    /* renamed from: a */
    public static final AbstractC8921b f57443a;

    /* loaded from: classes4.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: com.google.protobuf.Utf8$a */
    /* loaded from: classes4.dex */
    public static class C8920a {
        /* renamed from: h */
        public static void m35494h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (!m35489m(b2) && (((b << Ascii.f52686FS) + (b2 + 112)) >> 30) == 0 && !m35489m(b3) && !m35489m(b4)) {
                int m35484r = ((b & 7) << 18) | (m35484r(b2) << 12) | (m35484r(b3) << 6) | m35484r(b4);
                cArr[i] = m35490l(m35484r);
                cArr[i + 1] = m35485q(m35484r);
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* renamed from: i */
        public static void m35493i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: j */
        public static void m35492j(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (!m35489m(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m35489m(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | (m35484r(b2) << 6) | m35484r(b3));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* renamed from: k */
        public static void m35491k(byte b, byte b2, char[] cArr, int i) {
            if (b >= -62 && !m35489m(b2)) {
                cArr[i] = (char) (((b & Ascii.f52695US) << 6) | m35484r(b2));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* renamed from: l */
        public static char m35490l(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        /* renamed from: m */
        public static boolean m35489m(byte b) {
            return b > -65;
        }

        /* renamed from: n */
        public static boolean m35488n(byte b) {
            return b >= 0;
        }

        /* renamed from: o */
        public static boolean m35487o(byte b) {
            return b < -16;
        }

        /* renamed from: p */
        public static boolean m35486p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        public static char m35485q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m35484r(byte b) {
            return b & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    /* renamed from: com.google.protobuf.Utf8$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8921b {
        /* renamed from: m */
        public static int m35476m(ByteBuffer byteBuffer, int i, int i2) {
            int m35512m = i + Utf8.m35512m(byteBuffer, i, i2);
            while (m35512m < i2) {
                int i3 = m35512m + 1;
                byte b = byteBuffer.get(m35512m);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        m35512m += 2;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.m35508q(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = m35512m + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || byteBuffer.get(i4) > -65))) {
                            return -1;
                        }
                        m35512m += 3;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.m35508q(byteBuffer, b, i3, i2 - i3);
                    } else {
                        int i5 = m35512m + 2;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b << Ascii.f52686FS) + (b3 + 112)) >> 30) == 0) {
                            int i6 = m35512m + 3;
                            if (byteBuffer.get(i5) <= -65) {
                                m35512m += 4;
                                if (byteBuffer.get(i6) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                } else {
                    m35512m = i3;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public final String m35483a(ByteBuffer byteBuffer, int i, int i2) {
            if (byteBuffer.hasArray()) {
                return mo35472b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return mo35471d(byteBuffer, i, i2);
            } else {
                return m35482c(byteBuffer, i, i2);
            }
        }

        /* renamed from: b */
        public abstract String mo35472b(byte[] bArr, int i, int i2);

        /* renamed from: c */
        public final String m35482c(ByteBuffer byteBuffer, int i, int i2) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = byteBuffer.get(i);
                    if (!C8920a.m35488n(b)) {
                        break;
                    }
                    i++;
                    C8920a.m35493i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = byteBuffer.get(i);
                    if (C8920a.m35488n(b2)) {
                        int i7 = i5 + 1;
                        C8920a.m35493i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = byteBuffer.get(i6);
                            if (!C8920a.m35488n(b3)) {
                                break;
                            }
                            i6++;
                            C8920a.m35493i(b3, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        i = i6;
                    } else if (C8920a.m35486p(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            C8920a.m35491k(b2, byteBuffer.get(i6), cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (C8920a.m35487o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i + 2;
                            i += 3;
                            C8920a.m35492j(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = byteBuffer.get(i6);
                        int i9 = i + 3;
                        i += 4;
                        C8920a.m35494h(b2, b4, byteBuffer.get(i + 2), byteBuffer.get(i9), cArr, i5);
                        i5 += 2;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* renamed from: d */
        public abstract String mo35471d(ByteBuffer byteBuffer, int i, int i2);

        /* renamed from: e */
        public abstract int mo35470e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: f */
        public final void m35481f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(Utf8.m35516i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                mo35469h(charSequence, byteBuffer);
            } else {
                m35480g(charSequence, byteBuffer);
            }
        }

        /* renamed from: g */
        public final void m35480g(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i = 0;
            while (i < length) {
                try {
                    char charAt = charSequence.charAt(i);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i, (byte) charAt);
                    i++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                }
            }
            if (i == length) {
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position + i);
                return;
            }
            position += i;
            while (i < length) {
                char charAt2 = charSequence.charAt(i);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    int i2 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | CertificateHolderAuthorization.CVCA));
                        byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
                        position = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                    }
                } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i4 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                    int i5 = position + 2;
                                    try {
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i = i3;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i = i3;
                                        position = i5;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    position = i4;
                                    i = i3;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i = i3;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i, length);
                } else {
                    int i6 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                    position += 2;
                    byteBuffer.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                }
                i++;
                position++;
            }
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
        }

        /* renamed from: h */
        public abstract void mo35469h(CharSequence charSequence, ByteBuffer byteBuffer);

        /* renamed from: i */
        public final boolean m35479i(ByteBuffer byteBuffer, int i, int i2) {
            if (m35477k(0, byteBuffer, i, i2) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final boolean m35478j(byte[] bArr, int i, int i2) {
            if (mo35468l(0, bArr, i, i2) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public final int m35477k(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return mo35468l(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return mo35467o(i, byteBuffer, i2, i3);
            } else {
                return m35475n(i, byteBuffer, i2, i3);
            }
        }

        /* renamed from: l */
        public abstract int mo35468l(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:108:0x008f, code lost:
            if (r8.get(r7) > (-65)) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m35475n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.Utf8.m35524a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.Utf8.m35524a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.Utf8.m35523b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = m35476m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.AbstractC8921b.m35475n(int, java.nio.ByteBuffer, int, int):int");
        }

        /* renamed from: o */
        public abstract int mo35467o(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* renamed from: com.google.protobuf.Utf8$c */
    /* loaded from: classes4.dex */
    public static final class C8922c extends AbstractC8921b {
        /* renamed from: p */
        public static int m35474p(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m35473q(bArr, i, i2);
        }

        /* renamed from: q */
        public static int m35473q(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.m35507r(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i += 3;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.m35507r(bArr, i3, i2);
                    } else {
                        int i5 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << Ascii.f52686FS) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: b */
        public String mo35472b(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!C8920a.m35488n(b)) {
                        break;
                    }
                    i++;
                    C8920a.m35493i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (C8920a.m35488n(b2)) {
                        int i7 = i5 + 1;
                        C8920a.m35493i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!C8920a.m35488n(b3)) {
                                break;
                            }
                            i6++;
                            C8920a.m35493i(b3, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        i = i6;
                    } else if (C8920a.m35486p(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            C8920a.m35491k(b2, bArr[i6], cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (C8920a.m35487o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i + 2;
                            i += 3;
                            C8920a.m35492j(b2, bArr[i6], bArr[i8], cArr, i5);
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i6 < i3 - 2) {
                        byte b4 = bArr[i6];
                        int i9 = i + 3;
                        i += 4;
                        C8920a.m35494h(b2, b4, bArr[i + 2], bArr[i9], cArr, i5);
                        i5 += 2;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: d */
        public String mo35471d(ByteBuffer byteBuffer, int i, int i2) {
            return m35482c(byteBuffer, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo35470e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C8922c.mo35470e(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: h */
        public void mo35469h(CharSequence charSequence, ByteBuffer byteBuffer) {
            m35480g(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x0083, code lost:
            if (r8[r7] > (-65)) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo35468l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.Utf8.m35524a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.Utf8.m35524a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.Utf8.m35523b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = m35474p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C8922c.mo35468l(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: o */
        public int mo35467o(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m35475n(i, byteBuffer, i2, i3);
        }
    }

    /* renamed from: com.google.protobuf.Utf8$d */
    /* loaded from: classes4.dex */
    public static final class C8923d extends AbstractC8921b {
        /* renamed from: p */
        public static boolean m35466p() {
            if (AbstractC22806wY1.m818J() && AbstractC22806wY1.m817K()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:99:0x0039, code lost:
            return -1;
         */
        /* renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m35465q(long r10, int r12) {
            /*
                int r0 = m35463s(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = p000.AbstractC22806wY1.m777x(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = p000.AbstractC22806wY1.m777x(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = m35461u(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = p000.AbstractC22806wY1.m777x(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = p000.AbstractC22806wY1.m777x(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = m35461u(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = p000.AbstractC22806wY1.m777x(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = p000.AbstractC22806wY1.m777x(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = p000.AbstractC22806wY1.m777x(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C8923d.m35465q(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:99:0x0039, code lost:
            return -1;
         */
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m35464r(byte[] r10, long r11, int r13) {
            /*
                int r0 = m35462t(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = p000.AbstractC22806wY1.m776y(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = p000.AbstractC22806wY1.m776y(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = m35460v(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = p000.AbstractC22806wY1.m776y(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = p000.AbstractC22806wY1.m776y(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = m35460v(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = p000.AbstractC22806wY1.m776y(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = p000.AbstractC22806wY1.m776y(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = p000.AbstractC22806wY1.m776y(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C8923d.m35464r(byte[], long, int):int");
        }

        /* renamed from: s */
        public static int m35463s(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (AbstractC22806wY1.m777x(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (AbstractC22806wY1.m823E(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* renamed from: t */
        public static int m35462t(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = 8 - (((int) j) & 7);
            while (i2 < i3) {
                long j2 = 1 + j;
                if (AbstractC22806wY1.m776y(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (AbstractC22806wY1.m822F(bArr, AbstractC22806wY1.f108038h + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                long j3 = j + 1;
                if (AbstractC22806wY1.m776y(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j3;
            }
            return i;
        }

        /* renamed from: u */
        public static int m35461u(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.m35511n(i);
            }
            if (i2 == 1) {
                return Utf8.m35510o(i, AbstractC22806wY1.m777x(j));
            }
            if (i2 == 2) {
                return Utf8.m35509p(i, AbstractC22806wY1.m777x(j), AbstractC22806wY1.m777x(j + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: v */
        public static int m35460v(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.m35511n(i);
            }
            if (i2 == 1) {
                return Utf8.m35510o(i, AbstractC22806wY1.m776y(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m35509p(i, AbstractC22806wY1.m776y(bArr, j), AbstractC22806wY1.m776y(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: b */
        public String mo35472b(byte[] bArr, int i, int i2) {
            Charset charset = Internal.f57358b;
            String str = new String(bArr, i, i2, charset);
            if (!str.contains("�")) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                return str;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: d */
        public String mo35471d(ByteBuffer byteBuffer, int i, int i2) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                long m790k = AbstractC22806wY1.m790k(byteBuffer) + i;
                long j = i2 + m790k;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (m790k < j) {
                    byte m777x = AbstractC22806wY1.m777x(m790k);
                    if (!C8920a.m35488n(m777x)) {
                        break;
                    }
                    m790k++;
                    C8920a.m35493i(m777x, cArr, i3);
                    i3++;
                }
                while (m790k < j) {
                    long j2 = m790k + 1;
                    byte m777x2 = AbstractC22806wY1.m777x(m790k);
                    if (C8920a.m35488n(m777x2)) {
                        int i4 = i3 + 1;
                        C8920a.m35493i(m777x2, cArr, i3);
                        while (j2 < j) {
                            byte m777x3 = AbstractC22806wY1.m777x(j2);
                            if (!C8920a.m35488n(m777x3)) {
                                break;
                            }
                            j2++;
                            C8920a.m35493i(m777x3, cArr, i4);
                            i4++;
                        }
                        i3 = i4;
                        m790k = j2;
                    } else if (C8920a.m35486p(m777x2)) {
                        if (j2 < j) {
                            m790k += 2;
                            C8920a.m35491k(m777x2, AbstractC22806wY1.m777x(j2), cArr, i3);
                            i3++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (C8920a.m35487o(m777x2)) {
                        if (j2 < j - 1) {
                            long j3 = 2 + m790k;
                            m790k += 3;
                            C8920a.m35492j(m777x2, AbstractC22806wY1.m777x(j2), AbstractC22806wY1.m777x(j3), cArr, i3);
                            i3++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (j2 < j - 2) {
                        long j4 = m790k + 3;
                        m790k += 4;
                        C8920a.m35494h(m777x2, AbstractC22806wY1.m777x(j2), AbstractC22806wY1.m777x(2 + m790k), AbstractC22806wY1.m777x(j4), cArr, i3);
                        i3 += 2;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i3);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: e */
        public int mo35470e(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                AbstractC22806wY1.m810R(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= 128 || j4 >= j5) {
                    if (charAt2 >= 2048 || j4 > j5 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                            if (j4 <= j5 - 4) {
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char charAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j2 = 1;
                                        AbstractC22806wY1.m810R(bArr, j4, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                        j3 = j5;
                                        AbstractC22806wY1.m810R(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = j4 + 3;
                                        AbstractC22806wY1.m810R(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j4 += 4;
                                        AbstractC22806wY1.m810R(bArr, j6, (byte) ((codePoint & 63) | 128));
                                        i4 = i5;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                throw new UnpairedSurrogateException(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j4);
                            }
                        }
                        AbstractC22806wY1.m810R(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j7 = j4 + 2;
                        AbstractC22806wY1.m810R(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j4 += 3;
                        AbstractC22806wY1.m810R(bArr, j7, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j8 = j4 + j;
                        AbstractC22806wY1.m810R(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        AbstractC22806wY1.m810R(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    }
                    j3 = j5;
                    j2 = 1;
                } else {
                    AbstractC22806wY1.m810R(bArr, j4, (byte) charAt2);
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

        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: h */
        public void mo35469h(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j;
            char c;
            long j2;
            long j3;
            int i;
            long j4;
            int i2;
            char charAt;
            long m790k = AbstractC22806wY1.m790k(byteBuffer);
            long position = byteBuffer.position() + m790k;
            long limit = byteBuffer.limit() + m790k;
            int length = charSequence.length();
            if (length <= limit - position) {
                int i3 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i3 >= length || (charAt = charSequence.charAt(i3)) >= 128) {
                        break;
                    }
                    AbstractC22806wY1.m811Q(position, (byte) charAt);
                    i3++;
                    position = 1 + position;
                }
                if (i3 == length) {
                    ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position((int) (position - m790k));
                    return;
                }
                while (i3 < length) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < c && position < limit) {
                        AbstractC22806wY1.m811Q(position, (byte) charAt2);
                        j2 = m790k;
                        j3 = limit;
                        i = i3;
                        j4 = j;
                        position += j;
                    } else if (charAt2 < 2048 && position <= limit - 2) {
                        j2 = m790k;
                        long j5 = position + j;
                        AbstractC22806wY1.m811Q(position, (byte) ((charAt2 >>> 6) | 960));
                        position += 2;
                        AbstractC22806wY1.m811Q(j5, (byte) ((charAt2 & '?') | 128));
                        j3 = limit;
                        i = i3;
                        j4 = j;
                    } else {
                        j2 = m790k;
                        if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                            long j6 = position + j;
                            AbstractC22806wY1.m811Q(position, (byte) ((charAt2 >>> '\f') | 480));
                            long j7 = position + 2;
                            AbstractC22806wY1.m811Q(j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                            position += 3;
                            AbstractC22806wY1.m811Q(j7, (byte) ((charAt2 & '?') | 128));
                            j3 = limit;
                            i = i3;
                            j4 = 1;
                        } else if (position <= limit - 4) {
                            i = i3 + 1;
                            if (i != length) {
                                char charAt3 = charSequence.charAt(i);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j4 = 1;
                                    AbstractC22806wY1.m811Q(position, (byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                    j3 = limit;
                                    AbstractC22806wY1.m811Q(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = position + 3;
                                    AbstractC22806wY1.m811Q(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    position += 4;
                                    AbstractC22806wY1.m811Q(j8, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i3 = i;
                                }
                            }
                            throw new UnpairedSurrogateException(i3 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i2)))) {
                            throw new UnpairedSurrogateException(i3, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                        }
                        i3 = i + 1;
                        m790k = j2;
                        j = j4;
                        limit = j3;
                        c = 128;
                    }
                    i3 = i + 1;
                    m790k = j2;
                    j = j4;
                    limit = j3;
                    c = 128;
                }
                ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position((int) (position - m790k));
                return;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x009e, code lost:
            if (p000.AbstractC22806wY1.m776y(r13, r1) > (-65)) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0059, code lost:
            if (p000.AbstractC22806wY1.m776y(r13, r1) > (-65)) goto L36;
         */
        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo35468l(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C8923d.mo35468l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:0x00a3, code lost:
            if (p000.AbstractC22806wY1.m777x(r1) > (-65)) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x002e, code lost:
            if (p000.AbstractC22806wY1.m777x(r1) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0062, code lost:
            if (p000.AbstractC22806wY1.m777x(r1) > (-65)) goto L35;
         */
        @Override // com.google.protobuf.Utf8.AbstractC8921b
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo35467o(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C8923d.mo35467o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        AbstractC8921b c8922c;
        if (C8923d.m35466p() && !AbstractC1503V2.m65948c()) {
            c8922c = new C8923d();
        } else {
            c8922c = new C8922c();
        }
        f57443a = c8922c;
    }

    /* renamed from: g */
    public static String m35518g(ByteBuffer byteBuffer, int i, int i2) {
        return f57443a.m35483a(byteBuffer, i, i2);
    }

    /* renamed from: h */
    public static String m35517h(byte[] bArr, int i, int i2) {
        return f57443a.mo35472b(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m35516i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f57443a.mo35470e(charSequence, bArr, i, i2);
    }

    /* renamed from: j */
    public static void m35515j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f57443a.m35481f(charSequence, byteBuffer);
    }

    /* renamed from: k */
    public static int m35514k(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt < 2048) {
                    i2 += (127 - charAt) >>> 31;
                    i++;
                } else {
                    i2 += m35513l(charSequence, i);
                    break;
                }
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    /* renamed from: l */
    public static int m35513l(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new UnpairedSurrogateException(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: m */
    public static int m35512m(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* renamed from: n */
    public static int m35511n(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: o */
    public static int m35510o(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: p */
    public static int m35509p(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: q */
    public static int m35508q(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m35509p(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
                }
                throw new AssertionError();
            }
            return m35510o(i, byteBuffer.get(i2));
        }
        return m35511n(i);
    }

    /* renamed from: r */
    public static int m35507r(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m35509p(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m35510o(b, bArr[i]);
        }
        return m35511n(b);
    }

    /* renamed from: s */
    public static boolean m35506s(ByteBuffer byteBuffer) {
        return f57443a.m35479i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: t */
    public static boolean m35505t(byte[] bArr) {
        return f57443a.m35478j(bArr, 0, bArr.length);
    }

    /* renamed from: u */
    public static boolean m35504u(byte[] bArr, int i, int i2) {
        return f57443a.m35478j(bArr, i, i2);
    }

    /* renamed from: v */
    public static int m35503v(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f57443a.m35477k(i, byteBuffer, i2, i3);
    }

    /* renamed from: w */
    public static int m35502w(int i, byte[] bArr, int i2, int i3) {
        return f57443a.mo35468l(i, bArr, i2, i3);
    }
}
