package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.esim.SimCardNumberResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/esim/SimCardNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$getSimCardNumberForESim$2 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$getSimCardNumberForESim$2 extends Lambda implements Function1<SimCardNumberResponse, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$getSimCardNumberForESim$2(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimCardNumberResponse simCardNumberResponse) {
        invoke2(simCardNumberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SimCardNumberResponse simCardNumberResponse) {
        MutableLiveData m2416A;
        String simCardNumber;
        MutableLiveData m2416A2;
        MutableLiveData m2416A3;
        this.this$0.setSimCardNumberResponse(simCardNumberResponse);
        m2416A = this.this$0.m2416A();
        Resource.Companion companion = Resource.Companion;
        m2416A.postValue(companion.success("onNext"));
        SimCardNumberResponse simCardNumberResponse2 = this.this$0.getSimCardNumberResponse();
        if (simCardNumberResponse2 == null || (simCardNumber = simCardNumberResponse2.getSimCardNumber()) == null) {
            return;
        }
        MrtrChangeSimViewModel mrtrChangeSimViewModel = this.this$0;
        if (mrtrChangeSimViewModel.checkCallAutoTransferEDMS()) {
            m2416A3 = mrtrChangeSimViewModel.m2416A();
            m2416A3.postValue(companion.success("onNext"));
            mrtrChangeSimViewModel.m2397j(simCardNumber);
            return;
        }
        m2416A2 = mrtrChangeSimViewModel.m2416A();
        m2416A2.postValue(companion.success("onNext"));
        mrtrChangeSimViewModel.m2398i(simCardNumber);
    }
}