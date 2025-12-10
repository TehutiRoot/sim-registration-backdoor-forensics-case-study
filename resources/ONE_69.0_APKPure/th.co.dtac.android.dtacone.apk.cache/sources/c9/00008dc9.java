package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public abstract class zzbk {

    /* renamed from: a */
    public int f45544a;

    /* renamed from: b */
    public int f45545b;

    /* renamed from: c */
    public boolean f45546c;

    public zzbk() {
        this.f45544a = 100;
        this.f45545b = Integer.MAX_VALUE;
        this.f45546c = false;
    }

    /* renamed from: a */
    public static zzbk m48179a(byte[] bArr, int i, int i2, boolean z) {
        C22895wf2 c22895wf2 = new C22895wf2(bArr, 0, i2, false);
        try {
            c22895wf2.zzl(i2);
            return c22895wf2;
        } catch (zzco e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zzm(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int zzaf();

    public abstract int zzl(int i) throws zzco;
}