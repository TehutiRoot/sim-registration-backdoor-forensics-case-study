package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzii extends zzhq {

    /* renamed from: b */
    public static final Logger f47619b = Logger.getLogger(zzii.class.getName());

    /* renamed from: c */
    public static final boolean f47620c = AbstractC20013gG2.m31184m();

    /* renamed from: a */
    public Cx2 f47621a;

    /* renamed from: com.google.android.gms.internal.vision.zzii$a */
    /* loaded from: classes3.dex */
    public static class C6651a extends zzii {

        /* renamed from: d */
        public final byte[] f47622d;

        /* renamed from: e */
        public final int f47623e;

        /* renamed from: f */
        public final int f47624f;

        /* renamed from: g */
        public int f47625g;

        public C6651a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if (((bArr.length - i2) | i2) >= 0) {
                    this.f47622d = bArr;
                    this.f47623e = 0;
                    this.f47625g = 0;
                    this.f47624f = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.vision.zzii
        /* renamed from: b */
        public final void mo46437b(int i, zzkk zzkkVar, InterfaceC19835fE2 interfaceC19835fE2) {
            zza(i, 2);
            zzhf zzhfVar = (zzhf) zzkkVar;
            int mo46434b = zzhfVar.mo46434b();
            if (mo46434b == -1) {
                mo46434b = interfaceC19835fE2.zzb(zzhfVar);
                zzhfVar.mo46435a(mo46434b);
            }
            zzb(mo46434b);
            interfaceC19835fE2.mo31333c(zzkkVar, this.f47621a);
        }

        /* renamed from: i */
        public final void m46436i(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f47622d, this.f47625g, i2);
                this.f47625g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f47625g), Integer.valueOf(this.f47624f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, int i2) {
            zzb((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i, int i2) {
            zza(i, 0);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(int i, int i2) {
            zza(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzd(int i) {
            try {
                byte[] bArr = this.f47622d;
                int i2 = this.f47625g;
                int i3 = i2 + 1;
                this.f47625g = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.f47625g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.f47625g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f47625g = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f47625g), Integer.valueOf(this.f47624f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zze(int i, int i2) {
            zza(i, 5);
            zzd(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, long j) {
            zza(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i, zzht zzhtVar) {
            zza(1, 3);
            zzc(2, i);
            zza(3, zzhtVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(int i, long j) {
            zza(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, boolean z) {
            zza(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(long j) {
            try {
                byte[] bArr = this.f47622d;
                int i = this.f47625g;
                int i2 = i + 1;
                this.f47625g = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.f47625g = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.f47625g = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.f47625g = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.f47625g = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.f47625g = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.f47625g = i8;
                bArr[i7] = (byte) (j >> 48);
                this.f47625g = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f47625g), Integer.valueOf(this.f47624f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, String str) {
            zza(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i) {
            if (!zzii.f47620c || AbstractC20291hu2.m30708b() || zza() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f47622d;
                        int i2 = this.f47625g;
                        this.f47625g = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f47625g), Integer.valueOf(this.f47624f), 1), e);
                    }
                }
                byte[] bArr2 = this.f47622d;
                int i3 = this.f47625g;
                this.f47625g = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f47622d;
                int i4 = this.f47625g;
                this.f47625g = 1 + i4;
                AbstractC20013gG2.m31185l(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.f47622d;
                int i5 = this.f47625g;
                this.f47625g = i5 + 1;
                AbstractC20013gG2.m31185l(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.f47622d;
                    int i7 = this.f47625g;
                    this.f47625g = 1 + i7;
                    AbstractC20013gG2.m31185l(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f47622d;
                int i8 = this.f47625g;
                this.f47625g = i8 + 1;
                AbstractC20013gG2.m31185l(bArr6, i8, (byte) (i6 | 128));
                int i9 = i >>> 14;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.f47622d;
                    int i10 = this.f47625g;
                    this.f47625g = 1 + i10;
                    AbstractC20013gG2.m31185l(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f47622d;
                int i11 = this.f47625g;
                this.f47625g = i11 + 1;
                AbstractC20013gG2.m31185l(bArr8, i11, (byte) (i9 | 128));
                int i12 = i >>> 21;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.f47622d;
                    int i13 = this.f47625g;
                    this.f47625g = 1 + i13;
                    AbstractC20013gG2.m31185l(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f47622d;
                int i14 = this.f47625g;
                this.f47625g = i14 + 1;
                AbstractC20013gG2.m31185l(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f47622d;
                int i15 = this.f47625g;
                this.f47625g = 1 + i15;
                AbstractC20013gG2.m31185l(bArr11, i15, (byte) (i >>> 28));
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, zzht zzhtVar) {
            zza(i, 2);
            zza(zzhtVar);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(zzht zzhtVar) {
            zzb(zzhtVar.zza());
            zzhtVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, zzkk zzkkVar) {
            zza(1, 3);
            zzc(2, i);
            zza(3, 2);
            zza(zzkkVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(zzkk zzkkVar) {
            zzb(zzkkVar.zzm());
            zzkkVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(byte b) {
            try {
                byte[] bArr = this.f47622d;
                int i = this.f47625g;
                this.f47625g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f47625g), Integer.valueOf(this.f47624f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i) {
            if (i >= 0) {
                zzb(i);
            } else {
                zza(i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(long j) {
            if (zzii.f47620c && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f47622d;
                    int i = this.f47625g;
                    this.f47625g = i + 1;
                    AbstractC20013gG2.m31185l(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f47622d;
                int i2 = this.f47625g;
                this.f47625g = 1 + i2;
                AbstractC20013gG2.m31185l(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f47622d;
                    int i3 = this.f47625g;
                    this.f47625g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f47625g), Integer.valueOf(this.f47624f), 1), e);
                }
            }
            byte[] bArr4 = this.f47622d;
            int i4 = this.f47625g;
            this.f47625g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.vision.zzhq
        public final void zza(byte[] bArr, int i, int i2) {
            m46436i(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(String str) {
            int i = this.f47625g;
            try {
                int zzg = zzii.zzg(str.length() * 3);
                int zzg2 = zzii.zzg(str.length());
                if (zzg2 == zzg) {
                    int i2 = i + zzg2;
                    this.f47625g = i2;
                    int m46603e = AbstractC6621F.m46603e(str, this.f47622d, i2, zza());
                    this.f47625g = i;
                    zzb((m46603e - i) - zzg2);
                    this.f47625g = m46603e;
                    return;
                }
                zzb(AbstractC6621F.m46604d(str));
                this.f47625g = AbstractC6621F.m46603e(str, this.f47622d, this.f47625g, zza());
            } catch (zzmg e) {
                this.f47625g = i;
                m46443c(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final int zza() {
            return this.f47624f - this.f47625g;
        }
    }

    /* loaded from: classes3.dex */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzii.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public zzii() {
    }

    /* renamed from: a */
    public static int m46444a(zzkk zzkkVar, InterfaceC19835fE2 interfaceC19835fE2) {
        zzhf zzhfVar = (zzhf) zzkkVar;
        int mo46434b = zzhfVar.mo46434b();
        if (mo46434b == -1) {
            mo46434b = interfaceC19835fE2.zzb(zzhfVar);
            zzhfVar.mo46435a(mo46434b);
        }
        return zzg(mo46434b) + mo46434b;
    }

    /* renamed from: d */
    public static int m46442d(int i, zzkk zzkkVar, InterfaceC19835fE2 interfaceC19835fE2) {
        return zzg(i << 3) + m46444a(zzkkVar, interfaceC19835fE2);
    }

    /* renamed from: e */
    public static int m46441e(int i, zzkk zzkkVar, InterfaceC19835fE2 interfaceC19835fE2) {
        int zzg = zzg(i << 3) << 1;
        zzhf zzhfVar = (zzhf) zzkkVar;
        int mo46434b = zzhfVar.mo46434b();
        if (mo46434b == -1) {
            mo46434b = interfaceC19835fE2.zzb(zzhfVar);
            zzhfVar.mo46435a(mo46434b);
        }
        return zzg + mo46434b;
    }

    /* renamed from: g */
    public static long m46439g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: h */
    public static int m46438h(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static zzii zza(byte[] bArr) {
        return new C6651a(bArr, 0, bArr.length);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zze(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzf(int i, int i2) {
        return zzg(i << 3) + zzf(i2);
    }

    public static int zzg(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i) {
        return 4;
    }

    public static int zzj(int i) {
        return 4;
    }

    public static int zzk(int i, int i2) {
        return zzg(i << 3) + zzf(i2);
    }

    @Deprecated
    public static int zzl(int i) {
        return zzg(i);
    }

    /* renamed from: b */
    public abstract void mo46437b(int i, zzkk zzkkVar, InterfaceC19835fE2 interfaceC19835fE2);

    /* renamed from: c */
    public final void m46443c(String str, zzmg zzmgVar) {
        f47619b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmgVar);
        byte[] bytes = str.getBytes(zzjf.f47644a);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zza(int i) throws IOException;

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzht zzhtVar) throws IOException;

    public abstract void zza(int i, zzkk zzkkVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzht zzhtVar) throws IOException;

    public abstract void zza(zzkk zzkkVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzb(int i, zzht zzhtVar) throws IOException;

    public final void zzc(int i) throws IOException {
        zzb(m46438h(i));
    }

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(long j) throws IOException;

    public abstract void zzd(int i) throws IOException;

    public final void zzd(int i, int i2) throws IOException {
        zzc(i, m46438h(i2));
    }

    public abstract void zze(int i, int i2) throws IOException;

    public static int zzb(float f) {
        return 4;
    }

    public static int zzc(int i, zzht zzhtVar) {
        int zzg = zzg(i << 3);
        int zza = zzhtVar.zza();
        return zzg + zzg(zza) + zza;
    }

    public static int zzd(int i, long j) {
        return zzg(i << 3) + zze(j);
    }

    public static int zze(int i, long j) {
        return zzg(i << 3) + zze(j);
    }

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(int i, int i2) {
        return zzg(i << 3) + zzg(m46438h(i2));
    }

    public static int zzi(int i, int i2) {
        return zzg(i << 3) + 4;
    }

    public static int zzj(int i, int i2) {
        return zzg(i << 3) + 4;
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zzf(int i, long j) {
        return zzg(i << 3) + zze(m46439g(j));
    }

    public static int zzg(int i, int i2) {
        return zzg(i << 3) + zzg(i2);
    }

    public static int zzk(int i) {
        return zzf(i);
    }

    public final void zza(int i, float f) throws IOException {
        zze(i, Float.floatToRawIntBits(f));
    }

    public static int zzd(int i, zzht zzhtVar) {
        return (zzg(8) << 1) + zzg(2, i) + zzc(3, zzhtVar);
    }

    public static int zze(int i) {
        return zzg(i << 3);
    }

    public static int zzh(int i, long j) {
        return zzg(i << 3) + 8;
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, m46439g(j));
    }

    @Deprecated
    public static int zzc(zzkk zzkkVar) {
        return zzkkVar.zzm();
    }

    public static int zzf(int i) {
        if (i >= 0) {
            return zzg(i);
        }
        return 10;
    }

    public static int zzg(int i, long j) {
        return zzg(i << 3) + 8;
    }

    public static int zzh(int i) {
        return zzg(m46438h(i));
    }

    public final void zza(float f) throws IOException {
        zzd(Float.floatToRawIntBits(f));
    }

    public final void zzb(long j) throws IOException {
        zza(m46439g(j));
    }

    public static int zzb(int i, float f) {
        return zzg(i << 3) + 4;
    }

    public static int zzf(long j) {
        return zze(m46439g(j));
    }

    public final void zza(double d) throws IOException {
        zzc(Double.doubleToRawLongBits(d));
    }

    public static int zzb(int i, double d) {
        return zzg(i << 3) + 8;
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public final void zza(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i, zzjt zzjtVar) {
        int zzg = zzg(i << 3);
        int zzb2 = zzjtVar.zzb();
        return zzg + zzg(zzb2) + zzb2;
    }

    public static int zzb(int i, boolean z) {
        return zzg(i << 3) + 1;
    }

    public static int zzb(int i, String str) {
        return zzg(i << 3) + zzb(str);
    }

    public static int zza(zzjt zzjtVar) {
        int zzb2 = zzjtVar.zzb();
        return zzg(zzb2) + zzb2;
    }

    public static int zzb(int i, zzkk zzkkVar) {
        return (zzg(8) << 1) + zzg(2, i) + zzg(24) + zzb(zzkkVar);
    }

    public static int zzb(int i, zzjt zzjtVar) {
        return (zzg(8) << 1) + zzg(2, i) + zza(3, zzjtVar);
    }

    public static int zzb(String str) {
        int length;
        try {
            length = AbstractC6621F.m46604d(str);
        } catch (zzmg unused) {
            length = str.getBytes(zzjf.f47644a).length;
        }
        return zzg(length) + length;
    }

    public static int zzb(zzht zzhtVar) {
        int zza = zzhtVar.zza();
        return zzg(zza) + zza;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(zzkk zzkkVar) {
        int zzm = zzkkVar.zzm();
        return zzg(zzm) + zzm;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
