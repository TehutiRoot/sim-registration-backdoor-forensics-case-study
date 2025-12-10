package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OneValidateSimTrueResponse;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.PrepaidProfile;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$validateProfileTrue$3 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$validateProfileTrue$3 extends Lambda implements Function1<OneChangeOwnerValidateProfileResponse, Unit> {
    final /* synthetic */ String $birthDate;
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ Boolean $isRetry;
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$validateProfileTrue$3(OneMnpViewModel oneMnpViewModel, IdCardInformationCollection idCardInformationCollection, boolean z, String str, String str2, String str3, Boolean bool) {
        super(1);
        this.this$0 = oneMnpViewModel;
        this.$cardInformation = idCardInformationCollection;
        this.$isFromSmartCard = z;
        this.$identityType = str;
        this.$idCardNumber = str2;
        this.$birthDate = str3;
        this.$isRetry = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        invoke2(oneChangeOwnerValidateProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        CardCollection cardCollection;
        OneValidateSimTrueResponse.Data data;
        PrepaidProfile prepaidProfile;
        OneValidateSimTrueResponse.Data data2;
        PrepaidProfile prepaidProfile2;
        Boolean bool;
        MutableLiveData m13398y1;
        ConfigurationRepository configurationRepository;
        String matCode;
        String privilegeCode;
        OneMnpRepository oneMnpRepository;
        OneValidateSimTrueResponse.Data data3;
        PrepaidProfile prepaidProfile3;
        OneValidateSimTrueResponse.Data data4;
        PrepaidProfile prepaidProfile4;
        this.this$0.f92029F0 = oneChangeOwnerValidateProfileResponse;
        this.this$0.setCardInformation(this.$cardInformation);
        this.this$0.setSmartCard(this.$isFromSmartCard);
        OneMnpViewModel oneMnpViewModel = this.this$0;
        String str = null;
        if (this.$cardInformation != null) {
            oneMnpRepository = oneMnpViewModel.f92116c;
            OneValidateSimTrueResponse validateSimTrueResponse = this.this$0.getValidateSimTrueResponse();
            String msisdn = (validateSimTrueResponse == null || (data4 = validateSimTrueResponse.getData()) == null || (prepaidProfile4 = data4.getPrepaidProfile()) == null) ? null : prepaidProfile4.getMsisdn();
            OneValidateSimTrueResponse validateSimTrueResponse2 = this.this$0.getValidateSimTrueResponse();
            if (validateSimTrueResponse2 != null && (data3 = validateSimTrueResponse2.getData()) != null && (prepaidProfile3 = data3.getPrepaidProfile()) != null) {
                str = prepaidProfile3.getSimCardNumber();
            }
            cardCollection = oneMnpRepository.getCardCollection(msisdn, str, this.$cardInformation);
        } else {
            String str2 = this.$identityType;
            String str3 = this.$idCardNumber;
            OneValidateSimTrueResponse validateSimTrueResponse3 = this.this$0.getValidateSimTrueResponse();
            String msisdn2 = (validateSimTrueResponse3 == null || (data2 = validateSimTrueResponse3.getData()) == null || (prepaidProfile2 = data2.getPrepaidProfile()) == null) ? null : prepaidProfile2.getMsisdn();
            OneValidateSimTrueResponse validateSimTrueResponse4 = this.this$0.getValidateSimTrueResponse();
            if (validateSimTrueResponse4 != null && (data = validateSimTrueResponse4.getData()) != null && (prepaidProfile = data.getPrepaidProfile()) != null) {
                str = prepaidProfile.getSimCardNumber();
            }
            cardCollection = new CardCollection(str2, str3, msisdn2, str);
        }
        oneMnpViewModel.setCard(cardCollection);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (!this.$isFromSmartCard) {
            bool = this.this$0.f92041I0;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                OneMnpViewModel oneMnpViewModel2 = this.this$0;
                CampaignItem selectedCampaign = oneMnpViewModel2.getSelectedCampaign();
                String str4 = (selectedCampaign == null || (privilegeCode = selectedCampaign.getPrivilegeCode()) == null) ? "" : privilegeCode;
                CampaignItem selectedCampaign2 = this.this$0.getSelectedCampaign();
                oneMnpViewModel2.m13435p0(str4, (selectedCampaign2 == null || (matCode = selectedCampaign2.getMatCode()) == null) ? "" : matCode, this.$idCardNumber, this.$birthDate, this.$isRetry);
                return;
            } else if (Intrinsics.areEqual(this.$isRetry, bool2)) {
                m13398y1 = this.this$0.m13398y1();
                Resource.Companion companion = Resource.Companion;
                configurationRepository = this.this$0.f92128f;
                m13398y1.setValue(companion.success(Integer.valueOf(configurationRepository.prepaidRegistrationReferenceDocMax())));
                return;
            } else {
                this.this$0.m13529O1(this.$isFromSmartCard);
                return;
            }
        }
        this.this$0.getPostCodeInfo();
    }
}