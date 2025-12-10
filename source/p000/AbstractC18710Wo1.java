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

/* renamed from: Wo1 */
/* loaded from: classes4.dex */
public abstract class AbstractC18710Wo1 {
    /* renamed from: a */
    public static /* synthetic */ void m65562a(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        m65558e(context, z, taskCompletionSource);
    }

    /* renamed from: b */
    public static boolean m65561b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m65560c(Context context) {
        if (AbstractC18838Yo1.m65299c(context)) {
            return;
        }
        m65557f(new ExecutorC21992ro1(), context, m65556g(context));
    }

    /* renamed from: d */
    public static boolean m65559d(Context context) {
        Object systemService;
        String notificationDelegate;
        if (!PlatformVersion.isAtLeastQ()) {
            Log.isLoggable(Constants.TAG, 3);
            return false;
        } else if (m65561b(context)) {
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
    public static /* synthetic */ void m65558e(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        Object systemService;
        String notificationDelegate;
        try {
            if (!m65561b(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("error configuring notification delegate for package ");
                sb.append(context.getPackageName());
                return;
            }
            AbstractC18838Yo1.m65296f(context, true);
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
    public static Task m65557f(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: Vo1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC18710Wo1.m65562a(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public static boolean m65556g(Context context) {
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
