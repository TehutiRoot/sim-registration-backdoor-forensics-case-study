package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzd extends AbstractC21121mk2 {

    /* renamed from: a */
    public final Map f48268a;

    /* renamed from: b */
    public final Map f48269b;

    /* renamed from: c */
    public long f48270c;

    public zzd(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48269b = new ArrayMap();
        this.f48268a = new ArrayMap();
    }

    /* renamed from: a */
    public static /* synthetic */ void m46339a(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.f48269b.isEmpty()) {
            zzdVar.f48270c = j;
        }
        Integer num = (Integer) zzdVar.f48269b.get(str);
        if (num != null) {
            zzdVar.f48269b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.f48269b.size() >= 100) {
            zzdVar.zzs.zzay().zzk().zza("Too many ads visible");
        } else {
            zzdVar.f48269b.put(str, 1);
            zzdVar.f48268a.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m46338b(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.f48269b.get(str);
        if (num != null) {
            zzik zzj = zzdVar.zzs.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.f48269b.remove(str);
                Long l = (Long) zzdVar.f48268a.get(str);
                if (l == null) {
                    zzdVar.zzs.zzay().zzd().zza("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    zzdVar.f48268a.remove(str);
                    zzdVar.m46335e(str, j - longValue, zzj);
                }
                if (zzdVar.f48269b.isEmpty()) {
                    long j2 = zzdVar.f48270c;
                    if (j2 == 0) {
                        zzdVar.zzs.zzay().zzd().zza("First ad exposure time was never set");
                        return;
                    }
                    zzdVar.m46336d(j - j2, zzj);
                    zzdVar.f48270c = 0L;
                    return;
                }
                return;
            }
            zzdVar.f48269b.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: d */
    public final void m46336d(long j, zzik zzikVar) {
        if (zzikVar == null) {
            this.zzs.zzay().zzj().zza("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzlh.zzK(zzikVar, bundle, true);
            this.zzs.zzq().m46259c("am", "_xa", bundle);
        }
    }

    /* renamed from: e */
    public final void m46335e(String str, long j, zzik zzikVar) {
        if (zzikVar == null) {
            this.zzs.zzay().zzj().zza("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzlh.zzK(zzikVar, bundle, true);
            this.zzs.zzq().m46259c("am", "_xu", bundle);
        }
    }

    /* renamed from: f */
    public final void m46334f(long j) {
        for (String str : this.f48268a.keySet()) {
            this.f48268a.put(str, Long.valueOf(j));
        }
        if (!this.f48268a.isEmpty()) {
            this.f48270c = j;
        }
    }

    public final void zzd(String str, long j) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaz().zzp(new H92(this, str, j));
        } else {
            this.zzs.zzay().zzd().zza("Ad unit id must be a non-empty string");
        }
    }

    public final void zze(String str, long j) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaz().zzp(new RunnableC17528Ed2(this, str, j));
        } else {
            this.zzs.zzay().zzd().zza("Ad unit id must be a non-empty string");
        }
    }

    @WorkerThread
    public final void zzf(long j) {
        zzik zzj = this.zzs.zzs().zzj(false);
        for (String str : this.f48268a.keySet()) {
            m46335e(str, j - ((Long) this.f48268a.get(str)).longValue(), zzj);
        }
        if (!this.f48268a.isEmpty()) {
            m46336d(j - this.f48270c, zzj);
        }
        m46334f(j);
    }
}
