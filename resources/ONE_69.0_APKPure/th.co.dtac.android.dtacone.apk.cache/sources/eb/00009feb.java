package com.google.android.gms.vision.clearcut;

/* loaded from: classes4.dex */
public final class zzb {

    /* renamed from: b */
    public final Object f48670b = new Object();

    /* renamed from: c */
    public long f48671c = Long.MIN_VALUE;

    /* renamed from: a */
    public final long f48669a = Math.round(30000.0d);

    public zzb(double d) {
    }

    public final boolean zza() {
        synchronized (this.f48670b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f48671c + this.f48669a > currentTimeMillis) {
                    return false;
                }
                this.f48671c = currentTimeMillis;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}