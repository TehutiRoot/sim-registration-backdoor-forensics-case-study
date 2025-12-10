package th.p047co.dtac.android.dtacone.presenter.reports;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.history.OneDateSeriesResponse;
import th.p047co.dtac.android.dtacone.model.rtr_performance.DateSeriesTransection;
import th.p047co.dtac.android.dtacone.presenter.reports.RtrDatePagerPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/history/OneDateSeriesResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrDatePagerPresenter$getOneDateList$2 */
/* loaded from: classes8.dex */
public final class RtrDatePagerPresenter$getOneDateList$2 extends Lambda implements Function1<OneDateSeriesResponse, Unit> {
    final /* synthetic */ RtrDatePagerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtrDatePagerPresenter$getOneDateList$2(RtrDatePagerPresenter rtrDatePagerPresenter) {
        super(1);
        this.this$0 = rtrDatePagerPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneDateSeriesResponse oneDateSeriesResponse) {
        invoke2(oneDateSeriesResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneDateSeriesResponse oneDateSeriesResponse) {
        RtrDatePagerPresenter.View view;
        RtrDatePagerPresenter.View view2;
        RtrDatePagerPresenter.View view3;
        List<DateSeriesTransection> data = oneDateSeriesResponse.getData();
        RtrDatePagerPresenter.View view4 = null;
        if (data != null) {
            RtrDatePagerPresenter rtrDatePagerPresenter = this.this$0;
            if (!data.isEmpty()) {
                view3 = rtrDatePagerPresenter.f86361d;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view3 = null;
                }
                view3.onLoadDateseriessuccess(data);
            } else {
                view2 = rtrDatePagerPresenter.f86361d;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view2 = null;
                }
                view2.showEmptyLayout();
            }
        }
        view = this.this$0.f86361d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view4 = view;
        }
        view4.dismissLoading();
    }
}