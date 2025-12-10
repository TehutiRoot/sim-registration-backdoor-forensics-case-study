package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleItemInfo;
import th.p047co.dtac.android.dtacone.model.device_sale.GetProductSaleOrderResponse;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetProductSaleOrderResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callAPIGetProductSaleOrder$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callAPIGetProductSaleOrder$3 extends Lambda implements Function1<GetProductSaleOrderResponse, Unit> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callAPIGetProductSaleOrder$3(DeviceSaleViewModel deviceSaleViewModel) {
        super(1);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetProductSaleOrderResponse getProductSaleOrderResponse) {
        invoke2(getProductSaleOrderResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetProductSaleOrderResponse getProductSaleOrderResponse) {
        MutableLiveData m3010D0;
        MutableLiveData m2900z0;
        DeviceSaleRepository deviceSaleRepository;
        m3010D0 = this.this$0.m3010D0();
        Resource.Companion companion = Resource.Companion;
        m3010D0.postValue(companion.success(null));
        m2900z0 = this.this$0.m2900z0();
        m2900z0.postValue(companion.success(getProductSaleOrderResponse));
        deviceSaleRepository = this.this$0.f105560b;
        deviceSaleRepository.getModel().setItemInfo(new DeviceSaleItemInfo(getProductSaleOrderResponse.getOrderID(), getProductSaleOrderResponse.getProductCode(), getProductSaleOrderResponse.getProductName(), getProductSaleOrderResponse.getProductPrice(), getProductSaleOrderResponse.getProductQty(), getProductSaleOrderResponse.getDiscountAmount(), getProductSaleOrderResponse.getLineAmount(), getProductSaleOrderResponse.getBundleItem(), CollectionsKt___CollectionsKt.toMutableList((Collection) getProductSaleOrderResponse.getDiscountItem()), ""));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}