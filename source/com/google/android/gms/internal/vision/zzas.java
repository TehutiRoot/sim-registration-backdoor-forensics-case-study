package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes3.dex */
public class zzas {

    /* renamed from: a */
    public static UserManager f47552a;

    /* renamed from: b */
    public static volatile boolean f47553b = !zza();

    /* renamed from: c */
    public static boolean f47554c = false;

    /* renamed from: a */
    public static boolean m46568a(Context context) {
        boolean z;
        boolean isUserUnlocked;
        Object systemService;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f47552a == null) {
                systemService = context.getSystemService(UserManager.class);
                f47552a = (UserManager) systemService;
            }
            UserManager userManager = f47552a;
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                f47552a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            f47552a = null;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m46567b(Context context) {
        if (f47553b) {
            return true;
        }
        synchronized (zzas.class) {
            try {
                if (f47553b) {
                    return true;
                }
                boolean m46568a = m46568a(context);
                if (m46568a) {
                    f47553b = m46568a;
                }
                return m46568a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(Context context) {
        return !zza() || m46567b(context);
    }
}
