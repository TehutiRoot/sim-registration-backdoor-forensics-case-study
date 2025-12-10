package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.model.device_sale.GetExtraAdvanceDetailResponse;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetExtraAdvanceDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModel$getExtraAdvanceDetail$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleCampaignViewModel$getExtraAdvanceDetail$3 extends Lambda implements Function1<GetExtraAdvanceDetailResponse, Unit> {
    final /* synthetic */ Discount $discount;
    final /* synthetic */ DeviceSaleCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleCampaignViewModel$getExtraAdvanceDetail$3(DeviceSaleCampaignViewModel deviceSaleCampaignViewModel, Discount discount) {
        super(1);
        this.this$0 = deviceSaleCampaignViewModel;
        this.$discount = discount;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetExtraAdvanceDetailResponse getExtraAdvanceDetailResponse) {
        invoke2(getExtraAdvanceDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetExtraAdvanceDetailResponse getExtraAdvanceDetailResponse) {
        MutableLiveData m3053B;
        DeviceSaleRepository deviceSaleRepository;
        MutableLiveData m3029w;
        Double doubleOrNull = AbstractC19395cO1.toDoubleOrNull(getExtraAdvanceDetailResponse.getExtraAdvanceAmount());
        int i = ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) > 0.0d ? 1 : ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) == 0.0d ? 0 : -1));
        if (i > 0) {
            deviceSaleRepository = this.this$0.f105445b;
            if (deviceSaleRepository.hasAnyDiscountWithExtraAdvance()) {
                m3029w = this.this$0.m3029w();
                m3029w.postValue(Resource.Companion.error$default(Resource.Companion, "", "", null, 4, null));
                return;
            }
        }
        if (i > 0) {
            this.$discount.setExtraAdvanceAmount(getExtraAdvanceDetailResponse.getExtraAdvanceAmount());
            this.$discount.setExtraAdvanceAmountText(getExtraAdvanceDetailResponse.getExtraAdvanceAmountText());
            this.$discount.setExtraAdvancePackageCode(getExtraAdvanceDetailResponse.getExtraAdvancePackageCode());
            this.$discount.setExtraDiscountPackageCode(getExtraAdvanceDetailResponse.getExtraDiscountPackageCode());
            this.$discount.setExtraAdvancePackageDescription(getExtraAdvanceDetailResponse.getExtraAdvancePackageDescription());
            this.$discount.setExtraDiscountPackageDescription(getExtraAdvanceDetailResponse.getExtraDiscountPackageDescription());
            this.$discount.setHasExtraPackage(true);
        }
        this.this$0.addDiscount(this.$discount);
        m3053B = this.this$0.m3053B();
        m3053B.postValue(Resource.Companion.success(""));
    }
}