package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneDeviceSaleVerifySubResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneDeviceSaleVerifySubResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$callAPIVerifySubscriber$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$callAPIVerifySubscriber$3 extends Lambda implements Function1<OneDeviceSaleVerifySubResponse, Unit> {
    final /* synthetic */ boolean $isFromPostpaidAndP2p;
    final /* synthetic */ boolean $isUpdate;
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$callAPIVerifySubscriber$3(OneDeviceSaleViewModel oneDeviceSaleViewModel, boolean z, boolean z2) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
        this.$isFromPostpaidAndP2p = z;
        this.$isUpdate = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneDeviceSaleVerifySubResponse oneDeviceSaleVerifySubResponse) {
        invoke2(oneDeviceSaleVerifySubResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneDeviceSaleVerifySubResponse oneDeviceSaleVerifySubResponse) {
        OneDeviceSaleRepository oneDeviceSaleRepository;
        MutableLiveData m14416B0;
        OneDeviceSaleRepository oneDeviceSaleRepository2;
        OneDeviceSaleRepository oneDeviceSaleRepository3;
        if (oneDeviceSaleVerifySubResponse.getData() != null) {
            oneDeviceSaleRepository3 = this.this$0.f90680b;
            oneDeviceSaleRepository3.setSubscriberNumber(oneDeviceSaleVerifySubResponse.getData().getSubscriberNumber());
            oneDeviceSaleRepository3.setCustomerNumber(oneDeviceSaleVerifySubResponse.getData().getCustomerNumber());
            oneDeviceSaleRepository3.setVerifySubrResponse(oneDeviceSaleVerifySubResponse.getData());
            String imeiNumber = oneDeviceSaleVerifySubResponse.getData().getCustomerProfile().getSubscriber().getImeiNumber();
            if (imeiNumber == null) {
                imeiNumber = "";
            }
            oneDeviceSaleRepository3.setExistingImeiNumber(imeiNumber);
        }
        if (this.$isFromPostpaidAndP2p) {
            oneDeviceSaleRepository2 = this.this$0.f90680b;
            oneDeviceSaleRepository2.setNewIMEIResponseToVerifySubscriberModel();
        }
        oneDeviceSaleRepository = this.this$0.f90680b;
        if (!oneDeviceSaleRepository.isDeviceWithContract() || this.$isUpdate) {
            m14416B0 = this.this$0.m14416B0();
            m14416B0.setValue(Resource.Companion.success(null));
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            return;
        }
        DeviceSaleVerifySubrResponse data = oneDeviceSaleVerifySubResponse.getData();
        if (data != null) {
            this.this$0.m14347v(data, this.$isFromPostpaidAndP2p);
        }
    }
}