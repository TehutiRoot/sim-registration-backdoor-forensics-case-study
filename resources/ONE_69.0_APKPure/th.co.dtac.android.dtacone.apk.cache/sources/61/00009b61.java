package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes3.dex */
public class zzas {

    /* renamed from: a */
    public static UserManager f47564a;

    /* renamed from: b */
    public static volatile boolean f47565b = !zza();

    /* renamed from: c */
    public static boolean f47566c = false;

    /* renamed from: a */
    public static boolean m46554a(Context context) {
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
            if (f47564a == null) {
                systemService = context.getSystemService(UserManager.class);
                f47564a = (UserManager) systemService;
            }
            UserManager userManager = f47564a;
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
                f47564a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            f47564a = null;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m46553b(Context context) {
        if (f47565b) {
            return true;
        }
        synchronized (zzas.class) {
            try {
                if (f47565b) {
                    return true;
                }
                boolean m46554a = m46554a(context);
                if (m46554a) {
                    f47565b = m46554a;
                }
                return m46554a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(Context context) {
        return !zza() || m46553b(context);
    }
}