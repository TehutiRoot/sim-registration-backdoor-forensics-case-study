package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.CampaignProductCategoryItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignInfoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidCampaignAdapter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignInfoResponse$Data;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidCampaignListFragment$initView$5$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidCampaignListFragment$initView$5$1 extends Lambda implements Function1<Resource<? extends OneCampaignInfoResponse.Data>, Unit> {
    final /* synthetic */ OnePostpaidCampaignListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCampaignListFragment$initView$5$1(OnePostpaidCampaignListFragment onePostpaidCampaignListFragment) {
        super(1);
        this.this$0 = onePostpaidCampaignListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneCampaignInfoResponse.Data> resource) {
        invoke2((Resource<OneCampaignInfoResponse.Data>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneCampaignInfoResponse.Data> resource) {
        Resource<OneCampaignInfoResponse.Data> resourceContentIfNotHandled;
        OneCampaignInfoResponse.Data data;
        List<CampaignProductCategoryItem> campaignProductCategory;
        LinearLayoutCompat linearLayoutCompat;
        CardView cardView;
        OnePostpaidCampaignAdapter m12015s;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePostpaidCampaignListFragment onePostpaidCampaignListFragment = this.this$0;
        if (resourceContentIfNotHandled.getStatus() != StatusResource.SUCCESS || (data = resourceContentIfNotHandled.getData()) == null || (campaignProductCategory = data.getCampaignProductCategory()) == null) {
            return;
        }
        linearLayoutCompat = onePostpaidCampaignListFragment.f94240s;
        CardView cardView2 = null;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            linearLayoutCompat = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat);
        cardView = onePostpaidCampaignListFragment.f94241t;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardView");
        } else {
            cardView2 = cardView;
        }
        ViewVisibleExtKt.toVisible(cardView2);
        m12015s = onePostpaidCampaignListFragment.m12015s();
        m12015s.update(campaignProductCategory);
    }
}