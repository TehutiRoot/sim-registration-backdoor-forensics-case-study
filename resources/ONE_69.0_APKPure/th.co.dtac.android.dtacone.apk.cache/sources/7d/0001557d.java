package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callAPICheck1IDXDevice$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callAPICheck1IDXDevice$3 extends Lambda implements Function1<Check1IDXDeviceResponse, Unit> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callAPICheck1IDXDevice$3(DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Check1IDXDeviceResponse check1IDXDeviceResponse) {
        invoke2(check1IDXDeviceResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Check1IDXDeviceResponse check1IDXDeviceResponse) {
        DeviceSaleRepository deviceSaleRepository;
        DeviceSaleRepository deviceSaleRepository2;
        MutableLiveData m2964a1;
        MutableLiveData m2961b1;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        deviceSaleRepository = this.this$0.f105560b;
        deviceSaleRepository.setCheck1IDXDeviceResponse(check1IDXDeviceResponse);
        deviceSaleRepository2 = this.this$0.f105560b;
        deviceSaleRepository2.setCanBuyDeviceWithContract(check1IDXDeviceResponse.getCanBuyDeviceWithContract());
        if (Intrinsics.areEqual(check1IDXDeviceResponse.getAllowExtendFlag(), "Y") && this.this$0.isUserLan()) {
            m2961b1 = this.this$0.m2961b1();
            m2961b1.setValue(Resource.Companion.success(check1IDXDeviceResponse));
        } else if (Intrinsics.areEqual(check1IDXDeviceResponse.getCanBuyDeviceWithContract(), "N")) {
            m2964a1 = this.this$0.m2964a1();
            m2964a1.setValue(Resource.Companion.success(check1IDXDeviceResponse));
        } else {
            this.this$0.callAPICheckExternalBlacklistFlag();
        }
    }
}