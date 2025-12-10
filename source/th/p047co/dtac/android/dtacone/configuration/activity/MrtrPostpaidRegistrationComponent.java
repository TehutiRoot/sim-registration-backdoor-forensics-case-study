package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidPreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_x_sim.MrtrPostpaidConsentXSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.face_recognition.MrtrPostpaidFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidInputSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.mailing.MrtrPostpaidMailingFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.multiple_photo.MrtrPostpaidOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidDxAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidDxDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidPackageListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.payment.MrtrInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.payment.MrtrInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.payment.MrtrInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.payment.MrtrInputAddressReceiptFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.payment.MrtrPostpaidPaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.postpaid_validation.MrtrPostpaidValidationIDCardInfoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.postpaid_validation.MrtrPostpaidValidationInputIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.postpaid_validation.MrtrPostpaidValidationSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.postpaid_validation.MrtrPostpaidValidationSpecialPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidNiceNumberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidRegisSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.scan.MrtrPostpaidScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.scan.MrtrPostpaidScanSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.select_type.MrtrPostpaidChooseWithContractFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.select_type.MrtrPostpaidChooseWithDeviceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.smart_card.MrtrPostpaidSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device.MrtrPostpaidBlacklistSharingConsentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device.MrtrPostpaidExtraAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020#H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020%H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020)H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020+H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020,H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020-H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020/H&¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrPostpaidRegistrationComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/mrtr_postpaid_registration/MrtrPostpaidRegistrationActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/camera/MrtrPostpaidCommonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/camera/MrtrPostpaidCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/camera/MrtrPostpaidIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/camera/MrtrPostpaidPreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/consent_non_telco/MrtrPostpaidConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/consent_non_telco/MrtrPostpaidConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/consent_x_sim/MrtrPostpaidConsentXSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/face_recognition/MrtrPostpaidFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/from/MrtrPostpaidInputSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/mailing/MrtrPostpaidMailingFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/multiple_photo/MrtrPostpaidOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/packages/MrtrPostpaidAllPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/packages/MrtrPostpaidDefaultPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/packages/MrtrPostpaidDxAllPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/packages/MrtrPostpaidDxDefaultPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/packages/MrtrPostpaidPackageListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/payment/MrtrInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/payment/MrtrInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/payment/MrtrInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/payment/MrtrInputAddressReceiptFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/payment/MrtrPostpaidPaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/postpaid_validation/MrtrPostpaidValidationIDCardInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/postpaid_validation/MrtrPostpaidValidationInputIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/postpaid_validation/MrtrPostpaidValidationSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/postpaid_validation/MrtrPostpaidValidationSpecialPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/review/MrtrPostpaidNiceNumberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/review/MrtrPostpaidRegisSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/review/MrtrPostpaidSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/scan/MrtrPostpaidScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/scan/MrtrPostpaidScanSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/select_type/MrtrPostpaidChooseWithContractFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/select_type/MrtrPostpaidChooseWithDeviceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/smart_card/MrtrPostpaidSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/with_device/MrtrPostpaidBlacklistSharingConsentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/with_device/MrtrPostpaidExtraAdvanceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrPostpaidRegistrationComponent */
/* loaded from: classes7.dex */
public interface MrtrPostpaidRegistrationComponent extends AbstractActivityComponent<MrtrPostpaidRegistrationActivity> {
    void inject(@NotNull MrtrPostpaidCommonFragment mrtrPostpaidCommonFragment);

    void inject(@NotNull MrtrPostpaidCustomerCameraFragment mrtrPostpaidCustomerCameraFragment);

    void inject(@NotNull MrtrPostpaidIdCardCameraFragment mrtrPostpaidIdCardCameraFragment);

    void inject(@NotNull MrtrPostpaidPreviewImageFragment mrtrPostpaidPreviewImageFragment);

    void inject(@NotNull MrtrPostpaidConsentNonTelcoFragment mrtrPostpaidConsentNonTelcoFragment);

