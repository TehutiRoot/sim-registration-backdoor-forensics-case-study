package com.google.android.gms.internal.firebase_ml;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import kotlin.p023io.encoding.Base64;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class zzim extends zzip {

    /* renamed from: j */
    public static final byte[] f45863j = {13, 10};

    /* renamed from: k */
    public static final byte[] f45864k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: l */
    public static final byte[] f45865l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};

    /* renamed from: m */
    public static final byte[] f45866m = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52684EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.f52686FS, Ascii.f52687GS, Ascii.f52691RS, Ascii.f52695US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};

    /* renamed from: e */
    public final byte[] f45867e;

    /* renamed from: f */
    public final byte[] f45868f;

    /* renamed from: g */
    public final byte[] f45869g;

    /* renamed from: h */
    public final int f45870h;

    /* renamed from: i */
    public final int f45871i;

    public zzim() {
        this(0);
    }

    public static String zzb(byte[] bArr) {
        int i;
        if (bArr != null && bArr.length != 0) {
            zzim zzimVar = new zzim(0, f45863j, true);
            long zzc = zzimVar.zzc(bArr);
            if (zzc <= 2147483647L) {
                if (bArr.length != 0) {
                    Wx2 wx2 = new Wx2();
                    zzimVar.mo47895a(bArr, 0, bArr.length, wx2);
                    zzimVar.mo47895a(bArr, 0, -1, wx2);
                    int i2 = wx2.f7345c;
                    int i3 = wx2.f7346d;
                    int i4 = i2 - i3;
                    byte[] bArr2 = new byte[i4];
                    byte[] bArr3 = wx2.f7344b;
                    if (bArr3 != null) {
                        if (bArr3 != null) {
                            i = i2 - i3;
                        } else {
                            i = 0;
                        }
                        int min = Math.min(i, i4);
                        System.arraycopy(wx2.f7344b, wx2.f7346d, bArr2, 0, min);
                        int i5 = wx2.f7346d + min;
                        wx2.f7346d = i5;
                        if (i5 >= wx2.f7345c) {
                            wx2.f7344b = null;
                        }
                    }
                    bArr = bArr2;
                }
            } else {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + zzc + ") than the specified maximum size of 2147483647");
            }
        }
        return zzir.zzd(bArr);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzip
    /* renamed from: a */
    public final void mo47895a(byte[] bArr, int i, int i2, Wx2 wx2) {
        if (wx2.f7347e) {
            return;
        }
        if (i2 < 0) {
            wx2.f7347e = true;
            if (wx2.f7349g == 0 && this.zzaha == 0) {
                return;
            }
            byte[] zza = zzip.zza(this.f45871i, wx2);
            int i3 = wx2.f7345c;
            int i4 = wx2.f7349g;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = i3 + 1;
                        wx2.f7345c = i5;
                        byte[] bArr2 = this.f45867e;
                        int i6 = wx2.f7343a;
                        zza[i3] = bArr2[(i6 >> 10) & 63];
                        int i7 = i3 + 2;
                        wx2.f7345c = i7;
                        zza[i5] = bArr2[(i6 >> 4) & 63];
                        int i8 = i3 + 3;
                        wx2.f7345c = i8;
                        zza[i7] = bArr2[(i6 << 2) & 63];
                        if (bArr2 == f45864k) {
                            wx2.f7345c = i3 + 4;
                            zza[i8] = this.zzagx;
                        }
                    } else {
                        throw new IllegalStateException("Impossible modulus " + wx2.f7349g);
                    }
                } else {
                    int i9 = i3 + 1;
                    wx2.f7345c = i9;
                    byte[] bArr3 = this.f45867e;
                    int i10 = wx2.f7343a;
                    zza[i3] = bArr3[(i10 >> 2) & 63];
                    int i11 = i3 + 2;
                    wx2.f7345c = i11;
                    zza[i9] = bArr3[(i10 << 4) & 63];
                    if (bArr3 == f45864k) {
                        int i12 = i3 + 3;
                        wx2.f7345c = i12;
                        byte b = this.zzagx;
                        zza[i11] = b;
                        wx2.f7345c = i3 + 4;
                        zza[i12] = b;
                    }
                }
            }
            int i13 = wx2.f7348f;
            int i14 = wx2.f7345c;
            int i15 = i13 + (i14 - i3);
            wx2.f7348f = i15;
            if (this.zzaha > 0 && i15 > 0) {
                byte[] bArr4 = this.f45869g;
                System.arraycopy(bArr4, 0, zza, i14, bArr4.length);
                wx2.f7345c += this.f45869g.length;
                return;
            }
            return;
        }
        int i16 = 0;
        while (i16 < i2) {
            byte[] zza2 = zzip.zza(this.f45871i, wx2);
            int i17 = (wx2.f7349g + 1) % 3;
            wx2.f7349g = i17;
            int i18 = i + 1;
            int i19 = bArr[i];
            if (i19 < 0) {
                i19 += 256;
            }
            int i20 = (wx2.f7343a << 8) + i19;
            wx2.f7343a = i20;
            if (i17 == 0) {
                int i21 = wx2.f7345c;
                int i22 = i21 + 1;
                wx2.f7345c = i22;
                byte[] bArr5 = this.f45867e;
                zza2[i21] = bArr5[(i20 >> 18) & 63];
                int i23 = i21 + 2;
                wx2.f7345c = i23;
                zza2[i22] = bArr5[(i20 >> 12) & 63];
                int i24 = i21 + 3;
                wx2.f7345c = i24;
                zza2[i23] = bArr5[(i20 >> 6) & 63];
                int i25 = i21 + 4;
                wx2.f7345c = i25;
                zza2[i24] = bArr5[i20 & 63];
                int i26 = wx2.f7348f + 4;
                wx2.f7348f = i26;
                int i27 = this.zzaha;
                if (i27 > 0 && i27 <= i26) {
                    byte[] bArr6 = this.f45869g;
                    System.arraycopy(bArr6, 0, zza2, i25, bArr6.length);
                    wx2.f7345c += this.f45869g.length;
                    wx2.f7348f = 0;
                }
            }
            i16++;
            i = i18;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzip
    public final boolean zza(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f45868f;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public zzim(int i) {
        this(0, f45863j);
    }

    public zzim(int i, byte[] bArr) {
        this(0, bArr, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(int i, byte[] bArr, boolean z) {
        super(3, 4, 0, bArr == null ? 0 : bArr.length);
        this.f45868f = f45866m;
        if (bArr != null) {
            for (byte b : bArr) {
                if (this.zzagx == b || zza(b)) {
                    throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + zzir.zzd(bArr) + "]");
                }
            }
        }
        this.f45871i = 4;
        this.f45869g = null;
        this.f45870h = 4 - 1;
        this.f45867e = z ? f45865l : f45864k;
    }
}
