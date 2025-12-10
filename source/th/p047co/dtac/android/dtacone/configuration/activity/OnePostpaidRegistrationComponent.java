package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidChooseWithContractFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidChooseWithDeviceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidInputSimFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidNiceNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidPreviewCustomerImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidPreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidRegisSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidScanSimFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidSmartCardFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidValidationIDCardInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidValidationSpecialPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidTMNFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.mail.OnePostpaidMailingFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidPackageListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment.OneInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment.OneInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment.OneInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment.OneInputAddressReceiptFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment.OnePostpaidPaymentFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.search.OnePostpaidSearchPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidAdditionalAdvancePaymentTrueFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidCampaignCreditFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidCampaignListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidChooseWithDeviceTFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidInputNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidMaterialCodeFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidNiceNumberTrueFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidPropositionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidReserveNumberListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTrueMailingFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTruePackageListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OneVerifyCampaignFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.with_device.MrtrPostpaidBlacklistSharingConsentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001dH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020 H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\"H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020#H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020$H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020%H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020&H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020(H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020)H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020+H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020,H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020-H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020.H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020/H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000200H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000201H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000202H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000203H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000204H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000205H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000206H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000207H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000208H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u000209H&¨\u0006:"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OnePostpaidRegistrationComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/activity/OnePostpaidRegistrationActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogFragment;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/address/OneAddressInfoDialogTrueFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidChooseWithContractFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidChooseWithDeviceFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidInputSimFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidNiceNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidPreviewCustomerImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidPreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidRegisSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidScanSimFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidSmartCardFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidValidationIDCardInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidValidationSpecialPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/blacklist/OnePostpaidCheckBlacklistAdditionalAdvanceFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/blacklist/OnePostpaidCheckBlacklistFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/common/OnePostpaidNavigateToCommonFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/consent/OnePostpaidConsentNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/consent/OnePostpaidConsentTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/consent/OnePostpaidTMNFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/mail/OnePostpaidMailingFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/packages/OnePostpaidAllPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/packages/OnePostpaidDefaultPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/packages/OnePostpaidPackageListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/payment/OneInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/payment/OneInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/payment/OneInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/payment/OneInputAddressReceiptFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/payment/OnePostpaidPaymentFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/search/OnePostpaidSearchPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidAdditionalAdvancePaymentTrueFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidCampaignCreditFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidCampaignListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidChooseWithDeviceTFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidInputNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidMaterialCodeFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidNiceNumberTrueFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidPropositionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidReserveNumberListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidTrueMailingFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidTruePackageListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OneVerifyCampaignFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/with_device/MrtrPostpaidBlacklistSharingConsentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OnePostpaidRegistrationComponent */
/* loaded from: classes7.dex */
public interface OnePostpaidRegistrationComponent extends AbstractActivityComponent<OnePostpaidRegistrationActivity> {
    void inject(@NotNull OneAddressInfoDialogFragment oneAddressInfoDialogFragment);

    void inject(@NotNull OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment);

    void inject(@NotNull OnePostpaidChooseWithContractFragment onePostpaidChooseWithContractFragment);

    void inject(@NotNull OnePostpaidChooseWithDeviceFragment onePostpaidChooseWithDeviceFragment);

    void inject(@NotNull OnePostpaidCustomerCameraFragment onePostpaidCustomerCameraFragment);

    void inject(@NotNull OnePostpaidFaceRecognitionFragment onePostpaidFaceRecognitionFragment);

    void inject(@NotNull OnePostpaidFormFragment onePostpaidFormFragment);

    void inject(@NotNull OnePostpaidIdCardCameraFragment onePostpaidIdCardCameraFragment);

    void inject(@NotNull OnePostpaidInputIMEIFragment onePostpaidInputIMEIFragment);

    void inject(@NotNull OnePostpaidInputSimFragment onePostpaidInputSimFragment);

    void inject(@NotNull OnePostpaidNiceNumberFragment onePostpaidNiceNumberFragment);

    void inject(@NotNull OnePostpaidOptionalImageFragment onePostpaidOptionalImageFragment);

