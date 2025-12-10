package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaal {
    private static final zzaal zza = new zzaal(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze = -1;
    private boolean zzf;

    private zzaal(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzaal zzc() {
        return zza;
    }

    public static zzaal zze(zzaal zzaalVar, zzaal zzaalVar2) {
        int i = zzaalVar.zzb + zzaalVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzaalVar.zzc, i);
        System.arraycopy(zzaalVar2.zzc, 0, copyOf, zzaalVar.zzb, zzaalVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzaalVar.zzd, i);
        System.arraycopy(zzaalVar2.zzd, 0, copyOf2, zzaalVar.zzb, zzaalVar2.zzb);
        return new zzaal(i, copyOf, copyOf2, true);
    }

    public static zzaal zzf() {
        return new zzaal(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaal)) {
            return false;
        }
        zzaal zzaalVar = (zzaal) obj;
        int i = this.zzb;
        if (i == zzaalVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzaalVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzaalVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzE;
        int zzD;
        int i;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.zzd[i4]).intValue();
                                    i = zzuq.zzD(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzyg.zza());
                                }
                            } else {
                                int i8 = i6 << 3;
                                int i9 = zzuq.zzf;
                                zzE = ((zzaal) this.zzd[i4]).zza();
                                int zzD2 = zzuq.zzD(i8);
                                zzD = zzD2 + zzD2;
                            }
                        } else {
                            int i10 = i6 << 3;
                            int i11 = zzuq.zzf;
                            int zzd = ((zzud) this.zzd[i4]).zzd();
                            i = zzuq.zzD(i10) + zzuq.zzD(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzuq.zzD(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i12 = i6 << 3;
                    zzE = zzuq.zzE(((Long) this.zzd[i4]).longValue());
                    zzD = zzuq.zzD(i12);
                }
                i = zzD + zzE;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = zzuq.zzf;
                int zzd = ((zzud) this.zzd[i3]).zzd();
                int zzD = zzuq.zzD(zzd) + zzd;
                int zzD2 = zzuq.zzD(16);
                int zzD3 = zzuq.zzD(this.zzc[i3] >>> 3);
                int zzD4 = zzuq.zzD(8);
                i2 += zzD4 + zzD4 + zzD2 + zzD3 + zzuq.zzD(24) + zzD;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final zzaal zzd(zzaal zzaalVar) {
        if (zzaalVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzaalVar.zzb;
        zzm(i);
        System.arraycopy(zzaalVar.zzc, 0, this.zzc, this.zzb, zzaalVar.zzb);
        System.arraycopy(zzaalVar.zzd, 0, this.zzd, this.zzb, zzaalVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzzi.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzur zzurVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzurVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzur zzurVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    zzurVar.zzk(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzyg.zza());
                                }
                            } else {
                                zzurVar.zzF(i4);
                                ((zzaal) obj).zzl(zzurVar);
                                zzurVar.zzh(i4);
                            }
                        } else {
                            zzurVar.zzd(i4, (zzud) obj);
                        }
                    } else {
                        zzurVar.zzm(i4, ((Long) obj).longValue());
                    }
                } else {
                    zzurVar.zzt(i4, ((Long) obj).longValue());
                }
            }
        }
    }
}