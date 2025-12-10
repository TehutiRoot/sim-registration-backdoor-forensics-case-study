package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes3.dex */
public final class C6528b extends zzjl {

    /* renamed from: d */
    public final byte[] f46200d;

    /* renamed from: e */
    public final int f46201e;

    /* renamed from: f */
    public int f46202f;

    public C6528b(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f46200d = bArr;
                this.f46202f = 0;
                this.f46201e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: e */
    public final void m47406e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f46200d, this.f46202f, i2);
            this.f46202f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46202f), Integer.valueOf(this.f46201e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: f */
    public final void m47405f(String str) {
        int i = this.f46202f;
        try {
            int zzA = zzjl.zzA(str.length() * 3);
            int zzA2 = zzjl.zzA(str.length());
            if (zzA2 == zzA) {
                int i2 = i + zzA2;
                this.f46202f = i2;
                int m47347b = AbstractC6534h.m47347b(str, this.f46200d, i2, this.f46201e - i2);
                this.f46202f = i;
                zzq((m47347b - i) - zzA2);
                this.f46202f = m47347b;
                return;
            }
            zzq(AbstractC6534h.m47346c(str));
            byte[] bArr = this.f46200d;
            int i3 = this.f46202f;
            this.f46202f = AbstractC6534h.m47347b(str, bArr, i3, this.f46201e - i3);
        } catch (zznb e) {
            this.f46202f = i;
            m47162a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjj(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final int zza() {
        return this.f46201e - this.f46202f;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzb(byte b) {
        try {
            byte[] bArr = this.f46200d;
            int i = this.f46202f;
            this.f46202f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46202f), Integer.valueOf(this.f46201e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzd(int i, boolean z) {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zze(int i, zzjd zzjdVar) {
        zzq((i << 3) | 2);
        zzq(zzjdVar.zzd());
        zzjdVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzf(int i, int i2) {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzg(int i) {
        try {
            byte[] bArr = this.f46200d;
            int i2 = this.f46202f;
            int i3 = i2 + 1;
            this.f46202f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f46202f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f46202f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f46202f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46202f), Integer.valueOf(this.f46201e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzh(int i, long j) {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzi(long j) {
        try {
            byte[] bArr = this.f46200d;
            int i = this.f46202f;
            int i2 = i + 1;
            this.f46202f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f46202f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f46202f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f46202f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f46202f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f46202f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f46202f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f46202f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46202f), Integer.valueOf(this.f46201e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzj(int i, int i2) {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzl(byte[] bArr, int i, int i2) {
        m47406e(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        m47405f(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzo(int i, int i2) {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzp(int i, int i2) {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzq(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f46200d;
                int i2 = this.f46202f;
                this.f46202f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46202f), Integer.valueOf(this.f46201e), 1), e);
            }
        }
        byte[] bArr2 = this.f46200d;
        int i3 = this.f46202f;
        this.f46202f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzr(int i, long j) {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzs(long j) {
        boolean z;
        z = zzjl.f46323c;
        if (z && this.f46201e - this.f46202f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f46200d;
                int i = this.f46202f;
                this.f46202f = i + 1;
                BH2.m68931s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f46200d;
            int i2 = this.f46202f;
            this.f46202f = 1 + i2;
            BH2.m68931s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f46200d;
                int i3 = this.f46202f;
                this.f46202f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46202f), Integer.valueOf(this.f46201e), 1), e);
            }
        }
        byte[] bArr4 = this.f46200d;
        int i4 = this.f46202f;
        this.f46202f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
