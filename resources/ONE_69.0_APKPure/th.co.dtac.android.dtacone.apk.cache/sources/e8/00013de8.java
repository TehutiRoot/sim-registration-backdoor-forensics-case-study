package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.report.activity.OneRtrCommissionHistoryActivity;
import th.p047co.dtac.android.dtacone.widget.view.DtacToast;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneWithHoldingTaxPreviewFragment$saveWithHoldingTaxPhoto$2 */
/* loaded from: classes10.dex */
public final class OneWithHoldingTaxPreviewFragment$saveWithHoldingTaxPhoto$2 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ OneWithHoldingTaxPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneWithHoldingTaxPreviewFragment$saveWithHoldingTaxPhoto$2(OneWithHoldingTaxPreviewFragment oneWithHoldingTaxPreviewFragment) {
        super(1);
        this.this$0 = oneWithHoldingTaxPreviewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        OneRtrCommissionHistoryActivity m10248y;
        DtacToast dtacToast = new DtacToast();
        m10248y = this.this$0.m10248y();
        dtacToast.createToast(m10248y, "Saved to folder dtac One").show();
    }
}