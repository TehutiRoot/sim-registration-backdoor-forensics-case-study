package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConfigRealtimeHttpClient {

    /* renamed from: q */
    public static final int[] f56428q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r */
    public static final Pattern f56429r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Set f56430a;

    /* renamed from: c */
    public int f56432c;

    /* renamed from: g */
    public final ScheduledExecutorService f56436g;

    /* renamed from: h */
    public final ConfigFetchHandler f56437h;

    /* renamed from: i */
    public final FirebaseApp f56438i;

    /* renamed from: j */
    public final FirebaseInstallationsApi f56439j;

    /* renamed from: k */
    public ConfigCacheClient f56440k;

    /* renamed from: l */
    public final Context f56441l;

    /* renamed from: m */
    public final String f56442m;

    /* renamed from: p */
    public final ConfigMetadataClient f56445p;

    /* renamed from: f */
    public final int f56435f = 8;

    /* renamed from: b */
    public boolean f56431b = false;

    /* renamed from: n */
    public final Random f56443n = new Random();

    /* renamed from: o */
    public final Clock f56444o = DefaultClock.getInstance();

    /* renamed from: d */
    public boolean f56433d = false;

    /* renamed from: e */
    public boolean f56434e = false;

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$a */
    /* loaded from: classes4.dex */
    public class RunnableC8636a implements Runnable {
        public RunnableC8636a() {
            ConfigRealtimeHttpClient.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$b */
    /* loaded from: classes4.dex */
    public class C8637b implements ConfigUpdateListener {
        public C8637b() {
            ConfigRealtimeHttpClient.this = r1;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            ConfigRealtimeHttpClient.this.m37679g();
            ConfigRealtimeHttpClient.this.m37668r(firebaseRemoteConfigException);
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public void onUpdate(ConfigUpdate configUpdate) {
        }
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        this.f56430a = set;
        this.f56436g = scheduledExecutorService;
        this.f56432c = Math.max(8 - configMetadataClient.m37702e().m37689b(), 1);
        this.f56438i = firebaseApp;
        this.f56437h = configFetchHandler;
        this.f56439j = firebaseInstallationsApi;
        this.f56440k = configCacheClient;
        this.f56441l = context;
        this.f56442m = str;
        this.f56445p = configMetadataClient;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m37685a(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2) {
        return configRealtimeHttpClient.m37672n(task, task2);
    }

    /* renamed from: b */
    public static /* synthetic */ Task m37684b(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2, Task task3) {
        return configRealtimeHttpClient.m37671o(task, task2, task3);
    }

    /* renamed from: h */
    public static String m37678h(String str) {
        Matcher matcher = f56429r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void beginRealtimeHttpStream() {
        if (!m37681e()) {
            return;
        }
        if (new Date(this.f56444o.currentTimeMillis()).before(this.f56445p.m37702e().m37690a())) {
            retryHttpConnectionWhenBackoffEnds();
            return;
        }
        final Task<HttpURLConnection> createRealtimeConnection = createRealtimeConnection();
        Tasks.whenAllComplete(createRealtimeConnection).continueWith(this.f56436g, new Continuation() { // from class: ww
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ConfigRealtimeHttpClient.m37685a(ConfigRealtimeHttpClient.this, createRealtimeConnection, task);
            }
        });
    }

    public void closeRealtimeHttpStream(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> createRealtimeConnection() {
        final Task<InstallationTokenResult> token = this.f56439j.getToken(false);
        final Task<String> id2 = this.f56439j.getId();
        return Tasks.whenAllComplete(token, id2).continueWithTask(this.f56436g, new Continuation() { // from class: vw
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ConfigRealtimeHttpClient.m37684b(ConfigRealtimeHttpClient.this, token, id2, task);
            }
        });
    }

    /* renamed from: e */
    public final synchronized boolean m37681e() {
        boolean z;
        if (!this.f56430a.isEmpty() && !this.f56431b && !this.f56433d) {
            if (!this.f56434e) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: f */
    public final JSONObject m37680f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m37678h(this.f56438i.getOptions().getApplicationId()));
        hashMap.put("namespace", this.f56442m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f56437h.getTemplateVersionNumber()));
        hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f56438i.getOptions().getApplicationId());
        hashMap.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, BuildConfig.VERSION_NAME);
        hashMap.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new JSONObject(hashMap);
    }

    /* renamed from: g */
    public final synchronized void m37679g() {
        this.f56433d = true;
    }

    @SuppressLint({"VisibleForTests"})
    public Date getBackoffEndTime() {
        return this.f56445p.m37702e().m37690a();
    }

    @SuppressLint({"VisibleForTests"})
    public int getNumberOfFailedStreams() {
        return this.f56445p.m37702e().m37689b();
    }

    /* renamed from: i */
    public final String m37677i() {
        try {
            Context context = this.f56441l;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get fingerprint hash for package: ");
                sb.append(this.f56441l.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.f56441l.getPackageName());
            return null;
        }
    }

    /* renamed from: j */
    public final long m37676j(int i) {
        int[] iArr = f56428q;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + this.f56443n.nextInt((int) millis);
    }

    /* renamed from: k */
    public final String m37675k(String str) {
        return String.format(RemoteConfigConstants.REALTIME_REGEX_URL, m37678h(this.f56438i.getOptions().getApplicationId()), str);
    }

    /* renamed from: l */
    public final URL m37674l() {
        try {
            return new URL(m37675k(this.f56442m));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final boolean m37673m(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: n */
    public final /* synthetic */ Task m37672n(Task task, Task task2) {
        Integer num;
        Throwable th2;
        HttpURLConnection httpURLConnection;
        boolean z;
        boolean z2;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int responseCode;
        boolean m37673m;
        try {
        } catch (IOException unused) {
            httpURLConnection = null;
            num = null;
        } catch (Throwable th3) {
            num = null;
            th2 = th3;
            httpURLConnection = null;
        }
        if (task.isSuccessful()) {
            m37665u(true);
            httpURLConnection = (HttpURLConnection) task.getResult();
            try {
                responseCode = httpURLConnection.getResponseCode();
                num = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        m37667s();
                        this.f56445p.m37700g();
                        startAutoFetch(httpURLConnection).listenForNotifications();
                    } catch (IOException unused2) {
                        closeRealtimeHttpStream(httpURLConnection);
                        m37665u(false);
                        if (num != null && !m37673m(num.intValue())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            m37663w(new Date(this.f56444o.currentTimeMillis()));
                        }
                        if (!z2 && num.intValue() != 200) {
                            String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format = m37669q(httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num.intValue(), format, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                            m37668r(firebaseRemoteConfigServerException);
                            return Tasks.forResult(null);
                        }
                        retryHttpConnectionWhenBackoffEnds();
                        return Tasks.forResult(null);
                    } catch (Throwable th4) {
                        th2 = th4;
                        closeRealtimeHttpStream(httpURLConnection);
                        m37665u(false);
                        if (num != null && !m37673m(num.intValue())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            m37663w(new Date(this.f56444o.currentTimeMillis()));
                        }
                        if (!z && num.intValue() != 200) {
                            String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format2 = m37669q(httpURLConnection.getErrorStream());
                            }
                            m37668r(new FirebaseRemoteConfigServerException(num.intValue(), format2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        } else {
                            retryHttpConnectionWhenBackoffEnds();
                        }
                        throw th2;
                    }
                }
                closeRealtimeHttpStream(httpURLConnection);
                m37665u(false);
                m37673m = m37673m(responseCode);
                if (m37673m) {
                    m37663w(new Date(this.f56444o.currentTimeMillis()));
                }
            } catch (IOException unused3) {
                num = null;
            } catch (Throwable th5) {
                num = null;
                th2 = th5;
            }
            if (!m37673m && responseCode != 200) {
                String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                if (responseCode == 403) {
                    format3 = m37669q(httpURLConnection.getErrorStream());
                }
                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, format3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                m37668r(firebaseRemoteConfigServerException);
                return Tasks.forResult(null);
            }
            retryHttpConnectionWhenBackoffEnds();
            return Tasks.forResult(null);
        }
        throw new IOException(task.getException());
    }

    /* renamed from: o */
    public final /* synthetic */ Task m37671o(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m37674l().openConnection();
            setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    /* renamed from: p */
    public final synchronized void m37670p(long j) {
        try {
            if (!m37681e()) {
                return;
            }
            int i = this.f56432c;
            if (i > 0) {
                this.f56432c = i - 1;
                this.f56436g.schedule(new RunnableC8636a(), j, TimeUnit.MILLISECONDS);
            } else if (!this.f56434e) {
                m37668r(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: q */
    public final String m37669q(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* renamed from: r */
    public final synchronized void m37668r(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (ConfigUpdateListener configUpdateListener : this.f56430a) {
            configUpdateListener.onError(firebaseRemoteConfigException);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        m37670p(Math.max(0L, this.f56445p.m37702e().m37690a().getTime() - new Date(this.f56444o.currentTimeMillis()).getTime()));
    }

    /* renamed from: s */
    public final synchronized void m37667s() {
        this.f56432c = 8;
    }

    @SuppressLint({"VisibleForTests"})
    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        m37666t(httpURLConnection, str2);
        byte[] bytes = m37680f(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.f56437h, this.f56440k, this.f56430a, new C8637b(), this.f56436g);
    }

    public void startHttpConnection() {
        m37670p(0L);
    }

    /* renamed from: t */
    public final void m37666t(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f56438i.getOptions().getApiKey());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f56441l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m37677i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: u */
    public final synchronized void m37665u(boolean z) {
        this.f56431b = z;
    }

    /* renamed from: v */
    public void m37664v(boolean z) {
        this.f56434e = z;
    }

    /* renamed from: w */
    public final void m37663w(Date date) {
        int m37689b = this.f56445p.m37702e().m37689b() + 1;
        this.f56445p.m37696k(m37689b, new Date(date.getTime() + m37676j(m37689b)));
    }
}
