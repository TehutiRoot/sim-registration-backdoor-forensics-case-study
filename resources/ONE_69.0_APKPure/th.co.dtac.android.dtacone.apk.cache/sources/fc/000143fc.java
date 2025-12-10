package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryFlpInfo;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryTolInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.PaymentSummaryScreenKt$PaymentSummaryScreen$2 */
/* loaded from: classes10.dex */
public final class PaymentSummaryScreenKt$PaymentSummaryScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DeviceRouterItem $deviceRouterItem;
    final /* synthetic */ Function0<Unit> $onNext;
    final /* synthetic */ List<PaymentSummaryFlpInfo> $paymentSummaryFlpInfo;
    final /* synthetic */ List<PaymentSummaryData> $paymentSummaryListInfo;
    final /* synthetic */ PaymentSummaryTolInfo $paymentSummaryTolInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSummaryScreenKt$PaymentSummaryScreen$2(PaymentSummaryTolInfo paymentSummaryTolInfo, DeviceRouterItem deviceRouterItem, List<PaymentSummaryFlpInfo> list, List<PaymentSummaryData> list2, Function0<Unit> function0, int i) {
        super(2);
        this.$paymentSummaryTolInfo = paymentSummaryTolInfo;
        this.$deviceRouterItem = deviceRouterItem;
        this.$paymentSummaryFlpInfo = list;
        this.$paymentSummaryListInfo = list2;
        this.$onNext = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        PaymentSummaryScreenKt.PaymentSummaryScreen(this.$paymentSummaryTolInfo, this.$deviceRouterItem, this.$paymentSummaryFlpInfo, this.$paymentSummaryListInfo, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}