package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes3.dex */
public class zzaa {

    /* renamed from: a */
    public static volatile UserManager f45514a;

    /* renamed from: b */
    public static volatile boolean f45515b = !m48204a();

    /* renamed from: a */
    public static boolean m48204a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public static boolean m48203b(Context context) {
        Object systemService;
        boolean z = f45515b;
        if (!z) {
            UserManager userManager = f45514a;
            if (userManager == null) {
                synchronized (zzaa.class) {
                    try {
                        userManager = f45514a;
                        if (userManager == null) {
                            systemService = context.getSystemService(UserManager.class);
                            UserManager userManager2 = (UserManager) systemService;
                            f45514a = userManager2;
                            if (userManager2 == null) {
                                f45515b = true;
                                return true;
                            }
                            userManager = userManager2;
                        }
                    } finally {
                    }
                }
            }
            z = userManager.isUserUnlocked();
            f45515b = z;
            if (z) {
                f45514a = null;
            }
        }
        return z;
    }

    public static boolean zze(Context context) {
        return m48204a() && !m48203b(context);
    }
}