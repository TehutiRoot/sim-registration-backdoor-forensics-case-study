package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.model.device_sale.GetExtraAdvanceDetailResponse;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/GetExtraAdvanceDetailResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleCampaignViewModel$getExtraAdvanceDetail$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignViewModel$getExtraAdvanceDetail$3 extends Lambda implements Function1<GetExtraAdvanceDetailResponse, Unit> {
    final /* synthetic */ Discount $discount;
    final /* synthetic */ OneDeviceSaleCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleCampaignViewModel$getExtraAdvanceDetail$3(OneDeviceSaleCampaignViewModel oneDeviceSaleCampaignViewModel, Discount discount) {
        super(1);
        this.this$0 = oneDeviceSaleCampaignViewModel;
        this.$discount = discount;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetExtraAdvanceDetailResponse getExtraAdvanceDetailResponse) {
        invoke2(getExtraAdvanceDetailResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetExtraAdvanceDetailResponse getExtraAdvanceDetailResponse) {
        MutableLiveData m14495C;
        OneDeviceSaleRepository oneDeviceSaleRepository;
        MutableLiveData m14471w;
        Double doubleOrNull = AbstractC19395cO1.toDoubleOrNull(getExtraAdvanceDetailResponse.getExtraAdvanceAmount());
        int i = ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) > 0.0d ? 1 : ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) == 0.0d ? 0 : -1));
        if (i > 0) {
            oneDeviceSaleRepository = this.this$0.f90547b;
            if (oneDeviceSaleRepository.hasAnyDiscountWithExtraAdvance()) {
                m14471w = this.this$0.m14471w();
                m14471w.postValue(Resource.Companion.error$default(Resource.Companion, "", "", null, 4, null));
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
        m14495C = this.this$0.m14495C();
        m14495C.postValue(Resource.Companion.success(""));
    }
}