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

/* renamed from: Bo2 */
/* loaded from: classes3.dex */
public final class Bo2 extends AbstractC19823et2 {

    /* renamed from: w */
    public static final Pair f516w = new Pair("", 0L);

    /* renamed from: b */
    public SharedPreferences f517b;

    /* renamed from: c */
    public zzfb f518c;

    /* renamed from: d */
    public final zzez f519d;

    /* renamed from: e */
    public final zzez f520e;

    /* renamed from: f */
    public final zzfc f521f;

    /* renamed from: g */
    public String f522g;

    /* renamed from: h */
    public boolean f523h;

    /* renamed from: i */
    public long f524i;

    /* renamed from: j */
    public final zzez f525j;

    /* renamed from: k */
    public final zzex f526k;

    /* renamed from: l */
    public final zzfc f527l;

    /* renamed from: m */
    public final zzex f528m;

    /* renamed from: n */
    public final zzez f529n;

    /* renamed from: o */
    public boolean f530o;

    /* renamed from: p */
    public final zzex f531p;

    /* renamed from: q */
    public final zzex f532q;

    /* renamed from: r */
    public final zzez f533r;

    /* renamed from: s */
    public final zzfc f534s;

    /* renamed from: t */
    public final zzfc f535t;

    /* renamed from: u */
    public final zzez f536u;

    /* renamed from: v */
    public final zzey f537v;

    public Bo2(zzfy zzfyVar) {
        super(zzfyVar);
        this.f525j = new zzez(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.f526k = new zzex(this, "start_new_session", true);
        this.f529n = new zzez(this, "last_pause_time", 0L);
        this.f527l = new zzfc(this, "non_personalized_ads", null);
        this.f528m = new zzex(this, "allow_remote_dynamite", false);
        this.f519d = new zzez(this, "first_open_time", 0L);
        this.f520e = new zzez(this, "app_install_time", 0L);
        this.f521f = new zzfc(this, "app_instance_id", null);
        this.f531p = new zzex(this, "app_backgrounded", false);
        this.f532q = new zzex(this, "deep_link_retrieval_complete", false);
        this.f533r = new zzez(this, "deep_link_retrieval_attempts", 0L);
        this.f534s = new zzfc(this, "firebase_feature_rollouts", null);
        this.f535t = new zzfc(this, "deferred_attribution_cache", null);
        this.f536u = new zzez(this, "deferred_attribution_cache_timestamp", 0L);
        this.f537v = new zzey(this, "default_event_parameters", null);
    }

    /* renamed from: b */
    public final SharedPreferences m69074b() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.f517b);
        return this.f517b;
    }

    /* renamed from: c */
    public final Pair m69073c(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.f522g;
        if (str2 != null && elapsedRealtime < this.f524i) {
            return new Pair(str2, Boolean.valueOf(this.f523h));
        }
        this.f524i = elapsedRealtime + this.zzs.zzf().zzi(str, zzeb.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.f522g = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f522g = id2;
            }
            this.f523h = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e);
            this.f522g = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f522g, Boolean.valueOf(this.f523h));
    }

    /* renamed from: d */
    public final zzai m69072d() {
        zzg();
        return zzai.zzb(m69074b().getString("consent_settings", "G1"));
    }

    /* renamed from: e */
    public final Boolean m69071e() {
        zzg();
        if (m69074b().contains("measurement_enabled")) {
            return Boolean.valueOf(m69074b().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: f */
    public final void m69070f(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = m69074b().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: g */
    public final void m69069g(boolean z) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m69074b().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: h */
    public final boolean m69068h() {
        SharedPreferences sharedPreferences = this.f517b;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: i */
    public final boolean m69067i(long j) {
        if (j - this.f525j.zza() > this.f529n.zza()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m69066j(int i) {
        return zzai.zzj(i, m69074b().getInt("consent_source", 100));
    }

    @Override // p000.AbstractC19823et2
    public final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f517b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f530o = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f517b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzs.zzf();
        this.f518c = new zzfb(this, "health_monitor", Math.max(0L, ((Long) zzeb.zzb.zza(null)).longValue()), null);
    }

    @Override // p000.AbstractC19823et2
    public final boolean zzf() {
        return true;
    }
}