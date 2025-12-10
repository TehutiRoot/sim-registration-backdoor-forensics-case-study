package th.p047co.dtac.android.dtacone.manager.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;
import th.p047co.dtac.android.dtacone.view.activity.notification.NewsNotificationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.notification.activity.OneNewsNotificationActivity;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/messaging/MessagingReceiver;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", "newsId", "", "notificationId", "Landroid/app/PendingIntent;", "p", "(Ljava/lang/String;I)Landroid/app/PendingIntent;", OperatorName.SAVE, "(Lcom/google/firebase/messaging/RemoteMessage;I)V", "userName", "Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "o", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.MessagingReceiver */
/* loaded from: classes7.dex */
public class MessagingReceiver extends FirebaseMessagingService {
    public static final int $stable = 0;

    /* renamed from: o */
    public final UserNameType m19252o(String str) {
        if (new Regex("[0-9]+").matches(str)) {
            return UserNameType.TELEPHONE_NUMBER.INSTANCE;
        }
        return UserNameType.USER_LAN.INSTANCE;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        m19250q(remoteMessage, (int) System.currentTimeMillis());
    }

    /* renamed from: p */
    public final PendingIntent m19251p(String str, int i) {
        SharedPreferences sharedPreferences = getSharedPreferences("th.co.dtac.android.dtacone_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(filename, MODE_PRIVATE)");
        String str2 = "";
        String string = sharedPreferences.getString(Constant.SHARE_REMEMBER_USERNAME, "");
        if (string != null) {
            str2 = string;
        }
        boolean z = sharedPreferences.getBoolean(Constant.REGISTER_LEVEL_PROMOTER, false);
        if (str2.length() > 0 && Intrinsics.areEqual(m19252o(str2), UserNameType.TELEPHONE_NUMBER.INSTANCE) && !z) {
            Intent intent = new Intent(this, OneNewsNotificationActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("EXTRA_NEWS_ID", str);
            PendingIntent activity = PendingIntent.getActivity(this, i, intent, 1107296256);
            Intrinsics.checkNotNullExpressionValue(activity, "{\n            val newsIn…t.FLAG_MUTABLE)\n        }");
            return activity;
        }
        Intent intent2 = new Intent(this, NewsNotificationActivity.class);
        intent2.setFlags(67108864);
        intent2.putExtra("EXTRA_NEWS_ID", str);
        PendingIntent activity2 = PendingIntent.getActivity(this, i, intent2, 1107296256);
        Intrinsics.checkNotNullExpressionValue(activity2, "{\n            val newsIn…t.FLAG_MUTABLE)\n        }");
        return activity2;
    }

    /* renamed from: q */
    public final void m19250q(RemoteMessage remoteMessage, int i) {
        String body;
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        String str = remoteMessage.getData().get("newsId");
        NotificationCompat.Builder notification2 = DtacOneNotification.INSTANCE.notification(this);
        String str2 = "";
        notification2.setContentTitle((notification == null || (r3 = notification.getTitle()) == null) ? "" : "");
        if (notification != null && (body = notification.getBody()) != null) {
            str2 = body;
        }
        notification2.setContentText(str2);
        notification2.setContentIntent(m19251p(str, i));
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(i, notification2.build());
    }
}
