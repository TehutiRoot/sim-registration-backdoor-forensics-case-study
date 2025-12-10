package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment$dialogMultiplePhoneAndRtrCode$1$1$1 */
/* loaded from: classes10.dex */
public final class OneSetPasswordFragment$dialogMultiplePhoneAndRtrCode$1$1$1 extends Lambda implements Function1<SimData, Unit> {
    final /* synthetic */ OneRtrPhoneDialog $oneRtrPhoneDialog;
    final /* synthetic */ OneSetPasswordFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSetPasswordFragment$dialogMultiplePhoneAndRtrCode$1$1$1(OneSetPasswordFragment oneSetPasswordFragment, OneRtrPhoneDialog oneRtrPhoneDialog) {
        super(1);
        this.this$0 = oneSetPasswordFragment;
        this.$oneRtrPhoneDialog = oneRtrPhoneDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimData simData) {
        invoke2(simData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable SimData simData) {
        OneRegistrationViewModel m10425r;
        OneRegistrationViewModel m10425r2;
        OneTextLayoutView oneTextLayoutView;
        OneRegistrationViewModel m10425r3;
        OneTextInputLayoutText oneTextInputLayoutText;
        OneRegistrationActivity m10426q;
        OneRegistrationViewModel m10425r4;
        OneRegistrationViewModel m10425r5;
        OneTextLayoutView oneTextLayoutView2;
        OneRegistrationViewModel m10425r6;
        OneRegistrationActivity m10426q2;
        OneRegistrationViewModel m10425r7;
        if (simData != null) {
            m10425r = this.this$0.m10425r();
            OneTextInputLayoutText oneTextInputLayoutText2 = null;
            OneTextLayoutView oneTextLayoutView3 = null;
            if (m10425r.getRegistrationType() == RegistrationType.PhoneMultiple) {
                m10425r5 = this.this$0.m10425r();
                String simR = simData.getSimR();
                m10425r5.setPhoneNumberOnline(simR != null ? AbstractC19741eO1.replace$default(simR, HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null) : null);
                oneTextLayoutView2 = this.this$0.f96219n;
                if (oneTextLayoutView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
                } else {
                    oneTextLayoutView3 = oneTextLayoutView2;
                }
                m10425r6 = this.this$0.m10425r();
                String phoneNumberOnline = m10425r6.getPhoneNumberOnline();
                oneTextLayoutView3.setText((phoneNumberOnline == null || (r0 = PhoneNumberExtKt.toPretty(phoneNumberOnline)) == null) ? "" : "");
                m10426q2 = this.this$0.m10426q();
                m10426q2.hideKeyboard();
                m10425r7 = this.this$0.m10425r();
                m10425r7.requestOtpPhoneOnline(Boolean.TRUE);
            } else {
                m10425r2 = this.this$0.m10425r();
                m10425r2.setRtrCodeVerify(simData.getRtrCode());
                oneTextLayoutView = this.this$0.f96218m;
                if (oneTextLayoutView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvRtrCodeVerify");
                    oneTextLayoutView = null;
                }
                m10425r3 = this.this$0.m10425r();
                oneTextLayoutView.setText(m10425r3.getRtrCodeVerify());
                oneTextInputLayoutText = this.this$0.f96221p;
                if (oneTextInputLayoutText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtVerifyID");
                } else {
                    oneTextInputLayoutText2 = oneTextInputLayoutText;
                }
                oneTextInputLayoutText2.focus();
                m10426q = this.this$0.m10426q();
                m10426q.showKeyboard();
            }
            m10425r4 = this.this$0.m10425r();
            m10425r4.setItemSelected(simData);
            this.$oneRtrPhoneDialog.dismiss();
        }
    }
}