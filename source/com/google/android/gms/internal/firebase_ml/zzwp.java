package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
public abstract class zzwp {

    /* renamed from: a */
    public int f46091a;

    /* renamed from: b */
    public int f46092b;

    /* renamed from: c */
    public boolean f46093c;

    public zzwp() {
        this.f46091a = 100;
        this.f46092b = Integer.MAX_VALUE;
        this.f46093c = false;
    }

    /* renamed from: a */
    public static zzwp m47443a(byte[] bArr, int i, int i2, boolean z) {
        JK2 jk2 = new JK2(bArr, i2);
        try {
            jk2.zzde(i2);
            return jk2;
        } catch (zzxs e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzdf(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzv(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract int zzde(int i) throws zzxs;

    public abstract int zzuj();
}
