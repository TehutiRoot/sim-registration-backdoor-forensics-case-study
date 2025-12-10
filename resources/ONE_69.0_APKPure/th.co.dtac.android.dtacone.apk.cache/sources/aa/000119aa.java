package th.p047co.dtac.android.dtacone.manager.messaging;

import android.content.Context;
import android.media.RingtoneManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/manager/messaging/DtacOneNotification;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/core/app/NotificationCompat$Builder;", "notification", "(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getNOTIFICATION_REQUEST_CODE", "()I", "getNOTIFICATION_REQUEST_CODE$annotations", "NOTIFICATION_REQUEST_CODE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.messaging.DtacOneNotification */
/* loaded from: classes7.dex */
public final class DtacOneNotification {
    public static final int $stable = 0;
    @NotNull
    public static final DtacOneNotification INSTANCE = new DtacOneNotification();

    /* renamed from: a */
    public static final int f85068a = 1;

    public static final int getNOTIFICATION_REQUEST_CODE() {
        return f85068a;
    }

    @JvmStatic
    public static /* synthetic */ void getNOTIFICATION_REQUEST_CODE$annotations() {
    }

    @NotNull
    public final NotificationCompat.Builder notification(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationCompat.Builder sound = new NotificationCompat.Builder(context, "news_channel").setSmallIcon(R.drawable.ic_dtac).setSound(RingtoneManager.getDefaultUri(2)).setAutoCancel(true).setLights(-16776961, 1000, 300).setDefaults(2).setSound(RingtoneManager.getDefaultUri(2));
        Intrinsics.checkNotNullExpressionValue(sound, "Builder(context, \"news_c…setSound(defaultSoundUri)");
        return sound;
    }
}