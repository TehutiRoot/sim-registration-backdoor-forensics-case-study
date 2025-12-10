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
    public final Context f55569a;

    /* renamed from: b */
    public final SharedPreferences f55570b;

    /* renamed from: c */
    public final Publisher f55571c;

    /* renamed from: d */
    public boolean f55572d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context m38590a = m38590a(context);
        this.f55569a = m38590a;
        this.f55570b = m38590a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f55571c = publisher;
        this.f55572d = m38589b();
    }

    /* renamed from: a */
    public static Context m38590a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: b */
    public final boolean m38589b() {
        if (this.f55570b.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.f55570b.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        return m38588c();
    }

    /* renamed from: c */
    public final boolean m38588c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f55569a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f55569a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: d */
    public final synchronized void m38587d(boolean z) {
        if (this.f55572d != z) {
            this.f55572d = z;
            this.f55571c.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f55572d;
    }

    public synchronized void setEnabled(Boolean bool) {
        try {
            if (bool == null) {
                this.f55570b.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
                m38587d(m38588c());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f55570b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, equals).apply();
                m38587d(equals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
