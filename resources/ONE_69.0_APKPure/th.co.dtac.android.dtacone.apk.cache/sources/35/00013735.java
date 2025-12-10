package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ServiceMenu;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageForNewIDResponse;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "position", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidValidationSpecialPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidValidationSpecialPackageFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidValidationSpecialPackageFragment$initView$1$1$itemAdapter$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidValidationSpecialPackageFragment$initView$1$1$itemAdapter$1$1 */
/* loaded from: classes10.dex */
public final class C14910x87f8e5bd extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ SpecialPackageForNewIDResponse $item;
    final /* synthetic */ OnePostpaidValidationViewModel $this_run;
    final /* synthetic */ OnePostpaidValidationSpecialPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14910x87f8e5bd(OnePostpaidValidationSpecialPackageFragment onePostpaidValidationSpecialPackageFragment, OnePostpaidValidationViewModel onePostpaidValidationViewModel, SpecialPackageForNewIDResponse specialPackageForNewIDResponse) {
        super(1);
        this.this$0 = onePostpaidValidationSpecialPackageFragment;
        this.$this_run = onePostpaidValidationViewModel;
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
            this.this$0.getViewModel().getAuthorization(PermissionConstant.M_ELIGIBLE);
            return;
        }
        Context context = this.this$0.getContext();
        OneCustomDialogBox oneCustomDialogBox = context != null ? new OneCustomDialogBox(context) : null;
        if (oneCustomDialogBox != null) {
            oneCustomDialogBox.setMessage(this.this$0.getString(new ServiceMenu.M_REGS_POST_NEW(null, 0, 0, 0, 0, 0, 63, null).getStringNoAuthRes()));
            oneCustomDialogBox.show();
        }
    }
}