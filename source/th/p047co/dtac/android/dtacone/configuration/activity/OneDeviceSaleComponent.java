package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleDeviceInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleInputSubscriberNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePackageListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSalePrepareProfileInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSearchPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSelectContractFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSignatureFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSaleAdditionalAdvancePaymentFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSaleCampaignListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSaleInputCouponFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSalePromotionalFragment;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSaleSelectDiscountFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneDeviceSaleComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/activity/OneDeviceSaleActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleAdditionalAdvanceFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleAllPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleDeviceInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleInputSubscriberNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSalePackageListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSalePrepareProfileInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleSearchPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleSelectContractFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleSignatureFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/OneDeviceSaleSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/device_campaign/OneDeviceSaleAdditionalAdvancePaymentFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/device_campaign/OneDeviceSaleCampaignListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/device_campaign/OneDeviceSaleInputCouponFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/device_campaign/OneDeviceSalePromotionalFragment;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/fragment/device_campaign/OneDeviceSaleSelectDiscountFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneDeviceSaleComponent */
/* loaded from: classes7.dex */
public interface OneDeviceSaleComponent extends AbstractActivityComponent<OneDeviceSaleActivity> {
    void inject(@NotNull OneDeviceSaleAdditionalAdvanceFragment oneDeviceSaleAdditionalAdvanceFragment);

    void inject(@NotNull OneDeviceSaleAllPackageFragment oneDeviceSaleAllPackageFragment);

    void inject(@NotNull OneDeviceSaleDeviceInfoFragment oneDeviceSaleDeviceInfoFragment);

    void inject(@NotNull OneDeviceSaleInputIMEIFragment oneDeviceSaleInputIMEIFragment);

    void inject(@NotNull OneDeviceSaleInputSubscriberNumberFragment oneDeviceSaleInputSubscriberNumberFragment);

    void inject(@NotNull OneDeviceSalePackageListFragment oneDeviceSalePackageListFragment);

    void inject(@NotNull OneDeviceSalePrepareProfileInfoFragment oneDeviceSalePrepareProfileInfoFragment);

    void inject(@NotNull OneDeviceSaleScanIMEIFragment oneDeviceSaleScanIMEIFragment);

    void inject(@NotNull OneDeviceSaleSearchPackageFragment oneDeviceSaleSearchPackageFragment);

    void inject(@NotNull OneDeviceSaleSelectContractFragment oneDeviceSaleSelectContractFragment);

    void inject(@NotNull OneDeviceSaleSignatureFragment oneDeviceSaleSignatureFragment);

    void inject(@NotNull OneDeviceSaleSuccessFragment oneDeviceSaleSuccessFragment);

    void inject(@NotNull OneDeviceSaleSummaryFragment oneDeviceSaleSummaryFragment);

    void inject(@NotNull OneDeviceSaleAdditionalAdvancePaymentFragment oneDeviceSaleAdditionalAdvancePaymentFragment);

    void inject(@NotNull OneDeviceSaleCampaignListFragment oneDeviceSaleCampaignListFragment);

    void inject(@NotNull OneDeviceSaleInputCouponFragment oneDeviceSaleInputCouponFragment);

    void inject(@NotNull OneDeviceSalePromotionalFragment oneDeviceSalePromotionalFragment);

    void inject(@NotNull OneDeviceSaleSelectDiscountFragment oneDeviceSaleSelectDiscountFragment);
}
