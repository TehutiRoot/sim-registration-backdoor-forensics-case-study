package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.PaymentSummaryScreenKt$AllDevice$2 */
/* loaded from: classes10.dex */
public final class PaymentSummaryScreenKt$AllDevice$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DeviceRouterItem $deviceRouterItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSummaryScreenKt$AllDevice$2(DeviceRouterItem deviceRouterItem, int i) {
        super(2);
        this.$deviceRouterItem = deviceRouterItem;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        PaymentSummaryScreenKt.m9463a(this.$deviceRouterItem, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}