package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$setUpViews$6 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$setUpViews$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneProsermOnlineInputNumberFragment$setUpViews$6(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment) {
        super(0);
        this.this$0 = oneProsermOnlineInputNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneStvProsermOnlineViewModel m9814K;
        OneStvProsermOnlineViewModel m9814K2;
        OneStvProsermOnlineViewModel m9814K3;
        m9814K = this.this$0.m9814K();
        if (Intrinsics.areEqual(m9814K.getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            m9814K3 = this.this$0.m9814K();
            m9814K3.getBuyDOLConsentByFeatureName(PermissionConstant.M_BUY_DOL);
            return;
        }
        m9814K2 = this.this$0.m9814K();
        m9814K2.getBuyDolBankList();
    }
}