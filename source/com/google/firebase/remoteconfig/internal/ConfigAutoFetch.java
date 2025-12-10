package com.google.firebase.remoteconfig.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes4.dex */
public class ConfigAutoFetch {

    /* renamed from: a */
    public final Set f56350a;

    /* renamed from: b */
    public final HttpURLConnection f56351b;

    /* renamed from: c */
    public final ConfigFetchHandler f56352c;

    /* renamed from: d */
    public final ConfigCacheClient f56353d;

    /* renamed from: e */
    public final ConfigUpdateListener f56354e;

    /* renamed from: f */
    public final ScheduledExecutorService f56355f;

    /* renamed from: g */
    public final Random f56356g = new Random();

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigAutoFetch$a */
    /* loaded from: classes4.dex */
    public class RunnableC8630a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f56357a;

        /* renamed from: b */
        public final /* synthetic */ long f56358b;

        public RunnableC8630a(int i, long j) {
            ConfigAutoFetch.this = r1;
            this.f56357a = i;
            this.f56358b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigAutoFetch.this.fetchLatestConfig(this.f56357a, this.f56358b);
        }
    }

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.f56351b = httpURLConnection;
        this.f56352c = configFetchHandler;
        this.f56353d = configCacheClient;
        this.f56350a = set;
        this.f56354e = configUpdateListener;
        this.f56355f = scheduledExecutorService;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m37776a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j, int i, Task task3) {
        return configAutoFetch.m37770g(task, task2, j, i, task3);
    }

    /* renamed from: d */
    public static Boolean m37773d(ConfigFetchHandler.FetchResponse fetchResponse, long j) {
        boolean z = false;
        if (fetchResponse.getFetchedConfigs() != null) {
            if (fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (fetchResponse.m37730b() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void m37775b(int i, long j) {
        if (i == 0) {
            m37768i(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f56355f.schedule(new RunnableC8630a(i, j), this.f56356g.nextInt(4), TimeUnit.SECONDS);
    }

    /* renamed from: c */
    public final synchronized void m37774c(ConfigUpdate configUpdate) {
        for (ConfigUpdateListener configUpdateListener : this.f56350a) {
            configUpdateListener.onUpdate(configUpdate);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x003b, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004c, code lost:
        r9.f56354e.onError(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0061, code lost:
        if (m37771f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0068, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006a, code lost:
        r6 = r9.f56352c.getTemplateVersionNumber();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0076, code lost:
        if (r4 <= r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0078, code lost:
        m37775b(3, r4);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m37772e(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L8e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.m37769h(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L5d
            com.google.firebase.remoteconfig.ConfigUpdateListener r4 = r9.f56354e     // Catch: org.json.JSONException -> L5b
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L5b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L5b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L5b
            r4.onError(r5)     // Catch: org.json.JSONException -> L5b
            goto L8e
        L5b:
            r4 = move-exception
            goto L7d
        L5d:
            boolean r4 = r9.m37771f()     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L64
            goto L8e
        L64:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L5b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r4 = r9.f56352c     // Catch: org.json.JSONException -> L5b
            long r6 = r4.getTemplateVersionNumber()     // Catch: org.json.JSONException -> L5b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L5b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L12
            r6 = 3
            r9.m37775b(r6, r4)     // Catch: org.json.JSONException -> L5b
            goto L12
        L7d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r4 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r6 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r7 = "Unable to parse config update message."
            r5.<init>(r7, r4, r6)
            r9.m37768i(r5)
            goto L12
        L8e:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.m37772e(java.io.InputStream):void");
    }

    /* renamed from: f */
    public final synchronized boolean m37771f() {
        return this.f56350a.isEmpty();
    }

    @VisibleForTesting
    public synchronized Task<Void> fetchLatestConfig(int i, final long j) {
        final int i2;
        final Task<ConfigFetchHandler.FetchResponse> fetchNowWithTypeAndAttemptNumber;
        final Task<ConfigContainer> task;
        i2 = i - 1;
        fetchNowWithTypeAndAttemptNumber = this.f56352c.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
        task = this.f56353d.get();
        return Tasks.whenAllComplete(fetchNowWithTypeAndAttemptNumber, task).continueWithTask(this.f56355f, new Continuation() { // from class: lw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return ConfigAutoFetch.m37776a(ConfigAutoFetch.this, fetchNowWithTypeAndAttemptNumber, task, j, i2, task2);
            }
        });
    }

    /* renamed from: g */
    public final /* synthetic */ Task m37770g(Task task, Task task2, long j, int i, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.getResult();
        ConfigContainer configContainer = (ConfigContainer) task2.getResult();
        if (!m37773d(fetchResponse, j).booleanValue()) {
            m37775b(i, j);
            return Tasks.forResult(null);
        } else if (fetchResponse.getFetchedConfigs() == null) {
            return Tasks.forResult(null);
        } else {
            if (configContainer == null) {
                configContainer = ConfigContainer.newBuilder().build();
            }
            Set<String> changedParams = configContainer.getChangedParams(fetchResponse.getFetchedConfigs());
            if (changedParams.isEmpty()) {
                return Tasks.forResult(null);
            }
            m37774c(ConfigUpdate.create(changedParams));
            return Tasks.forResult(null);
        }
    }

    /* renamed from: h */
    public final String m37769h(String str) {
        int indexOf = str.indexOf(CameraActivity.REQUEST_CODE);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    /* renamed from: i */
    public final synchronized void m37768i(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (ConfigUpdateListener configUpdateListener : this.f56350a) {
            configUpdateListener.onError(firebaseRemoteConfigException);
        }
    }

    @VisibleForTesting
    public void listenForNotifications() {
        HttpURLConnection httpURLConnection = this.f56351b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            m37772e(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.f56351b.disconnect();
            throw th2;
        }
        this.f56351b.disconnect();
    }
}
