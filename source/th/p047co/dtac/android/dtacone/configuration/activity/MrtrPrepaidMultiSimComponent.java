package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimPrepaidScanBarcodeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimResultSubListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimSubscriberListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.camera.MrtrMultiSimPreviewOptionalImageForSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.camera.MrtrMultiSimPreviewOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.consent.MrtrMultiSimPrepaidNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.payment.MrtrMultiSimAddressReceiptFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.payment.MrtrMultiSimInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.payment.MrtrMultiSimInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.payment.MrtrMultiSimInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.payment.MrtrMultiSimPaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrPrepaidMultiSimComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/multi_sim/MrtrPrepaidMultiSimActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimPrepaidScanBarcodeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimResultSubListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimSubscriberListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/camera/MrtrMultiSimPreviewOptionalImageForSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/camera/MrtrMultiSimPreviewOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/consent/MrtrMultiSimConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/consent/MrtrMultiSimPrepaidNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/one_common/MrtrMultiSimNavigateToCommonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/payment/MrtrMultiSimAddressReceiptFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/payment/MrtrMultiSimInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/payment/MrtrMultiSimInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/payment/MrtrMultiSimInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/payment/MrtrMultiSimPaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrPrepaidMultiSimComponent */
/* loaded from: classes7.dex */
public interface MrtrPrepaidMultiSimComponent extends AbstractActivityComponent<MrtrPrepaidMultiSimActivity> {
    void inject(@NotNull MrtrMultiSimPrepaidScanBarcodeFragment mrtrMultiSimPrepaidScanBarcodeFragment);

    void inject(@NotNull MrtrMultiSimResultSubListFragment mrtrMultiSimResultSubListFragment);

    void inject(@NotNull MrtrMultiSimSubscriberListFragment mrtrMultiSimSubscriberListFragment);

    void inject(@NotNull MrtrMultiSimSuccessFragment mrtrMultiSimSuccessFragment);

    void inject(@NotNull MrtrMultiSimSummaryFragment mrtrMultiSimSummaryFragment);

    void inject(@NotNull MrtrMultiSimPreviewOptionalImageForSummaryFragment mrtrMultiSimPreviewOptionalImageForSummaryFragment);

    void inject(@NotNull MrtrMultiSimPreviewOptionalImageFragment mrtrMultiSimPreviewOptionalImageFragment);

    void inject(@NotNull MrtrMultiSimConsentTelcoFragment mrtrMultiSimConsentTelcoFragment);

    void inject(@NotNull MrtrMultiSimPrepaidNonTelcoFragment mrtrMultiSimPrepaidNonTelcoFragment);

    void inject(@NotNull MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment);

    void inject(@NotNull MrtrMultiSimAddressReceiptFragment mrtrMultiSimAddressReceiptFragment);

    void inject(@NotNull MrtrMultiSimInputAddressIdCardFragment mrtrMultiSimInputAddressIdCardFragment);

    void inject(@NotNull MrtrMultiSimInputAddressPassportFragment mrtrMultiSimInputAddressPassportFragment);

    void inject(@NotNull MrtrMultiSimInputAddressPersonFragment mrtrMultiSimInputAddressPersonFragment);

    void inject(@NotNull MrtrMultiSimPaymentFragment mrtrMultiSimPaymentFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
