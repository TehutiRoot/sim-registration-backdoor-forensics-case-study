package com.google.android.gms.internal.gtm;

import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zztq {
    public static int zza(byte[] bArr, int i, zztp zztpVar) throws zzyg {
        int zzi = zzi(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzi) {
                if (i2 == 0) {
                    zztpVar.zzc = zzud.zzb;
                    return zzi;
                }
                zztpVar.zzc = zzud.zzl(bArr, zzi, i2);
                return zzi + i2;
            }
            throw zzyg.zzj();
        }
        throw zzyg.zzf();
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzzt zzztVar, byte[] bArr, int i, int i2, int i3, zztp zztpVar) throws IOException {
        Object zze = zzztVar.zze();
        int zzm = zzm(zze, zzztVar, bArr, i, i2, i3, zztpVar);
        zzztVar.zzf(zze);
        zztpVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzzt zzztVar, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        Object zze = zzztVar.zze();
        int zzn = zzn(zze, zzztVar, bArr, i, i2, zztpVar);
        zzztVar.zzf(zze);
        zztpVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzzt zzztVar, int i, byte[] bArr, int i2, int i3, zzyd zzydVar, zztp zztpVar) throws IOException {
        int zzd = zzd(zzztVar, bArr, i2, i3, zztpVar);
        zzydVar.add(zztpVar.zzc);
        while (zzd < i3) {
            int zzi = zzi(bArr, zzd, zztpVar);
            if (i != zztpVar.zza) {
                break;
            }
            zzd = zzd(zzztVar, bArr, zzi, i3, zztpVar);
            zzydVar.add(zztpVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzyd zzydVar, zztp zztpVar) throws IOException {
        zzxw zzxwVar = (zzxw) zzydVar;
        int zzi = zzi(bArr, i, zztpVar);
        int i2 = zztpVar.zza + zzi;
        while (zzi < i2) {
            zzi = zzi(bArr, zzi, zztpVar);
            zzxwVar.zzh(zztpVar.zza);
        }
        if (zzi == i2) {
            return zzi;
        }
        throw zzyg.zzj();
    }

    public static int zzg(byte[] bArr, int i, zztp zztpVar) throws zzyg {
        int zzi = zzi(bArr, i, zztpVar);
        int i2 = zztpVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zztpVar.zzc = "";
                return zzi;
            }
            zztpVar.zzc = new String(bArr, zzi, i2, zzye.zzb);
            return zzi + i2;
        }
        throw zzyg.zzf();
    }

    public static int zzh(int i, byte[] bArr, int i2, int i3, zzaal zzaalVar, zztp zztpVar) throws zzyg {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzaalVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzyg.zzc();
                        }
                        int i5 = (i & (-8)) | 4;
                        zzaal zzf = zzaal.zzf();
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int zzi = zzi(bArr, i2, zztpVar);
                            int i7 = zztpVar.zza;
                            i6 = i7;
                            if (i7 != i5) {
                                int zzh = zzh(i6, bArr, zzi, i3, zzf, zztpVar);
                                i6 = i7;
                                i2 = zzh;
                            } else {
                                i2 = zzi;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzaalVar.zzj(i, zzf);
                            return i2;
                        }
                        throw zzyg.zzg();
                    }
                    int zzi2 = zzi(bArr, i2, zztpVar);
                    int i8 = zztpVar.zza;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - zzi2) {
                            if (i8 == 0) {
                                zzaalVar.zzj(i, zzud.zzb);
                            } else {
                                zzaalVar.zzj(i, zzud.zzl(bArr, zzi2, i8));
                            }
                            return zzi2 + i8;
                        }
                        throw zzyg.zzj();
                    }
                    throw zzyg.zzf();
                }
                zzaalVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
                return i2 + 8;
            }
            int zzl = zzl(bArr, i2, zztpVar);
            zzaalVar.zzj(i, Long.valueOf(zztpVar.zzb));
            return zzl;
        }
        throw zzyg.zzc();
    }

    public static int zzi(byte[] bArr, int i, zztp zztpVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zztpVar.zza = b;
            return i2;
        }
        return zzj(b, bArr, i2, zztpVar);
    }

    public static int zzj(int i, byte[] bArr, int i2, zztp zztpVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zztpVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zztpVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zztpVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zztpVar.zza = i9 | (b4 << Ascii.f52698FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zztpVar.zza = i11;
                return i12;
            }
        }
    }

    public static int zzk(int i, byte[] bArr, int i2, int i3, zzyd zzydVar, zztp zztpVar) {
        zzxw zzxwVar = (zzxw) zzydVar;
        int zzi = zzi(bArr, i2, zztpVar);
        zzxwVar.zzh(zztpVar.zza);
        while (zzi < i3) {
            int zzi2 = zzi(bArr, zzi, zztpVar);
            if (i != zztpVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zztpVar);
            zzxwVar.zzh(zztpVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i, zztp zztpVar) {
        byte b;
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zztpVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zztpVar.zzb = j2;
        return i3;
    }

    public static int zzm(Object obj, zzzt zzztVar, byte[] bArr, int i, int i2, int i3, zztp zztpVar) throws IOException {
        int zzc = ((zzzj) zzztVar).zzc(obj, bArr, i, i2, i3, zztpVar);
        zztpVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzzt zzztVar, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzj(i4, bArr, i3, zztpVar);
            i4 = zztpVar.zza;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i4 + i5;
            zzztVar.zzi(obj, bArr, i5, i6, zztpVar);
            zztpVar.zzc = obj;
            return i6;
        }
        throw zzyg.zzj();
    }

    public static int zzo(int i, byte[] bArr, int i2, int i3, zztp zztpVar) throws zzyg {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzyg.zzc();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zzi(bArr, i2, zztpVar);
                            i6 = zztpVar.zza;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zzo(i6, bArr, i2, i3, zztpVar);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzyg.zzg();
                    }
                    return zzi(bArr, i2, zztpVar) + zztpVar.zza;
                }
                return i2 + 8;
            }
            return zzl(bArr, i2, zztpVar);
        }
        throw zzyg.zzc();
    }

    public static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}