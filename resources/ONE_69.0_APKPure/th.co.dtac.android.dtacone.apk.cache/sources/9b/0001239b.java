package th.p047co.dtac.android.dtacone.presenter.home;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.presenter.home.HomePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.home.HomePresenter$getStaffDetail$2 */
/* loaded from: classes8.dex */
public final class HomePresenter$getStaffDetail$2 extends Lambda implements Function1<StaffDetailCollection, Unit> {
    final /* synthetic */ HomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePresenter$getStaffDetail$2(HomePresenter homePresenter) {
        super(1);
        this.this$0 = homePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StaffDetailCollection staffDetailCollection) {
        invoke2(staffDetailCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StaffDetailCollection it) {
        HomePresenter.View view;
        view = this.this$0.f85839f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onGetStaffDetailSuccess(it);
    }
}