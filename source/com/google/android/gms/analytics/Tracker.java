package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzft;
import com.google.android.gms.internal.gtm.zzfu;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

@VisibleForTesting
/* loaded from: classes3.dex */
public class Tracker extends zzbu {

    /* renamed from: a */
    public boolean f44387a;

    /* renamed from: b */
    public final Map f44388b;

    /* renamed from: c */
    public final Map f44389c;

    /* renamed from: d */
    public final zzfb f44390d;

    /* renamed from: e */
    public final C21401oK2 f44391e;

    /* renamed from: f */
    public ExceptionReporter f44392f;

    /* renamed from: g */
    public zzft f44393g;

    public Tracker(zzbx zzbxVar, String str, zzfb zzfbVar) {
        super(zzbxVar);
        HashMap hashMap = new HashMap();
        this.f44388b = hashMap;
        this.f44389c = new HashMap();
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f44390d = new zzfb(60, BuyDolAddBankAccountFragment.WAIT_MILLI, "tracking", zzC());
        this.f44391e = new C21401oK2(this, zzbxVar);
    }

    /* renamed from: b */
    public static void m48758b(Map map, Map map2) {
        Preconditions.checkNotNull(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String m48745s = m48745s(entry);
            if (m48745s != null) {
                map2.put(m48745s, (String) entry.getValue());
            }
        }
    }

    /* renamed from: s */
    public static String m48745s(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (str.startsWith("&") && str.length() >= 2) {
            return ((String) entry.getKey()).substring(1);
        }
        return null;
    }

    public void enableAdvertisingIdCollection(boolean z) {
        this.f44387a = z;
    }

    public void enableAutoActivityTracking(boolean z) {
        this.f44391e.m25931g(z);
    }

