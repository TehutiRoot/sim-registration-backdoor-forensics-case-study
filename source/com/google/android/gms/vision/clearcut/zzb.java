package com.google.android.gms.vision.clearcut;

/* loaded from: classes4.dex */
public final class zzb {

    /* renamed from: b */
    public final Object f48658b = new Object();

    /* renamed from: c */
    public long f48659c = Long.MIN_VALUE;

    /* renamed from: a */
    public final long f48657a = Math.round(30000.0d);

    public zzb(double d) {
    }

    public final boolean zza() {
        synchronized (this.f48658b) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f48659c + this.f48657a > currentTimeMillis) {
                    return false;
                }
                this.f48659c = currentTimeMillis;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
