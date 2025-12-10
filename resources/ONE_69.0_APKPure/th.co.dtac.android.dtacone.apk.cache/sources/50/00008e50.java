package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzgz extends zzfu<zzgz> implements Cloneable {

    /* renamed from: a */
    public byte[] f45621a = zzgb.zzse;

    /* renamed from: b */
    public String f45622b = "";

    /* renamed from: c */
    public byte[][] f45623c = zzgb.zzsd;

    /* renamed from: d */
    public boolean f45624d = false;

    public zzgz() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: a */
    public final zzgz clone() {
        try {
            zzgz zzgzVar = (zzgz) super.clone();
            byte[][] bArr = this.f45623c;
            if (bArr != null && bArr.length > 0) {
                zzgzVar.f45623c = (byte[][]) bArr.clone();
            }
            return zzgzVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgz) {
            zzgz zzgzVar = (zzgz) obj;
            if (Arrays.equals(this.f45621a, zzgzVar.f45621a)) {
                String str = this.f45622b;
                if (str == null) {
                    if (zzgzVar.f45622b != null) {
                        return false;
                    }
                } else if (!str.equals(zzgzVar.f45622b)) {
                    return false;
                }
                if (zzfy.zza(this.f45623c, zzgzVar.f45623c)) {
                    zzfw zzfwVar = this.zzrj;
                    if (zzfwVar == null || zzfwVar.isEmpty()) {
                        zzfw zzfwVar2 = zzgzVar.zzrj;
                        return zzfwVar2 == null || zzfwVar2.isEmpty();
                    }
                    return this.zzrj.equals(zzgzVar.zzrj);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((zzgz.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f45621a)) * 31;
        String str = this.f45622b;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + zzfy.zza(this.f45623c)) * 31) + 1237) * 31;
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            i = this.zzrj.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) throws IOException {
        if (!Arrays.equals(this.f45621a, zzgb.zzse)) {
            zzfsVar.zza(1, this.f45621a);
        }
        byte[][] bArr = this.f45623c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f45623c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzfsVar.zza(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f45622b;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(4, this.f45622b);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        int zzen = super.zzen();
        if (!Arrays.equals(this.f45621a, zzgb.zzse)) {
            zzen += zzfs.zzb(1, this.f45621a);
        }
        byte[][] bArr = this.f45623c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f45623c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += zzfs.zzh(bArr3);
                }
                i++;
            }
            zzen = zzen + i2 + i3;
        }
        String str = this.f45622b;
        return (str == null || str.equals("")) ? zzen : zzen + zzfs.zzb(4, this.f45622b);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzgz zzeo() throws CloneNotSupportedException {
        return (zzgz) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final /* synthetic */ zzfz zzep() throws CloneNotSupportedException {
        return (zzgz) clone();
    }
}