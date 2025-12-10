package th.p047co.dtac.android.dtacone.viewmodel.esim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$validateIdCardNumber$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel$validateIdCardNumber$3 extends Lambda implements Function1<MrtrPostpaidValidateIdCardResponse, Unit> {
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ ESimPostpaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidViewModel$validateIdCardNumber$3(ESimPostpaidViewModel eSimPostpaidViewModel, String str, String str2, boolean z) {
        super(1);
        this.this$0 = eSimPostpaidViewModel;
        this.$idCardNumber = str;
        this.$identityType = str2;
        this.$isFromSmartCard = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidValidateIdCardResponse mrtrPostpaidValidateIdCardResponse) {
        invoke2(mrtrPostpaidValidateIdCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPostpaidValidateIdCardResponse mrtrPostpaidValidateIdCardResponse) {
        ESimRepository eSimRepository;
        ESimRepository eSimRepository2;
        StringBuilder sb = new StringBuilder();
        sb.append("validateIdCardNumber: response = ");
        sb.append(mrtrPostpaidValidateIdCardResponse);
        eSimRepository = this.this$0.f105735b;
        Boolean showConsentXSIM = mrtrPostpaidValidateIdCardResponse.getShowConsentXSIM();
        eSimRepository.setShowConsentXSIM(showConsentXSIM != null ? showConsentXSIM.booleanValue() : false);
        eSimRepository2 = this.this$0.f105735b;
        eSimRepository2.setIdNumber(this.$idCardNumber);
        this.this$0.setIdDocType(this.$identityType);
        boolean isUserLan = this.this$0.isUserLan();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("validateIdCardNumber: isUserLan() = ");
        sb2.append(isUserLan);
        String str = this.$identityType;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("validateIdCardNumber: identityType = ");
        sb3.append(str);
        if (!this.this$0.isUserLan() || !Intrinsics.areEqual(this.$identityType, "01")) {
            this.this$0.m2794w0(this.$isFromSmartCard);
        } else {
            this.this$0.validateExistingCustomer(this.$idCardNumber, this.$identityType, this.$isFromSmartCard);
        }
    }
}