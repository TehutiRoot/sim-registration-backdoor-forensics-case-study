package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes4.dex */
public class ServiceStarter {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;

    /* renamed from: c */
    public static ServiceStarter f55489c;

    /* renamed from: a */
    public Boolean f55490a = null;

    /* renamed from: b */
    public Boolean f55491b = null;

    @KeepForSdk
    public static synchronized ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            try {
                if (f55489c == null) {
                    f55489c = new ServiceStarter();
                }
                serviceStarter = f55489c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceStarter;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        f55489c = serviceStarter;
    }

    /* renamed from: a */
    public boolean m38672a(Context context) {
        boolean z;
        if (this.f55491b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f55491b = Boolean.valueOf(z);
        }
        if (!this.f55490a.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f55491b.booleanValue();
    }

    /* renamed from: b */
    public boolean m38671b(Context context) {
        boolean z;
        if (this.f55490a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f55490a = Boolean.valueOf(z);
        }
        if (!this.f55490a.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.f55490a.booleanValue();
    }
}