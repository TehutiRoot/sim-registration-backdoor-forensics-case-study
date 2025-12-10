package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$cutSimStock$1$1 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$cutSimStock$1$1 extends Lambda implements Function1<CutSimStockResponse, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$cutSimStock$1$1(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CutSimStockResponse cutSimStockResponse) {
        invoke2(cutSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CutSimStockResponse it) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrChangeSimRepository = this.this$0.f106258b;
        mrtrChangeSimRepository.setCutSimStockResponse(it);
    }
}