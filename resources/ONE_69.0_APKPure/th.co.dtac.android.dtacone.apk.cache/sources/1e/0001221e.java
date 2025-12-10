package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolHistoryTransaction;
import th.p047co.dtac.android.dtacone.presenter.buy_dol.BuyDolHistoryPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolHistoryTransaction;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolHistoryPresenter$getBuyDolHistory$2 */
/* loaded from: classes8.dex */
public final class BuyDolHistoryPresenter$getBuyDolHistory$2 extends Lambda implements Function1<BuyDolHistoryTransaction, Unit> {
    final /* synthetic */ BuyDolHistoryPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolHistoryPresenter$getBuyDolHistory$2(BuyDolHistoryPresenter buyDolHistoryPresenter) {
        super(1);
        this.this$0 = buyDolHistoryPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyDolHistoryTransaction buyDolHistoryTransaction) {
        invoke2(buyDolHistoryTransaction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyDolHistoryTransaction it) {
        BuyDolHistoryPresenter.View view;
        view = this.this$0.f85433e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onHistoryResult(it);
    }
}