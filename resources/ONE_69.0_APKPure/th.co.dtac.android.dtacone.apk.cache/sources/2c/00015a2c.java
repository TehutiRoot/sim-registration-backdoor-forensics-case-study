package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.permission_activation.MrtrPermissionActivationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.NationWideCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/permission_activation/MrtrPermissionActivationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModel$validateBarcode$4 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateBarcodeViewModel$validateBarcode$4 extends Lambda implements Function1<Pair<? extends MrtrPrepaidValidateBarcodeResponse, ? extends MrtrPermissionActivationResponse>, Unit> {
    final /* synthetic */ MrtrPrepaidValidateBarcodeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidValidateBarcodeViewModel$validateBarcode$4(MrtrPrepaidValidateBarcodeViewModel mrtrPrepaidValidateBarcodeViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidValidateBarcodeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends MrtrPrepaidValidateBarcodeResponse, ? extends MrtrPermissionActivationResponse> pair) {
        invoke2((Pair<MrtrPrepaidValidateBarcodeResponse, MrtrPermissionActivationResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<MrtrPrepaidValidateBarcodeResponse, MrtrPermissionActivationResponse> pair) {
        MrtrPrepaidRepository mrtrPrepaidRepository;
        ConfigurationRepository configurationRepository;
        MrtrPrepaidRepository mrtrPrepaidRepository2;
        MrtrPrepaidRepository mrtrPrepaidRepository3;
        CardCollection cardCollection;
        MrtrPrepaidRepository mrtrPrepaidRepository4;
        MrtrPrepaidRepository mrtrPrepaidRepository5;
        mrtrPrepaidRepository = this.this$0.f106764b;
        MrtrPrepaidValidateBarcodeViewModel mrtrPrepaidValidateBarcodeViewModel = this.this$0;
        mrtrPrepaidRepository.setMrtrPrepaidValidateBarcodeResponse(pair.getFirst());
        String subscriberNumber = pair.getFirst().getSubscriberNumber();
        String str = subscriberNumber == null ? "" : subscriberNumber;
        String simcardNumber = pair.getFirst().getSimcardNumber();
        String str2 = simcardNumber == null ? "" : simcardNumber;
        String companyCode = pair.getFirst().getCompanyCode();
        String str3 = companyCode == null ? "" : companyCode;
        String simType = pair.getFirst().getSimType();
        mrtrPrepaidRepository.setNationWideCollection(new NationWideCollection(str, str2, str3, simType == null ? "" : simType, CollectionsKt__CollectionsKt.emptyList(), null));
        String displaySubscriberNumber = pair.getFirst().getDisplaySubscriberNumber();
        if (displaySubscriberNumber == null) {
            displaySubscriberNumber = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        configurationRepository = mrtrPrepaidValidateBarcodeViewModel.f106765c;
        mrtrPrepaidRepository.setDisplaySubscriberNumber(PhoneNumberExtKt.toPretty(AESCryptUtil.decryptCBC(displaySubscriberNumber, configurationRepository.dataPrivacyEncryptionAES256CBCKey())));
        mrtrPrepaidRepository.setMrtrPermissionActivationResponse(pair.getSecond());
        if (mrtrPrepaidRepository.getCardInformation() != null) {
            NationWideCollection nationWideCollection = mrtrPrepaidRepository.getNationWideCollection();
            Intrinsics.checkNotNull(nationWideCollection);
            IdCardInformationCollection cardInformation = mrtrPrepaidRepository.getCardInformation();
            Intrinsics.checkNotNull(cardInformation);
            cardCollection = mrtrPrepaidRepository.getCardCollection(nationWideCollection, cardInformation);
        } else {
            CardCollection card = mrtrPrepaidRepository.getCard();
            String cardType = card != null ? card.getCardType() : null;
            CardCollection card2 = mrtrPrepaidRepository.getCard();
            String identityNumber = card2 != null ? card2.getIdentityNumber() : null;
            mrtrPrepaidRepository2 = mrtrPrepaidValidateBarcodeViewModel.f106764b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = mrtrPrepaidRepository2.getMrtrPrepaidValidateBarcodeResponse();
            String subscriberNumber2 = mrtrPrepaidValidateBarcodeResponse != null ? mrtrPrepaidValidateBarcodeResponse.getSubscriberNumber() : null;
            mrtrPrepaidRepository3 = mrtrPrepaidValidateBarcodeViewModel.f106764b;
            MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse2 = mrtrPrepaidRepository3.getMrtrPrepaidValidateBarcodeResponse();
            cardCollection = new CardCollection(cardType, identityNumber, subscriberNumber2, mrtrPrepaidValidateBarcodeResponse2 != null ? mrtrPrepaidValidateBarcodeResponse2.getSimcardNumber() : null);
        }
        mrtrPrepaidRepository.setCard(cardCollection);
        mrtrPrepaidRepository4 = this.this$0.f106764b;
        if (!Intrinsics.areEqual(mrtrPrepaidRepository4.getFeatureCode(), PermissionConstant.M_FAMI_SIM)) {
            mrtrPrepaidRepository5 = this.this$0.f106764b;
            if (mrtrPrepaidRepository5.isCheckSimStock()) {
                this.this$0.m2010e(pair.getFirst());
                return;
            } else {
                this.this$0.navigateNext();
                return;
            }
        }
        this.this$0.validateFamilySim();
    }
}