package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.device_sale.PaymentType;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleInputAddressReceiptFragment;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$confirmPaymentInfo$navigate$1 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$confirmPaymentInfo$navigate$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $cashAmount;
    final /* synthetic */ String $credit4Digits;
    final /* synthetic */ String $creditAmount;
    final /* synthetic */ PaymentType $paymentType;
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$confirmPaymentInfo$navigate$1(DeviceSaleViewModel deviceSaleViewModel, PaymentType paymentType, String str, String str2, String str3) {
        super(0);
        this.this$0 = deviceSaleViewModel;
        this.$paymentType = paymentType;
        this.$cashAmount = str;
        this.$creditAmount = str2;
        this.$credit4Digits = str3;
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
        MutableLiveData m3004G0;
        String str;
        DeviceSaleRepository deviceSaleRepository3;
        String str2;
        DeviceSaleRepository deviceSaleRepository4;
        DeviceSaleRepository deviceSaleRepository5;
        DeviceSaleRepository deviceSaleRepository6;
        deviceSaleRepository = this.this$0.f105560b;
        deviceSaleRepository.getPayment().setPayType(this.$paymentType);
        if (this.$paymentType == PaymentType.MIX) {
            String str3 = this.$cashAmount;
            if (str3 != null) {
                deviceSaleRepository6 = this.this$0.f105560b;
                deviceSaleRepository6.getPayment().setPaymentCashAmount(str3.length() > 0 ? Float.parseFloat(AbstractC19741eO1.replace$default(str3, ",", "", false, 4, (Object) null)) : 0.0f);
            }
            String str4 = this.$creditAmount;
            if (str4 != null) {
                deviceSaleRepository5 = this.this$0.f105560b;
                deviceSaleRepository5.getPayment().setPaymentCreditAmount(str4.length() > 0 ? Float.parseFloat(AbstractC19741eO1.replace$default(str4, ",", "", false, 4, (Object) null)) : 0.0f);
            }
        }
        if (this.$paymentType == PaymentType.CASH && (str2 = this.$cashAmount) != null) {
            deviceSaleRepository4 = this.this$0.f105560b;
            deviceSaleRepository4.getPayment().setPaymentCashAmount(str2.length() > 0 ? Float.parseFloat(AbstractC19741eO1.replace$default(str2, ",", "", false, 4, (Object) null)) : 0.0f);
        }
        if (this.$paymentType == PaymentType.CREDIT && (str = this.$creditAmount) != null) {
            deviceSaleRepository3 = this.this$0.f105560b;
            deviceSaleRepository3.getPayment().setPaymentCreditAmount(str.length() > 0 ? Float.parseFloat(AbstractC19741eO1.replace$default(str, ",", "", false, 4, (Object) null)) : 0.0f);
        }
        deviceSaleRepository2 = this.this$0.f105560b;
        deviceSaleRepository2.getPayment().setCreditCardNumber(this.$credit4Digits);
        m3004G0 = this.this$0.m3004G0();
        m3004G0.setValue(new Event(new FragmentNavEvent(DeviceSaleInputAddressReceiptFragment.class, null, null, 6, null)));
    }
}