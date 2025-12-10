package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.activity.OneChangeOwnerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerInputMobileNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerVerifyOtpFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.camera.OneChangeOwnerCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.camera.OneChangeOwnerIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.camera.OneChangeOwnerPreviewCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.camera.OneChangeOwnerReferencePreviewFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.camera.OneChangeOwnerTakeReferenceDocFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.consent.OneChangeOwnerNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.consent.OneChangeOwnerTMNConsentFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.face_recog.OneChangeOwnerFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.form.OneChangeOwnerFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.form.OneChangeOwnerFormTabFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.input_document.OnePrepaidChangeOwnerInputDocumentFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.smartcard.OneChangeOwnerReadSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneChangeOwnerComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/activity/OneChangeOwnerActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/OneChangeOwnerInputMobileNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/OneChangeOwnerSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/OneChangeOwnerSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/OneChangeOwnerVerifyOtpFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/camera/OneChangeOwnerCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/camera/OneChangeOwnerIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/camera/OneChangeOwnerPreviewCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/camera/OneChangeOwnerReferencePreviewFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/camera/OneChangeOwnerTakeReferenceDocFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/consent/OneChangeOwnerNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/consent/OneChangeOwnerTMNConsentFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/face_recog/OneChangeOwnerFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/form/OneChangeOwnerFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/form/OneChangeOwnerFormTabFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/input_document/OnePrepaidChangeOwnerInputDocumentFragment;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/fragment/smartcard/OneChangeOwnerReadSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneChangeOwnerComponent */
/* loaded from: classes7.dex */
public interface OneChangeOwnerComponent extends AbstractActivityComponent<OneChangeOwnerActivity> {
    void inject(@NotNull OneChangeOwnerInputMobileNumberFragment oneChangeOwnerInputMobileNumberFragment);

    void inject(@NotNull OneChangeOwnerSuccessFragment oneChangeOwnerSuccessFragment);

    void inject(@NotNull OneChangeOwnerSummaryFragment oneChangeOwnerSummaryFragment);

    void inject(@NotNull OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment);

    void inject(@NotNull OneChangeOwnerCustomerCameraFragment oneChangeOwnerCustomerCameraFragment);

    void inject(@NotNull OneChangeOwnerIdCardCameraFragment oneChangeOwnerIdCardCameraFragment);

    void inject(@NotNull OneChangeOwnerPreviewCameraFragment oneChangeOwnerPreviewCameraFragment);

    void inject(@NotNull OneChangeOwnerReferencePreviewFragment oneChangeOwnerReferencePreviewFragment);

    void inject(@NotNull OneChangeOwnerTakeReferenceDocFragment oneChangeOwnerTakeReferenceDocFragment);

    void inject(@NotNull OneChangeOwnerNonTelcoFragment oneChangeOwnerNonTelcoFragment);

    void inject(@NotNull OneChangeOwnerTMNConsentFragment oneChangeOwnerTMNConsentFragment);

    void inject(@NotNull OneChangeOwnerFaceRecognitionFragment oneChangeOwnerFaceRecognitionFragment);

    void inject(@NotNull OneChangeOwnerFormFragment oneChangeOwnerFormFragment);

    void inject(@NotNull OneChangeOwnerFormTabFragment oneChangeOwnerFormTabFragment);

    void inject(@NotNull OnePrepaidChangeOwnerInputDocumentFragment onePrepaidChangeOwnerInputDocumentFragment);

    void inject(@NotNull OneChangeOwnerReadSmartCardFragment oneChangeOwnerReadSmartCardFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);
}
