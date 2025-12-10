package th.p047co.dtac.android.dtacone.presenter.self_update;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.presenter.self_update.UpdateRtrAddressPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.UpdateRtrAddressPresenter$updateRtrShopAddress$3 */
/* loaded from: classes8.dex */
public final class UpdateRtrAddressPresenter$updateRtrShopAddress$3 extends Lambda implements Function1<SessionEntity, Unit> {
    final /* synthetic */ UpdateRtrAddressPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRtrAddressPresenter$updateRtrShopAddress$3(UpdateRtrAddressPresenter updateRtrAddressPresenter) {
        super(1);
        this.this$0 = updateRtrAddressPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SessionEntity sessionEntity) {
        invoke2(sessionEntity);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SessionEntity sessionEntity) {
        UpdateRtrAddressPresenter.View view;
        view = this.this$0.f86426e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onUpdateSuccess();
    }
}