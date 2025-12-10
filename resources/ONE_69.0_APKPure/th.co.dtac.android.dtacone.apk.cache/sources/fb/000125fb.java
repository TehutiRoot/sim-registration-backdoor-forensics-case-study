package th.p047co.dtac.android.dtacone.presenter.withDevice;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.CheckInputUssdResponse;
import th.p047co.dtac.android.dtacone.presenter.withDevice.WithDeviceSelectCampaignPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CheckInputUssdResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.withDevice.WithDeviceSelectCampaignPresenter$checkInputUssd$2 */
/* loaded from: classes8.dex */
public final class WithDeviceSelectCampaignPresenter$checkInputUssd$2 extends Lambda implements Function1<CheckInputUssdResponse, Unit> {
    final /* synthetic */ WithDeviceSelectCampaignPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithDeviceSelectCampaignPresenter$checkInputUssd$2(WithDeviceSelectCampaignPresenter withDeviceSelectCampaignPresenter) {
        super(1);
        this.this$0 = withDeviceSelectCampaignPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckInputUssdResponse checkInputUssdResponse) {
        invoke2(checkInputUssdResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CheckInputUssdResponse it) {
        WithDeviceSelectCampaignPresenter.View view;
        WithDeviceSelectCampaignPresenter.View view2;
        WithDeviceSelectCampaignPresenter.View view3 = null;
        if (it.getRequireUssdCode()) {
            view2 = this.this$0.f86783d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view3.gotoDiscountPage(it);
            return;
        }
        view = this.this$0.f86783d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.gotoDetailPage(it);
    }
}