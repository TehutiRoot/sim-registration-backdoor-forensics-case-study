package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$requestOneBuyDolOTP$3 */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel$requestOneBuyDolOTP$3 extends Lambda implements Function1<RequestOtpResponse, Unit> {
    final /* synthetic */ RequestOtpBody $requestOtpBody;
    final /* synthetic */ OneBuyDolViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolViewModel$requestOneBuyDolOTP$3(RequestOtpBody requestOtpBody, OneBuyDolViewModel oneBuyDolViewModel) {
        super(1);
        this.$requestOtpBody = requestOtpBody;
        this.this$0 = oneBuyDolViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOtpResponse requestOtpResponse) {
        invoke2(requestOtpResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestOtpResponse requestOtpResponse) {
        MutableLiveData m15878e0;
        String mobileNumber = this.$requestOtpBody.getMobileNumber();
        if (mobileNumber == null) {
            mobileNumber = "";
        }
        m15878e0 = this.this$0.m15878e0();
        m15878e0.setValue(Resource.Companion.success(new Pair(requestOtpResponse, mobileNumber)));
    }
}