package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$validateIdCardNumber$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$validateIdCardNumber$3 extends Lambda implements Function1<OnePostpaidValidateIdCardResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$validateIdCardNumber$3(IdCardInformationCollection idCardInformationCollection, OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, String str, String str2, boolean z) {
        super(1);
        this.$cardInformation = idCardInformationCollection;
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$identityType = str;
        this.$idCardNumber = str2;
        this.$isFromSmartCard = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidateIdCardResponse onePostpaidValidateIdCardResponse) {
        invoke2(onePostpaidValidateIdCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidateIdCardResponse onePostpaidValidateIdCardResponse) {
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        String m11521z0;
        OnePostpaidRepository onePostpaidRepository3;
        OnePostpaidRepository onePostpaidRepository4;
        if (this.$cardInformation != null) {
            onePostpaidRepository4 = this.this$0.f94609b;
            onePostpaidRepository4.setCardInformation(this.$cardInformation);
        }
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.setCard(new CardCollection(this.$identityType, this.$idCardNumber, "", ""));
        onePostpaidRepository2 = this.this$0.f94609b;
        m11521z0 = this.this$0.m11521z0(this.$idCardNumber);
        onePostpaidRepository2.setIdNumber(m11521z0);
        onePostpaidRepository3 = this.this$0.f94609b;
        onePostpaidRepository3.setSmartCard(this.$isFromSmartCard);
        this.this$0.m11523y2(this.$isFromSmartCard);
    }
}