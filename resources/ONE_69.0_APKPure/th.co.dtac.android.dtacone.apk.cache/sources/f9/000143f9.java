package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryStatus;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.PaymentSummaryScreenKt$PaymentSummaryScreen$1$2$1$1 */
/* loaded from: classes10.dex */
public final class PaymentSummaryScreenKt$PaymentSummaryScreen$1$2$1$1 extends Lambda implements Function1<PaymentSummaryStatus, Unit> {
    final /* synthetic */ MutableState<PaymentSummaryStatus> $tabSelected$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSummaryScreenKt$PaymentSummaryScreen$1$2$1$1(MutableState<PaymentSummaryStatus> mutableState) {
        super(1);
        this.$tabSelected$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentSummaryStatus paymentSummaryStatus) {
        invoke2(paymentSummaryStatus);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PaymentSummaryStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaymentSummaryScreenKt.m9460d(this.$tabSelected$delegate, it);
    }
}