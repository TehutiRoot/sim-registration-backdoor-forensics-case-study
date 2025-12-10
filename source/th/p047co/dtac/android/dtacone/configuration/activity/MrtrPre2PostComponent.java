package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostAllPackageTelephoneNumberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostAllPackageUserLanFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostChooseContractFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostChooseWithDeviceFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostInputSubscriberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostMailingFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostOTPFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostPackageListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostRecommendedPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraCustomerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostPreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostReferencePreviewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post.camera.MrtrPre2PostTakeReferenceDocFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&¨\u0006\""}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrPre2PostComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/mrtr_pre2post/MrtrPre2PostActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostAllPackageTelephoneNumberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostAllPackageUserLanFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostChooseContractFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostChooseWithDeviceFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostInputSubscriberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostMailingFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostOTPFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostPackageListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostRecommendedPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostSummaryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/camera/MrtrPre2PostCameraCustomerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/camera/MrtrPre2PostCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/camera/MrtrPre2PostPreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/camera/MrtrPre2PostReferencePreviewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/camera/MrtrPre2PostTakeReferenceDocFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrPre2PostComponent */
/* loaded from: classes7.dex */
public interface MrtrPre2PostComponent extends AbstractActivityComponent<MrtrPre2PostActivity> {
    void inject(@NotNull MrtrPre2PostAllPackageTelephoneNumberFragment mrtrPre2PostAllPackageTelephoneNumberFragment);

    void inject(@NotNull MrtrPre2PostAllPackageUserLanFragment mrtrPre2PostAllPackageUserLanFragment);

    void inject(@NotNull MrtrPre2PostChooseContractFragment mrtrPre2PostChooseContractFragment);

    void inject(@NotNull MrtrPre2PostChooseWithDeviceFragment mrtrPre2PostChooseWithDeviceFragment);

    void inject(@NotNull MrtrPre2PostConsentNonTelcoFragment mrtrPre2PostConsentNonTelcoFragment);

    void inject(@NotNull MrtrPre2PostConsentTelcoFragment mrtrPre2PostConsentTelcoFragment);

    void inject(@NotNull MrtrPre2PostFaceRecognitionFragment mrtrPre2PostFaceRecognitionFragment);

    void inject(@NotNull MrtrPre2PostFormFragment mrtrPre2PostFormFragment);

    void inject(@NotNull MrtrPre2PostIdCardFormFragment mrtrPre2PostIdCardFormFragment);

    void inject(@NotNull MrtrPre2PostInputIMEIFragment mrtrPre2PostInputIMEIFragment);

    void inject(@NotNull MrtrPre2PostInputSubscriberFragment mrtrPre2PostInputSubscriberFragment);

    void inject(@NotNull MrtrPre2PostMailingFragment mrtrPre2PostMailingFragment);

    void inject(@NotNull MrtrPre2PostOTPFragment mrtrPre2PostOTPFragment);

    void inject(@NotNull MrtrPre2PostOtherCardFormFragment mrtrPre2PostOtherCardFormFragment);

    void inject(@NotNull MrtrPre2PostPackageListFragment mrtrPre2PostPackageListFragment);

    void inject(@NotNull MrtrPre2PostRecommendedPackageFragment mrtrPre2PostRecommendedPackageFragment);

    void inject(@NotNull MrtrPre2PostScanIMEIFragment mrtrPre2PostScanIMEIFragment);

    void inject(@NotNull MrtrPre2PostSmartCardFragment mrtrPre2PostSmartCardFragment);

    void inject(@NotNull MrtrPre2PostSuccessFragment mrtrPre2PostSuccessFragment);

    void inject(@NotNull MrtrPre2PostSummaryFragment mrtrPre2PostSummaryFragment);

    void inject(@NotNull MrtrPre2PostCameraCustomerFragment mrtrPre2PostCameraCustomerFragment);

    void inject(@NotNull MrtrPre2PostCameraFragment mrtrPre2PostCameraFragment);

    void inject(@NotNull MrtrPre2PostPreviewImageFragment mrtrPre2PostPreviewImageFragment);

    void inject(@NotNull MrtrPre2PostReferencePreviewFragment mrtrPre2PostReferencePreviewFragment);

    void inject(@NotNull MrtrPre2PostTakeReferenceDocFragment mrtrPre2PostTakeReferenceDocFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
