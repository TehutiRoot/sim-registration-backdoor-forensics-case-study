package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSimSubmitResult;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/cut_sim/response/CutSimStockResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$cutSimStock$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$cutSimStock$2 extends Lambda implements Function1<CutSimStockResponse, Unit> {
    final /* synthetic */ MrtrPrepaidRegisterResponse $response;
    final /* synthetic */ MultiSubscriber $subscriber;
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$cutSimStock$2(MultiSubscriber multiSubscriber, MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse, MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(1);
        this.$subscriber = multiSubscriber;
        this.$response = mrtrPrepaidRegisterResponse;
        this.this$0 = mrtrPrepaidMultiSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CutSimStockResponse cutSimStockResponse) {
        invoke2(cutSimStockResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CutSimStockResponse cutSimStockResponse) {
        this.$subscriber.setActivateStatus(this.this$0.isActivateStatus());
        String rtrTransactionId = this.$response.getRtrTransactionId();
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(!(rtrTransactionId == null || rtrTransactionId.length() == 0));
        String orderID = cutSimStockResponse.getOrderID();
        MultiSimSubmitResult multiSimSubmitResult = new MultiSimSubmitResult(valueOf, Boolean.valueOf(!((orderID == null || orderID.length() == 0) ? true : true)), this.$response, cutSimStockResponse, this.this$0.getCutSimStockError(), this.$subscriber);
        List<MultiSimSubmitResult> multiSimSubmitResultList = this.this$0.getMultiSimSubmitResultList();
        if (multiSimSubmitResultList != null) {
            multiSimSubmitResultList.add(multiSimSubmitResult);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("doOnNext:");
        sb.append(cutSimStockResponse);
    }
}