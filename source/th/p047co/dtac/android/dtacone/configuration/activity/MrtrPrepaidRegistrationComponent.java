package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration.MrtrPrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPrepaidPaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPrepaidPreviewOptionalImageForSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPrepaidPreviewOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPrepaidScanBarcodeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPrepaidSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPrepaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common.MrtrPrepaidNavigateToCommonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.receipt.MrtrPrepaidAddressReceiptFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.receipt.MrtrPrepaidInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.receipt.MrtrPrepaidInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.receipt.MrtrPrepaidInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.telco.MrtrPrepaidTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrPrepaidRegistrationComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/mrtr_prepaid_registration/MrtrPrepaidRegistrationActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPrepaidPaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPrepaidPreviewOptionalImageForSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPrepaidPreviewOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPrepaidScanBarcodeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPrepaidSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPrepaidSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/common/MrtrPrepaidNavigateToCommonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/family_sim/InputPostpaidFamilySimSubscriberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/receipt/MrtrPrepaidAddressReceiptFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/receipt/MrtrPrepaidInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/receipt/MrtrPrepaidInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/receipt/MrtrPrepaidInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/telco/MrtrPrepaidNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/telco/MrtrPrepaidTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrPrepaidRegistrationComponent */
/* loaded from: classes7.dex */
public interface MrtrPrepaidRegistrationComponent extends AbstractActivityComponent<MrtrPrepaidRegistrationActivity> {
    void inject(@NotNull MrtrPrepaidPaymentFragment mrtrPrepaidPaymentFragment);

    void inject(@NotNull MrtrPrepaidPreviewOptionalImageForSummaryFragment mrtrPrepaidPreviewOptionalImageForSummaryFragment);

    void inject(@NotNull MrtrPrepaidPreviewOptionalImageFragment mrtrPrepaidPreviewOptionalImageFragment);

    void inject(@NotNull MrtrPrepaidScanBarcodeFragment mrtrPrepaidScanBarcodeFragment);

    void inject(@NotNull MrtrPrepaidSuccessFragment mrtrPrepaidSuccessFragment);

    void inject(@NotNull MrtrPrepaidSummaryFragment mrtrPrepaidSummaryFragment);

    void inject(@NotNull MrtrPrepaidNavigateToCommonFragment mrtrPrepaidNavigateToCommonFragment);

    void inject(@NotNull InputPostpaidFamilySimSubscriberFragment inputPostpaidFamilySimSubscriberFragment);

    void inject(@NotNull MrtrPrepaidAddressReceiptFragment mrtrPrepaidAddressReceiptFragment);

    void inject(@NotNull MrtrPrepaidInputAddressIdCardFragment mrtrPrepaidInputAddressIdCardFragment);

    void inject(@NotNull MrtrPrepaidInputAddressPassportFragment mrtrPrepaidInputAddressPassportFragment);

    void inject(@NotNull MrtrPrepaidInputAddressPersonFragment mrtrPrepaidInputAddressPersonFragment);

    void inject(@NotNull MrtrPrepaidNonTelcoFragment mrtrPrepaidNonTelcoFragment);

    void inject(@NotNull MrtrPrepaidTelcoFragment mrtrPrepaidTelcoFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
