package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;

/* loaded from: classes4.dex */
public class DataCollectionArbiter {

    /* renamed from: a */
    public final SharedPreferences f54804a;

    /* renamed from: b */
    public final FirebaseApp f54805b;

    /* renamed from: c */
    public final Object f54806c;

    /* renamed from: d */
    public TaskCompletionSource f54807d;

    /* renamed from: e */
    public boolean f54808e;

    /* renamed from: f */
    public boolean f54809f;

    /* renamed from: g */
    public Boolean f54810g;

    /* renamed from: h */
    public final TaskCompletionSource f54811h;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.f54806c = obj;
        this.f54807d = new TaskCompletionSource();
        this.f54808e = false;
        this.f54809f = false;
        this.f54811h = new TaskCompletionSource();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.f54805b = firebaseApp;
        this.f54804a = CommonUtils.getSharedPrefs(applicationContext);
        Boolean m39069b = m39069b();
        this.f54810g = m39069b == null ? m39070a(applicationContext) : m39069b;
        synchronized (obj) {
            try {
                if (isAutomaticDataCollectionEnabled()) {
                    this.f54807d.trySetResult(null);
                    this.f54808e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static Boolean m39066e(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().m39137e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: f */
    public static void m39065f(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    /* renamed from: a */
    public final Boolean m39070a(Context context) {
        Boolean m39066e = m39066e(context);
        if (m39066e == null) {
            this.f54809f = false;
            return null;
        }
        this.f54809f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m39066e));
    }

    /* renamed from: b */
    public final Boolean m39069b() {
        if (this.f54804a.contains("firebase_crashlytics_collection_enabled")) {
            this.f54809f = false;
            return Boolean.valueOf(this.f54804a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m39068c() {
        try {
            return this.f54805b.isDataCollectionDefaultEnabled();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void m39067d(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f54810g == null) {
            str2 = "global Firebase setting";
        } else if (this.f54809f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        Logger.getLogger().m39140d(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    public void grantDataCollectionPermission(boolean z) {
        if (z) {
            this.f54811h.trySetResult(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean isAutomaticDataCollectionEnabled() {
        boolean m39068c;
        try {
            Boolean bool = this.f54810g;
            if (bool != null) {
                m39068c = bool.booleanValue();
            } else {
                m39068c = m39068c();
            }
            m39067d(m39068c);
        } catch (Throwable th2) {
            throw th2;
        }
        return m39068c;
    }

    public synchronized void setCrashlyticsDataCollectionEnabled(@Nullable Boolean bool) {
        Boolean m39070a;
        if (bool != null) {
            try {
                this.f54809f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            m39070a = bool;
        } else {
            m39070a = m39070a(this.f54805b.getApplicationContext());
        }
        this.f54810g = m39070a;
        m39065f(this.f54804a, bool);
        synchronized (this.f54806c) {
            if (isAutomaticDataCollectionEnabled()) {
                if (!this.f54808e) {
                    this.f54807d.trySetResult(null);
                    this.f54808e = true;
                }
            } else if (this.f54808e) {
                this.f54807d = new TaskCompletionSource();
                this.f54808e = false;
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.f54806c) {
            task = this.f54807d.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        return CrashlyticsTasks.race(this.f54811h.getTask(), waitForAutomaticDataCollectionEnabled());
    }
}