    public void enableExceptionReporting(boolean z) {
        boolean z2;
        synchronized (this) {
            try {
                ExceptionReporter exceptionReporter = this.f44392f;
                if (exceptionReporter == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 == z) {
                    return;
                }
                if (z) {
                    ExceptionReporter exceptionReporter2 = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), zzo());
                    this.f44392f = exceptionReporter2;
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter2);
                    zzN("Uncaught exceptions will be reported to Google Analytics");
                } else {
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter.m48764a());
                    zzN("Uncaught exceptions will not be reported to Google Analytics");
                }
            } finally {
            }
        }
    }

    @Nullable
    public String get(@Nullable String str) {
        zzV();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f44388b.containsKey(str)) {
            return (String) this.f44388b.get(str);
        }
        if (str.equals("&ul")) {
            return zzfu.zzd(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzv().zzb();
        }
        if (str.equals("&sr")) {
            return zzx().zzb();
        }
        if (str.equals("&aid")) {
            return zzu().zza().zzd();
        }
        if (str.equals("&an")) {
            return zzu().zza().zzf();
        }
        if (str.equals("&av")) {
            return zzu().zza().zzg();
        }
        if (!str.equals("&aiid")) {
            return null;
        }
        return zzu().zza().zze();
    }

    /* renamed from: r */
    public final void m48746r(zzft zzftVar) {
        boolean z;
        boolean z2;
        zzN("Loading Tracker config values");
        this.f44393g = zzftVar;
        String str = zzftVar.zza;
        if (str != null) {
            set("&tid", str);
            zzO("trackingId loaded", str);
        }
        double d = zzftVar.zzb;
        if (d >= 0.0d) {
            String d2 = Double.toString(d);
            set("&sf", d2);
            zzO("Sample frequency loaded", d2);
        }
        int i = zzftVar.zzc;
        if (i >= 0) {
            setSessionTimeout(i);
            zzO("Session timeout loaded", Integer.valueOf(i));
        }
        int i2 = zzftVar.zzd;
        boolean z3 = false;
        if (i2 != -1) {
            if (1 != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            enableAutoActivityTracking(z2);
            zzO("Auto activity tracking loaded", Boolean.valueOf(z2));
        }
        int i3 = zzftVar.zze;
        if (i3 != -1) {
            if (i3 != 0) {
                set("&aip", "1");
            }
            if (1 != i3) {
                z = false;
            } else {
                z = true;
            }
            zzO("Anonymize ip loaded", Boolean.valueOf(z));
        }
        if (zzftVar.zzf == 1) {
            z3 = true;
        }
        enableExceptionReporting(z3);
    }

    public void send(@NonNull Map<String, String> map) {
        boolean z;
        long currentTimeMillis = zzC().currentTimeMillis();
        if (zzp().getAppOptOut()) {
            zzE("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean isDryRunEnabled = zzp().isDryRunEnabled();
        HashMap hashMap = new HashMap();
        m48758b(this.f44388b, hashMap);
        m48758b(map, hashMap);
        String str = (String) this.f44388b.get("useSecure");
        int i = 1;
        if (str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1") || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0"))) {
            z = true;
        } else {
            z = false;
        }
        Map map2 = this.f44389c;
        Preconditions.checkNotNull(hashMap);
        for (Map.Entry entry : map2.entrySet()) {
            String m48745s = m48745s(entry);
            if (m48745s != null && !hashMap.containsKey(m48745s)) {
                hashMap.put(m48745s, (String) entry.getValue());
            }
        }
        this.f44389c.clear();
        String str2 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str2)) {
            zzz().zzc(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            boolean z2 = this.f44387a;
            synchronized (this) {
                try {
                    if (!"screenview".equalsIgnoreCase(str2)) {
                        if (!"pageview".equalsIgnoreCase(str2)) {
                            if (!"appview".equalsIgnoreCase(str2)) {
                                if (TextUtils.isEmpty(str2)) {
                                }
                            }
                        }
                    }
                    String str4 = (String) this.f44388b.get("&a");
                    Preconditions.checkNotNull(str4);
                    int parseInt = Integer.parseInt(str4) + 1;
                    if (parseInt < Integer.MAX_VALUE) {
                        i = parseInt;
                    }
                    this.f44388b.put("&a", Integer.toString(i));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzq().zzi(new RunnableC18987aK2(this, hashMap, z2, str2, currentTimeMillis, isDryRunEnabled, z, str3));
            return;
        }
        zzz().zzc(hashMap, "Missing tracking id parameter");
    }

    public void set(@NonNull String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f44388b.put(str, str2);
    }

    public void setAnonymizeIp(boolean z) {
        set("&aip", zzfu.zzc(z));
    }

    public void setAppId(@NonNull String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(@NonNull String str) {
        set("&aiid", str);
    }

    public void setAppName(@NonNull String str) {
        set("&an", str);
    }

    public void setAppVersion(@NonNull String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(@Nullable Uri uri) {
        if (uri != null && !uri.isOpaque()) {
            String queryParameter = uri.getQueryParameter("referrer");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            Uri parse = Uri.parse("http://hostname/?".concat(String.valueOf(queryParameter)));
            String queryParameter2 = parse.getQueryParameter("utm_id");
            if (queryParameter2 != null) {
                this.f44389c.put("&ci", queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("anid");
            if (queryParameter3 != null) {
                this.f44389c.put("&anid", queryParameter3);
            }
            String queryParameter4 = parse.getQueryParameter("utm_campaign");
            if (queryParameter4 != null) {
                this.f44389c.put("&cn", queryParameter4);
            }
            String queryParameter5 = parse.getQueryParameter("utm_content");
            if (queryParameter5 != null) {
                this.f44389c.put("&cc", queryParameter5);
            }
            String queryParameter6 = parse.getQueryParameter("utm_medium");
            if (queryParameter6 != null) {
                this.f44389c.put("&cm", queryParameter6);
            }
            String queryParameter7 = parse.getQueryParameter("utm_source");
            if (queryParameter7 != null) {
                this.f44389c.put("&cs", queryParameter7);
            }
            String queryParameter8 = parse.getQueryParameter("utm_term");
            if (queryParameter8 != null) {
                this.f44389c.put("&ck", queryParameter8);
            }
            String queryParameter9 = parse.getQueryParameter("dclid");
            if (queryParameter9 != null) {
                this.f44389c.put("&dclid", queryParameter9);
            }
            String queryParameter10 = parse.getQueryParameter("gclid");
            if (queryParameter10 != null) {
                this.f44389c.put("&gclid", queryParameter10);
            }
            String queryParameter11 = parse.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (queryParameter11 != null) {
                this.f44389c.put("&aclid", queryParameter11);
            }
        }
    }

    public void setClientId(@NonNull String str) {
        set("&cid", str);
    }

    public void setEncoding(@NonNull String str) {
        set("&de", str);
    }

    public void setHostname(@NonNull String str) {
        set("&dh", str);
    }

    public void setLanguage(@NonNull String str) {
        set("&ul", str);
    }

    public void setLocation(@NonNull String str) {
        set("&dl", str);
    }

    public void setPage(@NonNull String str) {
        set("&dp", str);
    }

    public void setReferrer(@NonNull String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d) {
        set("&sf", Double.toString(d));
    }

    public void setScreenColors(@NonNull String str) {
        set("&sd", str);
    }

    public void setScreenName(@Nullable String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i, int i2) {
        if (i < 0 && i2 < 0) {
            zzQ("Invalid width or height. The values should be non-negative.");
            return;
        }
        set("&sr", i + "x" + i2);
    }

    public void setSessionTimeout(long j) {
        this.f44391e.m25930i(j * 1000);
    }

    public void setTitle(@NonNull String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z) {
        set("useSecure", zzfu.zzc(z));
    }

    public void setViewportSize(@NonNull String str) {
        set("&vp", str);
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        this.f44391e.zzW();
        String zza = zzB().zza();
        if (zza != null) {
            set("&an", zza);
        }
        String zzb = zzB().zzb();
        if (zzb != null) {
            set("&av", zzb);
        }
    }
}
