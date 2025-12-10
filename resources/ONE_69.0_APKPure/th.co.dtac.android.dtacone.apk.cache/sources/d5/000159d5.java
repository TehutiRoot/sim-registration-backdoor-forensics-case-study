package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$register$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$register$2 extends Lambda implements Function1<MrtrPrepaidRegisterResponse, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $end;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MrtrPrepaidMultiSimViewModel$register$2(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$end = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse) {
        invoke2(mrtrPrepaidRegisterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse) {
        String rtrTransactionId = mrtrPrepaidRegisterResponse.getRtrTransactionId();
        if (rtrTransactionId == null || rtrTransactionId.length() == 0) {
            this.$end.invoke(Boolean.TRUE);
        }
        String rtrTransactionId2 = mrtrPrepaidRegisterResponse.getRtrTransactionId();
        StringBuilder sb = new StringBuilder();
        sb.append("doOnNext");
        sb.append(rtrTransactionId2);
    }
}