package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package.PriceplanListItem;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/PriceplanListItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTruePackageListFragment$initView$6$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidTruePackageListFragment$initView$6$1 extends Lambda implements Function1<PriceplanListItem, Unit> {
    final /* synthetic */ OnePostpaidTruePackageListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidTruePackageListFragment$initView$6$1(OnePostpaidTruePackageListFragment onePostpaidTruePackageListFragment) {
        super(1);
        this.this$0 = onePostpaidTruePackageListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriceplanListItem priceplanListItem) {
        invoke2(priceplanListItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PriceplanListItem item) {
        OnePostpaidRegistrationViewModel viewModel;
        OnePostpaidRegistrationActivity m11873s;
        OneCustomClearableEditText oneCustomClearableEditText;
        OnePostpaidRegistrationViewModel viewModel2;
        Intrinsics.checkNotNullParameter(item, "item");
        this.this$0.getViewModelCampaign().setPackageTrueItem(item);
        viewModel = this.this$0.getViewModel();
        if (viewModel.isWithDevice()) {
            viewModel2 = this.this$0.getViewModel();
            viewModel2.getProductPrice();
        } else {
            m11873s = this.this$0.m11873s();
            m11873s.replaceFragment(OnePostpaidTrueMailingFragment.Companion.newInstance(), OnePostpaidTrueMailingFragment.class.getName());
        }
        oneCustomClearableEditText = this.this$0.f94402l;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtSearch");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText("");
    }
}