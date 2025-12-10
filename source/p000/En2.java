package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzex;
import com.google.android.gms.measurement.internal.zzey;
import com.google.android.gms.measurement.internal.zzez;
import com.google.android.gms.measurement.internal.zzfb;
import com.google.android.gms.measurement.internal.zzfc;
import com.google.android.gms.measurement.internal.zzfy;

/* renamed from: En2 */
/* loaded from: classes3.dex */
public final class En2 extends AbstractC20285hs2 {

    /* renamed from: w */
    public static final Pair f1398w = new Pair("", 0L);

    /* renamed from: b */
    public SharedPreferences f1399b;

    /* renamed from: c */
    public zzfb f1400c;

    /* renamed from: d */
    public final zzez f1401d;

    /* renamed from: e */
    public final zzez f1402e;

    /* renamed from: f */
    public final zzfc f1403f;

    /* renamed from: g */
    public String f1404g;

    /* renamed from: h */
    public boolean f1405h;

    /* renamed from: i */
    public long f1406i;

    /* renamed from: j */
    public final zzez f1407j;

    /* renamed from: k */
    public final zzex f1408k;

    /* renamed from: l */
    public final zzfc f1409l;

    /* renamed from: m */
    public final zzex f1410m;

    /* renamed from: n */
    public final zzez f1411n;

    /* renamed from: o */
    public boolean f1412o;

    /* renamed from: p */
    public final zzex f1413p;

    /* renamed from: q */
    public final zzex f1414q;

    /* renamed from: r */
    public final zzez f1415r;

    /* renamed from: s */
    public final zzfc f1416s;

    /* renamed from: t */
    public final zzfc f1417t;

    /* renamed from: u */
    public final zzez f1418u;

    /* renamed from: v */
    public final zzey f1419v;

    public En2(zzfy zzfyVar) {
        super(zzfyVar);
        this.f1407j = new zzez(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.f1408k = new zzex(this, "start_new_session", true);
        this.f1411n = new zzez(this, "last_pause_time", 0L);
        this.f1409l = new zzfc(this, "non_personalized_ads", null);
        this.f1410m = new zzex(this, "allow_remote_dynamite", false);
        this.f1401d = new zzez(this, "first_open_time", 0L);
        this.f1402e = new zzez(this, "app_install_time", 0L);
        this.f1403f = new zzfc(this, "app_instance_id", null);
        this.f1413p = new zzex(this, "app_backgrounded", false);
        this.f1414q = new zzex(this, "deep_link_retrieval_complete", false);
        this.f1415r = new zzez(this, "deep_link_retrieval_attempts", 0L);
        this.f1416s = new zzfc(this, "firebase_feature_rollouts", null);
        this.f1417t = new zzfc(this, "deferred_attribution_cache", null);
        this.f1418u = new zzez(this, "deferred_attribution_cache_timestamp", 0L);
        this.f1419v = new zzey(this, "default_event_parameters", null);
    }

    /* renamed from: b */
    public final SharedPreferences m68457b() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.f1399b);
        return this.f1399b;
    }

    /* renamed from: c */
    public final Pair m68456c(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.f1404g;
        if (str2 != null && elapsedRealtime < this.f1406i) {
            return new Pair(str2, Boolean.valueOf(this.f1405h));
        }
        this.f1406i = elapsedRealtime + this.zzs.zzf().zzi(str, zzeb.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.f1404g = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f1404g = id2;
            }
            this.f1405h = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e);
            this.f1404g = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f1404g, Boolean.valueOf(this.f1405h));
    }

    /* renamed from: d */
    public final zzai m68455d() {
        zzg();
        return zzai.zzb(m68457b().getString("consent_settings", "G1"));
    }

    /* renamed from: e */
    public final Boolean m68454e() {
        zzg();
        if (m68457b().contains("measurement_enabled")) {
            return Boolean.valueOf(m68457b().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: f */
    public final void m68453f(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = m68457b().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: g */
    public final void m68452g(boolean z) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m68457b().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: h */
    public final boolean m68451h() {
        SharedPreferences sharedPreferences = this.f1399b;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: i */
    public final boolean m68450i(long j) {
        if (j - this.f1407j.zza() > this.f1411n.zza()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m68449j(int i) {
        return zzai.zzj(i, m68457b().getInt("consent_source", 100));
    }

    @Override // p000.AbstractC20285hs2
    public final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f1399b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f1412o = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f1399b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzs.zzf();
        this.f1400c = new zzfb(this, "health_monitor", Math.max(0L, ((Long) zzeb.zzb.zza(null)).longValue()), null);
    }

    @Override // p000.AbstractC20285hs2
    public final boolean zzf() {
        return true;
    }
}
