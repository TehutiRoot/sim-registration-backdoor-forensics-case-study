package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzew;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.android.gms.internal.gtm.zzft;
import com.google.android.gms.internal.gtm.zzfv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class GoogleAnalytics extends zza {

    /* renamed from: k */
    public static List f44374k = new ArrayList();

    /* renamed from: e */
    public boolean f44375e;

    /* renamed from: f */
    public final Set f44376f;

    /* renamed from: g */
    public boolean f44377g;

    /* renamed from: h */
    public boolean f44378h;

    /* renamed from: i */
    public volatile boolean f44379i;

    /* renamed from: j */
    public boolean f44380j;

    @VisibleForTesting
    public GoogleAnalytics(zzbx zzbxVar) {
        super(zzbxVar);
        this.f44376f = new HashSet();
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static GoogleAnalytics getInstance(@NonNull Context context) {
        return zzbx.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            try {
                List<Runnable> list = f44374k;
                if (list != null) {
                    for (Runnable runnable : list) {
                        runnable.run();
                    }
                    f44374k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m48763b(Activity activity) {
        for (C21401oK2 c21401oK2 : this.f44376f) {
            c21401oK2.m25933b(activity);
        }
    }

    /* renamed from: c */
    public final void m48762c(Activity activity) {
        for (C21401oK2 c21401oK2 : this.f44376f) {
            c21401oK2.m25932d(activity);
        }
    }

    /* renamed from: d */
    public final void m48761d(C21401oK2 c21401oK2) {
        this.f44376f.add(c21401oK2);
        Context zza = m48741a().zza();
        if (zza instanceof Application) {
            enableAutoActivityReports((Application) zza);
        }
    }

    public void dispatchLocalHits() {
        m48741a().zzf().zzc();
    }

    /* renamed from: e */
    public final void m48760e(C21401oK2 c21401oK2) {
        this.f44376f.remove(c21401oK2);
    }

    @TargetApi(14)
    public void enableAutoActivityReports(@NonNull Application application) {
        if (!this.f44377g) {
            application.registerActivityLifecycleCallbacks(new C21809qk2(this));
            this.f44377g = true;
        }
    }

    public boolean getAppOptOut() {
        return this.f44379i;
    }

    @NonNull
    @Deprecated
    public Logger getLogger() {
        return zzfc.zza();
    }

    public boolean isDryRunEnabled() {
        return this.f44378h;
    }

    @NonNull
    public Tracker newTracker(int i) {
        Tracker tracker;
        zzft zzftVar;
        synchronized (this) {
            try {
                tracker = new Tracker(m48741a(), null, null);
                if (i > 0 && (zzftVar = (zzft) new zzfs(m48741a()).zza(i)) != null) {
                    tracker.m48746r(zzftVar);
                }
                tracker.zzW();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tracker;
    }

    public void reportActivityStart(@NonNull Activity activity) {
        if (!this.f44377g) {
            m48763b(activity);
        }
    }

    public void reportActivityStop(@NonNull Activity activity) {
        if (!this.f44377g) {
            m48762c(activity);
        }
    }

    public void setAppOptOut(boolean z) {
        this.f44379i = z;
        if (this.f44379i) {
            m48741a().zzf().zzg();
        }
    }

    public void setDryRun(boolean z) {
        this.f44378h = z;
    }

    public void setLocalDispatchPeriod(int i) {
        m48741a().zzf().zzl(i);
    }

    @Deprecated
    public void setLogger(@NonNull Logger logger) {
        zzfc.zzc(logger);
        if (!this.f44380j) {
            zzev zzevVar = zzew.zzc;
            String str = (String) zzevVar.zzb();
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append((String) zzevVar.zzb());
            sb.append(" DEBUG");
            this.f44380j = true;
        }
    }

    public final void zzg() {
        zzfv zzq = m48741a().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            setDryRun(zzq.zzc());
        }
        zzq.zzf();
        this.f44375e = true;
    }

    public final boolean zzj() {
        return this.f44375e;
    }

    @NonNull
    public Tracker newTracker(@NonNull String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(m48741a(), str, null);
            tracker.zzW();
        }
        return tracker;
    }
}
