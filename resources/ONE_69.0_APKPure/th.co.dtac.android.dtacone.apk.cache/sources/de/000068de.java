package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    /* renamed from: androidx.core.app.AppOpsManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3814a {
        @DoNotInline
        /* renamed from: a */
        public static int m57891a(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOp(str, i, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m57890b(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOpNoThrow(str, i, str2);
        }
    }

    /* renamed from: androidx.core.app.AppOpsManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3815b {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m57889a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m57888b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @DoNotInline
        /* renamed from: c */
        public static int m57887c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @DoNotInline
        /* renamed from: d */
        public static String m57886d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.AppOpsManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C3816c {
        @DoNotInline
        /* renamed from: a */
        public static int m57885a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static String m57884b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @Nullable
        @DoNotInline
        /* renamed from: c */
        public static AppOpsManager m57883c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int checkOrNoteProxyOp(@NonNull Context context, int i, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m57883c = C3816c.m57883c(context);
            int m57885a = C3816c.m57885a(m57883c, str, Binder.getCallingUid(), str2);
            if (m57885a != 0) {
                return m57885a;
            }
            return C3816c.m57885a(m57883c, str, i, C3816c.m57884b(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    public static int noteOp(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        return C3814a.m57891a((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int noteOpNoThrow(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        return C3814a.m57890b((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int noteProxyOp(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3815b.m57888b((AppOpsManager) C3815b.m57889a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int noteProxyOpNoThrow(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3815b.m57887c((AppOpsManager) C3815b.m57889a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    @Nullable
    public static String permissionToOp(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3815b.m57886d(str);
        }
        return null;
    }
}