package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.BlacklistCustomerInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.BlacklistSubscriberInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.ByIDIdentityInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.ByIDSubscriberListInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiry700MhzFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiryInputFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquirySmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerKeyinFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.IDEnquiryContainerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.IdentityFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.IdentityInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.InfoAnalyticFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.PermitListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.PostEnquiryContainerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.PostInfoAnalyticFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.PostSubscriberInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.PreEnquiryContainerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.PreSubscriberInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.ServiceListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.ShelfDownSellPackageViewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.ShelfPackageViewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.SubscriberEnquiryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.SubscriberListPagerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.SuspendInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.device_summary.DeviceSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.device_summary.DeviceSummaryInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.MainPackageSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.NextPackageSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.RemovePackageSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.SuccessPackageSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.qrCode.CustomerEnquiryESimShowQrCodeFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020#H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&¨\u0006%"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/CustomerEnquiryComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/customerenquiry/CustomerEnquiryActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/BlacklistCustomerInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/BlacklistSubscriberInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ByIDIdentityInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ByIDSubscriberListInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/CustomerEnquiry700MhzFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/CustomerEnquiryInputFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/CustomerEnquirySmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/CustomerKeyinFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/IDEnquiryContainerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/IdentityFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/IdentityInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/InfoAnalyticFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/PermitListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/PostEnquiryContainerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/PostInfoAnalyticFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/PostSubscriberInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/PreEnquiryContainerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/PreSubscriberInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ServiceListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ShelfDownSellPackageViewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ShelfPackageViewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/SubscriberEnquiryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/SubscriberListPagerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/SuspendInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/device_summary/DeviceSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/device_summary/DeviceSummaryInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/MainPackageSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/NextPackageSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/RemovePackageSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/SuccessPackageSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/qrCode/CustomerEnquiryESimShowQrCodeFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.CustomerEnquiryComponent */
/* loaded from: classes7.dex */
public interface CustomerEnquiryComponent extends AbstractActivityComponent<CustomerEnquiryActivity> {
    void inject(@NotNull BlacklistCustomerInfoFragment blacklistCustomerInfoFragment);

    void inject(@NotNull BlacklistSubscriberInfoFragment blacklistSubscriberInfoFragment);

    void inject(@NotNull ByIDIdentityInfoFragment byIDIdentityInfoFragment);

    void inject(@NotNull ByIDSubscriberListInfoFragment byIDSubscriberListInfoFragment);

    void inject(@NotNull CustomerEnquiry700MhzFragment customerEnquiry700MhzFragment);

    void inject(@NotNull CustomerEnquiryInputFragment customerEnquiryInputFragment);

    void inject(@NotNull CustomerEnquirySmartCardFragment customerEnquirySmartCardFragment);

    void inject(@NotNull CustomerKeyinFragment customerKeyinFragment);

    void inject(@NotNull IDEnquiryContainerFragment iDEnquiryContainerFragment);

    void inject(@NotNull IdentityFragment identityFragment);

    void inject(@NotNull IdentityInfoFragment identityInfoFragment);

    void inject(@NotNull InfoAnalyticFragment infoAnalyticFragment);

    void inject(@NotNull PermitListFragment permitListFragment);

    void inject(@NotNull PostEnquiryContainerFragment postEnquiryContainerFragment);

    void inject(@NotNull PostInfoAnalyticFragment postInfoAnalyticFragment);

    void inject(@NotNull PostSubscriberInfoFragment postSubscriberInfoFragment);

    void inject(@NotNull PreEnquiryContainerFragment preEnquiryContainerFragment);

    void inject(@NotNull PreSubscriberInfoFragment preSubscriberInfoFragment);

    void inject(@NotNull ServiceListFragment serviceListFragment);

    void inject(@NotNull ShelfDownSellPackageViewFragment shelfDownSellPackageViewFragment);

    void inject(@NotNull ShelfPackageViewFragment shelfPackageViewFragment);

    void inject(@NotNull SubscriberEnquiryFragment subscriberEnquiryFragment);

    void inject(@NotNull SubscriberListPagerFragment subscriberListPagerFragment);

    void inject(@NotNull SuspendInfoFragment suspendInfoFragment);

    void inject(@NotNull DeviceSummaryFragment deviceSummaryFragment);

    void inject(@NotNull DeviceSummaryInfoFragment deviceSummaryInfoFragment);

    void inject(@NotNull MainPackageSummaryFragment mainPackageSummaryFragment);

    void inject(@NotNull NextPackageSummaryFragment nextPackageSummaryFragment);

    void inject(@NotNull RemovePackageSummaryFragment removePackageSummaryFragment);

    void inject(@NotNull SuccessPackageSummaryFragment successPackageSummaryFragment);

    void inject(@NotNull CustomerEnquiryESimShowQrCodeFragment customerEnquiryESimShowQrCodeFragment);
}
