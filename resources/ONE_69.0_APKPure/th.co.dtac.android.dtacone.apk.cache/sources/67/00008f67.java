package com.google.android.gms.internal.firebase_ml;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import kotlin.p023io.encoding.Base64;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class zzim extends zzip {

    /* renamed from: j */
    public static final byte[] f45875j = {13, 10};

    /* renamed from: k */
    public static final byte[] f45876k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: l */
    public static final byte[] f45877l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};

    /* renamed from: m */
    public static final byte[] f45878m = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};

    /* renamed from: e */
    public final byte[] f45879e;

    /* renamed from: f */
    public final byte[] f45880f;

    /* renamed from: g */
    public final byte[] f45881g;

    /* renamed from: h */
    public final int f45882h;

    /* renamed from: i */
    public final int f45883i;

    public zzim() {
        this(0);
    }

    public static String zzb(byte[] bArr) {
        int i;
        if (bArr != null && bArr.length != 0) {
            zzim zzimVar = new zzim(0, f45875j, true);
            long zzc = zzimVar.zzc(bArr);
            if (zzc <= 2147483647L) {
                if (bArr.length != 0) {
                    Ty2 ty2 = new Ty2();
                    zzimVar.mo47904a(bArr, 0, bArr.length, ty2);
                    zzimVar.mo47904a(bArr, 0, -1, ty2);
                    int i2 = ty2.f6471c;
                    int i3 = ty2.f6472d;
                    int i4 = i2 - i3;
                    byte[] bArr2 = new byte[i4];
                    byte[] bArr3 = ty2.f6470b;
                    if (bArr3 != null) {
                        if (bArr3 != null) {
                            i = i2 - i3;
                        } else {
                            i = 0;
                        }
                        int min = Math.min(i, i4);
                        System.arraycopy(ty2.f6470b, ty2.f6472d, bArr2, 0, min);
                        int i5 = ty2.f6472d + min;
                        ty2.f6472d = i5;
                        if (i5 >= ty2.f6471c) {
                            ty2.f6470b = null;
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
    public final void mo47904a(byte[] bArr, int i, int i2, Ty2 ty2) {
        if (ty2.f6473e) {
            return;
        }
        if (i2 < 0) {
            ty2.f6473e = true;
            if (ty2.f6475g == 0 && this.zzaha == 0) {
                return;
            }
            byte[] zza = zzip.zza(this.f45883i, ty2);
            int i3 = ty2.f6471c;
            int i4 = ty2.f6475g;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = i3 + 1;
                        ty2.f6471c = i5;
                        byte[] bArr2 = this.f45879e;
                        int i6 = ty2.f6469a;
                        zza[i3] = bArr2[(i6 >> 10) & 63];
                        int i7 = i3 + 2;
                        ty2.f6471c = i7;
                        zza[i5] = bArr2[(i6 >> 4) & 63];
                        int i8 = i3 + 3;
                        ty2.f6471c = i8;
                        zza[i7] = bArr2[(i6 << 2) & 63];
                        if (bArr2 == f45876k) {
                            ty2.f6471c = i3 + 4;
                            zza[i8] = this.zzagx;
                        }
                    } else {
                        throw new IllegalStateException("Impossible modulus " + ty2.f6475g);
                    }
                } else {
                    int i9 = i3 + 1;
                    ty2.f6471c = i9;
                    byte[] bArr3 = this.f45879e;
                    int i10 = ty2.f6469a;
                    zza[i3] = bArr3[(i10 >> 2) & 63];
                    int i11 = i3 + 2;
                    ty2.f6471c = i11;
                    zza[i9] = bArr3[(i10 << 4) & 63];
                    if (bArr3 == f45876k) {
                        int i12 = i3 + 3;
                        ty2.f6471c = i12;
                        byte b = this.zzagx;
                        zza[i11] = b;
                        ty2.f6471c = i3 + 4;
                        zza[i12] = b;
                    }
                }
            }
            int i13 = ty2.f6474f;
            int i14 = ty2.f6471c;
            int i15 = i13 + (i14 - i3);
            ty2.f6474f = i15;
            if (this.zzaha > 0 && i15 > 0) {
                byte[] bArr4 = this.f45881g;
                System.arraycopy(bArr4, 0, zza, i14, bArr4.length);
                ty2.f6471c += this.f45881g.length;
                return;
            }
            return;
        }
        int i16 = 0;
        while (i16 < i2) {
            byte[] zza2 = zzip.zza(this.f45883i, ty2);
            int i17 = (ty2.f6475g + 1) % 3;
            ty2.f6475g = i17;
            int i18 = i + 1;
            int i19 = bArr[i];
            if (i19 < 0) {
                i19 += 256;
            }
            int i20 = (ty2.f6469a << 8) + i19;
            ty2.f6469a = i20;
            if (i17 == 0) {
                int i21 = ty2.f6471c;
                int i22 = i21 + 1;
                ty2.f6471c = i22;
                byte[] bArr5 = this.f45879e;
                zza2[i21] = bArr5[(i20 >> 18) & 63];
                int i23 = i21 + 2;
                ty2.f6471c = i23;
                zza2[i22] = bArr5[(i20 >> 12) & 63];
                int i24 = i21 + 3;
                ty2.f6471c = i24;
                zza2[i23] = bArr5[(i20 >> 6) & 63];
                int i25 = i21 + 4;
                ty2.f6471c = i25;
                zza2[i24] = bArr5[i20 & 63];
                int i26 = ty2.f6474f + 4;
                ty2.f6474f = i26;
                int i27 = this.zzaha;
                if (i27 > 0 && i27 <= i26) {
                    byte[] bArr6 = this.f45881g;
                    System.arraycopy(bArr6, 0, zza2, i25, bArr6.length);
                    ty2.f6471c += this.f45881g.length;
                    ty2.f6474f = 0;
                }
            }
            i16++;
            i = i18;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzip
    public final boolean zza(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f45880f;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public zzim(int i) {
        this(0, f45875j);
    }

    public zzim(int i, byte[] bArr) {
        this(0, bArr, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(int i, byte[] bArr, boolean z) {
        super(3, 4, 0, bArr == null ? 0 : bArr.length);
        this.f45880f = f45878m;
        if (bArr != null) {
            for (byte b : bArr) {
                if (this.zzagx == b || zza(b)) {
                    throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + zzir.zzd(bArr) + "]");
                }
            }
        }
        this.f45883i = 4;
        this.f45881g = null;
        this.f45882h = 4 - 1;
        this.f45879e = z ? f45877l : f45876k;
    }
}