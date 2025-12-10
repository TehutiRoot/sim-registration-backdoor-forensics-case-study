package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.ProductData;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public class MessagingAnalytics {
    /* renamed from: a */
    public static boolean m38485a() {
        Context applicationContext;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            applicationContext = FirebaseApp.getInstance().getApplicationContext();
            sharedPreferences = applicationContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* renamed from: b */
    public static MessagingClientEvent m38484b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder messageType = MessagingClientEvent.newBuilder().setTtl(m38470p(extras)).setEvent(event).setInstanceId(m38480f(extras)).setPackageName(m38473m()).setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(m38475k(extras));
        String m38478h = m38478h(extras);
        if (m38478h != null) {
            messageType.setMessageId(m38478h);
        }
        String m38471o = m38471o(extras);
        if (m38471o != null) {
            messageType.setTopic(m38471o);
        }
        String m38483c = m38483c(extras);
        if (m38483c != null) {
            messageType.setCollapseKey(m38483c);
        }
        String m38477i = m38477i(extras);
        if (m38477i != null) {
            messageType.setAnalyticsLabel(m38477i);
        }
        String m38481e = m38481e(extras);
        if (m38481e != null) {
            messageType.setComposerLabel(m38481e);
        }
        long m38472n = m38472n(extras);
        if (m38472n > 0) {
            messageType.setProjectNumber(m38472n);
        }
        return messageType.build();
    }

    /* renamed from: c */
    public static String m38483c(Bundle bundle) {
        return bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    /* renamed from: d */
    public static String m38482d(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
    }

    /* renamed from: e */
    public static String m38481e(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    /* renamed from: f */
    public static String m38480f(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.f55600TO);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public static String m38479g(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    /* renamed from: h */
    public static String m38478h(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.MSGID);
        if (string == null) {
            return bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        return string;
    }

    /* renamed from: i */
    public static String m38477i(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    /* renamed from: j */
    public static String m38476j(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    /* renamed from: k */
    public static MessagingClientEvent.MessageType m38475k(Bundle bundle) {
        if (bundle != null && NotificationParams.isNotification(bundle)) {
            return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
        }
        return MessagingClientEvent.MessageType.DATA_MESSAGE;
    }

    /* renamed from: l */
    public static String m38474l(Bundle bundle) {
        if (bundle != null && NotificationParams.isNotification(bundle)) {
            return Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
        }
        return "data";
    }

    public static void logNotificationDismiss(Intent intent) {
        m38466t(Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent.getExtras());
    }

    public static void logNotificationForeground(Intent intent) {
        m38466t(Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent.getExtras());
    }

    public static void logNotificationOpen(Bundle bundle) {
        m38464v(bundle);
        m38466t(Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, bundle);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            m38466t(Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            m38467s(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    /* renamed from: m */
    public static String m38473m() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    /* renamed from: n */
    public static long m38472n(Bundle bundle) {
        if (bundle.containsKey(Constants.MessagePayloadKeys.SENDER_ID)) {
            try {
                return Long.parseLong(bundle.getString(Constants.MessagePayloadKeys.SENDER_ID));
            } catch (NumberFormatException e) {
                Log.w(Constants.TAG, "error parsing project number", e);
            }
        }
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException e2) {
                Log.w(Constants.TAG, "error parsing sender ID", e2);
            }
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            try {
                return Long.parseLong(applicationId);
            } catch (NumberFormatException e3) {
                Log.w(Constants.TAG, "error parsing app ID", e3);
            }
        } else {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w(Constants.TAG, "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    public static String m38471o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    public static int m38470p(Bundle bundle) {
        Object obj = bundle.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(Constants.TAG, "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    public static String m38469q(Bundle bundle) {
        if (bundle.containsKey(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return bundle.getString(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m38468r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m38467s(MessagingClientEvent.Event event, Intent intent, TransportFactory transportFactory) {
        MessagingClientEvent m38484b;
        if (transportFactory == null || (m38484b = m38484b(event, intent)) == null) {
            return;
        }
        try {
            transportFactory.getTransport(Constants.FirelogAnalytics.FCM_LOG_SOURCE, MessagingClientEventExtension.class, Encoding.m49169of("proto"), new Transformer() { // from class: ps0
                @Override // com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return ((MessagingClientEventExtension) obj).toByteArray();
                }
            }).send(Event.ofData(MessagingClientEventExtension.newBuilder().setMessagingClientEvent(m38484b).build(), ProductData.withProductId(Integer.valueOf(intent.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 111881503)))));
        } catch (RuntimeException e) {
            Log.w(Constants.TAG, "Failed to send big query analytics payload.", e);
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent != null && !m38468r(intent)) {
            return m38485a();
        }
        return false;
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || m38468r(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    /* renamed from: t */
    public static void m38466t(String str, Bundle bundle) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m38482d = m38482d(bundle);
            if (m38482d != null) {
                bundle2.putString("_nmid", m38482d);
            }
            String m38481e = m38481e(bundle);
            if (m38481e != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, m38481e);
            }
            String m38477i = m38477i(bundle);
            if (!TextUtils.isEmpty(m38477i)) {
                bundle2.putString("label", m38477i);
            }
            String m38479g = m38479g(bundle);
            if (!TextUtils.isEmpty(m38479g)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, m38479g);
            }
            String m38471o = m38471o(bundle);
            if (m38471o != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_TOPIC, m38471o);
            }
            String m38476j = m38476j(bundle);
            if (m38476j != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(m38476j));
                } catch (NumberFormatException e) {
                    Log.w(Constants.TAG, "Error while parsing timestamp in GCM event", e);
                }
            }
            String m38469q = m38469q(bundle);
            if (m38469q != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(m38469q));
                } catch (NumberFormatException e2) {
                    Log.w(Constants.TAG, "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String m38474l = m38474l(bundle);
            if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, m38474l);
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(bundle2);
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent("fcm", str, bundle2);
            } else {
                Log.w(Constants.TAG, "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: u */
    public static void m38465u(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    /* renamed from: v */
    public static void m38464v(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            Log.isLoggable(Constants.TAG, 3);
            if (analyticsConnector != null) {
                String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
                analyticsConnector.setUserProperty("fcm", Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                analyticsConnector.logEvent("fcm", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle2);
                return;
            }
            Log.w(Constants.TAG, "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        Log.isLoggable(Constants.TAG, 3);
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.ENABLED));
    }
}
