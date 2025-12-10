package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$callAPIHardwareNumber$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel$callAPIHardwareNumber$3 extends Lambda implements Function1<GetNewIMEIResponse, Unit> {
    final /* synthetic */ String $imei;
    final /* synthetic */ ESimPostpaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidViewModel$callAPIHardwareNumber$3(ESimPostpaidViewModel eSimPostpaidViewModel, String str) {
        super(1);
        this.this$0 = eSimPostpaidViewModel;
        this.$imei = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetNewIMEIResponse getNewIMEIResponse) {
        invoke2(getNewIMEIResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetNewIMEIResponse getNewIMEIResponse) {
        ESimRepository eSimRepository;
        MutableLiveData m2828f0;
        eSimRepository = this.this$0.f105735b;
        eSimRepository.setHardwareNumberResponse(getNewIMEIResponse);
        m2828f0 = this.this$0.m2828f0();
        m2828f0.setValue(Resource.Companion.success(getNewIMEIResponse));
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