    void inject(@NotNull OnePostpaidPreviewCustomerImageFragment onePostpaidPreviewCustomerImageFragment);

    void inject(@NotNull OnePostpaidPreviewImageFragment onePostpaidPreviewImageFragment);

    void inject(@NotNull OnePostpaidRegisSuccessFragment onePostpaidRegisSuccessFragment);

    void inject(@NotNull OnePostpaidScanIMEIFragment onePostpaidScanIMEIFragment);

    void inject(@NotNull OnePostpaidScanSimFragment onePostpaidScanSimFragment);

    void inject(@NotNull OnePostpaidSmartCardFragment onePostpaidSmartCardFragment);

    void inject(@NotNull OnePostpaidSummaryFragment onePostpaidSummaryFragment);

    void inject(@NotNull OnePostpaidValidationIDCardInfoFragment onePostpaidValidationIDCardInfoFragment);

    void inject(@NotNull OnePostpaidValidationSpecialPackageFragment onePostpaidValidationSpecialPackageFragment);

    void inject(@NotNull OnePostpaidCheckBlacklistAdditionalAdvanceFragment onePostpaidCheckBlacklistAdditionalAdvanceFragment);

    void inject(@NotNull OnePostpaidCheckBlacklistFragment onePostpaidCheckBlacklistFragment);

    void inject(@NotNull OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment);

    void inject(@NotNull OnePostpaidConsentNonTelcoFragment onePostpaidConsentNonTelcoFragment);

    void inject(@NotNull OnePostpaidConsentTelcoFragment onePostpaidConsentTelcoFragment);

    void inject(@NotNull OnePostpaidTMNFragment onePostpaidTMNFragment);

    void inject(@NotNull OnePostpaidMailingFragment onePostpaidMailingFragment);

    void inject(@NotNull OnePostpaidAllPackageFragment onePostpaidAllPackageFragment);

    void inject(@NotNull OnePostpaidDefaultPackageFragment onePostpaidDefaultPackageFragment);

    void inject(@NotNull OnePostpaidPackageListFragment onePostpaidPackageListFragment);

    void inject(@NotNull OneInputAddressIdCardFragment oneInputAddressIdCardFragment);

    void inject(@NotNull OneInputAddressPassportFragment oneInputAddressPassportFragment);

    void inject(@NotNull OneInputAddressPersonFragment oneInputAddressPersonFragment);

    void inject(@NotNull OneInputAddressReceiptFragment oneInputAddressReceiptFragment);

    void inject(@NotNull OnePostpaidPaymentFragment onePostpaidPaymentFragment);

    void inject(@NotNull OnePostpaidSearchPackageFragment onePostpaidSearchPackageFragment);

    void inject(@NotNull OnePostpaidAdditionalAdvancePaymentTrueFragment onePostpaidAdditionalAdvancePaymentTrueFragment);

    void inject(@NotNull OnePostpaidCampaignCreditFragment onePostpaidCampaignCreditFragment);

    void inject(@NotNull OnePostpaidCampaignListFragment onePostpaidCampaignListFragment);

    void inject(@NotNull OnePostpaidChooseWithDeviceTFragment onePostpaidChooseWithDeviceTFragment);

    void inject(@NotNull OnePostpaidInputNumberFragment onePostpaidInputNumberFragment);

    void inject(@NotNull OnePostpaidMaterialCodeFragment onePostpaidMaterialCodeFragment);

    void inject(@NotNull OnePostpaidNiceNumberTrueFragment onePostpaidNiceNumberTrueFragment);

    void inject(@NotNull OnePostpaidPropositionFragment onePostpaidPropositionFragment);

    void inject(@NotNull OnePostpaidReserveNumberListFragment onePostpaidReserveNumberListFragment);

    void inject(@NotNull OnePostpaidTrueMailingFragment onePostpaidTrueMailingFragment);

    void inject(@NotNull OnePostpaidTruePackageListFragment onePostpaidTruePackageListFragment);

    void inject(@NotNull OneVerifyCampaignFragment oneVerifyCampaignFragment);

    void inject(@NotNull MrtrPostpaidBlacklistSharingConsentFragment mrtrPostpaidBlacklistSharingConsentFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);
}
