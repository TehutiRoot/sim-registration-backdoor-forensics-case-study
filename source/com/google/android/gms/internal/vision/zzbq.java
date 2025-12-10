package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.vision.zzbq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbq implements InterfaceC20068gd2 {

    /* renamed from: f */
    public static final Map f47589f = new ArrayMap();

    /* renamed from: a */
    public final SharedPreferences f47590a;

    /* renamed from: b */
    public final SharedPreferences.OnSharedPreferenceChangeListener f47591b;

    /* renamed from: c */
    public final Object f47592c;

    /* renamed from: d */
    public volatile Map f47593d;

    /* renamed from: e */
    public final List f47594e;

    public zzbq(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: Ke2

            /* renamed from: a */
            public final zzbq f3241a;

            {
                this.f3241a = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f3241a.m46548c(sharedPreferences2, str);
            }
        };
        this.f47591b = onSharedPreferenceChangeListener;
        this.f47592c = new Object();
        this.f47594e = new ArrayList();
        this.f47590a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: a */
    public static zzbq m46550a(Context context, String str) {
        boolean z;
        zzbq zzbqVar;
        if (zzas.zza() && !str.startsWith("direct_boot:")) {
            z = zzas.zza(context);
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        synchronized (zzbq.class) {
            try {
                Map map = f47589f;
                zzbqVar = (zzbq) map.get(str);
                if (zzbqVar == null) {
                    zzbqVar = new zzbq(m46547d(context, str));
                    map.put(str, zzbqVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbqVar;
    }

    /* renamed from: b */
    public static synchronized void m46549b() {
        synchronized (zzbq.class) {
            try {
                for (zzbq zzbqVar : f47589f.values()) {
                    zzbqVar.f47590a.unregisterOnSharedPreferenceChangeListener(zzbqVar.f47591b);
                }
                f47589f.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static SharedPreferences m46547d(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzas.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m46548c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f47592c) {
            this.f47593d = null;
            zzbi.m46555e();
        }
        synchronized (this) {
            try {
                for (zzaz zzazVar : this.f47594e) {
                    zzazVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC20068gd2
    public final Object zza(String str) {
        Map<String, ?> map = this.f47593d;
        if (map == null) {
            synchronized (this.f47592c) {
                try {
                    map = this.f47593d;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.f47590a.getAll();
                        this.f47593d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
