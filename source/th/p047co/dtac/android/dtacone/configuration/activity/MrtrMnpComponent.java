package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpChooseServiceTypeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpInputPinCodeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpMailingFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpPackageSetFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpRequestOtpFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpReviewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpScanSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpVerifyOTPFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpWriteSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.camera.MrtrMnpIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.camera.MrtrMnpOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.camera.MrtrMnpPreviewIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.form.MrtrMnpIdFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.smart_card.MrtrMnpSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrMnpConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrMnpConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrMnpComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/mrtr_mnp/MrtrMnpActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpChooseServiceTypeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpInputPinCodeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpMailingFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpNavigateToCommonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpPackageSetFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpRequestOtpFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpReviewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpScanSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpVerifyOTPFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/MrtrMnpWriteSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/camera/MrtrMnpIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/camera/MrtrMnpOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/camera/MrtrMnpPreviewIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpIdFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/smart_card/MrtrMnpSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/consent_non_telco/MrtrMnpConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/consent_non_telco/MrtrMnpConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrMnpComponent */
/* loaded from: classes7.dex */
public interface MrtrMnpComponent extends AbstractActivityComponent<MrtrMnpActivity> {
    void inject(@NotNull MrtrMnpChooseServiceTypeFragment mrtrMnpChooseServiceTypeFragment);

    void inject(@NotNull MrtrMnpInputPinCodeFragment mrtrMnpInputPinCodeFragment);

    void inject(@NotNull MrtrMnpMailingFragment mrtrMnpMailingFragment);

    void inject(@NotNull MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment);

    void inject(@NotNull MrtrMnpPackageSetFragment mrtrMnpPackageSetFragment);

    void inject(@NotNull MrtrMnpRequestOtpFragment mrtrMnpRequestOtpFragment);

    void inject(@NotNull MrtrMnpReviewFragment mrtrMnpReviewFragment);

    void inject(@NotNull MrtrMnpScanSimFragment mrtrMnpScanSimFragment);

    void inject(@NotNull MrtrMnpSuccessFragment mrtrMnpSuccessFragment);

    void inject(@NotNull MrtrMnpVerifyOTPFragment mrtrMnpVerifyOTPFragment);

    void inject(@NotNull MrtrMnpWriteSimFragment mrtrMnpWriteSimFragment);

    void inject(@NotNull MrtrMnpIdCardCameraFragment mrtrMnpIdCardCameraFragment);

    void inject(@NotNull MrtrMnpOptionalImageFragment mrtrMnpOptionalImageFragment);

    void inject(@NotNull MrtrMnpPreviewIdCardFragment mrtrMnpPreviewIdCardFragment);

    void inject(@NotNull MrtrMnpIdFormFragment mrtrMnpIdFormFragment);

    void inject(@NotNull MrtrMnpSmartCardFragment mrtrMnpSmartCardFragment);

    void inject(@NotNull MrtrMnpConsentNonTelcoFragment mrtrMnpConsentNonTelcoFragment);

    void inject(@NotNull MrtrMnpConsentTelcoFragment mrtrMnpConsentTelcoFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
