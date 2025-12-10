package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
public abstract class zzwp {

    /* renamed from: a */
    public int f46103a;

    /* renamed from: b */
    public int f46104b;

    /* renamed from: c */
    public boolean f46105c;

    public zzwp() {
        this.f46103a = 100;
        this.f46104b = Integer.MAX_VALUE;
        this.f46105c = false;
    }

    /* renamed from: a */
    public static zzwp m47452a(byte[] bArr, int i, int i2, boolean z) {
        GL2 gl2 = new GL2(bArr, i2);
        try {
            gl2.zzde(i2);
            return gl2;
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