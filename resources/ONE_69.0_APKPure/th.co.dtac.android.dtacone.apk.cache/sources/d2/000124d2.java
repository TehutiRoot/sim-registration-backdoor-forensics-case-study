package th.p047co.dtac.android.dtacone.presenter.reports;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryApiCollection;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionHistoryCollection;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryCollection;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionHistoryApiCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrCommissionHistoryPresenter$getCommissionHistory$3 */
/* loaded from: classes8.dex */
public final class RtrCommissionHistoryPresenter$getCommissionHistory$3 extends Lambda implements Function1<CommissionHistoryApiCollection, List<? extends CommissionHistoryCollection>> {
    public static final RtrCommissionHistoryPresenter$getCommissionHistory$3 INSTANCE = new RtrCommissionHistoryPresenter$getCommissionHistory$3();

    public RtrCommissionHistoryPresenter$getCommissionHistory$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<CommissionHistoryCollection> invoke(@NotNull CommissionHistoryApiCollection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<CommissionHistoryCollection> history = it.getHistory();
        Intrinsics.checkNotNull(history);
        return history;
    }
}