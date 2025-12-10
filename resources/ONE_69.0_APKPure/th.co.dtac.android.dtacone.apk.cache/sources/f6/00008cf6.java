package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* loaded from: classes3.dex */
public class InstantApps {

    /* renamed from: a */
    public static Context f45353a;

    /* renamed from: b */
    public static Boolean f45354b;

    @KeepForSdk
    public static synchronized boolean isInstantApp(@NonNull Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f45353a;
            if (context2 != null && (bool = f45354b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f45354b = null;
            if (PlatformVersion.isAtLeastO()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f45354b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f45354b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f45354b = Boolean.FALSE;
                }
            }
            f45353a = applicationContext;
            return f45354b.booleanValue();
        }
    }
}