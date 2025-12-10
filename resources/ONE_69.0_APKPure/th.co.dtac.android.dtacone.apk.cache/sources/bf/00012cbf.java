package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.Properties;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueAdditionalAdvanceFragment$setupView$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueAdditionalAdvanceFragment$setupView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleTrueAdditionalAdvanceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueAdditionalAdvanceFragment$setupView$1(OneDeviceSaleTrueAdditionalAdvanceFragment oneDeviceSaleTrueAdditionalAdvanceFragment) {
        super(0);
        this.this$0 = oneDeviceSaleTrueAdditionalAdvanceFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneDeviceSaleTrueViewModel viewModel;
        OneDeviceSaleTrueActivity m15073n;
        DataItem dataItem;
        Properties properties;
        viewModel = this.this$0.getViewModel();
        OneDeviceSaleTrueAdditionalAdvanceFragment oneDeviceSaleTrueAdditionalAdvanceFragment = this.this$0;
        List<DataItem> propositionList = viewModel.getOneModel().getPropositionList();
        viewModel.getShowDialogAdditionalPhoto().observe(oneDeviceSaleTrueAdditionalAdvanceFragment.getViewLifecycleOwner(), new OneDeviceSaleTrueAdditionalAdvanceFragment.C14546a(new OneDeviceSaleTrueAdditionalAdvanceFragment$setupView$1$1$1(oneDeviceSaleTrueAdditionalAdvanceFragment, (propositionList == null || (dataItem = propositionList.get(0)) == null || (properties = dataItem.getProperties()) == null || (r2 = properties.getTERM()) == null) ? "0" : "0", viewModel)));
        OneCampaignSaleTypeResponse.Data campaignSaleTypeResponse = viewModel.getOneModel().getCampaignSaleTypeResponse();
        if (campaignSaleTypeResponse != null ? Intrinsics.areEqual(campaignSaleTypeResponse.isChangePricePlan(), Boolean.TRUE) : false) {
            m15073n = oneDeviceSaleTrueAdditionalAdvanceFragment.m15073n();
            m15073n.replaceFragment(OneDeviceSaleTrueSelectPackageFragment.Companion.newInstance(), OneDeviceSaleTrueSelectPackageFragment.class.getName());
            return;
        }
        viewModel.getProductPrice();
    }
}