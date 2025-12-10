package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSalePayment;
import th.p047co.dtac.android.dtacone.model.device_sale.PaymentType;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ProductPaymentSummary;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$nextCampaignDiscount$setCashAmount$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$nextCampaignDiscount$setCashAmount$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$nextCampaignDiscount$setCashAmount$1(DeviceSaleViewModel deviceSaleViewModel) {
        super(0);
        this.this$0 = deviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DeviceSaleRepository deviceSaleRepository;
        DeviceSaleRepository deviceSaleRepository2;
        ProductPaymentSummary value = this.this$0.showProductPaymentSummary().getValue();
        if (value != null) {
            DeviceSaleViewModel deviceSaleViewModel = this.this$0;
            deviceSaleRepository = deviceSaleViewModel.f105560b;
            deviceSaleRepository.getPayment().setPayType(PaymentType.CASH);
            deviceSaleRepository2 = deviceSaleViewModel.f105560b;
            DeviceSalePayment payment = deviceSaleRepository2.getPayment();
            float totalPaymentAmount = value.getTotalPaymentAmount();
            Float discountSum = value.getDiscountSum();
            payment.setPaymentCashAmount(totalPaymentAmount - (discountSum != null ? discountSum.floatValue() : 0.0f));
        }
    }
}