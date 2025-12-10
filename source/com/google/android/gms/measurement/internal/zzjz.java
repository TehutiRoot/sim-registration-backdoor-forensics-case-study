package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzjz {

    /* renamed from: a */
    public final Context f48441a;

    public zzjz(Context context) {
        Preconditions.checkNotNull(context);
        this.f48441a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ void m46216a(int i, zzeo zzeoVar, Intent intent) {
        if (((zzjy) this.f48441a).zzc(i)) {
            zzeoVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m46214c().zzj().zza("Completed wakeful intent.");
            ((zzjy) this.f48441a).zza(intent);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m46215b(zzeo zzeoVar, JobParameters jobParameters) {
        zzeoVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzjy) this.f48441a).zzb(jobParameters, false);
    }

    /* renamed from: c */
    public final zzeo m46214c() {
        return zzfy.zzp(this.f48441a, null, null).zzay();
    }

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) {
        zzfy zzp = zzfy.zzp(this.f48441a, null, null);
        final zzeo zzay = zzp.zzay();
        if (intent == null) {
            zzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzp.zzaw();
        zzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjw
                @Override // java.lang.Runnable
                public final void run() {
                    zzjz.this.m46216a(i2, zzay, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            m46214c().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgq(zzkz.zzt(this.f48441a), null);
        }
        m46214c().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public final void zze() {
        zzfy zzp = zzfy.zzp(this.f48441a, null, null);
        zzeo zzay = zzp.zzay();
        zzp.zzaw();
        zzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzfy zzp = zzfy.zzp(this.f48441a, null, null);
        zzeo zzay = zzp.zzay();
        zzp.zzaw();
        zzay.zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent) {
        if (intent == null) {
            m46214c().zzd().zza("onRebind called with null intent");
            return;
        }
        m46214c().zzj().zzb("onRebind called. action", intent.getAction());
    }

    public final void zzh(Runnable runnable) {
        zzkz zzt = zzkz.zzt(this.f48441a);
        zzt.zzaz().zzp(new RunnableC21890rB2(this, zzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzfy zzp = zzfy.zzp(this.f48441a, null, null);
        final zzeo zzay = zzp.zzay();
        String string = jobParameters.getExtras().getString("action");
        zzp.zzaw();
        zzay.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjv
                @Override // java.lang.Runnable
                public final void run() {
                    zzjz.this.m46215b(zzay, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            m46214c().zzd().zza("onUnbind called with null intent");
            return true;
        }
        m46214c().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
