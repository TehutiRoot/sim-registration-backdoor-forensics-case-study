package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.home.fragment.OneNewsFeedFragment;
import th.p047co.dtac.android.dtacone.view.appOne.home.fragment.OneOtherMenuFragment;
import th.p047co.dtac.android.dtacone.view.appOne.home.fragment.OneRtrPerformanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrHistoryDatePagerFragment;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrPerformanceHistorySellFragment;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrPerformanceSellingCommissionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.report.fragment.OneRtrProfitReportFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileUpdateFragment;
import th.p047co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffDetailFragment;
import th.p047co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffEditNameFragment;
import th.p047co.dtac.android.dtacone.view.fragment.change_password.ChangePasswordFragment;
import th.p047co.dtac.android.dtacone.view.fragment.online_store.OnlineStoreFragment;
import th.p047co.dtac.android.dtacone.view.fragment.register.RegisterOtpVerifyFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrHistoryDatePagerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceHistorySellFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceSellFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceSellingCommissionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrProfitReportFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogManageCredit;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogManagePermission;
import th.p047co.dtac.android.dtacone.widget.dialog.ResetCreditDialog;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneHomeComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/home/fragment/OneHomeFragment;", "Lth/co/dtac/android/dtacone/view/appOne/home/fragment/OneNewsFeedFragment;", "Lth/co/dtac/android/dtacone/view/appOne/home/fragment/OneOtherMenuFragment;", "Lth/co/dtac/android/dtacone/view/appOne/home/fragment/OneRtrPerformanceFragment;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/fragment/OneOwnerManagementListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrHistoryDatePagerFragment;", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrPerformanceHistorySellFragment;", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrPerformanceSellingCommissionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/report/fragment/OneRtrProfitReportFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfileUpdateFragment;", "Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffDetailFragment;", "Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffEditNameFragment;", "Lth/co/dtac/android/dtacone/view/fragment/change_password/ChangePasswordFragment;", "Lth/co/dtac/android/dtacone/view/fragment/online_store/OnlineStoreFragment;", "Lth/co/dtac/android/dtacone/view/fragment/register/RegisterOtpVerifyFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrHistoryDatePagerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrPerformanceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrPerformanceHistorySellFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrPerformanceSellFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrPerformanceSellingCommissionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrProfitReportFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogManageCredit;", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogManagePermission;", "Lth/co/dtac/android/dtacone/widget/dialog/ResetCreditDialog;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneHomeComponent */
/* loaded from: classes7.dex */
public interface OneHomeComponent extends AbstractActivityComponent<OneHomeActivity> {
    void inject(@NotNull OneHomeFragment oneHomeFragment);

    void inject(@NotNull OneNewsFeedFragment oneNewsFeedFragment);

    void inject(@NotNull OneOtherMenuFragment oneOtherMenuFragment);

    void inject(@NotNull OneRtrPerformanceFragment oneRtrPerformanceFragment);

    void inject(@NotNull OneOwnerManagementListFragment oneOwnerManagementListFragment);

    void inject(@NotNull OneRtrHistoryDatePagerFragment oneRtrHistoryDatePagerFragment);

    void inject(@NotNull OneRtrPerformanceHistorySellFragment oneRtrPerformanceHistorySellFragment);

    void inject(@NotNull OneRtrPerformanceSellingCommissionFragment oneRtrPerformanceSellingCommissionFragment);

    void inject(@NotNull OneRtrProfitReportFragment oneRtrProfitReportFragment);

    void inject(@NotNull OneRetailerProfileUpdateFragment oneRetailerProfileUpdateFragment);

    void inject(@NotNull OneStaffDetailFragment oneStaffDetailFragment);

    void inject(@NotNull OneStaffEditNameFragment oneStaffEditNameFragment);

    void inject(@NotNull ChangePasswordFragment changePasswordFragment);

    void inject(@NotNull OnlineStoreFragment onlineStoreFragment);

    void inject(@NotNull RegisterOtpVerifyFragment registerOtpVerifyFragment);

    void inject(@NotNull RtrHistoryDatePagerFragment rtrHistoryDatePagerFragment);

    void inject(@NotNull RtrPerformanceFragment rtrPerformanceFragment);

    void inject(@NotNull RtrPerformanceHistorySellFragment rtrPerformanceHistorySellFragment);

    void inject(@NotNull RtrPerformanceSellFragment rtrPerformanceSellFragment);

    void inject(@NotNull RtrPerformanceSellingCommissionFragment rtrPerformanceSellingCommissionFragment);

    void inject(@NotNull RtrProfitReportFragment rtrProfitReportFragment);

    void inject(@NotNull CustomDialogManageCredit customDialogManageCredit);

    void inject(@NotNull CustomDialogManagePermission customDialogManagePermission);

    void inject(@NotNull ResetCreditDialog resetCreditDialog);
}
