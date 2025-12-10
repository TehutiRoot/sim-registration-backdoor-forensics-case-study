package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";

    /* renamed from: g */
    public static final Pattern f54823g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f54824h = Pattern.quote(RemoteSettings.FORWARD_SLASH_STRING);

    /* renamed from: a */
    public final C18809Ye0 f54825a;

    /* renamed from: b */
    public final Context f54826b;

    /* renamed from: c */
    public final String f54827c;

    /* renamed from: d */
    public final FirebaseInstallationsApi f54828d;

    /* renamed from: e */
    public final DataCollectionArbiter f54829e;

    /* renamed from: f */
    public InstallIdProvider.InstallIds f54830f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context != null) {
            if (str != null) {
                this.f54826b = context;
                this.f54827c = str;
                this.f54828d = firebaseInstallationsApi;
                this.f54829e = dataCollectionArbiter;
                this.f54825a = new C18809Ye0();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    /* renamed from: b */
    public static String m39060b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static String m39059c(String str) {
        return f54823g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: d */
    public static boolean m39058d(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized String m39061a(String str, SharedPreferences sharedPreferences) {
        String m39059c;
        m39059c = m39059c(UUID.randomUUID().toString());
        Logger logger = Logger.getLogger();
        logger.m39134v("Created new Crashlytics installation ID: " + m39059c + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m39059c).putString("firebase.installation.id", str).apply();
        return m39059c;
    }

    /* renamed from: e */
    public final String m39057e(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: f */
    public final String m39056f(String str) {
        return str.replaceAll(f54824h, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().m39131w("Error getting Firebase installation id.", r0);
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.firebase.crashlytics.internal.common.FirebaseInstallationId fetchTrueFid(boolean r6) {
        /*
            r5 = this;
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkNotMainThread()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2 = 0
            if (r6 == 0) goto L26
            com.google.firebase.installations.FirebaseInstallationsApi r6 = r5.f54828d     // Catch: java.lang.Exception -> L1c
            r3 = 0
            com.google.android.gms.tasks.Task r6 = r6.getToken(r3)     // Catch: java.lang.Exception -> L1c
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L1c
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r0, r3)     // Catch: java.lang.Exception -> L1c
            com.google.firebase.installations.InstallationTokenResult r6 = (com.google.firebase.installations.InstallationTokenResult) r6     // Catch: java.lang.Exception -> L1c
            java.lang.String r6 = r6.getToken()     // Catch: java.lang.Exception -> L1c
            goto L27
        L1c:
            r6 = move-exception
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r4 = "Error getting Firebase authentication token."
            r3.m39131w(r4, r6)
        L26:
            r6 = r2
        L27:
            com.google.firebase.installations.FirebaseInstallationsApi r3 = r5.f54828d     // Catch: java.lang.Exception -> L37
            com.google.android.gms.tasks.Task r3 = r3.getId()     // Catch: java.lang.Exception -> L37
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r3, r0, r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L37
            r2 = r0
            goto L41
        L37:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r3 = "Error getting Firebase installation id."
            r1.m39131w(r3, r0)
        L41:
            com.google.firebase.crashlytics.internal.common.FirebaseInstallationId r0 = new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId
            r0.<init>(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.IdManager.fetchTrueFid(boolean):com.google.firebase.crashlytics.internal.common.FirebaseInstallationId");
    }

    /* renamed from: g */
    public final boolean m39055g() {
        InstallIdProvider.InstallIds installIds = this.f54830f;
        if (installIds != null && (installIds.getFirebaseInstallationId() != null || !this.f54829e.isAutomaticDataCollectionEnabled())) {
            return false;
        }
        return true;
    }

    public String getAppIdentifier() {
        return this.f54827c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized InstallIdProvider.InstallIds getInstallIds() {
        String str;
        if (!m39055g()) {
            return this.f54830f;
        }
        Logger.getLogger().m39134v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.f54826b);
        String string = sharedPrefs.getString("firebase.installation.id", null);
        Logger logger = Logger.getLogger();
        logger.m39134v("Cached Firebase Installation ID: " + string);
        if (this.f54829e.isAutomaticDataCollectionEnabled()) {
            FirebaseInstallationId fetchTrueFid = fetchTrueFid(false);
            Logger logger2 = Logger.getLogger();
            logger2.m39134v("Fetched Firebase Installation ID: " + fetchTrueFid.getFid());
            if (fetchTrueFid.getFid() == null) {
                if (string == null) {
                    str = m39060b();
                } else {
                    str = string;
                }
                fetchTrueFid = new FirebaseInstallationId(str, null);
            }
            if (Objects.equals(fetchTrueFid.getFid(), string)) {
                this.f54830f = InstallIdProvider.InstallIds.m39054a(m39057e(sharedPrefs), fetchTrueFid);
            } else {
                this.f54830f = InstallIdProvider.InstallIds.m39054a(m39061a(fetchTrueFid.getFid(), sharedPrefs), fetchTrueFid);
            }
        } else if (m39058d(string)) {
            this.f54830f = InstallIdProvider.InstallIds.createWithoutFid(m39057e(sharedPrefs));
        } else {
            this.f54830f = InstallIdProvider.InstallIds.createWithoutFid(m39061a(m39060b(), sharedPrefs));
        }
        Logger logger3 = Logger.getLogger();
        logger3.m39134v("Install IDs: " + this.f54830f);
        return this.f54830f;
    }

    public String getInstallerPackageName() {
        return this.f54825a.m65330a(this.f54826b);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", m39056f(Build.MANUFACTURER), m39056f(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return m39056f(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return m39056f(Build.VERSION.RELEASE);
    }
}
