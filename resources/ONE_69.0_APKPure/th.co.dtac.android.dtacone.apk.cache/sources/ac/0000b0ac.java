package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

/* loaded from: classes4.dex */
public class DataCollectionConfigStorage {
    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";

    /* renamed from: a */
    public final Context f55581a;

    /* renamed from: b */
    public final SharedPreferences f55582b;

    /* renamed from: c */
    public final Publisher f55583c;

    /* renamed from: d */
    public boolean f55584d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context m38582a = m38582a(context);
        this.f55581a = m38582a;
        this.f55582b = m38582a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f55583c = publisher;
        this.f55584d = m38581b();
    }

    /* renamed from: a */
    public static Context m38582a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: b */
    public final boolean m38581b() {
        if (this.f55582b.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.f55582b.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        return m38580c();
    }

    /* renamed from: c */
    public final boolean m38580c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f55581a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f55581a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: d */
    public final synchronized void m38579d(boolean z) {
        if (this.f55584d != z) {
            this.f55584d = z;
            this.f55583c.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f55584d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.f55582b.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
                m38579d(m38580c());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f55582b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, equals).apply();
                m38579d(equals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}