package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.DataItem;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/DataItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidPropositionFragment$initView$5$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidPropositionFragment$initView$5$1 extends Lambda implements Function1<DataItem, Unit> {
    final /* synthetic */ OnePostpaidPropositionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPropositionFragment$initView$5$1(OnePostpaidPropositionFragment onePostpaidPropositionFragment) {
        super(1);
        this.this$0 = onePostpaidPropositionFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DataItem dataItem) {
        invoke2(dataItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DataItem item) {
        OnePostpaidRegistrationViewModel viewModel;
        OnePostpaidRegistrationViewModel viewModel2;
        OnePostpaidRegistrationActivity m11943s;
        OneCustomClearableEditText oneCustomClearableEditText;
        OnePostpaidRegistrationViewModel viewModel3;
        Intrinsics.checkNotNullParameter(item, "item");
        this.this$0.getViewModelCampaign().setPropositionTrueItem(item);
        viewModel = this.this$0.getViewModel();
        viewModel.clearPricePlans();
        viewModel2 = this.this$0.getViewModel();
        OneCustomClearableEditText oneCustomClearableEditText2 = null;
        if (viewModel2.isWithDevice()) {
            viewModel3 = this.this$0.getViewModel();
            viewModel3.getPropositionRebate();
        } else {
            m11943s = this.this$0.m11943s();
            m11943s.replaceFragment(OnePostpaidTruePackageListFragment.Companion.newInstance(), null);
        }
        oneCustomClearableEditText = this.this$0.f94331s;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtSearch");
        } else {
            oneCustomClearableEditText2 = oneCustomClearableEditText;
        }
        oneCustomClearableEditText2.setText("");
    }
}