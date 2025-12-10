package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$callAPICheck1IDXDevice$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel$callAPICheck1IDXDevice$3 extends Lambda implements Function1<Check1IDXDeviceResponse, Unit> {
    final /* synthetic */ ESimPostpaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidViewModel$callAPICheck1IDXDevice$3(ESimPostpaidViewModel eSimPostpaidViewModel) {
        super(1);
        this.this$0 = eSimPostpaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Check1IDXDeviceResponse check1IDXDeviceResponse) {
        invoke2(check1IDXDeviceResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Check1IDXDeviceResponse check1IDXDeviceResponse) {
        MutableLiveData m2796v0;
        ESimRepository eSimRepository;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        String canBuyDeviceWithContract = check1IDXDeviceResponse.getCanBuyDeviceWithContract();
        if (canBuyDeviceWithContract != null) {
            eSimRepository = this.this$0.f105735b;
            eSimRepository.setCanBuyDeviceWithContract(canBuyDeviceWithContract);
        }
        String canBuyDeviceWithContract2 = check1IDXDeviceResponse.getCanBuyDeviceWithContract();
        StringBuilder sb = new StringBuilder();
        sb.append("callAPICheck1IDXDevice: canBuyDeviceWithContract = ");
        sb.append(canBuyDeviceWithContract2);
        if (Intrinsics.areEqual(check1IDXDeviceResponse.getCanBuyDeviceWithContract(), "N")) {
            m2796v0 = this.this$0.m2796v0();
            m2796v0.setValue(Resource.Companion.success(check1IDXDeviceResponse));
            return;
        }
        boolean isShowConsentXSim = this.this$0.isShowConsentXSim();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("callAPICheck1IDXDevice: isShowConsentXSim = ");
        sb2.append(isShowConsentXSim);
        boolean isWithContract = this.this$0.isWithContract();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("callAPICheck1IDXDevice: isWithContract = ");
        sb3.append(isWithContract);
        boolean isWithDevice = this.this$0.isWithDevice();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("callAPICheck1IDXDevice: isWithDevice = ");
        sb4.append(isWithDevice);
        if (this.this$0.isWithContract() && this.this$0.isWithDevice()) {
            this.this$0.callAPICheckExternalBlacklistFlag();
        } else {
            this.this$0.navigateNext();
        }
    }
}