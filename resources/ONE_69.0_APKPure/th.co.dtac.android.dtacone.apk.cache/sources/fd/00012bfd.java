package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_sim.PrepaidProfileItem;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel$validateSmartCardTrue$5 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModel$validateSmartCardTrue$5 extends Lambda implements Function1<OneChangeOwnerValidateProfileResponse, Unit> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ CardCollection $card;
    final /* synthetic */ String $identityType;
    final /* synthetic */ OneChangeOwnerValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerValidateViewModel$validateSmartCardTrue$5(OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel, CardCollection cardCollection, BitmapCollection bitmapCollection, String str) {
        super(1);
        this.this$0 = oneChangeOwnerValidateViewModel;
        this.$card = cardCollection;
        this.$bitmap = bitmapCollection;
        this.$identityType = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        invoke2(oneChangeOwnerValidateProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeOwnerValidateProfileResponse oneChangeOwnerValidateProfileResponse) {
        OneChangeOwnerRepository oneChangeOwnerRepository;
        OneChangeOwnerRepository oneChangeOwnerRepository2;
        OneChangeOwnerRepository oneChangeOwnerRepository3;
        ConfigurationRepository configurationRepository;
        boolean m15329q;
        oneChangeOwnerRepository = this.this$0.f89344b;
        OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel = this.this$0;
        CardCollection cardCollection = this.$card;
        String str = this.$identityType;
        oneChangeOwnerRepository2 = oneChangeOwnerValidateViewModel.f89344b;
        oneChangeOwnerRepository3 = oneChangeOwnerValidateViewModel.f89344b;
        PrepaidProfileItem validateSimResponse = oneChangeOwnerRepository3.getValidateSimResponse();
        String str2 = (validateSimResponse == null || (str2 = validateSimResponse.getIdNumber()) == null) ? "" : "";
        configurationRepository = oneChangeOwnerValidateViewModel.f89345c;
        m15329q = oneChangeOwnerValidateViewModel.m15329q(cardCollection, AESCryptUtil.decryptCBC(str2, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
        oneChangeOwnerRepository2.setNewOwner(m15329q);
        oneChangeOwnerRepository.setUpdateForm(new UpdateProfileFormCollection(str, cardCollection.getIdentityNumber(), cardCollection.getTitle(), cardCollection.getFirstName(), cardCollection.getLastName(), cardCollection.getBirthDate()));
        OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel2 = this.this$0;
        String amphur = this.$card.getAmphur();
        Intrinsics.checkNotNullExpressionValue(amphur, "card.amphur");
        String province = this.$card.getProvince();
        Intrinsics.checkNotNullExpressionValue(province, "card.province");
        oneChangeOwnerValidateViewModel2.m15330p(amphur, province, this.$bitmap);
    }
}