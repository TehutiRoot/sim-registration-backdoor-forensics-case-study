package th.p047co.dtac.android.dtacone.viewmodel.otp_v3;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.otp_v3.request.RequestOtpV3Response;
import th.p047co.dtac.android.dtacone.repository.otp_v3.OtpV3Repository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Response;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOtpV3ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpV3ViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/otp_v3/OtpV3ViewModel$requestOtpV3$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.otp_v3.OtpV3ViewModel$requestOtpV3$3 */
/* loaded from: classes9.dex */
public final class OtpV3ViewModel$requestOtpV3$3 extends Lambda implements Function1<RequestOtpV3Response, Unit> {
    final /* synthetic */ String $mobileNumber;
    final /* synthetic */ OtpV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpV3ViewModel$requestOtpV3$3(OtpV3ViewModel otpV3ViewModel, String str) {
        super(1);
        this.this$0 = otpV3ViewModel;
        this.$mobileNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RequestOtpV3Response requestOtpV3Response) {
        invoke2(requestOtpV3Response);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RequestOtpV3Response requestOtpV3Response) {
        MutableLiveData mutableLiveData;
        OtpV3Repository otpV3Repository;
        String href = requestOtpV3Response.getHref();
        if (href != null) {
            OtpV3ViewModel otpV3ViewModel = this.this$0;
            String str = this.$mobileNumber;
            otpV3Repository = otpV3ViewModel.f106998b;
            otpV3Repository.setRequestOtpV3(str, href);
        }
        mutableLiveData = this.this$0.f107003g;
        mutableLiveData.setValue(Resource.Companion.success(null));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}