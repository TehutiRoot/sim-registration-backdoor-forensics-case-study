package th.p047co.dtac.android.dtacone.viewmodel.esim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$registerPrepaid$1$2 */
/* loaded from: classes9.dex */
public final class ESimViewModel$registerPrepaid$1$2 extends Lambda implements Function1<MrtrPrepaidRegisterResponse, Unit> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$registerPrepaid$1$2(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse) {
        invoke2(mrtrPrepaidRegisterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidRegisterResponse response) {
        ESimRepository eSimRepository;
        this.this$0.setRegisterResponse(response);
        eSimRepository = this.this$0.f105820b;
        if (eSimRepository.isCutSim()) {
            ESimViewModel eSimViewModel = this.this$0;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            eSimViewModel.m2755P(response, false, null, null);
        } else if (!this.this$0.isCheckSimStock()) {
            this.this$0.m2771H(false);
        } else {
            ESimViewModel eSimViewModel2 = this.this$0;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            eSimViewModel2.m2750R0(response, false, null, null);
        }
    }
}