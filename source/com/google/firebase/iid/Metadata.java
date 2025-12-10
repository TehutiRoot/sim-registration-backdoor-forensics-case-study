package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

@KeepForSdk
/* loaded from: classes4.dex */
public class Metadata {

    /* renamed from: a */
    public final Context f55471a;

    /* renamed from: b */
    public String f55472b;

    /* renamed from: c */
    public String f55473c;

    /* renamed from: d */
    public int f55474d;

    /* renamed from: e */
    public int f55475e = 0;

    public Metadata(Context context) {
        this.f55471a = context;
    }

    public static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public final PackageInfo m38683a(String str) {
        try {
            return this.f55471a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void m38682b() {
        PackageInfo m38683a = m38683a(this.f55471a.getPackageName());
        if (m38683a != null) {
            this.f55472b = Integer.toString(m38683a.versionCode);
            this.f55473c = m38683a.versionName;
        }
    }

    public synchronized String getAppVersionCode() {
        try {
            if (this.f55472b == null) {
                m38682b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55472b;
    }

    public synchronized String getAppVersionName() {
        try {
            if (this.f55473c == null) {
                m38682b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55473c;
    }

    public synchronized int getGmsVersionCode() {
        PackageInfo m38683a;
        try {
            if (this.f55474d == 0 && (m38683a = m38683a("com.google.android.gms")) != null) {
                this.f55474d = m38683a.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55474d;
    }

    public synchronized int getIidImplementation() {
        int i = this.f55475e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f55471a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f55475e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f55475e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f55475e = 2;
            i2 = 2;
        } else {
            this.f55475e = 1;
        }
        return i2;
    }

    @KeepForSdk
    public boolean isGmscorePresent() {
        if (getIidImplementation() != 0) {
            return true;
        }
        return false;
    }
}
