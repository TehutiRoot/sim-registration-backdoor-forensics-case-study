package th.p047co.dtac.android.dtacone.view.appOne.forgot_password.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneForgotPasswordRule;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneInputForgotPasswordBinding;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.forgot_password.activity.OneForgotPasswordActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment$actionConfirm$1 */
/* loaded from: classes10.dex */
public final class OneInputForgotPasswordFragment$actionConfirm$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneInputForgotPasswordFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputForgotPasswordFragment$actionConfirm$1(OneInputForgotPasswordFragment oneInputForgotPasswordFragment) {
        super(0);
        this.this$0 = oneInputForgotPasswordFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentOneInputForgotPasswordBinding m14302o;
        FragmentOneInputForgotPasswordBinding m14302o2;
        FragmentOneInputForgotPasswordBinding m14302o3;
        OneForgotPasswordViewModel m14300q;
        OneForgotPasswordViewModel m14300q2;
        OneForgotPasswordViewModel m14300q3;
        OneForgotPasswordActivity m14301p;
        try {
            m14302o = this.this$0.m14302o();
            String str = m14302o.edtVerifyOTP.getText().toString();
            m14302o2 = this.this$0.m14302o();
            String str2 = m14302o2.edtNewPassword.getText().toString();
            m14302o3 = this.this$0.m14302o();
            OneForgotPassword oneForgotPassword = new OneForgotPassword(null, str, str2, m14302o3.edtConfirmNewPassword.getText().toString(), null, 17, null);
            m14300q = this.this$0.m14300q();
            OneForgotPassword forgotPasswordData = m14300q.getForgotPasswordData();
            if (forgotPasswordData != null) {
                forgotPasswordData.setVerifyOTP(oneForgotPassword.getVerifyOTP());
            }
            m14300q2 = this.this$0.m14300q();
            OneForgotPassword forgotPasswordData2 = m14300q2.getForgotPasswordData();
            if (forgotPasswordData2 != null) {
                forgotPasswordData2.setPassword(oneForgotPassword.getPassword());
            }
            new OneForgotPasswordRule().validate(oneForgotPassword);
            m14300q3 = this.this$0.m14300q();
            m14301p = this.this$0.m14301p();
            m14300q3.verifyOTP(!m14301p.isFirstLogin() ? Constant.EVENT_FORGOT_PASSWORD : Constant.EVENT_FIRST_LOGIN);
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}