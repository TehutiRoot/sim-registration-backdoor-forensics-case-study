package th.p047co.dtac.android.dtacone.util;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.ContextExtenKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/UpdatePromotionAlert;", "Lth/co/dtac/android/dtacone/util/ToastAlertState;", "()V", "show", "", "activity", "Landroid/app/Activity;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.UpdatePromotionAlert */
/* loaded from: classes8.dex */
public final class UpdatePromotionAlert implements ToastAlertState {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.ToastAlertState
    public void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = activity.getString(R.string.device_sale_change_promotion_success);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…change_promotion_success)");
        ContextExtenKt.showToastCenterLong(activity, string);
    }
}