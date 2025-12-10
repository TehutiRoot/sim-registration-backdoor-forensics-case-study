package th.p047co.dtac.android.dtacone.view.fragment.rtr_performance;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrProfitReportContract;", "", "()V", "Presenter", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.rtr_performance.RtrProfitReportContract */
/* loaded from: classes9.dex */
public final class RtrProfitReportContract {
    public static final int $stable = 0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrProfitReportContract$Presenter;", "", "loadProfitReport", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.rtr_performance.RtrProfitReportContract$Presenter */
    /* loaded from: classes9.dex */
    public interface Presenter {
        void loadProfitReport();
    }

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrProfitReportContract$View;", "", "getNextMonthReport", "", "getPrevMonthReport", "gotoCampaignReport", "initView", "updateDetailView", "position", "", "updateView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.rtr_performance.RtrProfitReportContract$View */
    /* loaded from: classes9.dex */
    public interface View {
        void getNextMonthReport();

        void getPrevMonthReport();

        void gotoCampaignReport();

        void initView();

        void updateDetailView(int i);

        void updateView();
    }
}