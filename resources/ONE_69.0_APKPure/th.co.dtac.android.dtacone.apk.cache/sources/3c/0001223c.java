package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceListSimR;
import th.p047co.dtac.android.dtacone.presenter.buy_dol.BuyDolPriceListPresenter;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceListSimR;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolPriceListPresenter$getPriceListSimR$3 */
/* loaded from: classes8.dex */
public final class BuyDolPriceListPresenter$getPriceListSimR$3 extends Lambda implements Function1<BuyDolPriceListSimR, Unit> {
    final /* synthetic */ String $pageCondition;
    final /* synthetic */ BuyDolPriceListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolPriceListPresenter$getPriceListSimR$3(String str, BuyDolPriceListPresenter buyDolPriceListPresenter) {
        super(1);
        this.$pageCondition = str;
        this.this$0 = buyDolPriceListPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyDolPriceListSimR buyDolPriceListSimR) {
        invoke2(buyDolPriceListSimR);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyDolPriceListSimR it) {
        BuyDolPriceListPresenter.View view;
        BuyDolPriceListPresenter.View view2;
        BuyDolPriceListPresenter.View view3 = null;
        if (Intrinsics.areEqual(this.$pageCondition, PermissionConstant.M_BUY_DOL)) {
            view2 = this.this$0.f85471e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view3.onBuyDolPriceListSimRResult(it);
            return;
        }
        view = this.this$0.f85471e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.onBuyDolHistoryPriceListSimRResult(it);
    }
}