    void inject(@NotNull MrtrPostpaidConsentTelcoFragment mrtrPostpaidConsentTelcoFragment);

    void inject(@NotNull MrtrPostpaidConsentXSimFragment mrtrPostpaidConsentXSimFragment);

    void inject(@NotNull MrtrPostpaidFaceRecognitionFragment mrtrPostpaidFaceRecognitionFragment);

    void inject(@NotNull MrtrPostpaidFormFragment mrtrPostpaidFormFragment);

    void inject(@NotNull MrtrPostpaidIdCardFormFragment mrtrPostpaidIdCardFormFragment);

    void inject(@NotNull MrtrPostpaidInputIMEIFragment mrtrPostpaidInputIMEIFragment);

    void inject(@NotNull MrtrPostpaidInputSimFragment mrtrPostpaidInputSimFragment);

    void inject(@NotNull MrtrPostpaidMailingFragment mrtrPostpaidMailingFragment);

    void inject(@NotNull MrtrPostpaidOptionalImageFragment mrtrPostpaidOptionalImageFragment);

    void inject(@NotNull MrtrPostpaidAllPackageFragment mrtrPostpaidAllPackageFragment);

    void inject(@NotNull MrtrPostpaidDefaultPackageFragment mrtrPostpaidDefaultPackageFragment);

    void inject(@NotNull MrtrPostpaidDxAllPackageFragment mrtrPostpaidDxAllPackageFragment);

    void inject(@NotNull MrtrPostpaidDxDefaultPackageFragment mrtrPostpaidDxDefaultPackageFragment);

    void inject(@NotNull MrtrPostpaidPackageListFragment mrtrPostpaidPackageListFragment);

    void inject(@NotNull MrtrInputAddressIdCardFragment mrtrInputAddressIdCardFragment);

    void inject(@NotNull MrtrInputAddressPassportFragment mrtrInputAddressPassportFragment);

    void inject(@NotNull MrtrInputAddressPersonFragment mrtrInputAddressPersonFragment);

    void inject(@NotNull MrtrInputAddressReceiptFragment mrtrInputAddressReceiptFragment);

    void inject(@NotNull MrtrPostpaidPaymentFragment mrtrPostpaidPaymentFragment);

    void inject(@NotNull MrtrPostpaidValidationIDCardInfoFragment mrtrPostpaidValidationIDCardInfoFragment);

    void inject(@NotNull MrtrPostpaidValidationInputIdCardFragment mrtrPostpaidValidationInputIdCardFragment);

    void inject(@NotNull MrtrPostpaidValidationSmartCardFragment mrtrPostpaidValidationSmartCardFragment);

    void inject(@NotNull MrtrPostpaidValidationSpecialPackageFragment mrtrPostpaidValidationSpecialPackageFragment);

    void inject(@NotNull MrtrPostpaidNiceNumberFragment mrtrPostpaidNiceNumberFragment);

    void inject(@NotNull MrtrPostpaidRegisSuccessFragment mrtrPostpaidRegisSuccessFragment);

    void inject(@NotNull MrtrPostpaidSummaryFragment mrtrPostpaidSummaryFragment);

    void inject(@NotNull MrtrPostpaidScanIMEIFragment mrtrPostpaidScanIMEIFragment);

    void inject(@NotNull MrtrPostpaidScanSimFragment mrtrPostpaidScanSimFragment);

    void inject(@NotNull MrtrPostpaidChooseWithContractFragment mrtrPostpaidChooseWithContractFragment);

    void inject(@NotNull MrtrPostpaidChooseWithDeviceFragment mrtrPostpaidChooseWithDeviceFragment);

    void inject(@NotNull MrtrPostpaidSmartCardFragment mrtrPostpaidSmartCardFragment);

    void inject(@NotNull MrtrPostpaidBlacklistSharingConsentFragment mrtrPostpaidBlacklistSharingConsentFragment);

    void inject(@NotNull MrtrPostpaidExtraAdvanceFragment mrtrPostpaidExtraAdvanceFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
