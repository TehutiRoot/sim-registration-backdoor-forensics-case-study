package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

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
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistCameraFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel$validateCardDtac$4 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModel$validateCardDtac$4 extends Lambda implements Function1<ValidateCardResponse, Unit> {
    final /* synthetic */ CardCollection $card;
    final /* synthetic */ String $identityType;
    final /* synthetic */ OneChangeOwnerValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerValidateViewModel$validateCardDtac$4(OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel, String str, CardCollection cardCollection) {
        super(1);
        this.this$0 = oneChangeOwnerValidateViewModel;
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
        OneChangeOwnerRepository oneChangeOwnerRepository;
        OneChangeOwnerRepository oneChangeOwnerRepository2;
        MutableLiveData m15321y;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        oneChangeOwnerRepository = this.this$0.f89344b;
        OneChangeOwnerValidateViewModel oneChangeOwnerValidateViewModel = this.this$0;
        String str = this.$identityType;
        CardCollection cardCollection = this.$card;
        oneChangeOwnerRepository2 = oneChangeOwnerValidateViewModel.f89344b;
        Boolean isNewOwner = validateCardResponse.isNewOwner();
        oneChangeOwnerRepository2.setNewOwner(isNewOwner != null ? isNewOwner.booleanValue() : true);
        oneChangeOwnerRepository.setCardInformationCollection(null);
        oneChangeOwnerRepository.setUpdateForm(new UpdateProfileFormCollection(str, cardCollection.getIdentityNumber(), cardCollection.getTitle(), cardCollection.getFirstName(), cardCollection.getLastName(), cardCollection.getBirthDate()));
        m15321y = this.this$0.m15321y();
        m15321y.setValue(new Event(new FragmentNavEvent(MrtrPrepaidReregistCameraFragment.class, null, null, 4, null)));
    }
}