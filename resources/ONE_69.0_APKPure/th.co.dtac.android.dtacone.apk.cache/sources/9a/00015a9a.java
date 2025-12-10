package th.p047co.dtac.android.dtacone.viewmodel.otp_transaction;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.otp_v3.request.RequestOtpV3Response;
import th.p047co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/otp_v3/request/RequestOtpV3Response;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOtpTransactionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpTransactionViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/otp_transaction/OtpTransactionViewModel$requestOtpTransaction$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.otp_transaction.OtpTransactionViewModel$requestOtpTransaction$3 */
/* loaded from: classes9.dex */
public final class OtpTransactionViewModel$requestOtpTransaction$3 extends Lambda implements Function1<RequestOtpV3Response, Unit> {
    final /* synthetic */ String $mobileNumber;
    final /* synthetic */ OtpTransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpTransactionViewModel$requestOtpTransaction$3(OtpTransactionViewModel otpTransactionViewModel, String str) {
        super(1);
        this.this$0 = otpTransactionViewModel;
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
            OtpTransactionViewModel otpTransactionViewModel = this.this$0;
            String str = this.$mobileNumber;
            otpTransactionRepository = otpTransactionViewModel.f106977b;
            otpTransactionRepository.setRequestOtpTransaction(str, href);
        }
        mutableLiveData = this.this$0.f106982g;
        mutableLiveData.setValue(Resource.Companion.success(PhoneNumberExtKt.toInternational(this.$mobileNumber)));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}