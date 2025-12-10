package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzia;
import com.google.android.gms.internal.measurement.zznv;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfy implements InterfaceC21145ms2 {

    /* renamed from: F */
    public static volatile zzfy f48363F;

    /* renamed from: A */
    public volatile Boolean f48364A;

    /* renamed from: B */
    public volatile boolean f48365B;

    /* renamed from: C */
    public int f48366C;

    /* renamed from: E */
    public final long f48368E;

    /* renamed from: a */
    public final Context f48369a;

    /* renamed from: b */
    public final String f48370b;

    /* renamed from: c */
    public final String f48371c;

    /* renamed from: d */
    public final String f48372d;

    /* renamed from: e */
    public final boolean f48373e;

    /* renamed from: f */
    public final zzab f48374f;

    /* renamed from: g */
    public final zzag f48375g;

    /* renamed from: h */
    public final En2 f48376h;

    /* renamed from: i */
    public final zzeo f48377i;

    /* renamed from: j */
    public final zzfv f48378j;

    /* renamed from: k */
    public final zzki f48379k;

    /* renamed from: l */
    public final zzlh f48380l;

    /* renamed from: m */
    public final zzej f48381m;

    /* renamed from: n */
    public final Clock f48382n;

    /* renamed from: o */
    public final zzis f48383o;

    /* renamed from: p */
    public final zzid f48384p;

    /* renamed from: q */
    public final zzd f48385q;

    /* renamed from: r */
    public final zzih f48386r;

    /* renamed from: s */
    public final String f48387s;

    /* renamed from: t */
    public zzeh f48388t;

    /* renamed from: u */
    public zzjs f48389u;

    /* renamed from: v */
    public zzaq f48390v;

    /* renamed from: w */
    public zzef f48391w;

    /* renamed from: y */
    public Boolean f48393y;

    /* renamed from: z */
    public long f48394z;
    @VisibleForTesting
    protected Boolean zza;
    @VisibleForTesting
    protected Boolean zzb;

    /* renamed from: x */
    public boolean f48392x = false;

    /* renamed from: D */
    public final AtomicInteger f48367D = new AtomicInteger(0);

    public zzfy(zzhb zzhbVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(zzhbVar);
        Context context = zzhbVar.f48398a;
        zzab zzabVar = new zzab(context);
        this.f48374f = zzabVar;
        AbstractC18698Wj2.f7280a = zzabVar;
        this.f48369a = context;
        this.f48370b = zzhbVar.f48399b;
        this.f48371c = zzhbVar.f48400c;
        this.f48372d = zzhbVar.f48401d;
        this.f48373e = zzhbVar.f48405h;
        this.f48364A = zzhbVar.f48402e;
        this.f48387s = zzhbVar.f48407j;
        this.f48365B = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhbVar.f48404g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        zzia.zze(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f48382n = defaultClock;
        Long l = zzhbVar.f48406i;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.f48368E = currentTimeMillis;
        this.f48375g = new zzag(this);
        En2 en2 = new En2(this);
        en2.zzv();
        this.f48376h = en2;
        zzeo zzeoVar = new zzeo(this);
        zzeoVar.zzv();
        this.f48377i = zzeoVar;
        zzlh zzlhVar = new zzlh(this);
        zzlhVar.zzv();
        this.f48380l = zzlhVar;
        this.f48381m = new zzej(new C20804kt2(zzhbVar, this));
        this.f48385q = new zzd(this);
        zzis zzisVar = new zzis(this);
        zzisVar.zzb();
        this.f48383o = zzisVar;
        zzid zzidVar = new zzid(this);
        zzidVar.zzb();
        this.f48384p = zzidVar;
        zzki zzkiVar = new zzki(this);
        zzkiVar.zzb();
        this.f48379k = zzkiVar;
        zzih zzihVar = new zzih(this);
        zzihVar.zzv();
        this.f48386r = zzihVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzv();
        this.f48378j = zzfvVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhbVar.f48404g;
        z = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : true;
        if (context.getApplicationContext() instanceof Application) {
            zzid zzq = zzq();
            if (zzq.zzs.f48369a.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzs.f48369a.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new C6693A(zzq, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    zzq.zzs.zzay().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzay().zzk().zza("Application context is not an Application");
        }
        zzfvVar.zzp(new Fp2(this, zzhbVar));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m46278a(zzfy zzfyVar, zzhb zzhbVar) {
        zzfyVar.zzaz().zzg();
        zzfyVar.f48375g.m46356e();
        zzaq zzaqVar = new zzaq(zzfyVar);
        zzaqVar.zzv();
        zzfyVar.f48390v = zzaqVar;
        zzef zzefVar = new zzef(zzfyVar, zzhbVar.f48403f);
        zzefVar.zzb();
        zzfyVar.f48391w = zzefVar;
        zzeh zzehVar = new zzeh(zzfyVar);
        zzehVar.zzb();
        zzfyVar.f48388t = zzehVar;
        zzjs zzjsVar = new zzjs(zzfyVar);
        zzjsVar.zzb();
        zzfyVar.f48389u = zzjsVar;
        zzfyVar.f48380l.zzw();
        zzfyVar.f48376h.zzw();
        zzfyVar.f48391w.zzc();
        zzem zzi = zzfyVar.zzay().zzi();
        zzfyVar.f48375g.zzh();
        zzi.zzb("App measurement initialized, version", 73000L);
        zzfyVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzefVar.zzl();
        if (TextUtils.isEmpty(zzfyVar.f48370b)) {
            if (zzfyVar.zzv().m46090v(zzl)) {
                zzfyVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzfyVar.zzay().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzfyVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzfyVar.f48366C != zzfyVar.f48367D.get()) {
            zzfyVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzfyVar.f48366C), Integer.valueOf(zzfyVar.f48367D.get()));
        }
        zzfyVar.f48392x = true;
    }

    /* renamed from: f */
    public static final void m46273f() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: g */
    public static final void m46272g(AbstractC6736j abstractC6736j) {
        if (abstractC6736j != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: h */
    public static final void m46271h(AbstractC19410cn2 abstractC19410cn2) {
        if (abstractC19410cn2 != null) {
            if (abstractC19410cn2.m51303a()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC19410cn2.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: i */
    public static final void m46270i(AbstractC20285hs2 abstractC20285hs2) {
        if (abstractC20285hs2 != null) {
            if (abstractC20285hs2.m30739a()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC20285hs2.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzfy zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f48363F == null) {
            synchronized (zzfy.class) {
                try {
                    if (f48363F == null) {
                        f48363F = new zzfy(new zzhb(context, zzclVar, l));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f48363F);
            f48363F.f48364A = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f48363F);
        return f48363F;
    }

    /* renamed from: b */
    public final void m46277b() {
        this.f48367D.incrementAndGet();
    }

    /* renamed from: c */
    public final /* synthetic */ void m46276c(String str, int i, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th2);
        }
        if (th2 == null) {
            zzm().f1414q.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzay().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlh zzv = zzv();
                    zzfy zzfyVar = zzv.zzs;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzs.f48369a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f48384p.m46259c(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                        zzlh zzv2 = zzv();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = zzv2.zzs.f48369a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    zzv2.zzs.f48369a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                zzv2.zzs.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        }
                        return;
                    }
                    zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e2) {
                    zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                    return;
                }
            }
            zzay().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th2);
    }

    /* renamed from: d */
    public final void m46275d() {
        this.f48366C++;
    }

    /* renamed from: e */
    public final void m46274e(boolean z) {
        this.f48364A = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public final zzfv m46269j() {
        return this.f48378j;
    }

    @WorkerThread
    public final void zzE() {
        zzaz().zzg();
        m46270i(zzr());
        String zzl = zzh().zzl();
        Pair m68456c = zzm().m68456c(zzl);
        if (this.f48375g.zzr() && !((Boolean) m68456c.second).booleanValue() && !TextUtils.isEmpty((CharSequence) m68456c.first)) {
            zzih zzr = zzr();
            zzr.zzu();
            ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzs.f48369a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzlh zzv = zzv();
                zzh().zzs.f48375g.zzh();
                URL zzE = zzv.zzE(73000L, zzl, (String) m68456c.first, (-1) + zzm().f1415r.zza());
                if (zzE != null) {
                    zzih zzr2 = zzr();
                    zzfw zzfwVar = new zzfw(this);
                    zzr2.zzg();
                    zzr2.zzu();
                    Preconditions.checkNotNull(zzE);
                    Preconditions.checkNotNull(zzfwVar);
                    zzr2.zzs.zzaz().zzo(new RunnableC6694B(zzr2, zzl, zzE, null, null, zzfwVar, null));
                    return;
                }
                return;
            }
            zzay().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaz().zzg();
        this.f48365B = z;
    }

    @WorkerThread
    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzai zzaiVar;
        zzaz().zzg();
        zzai m68455d = zzm().m68455d();
        En2 zzm = zzm();
        zzfy zzfyVar = zzm.zzs;
        zzm.zzg();
        int i = 100;
        int i2 = zzm.m68457b().getInt("consent_source", 100);
        zzag zzagVar = this.f48375g;
        zzfy zzfyVar2 = zzagVar.zzs;
        Boolean m46357d = zzagVar.m46357d("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.f48375g;
        zzfy zzfyVar3 = zzagVar2.zzs;
        Boolean m46357d2 = zzagVar2.m46357d("google_analytics_default_allow_analytics_storage");
        if ((m46357d != null || m46357d2 != null) && zzm().m68449j(-10)) {
            zzaiVar = new zzai(m46357d, m46357d2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                zzq().zzS(zzai.zza, -10, this.f48368E);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().m68449j(30)) {
                zzaiVar = zzai.zza(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.zza)) {
                    i = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            zzq().zzS(zzaiVar, i, this.f48368E);
            m68455d = zzaiVar;
        }
        zzq().m46254h(m68455d);
        if (zzm().f1401d.zza() == 0) {
            zzay().zzj().zzb("Persisting first open", Long.valueOf(this.f48368E));
            zzm().f1401d.zzb(this.f48368E);
        }
        zzq().f48418l.m46083c();
        if (!zzM()) {
            if (zzJ()) {
                if (!zzv().m46091u("android.permission.INTERNET")) {
                    zzay().zzd().zza("App is missing INTERNET permission");
                }
                if (!zzv().m46091u("android.permission.ACCESS_NETWORK_STATE")) {
                    zzay().zzd().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.f48369a).isCallerInstantApp() && !this.f48375g.m46353h()) {
                    if (!zzlh.m46129A(this.f48369a)) {
                        zzay().zzd().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzlh.m46128B(this.f48369a, false)) {
                        zzay().zzd().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzay().zzd().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().m46328e())) {
                zzlh zzv = zzv();
                String zzm2 = zzh().zzm();
                En2 zzm3 = zzm();
                zzm3.zzg();
                String string = zzm3.m68457b().getString("gmp_app_id", null);
                String m46328e = zzh().m46328e();
                En2 zzm4 = zzm();
                zzm4.zzg();
                if (zzv.m46127C(zzm2, string, m46328e, zzm4.m68457b().getString("admob_app_id", null))) {
                    zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    En2 zzm5 = zzm();
                    zzm5.zzg();
                    Boolean m68454e = zzm5.m68454e();
                    SharedPreferences.Editor edit = zzm5.m68457b().edit();
                    edit.clear();
                    edit.apply();
                    if (m68454e != null) {
                        zzm5.m68453f(m68454e);
                    }
                    zzi().zzj();
                    this.f48389u.zzs();
                    this.f48389u.m46220q();
                    zzm().f1401d.zzb(this.f48368E);
                    zzm().f1403f.zzb(null);
                }
                En2 zzm6 = zzm();
                String zzm7 = zzh().zzm();
                zzm6.zzg();
                SharedPreferences.Editor edit2 = zzm6.m68457b().edit();
                edit2.putString("gmp_app_id", zzm7);
                edit2.apply();
                En2 zzm8 = zzm();
                String m46328e2 = zzh().m46328e();
                zzm8.zzg();
                SharedPreferences.Editor edit3 = zzm8.m68457b().edit();
                edit3.putString("admob_app_id", m46328e2);
                edit3.apply();
            }
            if (!zzm().m68455d().zzi(zzah.ANALYTICS_STORAGE)) {
                zzm().f1403f.zzb(null);
            }
            zzq().m46255g(zzm().f1403f.zza());
            zznv.zzc();
            if (this.f48375g.zzs(null, zzeb.zzac)) {
                try {
                    zzv().zzs.f48369a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().f1416s.zza())) {
                        zzay().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().f1416s.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().m46328e())) {
                boolean zzJ = zzJ();
                if (!zzm().m68451h() && !this.f48375g.zzv()) {
                    zzm().m68452g(!zzJ);
                }
                if (zzJ) {
                    zzq().zzz();
                }
                zzu().zza.m46372a();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().f1419v.zza());
            }
        }
        zzm().f1410m.zza(true);
    }

    @WorkerThread
    public final boolean zzI() {
        if (this.f48364A != null && this.f48364A.booleanValue()) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final boolean zzJ() {
        if (zza() == 0) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaz().zzg();
        return this.f48365B;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.f48370b);
    }

    @WorkerThread
    public final boolean zzM() {
        boolean z;
        if (this.f48392x) {
            zzaz().zzg();
            Boolean bool = this.f48393y;
            if (bool == null || this.f48394z == 0 || (!bool.booleanValue() && Math.abs(this.f48382n.elapsedRealtime() - this.f48394z) > 1000)) {
                this.f48394z = this.f48382n.elapsedRealtime();
                boolean z2 = true;
                if (zzv().m46091u("android.permission.INTERNET") && zzv().m46091u("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f48369a).isCallerInstantApp() || this.f48375g.m46353h() || (zzlh.m46129A(this.f48369a) && zzlh.m46128B(this.f48369a, false)))) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f48393y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().m46098n(zzh().zzm(), zzh().m46328e()) && TextUtils.isEmpty(zzh().m46328e())) {
                        z2 = false;
                    }
                    this.f48393y = Boolean.valueOf(z2);
                }
            }
            return this.f48393y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean zzN() {
        return this.f48373e;
    }

    @WorkerThread
    public final int zza() {
        zzaz().zzg();
        if (this.f48375g.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaz().zzg();
        if (!this.f48365B) {
            return 8;
        }
        Boolean m68454e = zzm().m68454e();
        if (m68454e != null) {
            if (m68454e.booleanValue()) {
                return 0;
            }
            return 3;
        }
        zzag zzagVar = this.f48375g;
        zzab zzabVar = zzagVar.zzs.f48374f;
        Boolean m46357d = zzagVar.m46357d("firebase_analytics_collection_enabled");
        if (m46357d != null) {
            if (m46357d.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.f48364A == null || this.f48364A.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final Context zzau() {
        return this.f48369a;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final Clock zzav() {
        return this.f48382n;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final zzab zzaw() {
        return this.f48374f;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final zzeo zzay() {
        m46270i(this.f48377i);
        return this.f48377i;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final zzfv zzaz() {
        m46270i(this.f48378j);
        return this.f48378j;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.f48385q;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.f48375g;
    }

    @Pure
    public final zzaq zzg() {
        m46270i(this.f48390v);
        return this.f48390v;
    }

    @Pure
    public final zzef zzh() {
        m46271h(this.f48391w);
        return this.f48391w;
    }

    @Pure
    public final zzeh zzi() {
        m46271h(this.f48388t);
        return this.f48388t;
    }

    @Pure
    public final zzej zzj() {
        return this.f48381m;
    }

    public final zzeo zzl() {
        zzeo zzeoVar = this.f48377i;
        if (zzeoVar == null || !zzeoVar.m30739a()) {
            return null;
        }
        return zzeoVar;
    }

    @Pure
    public final En2 zzm() {
        m46272g(this.f48376h);
        return this.f48376h;
    }

    @Pure
    public final zzid zzq() {
        m46271h(this.f48384p);
        return this.f48384p;
    }

    @Pure
    public final zzih zzr() {
        m46270i(this.f48386r);
        return this.f48386r;
    }

    @Pure
    public final zzis zzs() {
        m46271h(this.f48383o);
        return this.f48383o;
    }

    @Pure
    public final zzjs zzt() {
        m46271h(this.f48389u);
        return this.f48389u;
    }

    @Pure
    public final zzki zzu() {
        m46271h(this.f48379k);
        return this.f48379k;
    }

    @Pure
    public final zzlh zzv() {
        m46272g(this.f48380l);
        return this.f48380l;
    }

    @Pure
    public final String zzw() {
        return this.f48370b;
    }

    @Pure
    public final String zzx() {
        return this.f48371c;
    }

    @Pure
    public final String zzy() {
        return this.f48372d;
    }

    @Pure
    public final String zzz() {
        return this.f48387s;
    }
}
