package th.p047co.dtac.android.dtacone.presenter.self_update;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.model.self_update.RtrAddressResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/self_update/RtrAddressResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.UpdateRtrAddressPresenter$updateRtrShopAddress$1 */
/* loaded from: classes8.dex */
public final class UpdateRtrAddressPresenter$updateRtrShopAddress$1 extends Lambda implements Function1<RtrAddressResponse, ObservableSource<? extends SessionEntity>> {
    final /* synthetic */ UpdateRtrAddressPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRtrAddressPresenter$updateRtrShopAddress$1(UpdateRtrAddressPresenter updateRtrAddressPresenter) {
        super(1);
        this.this$0 = updateRtrAddressPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends SessionEntity> invoke(@NotNull RtrAddressResponse it) {
        Observable m17379f;
        Intrinsics.checkNotNullParameter(it, "it");
        m17379f = this.this$0.m17379f(it);
        return m17379f;
    }
}