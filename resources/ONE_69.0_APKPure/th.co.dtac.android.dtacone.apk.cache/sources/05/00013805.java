package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.CampaignProductCategoryItem;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidCampaignListFragment$initView$4$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidCampaignListFragment$initView$4$1 extends Lambda implements Function1<CampaignProductCategoryItem, Unit> {
    final /* synthetic */ OnePostpaidCampaignListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCampaignListFragment$initView$4$1(OnePostpaidCampaignListFragment onePostpaidCampaignListFragment) {
        super(1);
        this.this$0 = onePostpaidCampaignListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CampaignProductCategoryItem campaignProductCategoryItem) {
        invoke2(campaignProductCategoryItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CampaignProductCategoryItem item) {
        OneCustomClearableEditText oneCustomClearableEditText;
        OnePostpaidRegistrationViewModel viewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        this.this$0.getViewModelCampaign().setCampaignItem(item);
        this.this$0.getViewModelCampaign().getVerificationList().clear();
        oneCustomClearableEditText = this.this$0.f94233l;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtSearch");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText("");
        viewModel = this.this$0.getViewModel();
        viewModel.getCampaignSaleType(item.getVerifyKeyList());
    }
}