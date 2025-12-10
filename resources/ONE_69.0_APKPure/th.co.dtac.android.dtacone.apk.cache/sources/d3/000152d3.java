package th.p047co.dtac.android.dtacone.view.fragment.rtr_performance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.report.RtrCommissionHistoryActivity;
import th.p047co.dtac.android.dtacone.widget.view.DtacToast;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.rtr_performance.WithHoldingTaxPreviewFragment$saveWithHoldingTaxPhoto$3 */
/* loaded from: classes9.dex */
public final class WithHoldingTaxPreviewFragment$saveWithHoldingTaxPhoto$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ WithHoldingTaxPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithHoldingTaxPreviewFragment$saveWithHoldingTaxPhoto$3(WithHoldingTaxPreviewFragment withHoldingTaxPreviewFragment) {
        super(1);
        this.this$0 = withHoldingTaxPreviewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        RtrCommissionHistoryActivity m3853y;
        DtacToast dtacToast = new DtacToast();
        m3853y = this.this$0.m3853y();
        dtacToast.createToast(m3853y, th2.getMessage()).show();
    }
}