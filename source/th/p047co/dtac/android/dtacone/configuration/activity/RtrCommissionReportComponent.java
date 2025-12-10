package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.report.RtrCommissionHistoryActivity;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrCommissionDetailFragment;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrCommissionHistoryListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneWithHoldingTaxPreviewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrCommissionDetailFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrCommissionHistoryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.WithHoldingTaxPreviewFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/RtrCommissionReportComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/report/RtrCommissionHistoryActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrCommissionDetailFragment;", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrCommissionHistoryListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneWithHoldingTaxPreviewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrCommissionDetailFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrCommissionHistoryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/WithHoldingTaxPreviewFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.RtrCommissionReportComponent */
/* loaded from: classes7.dex */
public interface RtrCommissionReportComponent extends AbstractActivityComponent<RtrCommissionHistoryActivity> {
    void inject(@NotNull OneRtrCommissionDetailFragment oneRtrCommissionDetailFragment);

    void inject(@NotNull OneRtrCommissionHistoryListFragment oneRtrCommissionHistoryListFragment);

    void inject(@NotNull OneWithHoldingTaxPreviewFragment oneWithHoldingTaxPreviewFragment);

    void inject(@NotNull RtrCommissionDetailFragment rtrCommissionDetailFragment);

    void inject(@NotNull RtrCommissionHistoryFragment rtrCommissionHistoryFragment);

    void inject(@NotNull WithHoldingTaxPreviewFragment withHoldingTaxPreviewFragment);
}
