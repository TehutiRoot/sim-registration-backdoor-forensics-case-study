package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel$getPostCodeInfo$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidValidationViewModel$getPostCodeInfo$2 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ OnePrepaidValidationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidValidationViewModel$getPostCodeInfo$2(OnePrepaidValidationViewModel onePrepaidValidationViewModel) {
        super(1);
        this.this$0 = onePrepaidValidationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        OnePrepaidRepository onePrepaidRepository;
        OnePrepaidRepository onePrepaidRepository2;
        OnePrepaidRepository onePrepaidRepository3;
        OnePrepaidRepository onePrepaidRepository4;
        OnePrepaidRepository onePrepaidRepository5;
        onePrepaidRepository = this.this$0.f95952b;
        if (!Intrinsics.areEqual(onePrepaidRepository.getCampaignFlag(), Boolean.TRUE) || !this.this$0.isTrue()) {
            this.this$0.m10589k();
            return;
        }
        OnePrepaidValidationViewModel onePrepaidValidationViewModel = this.this$0;
        onePrepaidRepository2 = onePrepaidValidationViewModel.f95952b;
        CampaignItem selectedCampaign = onePrepaidRepository2.getSelectedCampaign();
        String str = (selectedCampaign == null || (str = selectedCampaign.getPrivilegeCode()) == null) ? "" : "";
        onePrepaidRepository3 = this.this$0.f95952b;
        CampaignItem selectedCampaign2 = onePrepaidRepository3.getSelectedCampaign();
        String str2 = (selectedCampaign2 == null || (str2 = selectedCampaign2.getMatCode()) == null) ? "" : "";
        onePrepaidRepository4 = this.this$0.f95952b;
        CardCollection card = onePrepaidRepository4.getCard();
        String identityNumber = card != null ? card.getIdentityNumber() : null;
        if (identityNumber == null) {
            identityNumber = "";
        }
        onePrepaidRepository5 = this.this$0.f95952b;
        CardCollection card2 = onePrepaidRepository5.getCard();
        String birthDate = card2 != null ? card2.getBirthDate() : null;
        onePrepaidValidationViewModel.m10595e(str, str2, identityNumber, birthDate != null ? birthDate : "");
    }
}