package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class zzbs extends zzbu {
    private final zzcm zza;

    public zzbs(zzbx zzbxVar, zzby zzbyVar) {
        super(zzbxVar);
        Preconditions.checkNotNull(zzbyVar);
        this.zza = new zzcm(zzbxVar, zzbyVar);
    }

    public final long zza(zzbz zzbzVar) {
        zzV();
        Preconditions.checkNotNull(zzbzVar);
        com.google.android.gms.analytics.zzr.zzh();
        long zzb = this.zza.zzb(zzbzVar, true);
        if (zzb == 0) {
            this.zza.zzk(zzbzVar);
            return 0L;
        }
        return zzb;
    }

    public final void zzc() {
        zzV();
        Context zzo = zzo();
        if (zzfk.zzb(zzo) && zzfp.zzh(zzo)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
            zzo.startService(intent);
            return;
        }
        zze(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzdb zzdbVar) {
        zzV();
        zzq().zzi(new zzbq(this, zzdbVar));
    }

    public final void zzf(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzq().zzi(new zzbm(this, str, runnable));
    }

    public final void zzg() {
        zzV();
        zzw();
        zzq().zzi(new zzbp(this));
    }

    public final void zzh(zzez zzezVar) {
        Preconditions.checkNotNull(zzezVar);
        zzV();
        zzF("Hit delivery requested", zzezVar);
        zzq().zzi(new zzbo(this, zzezVar));
    }

    public final void zzi() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zza.zzl();
    }

    public final void zzj() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zza.zzm();
    }

    public final void zzk() {
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        com.google.android.gms.analytics.zzr.zzh();
        zzcm zzcmVar = this.zza;
        zzcmVar.zzV();
        zzcmVar.zzN("Service disconnected");
    }

    public final void zzl(int i) {
        zzV();
        zzF("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzq().zzi(new zzbn(this, i));
    }

    public final void zzm() {
        this.zza.zzZ();
    }

    public final boolean zzn() {
        zzV();
        try {
            zzq().zzg(new zzbr(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzR("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zzJ("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzR("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }
}
