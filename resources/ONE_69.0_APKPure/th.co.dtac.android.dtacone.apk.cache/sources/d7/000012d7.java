package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;

/* renamed from: Tp1 */
/* loaded from: classes4.dex */
public abstract class AbstractC18563Tp1 {
    /* renamed from: a */
    public static /* synthetic */ void m66306a(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        m66302e(context, z, taskCompletionSource);
    }

    /* renamed from: b */
    public static boolean m66305b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m66304c(Context context) {
        if (AbstractC18693Vp1.m65857c(context)) {
            return;
        }
        m66301f(new ExecutorC21540op1(), context, m66300g(context));
    }

    /* renamed from: d */
    public static boolean m66303d(Context context) {
        Object systemService;
        String notificationDelegate;
        if (!PlatformVersion.isAtLeastQ()) {
            Log.isLoggable(Constants.TAG, 3);
            return false;
        } else if (m66305b(context)) {
            systemService = context.getSystemService(NotificationManager.class);
            notificationDelegate = ((NotificationManager) systemService).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            Log.isLoggable(Constants.TAG, 3);
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("error retrieving notification delegate for package ");
            sb.append(context.getPackageName());
            return false;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m66302e(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        Object systemService;
        String notificationDelegate;
        try {
            if (!m66305b(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("error configuring notification delegate for package ");
                sb.append(context.getPackageName());
                return;
            }
            AbstractC18693Vp1.m65854f(context, true);
            systemService = context.getSystemService(NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    /* renamed from: f */
    public static Task m66301f(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: Sp1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC18563Tp1.m66306a(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public static boolean m66300g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}