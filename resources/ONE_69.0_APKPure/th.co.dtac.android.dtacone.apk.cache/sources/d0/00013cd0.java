package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.presenter.prepaid.OCRPresenter;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel$validateProfileTrue$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidValidationViewModel$validateProfileTrue$3 extends Lambda implements Function1<OneChangeOwnerValidateProfileResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ OnePrepaidValidationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidValidationViewModel$validateProfileTrue$3(OnePrepaidValidationViewModel onePrepaidValidationViewModel, IdCardInformationCollection idCardInformationCollection, boolean z, String str, String str2) {
        super(1);
        this.this$0 = onePrepaidValidationViewModel;
        this.$cardInformation = idCardInformationCollection;
        this.$isFromSmartCard = z;
        this.$identityType = str;
        this.$idCardNumber = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        invoke2(oneChangeOwnerValidateProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        OnePrepaidRepository onePrepaidRepository;
        OnePrepaidRepository onePrepaidRepository2;
        OnePrepaidRepository onePrepaidRepository3;
        OnePrepaidRepository onePrepaidRepository4;
        CardCollection cardCollection;
        OnePrepaidRepository onePrepaidRepository5;
        OnePrepaidRepository onePrepaidRepository6;
        OneValidateSimTrueResponse.Data data;
        PrepaidProfile prepaidProfile;
        OneValidateSimTrueResponse.Data data2;
        PrepaidProfile prepaidProfile2;
        OnePrepaidRepository onePrepaidRepository7;
        OnePrepaidRepository onePrepaidRepository8;
        OnePrepaidRepository onePrepaidRepository9;
        OnePrepaidRepository onePrepaidRepository10;
        String str;
        IdDocumentResult idDocument;
        String matCode;
        OnePrepaidRepository onePrepaidRepository11;
        OnePrepaidRepository onePrepaidRepository12;
        OnePrepaidRepository onePrepaidRepository13;
        OneValidateSimTrueResponse.Data data3;
        PrepaidProfile prepaidProfile3;
        OneValidateSimTrueResponse.Data data4;
        PrepaidProfile prepaidProfile4;
        onePrepaidRepository = this.this$0.f95952b;
        onePrepaidRepository.setValidateProfileResponse(oneChangeOwnerValidateProfileResponse);
        onePrepaidRepository2 = this.this$0.f95952b;
        onePrepaidRepository2.setCardInformation(this.$cardInformation);
        onePrepaidRepository3 = this.this$0.f95952b;
        onePrepaidRepository3.setFromSmartCard(this.$isFromSmartCard);
        onePrepaidRepository4 = this.this$0.f95952b;
        String str2 = null;
        if (this.$cardInformation != null) {
            onePrepaidRepository11 = this.this$0.f95952b;
            onePrepaidRepository12 = this.this$0.f95952b;
            OneValidateSimTrueResponse validateSimTrueResponse = onePrepaidRepository12.getValidateSimTrueResponse();
            String msisdn = (validateSimTrueResponse == null || (data4 = validateSimTrueResponse.getData()) == null || (prepaidProfile4 = data4.getPrepaidProfile()) == null) ? null : prepaidProfile4.getMsisdn();
            onePrepaidRepository13 = this.this$0.f95952b;
            OneValidateSimTrueResponse validateSimTrueResponse2 = onePrepaidRepository13.getValidateSimTrueResponse();
            if (validateSimTrueResponse2 != null && (data3 = validateSimTrueResponse2.getData()) != null && (prepaidProfile3 = data3.getPrepaidProfile()) != null) {
                str2 = prepaidProfile3.getSimCardNumber();
            }
            cardCollection = onePrepaidRepository11.getCardCollection(msisdn, str2, this.$cardInformation);
        } else {
            String str3 = this.$identityType;
            String str4 = this.$idCardNumber;
            onePrepaidRepository5 = this.this$0.f95952b;
            OneValidateSimTrueResponse validateSimTrueResponse3 = onePrepaidRepository5.getValidateSimTrueResponse();
            String msisdn2 = (validateSimTrueResponse3 == null || (data2 = validateSimTrueResponse3.getData()) == null || (prepaidProfile2 = data2.getPrepaidProfile()) == null) ? null : prepaidProfile2.getMsisdn();
            onePrepaidRepository6 = this.this$0.f95952b;
            OneValidateSimTrueResponse validateSimTrueResponse4 = onePrepaidRepository6.getValidateSimTrueResponse();
            if (validateSimTrueResponse4 != null && (data = validateSimTrueResponse4.getData()) != null && (prepaidProfile = data.getPrepaidProfile()) != null) {
                str2 = prepaidProfile.getSimCardNumber();
            }
            cardCollection = new CardCollection(str3, str4, msisdn2, str2);
        }
        onePrepaidRepository4.setCard(cardCollection);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (!this.$isFromSmartCard) {
            onePrepaidRepository7 = this.this$0.f95952b;
            if (!Intrinsics.areEqual(onePrepaidRepository7.getCampaignFlag(), Boolean.TRUE)) {
                this.this$0.m10589k();
                return;
            }
            OnePrepaidValidationViewModel onePrepaidValidationViewModel = this.this$0;
            onePrepaidRepository8 = onePrepaidValidationViewModel.f95952b;
            CampaignItem selectedCampaign = onePrepaidRepository8.getSelectedCampaign();
            String str5 = "";
            String str6 = (selectedCampaign == null || (str6 = selectedCampaign.getPrivilegeCode()) == null) ? "" : "";
            onePrepaidRepository9 = this.this$0.f95952b;
            CampaignItem selectedCampaign2 = onePrepaidRepository9.getSelectedCampaign();
            if (selectedCampaign2 != null && (matCode = selectedCampaign2.getMatCode()) != null) {
                str5 = matCode;
            }
            String str7 = this.$idCardNumber;
            onePrepaidRepository10 = this.this$0.f95952b;
            UpPassFormResult upPassFormResult = onePrepaidRepository10.getModel().getUpPassFormResult();
            if (upPassFormResult == null || (idDocument = upPassFormResult.getIdDocument()) == null || (str = idDocument.getBirthday()) == null) {
                str = OCRPresenter.defaultDate;
            }
            onePrepaidValidationViewModel.m10595e(str6, str5, str7, str);
            return;
        }
        this.this$0.getPostCodeInfo(this.$cardInformation);
    }
}