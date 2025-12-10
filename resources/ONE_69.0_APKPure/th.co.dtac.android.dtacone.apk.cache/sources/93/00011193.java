package th.p047co.dtac.android.dtacone.app_one.viewmodel.registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel$requestOtpPhoneOnline$2 */
/* loaded from: classes7.dex */
public final class OneRegistrationViewModel$requestOtpPhoneOnline$2 extends Lambda implements Function1<RequestOtpResponse, Unit> {
    final /* synthetic */ Boolean $refresh;
    final /* synthetic */ OneRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegistrationViewModel$requestOtpPhoneOnline$2(OneRegistrationViewModel oneRegistrationViewModel, Boolean bool) {
        super(1);
        this.this$0 = oneRegistrationViewModel;
        this.$refresh = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOtpResponse requestOtpResponse) {
        invoke2(requestOtpResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestOtpResponse requestOtpResponse) {
        MutableLiveData m20186w;
        MutableLiveData m20225H;
        MutableLiveData m20224I;
        m20186w = this.this$0.m20186w();
        m20186w.setValue(requestOtpResponse.getHref());
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.getVerifyOnlineToken().setValue(null);
        if (Intrinsics.areEqual(this.$refresh, Boolean.TRUE)) {
            m20224I = this.this$0.m20224I();
            m20224I.setValue(Resource.Companion.success(null));
            return;
        }
        m20225H = this.this$0.m20225H();
        m20225H.setValue(Resource.Companion.success(null));
    }
}