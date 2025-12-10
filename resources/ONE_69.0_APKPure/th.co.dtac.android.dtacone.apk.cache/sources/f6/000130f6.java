package th.p047co.dtac.android.dtacone.view.appOne.home.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OneHomeFragment$initView$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneHomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeFragment$initView$2(OneHomeFragment oneHomeFragment) {
        super(0);
        this.this$0 = oneHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneHomeViewModel oneHomeViewModel;
        OneHomeViewModel oneHomeViewModel2;
        OneHomeViewModel oneHomeViewModel3 = null;
        if (Intrinsics.areEqual(this.this$0.getPfViewModel().getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            oneHomeViewModel2 = this.this$0.f91077i;
            if (oneHomeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            } else {
                oneHomeViewModel3 = oneHomeViewModel2;
            }
            oneHomeViewModel3.getBuyDOLConsentByFeatureName(PermissionConstant.M_BUY_DOL);
            return;
        }
        oneHomeViewModel = this.this$0.f91077i;
        if (oneHomeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
        } else {
            oneHomeViewModel3 = oneHomeViewModel;
        }
        oneHomeViewModel3.getBuyDolBankList();
    }
}