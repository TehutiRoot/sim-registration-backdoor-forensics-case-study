package th.p047co.dtac.android.dtacone.view.appOne.report.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.report.activity.OneRtrCommissionHistoryActivity;
import th.p047co.dtac.android.dtacone.widget.view.DtacToast;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.fragment.OneCompensationStatementPreviewFragment$saveWithHoldingTaxPhoto$2 */
/* loaded from: classes10.dex */
public final class C15117xad8f8b5a extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ OneCompensationStatementPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15117xad8f8b5a(OneCompensationStatementPreviewFragment oneCompensationStatementPreviewFragment) {
        super(1);
        this.this$0 = oneCompensationStatementPreviewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        OneRtrCommissionHistoryActivity m10392A;
        DtacToast dtacToast = new DtacToast();
        m10392A = this.this$0.m10392A();
        dtacToast.createToast(m10392A, "Saved to folder dtac One").show();
    }
}