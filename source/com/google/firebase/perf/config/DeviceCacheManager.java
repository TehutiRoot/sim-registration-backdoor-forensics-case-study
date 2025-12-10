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
    public static final AndroidLogger f56118c = AndroidLogger.getInstance();

    /* renamed from: d */
    public static DeviceCacheManager f56119d;

    /* renamed from: a */
    public volatile SharedPreferences f56120a;

    /* renamed from: b */
    public final ExecutorService f56121b;

    @VisibleForTesting
    public DeviceCacheManager(ExecutorService executorService) {
        this.f56121b = executorService;
    }

    /* renamed from: a */
    public static /* synthetic */ void m38285a(DeviceCacheManager deviceCacheManager, Context context) {
        deviceCacheManager.m38283c(context);
    }

    @VisibleForTesting
    public static void clearInstance() {
        f56119d = null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized DeviceCacheManager getInstance() {
        DeviceCacheManager deviceCacheManager;
        synchronized (DeviceCacheManager.class) {
            try {
                if (f56119d == null) {
                    f56119d = new DeviceCacheManager(Executors.newSingleThreadExecutor());
                }
                deviceCacheManager = f56119d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceCacheManager;
    }

    /* renamed from: b */
    public final Context m38284b() {
        try {
            FirebaseApp.getInstance();
            return FirebaseApp.getInstance().getApplicationContext();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m38283c(Context context) {
        if (this.f56120a == null && context != null) {
            this.f56120a = context.getSharedPreferences(Constants.PREFS_NAME, 0);
        }
    }

    public void clear(String str) {
        if (str == null) {
            f56118c.debug("Key is null. Cannot clear nullable key");
        } else {
            this.f56120a.edit().remove(str).apply();
        }
    }

    public boolean containsKey(String str) {
        if (this.f56120a != null && str != null && this.f56120a.contains(str)) {
            return true;
        }
        return false;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            f56118c.debug("Key is null when getting boolean value on device cache.");
            return Optional.absent();
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56120a.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m38156of(Boolean.valueOf(this.f56120a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            f56118c.debug("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            f56118c.debug("Key is null when getting double value on device cache.");
            return Optional.absent();
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56120a.contains(str)) {
            return Optional.absent();
        }
        try {
            try {
                return Optional.m38156of(Double.valueOf(Double.longBitsToDouble(this.f56120a.getLong(str, 0L))));
            } catch (ClassCastException e) {
                f56118c.debug("Key %s from sharedPreferences has type other than double: %s", str, e.getMessage());
                return Optional.absent();
            }
        } catch (ClassCastException unused) {
            return Optional.m38156of(Double.valueOf(Float.valueOf(this.f56120a.getFloat(str, 0.0f)).doubleValue()));
        }
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            f56118c.debug("Key is null when getting long value on device cache.");
            return Optional.absent();
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56120a.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m38156of(Long.valueOf(this.f56120a.getLong(str, 0L)));
        } catch (ClassCastException e) {
            f56118c.debug("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            f56118c.debug("Key is null when getting String value on device cache.");
            return Optional.absent();
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return Optional.absent();
            }
        }
        if (!this.f56120a.contains(str)) {
            return Optional.absent();
        }
        try {
            return Optional.m38156of(this.f56120a.getString(str, ""));
        } catch (ClassCastException e) {
            f56118c.debug("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public synchronized void setContext(final Context context) {
        if (this.f56120a == null && context != null) {
            this.f56121b.execute(new Runnable() { // from class: wG
                {
                    DeviceCacheManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DeviceCacheManager.m38285a(DeviceCacheManager.this, context);
                }
            });
        }
    }

    public boolean setValue(String str, boolean z) {
        if (str == null) {
            f56118c.debug("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return false;
            }
        }
        this.f56120a.edit().putBoolean(str, z).apply();
        return true;
    }

    public boolean setValue(String str, String str2) {
        if (str == null) {
            f56118c.debug("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f56120a.edit().remove(str).apply();
            return true;
        }
        this.f56120a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean setValue(String str, double d) {
        if (str == null) {
            f56118c.debug("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return false;
            }
        }
        this.f56120a.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return true;
    }

    public boolean setValue(String str, long j) {
        if (str == null) {
            f56118c.debug("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f56120a == null) {
            setContext(m38284b());
            if (this.f56120a == null) {
                return false;
            }
        }
        this.f56120a.edit().putLong(str, j).apply();
        return true;
    }
}
