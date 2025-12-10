package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.model.MrtrPostpaidStatusFlow;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/model/MrtrPostpaidStatusFlow;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device.MrtrPostpaidBlacklistSharingConsentFragment$navigateExtraAdvance$1 */
/* loaded from: classes9.dex */
public final class C16317x5ab39bd8 extends Lambda implements Function1<MrtrPostpaidStatusFlow, Unit> {
    final /* synthetic */ MrtrPostpaidBlacklistSharingConsentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16317x5ab39bd8(MrtrPostpaidBlacklistSharingConsentFragment mrtrPostpaidBlacklistSharingConsentFragment) {
        super(1);
        this.this$0 = mrtrPostpaidBlacklistSharingConsentFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidStatusFlow mrtrPostpaidStatusFlow) {
        invoke2(mrtrPostpaidStatusFlow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull MrtrPostpaidStatusFlow status) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(status, "status");
        function1 = this.this$0.f102978q;
        if (function1 != null) {
            function1.invoke(status);
        }
    }
}