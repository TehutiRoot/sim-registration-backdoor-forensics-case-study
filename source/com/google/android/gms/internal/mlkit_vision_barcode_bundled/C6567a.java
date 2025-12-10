package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a */
/* loaded from: classes3.dex */
public final class C6567a extends zzdj {

    /* renamed from: d */
    public final byte[] f46841d;

    /* renamed from: e */
    public final int f46842e;

    /* renamed from: f */
    public int f46843f;

    public C6567a(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f46841d = bArr;
                this.f46843f = 0;
                this.f46842e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: e */
    public final void m46967e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f46841d, this.f46843f, i2);
            this.f46843f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46843f), Integer.valueOf(this.f46842e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: f */
    public final void m46966f(String str) {
        int i = this.f46843f;
        try {
            int zzy = zzdj.zzy(str.length() * 3);
            int zzy2 = zzdj.zzy(str.length());
            if (zzy2 == zzy) {
                int i2 = i + zzy2;
                this.f46843f = i2;
                int m46900d = AbstractC6576j.m46900d(str, this.f46841d, i2, this.f46842e - i2);
                this.f46843f = i;
                zzq((m46900d - i) - zzy2);
                this.f46843f = m46900d;
                return;
            }
            zzq(AbstractC6576j.m46899e(str));
            byte[] bArr = this.f46841d;
            int i3 = this.f46843f;
            this.f46843f = AbstractC6576j.m46900d(str, bArr, i3, this.f46842e - i3);
        } catch (zzhm e) {
            this.f46843f = i;
            m46887a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzdh(e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final int zza() {
        return this.f46842e - this.f46843f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzb(byte b) {
        try {
            byte[] bArr = this.f46841d;
            int i = this.f46843f;
            this.f46843f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46843f), Integer.valueOf(this.f46842e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzd(int i, boolean z) {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zze(int i, zzdb zzdbVar) {
        zzq((i << 3) | 2);
        zzq(zzdbVar.zzd());
        zzdbVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzf(int i, int i2) {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzg(int i) {
        try {
            byte[] bArr = this.f46841d;
            int i2 = this.f46843f;
            int i3 = i2 + 1;
            this.f46843f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f46843f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f46843f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f46843f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46843f), Integer.valueOf(this.f46842e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzh(int i, long j) {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzi(long j) {
        try {
            byte[] bArr = this.f46841d;
            int i = this.f46843f;
            int i2 = i + 1;
            this.f46843f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f46843f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f46843f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f46843f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f46843f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f46843f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f46843f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f46843f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46843f), Integer.valueOf(this.f46842e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzj(int i, int i2) {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzl(byte[] bArr, int i, int i2) {
        m46967e(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        m46966f(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzo(int i, int i2) {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzp(int i, int i2) {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzq(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f46841d;
                int i2 = this.f46843f;
                this.f46843f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46843f), Integer.valueOf(this.f46842e), 1), e);
            }
        }
        byte[] bArr2 = this.f46841d;
        int i3 = this.f46843f;
        this.f46843f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzr(int i, long j) {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj
    public final void zzs(long j) {
        boolean z;
        z = zzdj.f46960c;
        if (z && this.f46842e - this.f46843f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f46841d;
                int i = this.f46843f;
                this.f46843f = i + 1;
                AbstractC19775eu2.m31393s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f46841d;
            int i2 = this.f46843f;
            this.f46843f = 1 + i2;
            AbstractC19775eu2.m31393s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f46841d;
                int i3 = this.f46843f;
                this.f46843f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46843f), Integer.valueOf(this.f46842e), 1), e);
            }
        }
        byte[] bArr4 = this.f46841d;
        int i4 = this.f46843f;
        this.f46843f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
