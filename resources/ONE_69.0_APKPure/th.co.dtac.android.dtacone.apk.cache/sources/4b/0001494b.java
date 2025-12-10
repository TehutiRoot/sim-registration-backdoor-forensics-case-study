package th.p047co.dtac.android.dtacone.view.fragment.buy_dol;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolSummaryFragment$saveBillToImageGallery$2 */
/* loaded from: classes9.dex */
public final class BuyDolSummaryFragment$saveBillToImageGallery$2 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ BuyDolSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolSummaryFragment$saveBillToImageGallery$2(BuyDolSummaryFragment buyDolSummaryFragment) {
        super(1);
        this.this$0 = buyDolSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        String string = this.this$0.getString(R.string.save_bill_success);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.save_bill_success)");
        this.this$0.m8839y(string, true);
        this.this$0.showToast(string);
    }
}