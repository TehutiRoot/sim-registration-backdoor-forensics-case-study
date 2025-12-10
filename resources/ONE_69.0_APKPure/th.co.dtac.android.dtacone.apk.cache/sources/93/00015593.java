package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callAPIVerifySubscriber$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callAPIVerifySubscriber$3 extends Lambda implements Function1<DeviceSaleVerifySubrResponse, Unit> {
    final /* synthetic */ boolean $isFromPostpaidAndP2p;
    final /* synthetic */ boolean $isUpdate;
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callAPIVerifySubscriber$3(DeviceSaleViewModel deviceSaleViewModel, boolean z, boolean z2) {
        super(1);
        this.this$0 = deviceSaleViewModel;
        this.$isFromPostpaidAndP2p = z;
        this.$isUpdate = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeviceSaleVerifySubrResponse deviceSaleVerifySubrResponse) {
        invoke2(deviceSaleVerifySubrResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DeviceSaleVerifySubrResponse it) {
        DeviceSaleRepository deviceSaleRepository;
        DeviceSaleRepository deviceSaleRepository2;
        MutableLiveData m2949f1;
        DeviceSaleRepository deviceSaleRepository3;
        deviceSaleRepository = this.this$0.f105560b;
        deviceSaleRepository.setSubscriberNumber(it.getSubscriberNumber());
        deviceSaleRepository.setCustomerNumber(it.getCustomerNumber());
        deviceSaleRepository.setVerifySubrResponse(it);
        String imeiNumber = it.getCustomerProfile().getSubscriber().getImeiNumber();
        if (imeiNumber == null) {
            imeiNumber = "";
        }
        deviceSaleRepository.setExistingImeiNumber(imeiNumber);
        if (this.$isFromPostpaidAndP2p) {
            deviceSaleRepository3 = this.this$0.f105560b;
            deviceSaleRepository3.setNewIMEIResponseToVerifySubscriberModel();
        }
        deviceSaleRepository2 = this.this$0.f105560b;
        if (!deviceSaleRepository2.isDeviceWithContract() || this.$isUpdate) {
            m2949f1 = this.this$0.m2949f1();
            m2949f1.setValue(Resource.Companion.success(null));
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            return;
        }
        DeviceSaleViewModel deviceSaleViewModel = this.this$0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        deviceSaleViewModel.m3009E(it, this.$isFromPostpaidAndP2p);
    }
}