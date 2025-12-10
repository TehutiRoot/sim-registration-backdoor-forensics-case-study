package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.VerificationResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/VerificationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistViewModel$verification$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistViewModel$verification$3 extends Lambda implements Function1<VerificationResponse, Unit> {
    final /* synthetic */ String $otpCode;
    final /* synthetic */ String $subscriberNumber;
    final /* synthetic */ MrtrPrepaidReregistViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistViewModel$verification$3(MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel, String str, String str2) {
        super(1);
        this.this$0 = mrtrPrepaidReregistViewModel;
        this.$otpCode = str;
        this.$subscriberNumber = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VerificationResponse verificationResponse) {
        invoke2(verificationResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(VerificationResponse it) {
        MutableLiveData mutableLiveData;
        MrtrPrepaidReregistViewModel mrtrPrepaidReregistViewModel = this.this$0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        mrtrPrepaidReregistViewModel.storeVerificationResponse(it);
        this.this$0.storeOtpCode(this.$otpCode);
        this.this$0.getRepository().setSubscriberNumber(PhoneNumberExtKt.toInternational(this.$subscriberNumber));
        mutableLiveData = this.this$0.f106874h;
        mutableLiveData.setValue(new Event(Boolean.TRUE));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}