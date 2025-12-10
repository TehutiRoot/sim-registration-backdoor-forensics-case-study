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
    public static MPConfig f58562C = null;

    /* renamed from: D */
    public static final Object f58563D = new Object();
    public static boolean DEBUG = false;
    public static final int UI_FEATURES_MIN_API = 16;
    public static final String VERSION = "5.4.1";

    /* renamed from: A */
    public SSLSocketFactory f58564A;

    /* renamed from: B */
    public OfflineMode f58565B;

    /* renamed from: a */
    public final int f58566a;

    /* renamed from: b */
    public final int f58567b;

    /* renamed from: c */
    public final long f58568c;

    /* renamed from: d */
    public final int f58569d;

    /* renamed from: e */
    public final boolean f58570e;

    /* renamed from: f */
    public final boolean f58571f;

    /* renamed from: g */
    public final boolean f58572g;

    /* renamed from: h */
    public final boolean f58573h;

    /* renamed from: i */
    public final boolean f58574i;

    /* renamed from: j */
    public final String[] f58575j;

    /* renamed from: k */
    public String f58576k;

    /* renamed from: l */
    public String f58577l;

    /* renamed from: m */
    public String f58578m;

    /* renamed from: n */
    public final boolean f58579n;

    /* renamed from: o */
    public final String f58580o;

    /* renamed from: p */
    public final String f58581p;

    /* renamed from: q */
    public final boolean f58582q;

    /* renamed from: r */
    public final int f58583r;

    /* renamed from: s */
    public final boolean f58584s;

    /* renamed from: t */
    public final int f58585t;

    /* renamed from: u */
    public final int f58586u;

    /* renamed from: v */
    public final int f58587v;

    /* renamed from: w */
    public final boolean f58588w;

    /* renamed from: x */
    public final int f58589x;

    /* renamed from: y */
    public final String f58590y;

    /* renamed from: z */
    public final String f58591z;

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
    public static MPConfig m33617a(Context context) {
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
        synchronized (f58563D) {
            try {
                if (f58562C == null) {
                    f58562C = m33617a(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f58562C;
    }

    public boolean getAutoShowMixpanelUpdates() {
        return this.f58579n;
    }

    public int getBulkUploadLimit() {
        return this.f58566a;
    }

    public long getDataExpiration() {
        return this.f58568c;
    }

    public String getDecideEndpoint() {
        return this.f58578m;
    }

    public boolean getDisableAppOpenEvent() {
        return this.f58573h;
    }

    public boolean getDisableDecideChecker() {
        return this.f58582q;
    }

    public boolean getDisableEmulatorBindingUI() {
        return this.f58572g;
    }

    public boolean getDisableGestureBindingUI() {
        return this.f58571f;
    }

    public boolean getDisableViewCrawler() {
        return this.f58574i;
    }

    public String[] getDisableViewCrawlerForProjects() {
        return this.f58575j;
    }

    public String getEditorUrl() {
        return this.f58580o;
    }

    public String getEventsEndpoint() {
        return this.f58576k;
    }

    public int getFlushInterval() {
        return this.f58567b;
    }

    public boolean getIgnoreInvisibleViewsEditor() {
        return this.f58584s;
    }

    public int getImageCacheMaxMemoryFactor() {
        return this.f58583r;
    }

    public int getMinimumDatabaseLimit() {
        return this.f58569d;
    }

    public int getMinimumSessionDuration() {
        return this.f58586u;
    }

    public String getNotificationChannelId() {
        return this.f58590y;
    }

    public int getNotificationChannelImportance() {
        return this.f58589x;
    }

    public String getNotificationChannelName() {
        return this.f58591z;
    }

    public int getNotificationDefaults() {
        return this.f58585t;
    }

    public synchronized OfflineMode getOfflineMode() {
        return this.f58565B;
    }

    public String getPeopleEndpoint() {
        return this.f58577l;
    }

    public String getResourcePackageName() {
        return this.f58581p;
    }

    public synchronized SSLSocketFactory getSSLSocketFactory() {
        return this.f58564A;
    }

    public int getSessionTimeoutDuration() {
        return this.f58587v;
    }

    public boolean getTestMode() {
        return this.f58570e;
    }

    public boolean getUseIpAddressForGeolocation() {
        return this.f58588w;
    }

    public void setDecideEndpoint(String str) {
        this.f58578m = str;
    }

    public void setEventsEndpoint(String str) {
        this.f58576k = str;
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
        this.f58565B = offlineMode;
    }

    public void setPeopleEndpoint(String str) {
        this.f58577l = str;
    }

    public synchronized void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f58564A = sSLSocketFactory;
    }

    public String toString() {
        return "Mixpanel (5.4.1) configured with:\n    AutoShowMixpanelUpdates " + getAutoShowMixpanelUpdates() + "\n    BulkUploadLimit " + getBulkUploadLimit() + "\n    FlushInterval " + getFlushInterval() + "\n    DataExpiration " + getDataExpiration() + "\n    MinimumDatabaseLimit " + getMinimumDatabaseLimit() + "\n    DisableAppOpenEvent " + getDisableAppOpenEvent() + "\n    DisableViewCrawler " + getDisableViewCrawler() + "\n    DisableGestureBindingUI " + getDisableGestureBindingUI() + "\n    DisableEmulatorBindingUI " + getDisableEmulatorBindingUI() + "\n    EnableDebugLogging " + DEBUG + "\n    TestMode " + getTestMode() + "\n    EventsEndpoint " + getEventsEndpoint() + "\n    PeopleEndpoint " + getPeopleEndpoint() + "\n    DecideEndpoint " + getDecideEndpoint() + "\n    EditorUrl " + getEditorUrl() + "\n    ImageCacheMaxMemoryFactor " + getImageCacheMaxMemoryFactor() + "\n    DisableDecideChecker " + getDisableDecideChecker() + "\n    IgnoreInvisibleViewsEditor " + getIgnoreInvisibleViewsEditor() + "\n    NotificationDefaults " + getNotificationDefaults() + "\n    MinimumSessionDuration: " + getMinimumSessionDuration() + "\n    SessionTimeoutDuration: " + getSessionTimeoutDuration() + "\n    NotificationChannelId: " + getNotificationChannelId() + "\n    NotificationChannelName: " + getNotificationChannelName() + "\n    NotificationChannelImportance: " + getNotificationChannelImportance();
    }
}