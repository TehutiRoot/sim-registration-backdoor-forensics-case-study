package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_id_card.response.MrtrPrepaidValidateIdCardResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_id_card/response/MrtrPrepaidValidateIdCardResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$validateIdCardNumber$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$validateIdCardNumber$3 extends Lambda implements Function1<MrtrPrepaidValidateIdCardResponse, Unit> {
    final /* synthetic */ IdCardInformationCollection $cardInformation;
    final /* synthetic */ String $idCardNumber;
    final /* synthetic */ String $identityType;
    final /* synthetic */ boolean $isFromSmartCard;
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$validateIdCardNumber$3(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel, boolean z, IdCardInformationCollection idCardInformationCollection, String str, String str2) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
        this.$isFromSmartCard = z;
        this.$cardInformation = idCardInformationCollection;
        this.$identityType = str;
        this.$idCardNumber = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse) {
        invoke2(mrtrPrepaidValidateIdCardResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidValidateIdCardResponse mrtrPrepaidValidateIdCardResponse) {
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository;
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository2;
        CardCollection cardCollection;
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository3;
        MutableLiveData m2101R;
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository4;
        mrtrPrepaidMultiSimRepository = this.this$0.f106670b;
        mrtrPrepaidMultiSimRepository.setMrtrPrepaidValidateIdCardResponse(mrtrPrepaidValidateIdCardResponse);
        this.this$0.setSmartCard(this.$isFromSmartCard);
        mrtrPrepaidMultiSimRepository2 = this.this$0.f106670b;
        if (this.$cardInformation != null) {
            mrtrPrepaidMultiSimRepository4 = this.this$0.f106670b;
            cardCollection = mrtrPrepaidMultiSimRepository4.getCardCollection(this.$cardInformation);
        } else {
            cardCollection = new CardCollection(this.$identityType, this.$idCardNumber, "", "");
        }
        mrtrPrepaidMultiSimRepository2.setCard(cardCollection);
        mrtrPrepaidMultiSimRepository3 = this.this$0.f106670b;
        mrtrPrepaidMultiSimRepository3.setCardInformation(this.$cardInformation);
        boolean z = this.$isFromSmartCard;
        if (z) {
            this.this$0.getPostCodeInfo(this.$cardInformation);
        } else if (z) {
        } else {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            m2101R = this.this$0.m2101R();
            m2101R.setValue(new Event(new FragmentNavEvent(UpPassFormFragment.class, null, null, 4, null)));
        }
    }
}