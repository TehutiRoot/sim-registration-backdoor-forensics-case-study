package com.google.android.gms.internal.vision;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzif {

    /* renamed from: a */
    public int f47614a;

    /* renamed from: b */
    public int f47615b;

    /* renamed from: c */
    public int f47616c;

    /* renamed from: d */
    public Yw2 f47617d;

    /* renamed from: e */
    public boolean f47618e;

    public zzif() {
        this.f47615b = 100;
        this.f47616c = Integer.MAX_VALUE;
        this.f47618e = false;
    }

    /* renamed from: a */
    public static zzif m46445a(byte[] bArr, int i, int i2, boolean z) {
        C19612dx2 c19612dx2 = new C19612dx2(bArr, i2);
        try {
            c19612dx2.zzc(i2);
            return c19612dx2;
        } catch (zzjk e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zze(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: b */
    public abstract long mo31615b();

    public abstract int zza() throws IOException;

    public abstract void zza(int i) throws zzjk;

    public abstract double zzb() throws IOException;

    public abstract boolean zzb(int i) throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzc(int i) throws zzjk;

    public abstract long zzd() throws IOException;

    public abstract void zzd(int i);

    public abstract long zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract boolean zzi() throws IOException;

    public abstract String zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract zzht zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract int zzu();
}
