package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardRequest;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel$encryptCard$1 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel$encryptCard$1 extends Lambda implements Function1<CardCollection, ValidateCardRequest> {
    final /* synthetic */ String $identityType;
    final /* synthetic */ MrtrPrepaidReregistValidateCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistValidateCardViewModel$encryptCard$1(String str, MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel) {
        super(1);
        this.$identityType = str;
        this.this$0 = mrtrPrepaidReregistValidateCardViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ValidateCardRequest invoke(@NotNull CardCollection it) {
        ConfigurationRepository configurationRepository;
        ConfigurationRepository configurationRepository2;
        MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this.$identityType;
        String identityNumber = it.getIdentityNumber();
        Intrinsics.checkNotNullExpressionValue(identityNumber, "it.identityNumber");
        configurationRepository = this.this$0.f106837c;
        String encryptCBC = AESCryptUtil.encryptCBC(identityNumber, configurationRepository.dataPrivacyEncryptionAES256CBCKey());
        String subscriberNumber = it.getSubscriberNumber();
        Intrinsics.checkNotNullExpressionValue(subscriberNumber, "it.subscriberNumber");
        configurationRepository2 = this.this$0.f106837c;
        String encryptCBC2 = AESCryptUtil.encryptCBC(subscriberNumber, configurationRepository2.dataPrivacyEncryptionAES256CBCKey());
        mrtrPrepaidReregistRepository = this.this$0.f106836b;
        return new ValidateCardRequest(str, encryptCBC, encryptCBC2, Boolean.valueOf(mrtrPrepaidReregistRepository.getModel().isOverruleXSim()));
    }
}