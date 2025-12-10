package th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment$initView$3 */
/* loaded from: classes9.dex */
public final class MrtrMultiSimConsentTelcoFragment$initView$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrMultiSimConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMultiSimConsentTelcoFragment$initView$3(MrtrMultiSimConsentTelcoFragment mrtrMultiSimConsentTelcoFragment) {
        super(0);
        this.this$0 = mrtrMultiSimConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r0.getViewModel().isNotFoundBirthDate() != false) goto L12;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r3 = this;
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel r0 = r0.getViewModel()
            java.lang.String r0 = r0.getRegisterType()
            java.lang.String r1 = "REGISTER_ONLY"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 == 0) goto L27
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$Companion r2 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment.Companion
            th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment r2 = r2.newInstance()
            r0.replaceFragment(r2, r1)
            goto L7c
        L27:
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel r0 = r0.getViewModel()
            java.lang.String r0 = r0.getRegisterType()
            java.lang.String r2 = "REGISTER_ACTIVATION"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L6d
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel r0 = r0.getViewModel()
            boolean r0 = r0.isBelow10Age()
            if (r0 != 0) goto L5d
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel r0 = r0.getViewModel()
            boolean r0 = r0.isNotFoundBirthDate()
            if (r0 == 0) goto L6d
        L5d:
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$Companion r2 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment.Companion
            th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment r2 = r2.newInstance()
            r0.replaceFragment(r2, r1)
            goto L7c
        L6d:
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment r0 = r3.this$0
            th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity r0 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment.access$getMultiSimActivity(r0)
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimPrepaidNonTelcoFragment$Companion r2 = th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimPrepaidNonTelcoFragment.Companion
            th.co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimPrepaidNonTelcoFragment r2 = r2.newInstance()
            r0.replaceFragment(r2, r1)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment$initView$3.invoke2():void");
    }
}