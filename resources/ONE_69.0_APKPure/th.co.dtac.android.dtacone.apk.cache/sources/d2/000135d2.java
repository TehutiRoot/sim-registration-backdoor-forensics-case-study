package th.p047co.dtac.android.dtacone.view.appOne.online_activation.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.online_activation.viewModel.OneOnlineActivationViewModel$getOTP$2 */
/* loaded from: classes10.dex */
public final class OneOnlineActivationViewModel$getOTP$2 extends Lambda implements Function1<RequestOtpResponse, Unit> {
    final /* synthetic */ boolean $isResendOtp;
    final /* synthetic */ RequestOtpBody $requestOtpBody;
    final /* synthetic */ OneOnlineActivationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineActivationViewModel$getOTP$2(boolean z, OneOnlineActivationViewModel oneOnlineActivationViewModel, RequestOtpBody requestOtpBody) {
        super(1);
        this.$isResendOtp = z;
        this.this$0 = oneOnlineActivationViewModel;
        this.$requestOtpBody = requestOtpBody;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOtpResponse requestOtpResponse) {
        invoke2(requestOtpResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestOtpResponse requestOtpResponse) {
        MutableLiveData m12808l;
        MutableLiveData m12807m;
        if (this.$isResendOtp) {
            m12807m = this.this$0.m12807m();
            Resource.Companion companion = Resource.Companion;
            String mobileNumber = this.$requestOtpBody.getMobileNumber();
            m12807m.setValue(companion.success(new Pair(mobileNumber != null ? mobileNumber : "", requestOtpResponse)));
            return;
        }
        m12808l = this.this$0.m12808l();
        Resource.Companion companion2 = Resource.Companion;
        String mobileNumber2 = this.$requestOtpBody.getMobileNumber();
        m12808l.setValue(companion2.success(new Pair(mobileNumber2 != null ? mobileNumber2 : "", requestOtpResponse)));
    }
}