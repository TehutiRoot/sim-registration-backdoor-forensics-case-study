package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.topup.activity.OneTopupActivity;
import th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$initialViews$5 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$initialViews$5 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupPriceListFragment$initialViews$5(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(0);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneTopupActivity m9285R;
        OneTopUpViewModel m9284S;
        OneTopUpViewModel m9284S2;
        m9285R = this.this$0.m9285R();
        if (Intrinsics.areEqual(m9285R.getPfViewModel().getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            m9284S2 = this.this$0.m9284S();
            m9284S2.getBuyDOLConsentByFeatureName(PermissionConstant.M_BUY_DOL);
            return;
        }
        m9284S = this.this$0.m9284S();
        m9284S.getBuyDolBankList();
    }
}