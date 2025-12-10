package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistCameraFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel$validateCard$4 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel$validateCard$4 extends Lambda implements Function1<ValidateCardResponse, Unit> {
    final /* synthetic */ CardCollection $card;
    final /* synthetic */ String $identityType;
    final /* synthetic */ MrtrPrepaidReregistValidateCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistValidateCardViewModel$validateCard$4(MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel, String str, CardCollection cardCollection) {
        super(1);
        this.this$0 = mrtrPrepaidReregistValidateCardViewModel;
        this.$identityType = str;
        this.$card = cardCollection;
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
        MutableLiveData m1980p;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mrtrPrepaidReregistRepository = this.this$0.f106836b;
        MrtrPrepaidReregistValidateCardViewModel mrtrPrepaidReregistValidateCardViewModel = this.this$0;
        String str = this.$identityType;
        CardCollection cardCollection = this.$card;
        mrtrPrepaidReregistRepository2 = mrtrPrepaidReregistValidateCardViewModel.f106836b;
        Boolean isNewOwner = validateCardResponse.isNewOwner();
        mrtrPrepaidReregistRepository2.setNewOwner(isNewOwner != null ? isNewOwner.booleanValue() : true);
        mrtrPrepaidReregistRepository.setCardInformationCollection(null);
        mrtrPrepaidReregistRepository.setUpdateForm(new UpdateProfileFormCollection(str, cardCollection.getIdentityNumber(), cardCollection.getTitle(), cardCollection.getFirstName(), cardCollection.getLastName(), cardCollection.getBirthDate()));
        m1980p = this.this$0.m1980p();
        m1980p.setValue(new Event(new FragmentNavEvent(MrtrPrepaidReregistCameraFragment.class, null, null, 4, null)));
    }
}