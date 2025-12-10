package th.p047co.dtac.android.dtacone.view.fragment.multi_sim.one_common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.payment.MrtrMultiSimPaymentFragment;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$showDialogTakeMorePhotoCompose$1$1 */
/* loaded from: classes9.dex */
public final class C16420x722218f7 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16420x722218f7(MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment) {
        super(0);
        this.this$0 = mrtrMultiSimNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MrtrPrepaidMultiSimActivity m4261o;
        MrtrPrepaidMultiSimActivity m4261o2;
        MrtrPrepaidMultiSimActivity m4261o3;
        MrtrPrepaidMultiSimActivity m4261o4;
        MrtrPrepaidMultiSimActivity m4261o5;
        m4261o = this.this$0.m4261o();
        m4261o.getViewModel();
        MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment = this.this$0;
        m4261o2 = mrtrMultiSimNavigateToCommonFragment.m4261o();
        if (m4261o2.getViewModel().isGotoPayment()) {
            m4261o5 = mrtrMultiSimNavigateToCommonFragment.m4261o();
            m4261o5.replaceFragment(MrtrMultiSimPaymentFragment.Companion.newInstance(), null);
        } else {
            m4261o3 = mrtrMultiSimNavigateToCommonFragment.m4261o();
            m4261o3.replaceFragment(MrtrMultiSimSummaryFragment.Companion.newInstance(), null);
        }
        m4261o4 = mrtrMultiSimNavigateToCommonFragment.m4261o();
        m4261o4.clearKycCounter();
    }
}