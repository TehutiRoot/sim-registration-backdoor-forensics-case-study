package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzjl extends zzit {

    /* renamed from: b */
    public static final Logger f46322b = Logger.getLogger(zzjl.class.getName());

    /* renamed from: c */
    public static final boolean f46323c = BH2.m68952C();

    /* renamed from: a */
    public C22059sA2 f46324a;

    public /* synthetic */ zzjl(zzjk zzjkVar) {
    }

    /* renamed from: c */
    public static int m47160c(int i, zzll zzllVar, DF2 df2) {
        int zzA = zzA(i << 3);
        int i2 = zzA + zzA;
        zzin zzinVar = (zzin) zzllVar;
        int mo47157a = zzinVar.mo47157a();
        if (mo47157a == -1) {
            mo47157a = df2.zza(zzinVar);
            zzinVar.mo47156b(mo47157a);
        }
        return i2 + mo47157a;
    }

    /* renamed from: d */
    public static int m47159d(zzll zzllVar, DF2 df2) {
        zzin zzinVar = (zzin) zzllVar;
        int mo47157a = zzinVar.mo47157a();
        if (mo47157a == -1) {
            mo47157a = df2.zza(zzinVar);
            zzinVar.mo47156b(mo47157a);
        }
        return zzA(mo47157a) + mo47157a;
    }

    public static int zzA(int i) {
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

    public static int zzB(long j) {
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

    public static zzjl zzC(byte[] bArr) {
        return new C6528b(bArr, 0, bArr.length);
    }

    public static int zzt(zzjd zzjdVar) {
        int zzd = zzjdVar.zzd();
        return zzA(zzd) + zzd;
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzw(zzkr zzkrVar) {
        int zza = zzkrVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = AbstractC6534h.m47346c(str);
        } catch (zznb unused) {
            length = str.getBytes(zzkm.f46331b).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i) {
        return zzA(i << 3);
    }

    /* renamed from: a */
    public final void m47162a(String str, zznb zznbVar) {
        f46322b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznbVar);
        byte[] bytes = str.getBytes(zzkm.f46331b);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(e);
        }
    }

    public final void zzD() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzjd zzjdVar) throws IOException;

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
