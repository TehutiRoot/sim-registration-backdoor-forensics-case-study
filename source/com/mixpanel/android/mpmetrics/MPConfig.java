package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.mixpanel.android.util.MPConstants;
import com.mixpanel.android.util.OfflineMode;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public class MPConfig {

    /* renamed from: C */
    public static MPConfig f58550C = null;

    /* renamed from: D */
    public static final Object f58551D = new Object();
    public static boolean DEBUG = false;
    public static final int UI_FEATURES_MIN_API = 16;
    public static final String VERSION = "5.4.1";

    /* renamed from: A */
    public SSLSocketFactory f58552A;

    /* renamed from: B */
    public OfflineMode f58553B;

    /* renamed from: a */
    public final int f58554a;

    /* renamed from: b */
    public final int f58555b;

    /* renamed from: c */
    public final long f58556c;

    /* renamed from: d */
    public final int f58557d;

    /* renamed from: e */
    public final boolean f58558e;

    /* renamed from: f */
    public final boolean f58559f;

    /* renamed from: g */
    public final boolean f58560g;

    /* renamed from: h */
    public final boolean f58561h;

    /* renamed from: i */
    public final boolean f58562i;

    /* renamed from: j */
    public final String[] f58563j;

    /* renamed from: k */
    public String f58564k;

    /* renamed from: l */
    public String f58565l;

    /* renamed from: m */
    public String f58566m;

    /* renamed from: n */
    public final boolean f58567n;

    /* renamed from: o */
    public final String f58568o;

    /* renamed from: p */
    public final String f58569p;

    /* renamed from: q */
    public final boolean f58570q;

    /* renamed from: r */
    public final int f58571r;

    /* renamed from: s */
    public final boolean f58572s;

    /* renamed from: t */
    public final int f58573t;

    /* renamed from: u */
    public final int f58574u;

    /* renamed from: v */
    public final int f58575v;

    /* renamed from: w */
    public final boolean f58576w;

    /* renamed from: x */
    public final int f58577x;

    /* renamed from: y */
    public final String f58578y;

    /* renamed from: z */
    public final String f58579z;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MPConfig(android.os.Bundle r6, android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPConfig.<init>(android.os.Bundle, android.content.Context):void");
    }

    /* renamed from: a */
    public static MPConfig m33625a(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new MPConfig(bundle, context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't configure Mixpanel with package name " + packageName, e);
        }
    }

    public static MPConfig getInstance(Context context) {
        synchronized (f58551D) {
            try {
                if (f58550C == null) {
                    f58550C = m33625a(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f58550C;
    }

    public boolean getAutoShowMixpanelUpdates() {
        return this.f58567n;
    }

    public int getBulkUploadLimit() {
        return this.f58554a;
    }

    public long getDataExpiration() {
        return this.f58556c;
    }

    public String getDecideEndpoint() {
        return this.f58566m;
    }

    public boolean getDisableAppOpenEvent() {
        return this.f58561h;
    }

    public boolean getDisableDecideChecker() {
        return this.f58570q;
    }

    public boolean getDisableEmulatorBindingUI() {
        return this.f58560g;
    }

    public boolean getDisableGestureBindingUI() {
        return this.f58559f;
    }

    public boolean getDisableViewCrawler() {
        return this.f58562i;
    }

    public String[] getDisableViewCrawlerForProjects() {
        return this.f58563j;
    }

    public String getEditorUrl() {
        return this.f58568o;
    }

    public String getEventsEndpoint() {
        return this.f58564k;
    }

    public int getFlushInterval() {
        return this.f58555b;
    }

    public boolean getIgnoreInvisibleViewsEditor() {
        return this.f58572s;
    }

    public int getImageCacheMaxMemoryFactor() {
        return this.f58571r;
    }

    public int getMinimumDatabaseLimit() {
        return this.f58557d;
    }

    public int getMinimumSessionDuration() {
        return this.f58574u;
    }

    public String getNotificationChannelId() {
        return this.f58578y;
    }

    public int getNotificationChannelImportance() {
        return this.f58577x;
    }

    public String getNotificationChannelName() {
        return this.f58579z;
    }

    public int getNotificationDefaults() {
        return this.f58573t;
    }

    public synchronized OfflineMode getOfflineMode() {
        return this.f58553B;
    }

    public String getPeopleEndpoint() {
        return this.f58565l;
    }

    public String getResourcePackageName() {
        return this.f58569p;
    }

    public synchronized SSLSocketFactory getSSLSocketFactory() {
        return this.f58552A;
    }

    public int getSessionTimeoutDuration() {
        return this.f58575v;
    }

    public boolean getTestMode() {
        return this.f58558e;
    }

    public boolean getUseIpAddressForGeolocation() {
        return this.f58576w;
    }

    public void setDecideEndpoint(String str) {
        this.f58566m = str;
    }

    public void setEventsEndpoint(String str) {
        this.f58564k = str;
    }

    public void setMixpanelDecideEndpoint() {
        setDecideEndpoint(MPConstants.URL.DECIDE);
    }

    public void setMixpanelEventsEndpoint() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(MPConstants.URL.EVENT);
        if (getUseIpAddressForGeolocation()) {
            str = "1";
        } else {
            str = "0";
        }
        sb.append(str);
        setEventsEndpoint(sb.toString());
    }

    public void setMixpanelPeopleEndpoint() {
        setPeopleEndpoint(MPConstants.URL.PEOPLE);
    }

    public synchronized void setOfflineMode(OfflineMode offlineMode) {
        this.f58553B = offlineMode;
    }

    public void setPeopleEndpoint(String str) {
        this.f58565l = str;
    }

    public synchronized void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f58552A = sSLSocketFactory;
    }

    public String toString() {
        return "Mixpanel (5.4.1) configured with:\n    AutoShowMixpanelUpdates " + getAutoShowMixpanelUpdates() + "\n    BulkUploadLimit " + getBulkUploadLimit() + "\n    FlushInterval " + getFlushInterval() + "\n    DataExpiration " + getDataExpiration() + "\n    MinimumDatabaseLimit " + getMinimumDatabaseLimit() + "\n    DisableAppOpenEvent " + getDisableAppOpenEvent() + "\n    DisableViewCrawler " + getDisableViewCrawler() + "\n    DisableGestureBindingUI " + getDisableGestureBindingUI() + "\n    DisableEmulatorBindingUI " + getDisableEmulatorBindingUI() + "\n    EnableDebugLogging " + DEBUG + "\n    TestMode " + getTestMode() + "\n    EventsEndpoint " + getEventsEndpoint() + "\n    PeopleEndpoint " + getPeopleEndpoint() + "\n    DecideEndpoint " + getDecideEndpoint() + "\n    EditorUrl " + getEditorUrl() + "\n    ImageCacheMaxMemoryFactor " + getImageCacheMaxMemoryFactor() + "\n    DisableDecideChecker " + getDisableDecideChecker() + "\n    IgnoreInvisibleViewsEditor " + getIgnoreInvisibleViewsEditor() + "\n    NotificationDefaults " + getNotificationDefaults() + "\n    MinimumSessionDuration: " + getMinimumSessionDuration() + "\n    SessionTimeoutDuration: " + getSessionTimeoutDuration() + "\n    NotificationChannelId: " + getNotificationChannelId() + "\n    NotificationChannelName: " + getNotificationChannelName() + "\n    NotificationChannelImportance: " + getNotificationChannelImportance();
    }
}
