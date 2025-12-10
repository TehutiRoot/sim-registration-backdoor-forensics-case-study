package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectCampaignFragment$setupObserve$1$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSelectCampaignFragment$setupObserve$1$3 extends Lambda implements Function1<Resource<? extends ErrorCollection>, Unit> {
    final /* synthetic */ OneDeviceSaleTrueSelectCampaignFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSelectCampaignFragment$setupObserve$1$3(OneDeviceSaleTrueSelectCampaignFragment oneDeviceSaleTrueSelectCampaignFragment) {
        super(1);
        this.this$0 = oneDeviceSaleTrueSelectCampaignFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ErrorCollection> resource) {
        invoke2((Resource<ErrorCollection>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ErrorCollection> resource) {
        Resource<ErrorCollection> resourceContentIfNotHandled;
        LinearLayoutCompat linearLayoutCompat;
        CardView cardView;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneDeviceSaleTrueSelectCampaignFragment oneDeviceSaleTrueSelectCampaignFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
            linearLayoutCompat = oneDeviceSaleTrueSelectCampaignFragment.f89857n;
            CardView cardView2 = null;
            if (linearLayoutCompat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneDeviceSaleSelectCampaignRetryLayout");
                linearLayoutCompat = null;
            }
            ViewVisibleExtKt.toVisible(linearLayoutCompat);
            cardView = oneDeviceSaleTrueSelectCampaignFragment.f89858o;
            if (cardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneDeviceSaleSelectCampaignCardView");
            } else {
                cardView2 = cardView;
            }
            ViewVisibleExtKt.toGone(cardView2);
        }
    }
}