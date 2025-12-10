package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetProductSaleOrderResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleItemInfo;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetProductSaleOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$callAPIGetProductSaleOrder$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$callAPIGetProductSaleOrder$3 extends Lambda implements Function1<OneGetProductSaleOrderResponse, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$callAPIGetProductSaleOrder$3(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneGetProductSaleOrderResponse oneGetProductSaleOrderResponse) {
        invoke2(oneGetProductSaleOrderResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneGetProductSaleOrderResponse oneGetProductSaleOrderResponse) {
        MutableLiveData m14370j0;
        MutableLiveData m14376g0;
        OneDeviceSaleRepository oneDeviceSaleRepository;
        if (oneGetProductSaleOrderResponse.getData() != null) {
            m14370j0 = this.this$0.m14370j0();
            Resource.Companion companion = Resource.Companion;
            m14370j0.postValue(companion.success(null));
            m14376g0 = this.this$0.m14376g0();
            m14376g0.postValue(companion.success(oneGetProductSaleOrderResponse));
            oneDeviceSaleRepository = this.this$0.f90680b;
            oneDeviceSaleRepository.getModel().setItemInfo(new DeviceSaleItemInfo(oneGetProductSaleOrderResponse.getData().getOrderID(), oneGetProductSaleOrderResponse.getData().getProductCode(), oneGetProductSaleOrderResponse.getData().getProductName(), oneGetProductSaleOrderResponse.getData().getProductPrice(), oneGetProductSaleOrderResponse.getData().getProductQty(), oneGetProductSaleOrderResponse.getData().getDiscountAmount(), oneGetProductSaleOrderResponse.getData().getLineAmount(), oneGetProductSaleOrderResponse.getData().getBundleItem(), CollectionsKt___CollectionsKt.toMutableList((Collection) oneGetProductSaleOrderResponse.getData().getDiscountItem()), ""));
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}