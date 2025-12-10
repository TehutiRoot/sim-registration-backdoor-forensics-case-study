package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostAllPackageTelephoneNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostInputMobileNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostMailingFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostPackageListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostPreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostReadSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostRecommendedPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostReferenceDocPreviewFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSearchPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSelectRegisterTypeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSignatureFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostTakeReferenceDocFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostVerifyOTPFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2postChooseWithContractFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentTMNFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.dialog.OnePre2PostChangeIMEIDialogFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.form.OnePre2PostIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.form.OnePre2PostInputIdNumberFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.form.OnePre2PostPassportFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostSelectPropositionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.trueCompany.OnePre2PostTrueMailingFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020#H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020%H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020)H&¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OnePre2PostComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/activity/OnePre2PostActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/consent/OneMnpConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/consent/OneMnpConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostAllPackageTelephoneNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostInputMobileNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostMailingFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostPackageListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostPreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostReadSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostRecommendedPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostReferenceDocPreviewFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostSearchPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostSelectRegisterTypeFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostSignatureFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostTakeReferenceDocFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2PostVerifyOTPFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/OnePre2postChooseWithContractFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/consent/OnePre2PostConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/consent/OnePre2PostConsentTMNFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/consent/OnePre2PostConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/dialog/OnePre2PostChangeIMEIDialogFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/form/OnePre2PostIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/form/OnePre2PostInputIdNumberFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/form/OnePre2PostPassportFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/trueCompany/OnePre2PostSelectPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/trueCompany/OnePre2PostSelectPropositionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/fragment/trueCompany/OnePre2PostTrueMailingFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OnePre2PostComponent */
/* loaded from: classes7.dex */
public interface OnePre2PostComponent extends AbstractActivityComponent<OnePre2PostActivity> {
    void inject(@NotNull OneAddressInfoDialogFragment oneAddressInfoDialogFragment);

    void inject(@NotNull OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment);

    void inject(@NotNull OneMnpConsentNonTelcoFragment oneMnpConsentNonTelcoFragment);

    void inject(@NotNull OneMnpConsentTelcoFragment oneMnpConsentTelcoFragment);

    void inject(@NotNull OnePre2PostAllPackageTelephoneNumberFragment onePre2PostAllPackageTelephoneNumberFragment);

    void inject(@NotNull OnePre2PostCustomerCameraFragment onePre2PostCustomerCameraFragment);

    void inject(@NotNull OnePre2PostFaceRecognitionFragment onePre2PostFaceRecognitionFragment);

    void inject(@NotNull OnePre2PostIdCardCameraFragment onePre2PostIdCardCameraFragment);

    void inject(@NotNull OnePre2PostInputIMEIFragment onePre2PostInputIMEIFragment);

    void inject(@NotNull OnePre2PostInputMobileNumberFragment onePre2PostInputMobileNumberFragment);

    void inject(@NotNull OnePre2PostMailingFragment onePre2PostMailingFragment);

    void inject(@NotNull OnePre2PostPackageListFragment onePre2PostPackageListFragment);

    void inject(@NotNull OnePre2PostPreviewImageFragment onePre2PostPreviewImageFragment);

    void inject(@NotNull OnePre2PostReadSmartCardFragment onePre2PostReadSmartCardFragment);

    void inject(@NotNull OnePre2PostRecommendedPackageFragment onePre2PostRecommendedPackageFragment);

    void inject(@NotNull OnePre2PostReferenceDocPreviewFragment onePre2PostReferenceDocPreviewFragment);

    void inject(@NotNull OnePre2PostScanIMEIFragment onePre2PostScanIMEIFragment);

    void inject(@NotNull OnePre2PostSearchPackageFragment onePre2PostSearchPackageFragment);

    void inject(@NotNull OnePre2PostSelectRegisterTypeFragment onePre2PostSelectRegisterTypeFragment);

    void inject(@NotNull OnePre2PostSignatureFragment onePre2PostSignatureFragment);

    void inject(@NotNull OnePre2PostSuccessFragment onePre2PostSuccessFragment);

    void inject(@NotNull OnePre2PostSummaryFragment onePre2PostSummaryFragment);

    void inject(@NotNull OnePre2PostTakeReferenceDocFragment onePre2PostTakeReferenceDocFragment);

    void inject(@NotNull OnePre2PostVerifyOTPFragment onePre2PostVerifyOTPFragment);

    void inject(@NotNull OnePre2postChooseWithContractFragment onePre2postChooseWithContractFragment);

    void inject(@NotNull OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment);

    void inject(@NotNull OnePre2PostConsentTMNFragment onePre2PostConsentTMNFragment);

    void inject(@NotNull OnePre2PostConsentTelcoFragment onePre2PostConsentTelcoFragment);

    void inject(@NotNull OnePre2PostChangeIMEIDialogFragment onePre2PostChangeIMEIDialogFragment);

    void inject(@NotNull OnePre2PostIdCardFormFragment onePre2PostIdCardFormFragment);

    void inject(@NotNull OnePre2PostInputIdNumberFormFragment onePre2PostInputIdNumberFormFragment);

    void inject(@NotNull OnePre2PostPassportFormFragment onePre2PostPassportFormFragment);

    void inject(@NotNull OnePre2PostSelectPackageFragment onePre2PostSelectPackageFragment);

    void inject(@NotNull OnePre2PostSelectPropositionFragment onePre2PostSelectPropositionFragment);

    void inject(@NotNull OnePre2PostTrueMailingFragment onePre2PostTrueMailingFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);
}
