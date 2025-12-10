package th.p047co.dtac.android.dtacone.viewmodel.esim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$validateBarcodePrePhysical$3 */
/* loaded from: classes9.dex */
public final class ESimViewModel$validateBarcodePrePhysical$3 extends Lambda implements Function1<MrtrPrepaidValidateBarcodeResponse, Unit> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$validateBarcodePrePhysical$3(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse) {
        invoke2(mrtrPrepaidValidateBarcodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse) {
        ESimRepository eSimRepository;
        ESimRepository eSimRepository2;
        String decryptCBC;
        eSimRepository = this.this$0.f105820b;
        eSimRepository.setMrtrPrepaidValidateBarcodeResponse(mrtrPrepaidValidateBarcodeResponse);
        eSimRepository2 = this.this$0.f105820b;
        String simcardNumber = mrtrPrepaidValidateBarcodeResponse.getSimcardNumber();
        if (simcardNumber == null) {
            simcardNumber = "";
        }
        eSimRepository2.setSimCardNumber(simcardNumber);
        ESimViewModel eSimViewModel = this.this$0;
        String subscriberNumber = mrtrPrepaidValidateBarcodeResponse.getSubscriberNumber();
        decryptCBC = eSimViewModel.decryptCBC(subscriberNumber != null ? subscriberNumber : "");
        eSimViewModel.setDisplayTelephoneNumber(PhoneNumberExtKt.toPretty(decryptCBC));
        if (this.this$0.isCheckSimStock()) {
            this.this$0.m2767J(Boolean.TRUE);
        } else {
            this.this$0.navigateNext();
        }
    }
}