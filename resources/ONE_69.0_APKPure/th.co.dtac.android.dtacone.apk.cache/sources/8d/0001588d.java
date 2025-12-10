package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpSuccessFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModel$callCutSIMStock$1$2 */
/* loaded from: classes9.dex */
public final class MrtrMnpViewModel$callCutSIMStock$1$2 extends Lambda implements Function1<CutSimStockResponse, Unit> {
    final /* synthetic */ MrtrMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpViewModel$callCutSIMStock$1$2(MrtrMnpViewModel mrtrMnpViewModel) {
        super(1);
        this.this$0 = mrtrMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CutSimStockResponse cutSimStockResponse) {
        invoke2(cutSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CutSimStockResponse cutSimStockResponse) {
        MutableLiveData m2344n;
        this.this$0.setCutSimStockResponse(cutSimStockResponse);
        if (this.this$0.isCheckSimStock() && this.this$0.isUserLan()) {
            this.this$0.callSaveResult();
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m2344n = this.this$0.m2344n();
        m2344n.setValue(new Event(new FragmentNavEvent(MrtrMnpSuccessFragment.class, null, null, 4, null)));
    }
}