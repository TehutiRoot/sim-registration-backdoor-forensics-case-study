package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.config.DeviceCacheManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@VisibleForTesting(otherwise = 3)
/* loaded from: classes4.dex */
public class DeviceCacheManager {

    /* renamed from: c */
    public static final AndroidLogger f56130c = AndroidLogger.getInstance();

    /* renamed from: d */
    public static DeviceCacheManager f56131d;

    /* renamed from: a */
    public volatile SharedPreferences f56132a;

    /* renamed from: b */
    public final ExecutorService f56133b;

    @VisibleForTesting
    public DeviceCacheManager(ExecutorService executorService) {
        this.f56133b = executorService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m38277a(DeviceCacheManager deviceCacheManager, Context context) {
        deviceCacheManager.m38275c(context);
    }

    @VisibleForTesting
    public static void clearInstance() {
        f56131d = null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized DeviceCacheManager getInstance() {
        DeviceCacheManager deviceCacheManager;
        synchronized (DeviceCacheManager.class) {
            try {
                if (f56131d == null) {
                    f56131d = new DeviceCacheManager(Executors.newSingleThreadExecutor());
                }
                deviceCacheManager = f56131d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceCacheManager;
    }

    /* renamed from: b */
    public final Context m38276b() {
        try {
            FirebaseApp.getInstance();
            return FirebaseApp.getInstance().getApplicationContext();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m38275c(Context context) {
        if (this.f56132a == null && context != null) {
            this.f56132a = context.getSharedPreferences(Constants.PREFS_NAME, 0);
        }
    }

    public void clear(String str) {
        if (str == null) {
            f56130c.debug("Key is null. Cannot clear nullable key");
        } else {
            this.f56132a.edit().remove(str).apply();
        }
    }

    public boolean containsKey(String str) {
        if (this.f56132a != null && str != null && this.f56132a.contains(str)) {
            return true;
        }
        return false;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            f56130c.debug("Key is null when getting boolean value on device cache.");
            return Optional.absent();
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56132a.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m38148of(Boolean.valueOf(this.f56132a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            f56130c.debug("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            f56130c.debug("Key is null when getting double value on device cache.");
            return Optional.absent();
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56132a.contains(str)) {
            return Optional.absent();
        }
        try {
            try {
                return Optional.m38148of(Double.valueOf(Double.longBitsToDouble(this.f56132a.getLong(str, 0L))));
            } catch (ClassCastException e) {
                f56130c.debug("Key %s from sharedPreferences has type other than double: %s", str, e.getMessage());
                return Optional.absent();
            }
        } catch (ClassCastException unused) {
            return Optional.m38148of(Double.valueOf(Float.valueOf(this.f56132a.getFloat(str, 0.0f)).doubleValue()));
        }
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            f56130c.debug("Key is null when getting long value on device cache.");
            return Optional.absent();
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56132a.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m38148of(Long.valueOf(this.f56132a.getLong(str, 0L)));
        } catch (ClassCastException e) {
            f56130c.debug("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            f56130c.debug("Key is null when getting String value on device cache.");
            return Optional.absent();
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56132a.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m38148of(this.f56132a.getString(str, ""));
        } catch (ClassCastException e) {
            f56130c.debug("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public synchronized void setContext(final Context context) {
        if (this.f56132a == null && context != null) {
            this.f56133b.execute(new Runnable() { // from class: xG
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceCacheManager.m38277a(DeviceCacheManager.this, context);
                }
            });
        }
    }

    public boolean setValue(String str, boolean z) {
        if (str == null) {
            f56130c.debug("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return false;
            }
        }
        this.f56132a.edit().putBoolean(str, z).apply();
        return true;
    }

    public boolean setValue(String str, String str2) {
        if (str == null) {
            f56130c.debug("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f56132a.edit().remove(str).apply();
            return true;
        }
        this.f56132a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean setValue(String str, double d) {
        if (str == null) {
            f56130c.debug("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return false;
            }
        }
        this.f56132a.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return true;
    }

    public boolean setValue(String str, long j) {
        if (str == null) {
            f56130c.debug("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f56132a == null) {
            setContext(m38276b());
            if (this.f56132a == null) {
                return false;
            }
        }
        this.f56132a.edit().putLong(str, j).apply();
        return true;
    }
}