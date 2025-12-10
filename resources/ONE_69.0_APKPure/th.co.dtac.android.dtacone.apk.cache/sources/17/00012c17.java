package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.otp_v3.request.RequestOtpV3Response;
import th.p047co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Response;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel$requestOtpTransaction$3 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerViewModel$requestOtpTransaction$3 extends Lambda implements Function1<RequestOtpV3Response, Unit> {
    final /* synthetic */ boolean $isResendOtp;
    final /* synthetic */ String $mobileNumber;
    final /* synthetic */ OneChangeOwnerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerViewModel$requestOtpTransaction$3(boolean z, OneChangeOwnerViewModel oneChangeOwnerViewModel, String str) {
        super(1);
        this.$isResendOtp = z;
        this.this$0 = oneChangeOwnerViewModel;
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
        OtpTransactionRepository otpTransactionRepository;
        String href = requestOtpV3Response.getHref();
        if (href != null) {
            OneChangeOwnerViewModel oneChangeOwnerViewModel = this.this$0;
            String str = this.$mobileNumber;
            otpTransactionRepository = oneChangeOwnerViewModel.f89395c;
            otpTransactionRepository.setRequestOtpTransaction(str, href);
        }
        if (!this.$isResendOtp) {
            mutableLiveData = this.this$0.f89406n;
            mutableLiveData.setValue(Resource.Companion.success(PhoneNumberExtKt.toInternational(this.$mobileNumber)));
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}