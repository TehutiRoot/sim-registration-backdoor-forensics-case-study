package com.mixpanel.android.mpmetrics;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.ResourceReader;
import com.mixpanel.android.util.MPLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class GCMReceiver extends BroadcastReceiver {

    /* loaded from: classes5.dex */
    public static class NotificationData {
        public static final int NOT_SET = -1;
        public final int color;
        public final int icon;
        public final Intent intent;
        public final int largeIcon;
        public final String message;
        public final CharSequence title;
        public final int whiteIcon;

        public /* synthetic */ NotificationData(int i, int i2, int i3, CharSequence charSequence, String str, Intent intent, int i4, C9140a c9140a) {
            this(i, i2, i3, charSequence, str, intent, i4);
        }

        public NotificationData(int i, int i2, int i3, CharSequence charSequence, String str, Intent intent, int i4) {
            this.icon = i;
            this.largeIcon = i2;
            this.whiteIcon = i3;
            this.title = charSequence;
            this.message = str;
            this.intent = intent;
            this.color = i4;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.GCMReceiver$a */
    /* loaded from: classes5.dex */
    public class C9140a implements MixpanelAPI.InterfaceC9158d {

        /* renamed from: a */
        public final /* synthetic */ String f58511a;

        public C9140a(String str) {
            this.f58511a = str;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
        /* renamed from: a */
        public void mo33492a(MixpanelAPI mixpanelAPI) {
            mixpanelAPI.getPeople().setPushRegistrationId(this.f58511a);
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.GCMReceiver$b */
    /* loaded from: classes5.dex */
    public class C9141b implements MixpanelAPI.InterfaceC9158d {
        public C9141b() {
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
        /* renamed from: a */
        public void mo33492a(MixpanelAPI mixpanelAPI) {
            mixpanelAPI.getPeople().clearPushRegistrationId();
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.GCMReceiver$c */
    /* loaded from: classes5.dex */
    public class C9142c implements MixpanelAPI.InterfaceC9158d {

        /* renamed from: a */
        public final /* synthetic */ String f58514a;

        /* renamed from: b */
        public final /* synthetic */ String f58515b;

        /* renamed from: c */
        public final /* synthetic */ String f58516c;

        public C9142c(String str, String str2, String str3) {
            this.f58514a = str;
            this.f58515b = str2;
            this.f58516c = str3;
        }

        @Override // com.mixpanel.android.mpmetrics.MixpanelAPI.InterfaceC9158d
        /* renamed from: a */
        public void mo33492a(MixpanelAPI mixpanelAPI) {
            if (mixpanelAPI.isAppInForeground()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (this.f58514a != null) {
                        jSONObject = new JSONObject(this.f58514a);
                    }
                } catch (JSONException unused) {
                }
                try {
                    jSONObject.put("campaign_id", Integer.valueOf(this.f58515b).intValue());
                    jSONObject.put(Constants.MessagePayloadKeys.MSGID_SERVER, Integer.valueOf(this.f58516c).intValue());
                    jSONObject.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, "push");
                    mixpanelAPI.track("$campaign_received", jSONObject);
                } catch (JSONException unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public final Notification m33646a(Context context, Intent intent, ResourceIds resourceIds) {
        NotificationData m33641f = m33641f(context, intent, resourceIds);
        if (m33641f == null) {
            return null;
        }
        MPLog.m33459d("MixpanelAPI.GCMReceiver", "MP GCM notification received: " + m33641f.message);
        PendingIntent activity = PendingIntent.getActivity(context, 0, m33641f.intent, 134217728);
        if (Build.VERSION.SDK_INT >= 26) {
            return makeNotificationSDK26OrHigher(context, activity, m33641f);
        }
        return makeNotificationSDK21OrHigher(context, activity, m33641f);
    }

    /* renamed from: b */
    public final Intent m33645b(Context context, String str, String str2, String str3, String str4) {
        Uri uri;
        Intent intent;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        if (uri == null) {
            intent = m33644c(context);
        } else {
            intent = new Intent("android.intent.action.VIEW", uri);
        }
        if (str2 != null) {
            intent.putExtra("mp_campaign_id", str2);
        }
        if (str3 != null) {
            intent.putExtra("mp_message_id", str3);
        }
        if (str4 != null) {
            intent.putExtra("mp", str4);
        }
        return intent;
    }

    /* renamed from: c */
    public Intent m33644c(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    /* renamed from: d */
    public final void m33643d(Context context, Intent intent) {
        String resourcePackageName = MPConfig.getInstance(context).getResourcePackageName();
        if (resourcePackageName == null) {
            resourcePackageName = context.getPackageName();
        }
        Notification m33646a = m33646a(context.getApplicationContext(), intent, new ResourceReader.Drawables(resourcePackageName, context));
        if (m33646a != null) {
            ((NotificationManager) context.getSystemService("notification")).notify(0, m33646a);
        }
    }

    /* renamed from: e */
    public final void m33642e(Intent intent) {
        String stringExtra = intent.getStringExtra("registration_id");
        if (intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR) != null) {
            MPLog.m33457e("MixpanelAPI.GCMReceiver", "Error when registering for GCM: " + intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR));
        } else if (stringExtra != null) {
            MPLog.m33459d("MixpanelAPI.GCMReceiver", "Registering GCM ID: " + stringExtra);
            MixpanelAPI.m33585o(new C9140a(stringExtra));
        } else if (intent.getStringExtra("unregistered") != null) {
            MPLog.m33459d("MixpanelAPI.GCMReceiver", "Unregistering from GCM");
            MixpanelAPI.m33585o(new C9141b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mixpanel.android.mpmetrics.GCMReceiver.NotificationData m33641f(android.content.Context r19, android.content.Intent r20, com.mixpanel.android.mpmetrics.ResourceIds r21) {
        /*
            r18 = this;
            r0 = r20
            r1 = r21
            android.content.pm.PackageManager r2 = r19.getPackageManager()
            java.lang.String r3 = "mp_message"
            java.lang.String r9 = r0.getStringExtra(r3)
            java.lang.String r3 = "mp_icnm"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "mp_icnm_l"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "mp_icnm_w"
            java.lang.String r5 = r0.getStringExtra(r5)
            java.lang.String r6 = "mp_cta"
            java.lang.String r12 = r0.getStringExtra(r6)
            java.lang.String r6 = "mp_title"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "mp_color"
            java.lang.String r7 = r0.getStringExtra(r7)
            java.lang.String r8 = "mp_campaign_id"
            java.lang.String r13 = r0.getStringExtra(r8)
            java.lang.String r8 = "mp_message_id"
            java.lang.String r14 = r0.getStringExtra(r8)
            java.lang.String r8 = "mp"
            java.lang.String r15 = r0.getStringExtra(r8)
            r0 = r18
            r0.m33640g(r13, r14, r15)
            r8 = -1
            if (r7 == 0) goto L54
            int r7 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.IllegalArgumentException -> L53
            r16 = r7
            goto L56
        L53:
        L54:
            r16 = -1
        L56:
            r7 = 0
            if (r9 != 0) goto L5a
            return r7
        L5a:
            if (r3 == 0) goto L67
            boolean r10 = r1.knownIdName(r3)
            if (r10 == 0) goto L67
            int r3 = r1.idFromName(r3)
            goto L68
        L67:
            r3 = -1
        L68:
            if (r4 == 0) goto L77
            boolean r10 = r1.knownIdName(r4)
            if (r10 == 0) goto L77
            int r4 = r1.idFromName(r4)
            r17 = r4
            goto L79
        L77:
            r17 = -1
        L79:
            if (r5 == 0) goto L86
            boolean r4 = r1.knownIdName(r5)
            if (r4 == 0) goto L86
            int r1 = r1.idFromName(r5)
            goto L87
        L86:
            r1 = -1
        L87:
            java.lang.String r4 = r19.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            r5 = 0
            android.content.pm.ApplicationInfo r7 = r2.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L91
            goto L92
        L91:
        L92:
            if (r3 != r8) goto L98
            if (r7 == 0) goto L98
            int r3 = r7.icon
        L98:
            if (r3 != r8) goto La1
            r3 = 17301651(0x1080093, float:2.4979667E-38)
            r5 = 17301651(0x1080093, float:2.4979667E-38)
            goto La2
        La1:
            r5 = r3
        La2:
            if (r6 != 0) goto Laa
            if (r7 == 0) goto Laa
            java.lang.CharSequence r6 = r2.getApplicationLabel(r7)
        Laa:
            if (r6 != 0) goto Lb0
            java.lang.String r2 = "A message for you"
            r8 = r2
            goto Lb1
        Lb0:
            r8 = r6
        Lb1:
            r10 = r18
            r11 = r19
            android.content.Intent r10 = r10.m33645b(r11, r12, r13, r14, r15)
            com.mixpanel.android.mpmetrics.GCMReceiver$NotificationData r2 = new com.mixpanel.android.mpmetrics.GCMReceiver$NotificationData
            r12 = 0
            r4 = r2
            r6 = r17
            r7 = r1
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.GCMReceiver.m33641f(android.content.Context, android.content.Intent, com.mixpanel.android.mpmetrics.ResourceIds):com.mixpanel.android.mpmetrics.GCMReceiver$NotificationData");
    }

    /* renamed from: g */
    public final void m33640g(String str, String str2, String str3) {
        if (str != null && str2 != null) {
            MixpanelAPI.m33585o(new C9142c(str3, str, str2));
        }
    }

    @TargetApi(11)
    public Notification makeNotificationSDK11OrHigher(Context context, PendingIntent pendingIntent, NotificationData notificationData) {
        Notification.Builder defaults = new Notification.Builder(context).setSmallIcon(notificationData.icon).setTicker(notificationData.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationData.title).setContentText(notificationData.message).setContentIntent(pendingIntent).setDefaults(MPConfig.getInstance(context).getNotificationDefaults());
        if (notificationData.largeIcon != -1) {
            defaults.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), notificationData.largeIcon));
        }
        Notification notification = defaults.getNotification();
        notification.flags |= 16;
        return notification;
    }

    @SuppressLint({"NewApi"})
    @TargetApi(16)
    public Notification makeNotificationSDK16OrHigher(Context context, PendingIntent pendingIntent, NotificationData notificationData) {
        Notification.Builder defaults = new Notification.Builder(context).setSmallIcon(notificationData.icon).setTicker(notificationData.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationData.title).setContentText(notificationData.message).setContentIntent(pendingIntent).setStyle(new Notification.BigTextStyle().bigText(notificationData.message)).setDefaults(MPConfig.getInstance(context).getNotificationDefaults());
        if (notificationData.largeIcon != -1) {
            defaults.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), notificationData.largeIcon));
        }
        Notification build = defaults.build();
        build.flags |= 16;
        return build;
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    public Notification makeNotificationSDK21OrHigher(Context context, PendingIntent pendingIntent, NotificationData notificationData) {
        Notification.Builder defaults = new Notification.Builder(context).setTicker(notificationData.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationData.title).setContentText(notificationData.message).setContentIntent(pendingIntent).setStyle(new Notification.BigTextStyle().bigText(notificationData.message)).setDefaults(MPConfig.getInstance(context).getNotificationDefaults());
        int i = notificationData.whiteIcon;
        if (i != -1) {
            defaults.setSmallIcon(i);
        } else {
            defaults.setSmallIcon(notificationData.icon);
        }
        if (notificationData.largeIcon != -1) {
            defaults.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), notificationData.largeIcon));
        }
        int i2 = notificationData.color;
        if (i2 != -1) {
            defaults.setColor(i2);
        }
        Notification build = defaults.build();
        build.flags |= 16;
        return build;
    }

    @SuppressLint({"NewApi"})
    @TargetApi(26)
    public Notification makeNotificationSDK26OrHigher(Context context, PendingIntent pendingIntent, NotificationData notificationData) {
        Notification.Builder channelId;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        String notificationChannelId = MPConfig.getInstance(context).getNotificationChannelId();
        NotificationChannel m66215a = TI0.m66215a(notificationChannelId, MPConfig.getInstance(context).getNotificationChannelName(), MPConfig.getInstance(context).getNotificationChannelImportance());
        int notificationDefaults = MPConfig.getInstance(context).getNotificationDefaults();
        if (notificationDefaults == 2 || notificationDefaults == -1) {
            m66215a.enableVibration(true);
        }
        if (notificationDefaults == 4 || notificationDefaults == -1) {
            m66215a.enableLights(true);
            m66215a.setLightColor(-1);
        }
        notificationManager.createNotificationChannel(m66215a);
        channelId = new Notification.Builder(context).setTicker(notificationData.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationData.title).setContentText(notificationData.message).setContentIntent(pendingIntent).setStyle(new Notification.BigTextStyle().bigText(notificationData.message)).setChannelId(notificationChannelId);
        int i = notificationData.whiteIcon;
        if (i != -1) {
            channelId.setSmallIcon(i);
        } else {
            channelId.setSmallIcon(notificationData.icon);
        }
        if (notificationData.largeIcon != -1) {
            channelId.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), notificationData.largeIcon));
        }
        int i2 = notificationData.color;
        if (i2 != -1) {
            channelId.setColor(i2);
        }
        Notification build = channelId.build();
        build.flags |= 16;
        return build;
    }

    @TargetApi(9)
    public Notification makeNotificationSDKLessThan11(Context context, PendingIntent pendingIntent, NotificationData notificationData) {
        NotificationCompat.Builder defaults = new NotificationCompat.Builder(context).setSmallIcon(notificationData.icon).setTicker(notificationData.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationData.title).setContentText(notificationData.message).setContentIntent(pendingIntent).setDefaults(MPConfig.getInstance(context).getNotificationDefaults());
        if (notificationData.largeIcon != -1) {
            defaults.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), notificationData.largeIcon));
        }
        Notification notification = defaults.getNotification();
        notification.flags |= 16;
        return notification;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            m33642e(intent);
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
            m33643d(context, intent);
        }
    }
}
