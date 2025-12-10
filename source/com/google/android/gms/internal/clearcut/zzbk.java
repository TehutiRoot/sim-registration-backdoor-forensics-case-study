package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
public abstract class zzbk {

    /* renamed from: a */
    public int f45532a;

    /* renamed from: b */
    public int f45533b;

    /* renamed from: c */
    public boolean f45534c;

    public zzbk() {
        this.f45532a = 100;
        this.f45533b = Integer.MAX_VALUE;
        this.f45534c = false;
    }

    /* renamed from: a */
    public static zzbk m48182a(byte[] bArr, int i, int i2, boolean z) {
        C23339ze2 c23339ze2 = new C23339ze2(bArr, 0, i2, false);
        try {
            c23339ze2.zzl(i2);
            return c23339ze2;
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
