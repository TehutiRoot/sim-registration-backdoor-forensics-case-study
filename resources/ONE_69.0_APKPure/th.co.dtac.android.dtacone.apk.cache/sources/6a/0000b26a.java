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
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
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
    public final Context f56330a;

    /* renamed from: b */
    public final FirebaseApp f56331b;

    /* renamed from: c */
    public final FirebaseABTesting f56332c;

    /* renamed from: d */
    public final Executor f56333d;

    /* renamed from: e */
    public final ConfigCacheClient f56334e;

    /* renamed from: f */
    public final ConfigCacheClient f56335f;

    /* renamed from: g */
    public final ConfigCacheClient f56336g;

    /* renamed from: h */
    public final ConfigFetchHandler f56337h;

    /* renamed from: i */
    public final ConfigGetParameterHandler f56338i;

    /* renamed from: j */
    public final ConfigMetadataClient f56339j;

    /* renamed from: k */
    public final FirebaseInstallationsApi f56340k;

    /* renamed from: l */
    public final ConfigRealtimeHandler f56341l;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler) {
        this.f56330a = context;
        this.f56331b = firebaseApp;
        this.f56340k = firebaseInstallationsApi;
        this.f56332c = firebaseABTesting;
        this.f56333d = executor;
        this.f56334e = configCacheClient;
        this.f56335f = configCacheClient2;
        this.f56336g = configCacheClient3;
        this.f56337h = configFetchHandler;
        this.f56338i = configGetParameterHandler;
        this.f56339j = configMetadataClient;
        this.f56341l = configRealtimeHandler;
    }

    /* renamed from: a */
    public static /* synthetic */ Void m37814a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return firebaseRemoteConfig.m37798q(firebaseRemoteConfigSettings);
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: i */
    public static /* synthetic */ Void m37806i(FirebaseRemoteConfig firebaseRemoteConfig) {
        return firebaseRemoteConfig.m37799p();
    }

    /* renamed from: j */
    public static boolean m37805j(ConfigContainer configContainer, ConfigContainer configContainer2) {
        if (configContainer2 != null && configContainer.getFetchTime().equals(configContainer2.getFetchTime())) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static /* synthetic */ FirebaseRemoteConfigInfo m37803l(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.getResult();
    }

    /* renamed from: w */
    public static List m37792w(JSONArray jSONArray) {
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
        final Task<ConfigContainer> task = this.f56334e.get();
        final Task<ConfigContainer> task2 = this.f56335f.get();
        return Tasks.whenAllComplete(task, task2).continueWithTask(this.f56333d, new Continuation() { // from class: k20
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task m37804k;
                m37804k = FirebaseRemoteConfig.this.m37804k(task, task2, task3);
                return m37804k;
            }
        });
    }

    @NonNull
    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        return this.f56341l.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    @NonNull
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.f56335f.get();
        Task<ConfigContainer> task2 = this.f56336g.get();
        Task<ConfigContainer> task3 = this.f56334e.get();
        final Task call = Tasks.call(this.f56333d, new Callable() { // from class: p20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.this.getInfo();
            }
        });
        return Tasks.whenAllComplete(task, task2, task3, call, this.f56340k.getId(), this.f56340k.getToken(false)).continueWith(this.f56333d, new Continuation() { // from class: q20
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                FirebaseRemoteConfigInfo m37803l;
                m37803l = FirebaseRemoteConfig.m37803l(Task.this, task4);
                return m37803l;
            }
        });
    }

    @NonNull
    public Task<Void> fetch() {
        return this.f56337h.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: s20
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
        return fetch().onSuccessTask(this.f56333d, new SuccessContinuation() { // from class: r20
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m37800o;
                m37800o = FirebaseRemoteConfig.this.m37800o((Void) obj);
                return m37800o;
            }
        });
    }

    @NonNull
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.f56338i.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return this.f56338i.getBoolean(str);
    }

    public double getDouble(@NonNull String str) {
        return this.f56338i.getDouble(str);
    }

    @NonNull
    public FirebaseRemoteConfigInfo getInfo() {
        return this.f56339j.getInfo();
    }

    @NonNull
    public Set<String> getKeysByPrefix(@NonNull String str) {
        return this.f56338i.getKeysByPrefix(str);
    }

    public long getLong(@NonNull String str) {
        return this.f56338i.getLong(str);
    }

    @NonNull
    public String getString(@NonNull String str) {
        return this.f56338i.getString(str);
    }

    @NonNull
    public FirebaseRemoteConfigValue getValue(@NonNull String str) {
        return this.f56338i.getValue(str);
    }

    /* renamed from: k */
    public final /* synthetic */ Task m37804k(Task task, Task task2, Task task3) {
        if (task.isSuccessful() && task.getResult() != null) {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (task2.isSuccessful() && !m37805j(configContainer, (ConfigContainer) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.f56335f.put(configContainer).continueWith(this.f56333d, new Continuation() { // from class: t20
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    boolean m37796s;
                    m37796s = FirebaseRemoteConfig.this.m37796s(task4);
                    return Boolean.valueOf(m37796s);
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* renamed from: o */
    public final /* synthetic */ Task m37800o(Void r1) {
        return activate();
    }

    /* renamed from: p */
    public final /* synthetic */ Void m37799p() {
        this.f56335f.clear();
        this.f56334e.clear();
        this.f56336g.clear();
        this.f56339j.clear();
        return null;
    }

    /* renamed from: q */
    public final /* synthetic */ Void m37798q(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f56339j.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    @NonNull
    public Task<Void> reset() {
        return Tasks.call(this.f56333d, new Callable() { // from class: n20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m37806i(FirebaseRemoteConfig.this);
            }
        });
    }

    /* renamed from: s */
    public final boolean m37796s(Task task) {
        if (task.isSuccessful()) {
            this.f56334e.clear();
            if (task.getResult() != null) {
                m37791x(((ConfigContainer) task.getResult()).getAbtExperiments());
                return true;
            }
            return true;
        }
        return false;
    }

    public void schedule(Runnable runnable) {
        this.f56333d.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.call(this.f56333d, new Callable() { // from class: o20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m37814a(FirebaseRemoteConfig.this, firebaseRemoteConfigSettings);
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
        return m37794u(hashMap);
    }

    /* renamed from: t */
    public void m37795t(boolean z) {
        this.f56341l.setBackgroundState(z);
    }

    /* renamed from: u */
    public final Task m37794u(Map map) {
        try {
            return this.f56336g.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: l20
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    ConfigContainer configContainer = (ConfigContainer) obj;
                    forResult = Tasks.forResult(null);
                    return forResult;
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    /* renamed from: v */
    public void m37793v() {
        this.f56335f.get();
        this.f56336g.get();
        this.f56334e.get();
    }

    /* renamed from: x */
    public void m37791x(JSONArray jSONArray) {
        if (this.f56332c == null) {
            return;
        }
        try {
            this.f56332c.replaceAllExperiments(m37792w(jSONArray));
        } catch (AbtException e) {
            Log.w(TAG, "Could not update ABT experiments.", e);
        } catch (JSONException unused) {
        }
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).m37784e();
    }

    @NonNull
    public Task<Void> fetch(long j) {
        return this.f56337h.fetch(j).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: m20
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
        return m37794u(DefaultsXmlParser.getDefaultsFromXml(this.f56330a, i));
    }
}