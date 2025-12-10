package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneOnlineRegisterPasswordRule;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.MrtrOnlineRegisterCreateRetailerProfile;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationSetNewPasswordFragment$setupView$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationSetNewPasswordFragment$setupView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneOnlineRegistrationSetNewPasswordFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationSetNewPasswordFragment$setupView$1(OneOnlineRegistrationSetNewPasswordFragment oneOnlineRegistrationSetNewPasswordFragment) {
        super(0);
        this.this$0 = oneOnlineRegistrationSetNewPasswordFragment;
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
        OneTextInputLayoutPhone oneTextInputLayoutPhone;
        OneOnlineRegisterViewModel viewModel;
        OneOnlineRegisterViewModel viewModel2;
        try {
            oneTextInputLayoutText = this.this$0.f92817j;
            OneTextInputLayoutPhone oneTextInputLayoutPhone2 = null;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setNewPasswordEditText");
                oneTextInputLayoutText = null;
            }
            String obj = StringsKt__StringsKt.trim(oneTextInputLayoutText.getText()).toString();
            oneTextInputLayoutText2 = this.this$0.f92818k;
            if (oneTextInputLayoutText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmSetNewPasswordEditText");
                oneTextInputLayoutText2 = null;
            }
            String obj2 = StringsKt__StringsKt.trim(oneTextInputLayoutText2.getText()).toString();
            oneTextInputLayoutPhone = this.this$0.f92819l;
            if (oneTextInputLayoutPhone == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setNewPasswordPhoneNumberEditText");
            } else {
                oneTextInputLayoutPhone2 = oneTextInputLayoutPhone;
            }
            new OneOnlineRegisterPasswordRule().validate(new OneAddNewStaff(null, StringsKt__StringsKt.trim(oneTextInputLayoutPhone2.getText()).toString(), obj, obj2, null, null, null, 113, null));
            viewModel = this.this$0.getViewModel();
            MrtrOnlineRegisterCreateRetailerProfile submitCollection = viewModel.getSubmitCollection();
            if (submitCollection != null) {
                submitCollection.setPassword(viewModel.encryptString(obj));
            }
            viewModel2 = this.this$0.getViewModel();
            viewModel2.submitOnlineRegister();
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}