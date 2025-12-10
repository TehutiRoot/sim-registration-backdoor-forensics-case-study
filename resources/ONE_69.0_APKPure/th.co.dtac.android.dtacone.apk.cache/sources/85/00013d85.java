package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneRegistrationIDRule;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneRegistrationOTPRule;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneRegistrationPassWordRule;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment$actionRegister$1 */
/* loaded from: classes10.dex */
public final class OneSetPasswordFragment$actionRegister$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneSetPasswordFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment$actionRegister$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegistrationType.values().length];
            try {
                iArr[RegistrationType.PhoneOnlyOne.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegistrationType.PhoneMultiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegistrationType.RtrCodeOnlyOne.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RegistrationType.RtrCodeMultiple.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSetPasswordFragment$actionRegister$1(OneSetPasswordFragment oneSetPasswordFragment) {
        super(0);
        this.this$0 = oneSetPasswordFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneRegistrationViewModel m10425r;
        OneTextInputLayoutText oneTextInputLayoutText;
        OneTextInputLayoutText oneTextInputLayoutText2;
        OneTextInputLayoutText oneTextInputLayoutText3;
        OneRegistrationViewModel m10425r2;
        OneRegistrationViewModel m10425r3;
        OneRegistrationViewModel m10425r4;
        OneTextInputLayoutText oneTextInputLayoutText4;
        OneRegistrationViewModel m10425r5;
        OneTextInputLayoutText oneTextInputLayoutText5;
        OneRegistrationViewModel m10425r6;
        OneTextInputLayoutText oneTextInputLayoutText6;
        try {
            m10425r = this.this$0.m10425r();
            RegistrationType registrationType = m10425r.getRegistrationType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[registrationType.ordinal()];
            OneTextInputLayoutText oneTextInputLayoutText7 = null;
            if (i == 1 || i == 2) {
                OneRegistrationOTPRule oneRegistrationOTPRule = new OneRegistrationOTPRule();
                oneTextInputLayoutText = this.this$0.f96220o;
                if (oneTextInputLayoutText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyOTP");
                    oneTextInputLayoutText = null;
                }
                oneRegistrationOTPRule.validate(oneTextInputLayoutText.getText().toString());
            } else if (i == 3 || i == 4) {
                OneRegistrationIDRule oneRegistrationIDRule = new OneRegistrationIDRule();
                oneTextInputLayoutText5 = this.this$0.f96221p;
                if (oneTextInputLayoutText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyID");
                    oneTextInputLayoutText5 = null;
                }
                oneRegistrationIDRule.validate(oneTextInputLayoutText5.getText().toString());
                m10425r6 = this.this$0.m10425r();
                oneTextInputLayoutText6 = this.this$0.f96221p;
                if (oneTextInputLayoutText6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyID");
                    oneTextInputLayoutText6 = null;
                }
                m10425r6.setIdCard(oneTextInputLayoutText6.getText());
            }
            oneTextInputLayoutText2 = this.this$0.f96222q;
            if (oneTextInputLayoutText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtPassword");
                oneTextInputLayoutText2 = null;
            }
            String str = oneTextInputLayoutText2.getText().toString();
            oneTextInputLayoutText3 = this.this$0.f96223r;
            if (oneTextInputLayoutText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtConfirmPassword");
                oneTextInputLayoutText3 = null;
            }
            OneRegistrationPassWord oneRegistrationPassWord = new OneRegistrationPassWord(str, oneTextInputLayoutText3.getText().toString());
            new OneRegistrationPassWordRule().validate(oneRegistrationPassWord);
            m10425r2 = this.this$0.m10425r();
            m10425r2.setOneRegistrationPassWord(oneRegistrationPassWord);
            m10425r3 = this.this$0.m10425r();
            int i2 = iArr[m10425r3.getRegistrationType().ordinal()];
            if (i2 == 1 || i2 == 2) {
                m10425r4 = this.this$0.m10425r();
                oneTextInputLayoutText4 = this.this$0.f96220o;
                if (oneTextInputLayoutText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyOTP");
                } else {
                    oneTextInputLayoutText7 = oneTextInputLayoutText4;
                }
                m10425r4.verifyOTPOnline(oneTextInputLayoutText7.getText());
                return;
            }
            m10425r5 = this.this$0.m10425r();
            OneRegistrationViewModel.registerOwner$default(m10425r5, null, 1, null);
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}