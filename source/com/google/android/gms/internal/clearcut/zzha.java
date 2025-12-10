package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzge;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzha extends zzfu<zzha> implements Cloneable {

    /* renamed from: g */
    public byte[] f45619g;

    /* renamed from: h */
    public zzge.zzd f45620h;

    /* renamed from: i */
    public String f45621i;

    /* renamed from: j */
    public String f45622j;

    /* renamed from: k */
    public zzgy f45623k;

    /* renamed from: l */
    public String f45624l;

    /* renamed from: m */
    public zzgz f45625m;

    /* renamed from: n */
    public String f45626n;

    /* renamed from: o */
    public int f45627o;

    /* renamed from: p */
    public int[] f45628p;

    /* renamed from: q */
    public long f45629q;

    /* renamed from: r */
    public zzge.zzs f45630r;
    public byte[] zzbjp;
    public long zzbju;
    public byte[] zzbjw;
    public boolean zzbkc;
    public long zzbjf = 0;
    public long zzbjg = 0;

    /* renamed from: a */
    public long f45613a = 0;

    /* renamed from: b */
    public String f45614b = "";
    public int zzbji = 0;

    /* renamed from: c */
    public String f45615c = "";

    /* renamed from: d */
    public int f45616d = 0;

    /* renamed from: e */
    public boolean f45617e = false;

    /* renamed from: f */
    public zzhb[] f45618f = zzhb.zzge();

    public zzha() {
        byte[] bArr = zzgb.zzse;
        this.f45619g = bArr;
        this.f45620h = null;
        this.zzbjp = bArr;
        this.f45621i = "";
        this.f45622j = "";
        this.f45623k = null;
        this.f45624l = "";
        this.zzbju = 180000L;
        this.f45625m = null;
        this.zzbjw = bArr;
        this.f45626n = "";
        this.f45627o = 0;
        this.f45628p = zzgb.zzrx;
        this.f45629q = 0L;
        this.f45630r = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: a */
    public final zzha clone() {
        try {
            zzha zzhaVar = (zzha) super.clone();
            zzhb[] zzhbVarArr = this.f45618f;
            if (zzhbVarArr != null && zzhbVarArr.length > 0) {
                zzhaVar.f45618f = new zzhb[zzhbVarArr.length];
                int i = 0;
                while (true) {
                    zzhb[] zzhbVarArr2 = this.f45618f;
                    if (i >= zzhbVarArr2.length) {
                        break;
                    }
                    zzhb zzhbVar = zzhbVarArr2[i];
                    if (zzhbVar != null) {
                        zzhaVar.f45618f[i] = (zzhb) zzhbVar.clone();
                    }
                    i++;
                }
            }
            zzge.zzd zzdVar = this.f45620h;
            if (zzdVar != null) {
                zzhaVar.f45620h = zzdVar;
            }
            zzgy zzgyVar = this.f45623k;
            if (zzgyVar != null) {
                zzhaVar.f45623k = (zzgy) zzgyVar.clone();
            }
            zzgz zzgzVar = this.f45625m;
            if (zzgzVar != null) {
                zzhaVar.f45625m = (zzgz) zzgzVar.clone();
            }
            int[] iArr = this.f45628p;
            if (iArr != null && iArr.length > 0) {
                zzhaVar.f45628p = (int[]) iArr.clone();
            }
            zzge.zzs zzsVar = this.f45630r;
            if (zzsVar != null) {
                zzhaVar.f45630r = zzsVar;
            }
            return zzhaVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzha) {
            zzha zzhaVar = (zzha) obj;
            if (this.zzbjf == zzhaVar.zzbjf && this.zzbjg == zzhaVar.zzbjg) {
                String str = this.f45614b;
                if (str == null) {
                    if (zzhaVar.f45614b != null) {
                        return false;
                    }
                } else if (!str.equals(zzhaVar.f45614b)) {
                    return false;
                }
                if (this.zzbji != zzhaVar.zzbji) {
                    return false;
                }
                String str2 = this.f45615c;
                if (str2 == null) {
                    if (zzhaVar.f45615c != null) {
                        return false;
                    }
                } else if (!str2.equals(zzhaVar.f45615c)) {
                    return false;
                }
                if (zzfy.equals(this.f45618f, zzhaVar.f45618f) && Arrays.equals(this.f45619g, zzhaVar.f45619g)) {
                    zzge.zzd zzdVar = this.f45620h;
                    if (zzdVar == null) {
                        if (zzhaVar.f45620h != null) {
                            return false;
                        }
                    } else if (!zzdVar.equals(zzhaVar.f45620h)) {
                        return false;
                    }
                    if (Arrays.equals(this.zzbjp, zzhaVar.zzbjp)) {
                        String str3 = this.f45621i;
                        if (str3 == null) {
                            if (zzhaVar.f45621i != null) {
                                return false;
                            }
                        } else if (!str3.equals(zzhaVar.f45621i)) {
                            return false;
                        }
                        String str4 = this.f45622j;
                        if (str4 == null) {
                            if (zzhaVar.f45622j != null) {
                                return false;
                            }
                        } else if (!str4.equals(zzhaVar.f45622j)) {
                            return false;
                        }
                        zzgy zzgyVar = this.f45623k;
                        if (zzgyVar == null) {
                            if (zzhaVar.f45623k != null) {
                                return false;
                            }
                        } else if (!zzgyVar.equals(zzhaVar.f45623k)) {
                            return false;
                        }
                        String str5 = this.f45624l;
                        if (str5 == null) {
                            if (zzhaVar.f45624l != null) {
                                return false;
                            }
                        } else if (!str5.equals(zzhaVar.f45624l)) {
                            return false;
                        }
                        if (this.zzbju != zzhaVar.zzbju) {
                            return false;
                        }
                        zzgz zzgzVar = this.f45625m;
                        if (zzgzVar == null) {
                            if (zzhaVar.f45625m != null) {
                                return false;
                            }
                        } else if (!zzgzVar.equals(zzhaVar.f45625m)) {
                            return false;
                        }
                        if (Arrays.equals(this.zzbjw, zzhaVar.zzbjw)) {
                            String str6 = this.f45626n;
                            if (str6 == null) {
                                if (zzhaVar.f45626n != null) {
                                    return false;
                                }
                            } else if (!str6.equals(zzhaVar.f45626n)) {
                                return false;
                            }
                            if (zzfy.equals(this.f45628p, zzhaVar.f45628p)) {
                                zzge.zzs zzsVar = this.f45630r;
                                if (zzsVar == null) {
                                    if (zzhaVar.f45630r != null) {
                                        return false;
                                    }
                                } else if (!zzsVar.equals(zzhaVar.f45630r)) {
                                    return false;
                                }
                                if (this.zzbkc != zzhaVar.zzbkc) {
                                    return false;
                                }
                                zzfw zzfwVar = this.zzrj;
                                if (zzfwVar == null || zzfwVar.isEmpty()) {
                                    zzfw zzfwVar2 = zzhaVar.zzrj;
                                    return zzfwVar2 == null || zzfwVar2.isEmpty();
                                }
                                return this.zzrj.equals(zzhaVar.zzrj);
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zzbjf;
        long j2 = this.zzbjg;
        int hashCode = (((((zzha.class.getName().hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961;
        String str = this.f45614b;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzbji) * 31;
        String str2 = this.f45615c;
        int hashCode3 = ((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961) + 1237) * 31) + zzfy.hashCode(this.f45618f)) * 31) + Arrays.hashCode(this.f45619g);
        zzge.zzd zzdVar = this.f45620h;
        int hashCode4 = ((((hashCode3 * 31) + (zzdVar == null ? 0 : zzdVar.hashCode())) * 31) + Arrays.hashCode(this.zzbjp)) * 31;
        String str3 = this.f45621i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f45622j;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        zzgy zzgyVar = this.f45623k;
        int hashCode7 = ((hashCode6 * 31) + (zzgyVar == null ? 0 : zzgyVar.hashCode())) * 31;
        String str5 = this.f45624l;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j3 = this.zzbju;
        zzgz zzgzVar = this.f45625m;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (zzgzVar == null ? 0 : zzgzVar.hashCode())) * 31) + Arrays.hashCode(this.zzbjw)) * 31;
        String str6 = this.f45626n;
        int hashCode10 = ((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 961) + zzfy.hashCode(this.f45628p);
        zzge.zzs zzsVar = this.f45630r;
        int hashCode11 = ((((hashCode10 * 961) + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31) + (this.zzbkc ? 1231 : 1237)) * 31;
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            i = this.zzrj.hashCode();
        }
        return hashCode11 + i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) throws IOException {
        long j = this.zzbjf;
        if (j != 0) {
            zzfsVar.zzi(1, j);
        }
        String str = this.f45614b;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(2, this.f45614b);
        }
        zzhb[] zzhbVarArr = this.f45618f;
        int i = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzhb[] zzhbVarArr2 = this.f45618f;
                if (i2 >= zzhbVarArr2.length) {
                    break;
                }
                zzhb zzhbVar = zzhbVarArr2[i2];
                if (zzhbVar != null) {
                    zzfsVar.zza(3, zzhbVar);
                }
                i2++;
            }
        }
        byte[] bArr = this.f45619g;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzfsVar.zza(4, this.f45619g);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzfsVar.zza(6, this.zzbjp);
        }
        zzgy zzgyVar = this.f45623k;
        if (zzgyVar != null) {
            zzfsVar.zza(7, zzgyVar);
        }
        String str2 = this.f45621i;
        if (str2 != null && !str2.equals("")) {
            zzfsVar.zza(8, this.f45621i);
        }
        zzge.zzd zzdVar = this.f45620h;
        if (zzdVar != null) {
            zzfsVar.zze(9, zzdVar);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            zzfsVar.zzc(11, i3);
        }
        String str3 = this.f45622j;
        if (str3 != null && !str3.equals("")) {
            zzfsVar.zza(13, this.f45622j);
        }
        String str4 = this.f45624l;
        if (str4 != null && !str4.equals("")) {
            zzfsVar.zza(14, this.f45624l);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzfsVar.zzb(15, 0);
            zzfsVar.zzn(zzfs.zzj(j2));
        }
        zzgz zzgzVar = this.f45625m;
        if (zzgzVar != null) {
            zzfsVar.zza(16, zzgzVar);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            zzfsVar.zzi(17, j3);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzfsVar.zza(18, this.zzbjw);
        }
        int[] iArr = this.f45628p;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f45628p;
                if (i >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(20, iArr2[i]);
                i++;
            }
        }
        zzge.zzs zzsVar = this.f45630r;
        if (zzsVar != null) {
            zzfsVar.zze(23, zzsVar);
        }
        String str5 = this.f45626n;
        if (str5 != null && !str5.equals("")) {
            zzfsVar.zza(24, this.f45626n);
        }
        boolean z = this.zzbkc;
        if (z) {
            zzfsVar.zzb(25, z);
        }
        String str6 = this.f45615c;
        if (str6 != null && !str6.equals("")) {
            zzfsVar.zza(26, this.f45615c);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        int[] iArr;
        int zzen = super.zzen();
        long j = this.zzbjf;
        if (j != 0) {
            zzen += zzfs.zzd(1, j);
        }
        String str = this.f45614b;
        if (str != null && !str.equals("")) {
            zzen += zzfs.zzb(2, this.f45614b);
        }
        zzhb[] zzhbVarArr = this.f45618f;
        int i = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzhb[] zzhbVarArr2 = this.f45618f;
                if (i2 >= zzhbVarArr2.length) {
                    break;
                }
                zzhb zzhbVar = zzhbVarArr2[i2];
                if (zzhbVar != null) {
                    zzen += zzfs.zzb(3, zzhbVar);
                }
                i2++;
            }
        }
        byte[] bArr = this.f45619g;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzen += zzfs.zzb(4, this.f45619g);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzen += zzfs.zzb(6, this.zzbjp);
        }
        zzgy zzgyVar = this.f45623k;
        if (zzgyVar != null) {
            zzen += zzfs.zzb(7, zzgyVar);
        }
        String str2 = this.f45621i;
        if (str2 != null && !str2.equals("")) {
            zzen += zzfs.zzb(8, this.f45621i);
        }
        zzge.zzd zzdVar = this.f45620h;
        if (zzdVar != null) {
            zzen += zzbn.zzc(9, zzdVar);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            zzen += zzfs.zzr(11) + zzfs.zzs(i3);
        }
        String str3 = this.f45622j;
        if (str3 != null && !str3.equals("")) {
            zzen += zzfs.zzb(13, this.f45622j);
        }
        String str4 = this.f45624l;
        if (str4 != null && !str4.equals("")) {
            zzen += zzfs.zzb(14, this.f45624l);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzen += zzfs.zzr(15) + zzfs.zzo(zzfs.zzj(j2));
        }
        zzgz zzgzVar = this.f45625m;
        if (zzgzVar != null) {
            zzen += zzfs.zzb(16, zzgzVar);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            zzen += zzfs.zzd(17, j3);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzen += zzfs.zzb(18, this.zzbjw);
        }
        int[] iArr2 = this.f45628p;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.f45628p;
                if (i >= iArr.length) {
                    break;
                }
                i4 += zzfs.zzs(iArr[i]);
                i++;
            }
            zzen = zzen + i4 + (iArr.length * 2);
        }
        zzge.zzs zzsVar = this.f45630r;
        if (zzsVar != null) {
            zzen += zzbn.zzc(23, zzsVar);
        }
        String str5 = this.f45626n;
        if (str5 != null && !str5.equals("")) {
            zzen += zzfs.zzb(24, this.f45626n);
        }
        if (this.zzbkc) {
            zzen += zzfs.zzr(25) + 1;
        }
        String str6 = this.f45615c;
        return (str6 == null || str6.equals("")) ? zzen : zzen + zzfs.zzb(26, this.f45615c);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzha zzeo() throws CloneNotSupportedException {
        return (zzha) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final /* synthetic */ zzfz zzep() throws CloneNotSupportedException {
        return (zzha) clone();
    }
}
