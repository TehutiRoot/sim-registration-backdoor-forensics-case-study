package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzag extends AbstractC6736j {

    /* renamed from: a */
    public Boolean f48247a;

    /* renamed from: b */
    public InterfaceC17266Ab2 f48248b;

    /* renamed from: c */
    public Boolean f48249c;

    public zzag(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48248b = zzae.zza;
    }

    public static final long zzA() {
        return ((Long) zzeb.zzC.zza(null)).longValue();
    }

    public static final long zzz() {
        return ((Long) zzeb.zzc.zza(null)).longValue();
    }

    /* renamed from: a */
    public final String m46360a(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: b */
    public final int m46359b(String str) {
        return zzf(str, zzeb.zzG, 500, Constants.MAX_URL_LENGTH);
    }

    /* renamed from: c */
    public final Bundle m46358c() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), 128);
            if (applicationInfo == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: d */
    public final Boolean m46357d(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle m46358c = m46358c();
        if (m46358c == null) {
            this.zzs.zzay().zzd().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!m46358c.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(m46358c.getBoolean(str));
        }
    }

    /* renamed from: e */
    public final String m46356e() {
        this.zzs.zzaw();
        return "FA";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m46355f(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.m46358c()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzd()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzau()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.m46355f(java.lang.String):java.util.List");
    }

    /* renamed from: g */
    public final void m46354g(InterfaceC17266Ab2 interfaceC17266Ab2) {
        this.f48248b = interfaceC17266Ab2;
    }

    /* renamed from: h */
    public final boolean m46353h() {
        if (this.f48247a == null) {
            Boolean m46357d = m46357d("app_measurement_lite");
            this.f48247a = m46357d;
            if (m46357d == null) {
                this.f48247a = Boolean.FALSE;
            }
        }
        if (!this.f48247a.booleanValue() && this.zzs.zzN()) {
            return false;
        }
        return true;
    }

    @WorkerThread
    public final double zza(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Double) zzeaVar.zza(null)).doubleValue();
        }
        String zza = this.f48248b.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzeaVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzeaVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzeaVar.zza(null)).doubleValue();
        }
    }

    public final int zzc() {
        zzlh zzv = this.zzs.zzv();
        Boolean m46225l = zzv.zzs.zzt().m46225l();
        if (zzv.zzm() < 201500) {
            if (m46225l == null || m46225l.booleanValue()) {
                return 25;
            }
            return 100;
        }
        return 100;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzeb.zzH, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Integer) zzeaVar.zza(null)).intValue();
        }
        String zza = this.f48248b.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzeaVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzeaVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzeaVar.zza(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzea zzeaVar, int i, int i2) {
        return Math.max(Math.min(zze(str, zzeaVar), i2), i);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 73000L;
    }

    @WorkerThread
    public final long zzi(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Long) zzeaVar.zza(null)).longValue();
        }
        String zza = this.f48248b.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzeaVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzeaVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzeaVar.zza(null)).longValue();
        }
    }

    public final String zzl() {
        return m46360a("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return m46360a("debug.deferred.deeplink", "");
    }

    @WorkerThread
    public final String zzo(String str, zzea zzeaVar) {
        if (str == null) {
            return (String) zzeaVar.zza(null);
        }
        return (String) zzeaVar.zza(this.f48248b.zza(str, zzeaVar.zzb()));
    }

    public final boolean zzr() {
        Boolean m46357d = m46357d("google_analytics_adid_collection_enabled");
        if (m46357d != null && !m46357d.booleanValue()) {
            return false;
        }
        return true;
    }

    @WorkerThread
    public final boolean zzs(String str, zzea zzeaVar) {
        if (str == null) {
            return ((Boolean) zzeaVar.zza(null)).booleanValue();
        }
        String zza = this.f48248b.zza(str, zzeaVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Boolean) zzeaVar.zza(null)).booleanValue();
        }
        return ((Boolean) zzeaVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.f48248b.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean m46357d = m46357d("google_analytics_automatic_screen_reporting_enabled");
        if (m46357d != null && !m46357d.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean m46357d = m46357d("firebase_analytics_collection_deactivated");
        if (m46357d != null && m46357d.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean zzw(String str) {
        return "1".equals(this.f48248b.zza(str, "measurement.event_sampling_enabled"));
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.f48249c == null) {
            synchronized (this) {
                try {
                    if (this.f48249c == null) {
                        ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(myProcessName)) {
                                z = true;
                            }
                            this.f48249c = Boolean.valueOf(z);
                        }
                        if (this.f48249c == null) {
                            this.f48249c = Boolean.TRUE;
                            this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f48249c.booleanValue();
    }
}
