package th.p047co.dtac.android.dtacone.presenter.home;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.home.homeDetail.HomeDetailResponse;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/home/homeDetail/HomeDetailResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.home.HomePresenter$getCurrentBalanceAndGroupMenu$2 */
/* loaded from: classes8.dex */
public final class HomePresenter$getCurrentBalanceAndGroupMenu$2 extends Lambda implements Function1<BalanceCollection, HomeDetailResponse> {
    final /* synthetic */ HomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePresenter$getCurrentBalanceAndGroupMenu$2(HomePresenter homePresenter) {
        super(1);
        this.this$0 = homePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final HomeDetailResponse invoke(@NotNull BalanceCollection it) {
        List m18154j0;
        Intrinsics.checkNotNullParameter(it, "it");
        m18154j0 = this.this$0.m18154j0();
        return new HomeDetailResponse(it, m18154j0, new StaffDetailCollection(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
    }
}