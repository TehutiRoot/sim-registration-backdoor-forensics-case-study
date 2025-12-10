package th.p047co.dtac.android.dtacone.presenter.reports;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionSummaryApiCollection;
import th.p047co.dtac.android.dtacone.presenter.reports.RtrSummaryCommissionPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryApiCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrSummaryCommissionPresenter$getReport$2 */
/* loaded from: classes8.dex */
public final class RtrSummaryCommissionPresenter$getReport$2 extends Lambda implements Function1<CommissionSummaryApiCollection, Unit> {
    final /* synthetic */ RtrSummaryCommissionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtrSummaryCommissionPresenter$getReport$2(RtrSummaryCommissionPresenter rtrSummaryCommissionPresenter) {
        super(1);
        this.this$0 = rtrSummaryCommissionPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommissionSummaryApiCollection commissionSummaryApiCollection) {
        invoke2(commissionSummaryApiCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CommissionSummaryApiCollection commissionSummaryApiCollection) {
        RtrSummaryCommissionPresenter.View view;
        RtrSummaryCommissionPresenter.View view2;
        RtrSummaryCommissionPresenter.View view3 = null;
        if (commissionSummaryApiCollection.getCommission() != null) {
            view2 = this.this$0.f86370e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            view3.onCommissionResult(commissionSummaryApiCollection.getCommission());
            return;
        }
        view = this.this$0.f86370e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        view3.onOutOfCommission();
    }
}