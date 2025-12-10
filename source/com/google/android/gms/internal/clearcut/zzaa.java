package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes3.dex */
public class zzaa {

    /* renamed from: a */
    public static volatile UserManager f45502a;

    /* renamed from: b */
    public static volatile boolean f45503b = !m48207a();

    /* renamed from: a */
    public static boolean m48207a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public static boolean m48206b(Context context) {
        Object systemService;
        boolean z = f45503b;
        if (!z) {
            UserManager userManager = f45502a;
            if (userManager == null) {
                synchronized (zzaa.class) {
                    try {
                        userManager = f45502a;
                        if (userManager == null) {
                            systemService = context.getSystemService(UserManager.class);
                            UserManager userManager2 = (UserManager) systemService;
                            f45502a = userManager2;
                            if (userManager2 == null) {
                                f45503b = true;
                                return true;
                            }
                            userManager = userManager2;
                        }
                    } finally {
                    }
                }
            }
            z = userManager.isUserUnlocked();
            f45503b = z;
            if (z) {
                f45502a = null;
            }
        }
        return z;
    }

    public static boolean zze(Context context) {
        return m48207a() && !m48206b(context);
    }
}
