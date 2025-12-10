package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolSummaryFragment$saveBillToImageGallery$3 */
/* loaded from: classes10.dex */
public final class OneBuyDolSummaryFragment$saveBillToImageGallery$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneBuyDolSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolSummaryFragment$saveBillToImageGallery$3(OneBuyDolSummaryFragment oneBuyDolSummaryFragment) {
        super(1);
        this.this$0 = oneBuyDolSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        String string = this.this$0.getString(R.string.one_buy_dol_save_bill_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.one_buy_dol_save_bill_error)");
        this.this$0.m15924u(string, false);
        this.this$0.showToast(string);
        th2.getMessage();
    }
}