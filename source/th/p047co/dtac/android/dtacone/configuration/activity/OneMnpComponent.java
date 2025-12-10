package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpChooseRegisterOptionTypeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpChooseServiceTypeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpInputMobileNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpInputNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpInputPinCodeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpMailingFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPackageSetFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPreviewCustomerFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPreviewIdCardFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpReadSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpScanSimFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSignFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpTMNFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpVerifyOtpFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpWriteSimFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.form.OneMnpIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTrueScanSimBarCodeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020#H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020%H&¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneMnpComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/activity/OneMnpActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpChooseRegisterOptionTypeFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpChooseServiceTypeFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpIdNumberFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpInputMobileNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpInputNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpInputPinCodeFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpMailingFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpPackageSetFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpPreviewCustomerFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpPreviewIdCardFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpPropositionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpReadSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpScanSimFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpSignFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpTMNFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpVerifyOtpFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpWriteSimFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/consent/OneMnpConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/consent/OneMnpConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/form/OneMnpIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/trueCompany/OneMnpFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/trueCompany/OneMnpTruePackageSetFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/trueCompany/OneMnpTrueScanSimBarCodeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneMnpComponent */
/* loaded from: classes7.dex */
public interface OneMnpComponent extends AbstractActivityComponent<OneMnpActivity> {
    void inject(@NotNull OneAddressInfoDialogFragment oneAddressInfoDialogFragment);

    void inject(@NotNull OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment);

    void inject(@NotNull OneMnpChooseRegisterOptionTypeFragment oneMnpChooseRegisterOptionTypeFragment);

    void inject(@NotNull OneMnpChooseServiceTypeFragment oneMnpChooseServiceTypeFragment);

    void inject(@NotNull OneMnpCustomerCameraFragment oneMnpCustomerCameraFragment);

    void inject(@NotNull OneMnpIdCardCameraFragment oneMnpIdCardCameraFragment);

    void inject(@NotNull OneMnpIdNumberFormFragment oneMnpIdNumberFormFragment);

    void inject(@NotNull OneMnpInputMobileNumberFragment oneMnpInputMobileNumberFragment);

    void inject(@NotNull OneMnpInputNumberFragment oneMnpInputNumberFragment);

    void inject(@NotNull OneMnpInputPinCodeFragment oneMnpInputPinCodeFragment);

    void inject(@NotNull OneMnpMailingFragment oneMnpMailingFragment);

    void inject(@NotNull OneMnpOptionalImageFragment oneMnpOptionalImageFragment);

    void inject(@NotNull OneMnpPackageSetFragment oneMnpPackageSetFragment);

    void inject(@NotNull OneMnpPreviewCustomerFragment oneMnpPreviewCustomerFragment);

    void inject(@NotNull OneMnpPreviewIdCardFragment oneMnpPreviewIdCardFragment);

    void inject(@NotNull OneMnpPropositionFragment oneMnpPropositionFragment);

    void inject(@NotNull OneMnpReadSmartCardFragment oneMnpReadSmartCardFragment);

    void inject(@NotNull OneMnpScanSimFragment oneMnpScanSimFragment);

    void inject(@NotNull OneMnpSignFragment oneMnpSignFragment);

    void inject(@NotNull OneMnpSuccessFragment oneMnpSuccessFragment);

    void inject(@NotNull OneMnpSummaryFragment oneMnpSummaryFragment);

    void inject(@NotNull OneMnpTMNFragment oneMnpTMNFragment);

    void inject(@NotNull OneMnpVerifyOtpFragment oneMnpVerifyOtpFragment);

    void inject(@NotNull OneMnpWriteSimFragment oneMnpWriteSimFragment);

    void inject(@NotNull OneMnpConsentNonTelcoFragment oneMnpConsentNonTelcoFragment);

    void inject(@NotNull OneMnpConsentTelcoFragment oneMnpConsentTelcoFragment);

    void inject(@NotNull OneMnpIdCardFormFragment oneMnpIdCardFormFragment);

    void inject(@NotNull OneMnpFaceRecognitionFragment oneMnpFaceRecognitionFragment);

    void inject(@NotNull OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment);

    void inject(@NotNull OneMnpTrueScanSimBarCodeFragment oneMnpTrueScanSimBarCodeFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);
}
