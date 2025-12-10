package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$validateIdCardNumber$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$validateIdCardNumber$3 extends Lambda implements Function1<MrtrPostpaidValidateIdCardResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidRegistrationViewModel$validateIdCardNumber$3(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel, IdCardInformationCollection idCardInformationCollection, String str, String str2, boolean z) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
        this.$cardInformation = idCardInformationCollection;
        this.$identityType = str;
        this.$idCardNumber = str2;
        this.$isFromSmartCard = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidValidateIdCardResponse mrtrPostpaidValidateIdCardResponse) {
        invoke2(mrtrPostpaidValidateIdCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPostpaidValidateIdCardResponse mrtrPostpaidValidateIdCardResponse) {
        MrtrPostpaidRepository mrtrPostpaidRepository;
        MrtrPostpaidRepository mrtrPostpaidRepository2;
        MrtrPostpaidRepository mrtrPostpaidRepository3;
        String m2248t;
        MrtrPostpaidRepository mrtrPostpaidRepository4;
        mrtrPostpaidRepository = this.this$0.f106470b;
        Boolean showConsentXSIM = mrtrPostpaidValidateIdCardResponse.getShowConsentXSIM();
        mrtrPostpaidRepository.setShowConsentXSim(showConsentXSIM != null ? showConsentXSIM.booleanValue() : false);
        if (this.$cardInformation != null) {
            mrtrPostpaidRepository4 = this.this$0.f106470b;
            mrtrPostpaidRepository4.setCardInformation(this.$cardInformation);
        }
        mrtrPostpaidRepository2 = this.this$0.f106470b;
        mrtrPostpaidRepository2.setCard(new CardCollection(this.$identityType, this.$idCardNumber, "", ""));
        mrtrPostpaidRepository3 = this.this$0.f106470b;
        m2248t = this.this$0.m2248t(this.$idCardNumber);
        mrtrPostpaidRepository3.setIdNumber(m2248t);
        if (!this.this$0.isUserLan() || !Intrinsics.areEqual(this.$identityType, "01")) {
            this.this$0.m2264k0(this.$isFromSmartCard);
        } else {
            this.this$0.validateExistingCustomer(this.$idCardNumber, this.$identityType, this.$isFromSmartCard);
        }
    }
}