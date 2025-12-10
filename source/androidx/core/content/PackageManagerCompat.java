package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.p005os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class PackageManagerCompat {
    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface UnusedAppRestrictionsStatus {
    }

    /* renamed from: androidx.core.content.PackageManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3966a {
        /* renamed from: a */
        public static boolean m57458a(Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            z = true;
        } else {
            z = false;
        }
        if (i >= 23 && i < 30) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getPermissionRevocationVerifierApp(packageManager) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && (!z2 || !z3)) {
            return false;
        }
        return true;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(@NonNull Context context) {
        ResolvableFuture create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            return create;
        } else if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                create.set(0);
                return create;
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 2;
            int i4 = 4;
            if (i2 >= 31) {
                if (C3966a.m57458a(context)) {
                    if (i >= 31) {
                        i4 = 5;
                    }
                    create.set(Integer.valueOf(i4));
                } else {
                    create.set(2);
                }
                return create;
            } else if (i2 == 30) {
                if (C3966a.m57458a(context)) {
                    i3 = 4;
                }
                create.set(Integer.valueOf(i3));
                return create;
            } else {
                final CY1 cy1 = new CY1(context);
                create.addListener(new Runnable() { // from class: wh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cy1.m68756b();
                    }
                }, Executors.newSingleThreadExecutor());
                cy1.m68757a(create);
                return create;
            }
        }
    }
}
