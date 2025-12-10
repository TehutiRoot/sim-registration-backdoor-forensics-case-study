package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.home.HomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.change_password.ChangePasswordFragment;
import th.p047co.dtac.android.dtacone.view.fragment.home.HomeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.newsfeed.NewsFeedFragment;
import th.p047co.dtac.android.dtacone.view.fragment.online_store.OnlineStoreFragment;
import th.p047co.dtac.android.dtacone.view.fragment.register.RegisterOtpVerifyFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrHistoryDatePagerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceHistorySellFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceSellFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrPerformanceSellingCommissionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrProfitReportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.setting.OtherMenuFragment;
import th.p047co.dtac.android.dtacone.view.fragment.staff.StaffDetailFragment;
import th.p047co.dtac.android.dtacone.view.fragment.staff.StaffListFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogManageCredit;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogManagePermission;
import th.p047co.dtac.android.dtacone.widget.dialog.ResetCreditDialog;

@Subcomponent(modules = {ActivityModule.class})
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MainComponent */
/* loaded from: classes7.dex */
public interface MainComponent extends AbstractActivityComponent<HomeActivity> {
    void inject(OneHomeFragment oneHomeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(HomeFragment homeFragment);

    void inject(NewsFeedFragment newsFeedFragment);

    void inject(OnlineStoreFragment onlineStoreFragment);

    void inject(RegisterOtpVerifyFragment registerOtpVerifyFragment);

    void inject(RtrHistoryDatePagerFragment rtrHistoryDatePagerFragment);

    void inject(RtrPerformanceFragment rtrPerformanceFragment);

    void inject(RtrPerformanceHistorySellFragment rtrPerformanceHistorySellFragment);

    void inject(RtrPerformanceSellFragment rtrPerformanceSellFragment);

    void inject(RtrPerformanceSellingCommissionFragment rtrPerformanceSellingCommissionFragment);

    void inject(RtrProfitReportFragment rtrProfitReportFragment);

    void inject(OtherMenuFragment otherMenuFragment);

    void inject(StaffDetailFragment staffDetailFragment);

    void inject(StaffListFragment staffListFragment);

    void inject(CustomDialogManageCredit customDialogManageCredit);

    void inject(CustomDialogManagePermission customDialogManagePermission);

    void inject(ResetCreditDialog resetCreditDialog);
}
