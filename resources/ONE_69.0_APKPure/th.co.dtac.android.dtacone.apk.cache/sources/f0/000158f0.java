package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$callAPIHardwareNumber$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$callAPIHardwareNumber$3 extends Lambda implements Function1<GetNewIMEIResponse, Unit> {
    final /* synthetic */ String $imei;
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidRegistrationViewModel$callAPIHardwareNumber$3(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel, String str) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
        this.$imei = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetNewIMEIResponse getNewIMEIResponse) {
        invoke2(getNewIMEIResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetNewIMEIResponse getNewIMEIResponse) {
        MrtrPostpaidRepository mrtrPostpaidRepository;
        MutableLiveData m2288W;
        mrtrPostpaidRepository = this.this$0.f106470b;
        mrtrPostpaidRepository.setHardwareNumberResponse(getNewIMEIResponse);
        m2288W = this.this$0.m2288W();
        m2288W.setValue(Resource.Companion.success(getNewIMEIResponse));
        boolean isDtacDevice = getNewIMEIResponse.isDtacDevice();
        if (isDtacDevice) {
            this.this$0.callPackages();
        } else if (isDtacDevice) {
        } else {
            if (Intrinsics.areEqual(getNewIMEIResponse.getCheckUsedStatus(), "N")) {
                this.this$0.callOpenMarketAddIMEI(this.$imei);
            } else {
                this.this$0.callPackages();
            }
        }
    }
}