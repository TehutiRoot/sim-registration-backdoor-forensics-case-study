package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.response.MrtrPrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.NationWideCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.prepaid.config.FaceRecognitionByPass;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateIdCardNumberViewModel$validateIdCardNumber$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateIdCardNumberViewModel$validateIdCardNumber$3 extends Lambda implements Function1<MrtrPrepaidValidateIdCardResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ MrtrPrepaidValidateIdCardNumberViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidValidateIdCardNumberViewModel$validateIdCardNumber$3(MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel, IdCardInformationCollection idCardInformationCollection, String str, String str2, boolean z) {
        super(1);
        this.this$0 = mrtrPrepaidValidateIdCardNumberViewModel;
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
        MrtrPrepaidRepository mrtrPrepaidRepository;
        MrtrPrepaidRepository mrtrPrepaidRepository2;
        CardCollection cardCollection;
        MrtrPrepaidRepository mrtrPrepaidRepository3;
        MrtrPrepaidRepository mrtrPrepaidRepository4;
        MrtrPrepaidRepository mrtrPrepaidRepository5;
        MrtrPrepaidRepository mrtrPrepaidRepository6;
        MutableLiveData m2000c;
        MutableLiveData m1998e;
        ConfigurationRepository configurationRepository;
        FaceRecognitionByPass faceRecognitionByPass;
        MrtrPrepaidRepository mrtrPrepaidRepository7;
        MrtrPrepaidRepository mrtrPrepaidRepository8;
        mrtrPrepaidRepository = this.this$0.f106804b;
        mrtrPrepaidRepository.setMrtrPrepaidValidateIdCardResponse(mrtrPrepaidValidateIdCardResponse);
        mrtrPrepaidRepository2 = this.this$0.f106804b;
        Boolean bool = null;
        if (this.$cardInformation != null) {
            mrtrPrepaidRepository7 = this.this$0.f106804b;
            NationWideCollection nationWideCollection = mrtrPrepaidRepository7.getNationWideCollection();
            if (nationWideCollection != null) {
                MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel = this.this$0;
                IdCardInformationCollection idCardInformationCollection = this.$cardInformation;
                mrtrPrepaidRepository8 = mrtrPrepaidValidateIdCardNumberViewModel.f106804b;
                cardCollection = mrtrPrepaidRepository8.getCardCollection(nationWideCollection, idCardInformationCollection);
            } else {
                cardCollection = null;
            }
        } else {
            String str = this.$identityType;
            String str2 = this.$idCardNumber;
            mrtrPrepaidRepository3 = this.this$0.f106804b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = mrtrPrepaidRepository3.getMrtrPrepaidValidateBarcodeResponse();
            String subscriberNumber = mrtrPrepaidValidateBarcodeResponse != null ? mrtrPrepaidValidateBarcodeResponse.getSubscriberNumber() : null;
            mrtrPrepaidRepository4 = this.this$0.f106804b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse2 = mrtrPrepaidRepository4.getMrtrPrepaidValidateBarcodeResponse();
            cardCollection = new CardCollection(str, str2, subscriberNumber, mrtrPrepaidValidateBarcodeResponse2 != null ? mrtrPrepaidValidateBarcodeResponse2.getSimcardNumber() : null);
        }
        mrtrPrepaidRepository2.setCard(cardCollection);
        mrtrPrepaidRepository5 = this.this$0.f106804b;
        mrtrPrepaidRepository5.setCardInformation(this.$cardInformation);
        boolean z = this.$isFromSmartCard;
        if (z) {
            this.this$0.getPostCodeInfo(this.$cardInformation);
        } else if (z) {
        } else {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            mrtrPrepaidRepository6 = this.this$0.f106804b;
            PrepaidConfig prepaidConfig = mrtrPrepaidRepository6.getPrepaidConfig();
            if (prepaidConfig != null && (faceRecognitionByPass = prepaidConfig.getFaceRecognitionByPass()) != null) {
                bool = Boolean.valueOf(faceRecognitionByPass.getByPass());
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                m1998e = this.this$0.m1998e();
                Resource.Companion companion = Resource.Companion;
                configurationRepository = this.this$0.f106805c;
                m1998e.setValue(companion.success(Integer.valueOf(configurationRepository.prepaidRegistrationReferenceDocMax())));
                return;
            }
            m2000c = this.this$0.m2000c();
            m2000c.setValue(new Event(new FragmentNavEvent(UpPassFormFragment.class, null, null, 4, null)));
        }
    }
}