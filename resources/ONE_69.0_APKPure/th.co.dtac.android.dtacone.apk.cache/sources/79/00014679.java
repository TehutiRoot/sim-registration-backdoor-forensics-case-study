package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.topup.activity.OneTopupActivity;
import th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupPriceListFragment$autoStrechRefill$5 */
/* loaded from: classes10.dex */
public final class OneTopupPriceListFragment$autoStrechRefill$5 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneTopupPriceListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupPriceListFragment$autoStrechRefill$5(OneTopupPriceListFragment oneTopupPriceListFragment) {
        super(1);
        this.this$0 = oneTopupPriceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable String str) {
        OneTopupActivity m9285R;
        OneTopUpViewModel m9284S;
        OneTopUpViewModel m9284S2;
        m9285R = this.this$0.m9285R();
        if (!m9285R.getTopupThemeColorModel().isEnableAutoRefill() || str == null) {
            return;
        }
        OneTopupPriceListFragment oneTopupPriceListFragment = this.this$0;
        if (Intrinsics.areEqual(oneTopupPriceListFragment.getPfViewModel().getCompany(), Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            m9284S2 = oneTopupPriceListFragment.m9284S();
            m9284S2.getTopUpOffer(str);
            return;
        }
        m9284S = oneTopupPriceListFragment.m9284S();
        m9284S.getRefillRecommendTrueCompany(str);
    }
}