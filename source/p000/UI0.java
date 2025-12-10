package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: UI0 */
/* loaded from: classes.dex */
public abstract class UI0 {
    /* renamed from: a */
    public static Notification m66076a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        Notification.Builder recoverBuilder;
        notificationManager.createNotificationChannel(TI0.m66215a(str, str2, 3));
        notificationChannel = notificationManager.getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        if (importance != 0) {
            recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
            recoverBuilder.setChannelId(str);
            return recoverBuilder.build();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m66075b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                return false;
            }
        }
        return true;
    }
}
