package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: aJ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19029aJ0 {
    /* renamed from: a */
    public static Notification m65158a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        Notification.Builder recoverBuilder;
        notificationManager.createNotificationChannel(ZI0.m65241a(str, str2, 3));
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
    public static boolean m65157b(NotificationManager notificationManager, String str) {
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