package th.p047co.dtac.android.dtacone.life_cycle.mixpanel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/life_cycle/mixpanel/MixpanelObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "mixpanelAPI", "<init>", "(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V", "", "onCleanPresenter", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "getMixpanelAPI", "()Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.life_cycle.mixpanel.MixpanelObserver */
/* loaded from: classes7.dex */
public final class MixpanelObserver implements LifecycleObserver {
    public static final int $stable = 8;

    /* renamed from: a */
    public final MixpanelAPI f84774a;

    public MixpanelObserver(@NotNull MixpanelAPI mixpanelAPI) {
        Intrinsics.checkNotNullParameter(mixpanelAPI, "mixpanelAPI");
        this.f84774a = mixpanelAPI;
    }

    @NotNull
    public final MixpanelAPI getMixpanelAPI() {
        return this.f84774a;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onCleanPresenter() {
        this.f84774a.flush();
    }
}
