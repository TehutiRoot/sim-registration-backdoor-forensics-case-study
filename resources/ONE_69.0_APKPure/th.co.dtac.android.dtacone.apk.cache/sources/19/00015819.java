package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimRequestVerifyReason;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.current_sim.response.MrtrChangeSimGetCurrentSimResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/current_sim/response/MrtrChangeSimGetCurrentSimResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$getCurrentSim$3 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModel$getCurrentSim$3 extends Lambda implements Function1<MrtrChangeSimGetCurrentSimResponse, Unit> {
    final /* synthetic */ MrtrChangeSimValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimValidateViewModel$getCurrentSim$3(MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimValidateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrChangeSimGetCurrentSimResponse mrtrChangeSimGetCurrentSimResponse) {
        invoke2(mrtrChangeSimGetCurrentSimResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrChangeSimGetCurrentSimResponse mrtrChangeSimGetCurrentSimResponse) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        MrtrChangeSimRepository mrtrChangeSimRepository2;
        ConfigurationRepository configurationRepository;
        MrtrChangeSimRepository mrtrChangeSimRepository3;
        MutableLiveData mutableLiveData;
        mrtrChangeSimRepository = this.this$0.f106213b;
        mrtrChangeSimRepository.setGetCurrentSimResponse(mrtrChangeSimGetCurrentSimResponse);
        mrtrChangeSimRepository2 = this.this$0.f106213b;
        configurationRepository = this.this$0.f106214c;
        List<String> list = configurationRepository.toggleChangeSimESIMReasonCode();
        mrtrChangeSimRepository3 = this.this$0.f106213b;
        ChangeSimRequestVerifyReason changeSimRequestVerifyReason = mrtrChangeSimRepository3.getChangeSimRequestVerifyReason();
        mrtrChangeSimRepository2.setSaveESIMOrder(CollectionsKt___CollectionsKt.contains(list, changeSimRequestVerifyReason != null ? changeSimRequestVerifyReason.getReasonCode() : null));
        mutableLiveData = this.this$0.f106218g;
        mutableLiveData.setValue(Resource.Companion.success(mrtrChangeSimGetCurrentSimResponse));
        if (this.this$0.isSaveESIMOrder()) {
            this.this$0.existingChangeToESIM();
        } else {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        }
    }
}