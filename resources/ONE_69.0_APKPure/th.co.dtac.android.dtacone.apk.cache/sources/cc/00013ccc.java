package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel$validateIdCardNumber$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidValidationViewModel$validateIdCardNumber$3 extends Lambda implements Function1<OnePrepaidValidateIdCardResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ OnePrepaidValidationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidValidationViewModel$validateIdCardNumber$3(OnePrepaidValidationViewModel onePrepaidValidationViewModel, IdCardInformationCollection idCardInformationCollection, String str, String str2, boolean z) {
        super(1);
        this.this$0 = onePrepaidValidationViewModel;
        this.$cardInformation = idCardInformationCollection;
        this.$identityType = str;
        this.$idCardNumber = str2;
        this.$isFromSmartCard = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse) {
        invoke2(onePrepaidValidateIdCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse) {
        OnePrepaidRepository onePrepaidRepository;
        OnePrepaidRepository onePrepaidRepository2;
        CardCollection cardCollection;
        OnePrepaidRepository onePrepaidRepository3;
        OnePrepaidRepository onePrepaidRepository4;
        OnePrepaidRepository onePrepaidRepository5;
        OnePrepaidRepository onePrepaidRepository6;
        OnePrepaidRepository onePrepaidRepository7;
        OnePrepaidRepository onePrepaidRepository8;
        OnePrepaidRepository onePrepaidRepository9;
        onePrepaidRepository = this.this$0.f95952b;
        onePrepaidRepository.setPrepaidValidateIdCardResponse(onePrepaidValidateIdCardResponse);
        onePrepaidRepository2 = this.this$0.f95952b;
        if (this.$cardInformation != null) {
            onePrepaidRepository7 = this.this$0.f95952b;
            onePrepaidRepository8 = this.this$0.f95952b;
            OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData = onePrepaidRepository8.getValidateBarcodeData();
            String subscriberNumber = validateBarcodeData != null ? validateBarcodeData.getSubscriberNumber() : null;
            onePrepaidRepository9 = this.this$0.f95952b;
            OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData2 = onePrepaidRepository9.getValidateBarcodeData();
            cardCollection = onePrepaidRepository7.getCardCollection(subscriberNumber, validateBarcodeData2 != null ? validateBarcodeData2.getSimcardNumber() : null, this.$cardInformation);
        } else {
            String str = this.$identityType;
            String str2 = this.$idCardNumber;
            onePrepaidRepository3 = this.this$0.f95952b;
            OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData3 = onePrepaidRepository3.getValidateBarcodeData();
            String subscriberNumber2 = validateBarcodeData3 != null ? validateBarcodeData3.getSubscriberNumber() : null;
            onePrepaidRepository4 = this.this$0.f95952b;
            OnePrepaidValidateSimBarcodeResponse.ValidateBarcodeData validateBarcodeData4 = onePrepaidRepository4.getValidateBarcodeData();
            cardCollection = new CardCollection(str, str2, subscriberNumber2, validateBarcodeData4 != null ? validateBarcodeData4.getSimcardNumber() : null);
        }
        onePrepaidRepository2.setCard(cardCollection);
        onePrepaidRepository5 = this.this$0.f95952b;
        onePrepaidRepository5.setCardInformation(this.$cardInformation);
        onePrepaidRepository6 = this.this$0.f95952b;
        onePrepaidRepository6.setFromSmartCard(this.$isFromSmartCard);
        boolean z = this.$isFromSmartCard;
        if (z) {
            this.this$0.getPostCodeInfo(this.$cardInformation);
        } else if (z) {
        } else {
            this.this$0.m10589k();
        }
    }
}