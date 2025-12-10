package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes4.dex */
public class C8551a {

    /* renamed from: a */
    public final ExecutorService f55675a;

    /* renamed from: b */
    public final Context f55676b;

    /* renamed from: c */
    public final NotificationParams f55677c;

    public C8551a(Context context, NotificationParams notificationParams, ExecutorService executorService) {
        this.f55675a = executorService;
        this.f55676b = context;
        this.f55677c = notificationParams;
    }

    /* renamed from: a */
    public boolean m38443a() {
        if (this.f55677c.getBoolean(Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        if (m38442b()) {
            return false;
        }
        ImageDownload m38440d = m38440d();
        CommonNotificationBuilder.DisplayNotificationInfo m38577d = CommonNotificationBuilder.m38577d(this.f55676b, this.f55677c);
        m38439e(m38577d.notificationBuilder, m38440d);
        m38441c(m38577d);
        return true;
    }

    /* renamed from: b */
    public final boolean m38442b() {
        if (((KeyguardManager) this.f55676b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f55676b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m38441c(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        Log.isLoggable(Constants.TAG, 3);
        ((NotificationManager) this.f55676b.getSystemService("notification")).notify(displayNotificationInfo.tag, displayNotificationInfo.f55599id, displayNotificationInfo.notificationBuilder.build());
    }

    /* renamed from: d */
    public final ImageDownload m38440d() {
        ImageDownload create = ImageDownload.create(this.f55677c.getString(Constants.MessageNotificationKeys.IMAGE_URL));
        if (create != null) {
            create.start(this.f55675a);
        }
        return create;
    }

    /* renamed from: e */
    public final void m38439e(NotificationCompat.Builder builder, ImageDownload imageDownload) {
        if (imageDownload == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(imageDownload.getTask(), 5L, TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
        } catch (InterruptedException unused) {
            Log.w(Constants.TAG, "Interrupted while downloading image, showing notification without it");
            imageDownload.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w(Constants.TAG, "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w(Constants.TAG, "Failed to download image in time, showing notification without it");
            imageDownload.close();
        }
    }
}
