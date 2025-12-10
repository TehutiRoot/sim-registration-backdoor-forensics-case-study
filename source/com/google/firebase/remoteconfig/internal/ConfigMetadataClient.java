package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

/* loaded from: classes4.dex */
public class ConfigMetadataClient {
    @VisibleForTesting
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = -1;

    /* renamed from: e */
    public static final Date f56406e = new Date(-1);

    /* renamed from: f */
    public static final Date f56407f = new Date(-1);

    /* renamed from: a */
    public final SharedPreferences f56408a;

    /* renamed from: b */
    public final Object f56409b = new Object();

    /* renamed from: c */
    public final Object f56410c = new Object();

    /* renamed from: d */
    public final Object f56411d = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigMetadataClient$a */
    /* loaded from: classes4.dex */
    public static class C8634a {

        /* renamed from: a */
        public int f56412a;

        /* renamed from: b */
        public Date f56413b;

        public C8634a(int i, Date date) {
            this.f56412a = i;
            this.f56413b = date;
        }

        /* renamed from: a */
        public Date m37692a() {
            return this.f56413b;
        }

        /* renamed from: b */
        public int m37691b() {
            return this.f56412a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigMetadataClient$b */
    /* loaded from: classes4.dex */
    public static class C8635b {

        /* renamed from: a */
        public int f56414a;

        /* renamed from: b */
        public Date f56415b;

        public C8635b(int i, Date date) {
            this.f56414a = i;
            this.f56415b = date;
        }

        /* renamed from: a */
        public Date m37690a() {
            return this.f56415b;
        }

        /* renamed from: b */
        public int m37689b() {
            return this.f56414a;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.f56408a = sharedPreferences;
    }

    /* renamed from: a */
    public C8634a m37706a() {
        C8634a c8634a;
        synchronized (this.f56410c) {
            c8634a = new C8634a(this.f56408a.getInt("num_failed_fetches", 0), new Date(this.f56408a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return c8634a;
    }

    /* renamed from: b */
    public String m37705b() {
        return this.f56408a.getString("last_fetch_etag", null);
    }

    /* renamed from: c */
    public Date m37704c() {
        return new Date(this.f56408a.getLong("last_fetch_time_in_millis", -1L));
    }

    @WorkerThread
    public void clear() {
        synchronized (this.f56409b) {
            this.f56408a.edit().clear().commit();
        }
    }

    /* renamed from: d */
    public long m37703d() {
        return this.f56408a.getLong("last_template_version", 0L);
    }

    /* renamed from: e */
    public C8635b m37702e() {
        C8635b c8635b;
        synchronized (this.f56411d) {
            c8635b = new C8635b(this.f56408a.getInt("num_failed_realtime_streams", 0), new Date(this.f56408a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return c8635b;
    }

    /* renamed from: f */
    public void m37701f() {
        m37699h(0, f56407f);
    }

    /* renamed from: g */
    public void m37700g() {
        m37696k(0, f56407f);
    }

    public long getFetchTimeoutInSeconds() {
        return this.f56408a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfoImpl build;
        synchronized (this.f56409b) {
            long j = this.f56408a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.f56408a.getInt("last_fetch_status", 0);
            build = FirebaseRemoteConfigInfoImpl.m37661a().m37659b(i).withLastSuccessfulFetchTimeInMillis(j).m37660a(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.f56408a.getLong("fetch_timeout_in_seconds", 60L)).setMinimumFetchIntervalInSeconds(this.f56408a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return build;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.f56408a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    /* renamed from: h */
    public void m37699h(int i, Date date) {
        synchronized (this.f56410c) {
            this.f56408a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: i */
    public void m37698i(String str) {
        synchronized (this.f56409b) {
            this.f56408a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* renamed from: j */
    public void m37697j(long j) {
        synchronized (this.f56409b) {
            this.f56408a.edit().putLong("last_template_version", j).apply();
        }
    }

    /* renamed from: k */
    public void m37696k(int i, Date date) {
        synchronized (this.f56411d) {
            this.f56408a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: l */
    public void m37695l() {
        synchronized (this.f56409b) {
            this.f56408a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* renamed from: m */
    public void m37694m(Date date) {
        synchronized (this.f56409b) {
            this.f56408a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: n */
    public void m37693n() {
        synchronized (this.f56409b) {
            this.f56408a.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    @WorkerThread
    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f56409b) {
            this.f56408a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f56409b) {
            this.f56408a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).apply();
        }
    }
}
