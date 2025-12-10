package th.p047co.dtac.android.dtacone.presenter.sellerID;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter$storeNewUserProfile$4 */
/* loaded from: classes8.dex */
public final class ChangeTokenForPromoterPresenter$storeNewUserProfile$4 extends Lambda implements Function1<Pair<? extends SessionEntity, ? extends SessionEntity>, Unit> {
    final /* synthetic */ String $retailerNumber;
    final /* synthetic */ ChangeTokenForPromoterPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeTokenForPromoterPresenter$storeNewUserProfile$4(ChangeTokenForPromoterPresenter changeTokenForPromoterPresenter, String str) {
        super(1);
        this.this$0 = changeTokenForPromoterPresenter;
        this.$retailerNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends SessionEntity, ? extends SessionEntity> pair) {
        invoke2(pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<? extends SessionEntity, ? extends SessionEntity> pair) {
        ChangeTokenForPromoterPresenter.View view;
        ChangeTokenForPromoterPresenter.View view2;
        view = this.this$0.f86453l;
        ChangeTokenForPromoterPresenter.View view3 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
        view2 = this.this$0.f86453l;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        view3.onGetPermissionAndDolStatusSuccess(this.$retailerNumber, pair.getFirst());
    }
}