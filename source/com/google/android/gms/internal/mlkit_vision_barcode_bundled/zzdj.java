package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzdj extends zzcr {

    /* renamed from: b */
    public static final Logger f46959b = Logger.getLogger(zzdj.class.getName());

    /* renamed from: c */
    public static final boolean f46960c = AbstractC19775eu2.m31414C();
    public static final /* synthetic */ int zzb = 0;

    /* renamed from: a */
    public C17927Ki2 f46961a;

    public /* synthetic */ zzdj(zzdi zzdiVar) {
    }

    /* renamed from: c */
    public static int m46885c(int i, zzfo zzfoVar, Rq2 rq2) {
        int mo46881a = ((zzck) zzfoVar).mo46881a(rq2);
        int zzy = zzy(i << 3);
        return zzy + zzy + mo46881a;
    }

    /* renamed from: d */
    public static int m46884d(zzfo zzfoVar, Rq2 rq2) {
        int mo46881a = ((zzck) zzfoVar).mo46881a(rq2);
        return zzy(mo46881a) + mo46881a;
    }

    public static zzdj zzA(byte[] bArr, int i, int i2) {
        return new C6567a(bArr, 0, i2);
    }

    public static int zzu(int i) {
        if (i >= 0) {
            return zzy(i);
        }
        return 10;
    }

    public static int zzv(zzfo zzfoVar) {
        int zzE = zzfoVar.zzE();
        return zzy(zzE) + zzE;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = AbstractC6576j.m46899e(str);
        } catch (zzhm unused) {
            length = str.getBytes(zzem.f46970b).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i) {
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

    public static int zzz(long j) {
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
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public final void m46887a(String str, zzhm zzhmVar) {
        f46959b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhmVar);
        byte[] bytes = str.getBytes(zzem.f46970b);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdh(e);
        }
    }

    public final void zzB() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzdb zzdbVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, String str) throws IOException;

    public abstract void zzo(int i, int i2) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i, long j) throws IOException;

    public abstract void zzs(long j) throws IOException;
}
