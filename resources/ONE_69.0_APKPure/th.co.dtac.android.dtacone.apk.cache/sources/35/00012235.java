package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolDirectAccounts;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolListCard;
import th.p047co.dtac.android.dtacone.presenter.buy_dol.BuyDolPaymentInfoPresenter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolDirectAccounts;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolListCard;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolPaymentInfoPresenter$getPaymentInfo$2 */
/* loaded from: classes8.dex */
public final class BuyDolPaymentInfoPresenter$getPaymentInfo$2 extends Lambda implements Function1<Pair<? extends BuyDolDirectAccounts, ? extends BuyDolListCard>, Unit> {
    final /* synthetic */ BuyDolPaymentInfoPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolPaymentInfoPresenter$getPaymentInfo$2(BuyDolPaymentInfoPresenter buyDolPaymentInfoPresenter) {
        super(1);
        this.this$0 = buyDolPaymentInfoPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BuyDolDirectAccounts, ? extends BuyDolListCard> pair) {
        invoke2((Pair<BuyDolDirectAccounts, BuyDolListCard>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<BuyDolDirectAccounts, BuyDolListCard> pair) {
        BuyDolPaymentInfoPresenter.View view;
        view = this.this$0.f85463e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onPaymentInfoResult(pair.getFirst(), pair.getSecond());
    }
}