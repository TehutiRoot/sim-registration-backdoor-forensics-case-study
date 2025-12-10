package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzuo extends zzul {
    private final OutputStream zzg;

    public zzuo(OutputStream outputStream, int i) {
        super(i);
        this.zzg = outputStream;
    }

    private final void zzH() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzI(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzH();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzJ() throws IOException {
        if (this.zzc > 0) {
            zzH();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzK(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzH();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzL(int i, boolean z) throws IOException {
        zzI(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzM(int i, zzud zzudVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzudVar.zzd());
        zzudVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq, com.google.android.gms.internal.gtm.zztt
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzr(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzh(int i, int i2) throws IOException {
        zzI(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzi(int i) throws IOException {
        zzI(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzj(int i, long j) throws IOException {
        zzI(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzk(long j) throws IOException {
        zzI(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzl(int i, int i2) throws IOException {
        zzI(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzn(int i, zzzg zzzgVar, zzzt zzztVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zztl) zzzgVar).zzQ(zzztVar));
        zzztVar.zzm(zzzgVar, this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzo(int i, zzzg zzzgVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzzgVar.zzX());
        zzzgVar.zzaw(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzp(int i, zzud zzudVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzM(3, zzudVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, 0, this.zza, i4, i5);
        this.zzc = this.zzb;
        this.zzd += i5;
        zzH();
        int i6 = i2 - i5;
        if (i6 <= this.zzb) {
            System.arraycopy(bArr, i5, this.zza, 0, i6);
            this.zzc = i6;
        } else {
            this.zzg.write(bArr, i5, i6);
        }
        this.zzd += i6;
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzt(int i, int i2) throws IOException {
        zzI(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzu(int i) throws IOException {
        zzI(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzv(int i, long j) throws IOException {
        zzI(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.gtm.zzuq
    public final void zzw(long j) throws IOException {
        zzI(10);
        zzg(j);
    }

    public final void zzx(String str) throws IOException {
        int zzc;
        try {
            int length = str.length() * 3;
            int zzD = zzuq.zzD(length);
            int i = zzD + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zzb = zzaaz.zzb(str, bArr, 0, length);
                zzu(zzb);
                zzr(bArr, 0, zzb);
                return;
            }
            if (i > i2 - this.zzc) {
                zzH();
            }
            int zzD2 = zzuq.zzD(str.length());
            int i3 = this.zzc;
            try {
                if (zzD2 == zzD) {
                    int i4 = i3 + zzD2;
                    this.zzc = i4;
                    int zzb2 = zzaaz.zzb(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    zzc = (zzb2 - i3) - zzD2;
                    zzf(zzc);
                    this.zzc = zzb2;
                } else {
                    zzc = zzaaz.zzc(str);
                    zzf(zzc);
                    this.zzc = zzaaz.zzb(str, this.zza, this.zzc, zzc);
                }
                this.zzd += zzc;
            } catch (zzaay e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzun(e2);
            }
        } catch (zzaay e3) {
            zzF(str, e3);
        }
    }
}