package th.p047co.dtac.android.dtacone.view.appOne.change_password.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneChangePasswordRule;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$actionConfirm$1 */
/* loaded from: classes10.dex */
public final class OneInputChangePasswordFragment$actionConfirm$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneInputChangePasswordFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputChangePasswordFragment$actionConfirm$1(OneInputChangePasswordFragment oneInputChangePasswordFragment) {
        super(0);
        this.this$0 = oneInputChangePasswordFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneTextInputLayoutText oneTextInputLayoutText;
        OneTextInputLayoutText oneTextInputLayoutText2;
        OneTextInputLayoutText oneTextInputLayoutText3;
        OneChangePasswordViewModel m15280r;
        OneChangePasswordViewModel m15280r2;
        OneChangePasswordViewModel m15280r3;
        try {
            oneTextInputLayoutText = this.this$0.f89455j;
            OneTextInputLayoutText oneTextInputLayoutText4 = null;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtOldPassword");
                oneTextInputLayoutText = null;
            }
            String str = oneTextInputLayoutText.getText().toString();
            oneTextInputLayoutText2 = this.this$0.f89456k;
            if (oneTextInputLayoutText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtNewPassword");
                oneTextInputLayoutText2 = null;
            }
            String str2 = oneTextInputLayoutText2.getText().toString();
            oneTextInputLayoutText3 = this.this$0.f89457l;
            if (oneTextInputLayoutText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtConfirmNewPassword");
            } else {
                oneTextInputLayoutText4 = oneTextInputLayoutText3;
            }
            OneChangePassword oneChangePassword = new OneChangePassword(str, str2, oneTextInputLayoutText4.getText().toString(), null, 8, null);
            m15280r = this.this$0.m15280r();
            OneChangePassword changePasswordData = m15280r.getChangePasswordData();
            if (changePasswordData != null) {
                changePasswordData.setOldPassword(oneChangePassword.getOldPassword());
            }
            m15280r2 = this.this$0.m15280r();
            OneChangePassword changePasswordData2 = m15280r2.getChangePasswordData();
            if (changePasswordData2 != null) {
                changePasswordData2.setPassword(oneChangePassword.getPassword());
            }
            new OneChangePasswordRule().validate(oneChangePassword);
            m15280r3 = this.this$0.m15280r();
            m15280r3.checkForgotPassword();
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}