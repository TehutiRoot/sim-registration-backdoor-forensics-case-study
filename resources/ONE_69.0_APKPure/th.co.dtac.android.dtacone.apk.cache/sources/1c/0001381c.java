package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ProductMasterInfoItem;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.adapter.OnePostpaidMaterialCodeAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ProductMasterInfoItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidMaterialCodeFragment$initView$2$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidMaterialCodeFragment$initView$2$1 extends Lambda implements Function1<ProductMasterInfoItem, Unit> {
    final /* synthetic */ OnePostpaidMaterialCodeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidMaterialCodeFragment$initView$2$1(OnePostpaidMaterialCodeFragment onePostpaidMaterialCodeFragment) {
        super(1);
        this.this$0 = onePostpaidMaterialCodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductMasterInfoItem productMasterInfoItem) {
        invoke2(productMasterInfoItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ProductMasterInfoItem item) {
        OnePostpaidRegistrationViewModel viewModel;
        OnePostpaidMaterialCodeAdapter m11981q;
        OnePostpaidRegistrationActivity m11980r;
        OneCustomClearableEditText oneCustomClearableEditText;
        Intrinsics.checkNotNullParameter(item, "item");
        viewModel = this.this$0.getViewModel();
        viewModel.setMaterialSelected(item);
        m11981q = this.this$0.m11981q();
        m11981q.clear();
        m11980r = this.this$0.m11980r();
        m11980r.replaceFragment(OnePostpaidCampaignListFragment.Companion.newInstance(), OnePostpaidCampaignListFragment.TAG);
        oneCustomClearableEditText = this.this$0.f94281p;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtSearch");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText("");
    }
}