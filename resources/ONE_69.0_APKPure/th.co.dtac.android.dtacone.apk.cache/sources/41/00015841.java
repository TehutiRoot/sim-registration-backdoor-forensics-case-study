package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$getAuthorizationByRTR$2 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$getAuthorizationByRTR$2 extends Lambda implements Function1<GetAuthorizationByRtrResponse, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$getAuthorizationByRTR$2(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetAuthorizationByRtrResponse getAuthorizationByRtrResponse) {
        invoke2(getAuthorizationByRtrResponse);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse r4) {
        /*
            r3 = this;
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel r0 = r3.this$0
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r0 = th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel.access$getRepository$p(r0)
            boolean r1 = r4.getRequireFaceRecognition()
            r2 = 0
            if (r1 == 0) goto L1b
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel r1 = r3.this$0
            th.co.dtac.android.dtacone.repository.ConfigurationRepository r1 = th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel.access$getConfigurationRepository$p(r1)
            boolean r1 = r1.enableFaceRecogChangeSim()
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.setRequireFaceRecognition(r1)
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel r0 = r3.this$0
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r0 = th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel.access$getRepository$p(r0)
            java.lang.Boolean r4 = r4.isCheckSim()
            if (r4 == 0) goto L2f
            boolean r2 = r4.booleanValue()
        L2f:
            r0.setCheckSimStock(r2)
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel r4 = r3.this$0
            th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel.access$createOptionalImageConfig(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$getAuthorizationByRTR$2.invoke2(th.co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse):void");
    }
}