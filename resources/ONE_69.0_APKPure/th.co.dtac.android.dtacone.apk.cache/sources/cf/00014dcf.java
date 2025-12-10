package th.p047co.dtac.android.dtacone.view.fragment.force_change_password;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.presenter.force_change_password.ForceChangePasswordVerifyOtpPresenter;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.force_change_password.ForceChangePasswordVerifyOtpFragment$setUpPin4Digit$2 */
/* loaded from: classes9.dex */
public final class ForceChangePasswordVerifyOtpFragment$setUpPin4Digit$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ ForceChangePasswordVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordVerifyOtpFragment$setUpPin4Digit$2(ForceChangePasswordVerifyOtpFragment forceChangePasswordVerifyOtpFragment) {
        super(1);
        this.this$0 = forceChangePasswordVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        String phoneNumber;
        RequestOtpResponse requestOtpResponse;
        ForceChangePasswordVerifyOtpPresenter verifyOtp = this.this$0.getVerifyOtp();
        phoneNumber = this.this$0.getPhoneNumber();
        requestOtpResponse = this.this$0.f101440k;
        if (requestOtpResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOtpResponse");
            requestOtpResponse = null;
        }
        verifyOtp.verifyOtp(new VerifyOtpRequest(phoneNumber, str, requestOtpResponse.getHref(), Constant.EVENT_FORCE_CHANGE_PASSWORD));
    }
}