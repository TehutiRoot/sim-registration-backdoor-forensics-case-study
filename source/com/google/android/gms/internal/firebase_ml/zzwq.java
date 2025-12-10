package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzwq extends zzwa {

    /* renamed from: b */
    public static final Logger f46094b = Logger.getLogger(zzwq.class.getName());

    /* renamed from: c */
    public static final boolean f46095c = AbstractC17455Da2.m68642J();

    /* renamed from: a */
    public LK2 f46096a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzwq.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public zzwq() {
    }

    /* renamed from: a */
    public static int m47442a(zzys zzysVar, OL2 ol2) {
        zzvt zzvtVar = (zzvt) zzysVar;
        int mo47429b = zzvtVar.mo47429b();
        if (mo47429b == -1) {
            mo47429b = ol2.mo48005b(zzvtVar);
            zzvtVar.mo47430a(mo47429b);
        }
        return zzdm(mo47429b) + mo47429b;
    }

    /* renamed from: d */
    public static long m47440d(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m47439e(int i, zzys zzysVar, OL2 ol2) {
        return zzdm(i << 3) + m47442a(zzysVar, ol2);
    }

    /* renamed from: f */
    public static int m47438f(int i, zzys zzysVar, OL2 ol2) {
        int zzdm = zzdm(i << 3) << 1;
        zzvt zzvtVar = (zzvt) zzysVar;
        int mo47429b = zzvtVar.mo47429b();
        if (mo47429b == -1) {
            mo47429b = ol2.mo48005b(zzvtVar);
            zzvtVar.mo47430a(mo47429b);
        }
        return zzdm + mo47429b;
    }

    /* renamed from: g */
    public static int m47437g(int i) {
        return zzdm(i) + i;
    }

    /* renamed from: h */
    public static int m47436h(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzaa(long j) {
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

    public static int zzab(long j) {
        return zzaa(m47440d(j));
    }

    public static int zzac(long j) {
        return 8;
    }

    public static int zzad(long j) {
        return 8;
    }

    public static int zzay(boolean z) {
        return 1;
    }

    public static int zzcl(String str) {
        int length;
        try {
            length = AbstractC6464b.m47975c(str);
        } catch (zzaaq unused) {
            length = str.getBytes(zzxl.f46112a).length;
        }
        return zzdm(length) + length;
    }

    public static int zzd(double d) {
        return 8;
    }

    public static int zzdk(int i) {
        return zzdm(i << 3);
    }

    public static int zzdl(int i) {
        if (i >= 0) {
            return zzdm(i);
        }
        return 10;
    }

    public static int zzdm(int i) {
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

    public static int zzdn(int i) {
        return zzdm(m47436h(i));
    }

    public static int zzdo(int i) {
        return 4;
    }

    public static int zzdp(int i) {
        return 4;
    }

    public static int zzdq(int i) {
        return zzdl(i);
    }

    @Deprecated
    public static int zzdt(int i) {
        return zzdm(i);
    }

    public static int zze(int i, long j) {
        return zzdm(i << 3) + zzaa(j);
    }

    public static int zzf(int i, long j) {
        return zzdm(i << 3) + zzaa(m47440d(j));
    }

    public static zzwq zzg(byte[] bArr) {
        return new C6521a(bArr, 0, bArr.length);
    }

    public static int zzh(int i, long j) {
        return zzdm(i << 3) + 8;
    }

    public static int zzl(int i, int i2) {
        return zzdm(i << 3) + zzdl(i2);
    }

    public static int zzm(int i, int i2) {
        return zzdm(i << 3) + zzdm(i2);
    }

    public static int zzn(int i, int i2) {
        return zzdm(i << 3) + zzdm(m47436h(i2));
    }

    public static int zzo(int i, int i2) {
        return zzdm(i << 3) + 4;
    }

    public static int zzp(int i, int i2) {
        return zzdm(i << 3) + 4;
    }

    public static int zzr(float f) {
        return 4;
    }

    public static int zzz(long j) {
        return zzaa(j);
    }

    /* renamed from: b */
    public abstract void mo47434b(int i, zzys zzysVar, OL2 ol2);

    /* renamed from: c */
    public final void m47441c(String str, zzaaq zzaaqVar) {
        f46094b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaaqVar);
        byte[] bytes = str.getBytes(zzxl.f46112a);
        try {
            zzdh(bytes.length);
            zzb(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    /* renamed from: i */
    public abstract void mo47433i(byte[] bArr, int i, int i2);

    public abstract void writeTag(int i, int i2) throws IOException;

    public final void zza(int i, float f) throws IOException {
        zzk(i, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzwd zzwdVar) throws IOException;

    public abstract void zza(int i, zzys zzysVar) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public final void zzax(boolean z) throws IOException {
        zzd(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, m47440d(j));
    }

    public abstract void zzb(int i, zzwd zzwdVar) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(zzys zzysVar) throws IOException;

    public final void zzc(double d) throws IOException {
        zzy(Double.doubleToRawLongBits(d));
    }

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(zzwd zzwdVar) throws IOException;

    public abstract void zzck(String str) throws IOException;

    public abstract void zzd(byte b) throws IOException;

    public abstract void zzdg(int i) throws IOException;

    public abstract void zzdh(int i) throws IOException;

    public final void zzdi(int i) throws IOException {
        zzdh(m47436h(i));
    }

    public abstract void zzdj(int i) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i, int i2) throws IOException;

    public final void zzj(int i, int i2) throws IOException {
        zzi(i, m47436h(i2));
    }

    public abstract void zzk(int i, int i2) throws IOException;

    public final void zzq(float f) throws IOException {
        zzdj(Float.floatToRawIntBits(f));
    }

    public abstract int zzuk();

    public final void zzul() {
        if (zzuk() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void zzw(long j) throws IOException;

    public final void zzx(long j) throws IOException {
        zzw(m47440d(j));
    }

    public abstract void zzy(long j) throws IOException;

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzwq$a */
    /* loaded from: classes3.dex */
    public static class C6521a extends zzwq {

        /* renamed from: d */
        public final byte[] f46097d;

        /* renamed from: e */
        public final int f46098e;

        /* renamed from: f */
        public final int f46099f;

        /* renamed from: g */
        public int f46100g;

        public C6521a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if (((bArr.length - i2) | i2) >= 0) {
                    this.f46097d = bArr;
                    this.f46098e = 0;
                    this.f46100g = 0;
                    this.f46099f = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        /* renamed from: b */
        public final void mo47434b(int i, zzys zzysVar, OL2 ol2) {
            writeTag(i, 2);
            zzvt zzvtVar = (zzvt) zzysVar;
            int mo47429b = zzvtVar.mo47429b();
            if (mo47429b == -1) {
                mo47429b = ol2.mo48005b(zzvtVar);
                zzvtVar.mo47430a(mo47429b);
            }
            zzdh(mo47429b);
            ol2.mo48001f(zzysVar, this.f46096a);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        /* renamed from: i */
        public final void mo47433i(byte[] bArr, int i, int i2) {
            zzdh(i2);
            m47432k(bArr, 0, i2);
        }

        /* renamed from: k */
        public final void m47432k(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f46097d, this.f46100g, i2);
                this.f46100g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46100g), Integer.valueOf(this.f46099f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void writeTag(int i, int i2) {
            zzdh((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zza(int i, long j) {
            writeTag(i, 0);
            zzw(j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzb(int i, String str) {
            writeTag(i, 2);
            zzck(str);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzc(int i, long j) {
            writeTag(i, 1);
            zzy(j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzck(String str) {
            int i = this.f46100g;
            try {
                int zzdm = zzwq.zzdm(str.length() * 3);
                int zzdm2 = zzwq.zzdm(str.length());
                if (zzdm2 == zzdm) {
                    int i2 = i + zzdm2;
                    this.f46100g = i2;
                    int m47977a = AbstractC6464b.m47977a(str, this.f46097d, i2, zzuk());
                    this.f46100g = i;
                    zzdh((m47977a - i) - zzdm2);
                    this.f46100g = m47977a;
                    return;
                }
                zzdh(AbstractC6464b.m47975c(str));
                this.f46100g = AbstractC6464b.m47977a(str, this.f46097d, this.f46100g, zzuk());
            } catch (zzaaq e) {
                this.f46100g = i;
                m47441c(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzd(byte b) {
            try {
                byte[] bArr = this.f46097d;
                int i = this.f46100g;
                this.f46100g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46100g), Integer.valueOf(this.f46099f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzdg(int i) {
            if (i >= 0) {
                zzdh(i);
            } else {
                zzw(i);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzdh(int i) {
            if (zzwq.f46095c && !AbstractC21917rK2.m23335b() && zzuk() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.f46097d;
                    int i2 = this.f46100g;
                    this.f46100g = 1 + i2;
                    AbstractC17455Da2.m68628i(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.f46097d;
                int i3 = this.f46100g;
                this.f46100g = i3 + 1;
                AbstractC17455Da2.m68628i(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.f46097d;
                    int i5 = this.f46100g;
                    this.f46100g = 1 + i5;
                    AbstractC17455Da2.m68628i(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.f46097d;
                int i6 = this.f46100g;
                this.f46100g = i6 + 1;
                AbstractC17455Da2.m68628i(bArr4, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f46097d;
                    int i8 = this.f46100g;
                    this.f46100g = 1 + i8;
                    AbstractC17455Da2.m68628i(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f46097d;
                int i9 = this.f46100g;
                this.f46100g = i9 + 1;
                AbstractC17455Da2.m68628i(bArr6, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f46097d;
                    int i11 = this.f46100g;
                    this.f46100g = 1 + i11;
                    AbstractC17455Da2.m68628i(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f46097d;
                int i12 = this.f46100g;
                this.f46100g = i12 + 1;
                AbstractC17455Da2.m68628i(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.f46097d;
                int i13 = this.f46100g;
                this.f46100g = 1 + i13;
                AbstractC17455Da2.m68628i(bArr9, i13, (byte) (i >>> 28));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f46097d;
                    int i14 = this.f46100g;
                    this.f46100g = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46100g), Integer.valueOf(this.f46099f), 1), e);
                }
            }
            byte[] bArr11 = this.f46097d;
            int i15 = this.f46100g;
            this.f46100g = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzdj(int i) {
            try {
                byte[] bArr = this.f46097d;
                int i2 = this.f46100g;
                int i3 = i2 + 1;
                this.f46100g = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.f46100g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.f46100g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f46100g = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46100g), Integer.valueOf(this.f46099f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzh(int i, int i2) {
            writeTag(i, 0);
            zzdg(i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzi(int i, int i2) {
            writeTag(i, 0);
            zzdh(i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzk(int i, int i2) {
            writeTag(i, 5);
            zzdj(i2);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final int zzuk() {
            return this.f46099f - this.f46100g;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzw(long j) {
            if (zzwq.f46095c && zzuk() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f46097d;
                    int i = this.f46100g;
                    this.f46100g = i + 1;
                    AbstractC17455Da2.m68628i(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f46097d;
                int i2 = this.f46100g;
                this.f46100g = 1 + i2;
                AbstractC17455Da2.m68628i(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f46097d;
                    int i3 = this.f46100g;
                    this.f46100g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46100g), Integer.valueOf(this.f46099f), 1), e);
                }
            }
            byte[] bArr4 = this.f46097d;
            int i4 = this.f46100g;
            this.f46100g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzy(long j) {
            try {
                byte[] bArr = this.f46097d;
                int i = this.f46100g;
                int i2 = i + 1;
                this.f46100g = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.f46100g = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.f46100g = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.f46100g = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.f46100g = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.f46100g = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.f46100g = i8;
                bArr[i7] = (byte) (j >> 48);
                this.f46100g = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f46100g), Integer.valueOf(this.f46099f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zza(int i, boolean z) {
            writeTag(i, 0);
            zzd(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzb(int i, zzwd zzwdVar) {
            writeTag(1, 3);
            zzi(2, i);
            zza(3, zzwdVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzc(zzwd zzwdVar) {
            zzdh(zzwdVar.size());
            zzwdVar.zza(this);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zza(int i, zzwd zzwdVar) {
            writeTag(i, 2);
            zzc(zzwdVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zza(int i, zzys zzysVar) {
            writeTag(1, 3);
            zzi(2, i);
            writeTag(3, 2);
            zzb(zzysVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwq
        public final void zzb(zzys zzysVar) {
            zzdh(zzysVar.zzva());
            zzysVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzwa
        public final void zzb(byte[] bArr, int i, int i2) {
            m47432k(bArr, i, i2);
        }
    }

    public static int zzb(int i, float f) {
        return zzdm(i << 3) + 4;
    }

    public static int zzc(int i, String str) {
        return zzdm(i << 3) + zzcl(str);
    }

    public static int zzd(int i, long j) {
        return zzdm(i << 3) + zzaa(j);
    }

    public static int zzh(byte[] bArr) {
        int length = bArr.length;
        return zzdm(length) + length;
    }

    public static int zzq(int i, int i2) {
        return zzdm(i << 3) + zzdl(i2);
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public static int zza(int i, zzyb zzybVar) {
        int zzdm = zzdm(i << 3);
        int zzva = zzybVar.zzva();
        return zzdm + zzdm(zzva) + zzva;
    }

    public static int zzb(int i, double d) {
        return zzdm(i << 3) + 8;
    }

    public static int zzg(int i, long j) {
        return zzdm(i << 3) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zzdm(i << 3) + 1;
    }

    public static int zzc(int i, zzwd zzwdVar) {
        int zzdm = zzdm(i << 3);
        int size = zzwdVar.size();
        return zzdm + zzdm(size) + size;
    }

    public static int zzd(int i, zzwd zzwdVar) {
        return (zzdm(8) << 1) + zzm(2, i) + zzc(3, zzwdVar);
    }

    public static int zzb(int i, zzys zzysVar) {
        return (zzdm(8) << 1) + zzm(2, i) + zzdm(24) + zzc(zzysVar);
    }

    public static int zza(zzyb zzybVar) {
        int zzva = zzybVar.zzva();
        return zzdm(zzva) + zzva;
    }

    public static int zzc(zzys zzysVar) {
        int zzva = zzysVar.zzva();
        return zzdm(zzva) + zzva;
    }

    public static int zzd(zzwd zzwdVar) {
        int size = zzwdVar.size();
        return zzdm(size) + size;
    }

    public static int zzb(int i, zzyb zzybVar) {
        return (zzdm(8) << 1) + zzm(2, i) + zza(3, zzybVar);
    }

    @Deprecated
    public static int zzd(zzys zzysVar) {
        return zzysVar.zzva();
    }
}
