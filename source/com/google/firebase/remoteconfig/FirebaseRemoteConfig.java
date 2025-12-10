package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;

    /* renamed from: a */
    public final Context f56318a;

    /* renamed from: b */
    public final FirebaseApp f56319b;

    /* renamed from: c */
    public final FirebaseABTesting f56320c;

    /* renamed from: d */
    public final Executor f56321d;

    /* renamed from: e */
    public final ConfigCacheClient f56322e;

    /* renamed from: f */
    public final ConfigCacheClient f56323f;

    /* renamed from: g */
    public final ConfigCacheClient f56324g;

    /* renamed from: h */
    public final ConfigFetchHandler f56325h;

    /* renamed from: i */
    public final ConfigGetParameterHandler f56326i;

    /* renamed from: j */
    public final ConfigMetadataClient f56327j;

    /* renamed from: k */
    public final FirebaseInstallationsApi f56328k;

    /* renamed from: l */
    public final ConfigRealtimeHandler f56329l;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler) {
        this.f56318a = context;
        this.f56319b = firebaseApp;
        this.f56328k = firebaseInstallationsApi;
        this.f56320c = firebaseABTesting;
        this.f56321d = executor;
        this.f56322e = configCacheClient;
        this.f56323f = configCacheClient2;
        this.f56324g = configCacheClient3;
        this.f56325h = configFetchHandler;
        this.f56326i = configGetParameterHandler;
        this.f56327j = configMetadataClient;
        this.f56329l = configRealtimeHandler;
    }

    /* renamed from: a */
    public static /* synthetic */ Void m37822a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return firebaseRemoteConfig.m37806q(firebaseRemoteConfigSettings);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m37821b(FirebaseRemoteConfig firebaseRemoteConfig, Task task) {
        return firebaseRemoteConfig.m37804s(task);
    }

    /* renamed from: c */
    public static /* synthetic */ Task m37820c(ConfigContainer configContainer) {
        return Tasks.forResult(null);
    }

    /* renamed from: d */
    public static /* synthetic */ FirebaseRemoteConfigInfo m37819d(Task task, Task task2) {
        return m37811l(task, task2);
    }

    /* renamed from: g */
    public static /* synthetic */ Task m37816g(FirebaseRemoteConfig firebaseRemoteConfig, Void r1) {
        return firebaseRemoteConfig.m37808o(r1);
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: h */
    public static /* synthetic */ Task m37815h(FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
        return firebaseRemoteConfig.m37812k(task, task2, task3);
    }

    /* renamed from: i */
    public static /* synthetic */ Void m37814i(FirebaseRemoteConfig firebaseRemoteConfig) {
        return firebaseRemoteConfig.m37807p();
    }

    /* renamed from: j */
    public static boolean m37813j(ConfigContainer configContainer, ConfigContainer configContainer2) {
        if (configContainer2 != null && configContainer.getFetchTime().equals(configContainer2.getFetchTime())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static /* synthetic */ FirebaseRemoteConfigInfo m37811l(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    /* renamed from: w */
    public static List m37800w(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @NonNull
    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.f56322e.get();
        final Task<ConfigContainer> task2 = this.f56323f.get();
        return Tasks.whenAllComplete(task, task2).continueWithTask(this.f56321d, new Continuation() { // from class: g20
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return FirebaseRemoteConfig.m37815h(FirebaseRemoteConfig.this, task, task2, task3);
            }
        });
    }

    @NonNull
    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        return this.f56329l.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    @NonNull
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.f56323f.get();
        Task<ConfigContainer> task2 = this.f56324g.get();
        Task<ConfigContainer> task3 = this.f56322e.get();
        final Task call = Tasks.call(this.f56321d, new Callable() { // from class: l20
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.this.getInfo();
            }
        });
        return Tasks.whenAllComplete(task, task2, task3, call, this.f56328k.getId(), this.f56328k.getToken(false)).continueWith(this.f56321d, new Continuation() { // from class: m20
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.m37819d(Task.this, task4);
            }
        });
    }

    @NonNull
    public Task<Void> fetch() {
        return this.f56325h.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: o20
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) obj;
                forResult = Tasks.forResult(null);
                return forResult;
            }
        });
    }

    @NonNull
    public Task<Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.f56321d, new SuccessContinuation() { // from class: n20
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseRemoteConfig.m37816g(FirebaseRemoteConfig.this, (Void) obj);
            }
        });
    }

    @NonNull
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.f56326i.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return this.f56326i.getBoolean(str);
    }

    public double getDouble(@NonNull String str) {
        return this.f56326i.getDouble(str);
    }

    @NonNull
    public FirebaseRemoteConfigInfo getInfo() {
        return this.f56327j.getInfo();
    }

    @NonNull
    public Set<String> getKeysByPrefix(@NonNull String str) {
        return this.f56326i.getKeysByPrefix(str);
    }

    public long getLong(@NonNull String str) {
        return this.f56326i.getLong(str);
    }

    @NonNull
    public String getString(@NonNull String str) {
        return this.f56326i.getString(str);
    }

    @NonNull
    public FirebaseRemoteConfigValue getValue(@NonNull String str) {
        return this.f56326i.getValue(str);
    }

    /* renamed from: k */
    public final /* synthetic */ Task m37812k(Task task, Task task2, Task task3) {
        if (task.isSuccessful() && task.getResult() != null) {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (task2.isSuccessful() && !m37813j(configContainer, (ConfigContainer) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.f56323f.put(configContainer).continueWith(this.f56321d, new Continuation() { // from class: p20
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    return Boolean.valueOf(FirebaseRemoteConfig.m37821b(FirebaseRemoteConfig.this, task4));
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* renamed from: o */
    public final /* synthetic */ Task m37808o(Void r1) {
        return activate();
    }

    /* renamed from: p */
    public final /* synthetic */ Void m37807p() {
        this.f56323f.clear();
        this.f56322e.clear();
        this.f56324g.clear();
        this.f56327j.clear();
        return null;
    }

    /* renamed from: q */
    public final /* synthetic */ Void m37806q(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f56327j.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    @NonNull
    public Task<Void> reset() {
        return Tasks.call(this.f56321d, new Callable() { // from class: j20
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m37814i(FirebaseRemoteConfig.this);
            }
        });
    }

    /* renamed from: s */
    public final boolean m37804s(Task task) {
        if (task.isSuccessful()) {
            this.f56322e.clear();
            if (task.getResult() != null) {
                m37799x(((ConfigContainer) task.getResult()).getAbtExperiments());
                return true;
            }
            return true;
        }
        return false;
    }

    public void schedule(Runnable runnable) {
        this.f56321d.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.f56321d, new Callable() { // from class: k20
            {
                FirebaseRemoteConfig.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m37822a(FirebaseRemoteConfig.this, firebaseRemoteConfigSettings);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@NonNull Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return m37802u(hashMap);
    }

    /* renamed from: t */
    public void m37803t(boolean z) {
        this.f56329l.setBackgroundState(z);
    }

    /* renamed from: u */
    public final Task m37802u(Map map) {
        try {
            return this.f56324g.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: h20
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return FirebaseRemoteConfig.m37820c((ConfigContainer) obj);
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    /* renamed from: v */
    public void m37801v() {
        this.f56323f.get();
        this.f56324g.get();
        this.f56322e.get();
    }

    /* renamed from: x */
    public void m37799x(JSONArray jSONArray) {
        if (this.f56320c == null) {
            return;
        }
        try {
            this.f56320c.replaceAllExperiments(m37800w(jSONArray));
        } catch (AbtException e) {
            Log.w(TAG, "Could not update ABT experiments.", e);
        } catch (JSONException unused) {
        }
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).m37792e();
    }

    @NonNull
    public Task<Void> fetch(long j) {
        return this.f56325h.fetch(j).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: i20
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) obj;
                forResult = Tasks.forResult(null);
                return forResult;
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@XmlRes int i) {
        return m37802u(DefaultsXmlParser.getDefaultsFromXml(this.f56318a, i));
    }
}
