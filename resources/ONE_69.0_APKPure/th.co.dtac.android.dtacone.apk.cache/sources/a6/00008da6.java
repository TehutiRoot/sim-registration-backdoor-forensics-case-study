package com.google.android.gms.internal.clearcut;

import com.feitian.readerdk.Tool.C6139DK;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* renamed from: com.google.android.gms.internal.clearcut.l */
/* loaded from: classes3.dex */
public abstract class AbstractC6393l {
    /* renamed from: d */
    public static void m48214d(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                char charAt2 = charSequence.charAt(i);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        position += i;
        while (i < length) {
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | CertificateHolderAuthorization.CVCA));
                    byteBuffer.put(i2, (byte) ((charAt3 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    char charAt22 = charSequence.charAt(i);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 >= 55296 && 57343 >= charAt3) {
                int i3 = i + 1;
                if (i3 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | C6139DK.ERROR_RECEIVE_LRC));
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
                                    char charAt222 = charSequence.charAt(i);
                                    StringBuilder sb22 = new StringBuilder(37);
                                    sb22.append("Failed writing ");
                                    sb22.append(charAt222);
                                    sb22.append(" at index ");
                                    sb22.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                                }
                            } catch (IndexOutOfBoundsException unused4) {
                                position = i4;
                                i = i3;
                                char charAt2222 = charSequence.charAt(i);
                                StringBuilder sb222 = new StringBuilder(37);
                                sb222.append("Failed writing ");
                                sb222.append(charAt2222);
                                sb222.append(" at index ");
                                sb222.append(byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1));
                                throw new ArrayIndexOutOfBoundsException(sb222.toString());
                            }
                        } else {
                            i = i3;
                        }
                    } catch (IndexOutOfBoundsException unused5) {
                    }
                }
                throw new zzfi(i, length);
            } else {
                int i6 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i6, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            }
            i++;
            position++;
        }
        byteBuffer.position(position);
    }

    /* renamed from: a */
    public abstract int mo48212a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: b */
    public abstract int mo48211b(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* renamed from: c */
    public abstract void mo48210c(CharSequence charSequence, ByteBuffer byteBuffer);

    /* renamed from: e */
    public final boolean m48213e(byte[] bArr, int i, int i2) {
        return mo48212a(0, bArr, i, i2) == 0;
    }
}