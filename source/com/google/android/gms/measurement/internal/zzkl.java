package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public final class zzkl extends RC2 {

    /* renamed from: b */
    public final AlarmManager f48443b;

    /* renamed from: c */
    public AbstractC20753kc2 f48444c;

    /* renamed from: d */
    public Integer f48445d;

    public zzkl(zzkz zzkzVar) {
        super(zzkzVar);
        this.f48443b = (AlarmManager) this.zzs.zzau().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzs.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m46208b());
        }
    }

    /* renamed from: b */
    public final int m46208b() {
        if (this.f48445d == null) {
            this.f48445d = Integer.valueOf("measurement".concat(String.valueOf(this.zzs.zzau().getPackageName())).hashCode());
        }
        return this.f48445d.intValue();
    }

    /* renamed from: c */
    public final PendingIntent m46207c() {
        Context zzau = this.zzs.zzau();
        return PendingIntent.getBroadcast(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    /* renamed from: d */
    public final AbstractC20753kc2 m46206d() {
        if (this.f48444c == null) {
            this.f48444c = new C6733h0(this, this.zzf.m46191O());
        }
        return this.f48444c;
    }

    public final void zza() {
        zzW();
        this.zzs.zzay().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.f48443b;
        if (alarmManager != null) {
            alarmManager.cancel(m46207c());
        }
        m46206d().m28909b();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    @Override // p000.RC2
    public final boolean zzb() {
        AlarmManager alarmManager = this.f48443b;
        if (alarmManager != null) {
            alarmManager.cancel(m46207c());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
            return false;
        }
        return false;
    }

    public final void zzd(long j) {
        zzW();
        this.zzs.zzaw();
        Context zzau = this.zzs.zzau();
        if (!zzlh.m46129A(zzau)) {
            this.zzs.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlh.m46128B(zzau, false)) {
            this.zzs.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzs.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime() + j;
        this.zzs.zzf();
        if (j < Math.max(0L, ((Long) zzeb.zzw.zza(null)).longValue()) && !m46206d().m28906e()) {
            m46206d().m28907d(j);
        }
        this.zzs.zzaw();
        if (Build.VERSION.SDK_INT >= 24) {
            Context zzau2 = this.zzs.zzau();
            ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int m46208b = m46208b();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            com.google.android.gms.internal.measurement.zzbt.zza(zzau2, new JobInfo.Builder(m46208b, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f48443b;
        if (alarmManager != null) {
            this.zzs.zzf();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) zzeb.zzr.zza(null)).longValue(), j), m46207c());
        }
    }
}
