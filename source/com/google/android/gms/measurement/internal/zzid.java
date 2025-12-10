package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class zzid extends AbstractC19410cn2 {

    /* renamed from: b */
    public zzgy f48408b;

    /* renamed from: c */
    public final Set f48409c;

    /* renamed from: d */
    public boolean f48410d;

    /* renamed from: e */
    public final AtomicReference f48411e;

    /* renamed from: f */
    public final Object f48412f;

    /* renamed from: g */
    public zzai f48413g;

    /* renamed from: h */
    public int f48414h;

    /* renamed from: i */
    public final AtomicLong f48415i;

    /* renamed from: j */
    public long f48416j;

    /* renamed from: k */
    public int f48417k;

    /* renamed from: l */
    public final zzs f48418l;

    /* renamed from: m */
    public final InterfaceC22587vE2 f48419m;
    @VisibleForTesting
    protected C6693A zza;
    @VisibleForTesting
    protected boolean zzc;

    public zzid(zzfy zzfyVar) {
        super(zzfyVar);
        this.f48409c = new CopyOnWriteArraySet();
        this.f48412f = new Object();
        this.zzc = true;
        this.f48419m = new C20810kv2(this);
        this.f48411e = new AtomicReference();
        this.f48413g = new zzai(null, null);
        this.f48414h = 100;
        this.f48416j = -1L;
        this.f48417k = 100;
        this.f48415i = new AtomicLong(0L);
        this.f48418l = new zzs(zzfyVar);
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m46250l(zzid zzidVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i < 2) {
                zzah zzahVar = zzahVarArr[i];
                if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        boolean zzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (!z && !zzl) {
            return;
        }
        zzidVar.zzs.zzh().m46326g();
    }

    /* renamed from: m */
    public static /* synthetic */ void m46249m(zzid zzidVar, zzai zzaiVar, int i, long j, boolean z, boolean z2) {
        zzidVar.zzg();
        zzidVar.zza();
        if (j <= zzidVar.f48416j && zzai.zzj(zzidVar.f48417k, i)) {
            zzidVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        En2 zzm = zzidVar.zzs.zzm();
        zzfy zzfyVar = zzm.zzs;
        zzm.zzg();
        if (zzm.m68449j(i)) {
            SharedPreferences.Editor edit = zzm.m68457b().edit();
            edit.putString("consent_settings", zzaiVar.zzh());
            edit.putInt("consent_source", i);
            edit.apply();
            zzidVar.f48416j = j;
            zzidVar.f48417k = i;
            zzidVar.zzs.zzt().zzF(z);
            if (z2) {
                zzidVar.zzs.zzt().zzu(new AtomicReference());
                return;
            }
            return;
        }
        zzidVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final /* synthetic */ void m46260b(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().f1419v.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().f1419v.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().m46089w(obj)) {
                    this.zzs.zzv().m46101k(this.f48419m, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlh.m46087y(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlh zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.m46094r("param", str, 100, obj)) {
                    this.zzs.zzv().m46100l(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            int i = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i++;
                if (i > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzs.zzv().m46101k(this.f48419m, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().f1419v.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    /* renamed from: c */
    public final void m46259c(String str, String str2, Bundle bundle) {
        zzg();
        m46258d(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    /* renamed from: d */
    public final void m46258d(String str, String str2, long j, Bundle bundle) {
        boolean z;
        zzg();
        if (this.f48408b == null || zzlh.m46087y(str2)) {
            z = true;
        } else {
            z = false;
        }
        zzI(str, str2, j, bundle, true, z, true, null);
    }

    /* renamed from: e */
    public final void m46257e(long j, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzki zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.m46376a();
        zzoz.zzc();
        if (this.zzs.zzf().zzs(null, zzeb.zzas)) {
            this.zzs.zzh().m46326g();
        }
        boolean zzJ = this.zzs.zzJ();
        En2 zzm = this.zzs.zzm();
        zzm.f1401d.zzb(j);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().f1416s.zza())) {
            zzm.f1416s.zzb(null);
        }
        zzoe.zzc();
        zzag zzf = zzm.zzs.zzf();
        zzea zzeaVar = zzeb.zzad;
        if (zzf.zzs(null, zzeaVar)) {
            zzm.f1411n.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.m68452g(!zzJ);
        }
        zzm.f1417t.zzb(null);
        zzm.f1418u.zzb(0L);
        zzm.f1419v.zzb(null);
        if (z) {
            this.zzs.zzt().zzC();
        }
        zzoe.zzc();
        if (this.zzs.zzf().zzs(null, zzeaVar)) {
            this.zzs.zzu().zza.m46372a();
        }
        this.zzc = !zzJ;
    }

    /* renamed from: f */
    public final void m46256f(String str, String str2, long j, Object obj) {
        this.zzs.zzaz().zzp(new RunnableC21839qu2(this, str, str2, obj, j));
    }

    /* renamed from: g */
    public final void m46255g(String str) {
        this.f48411e.set(str);
    }

    /* renamed from: h */
    public final void m46254h(zzai zzaiVar) {
        boolean z;
        Boolean bool;
        zzg();
        if ((zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzs.zzt().m46234c()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.zzs.zzK()) {
            this.zzs.zzG(z);
            En2 zzm = this.zzs.zzm();
            zzfy zzfyVar = zzm.zzs;
            zzm.zzg();
            if (zzm.m68457b().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(zzm.m68457b().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                m46252j(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m46253i(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L37
            r4 = 0
            goto L38
        L37:
            r4 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzfy r0 = r8.zzs
            En2 r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzfc r0 = r0.f1409l
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4a
            java.lang.String r11 = "true"
        L4a:
            r0.zzb(r11)
            r6 = r10
        L4e:
            r3 = r1
            goto L63
        L50:
            if (r11 != 0) goto L61
            com.google.android.gms.measurement.internal.zzfy r10 = r8.zzs
            En2 r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfc r10 = r10.f1409l
            java.lang.String r0 = "unset"
            r10.zzb(r0)
            r6 = r11
            goto L4e
        L61:
            r3 = r10
            r6 = r11
        L63:
            com.google.android.gms.measurement.internal.zzfy r10 = r8.zzs
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L7b
            com.google.android.gms.measurement.internal.zzfy r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzeo r9 = r9.zzay()
            com.google.android.gms.measurement.internal.zzem r9 = r9.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L7b:
            com.google.android.gms.measurement.internal.zzfy r10 = r8.zzs
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.zzlc r10 = new com.google.android.gms.measurement.internal.zzlc
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfy r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzjs r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzid.m46253i(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: j */
    public final void m46252j(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().m68453f(bool);
        if (z) {
            En2 zzm = this.zzs.zzm();
            zzfy zzfyVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.m68457b().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.zzs.zzK() && (bool == null || bool.booleanValue())) {
            return;
        }
        m46251k();
    }

    /* renamed from: k */
    public final void m46251k() {
        long j;
        zzg();
        String zza = this.zzs.zzm().f1409l.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                m46253i("app", "_npa", null, this.zzs.zzav().currentTimeMillis());
            } else {
                if (true != "true".equals(zza)) {
                    j = 0;
                } else {
                    j = 1;
                }
                m46253i("app", "_npa", Long.valueOf(j), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (this.zzs.zzJ() && this.zzc) {
            this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzz();
            zzoe.zzc();
            if (this.zzs.zzf().zzs(null, zzeb.zzad)) {
                this.zzs.zzu().zza.m46372a();
            }
            this.zzs.zzaz().zzp(new Wt2(this));
            return;
        }
        this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
        this.zzs.zzt().zzI();
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new RunnableC6745o(this, bundle2));
    }

    public final void zzB() {
        if ((this.zzs.zzau().getApplicationContext() instanceof Application) && this.zza != null) {
            ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3;
        Bundle bundle2;
        boolean z3;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != FirebaseAnalytics.Event.SCREEN_VIEW && (str2 == null || !str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            if (!z2 || this.f48408b == null || zzlh.m46087y(str2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzM(str3, str2, j, bundle2, z2, z3, z, null);
            return;
        }
        this.zzs.zzs().zzx(bundle2, j);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfy.m46273f();
        zzM(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    public final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        long j2;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (this.zzs.zzJ()) {
            List m46327f = this.zzs.zzh().m46327f();
            if (m46327f != null && !m46327f.contains(str2)) {
                this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f48410d) {
                this.f48410d = true;
                try {
                    if (!this.zzs.zzN()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                    } catch (Exception e) {
                        this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
                }
            }
            if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
                this.zzs.zzaw();
                m46253i(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
            }
            this.zzs.zzaw();
            if (z && zzlh.zzal(str2)) {
                this.zzs.zzv().m46103i(bundle, this.zzs.zzm().f1419v.zza());
            }
            if (!z3) {
                this.zzs.zzaw();
                if (!"_iap".equals(str2)) {
                    zzlh zzv = this.zzs.zzv();
                    int i = 2;
                    if (zzv.m46092t("event", str2)) {
                        if (zzv.m46096p("event", zzgv.zza, zzgv.zzb, str2)) {
                            zzv.zzs.zzf();
                            if (zzv.m46097o("event", 40, str2)) {
                                i = 0;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    if (i != 0) {
                        this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                        zzlh zzv2 = this.zzs.zzv();
                        this.zzs.zzf();
                        this.zzs.zzv().m46101k(this.f48419m, null, i, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            this.zzs.zzaw();
            zzik zzj = this.zzs.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.f48420a = true;
            }
            zzlh.zzK(zzj, bundle, z && !z3);
            boolean equals = "am".equals(str);
            boolean m46087y = zzlh.m46087y(str2);
            if (!z || this.f48408b == null || m46087y) {
                z4 = equals;
            } else if (!equals) {
                this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.f48408b);
                this.f48408b.interceptEvent(str, str2, bundle, j);
                return;
            } else {
                z4 = true;
            }
            if (this.zzs.zzM()) {
                int zzh = this.zzs.zzv().zzh(str2);
                if (zzh != 0) {
                    this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzlh zzv3 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().m46101k(this.f48419m, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle m46112R = this.zzs.zzv().m46112R(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
                Preconditions.checkNotNull(m46112R);
                this.zzs.zzaw();
                if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                    C6729f0 c6729f0 = this.zzs.zzu().zzb;
                    long elapsedRealtime = c6729f0.f48167d.zzs.zzav().elapsedRealtime();
                    long j3 = elapsedRealtime - c6729f0.f48165b;
                    c6729f0.f48165b = elapsedRealtime;
                    if (j3 > 0) {
                        this.zzs.zzv().m46105g(m46112R, j3);
                    }
                }
                zznv.zzc();
                if (this.zzs.zzf().zzs(null, zzeb.zzac)) {
                    if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str2)) {
                        zzlh zzv4 = this.zzs.zzv();
                        String string = m46112R.getString("_ffr");
                        if (Strings.isEmptyOrWhitespace(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!zzlf.zza(string, zzv4.zzs.zzm().f1416s.zza())) {
                            zzv4.zzs.zzm().f1416s.zzb(string);
                        } else {
                            zzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String zza = this.zzs.zzv().zzs.zzm().f1416s.zza();
                        if (!TextUtils.isEmpty(zza)) {
                            m46112R.putString("_ffr", zza);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(m46112R);
                if (this.zzs.zzm().f1411n.zza() > 0 && this.zzs.zzm().m68450i(j) && this.zzs.zzm().f1413p.zzb()) {
                    this.zzs.zzay().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j2 = 0;
                    m46253i(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", null, this.zzs.zzav().currentTimeMillis());
                    m46253i(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, this.zzs.zzav().currentTimeMillis());
                    m46253i(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, this.zzs.zzav().currentTimeMillis());
                } else {
                    str4 = "_ae";
                    j2 = 0;
                }
                if (m46112R.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                    this.zzs.zzay().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.zzs.zzu().zza.m46371b(j, true);
                }
                ArrayList arrayList2 = new ArrayList(m46112R.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str5 = (String) arrayList2.get(i2);
                    if (str5 != null) {
                        this.zzs.zzv();
                        Object obj = m46112R.get(str5);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            m46112R.putParcelableArray(str5, bundleArr);
                        }
                    }
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    Bundle bundle2 = (Bundle) arrayList.get(i3);
                    String str6 = i3 != 0 ? "_ep" : str2;
                    bundle2.putString("_o", str);
                    if (z2) {
                        bundle2 = this.zzs.zzv().m46113Q(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.zzs.zzt().zzA(new zzaw(str6, new zzau(bundle3), str, j), str3);
                    if (!z4) {
                        for (zzgz zzgzVar : this.f48409c) {
                            zzgzVar.onEvent(str, str2, new Bundle(bundle3), j);
                        }
                    }
                    i3++;
                }
                this.zzs.zzaw();
                if (this.zzs.zzs().zzj(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.zzs.zzu().zzb.m46373d(true, true, this.zzs.zzav().elapsedRealtime());
                return;
            }
            return;
        }
        this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void zzJ(zzgz zzgzVar) {
        zza();
        Preconditions.checkNotNull(zzgzVar);
        if (!this.f48409c.add(zzgzVar)) {
            this.zzs.zzay().zzk().zza("OnEventListener already registered");
        }
    }

    public final void zzK(long j) {
        this.f48411e.set(null);
        this.zzs.zzaz().zzp(new RunnableC6742m(this, j));
    }

    public final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new RunnableC20463iu2(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzs.zzay().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgu.zza(bundle2, "app_id", String.class, null);
        zzgu.zza(bundle2, "origin", String.class, null);
        zzgu.zza(bundle2, "name", String.class, null);
        zzgu.zza(bundle2, "value", Object.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().m46116N(string) == 0) {
            if (this.zzs.zzv().m46119K(string, obj) == 0) {
                Object m46109c = this.zzs.zzv().m46109c(string, obj);
                if (m46109c == null) {
                    this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
                    return;
                }
                zzgu.zzb(bundle2, m46109c);
                long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    this.zzs.zzf();
                    if (j2 > 15552000000L || j2 < 1) {
                        this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j2));
                        return;
                    }
                }
                long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                this.zzs.zzf();
                if (j3 <= 15552000000L && j3 >= 1) {
                    this.zzs.zzaz().zzp(new RunnableC6744n(this, bundle2));
                    return;
                } else {
                    this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j3));
                    return;
                }
            }
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
    }

    public final void zzR(Bundle bundle, int i, long j) {
        zza();
        String zzg = zzai.zzg(bundle);
        if (zzg != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i, j);
    }

    public final void zzS(zzai zzaiVar, int i, long j) {
        zzai zzaiVar2;
        boolean z;
        boolean z2;
        boolean z3;
        zzai zzaiVar3 = zzaiVar;
        zza();
        if (i != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.f48412f) {
            try {
                zzaiVar2 = this.f48413g;
                z = false;
                if (zzai.zzj(i, this.f48414h)) {
                    z2 = zzaiVar3.zzk(this.f48413g);
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (zzaiVar3.zzi(zzahVar) && !this.f48413g.zzi(zzahVar)) {
                        z = true;
                    }
                    zzaiVar3 = zzaiVar3.zzd(this.f48413g);
                    this.f48413g = zzaiVar3;
                    this.f48414h = i;
                    z3 = z;
                    z = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
            return;
        }
        long andIncrement = this.f48415i.getAndIncrement();
        if (z2) {
            this.f48411e.set(null);
            this.zzs.zzaz().zzq(new RunnableC6753w(this, zzaiVar3, j, i, andIncrement, z3, zzaiVar2));
            return;
        }
        RunnableC6754x runnableC6754x = new RunnableC6754x(this, zzaiVar3, i, andIncrement, z3, zzaiVar2);
        if (i != 30 && i != -10) {
            this.zzs.zzaz().zzp(runnableC6754x);
        } else {
            this.zzs.zzaz().zzq(runnableC6754x);
        }
    }

    @WorkerThread
    public final void zzT(zzgy zzgyVar) {
        zzgy zzgyVar2;
        boolean z;
        zzg();
        zza();
        if (zzgyVar != null && zzgyVar != (zzgyVar2 = this.f48408b)) {
            if (zzgyVar2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "EventInterceptor already set.");
        }
        this.f48408b = zzgyVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new Ov2(this, bool));
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        String str3;
        int i;
        int length;
        int i2;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (z) {
            i = this.zzs.zzv().m46116N(str2);
        } else {
            zzlh zzv = this.zzs.zzv();
            if (zzv.m46092t("user property", str2)) {
                if (!zzv.m46096p("user property", zzgx.zza, null, str2)) {
                    i = 15;
                } else {
                    zzv.zzs.zzf();
                    if (zzv.m46097o("user property", 24, str2)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            zzlh zzv2 = this.zzs.zzv();
            this.zzs.zzf();
            String zzD = zzv2.zzD(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            } else {
                i2 = 0;
            }
            this.zzs.zzv().m46101k(this.f48419m, null, i, "_ev", zzD, i2);
        } else if (obj != null) {
            int m46119K = this.zzs.zzv().m46119K(str2, obj);
            if (m46119K != 0) {
                zzlh zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                String zzD2 = zzv3.zzD(str2, 24, true);
                if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                    length = 0;
                } else {
                    length = obj.toString().length();
                }
                this.zzs.zzv().m46101k(this.f48419m, null, m46119K, "_ev", zzD2, length);
                return;
            }
            Object m46109c = this.zzs.zzv().m46109c(str2, obj);
            if (m46109c != null) {
                m46256f(str3, str2, j, m46109c);
            }
        } else {
            m46256f(str3, str2, j, null);
        }
    }

    public final void zzZ(zzgz zzgzVar) {
        zza();
        Preconditions.checkNotNull(zzgzVar);
        if (!this.f48409c.remove(zzgzVar)) {
            this.zzs.zzay().zzk().zza("OnEventListener had not been registered");
        }
    }

    @Override // p000.AbstractC19410cn2
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().m46285e(atomicReference, 15000L, "boolean test flag value", new RunnableC6747q(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().m46285e(atomicReference, 15000L, "double test flag value", new RunnableC6752v(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().m46285e(atomicReference, 15000L, "int test flag value", new RunnableC6751u(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().m46285e(atomicReference, 15000L, "long test flag value", new RunnableC6750t(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.f48411e.get();
    }

    public final String zzp() {
        zzik zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzik zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().m46285e(atomicReference, 15000L, "String test flag value", new RunnableC6749s(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().m46285e(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get conditional user properties", new RunnableC6746p(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzlh.zzH(list);
    }

    public final List zzt(boolean z) {
        zza();
        this.zzs.zzay().zzj().zza("Getting user properties (FE)");
        if (!this.zzs.zzaz().zzs()) {
            this.zzs.zzaw();
            if (zzab.zza()) {
                this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzs.zzaz().m46285e(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get user properties", new RunnableC6740l(this, atomicReference, z));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            return list;
        }
        this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzab.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().m46285e(atomicReference, CoroutineLiveDataKt.DEFAULT_TIMEOUT, "get user properties", new RunnableC6748r(this, atomicReference, null, str, str2, z));
        List<zzlc> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzlc zzlcVar : list) {
            Object zza = zzlcVar.zza();
            if (zza != null) {
                arrayMap.put(zzlcVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzeb.zzX)) {
                zzag zzf = this.zzs.zzf();
                zzf.zzs.zzaw();
                Boolean m46357d = zzf.m46357d("google_analytics_deferred_deep_link_enabled");
                if (m46357d != null && m46357d.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzid zzidVar = zzid.this;
                            zzidVar.zzg();
                            if (!zzidVar.zzs.zzm().f1414q.zzb()) {
                                long zza = zzidVar.zzs.zzm().f1415r.zza();
                                zzidVar.zzs.zzm().f1415r.zzb(1 + zza);
                                zzidVar.zzs.zzf();
                                if (zza >= 5) {
                                    zzidVar.zzs.zzay().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zzidVar.zzs.zzm().f1414q.zza(true);
                                    return;
                                }
                                zzidVar.zzs.zzE();
                                return;
                            }
                            zzidVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            En2 zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.m68457b().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.m68457b().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.zzs.zzg().zzu();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    m46259c(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
                }
            }
        }
    }
}
