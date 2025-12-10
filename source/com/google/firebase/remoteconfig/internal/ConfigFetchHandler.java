package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ConfigFetchHandler {
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j */
    public static final int[] f56378j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    public final FirebaseInstallationsApi f56379a;

    /* renamed from: b */
    public final Provider f56380b;

    /* renamed from: c */
    public final Executor f56381c;

    /* renamed from: d */
    public final Clock f56382d;

    /* renamed from: e */
    public final Random f56383e;

    /* renamed from: f */
    public final ConfigCacheClient f56384f;

    /* renamed from: g */
    public final ConfigFetchHttpClient f56385g;

    /* renamed from: h */
    public final ConfigMetadataClient f56386h;

    /* renamed from: i */
    public final Map f56387i;

    /* loaded from: classes4.dex */
    public static class FetchResponse {

        /* renamed from: a */
        public final Date f56388a;

        /* renamed from: b */
        public final int f56389b;

        /* renamed from: c */
        public final ConfigContainer f56390c;

        /* renamed from: d */
        public final String f56391d;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        public FetchResponse(Date date, int i, ConfigContainer configContainer, String str) {
            this.f56388a = date;
            this.f56389b = i;
            this.f56390c = configContainer;
            this.f56391d = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        /* renamed from: a */
        public String m37731a() {
            return this.f56391d;
        }

        /* renamed from: b */
        public int m37730b() {
            return this.f56389b;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.f56390c;
        }
    }

    /* loaded from: classes4.dex */
    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");
        
        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.f56379a = firebaseInstallationsApi;
        this.f56380b = provider;
        this.f56381c = executor;
        this.f56382d = clock;
        this.f56383e = random;
        this.f56384f = configCacheClient;
        this.f56385g = configFetchHttpClient;
        this.f56386h = configMetadataClient;
        this.f56387i = map;
    }

    /* renamed from: f */
    public final boolean m37751f(long j, Date date) {
        Date m37704c = this.f56386h.m37704c();
        if (m37704c.equals(ConfigMetadataClient.f56406e)) {
            return false;
        }
        return date.before(new Date(m37704c.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.f56386h.getMinimumFetchIntervalInSeconds());
    }

    public Task<FetchResponse> fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i) {
        final HashMap hashMap = new HashMap(this.f56387i);
        hashMap.put("X-Firebase-RC-Fetch-Type", fetchType.getValue() + RemoteSettings.FORWARD_SLASH_STRING + i);
        return this.f56384f.get().continueWithTask(this.f56381c, new Continuation() { // from class: qw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m37736u;
                m37736u = ConfigFetchHandler.this.m37736u(hashMap, task);
                return m37736u;
            }
        });
    }

    /* renamed from: g */
    public final FirebaseRemoteConfigServerException m37750g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode != 401) {
            if (httpStatusCode != 403) {
                if (httpStatusCode != 429) {
                    if (httpStatusCode != 500) {
                        switch (httpStatusCode) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        int httpStatusCode2 = firebaseRemoteConfigServerException.getHttpStatusCode();
        return new FirebaseRemoteConfigServerException(httpStatusCode2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    @VisibleForTesting
    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.f56380b;
    }

    public long getTemplateVersionNumber() {
        return this.f56386h.m37703d();
    }

    /* renamed from: h */
    public final String m37749h(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* renamed from: i */
    public final FetchResponse m37748i(String str, String str2, Date date, Map map) {
        try {
            FetchResponse fetch = this.f56385g.fetch(this.f56385g.m37726d(), str, str2, m37742o(), this.f56386h.m37705b(), map, m37744m(), date);
            if (fetch.getFetchedConfigs() != null) {
                this.f56386h.m37697j(fetch.getFetchedConfigs().getTemplateVersionNumber());
            }
            if (fetch.m37731a() != null) {
                this.f56386h.m37698i(fetch.m37731a());
            }
            this.f56386h.m37701f();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            ConfigMetadataClient.C8634a m37734w = m37734w(e.getHttpStatusCode(), date);
            if (m37735v(m37734w, e.getHttpStatusCode())) {
                throw new FirebaseRemoteConfigFetchThrottledException(m37734w.m37692a().getTime());
            }
            throw m37750g(e);
        }
    }

    /* renamed from: j */
    public final Task m37747j(String str, String str2, Date date, Map map) {
        try {
            final FetchResponse m37748i = m37748i(str, str2, date, map);
            if (m37748i.m37730b() != 0) {
                return Tasks.forResult(m37748i);
            }
            return this.f56384f.put(m37748i.getFetchedConfigs()).onSuccessTask(this.f56381c, new SuccessContinuation() { // from class: tw
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    forResult = Tasks.forResult(ConfigFetchHandler.FetchResponse.this);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: k */
    public final Task m37740q(Task task, long j, final Map map) {
        Task continueWithTask;
        final Date date = new Date(this.f56382d.currentTimeMillis());
        if (task.isSuccessful() && m37751f(j, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date m37745l = m37745l(date);
        if (m37745l != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(m37749h(m37745l.getTime() - date.getTime()), m37745l.getTime()));
        } else {
            final Task<String> id2 = this.f56379a.getId();
            final Task<InstallationTokenResult> token = this.f56379a.getToken(false);
            continueWithTask = Tasks.whenAllComplete(id2, token).continueWithTask(this.f56381c, new Continuation() { // from class: rw
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task m37738s;
                    m37738s = ConfigFetchHandler.this.m37738s(id2, token, date, map, task2);
                    return m37738s;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f56381c, new Continuation() { // from class: sw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m37737t;
                m37737t = ConfigFetchHandler.this.m37737t(date, task2);
                return m37737t;
            }
        });
    }

    /* renamed from: l */
    public final Date m37745l(Date date) {
        Date m37692a = this.f56386h.m37706a().m37692a();
        if (date.before(m37692a)) {
            return m37692a;
        }
        return null;
    }

    /* renamed from: m */
    public final Long m37744m() {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f56380b.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get("_fot");
    }

    /* renamed from: n */
    public final long m37743n(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f56378j;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + this.f56383e.nextInt((int) millis);
    }

    /* renamed from: o */
    public final Map m37742o() {
        HashMap hashMap = new HashMap();
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f56380b.get();
        if (analyticsConnector == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: p */
    public final boolean m37741p(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: s */
    public final /* synthetic */ Task m37738s(Task task, Task task2, Date date, Map map, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return m37747j((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date, map);
    }

    /* renamed from: t */
    public final /* synthetic */ Task m37737t(Date date, Task task) {
        m37732y(task, date);
        return task;
    }

    /* renamed from: u */
    public final /* synthetic */ Task m37736u(Map map, Task task) {
        return m37740q(task, 0L, map);
    }

    /* renamed from: v */
    public final boolean m37735v(ConfigMetadataClient.C8634a c8634a, int i) {
        if (c8634a.m37691b() > 1 || i == 429) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final ConfigMetadataClient.C8634a m37734w(int i, Date date) {
        if (m37741p(i)) {
            m37733x(date);
        }
        return this.f56386h.m37706a();
    }

    /* renamed from: x */
    public final void m37733x(Date date) {
        int m37691b = this.f56386h.m37706a().m37691b() + 1;
        this.f56386h.m37699h(m37691b, new Date(date.getTime() + m37743n(m37691b)));
    }

    /* renamed from: y */
    public final void m37732y(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f56386h.m37694m(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f56386h.m37693n();
        } else {
            this.f56386h.m37695l();
        }
    }

    public Task<FetchResponse> fetch(final long j) {
        final HashMap hashMap = new HashMap(this.f56387i);
        hashMap.put("X-Firebase-RC-Fetch-Type", FetchType.BASE.getValue() + RemoteSettings.FORWARD_SLASH_STRING + 1);
        return this.f56384f.get().continueWithTask(this.f56381c, new Continuation() { // from class: pw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m37740q;
                m37740q = ConfigFetchHandler.this.m37740q(j, hashMap, task);
                return m37740q;
            }
        });
    }
}
