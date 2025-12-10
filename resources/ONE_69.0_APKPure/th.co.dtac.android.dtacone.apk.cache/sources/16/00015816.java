package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_change_to_esi.ExistingChangeToESIMResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_change_to_esi/ExistingChangeToESIMResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$existingChangeToESIM$3 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModel$existingChangeToESIM$3 extends Lambda implements Function1<ExistingChangeToESIMResponse, Unit> {
    final /* synthetic */ MrtrChangeSimValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimValidateViewModel$existingChangeToESIM$3(MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimValidateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExistingChangeToESIMResponse existingChangeToESIMResponse) {
        invoke2(existingChangeToESIMResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ExistingChangeToESIMResponse existingChangeToESIMResponse) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        MrtrChangeSimRepository mrtrChangeSimRepository2;
        MutableLiveData mutableLiveData;
        mrtrChangeSimRepository = this.this$0.f106213b;
        mrtrChangeSimRepository.setPendingEsimCard(existingChangeToESIMResponse.getPendingEsimCard());
        mrtrChangeSimRepository2 = this.this$0.f106213b;
        mrtrChangeSimRepository2.setNotCaptured(existingChangeToESIMResponse.isNotCaptured());
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mutableLiveData = this.this$0.f106220i;
        mutableLiveData.setValue(Resource.Companion.success(existingChangeToESIMResponse));
    }
}