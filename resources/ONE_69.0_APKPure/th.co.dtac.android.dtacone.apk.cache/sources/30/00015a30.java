package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.family_sim.ValidateFamilySimResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/ValidateFamilySimResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$3 extends Lambda implements Function1<ValidateFamilySimResponse, Unit> {
    final /* synthetic */ MrtrPrepaidValidateBarcodeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$3(MrtrPrepaidValidateBarcodeViewModel mrtrPrepaidValidateBarcodeViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidValidateBarcodeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ValidateFamilySimResponse validateFamilySimResponse) {
        invoke2(validateFamilySimResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ValidateFamilySimResponse validateFamilySimResponse) {
        MrtrPrepaidRepository mrtrPrepaidRepository;
        MrtrPrepaidRepository mrtrPrepaidRepository2;
        mrtrPrepaidRepository = this.this$0.f106764b;
        if (mrtrPrepaidRepository.isCheckSimStock()) {
            mrtrPrepaidRepository2 = this.this$0.f106764b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = mrtrPrepaidRepository2.getMrtrPrepaidValidateBarcodeResponse();
            if (mrtrPrepaidValidateBarcodeResponse != null) {
                this.this$0.m2010e(mrtrPrepaidValidateBarcodeResponse);
                return;
            }
            return;
        }
        this.this$0.navigateNext();
    }
}