package th.p047co.dtac.android.dtacone.configuration.activity;

import androidx.navigation.compose.DialogNavigator;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.device_sale.DeviceSaleActivity;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleBlacklistSharingConsentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleCampaignDiscountFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleChangePackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleChooseWithContractFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleDeviceInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleExtraAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleInputSubscriberNumberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSalePaymentHeaderFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSalePaymentTypeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSalePrepareProfileInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign.CampaignListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign.DiscountListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.campaign.InputFieldFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleAdvancePaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSaleInputAddressReceiptFragment;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSalePaymentInfoFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001fH&¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/DeviceSaleComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/device_sale/DeviceSaleActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleBlacklistSharingConsentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleCampaignDiscountFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleChangePackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleChooseWithContractFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleDeviceInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleExtraAdvanceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleInputSubscriberNumberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSalePaymentHeaderFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSalePaymentTypeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSalePrepareProfileInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/DeviceSaleSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/CampaignListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/DiscountListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/campaign/InputFieldFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/payment/DeviceSaleAdvancePaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/payment/DeviceSaleInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/payment/DeviceSaleInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/payment/DeviceSaleInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/payment/DeviceSaleInputAddressReceiptFragment;", "Lth/co/dtac/android/dtacone/view/fragment/device_sale/payment/DeviceSalePaymentInfoFragment;", DialogNavigator.NAME, "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.DeviceSaleComponent */
/* loaded from: classes7.dex */
public interface DeviceSaleComponent extends AbstractActivityComponent<DeviceSaleActivity> {
    void inject(@NotNull DeviceSaleBlacklistSharingConsentFragment deviceSaleBlacklistSharingConsentFragment);

    void inject(@NotNull DeviceSaleCampaignDiscountFragment deviceSaleCampaignDiscountFragment);

    void inject(@NotNull DeviceSaleChangePackageFragment deviceSaleChangePackageFragment);

    void inject(@NotNull DeviceSaleChooseWithContractFragment deviceSaleChooseWithContractFragment);

    void inject(@NotNull DeviceSaleDeviceInfoFragment deviceSaleDeviceInfoFragment);

    void inject(@NotNull DeviceSaleExtraAdvanceFragment deviceSaleExtraAdvanceFragment);

    void inject(@NotNull DeviceSaleInputIMEIFragment deviceSaleInputIMEIFragment);

    void inject(@NotNull DeviceSaleInputSubscriberNumberFragment deviceSaleInputSubscriberNumberFragment);

    void inject(@NotNull DeviceSalePaymentHeaderFragment deviceSalePaymentHeaderFragment);

    void inject(@NotNull DeviceSalePaymentTypeFragment deviceSalePaymentTypeFragment);

    void inject(@NotNull DeviceSalePrepareProfileInfoFragment deviceSalePrepareProfileInfoFragment);

    void inject(@NotNull DeviceSaleScanIMEIFragment deviceSaleScanIMEIFragment);

    void inject(@NotNull DeviceSaleSuccessFragment deviceSaleSuccessFragment);

    void inject(@NotNull DeviceSaleSummaryFragment deviceSaleSummaryFragment);

    void inject(@NotNull CampaignListFragment campaignListFragment);

    void inject(@NotNull DiscountListFragment discountListFragment);

    void inject(@NotNull InputFieldFragment inputFieldFragment);

    void inject(@NotNull DeviceSaleAdvancePaymentFragment deviceSaleAdvancePaymentFragment);

    void inject(@NotNull DeviceSaleInputAddressIdCardFragment deviceSaleInputAddressIdCardFragment);

    void inject(@NotNull DeviceSaleInputAddressPassportFragment deviceSaleInputAddressPassportFragment);

    void inject(@NotNull DeviceSaleInputAddressPersonFragment deviceSaleInputAddressPersonFragment);

    void inject(@NotNull DeviceSaleInputAddressReceiptFragment deviceSaleInputAddressReceiptFragment);

    void inject(@NotNull DeviceSalePaymentInfoFragment deviceSalePaymentInfoFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
