package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
/* loaded from: classes4.dex */
public class ServiceStarter {
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;

    /* renamed from: e */
    public static ServiceStarter f55670e;

    /* renamed from: a */
    public String f55671a = null;

    /* renamed from: b */
    public Boolean f55672b = null;

    /* renamed from: c */
    public Boolean f55673c = null;

    /* renamed from: d */
    public final Queue f55674d = new ArrayDeque();

    /* renamed from: b */
    public static synchronized ServiceStarter m38448b() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            try {
                if (f55670e == null) {
                    f55670e = new ServiceStarter();
                }
                serviceStarter = f55670e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceStarter;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        f55670e = serviceStarter;
    }

    /* renamed from: a */
    public final int m38449a(Context context, Intent intent) {
        ComponentName startService;
        String m38444f = m38444f(context, intent);
        if (m38444f != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Restricting intent to a specific service: ");
                sb.append(m38444f);
            }
            intent.setClassName(context.getPackageName(), m38444f);
        }
        try {
            if (m38445e(context)) {
                startService = L32.m67558h(context, intent);
            } else {
                startService = context.startService(intent);
            }
            if (startService == null) {
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to start service while in background: ");
            sb2.append(e);
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    /* renamed from: c */
    public Intent m38447c() {
        return (Intent) this.f55674d.poll();
    }

    /* renamed from: d */
    public boolean m38446d(Context context) {
        boolean z;
        if (this.f55673c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f55673c = Boolean.valueOf(z);
        }
        if (!this.f55672b.booleanValue()) {
            Log.isLoggable(Constants.TAG, 3);
        }
        return this.f55673c.booleanValue();
    }

    /* renamed from: e */
    public boolean m38445e(Context context) {
        boolean z;
        if (this.f55672b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f55672b = Boolean.valueOf(z);
        }
        if (!this.f55672b.booleanValue()) {
            Log.isLoggable(Constants.TAG, 3);
        }
        return this.f55672b.booleanValue();
    }

    /* renamed from: f */
    public final synchronized String m38444f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f55671a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f55671a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f55671a = serviceInfo.name;
                    }
                    return this.f55671a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(serviceInfo.packageName);
                sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb.append(serviceInfo.name);
                return null;
            }
            return null;
        } finally {
        }
    }

    @MainThread
    public int startMessagingService(Context context, Intent intent) {
        Log.isLoggable(Constants.TAG, 3);
        this.f55674d.offer(intent);
        Intent intent2 = new Intent(com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        return m38449a(context, intent2);
    }
}
