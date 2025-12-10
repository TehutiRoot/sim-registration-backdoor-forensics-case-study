package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes3.dex */
public final class C6517b extends zzjl {

    /* renamed from: d */
    public final byte[] f46212d;

    /* renamed from: e */
    public final int f46213e;

    /* renamed from: f */
    public int f46214f;

    public C6517b(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f46212d = bArr;
                this.f46214f = 0;
                this.f46213e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: e */
    public final void m47415e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f46212d, this.f46214f, i2);
            this.f46214f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46214f), Integer.valueOf(this.f46213e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: f */
    public final void m47414f(String str) {
        int i = this.f46214f;
        try {
            int zzA = zzjl.zzA(str.length() * 3);
            int zzA2 = zzjl.zzA(str.length());
            if (zzA2 == zzA) {
                int i2 = i + zzA2;
                this.f46214f = i2;
                int m47356b = AbstractC6523h.m47356b(str, this.f46212d, i2, this.f46213e - i2);
                this.f46214f = i;
                zzq((m47356b - i) - zzA2);
                this.f46214f = m47356b;
                return;
            }
            zzq(AbstractC6523h.m47355c(str));
            byte[] bArr = this.f46212d;
            int i3 = this.f46214f;
            this.f46214f = AbstractC6523h.m47356b(str, bArr, i3, this.f46213e - i3);
        } catch (zznb e) {
            this.f46214f = i;
            m47171a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjj(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final int zza() {
        return this.f46213e - this.f46214f;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzb(byte b) {
        try {
            byte[] bArr = this.f46212d;
            int i = this.f46214f;
            this.f46214f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46214f), Integer.valueOf(this.f46213e), 1), e);
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
            byte[] bArr = this.f46212d;
            int i2 = this.f46214f;
            int i3 = i2 + 1;
            this.f46214f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f46214f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f46214f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f46214f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46214f), Integer.valueOf(this.f46213e), 1), e);
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
            byte[] bArr = this.f46212d;
            int i = this.f46214f;
            int i2 = i + 1;
            this.f46214f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f46214f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f46214f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f46214f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f46214f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f46214f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f46214f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f46214f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46214f), Integer.valueOf(this.f46213e), 1), e);
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
        m47415e(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        m47414f(str);
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
                byte[] bArr = this.f46212d;
                int i2 = this.f46214f;
                this.f46214f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46214f), Integer.valueOf(this.f46213e), 1), e);
            }
        }
        byte[] bArr2 = this.f46212d;
        int i3 = this.f46214f;
        this.f46214f = i3 + 1;
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
        z = zzjl.f46335c;
        if (z && this.f46213e - this.f46214f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f46212d;
                int i = this.f46214f;
                this.f46214f = i + 1;
                AbstractC23185yI2.m351s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f46212d;
            int i2 = this.f46214f;
            this.f46214f = 1 + i2;
            AbstractC23185yI2.m351s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f46212d;
                int i3 = this.f46214f;
                this.f46214f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46214f), Integer.valueOf(this.f46213e), 1), e);
            }
        }
        byte[] bArr4 = this.f46212d;
        int i4 = this.f46214f;
        this.f46214f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}