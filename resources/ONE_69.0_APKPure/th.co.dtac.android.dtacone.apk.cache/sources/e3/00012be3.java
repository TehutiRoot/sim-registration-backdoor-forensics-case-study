package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel$encryptCardTrue$1 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModel$encryptCardTrue$1 extends Lambda implements Function1<CardCollection, OneChangeOwnerValidateProfileRequest> {
    final /* synthetic */ String $identityType;
    final /* synthetic */ OneChangeOwnerValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerValidateViewModel$encryptCardTrue$1(OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel, String str) {
        super(1);
        this.this$0 = oneChangeOwnerValidateViewModel;
        this.$identityType = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneChangeOwnerValidateProfileRequest invoke(@NotNull CardCollection it) {
        ConfigurationRepository configurationRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        String identityNumber = it.getIdentityNumber();
        Intrinsics.checkNotNullExpressionValue(identityNumber, "it.identityNumber");
        configurationRepository = this.this$0.f89345c;
        return new OneChangeOwnerValidateProfileRequest(AESCryptUtil.encryptCBC(identityNumber, configurationRepository.dataPrivacyEncryptionAES256CBCKey()), this.$identityType, "CHANGE_OWNER");
    }
}