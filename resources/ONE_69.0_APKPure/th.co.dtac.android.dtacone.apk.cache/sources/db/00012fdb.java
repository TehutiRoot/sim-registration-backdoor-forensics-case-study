package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSalePayment;
import th.p047co.dtac.android.dtacone.model.device_sale.PaymentType;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.model.OneProductPaymentSummary;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$nextCampaignDiscount$setCashAmount$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$nextCampaignDiscount$setCashAmount$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$nextCampaignDiscount$setCashAmount$1(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(0);
        this.this$0 = oneDeviceSaleViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneDeviceSaleRepository oneDeviceSaleRepository;
        OneDeviceSaleRepository oneDeviceSaleRepository2;
        OneProductPaymentSummary value = this.this$0.showProductPaymentSummary().getValue();
        if (value != null) {
            OneDeviceSaleViewModel oneDeviceSaleViewModel = this.this$0;
            oneDeviceSaleRepository = oneDeviceSaleViewModel.f90680b;
            oneDeviceSaleRepository.getPayment().setPayType(PaymentType.CASH);
            oneDeviceSaleRepository2 = oneDeviceSaleViewModel.f90680b;
            DeviceSalePayment payment = oneDeviceSaleRepository2.getPayment();
            float totalPaymentAmount = value.getTotalPaymentAmount();
            Float discountSum = value.getDiscountSum();
            payment.setPaymentCashAmount(totalPaymentAmount - (discountSum != null ? discountSum.floatValue() : 0.0f));
        }
    }
}