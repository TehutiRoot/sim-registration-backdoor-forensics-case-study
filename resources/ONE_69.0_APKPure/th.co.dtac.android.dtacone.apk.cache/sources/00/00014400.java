package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryStatus;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.PaymentSummaryScreenKt$TabBar$1$1$1$1$1$1 */
/* loaded from: classes10.dex */
public final class PaymentSummaryScreenKt$TabBar$1$1$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ Function1<PaymentSummaryStatus, Unit> $onClick;
    final /* synthetic */ MutableState<Integer> $selectedTabIndex$delegate;
    final /* synthetic */ PaymentSummaryData $summaryData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSummaryScreenKt$TabBar$1$1$1$1$1$1(PaymentSummaryData paymentSummaryData, int i, Function1<? super PaymentSummaryStatus, Unit> function1, MutableState<Integer> mutableState) {
        super(0);
        this.$summaryData = paymentSummaryData;
        this.$index = i;
        this.$onClick = function1;
        this.$selectedTabIndex$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        System.out.println((Object) String.valueOf(this.$summaryData));
        PaymentSummaryScreenKt.m9456h(this.$selectedTabIndex$delegate, this.$index);
        this.$onClick.invoke(this.$summaryData.getStatus());
    }
}