package th.p047co.dtac.android.dtacone.presenter.sellerID;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.sellerID.changeRetailer.response.ChangeRetailerResponse;
import th.p047co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/sellerID/changeRetailer/response/ChangeRetailerResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter$changeRetailer$2 */
/* loaded from: classes8.dex */
public final class ShopListPresenter$changeRetailer$2 extends Lambda implements Function1<ChangeRetailerResponse, Unit> {
    final /* synthetic */ ShopListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopListPresenter$changeRetailer$2(ShopListPresenter shopListPresenter) {
        super(1);
        this.this$0 = shopListPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChangeRetailerResponse changeRetailerResponse) {
        invoke2(changeRetailerResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChangeRetailerResponse it) {
        ShopListPresenter.View view;
        ShopListPresenter.View view2;
        view = this.this$0.f86475d;
        ShopListPresenter.View view3 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
        view2 = this.this$0.f86475d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.onChangeRetailerSuccess(it);
    }
}