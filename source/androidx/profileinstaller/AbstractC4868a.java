package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4868a {

    /* renamed from: androidx.profileinstaller.a$a */
    /* loaded from: classes2.dex */
    public static class C4869a {
        /* renamed from: a */
        public static File m53712a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* renamed from: androidx.profileinstaller.a$b */
    /* loaded from: classes2.dex */
    public static class C4870b {
        /* renamed from: a */
        public static File m53711a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext.getCodeCacheDir();
        }
    }

    /* renamed from: a */
    public static boolean m53714a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (m53714a(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* renamed from: b */
    public static void m53713b(Context context, ProfileInstallReceiver.C4860a c4860a) {
        File cacheDir;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            cacheDir = C4870b.m53711a(context);
        } else if (i >= 23) {
            cacheDir = C4869a.m53712a(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (m53714a(cacheDir)) {
            c4860a.onResultReceived(14, null);
        } else {
            c4860a.onResultReceived(15, null);
        }
    }
}
