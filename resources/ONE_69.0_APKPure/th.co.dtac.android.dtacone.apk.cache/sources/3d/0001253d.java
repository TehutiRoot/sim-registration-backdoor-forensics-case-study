package th.p047co.dtac.android.dtacone.presenter.sellerID;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.sellerID.promoterInfo.PromoterInfoResponse;
import th.p047co.dtac.android.dtacone.model.sellerID.shopList.RetailerItem;
import th.p047co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/sellerID/promoterInfo/PromoterInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter$getPromoterInfo$2 */
/* loaded from: classes8.dex */
public final class ShopListPresenter$getPromoterInfo$2 extends Lambda implements Function1<PromoterInfoResponse, Unit> {
    final /* synthetic */ ShopListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopListPresenter$getPromoterInfo$2(ShopListPresenter shopListPresenter) {
        super(1);
        this.this$0 = shopListPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PromoterInfoResponse promoterInfoResponse) {
        invoke2(promoterInfoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PromoterInfoResponse promoterInfoResponse) {
        ShopListPresenter.View view;
        ShopListPresenter.View view2;
        ShopListPresenter.View view3;
        ShopListPresenter.View view4;
        ShopListPresenter.View view5;
        view = this.this$0.f86475d;
        ShopListPresenter.View view6 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onGetPromoterInfoSuccess();
        if (promoterInfoResponse.getCurrent() != null) {
            view5 = this.this$0.f86475d;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view5 = null;
            }
            view5.onShowCurrentShop(promoterInfoResponse.getCurrent());
        } else {
            view2 = this.this$0.f86475d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view2 = null;
            }
            view2.onNotFoundCurrentShop();
        }
        List<RetailerItem> history = promoterInfoResponse.getHistory();
        if (history == null || history.isEmpty()) {
            view3 = this.this$0.f86475d;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view6 = view3;
            }
            view6.onShowHistoryListEmpty();
            return;
        }
        view4 = this.this$0.f86475d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view6 = view4;
        }
        view6.onShowHistoryListSuccess(promoterInfoResponse.getHistory());
    }
}