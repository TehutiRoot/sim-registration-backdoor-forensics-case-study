package com.google.android.gms.internal.clearcut;

import com.feitian.readerdk.Tool.C6150DK;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes3.dex */
public final class zzfs {

    /* renamed from: a */
    public final ByteBuffer f45591a;

    /* renamed from: b */
    public zzbn f45592b;

    /* renamed from: c */
    public int f45593c;

    public zzfs(ByteBuffer byteBuffer) {
        this.f45591a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static int m48144a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static void m48141d(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c = 57343;
        int i2 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                char c2 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c2 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i3 = i2 + 1;
                            if (i3 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | C6150DK.ERROR_RECEIVE_LRC));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                } else {
                                    i2 = i3;
                                }
                            }
                            StringBuilder sb = new StringBuilder(39);
                            sb.append("Unpaired surrogate at index ");
                            sb.append(i2 - 1);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i2++;
                    }
                }
                byteBuffer.put((byte) c2);
                i2++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i4 = remaining + arrayOffset;
            while (i2 < length2) {
                int i5 = i2 + arrayOffset;
                if (i5 >= i4 || (charAt = charSequence.charAt(i2)) >= 128) {
                    break;
                }
                array[i5] = (byte) charAt;
                i2++;
            }
            if (i2 == length2) {
                i = arrayOffset + length2;
            } else {
                i = arrayOffset + i2;
                while (i2 < length2) {
                    char charAt4 = charSequence.charAt(i2);
                    if (charAt4 < 128 && i < i4) {
                        array[i] = (byte) charAt4;
                        i++;
                    } else if (charAt4 < 2048 && i <= i4 - 2) {
                        int i6 = i + 1;
                        array[i] = (byte) ((charAt4 >>> 6) | 960);
                        i += 2;
                        array[i6] = (byte) ((charAt4 & '?') | 128);
                    } else if ((charAt4 >= 55296 && c >= charAt4) || i > i4 - 3) {
                        if (i > i4 - 4) {
                            StringBuilder sb2 = new StringBuilder(37);
                            sb2.append("Failed writing ");
                            sb2.append(charAt4);
                            sb2.append(" at index ");
                            sb2.append(i);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i7 = i2 + 1;
                        if (i7 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i7);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                array[i] = (byte) ((codePoint2 >>> 18) | C6150DK.ERROR_RECEIVE_LRC);
                                array[i + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                int i8 = i + 3;
                                array[i + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                i += 4;
                                array[i8] = (byte) ((codePoint2 & 63) | 128);
                                i2 = i7;
                            } else {
                                i2 = i7;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("Unpaired surrogate at index ");
                        sb3.append(i2 - 1);
                        throw new IllegalArgumentException(sb3.toString());
                    } else {
                        array[i] = (byte) ((charAt4 >>> '\f') | 480);
                        int i9 = i + 2;
                        array[i + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i += 3;
                        array[i9] = (byte) ((charAt4 & '?') | 128);
                    }
                    i2++;
                    c = 57343;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* renamed from: e */
    public static int m48140e(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzb(int i, zzfz zzfzVar) {
        int zzr = zzr(i);
        int zzas = zzfzVar.zzas();
        return zzr + m48140e(zzas) + zzas;
    }

    public static int zzd(int i, long j) {
        return zzr(i) + zzo(j);
    }

    public static zzfs zzg(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzh(String str) {
        int m48144a = m48144a(str);
        return m48140e(m48144a) + m48144a;
    }

    public static long zzj(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzo(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int zzr(int i) {
        return m48140e(i << 3);
    }

    public static int zzs(int i) {
        if (i >= 0) {
            return m48140e(i);
        }
        return 10;
    }

    /* renamed from: b */
    public final void m48143b(int i) {
        byte b = (byte) i;
        if (!this.f45591a.hasRemaining()) {
            throw new zzft(this.f45591a.position(), this.f45591a.limit());
        }
        this.f45591a.put(b);
    }

    /* renamed from: c */
    public final void m48142c(int i) {
        while ((i & (-128)) != 0) {
            m48143b((i & 127) | 128);
            i >>>= 7;
        }
        m48143b(i);
    }

    public final void zza(int i, zzfz zzfzVar) throws IOException {
        zzb(i, 2);
        if (zzfzVar.zzrs < 0) {
            zzfzVar.zzas();
        }
        m48142c(zzfzVar.zzrs);
        zzfzVar.zza(this);
    }

    public final void zzc(int i, int i2) throws IOException {
        zzb(i, 0);
        if (i2 >= 0) {
            m48142c(i2);
        } else {
            zzn(i2);
        }
    }

    public final void zze(int i, zzdo zzdoVar) throws IOException {
        if (this.f45592b != null) {
            if (this.f45593c != this.f45591a.position()) {
                this.f45592b.write(this.f45591a.array(), this.f45593c, this.f45591a.position() - this.f45593c);
            }
            zzbn zzbnVar = this.f45592b;
            zzbnVar.zza(i, zzdoVar);
            zzbnVar.flush();
            this.f45593c = this.f45591a.position();
        }
        this.f45592b = zzbn.zza(this.f45591a);
        this.f45593c = this.f45591a.position();
        zzbn zzbnVar2 = this.f45592b;
        zzbnVar2.zza(i, zzdoVar);
        zzbnVar2.flush();
        this.f45593c = this.f45591a.position();
    }

    public final void zzem() {
        if (this.f45591a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f45591a.remaining())));
        }
    }

    public final void zzi(int i, long j) throws IOException {
        zzb(i, 0);
        zzn(j);
    }

    public final void zzn(long j) throws IOException {
        while (((-128) & j) != 0) {
            m48143b((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m48143b((int) j);
    }

    public zzfs(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int zzb(int i, String str) {
        return zzr(i) + zzh(str);
    }

    public static int zzh(byte[] bArr) {
        return m48140e(bArr.length) + bArr.length;
    }

    public final void zza(int i, String str) throws IOException {
        zzb(i, 2);
        try {
            int m48140e = m48140e(str.length());
            if (m48140e != m48140e(str.length() * 3)) {
                m48142c(m48144a(str));
                m48141d(str, this.f45591a);
                return;
            }
            int position = this.f45591a.position();
            if (this.f45591a.remaining() < m48140e) {
                throw new zzft(position + m48140e, this.f45591a.limit());
            }
            this.f45591a.position(position + m48140e);
            m48141d(str, this.f45591a);
            int position2 = this.f45591a.position();
            this.f45591a.position(position);
            m48142c((position2 - position) - m48140e);
            this.f45591a.position(position2);
        } catch (BufferOverflowException e) {
            zzft zzftVar = new zzft(this.f45591a.position(), this.f45591a.limit());
            zzftVar.initCause(e);
            throw zzftVar;
        }
    }

    public static int zzb(int i, byte[] bArr) {
        return zzr(i) + zzh(bArr);
    }

    public static zzfs zzh(byte[] bArr, int i, int i2) {
        return new zzfs(bArr, 0, i2);
    }

    public final void zza(int i, byte[] bArr) throws IOException {
        zzb(i, 2);
        m48142c(bArr.length);
        int length = bArr.length;
        if (this.f45591a.remaining() < length) {
            throw new zzft(this.f45591a.position(), this.f45591a.limit());
        }
        this.f45591a.put(bArr, 0, length);
    }

    public final void zzb(int i, int i2) throws IOException {
        m48142c((i << 3) | i2);
    }

    public final void zzb(int i, boolean z) throws IOException {
        zzb(25, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        if (!this.f45591a.hasRemaining()) {
            throw new zzft(this.f45591a.position(), this.f45591a.limit());
        }
        this.f45591a.put(b);
    }
}
