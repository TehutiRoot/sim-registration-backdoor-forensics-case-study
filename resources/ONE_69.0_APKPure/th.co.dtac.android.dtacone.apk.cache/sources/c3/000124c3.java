package th.p047co.dtac.android.dtacone.presenter.reports;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.rtr_performance.ProfitDetailReport;
import th.p047co.dtac.android.dtacone.presenter.reports.DetailProfitReportPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitDetailReport;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.DetailProfitReportPresenter$loadReport$subscription$2 */
/* loaded from: classes8.dex */
public final class DetailProfitReportPresenter$loadReport$subscription$2 extends Lambda implements Function1<ProfitDetailReport, Unit> {
    final /* synthetic */ DetailProfitReportPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailProfitReportPresenter$loadReport$subscription$2(DetailProfitReportPresenter detailProfitReportPresenter) {
        super(1);
        this.this$0 = detailProfitReportPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProfitDetailReport profitDetailReport) {
        invoke2(profitDetailReport);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ProfitDetailReport it) {
        DetailProfitReportPresenter.View view;
        DetailProfitReportPresenter.View view2;
        List<ProfitDetailReport.Data> data = it.getData();
        DetailProfitReportPresenter.View view3 = null;
        if (data == null || data.isEmpty()) {
            view = this.this$0.f86322d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view;
            }
            view3.onOutOfDetailProfit();
            return;
        }
        view2 = this.this$0.f86322d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.onDetailProfitReportSuccess(it);
    }
}