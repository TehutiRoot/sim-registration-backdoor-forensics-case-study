package th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel$requestOtp$2 */
/* loaded from: classes7.dex */
public final class OneForgotPasswordViewModel$requestOtp$2 extends Lambda implements Function1<RequestOtpResponse, Unit> {
    final /* synthetic */ Boolean $isLoading;
    final /* synthetic */ OneForgotPasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneForgotPasswordViewModel$requestOtp$2(OneForgotPasswordViewModel oneForgotPasswordViewModel, Boolean bool) {
        super(1);
        this.this$0 = oneForgotPasswordViewModel;
        this.$isLoading = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOtpResponse requestOtpResponse) {
        invoke2(requestOtpResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestOtpResponse requestOtpResponse) {
        MutableLiveData m20068j;
        MutableLiveData m20064n;
        MutableLiveData m20065m;
        OneForgotPassword forgotPasswordData = this.this$0.getForgotPasswordData();
        if (forgotPasswordData != null) {
            forgotPasswordData.setHref(requestOtpResponse.getHref());
        }
        m20068j = this.this$0.m20068j();
        m20068j.setValue(null);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        if (Intrinsics.areEqual(this.$isLoading, Boolean.TRUE)) {
            m20065m = this.this$0.m20065m();
            m20065m.setValue(Resource.Companion.success(null));
            return;
        }
        m20064n = this.this$0.m20064n();
        m20064n.setValue(Resource.Companion.success(null));
    }
}
