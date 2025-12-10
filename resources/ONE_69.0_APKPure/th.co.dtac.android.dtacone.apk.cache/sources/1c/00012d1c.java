package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.CampaignProductCategoryItem;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/CampaignProductCategoryItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectCampaignFragment$initView$4$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSelectCampaignFragment$initView$4$1 extends Lambda implements Function1<CampaignProductCategoryItem, Unit> {
    final /* synthetic */ OneDeviceSaleTrueSelectCampaignFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSelectCampaignFragment$initView$4$1(OneDeviceSaleTrueSelectCampaignFragment oneDeviceSaleTrueSelectCampaignFragment) {
        super(1);
        this.this$0 = oneDeviceSaleTrueSelectCampaignFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CampaignProductCategoryItem campaignProductCategoryItem) {
        invoke2(campaignProductCategoryItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CampaignProductCategoryItem item) {
        OneDeviceSaleTrueViewModel viewModel;
        OneDeviceSaleTrueViewModel viewModel2;
        OneCustomClearableEditText oneCustomClearableEditText;
        OneDeviceSaleTrueViewModel viewModel3;
        Intrinsics.checkNotNullParameter(item, "item");
        viewModel = this.this$0.getViewModel();
        viewModel.getOneModel().setCampaignTrueItem(item);
        viewModel2 = this.this$0.getViewModel();
        viewModel2.getOneModel().getVerificationList().clear();
        oneCustomClearableEditText = this.this$0.f89854k;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneDeviceSaleSelectCampaignEditText");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText("");
        viewModel3 = this.this$0.getViewModel();
        viewModel3.getCampaignSaleType();
    }
}