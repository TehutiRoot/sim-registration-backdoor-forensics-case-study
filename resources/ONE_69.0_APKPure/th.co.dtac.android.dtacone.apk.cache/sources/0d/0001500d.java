package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.postpaid_validation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ServiceMenu;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageForNewIDResponse;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidationViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "position", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.postpaid_validation.MrtrPostpaidValidationSpecialPackageFragment$initView$1$1$itemAdapter$1$1 */
/* loaded from: classes9.dex */
public final class C16288x6d2f3720 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ SpecialPackageForNewIDResponse $item;
    final /* synthetic */ MrtrPostpaidValidationViewModel $this_run;
    final /* synthetic */ MrtrPostpaidValidationSpecialPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16288x6d2f3720(MrtrPostpaidValidationSpecialPackageFragment mrtrPostpaidValidationSpecialPackageFragment, MrtrPostpaidValidationViewModel mrtrPostpaidValidationViewModel, SpecialPackageForNewIDResponse specialPackageForNewIDResponse) {
        super(1);
        this.this$0 = mrtrPostpaidValidationSpecialPackageFragment;
        this.$this_run = mrtrPostpaidValidationViewModel;
        this.$item = specialPackageForNewIDResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        if (this.this$0.getViewModelPostpaidValidation().hasAuthorizationScreen(PermissionConstant.M_REGS_POST)) {
            this.$this_run.SetSpecialPackageItem(this.$item.getSpecialPackage().get(i));
            this.this$0.getViewModel().getAuthorizationByRTR(PermissionConstant.M_ELIGIBLE);
            return;
        }
        CustomDialogBox customDialogBox = new CustomDialogBox(this.this$0.getContext());
        customDialogBox.setMessage(this.this$0.getString(new ServiceMenu.M_REGS_POST_NEW(null, 0, 0, 0, 0, 0, 63, null).getStringNoAuthRes()));
        customDialogBox.show();
    }
}