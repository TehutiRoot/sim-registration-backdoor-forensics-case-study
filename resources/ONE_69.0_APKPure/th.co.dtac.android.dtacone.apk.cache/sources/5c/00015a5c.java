package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$5 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$5 extends Lambda implements Function1<ValidateCardResponse, Unit> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ CardCollection $card;
    final /* synthetic */ String $identityType;
    final /* synthetic */ MrtrPrepaidReregistValidateCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$5(MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel, CardCollection cardCollection, BitmapCollection bitmapCollection, String str) {
        super(1);
        this.this$0 = mrtrPrepaidReregistValidateCardViewModel;
        this.$card = cardCollection;
        this.$bitmap = bitmapCollection;
        this.$identityType = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ValidateCardResponse validateCardResponse) {
        invoke2(validateCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ValidateCardResponse validateCardResponse) {
        MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository;
        MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository2;
        mrtrPrepaidReregistRepository = this.this$0.f106836b;
        MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel = this.this$0;
        String str = this.$identityType;
        CardCollection cardCollection = this.$card;
        mrtrPrepaidReregistRepository2 = mrtrPrepaidReregistValidateCardViewModel.f106836b;
        Boolean isNewOwner = validateCardResponse.isNewOwner();
        mrtrPrepaidReregistRepository2.setNewOwner(isNewOwner != null ? isNewOwner.booleanValue() : true);
        mrtrPrepaidReregistRepository.setUpdateForm(new UpdateProfileFormCollection(str, cardCollection.getIdentityNumber(), cardCollection.getTitle(), cardCollection.getFirstName(), cardCollection.getLastName(), cardCollection.getBirthDate()));
        MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel2 = this.this$0;
        String amphur = this.$card.getAmphur();
        Intrinsics.checkNotNullExpressionValue(amphur, "card.amphur");
        String province = this.$card.getProvince();
        Intrinsics.checkNotNullExpressionValue(province, "card.province");
        mrtrPrepaidReregistValidateCardViewModel2.m1986j(amphur, province, this.$bitmap);
    }
}