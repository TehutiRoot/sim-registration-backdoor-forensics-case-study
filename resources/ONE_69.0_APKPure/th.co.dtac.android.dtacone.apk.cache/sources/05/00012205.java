package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestCharge;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolResponseCharge;
import th.p047co.dtac.android.dtacone.presenter.buy_dol.BuyDolChargePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolChargePresenter$charge$2 */
/* loaded from: classes8.dex */
public final class BuyDolChargePresenter$charge$2 extends Lambda implements Function1<BuyDolResponseCharge, Unit> {
    final /* synthetic */ BuyDolRequestCharge $charge;
    final /* synthetic */ BuyDolChargePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolChargePresenter$charge$2(BuyDolChargePresenter buyDolChargePresenter, BuyDolRequestCharge buyDolRequestCharge) {
        super(1);
        this.this$0 = buyDolChargePresenter;
        this.$charge = buyDolRequestCharge;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyDolResponseCharge buyDolResponseCharge) {
        invoke2(buyDolResponseCharge);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyDolResponseCharge it) {
        BuyDolChargePresenter.View view;
        BuyDolChargePresenter.View view2;
        String authorizeUrl = it.getAuthorizeUrl();
        BuyDolChargePresenter.View view3 = null;
        if (authorizeUrl == null || authorizeUrl.length() == 0) {
            view = this.this$0.f85400e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view3.onChargeResult(it, this.$charge.getCard());
            return;
        }
        view2 = this.this$0.f85400e;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.on3DsChargeResult(it);
    }
}