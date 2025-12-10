package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterInfoItem;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidMaterialCodeAdapter;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectMaterialFragment$initView$2$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueSelectMaterialFragment$initView$2$1 extends Lambda implements Function1<ProductMasterInfoItem, Unit> {
    final /* synthetic */ OneDeviceSaleTrueSelectMaterialFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueSelectMaterialFragment$initView$2$1(OneDeviceSaleTrueSelectMaterialFragment oneDeviceSaleTrueSelectMaterialFragment) {
        super(1);
        this.this$0 = oneDeviceSaleTrueSelectMaterialFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductMasterInfoItem productMasterInfoItem) {
        invoke2(productMasterInfoItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ProductMasterInfoItem item) {
        OneDeviceSaleTrueViewModel viewModel;
        OneDeviceSaleTrueActivity m14989r;
        OneCustomClearableEditText oneCustomClearableEditText;
        OnePostpaidMaterialCodeAdapter m14990q;
        Intrinsics.checkNotNullParameter(item, "item");
        viewModel = this.this$0.getViewModel();
        viewModel.getOneModel().setSelectedMaterial(item);
        m14989r = this.this$0.m14989r();
        m14989r.replaceFragment(OneDeviceSaleTrueSelectCampaignFragment.Companion.newInstance(), OneDeviceSaleTrueSelectCampaignFragment.TAG);
        oneCustomClearableEditText = this.this$0.f89872k;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneDeviceSaleSelectMaterialSearchEditText");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText("");
        m14990q = this.this$0.m14990q();
        m14990q.update(CollectionsKt__CollectionsKt.emptyList(), "", "");
    }
}