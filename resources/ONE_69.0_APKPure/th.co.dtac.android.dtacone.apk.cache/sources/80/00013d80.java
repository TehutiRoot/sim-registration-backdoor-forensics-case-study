package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputOTPFragment$navigateNext$1$1$1 */
/* loaded from: classes10.dex */
public final class OneInputOTPFragment$navigateNext$1$1$1 extends Lambda implements Function1<SimData, Unit> {
    final /* synthetic */ OneRtrPhoneDialog $oneRtrPhoneDialog;
    final /* synthetic */ OneInputOTPFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputOTPFragment$navigateNext$1$1$1(OneInputOTPFragment oneInputOTPFragment, OneRtrPhoneDialog oneRtrPhoneDialog) {
        super(1);
        this.this$0 = oneInputOTPFragment;
        this.$oneRtrPhoneDialog = oneRtrPhoneDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimData simData) {
        invoke2(simData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable SimData simData) {
        OneRegistrationViewModel m10435o;
        OneRegistrationViewModel m10435o2;
        OneRegistrationViewModel m10435o3;
        OneRegistrationViewModel m10435o4;
        OneRegistrationViewModel m10435o5;
        if (simData != null) {
            m10435o = this.this$0.m10435o();
            m10435o.setItemSelected(simData);
            m10435o2 = this.this$0.m10435o();
            if (m10435o2.getRegistrationType() == RegistrationType.PhoneMultiple) {
                m10435o4 = this.this$0.m10435o();
                String simR = simData.getSimR();
                m10435o4.setPhoneNumberOnline(simR != null ? AbstractC19741eO1.replace$default(simR, HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null) : null);
                m10435o5 = this.this$0.m10435o();
                OneRegistrationViewModel.requestOtpPhoneOnline$default(m10435o5, null, 1, null);
            } else {
                m10435o3 = this.this$0.m10435o();
                m10435o3.setRtrCodeVerify(simData.getRtrCode());
                this.this$0.m10432r();
            }
            this.$oneRtrPhoneDialog.dismiss();
        }
    }
}