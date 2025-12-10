package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$validateSimBarcode$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel$validateSimBarcode$3 extends Lambda implements Function1<MrtrPostpaidValidateSimBarcodeResponse, Unit> {
    final /* synthetic */ String $barcode;
    final /* synthetic */ ESimPostpaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidViewModel$validateSimBarcode$3(ESimPostpaidViewModel eSimPostpaidViewModel, String str) {
        super(1);
        this.this$0 = eSimPostpaidViewModel;
        this.$barcode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse) {
        invoke2(mrtrPostpaidValidateSimBarcodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse) {
        ESimRepository eSimRepository;
        ESimRepository eSimRepository2;
        ESimRepository eSimRepository3;
        ESimRepository eSimRepository4;
        MutableLiveData m2810o0;
        eSimRepository = this.this$0.f105735b;
        eSimRepository2 = this.this$0.f105735b;
        eSimRepository.setDisplayTelephoneNumber(PhoneNumberExtKt.toPretty(eSimRepository2.decryptCBC(mrtrPostpaidValidateSimBarcodeResponse.getSubscriberNumber())));
        eSimRepository3 = this.this$0.f105735b;
        eSimRepository3.setSimBarcode(this.$barcode);
        eSimRepository4 = this.this$0.f105735b;
        String simCardNumber = mrtrPostpaidValidateSimBarcodeResponse.getSimCardNumber();
        if (simCardNumber == null) {
            simCardNumber = "";
        }
        eSimRepository4.setSimCardNumber(simCardNumber);
        this.this$0.setValidateSimBarcodeResponse(mrtrPostpaidValidateSimBarcodeResponse);
        if (this.this$0.isCheckSimStock()) {
            this.this$0.checkSimStock(mrtrPostpaidValidateSimBarcodeResponse.getSimCardNumber());
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m2810o0 = this.this$0.m2810o0();
        m2810o0.setValue(Resource.Companion.success(null));
    }
}