package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class zzis extends AbstractC19410cn2 {

    /* renamed from: b */
    public volatile zzik f48421b;

    /* renamed from: c */
    public volatile zzik f48422c;

    /* renamed from: d */
    public final Map f48423d;

    /* renamed from: e */
    public Activity f48424e;

    /* renamed from: f */
    public volatile boolean f48425f;

    /* renamed from: g */
    public volatile zzik f48426g;

    /* renamed from: h */
    public zzik f48427h;

    /* renamed from: i */
    public boolean f48428i;

    /* renamed from: j */
    public final Object f48429j;
    @VisibleForTesting
    protected zzik zza;

    public zzis(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48429j = new Object();
        this.f48423d = new ConcurrentHashMap();
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m46240h(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzisVar.m46246b(zzikVar, zzikVar2, j, true, zzisVar.zzs.zzv().m46112R(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    /* renamed from: b */
    public final void m46246b(zzik zzikVar, zzik zzikVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        zzg();
        boolean z3 = false;
        if (zzikVar2 == null || zzikVar2.zzc != zzikVar.zzc || !zzil.zza(zzikVar2.zzb, zzikVar.zzb) || !zzil.zza(zzikVar2.zza, zzikVar.zza)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.zza != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            zzlh.zzK(zzikVar, bundle3, true);
            if (zzikVar2 != null) {
                String str2 = zzikVar2.zza;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = zzikVar2.zzb;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", zzikVar2.zzc);
            }
            if (z3) {
                C6729f0 c6729f0 = this.zzs.zzu().zzb;
                long j4 = j - c6729f0.f48165b;
                c6729f0.f48165b = j;
                if (j4 > 0) {
                    this.zzs.zzv().m46105g(bundle3, j4);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != zzikVar.zze) {
                str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            } else {
                str = "app";
            }
            String str4 = str;
            long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zzikVar.zze) {
                j2 = currentTimeMillis;
                long j5 = zzikVar.zzf;
                if (j5 != 0) {
                    j3 = j5;
                    this.zzs.zzq().m46258d(str4, "_vs", j3, bundle3);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            this.zzs.zzq().m46258d(str4, "_vs", j3, bundle3);
        }
        if (z3) {
            m46245c(this.zza, true, j);
        }
        this.zza = zzikVar;
        if (zzikVar.zze) {
            this.f48427h = zzikVar;
        }
        this.zzs.zzt().zzG(zzikVar);
    }

    /* renamed from: c */
    public final void m46245c(zzik zzikVar, boolean z, long j) {
        boolean z2;
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (zzikVar != null && zzikVar.f48420a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.zzs.zzu().zzb.m46373d(z2, z, j) && zzikVar != null) {
            zzikVar.f48420a = false;
        }
    }

    /* renamed from: e */
    public final String m46243e(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 > 100) {
            this.zzs.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: j */
    public final zzik m46238j(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzik zzikVar = (zzik) this.f48423d.get(activity);
        if (zzikVar == null) {
            zzik zzikVar2 = new zzik(null, m46243e(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.f48423d.put(activity, zzikVar2);
            zzikVar = zzikVar2;
        }
        if (this.f48426g != null) {
            return this.f48426g;
        }
        return zzikVar;
    }

    /* renamed from: k */
    public final void m46237k(Activity activity, zzik zzikVar, boolean z) {
        zzik zzikVar2;
        zzik zzikVar3;
        String str;
        if (this.f48421b == null) {
            zzikVar2 = this.f48422c;
        } else {
            zzikVar2 = this.f48421b;
        }
        zzik zzikVar4 = zzikVar2;
        if (zzikVar.zzb == null) {
            if (activity != null) {
                str = m46243e(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            zzikVar3 = new zzik(zzikVar.zza, str, zzikVar.zzc, zzikVar.zze, zzikVar.zzf);
        } else {
            zzikVar3 = zzikVar;
        }
        this.f48422c = this.f48421b;
        this.f48421b = zzikVar3;
        this.zzs.zzaz().zzp(new Ox2(this, zzikVar3, zzikVar4, this.zzs.zzav().elapsedRealtime(), z));
    }

    @Override // p000.AbstractC19410cn2
    public final boolean zzf() {
        return false;
    }

    public final zzik zzi() {
        return this.f48421b;
    }

    @WorkerThread
    public final zzik zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzik zzikVar = this.zza;
        if (zzikVar != null) {
            return zzikVar;
        }
        return this.f48427h;
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f48423d.put(activity, new zzik(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.f48429j) {
            try {
                if (activity == this.f48424e) {
                    this.f48424e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.zzs.zzf().zzu()) {
            return;
        }
        this.f48423d.remove(activity);
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.f48429j) {
            this.f48428i = false;
            this.f48425f = true;
        }
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.f48421b = null;
            this.zzs.zzaz().zzp(new RunnableC6696D(this, elapsedRealtime));
            return;
        }
        zzik m46238j = m46238j(activity);
        this.f48422c = this.f48421b;
        this.f48421b = null;
        this.zzs.zzaz().zzp(new RunnableC6697E(this, m46238j, elapsedRealtime));
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.f48429j) {
            this.f48428i = true;
            if (activity != this.f48424e) {
                synchronized (this.f48429j) {
                    this.f48424e = activity;
                    this.f48425f = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.f48426g = null;
                    this.zzs.zzaz().zzp(new RunnableC21679py2(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.f48421b = this.f48426g;
            this.zzs.zzaz().zzp(new RunnableC6695C(this));
            return;
        }
        m46237k(activity, m46238j(activity), false);
        zzd zzd = this.zzs.zzd();
        zzd.zzs.zzaz().zzp(new RunnableC18046Mf2(zzd, zzd.zzs.zzav().elapsedRealtime()));
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzik zzikVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzikVar = (zzik) this.f48423d.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzikVar.zzc);
        bundle2.putString("name", zzikVar.zza);
        bundle2.putString("referrer_name", zzikVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzw(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            boolean r0 = r0.zzu()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.zza(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.zzik r0 = r3.f48421b
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.zza(r5)
            return
        L30:
            java.util.Map r1 = r3.f48423d
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.zza(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.m46243e(r6, r1)
        L54:
            java.lang.String r1 = r0.zzb
            boolean r1 = com.google.android.gms.measurement.internal.zzil.zza(r1, r6)
            java.lang.String r0 = r0.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzil.zza(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.zza(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.zzfy r1 = r3.zzs
            r1.zzf()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzl()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.zzfy r1 = r3.zzs
            r1.zzf()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzl()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzj()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.zzc(r2, r1, r6)
            com.google.android.gms.measurement.internal.zzik r0 = new com.google.android.gms.measurement.internal.zzik
            com.google.android.gms.measurement.internal.zzfy r1 = r3.zzs
            com.google.android.gms.measurement.internal.zzlh r1 = r1.zzv()
            long r1 = r1.zzq()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f48423d
            r5.put(r4, r0)
            r5 = 1
            r3.m46237k(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzis.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzis.zzx(android.os.Bundle, long):void");
    }
}
