package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.response.MrtrPrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimPrepaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimPaymentFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$validateIdCardNumber$3 */
/* loaded from: classes9.dex */
public final class ESimViewModel$validateIdCardNumber$3 extends Lambda implements Function1<MrtrPrepaidValidateIdCardResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$validateIdCardNumber$3(ESimViewModel eSimViewModel, IdCardInformationCollection idCardInformationCollection, String str, String str2, boolean z) {
        super(1);
        this.this$0 = eSimViewModel;
        this.$cardInformation = idCardInformationCollection;
        this.$identityType = str;
        this.$idCardNumber = str2;
        this.$isFromSmartCard = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse) {
        invoke2(mrtrPrepaidValidateIdCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse) {
        ESimRepository eSimRepository;
        CardCollection cardCollection;
        ESimRepository eSimRepository2;
        ESimRepository eSimRepository3;
        ESimRepository eSimRepository4;
        ESimRepository eSimRepository5;
        ESimRepository eSimRepository6;
        ESimRepository eSimRepository7;
        MutableLiveData m2780C0;
        MutableLiveData m2780C02;
        ESimRepository eSimRepository8;
        ESimRepository eSimRepository9;
        String simcardNumber;
        eSimRepository = this.this$0.f105820b;
        if (this.$cardInformation != null) {
            ESimViewModel eSimViewModel = this.this$0;
            eSimRepository8 = eSimViewModel.f105820b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = eSimRepository8.getMrtrPrepaidValidateBarcodeResponse();
            String str = "";
            String str2 = (mrtrPrepaidValidateBarcodeResponse == null || (str2 = mrtrPrepaidValidateBarcodeResponse.getSubscriberNumber()) == null) ? "" : "";
            eSimRepository9 = this.this$0.f105820b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse2 = eSimRepository9.getMrtrPrepaidValidateBarcodeResponse();
            if (mrtrPrepaidValidateBarcodeResponse2 != null && (simcardNumber = mrtrPrepaidValidateBarcodeResponse2.getSimcardNumber()) != null) {
                str = simcardNumber;
            }
            cardCollection = eSimViewModel.m2745U(str2, str, this.$cardInformation);
        } else {
            String str3 = this.$identityType;
            String str4 = this.$idCardNumber;
            eSimRepository2 = this.this$0.f105820b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse3 = eSimRepository2.getMrtrPrepaidValidateBarcodeResponse();
            String subscriberNumber = mrtrPrepaidValidateBarcodeResponse3 != null ? mrtrPrepaidValidateBarcodeResponse3.getSubscriberNumber() : null;
            eSimRepository3 = this.this$0.f105820b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse4 = eSimRepository3.getMrtrPrepaidValidateBarcodeResponse();
            cardCollection = new CardCollection(str3, str4, subscriberNumber, mrtrPrepaidValidateBarcodeResponse4 != null ? mrtrPrepaidValidateBarcodeResponse4.getSimcardNumber() : null);
        }
        eSimRepository.setCard(cardCollection);
        eSimRepository4 = this.this$0.f105820b;
        eSimRepository4.setCardInformation(this.$cardInformation);
        eSimRepository5 = this.this$0.f105820b;
        Boolean showConsentXSIM = mrtrPrepaidValidateIdCardResponse.getShowConsentXSIM();
        eSimRepository5.setShowConsentXSIM(showConsentXSIM != null ? showConsentXSIM.booleanValue() : false);
        eSimRepository6 = this.this$0.f105820b;
        eSimRepository6.setSmartCard(this.$isFromSmartCard);
        boolean z = this.$isFromSmartCard;
        if (z) {
            this.this$0.getPostCodeInfo(this.$cardInformation);
        } else if (z) {
        } else {
            MutableLiveData<StatusResource> liveDataState = this.this$0.getLiveDataState();
            StatusResource statusResource = StatusResource.DISMISS;
            liveDataState.setValue(statusResource);
            this.this$0.getLiveDataState().setValue(statusResource);
            eSimRepository7 = this.this$0.f105820b;
            boolean isGotoPayment = eSimRepository7.isGotoPayment();
            if (isGotoPayment) {
                m2780C02 = this.this$0.m2780C0();
                m2780C02.setValue(new Event(new FragmentNavEvent(ESimPaymentFragment.class, null, null, 4, null)));
            } else if (isGotoPayment) {
            } else {
                m2780C0 = this.this$0.m2780C0();
                m2780C0.setValue(new Event(new FragmentNavEvent(ESimPrepaidSummaryFragment.class, null, null, 4, null)));
            }
        }
    }
}