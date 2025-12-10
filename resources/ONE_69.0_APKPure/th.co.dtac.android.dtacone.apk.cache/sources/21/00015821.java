package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.response.MrtrChangeSimVerifyResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$verifyChangeSim$3 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModel$verifyChangeSim$3 extends Lambda implements Function1<MrtrChangeSimVerifyResponse, Unit> {
    final /* synthetic */ String $newSimCardNumber;
    final /* synthetic */ MrtrChangeSimValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimValidateViewModel$verifyChangeSim$3(MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel, String str) {
        super(1);
        this.this$0 = mrtrChangeSimValidateViewModel;
        this.$newSimCardNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse) {
        invoke2(mrtrChangeSimVerifyResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrChangeSimVerifyResponse mrtrChangeSimVerifyResponse) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        MrtrChangeSimRepository mrtrChangeSimRepository2;
        MutableLiveData mutableLiveData;
        mrtrChangeSimRepository = this.this$0.f106213b;
        mrtrChangeSimRepository.setVerifyResponse(mrtrChangeSimVerifyResponse);
        mrtrChangeSimRepository2 = this.this$0.f106213b;
        if (mrtrChangeSimRepository2.isCheckSimStock()) {
            this.this$0.checkSimStock(this.$newSimCardNumber);
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mutableLiveData = this.this$0.f106222k;
        mutableLiveData.setValue(Resource.Companion.success(mrtrChangeSimVerifyResponse));
    }
}