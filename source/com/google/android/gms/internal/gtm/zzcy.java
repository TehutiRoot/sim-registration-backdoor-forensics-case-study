package com.google.android.gms.internal.gtm;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzcy {
    private static volatile Handler zza;
    private final zzbx zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcy(zzbx zzbxVar) {
        Preconditions.checkNotNull(zzbxVar);
        this.zzb = zzbxVar;
        this.zzc = new zzcx(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcy.class) {
            try {
                if (zza == null) {
                    zza = new zzgc(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
    }

    public final void zze(long j) {
        if (!zzh()) {
            return;
        }
        long j2 = 0;
        if (j < 0) {
            zzf();
            return;
        }
        long abs = j - Math.abs(this.zzb.zzr().currentTimeMillis() - this.zzd);
        if (abs >= 0) {
            j2 = abs;
        }
        zzi().removeCallbacks(this.zzc);
        if (!zzi().postDelayed(this.zzc, j2)) {
            this.zzb.zzm().zzJ("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j) {
        zzf();
        if (j >= 0) {
            this.zzd = this.zzb.zzr().currentTimeMillis();
            if (!zzi().postDelayed(this.zzc, j)) {
                this.zzb.zzm().zzJ("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
