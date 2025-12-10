package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.dialog.OneBusinessTypeDialog;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.dialog.OneOnlineRegisterAddressDialog;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineBankAccountCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlinePreviewBankAccountPhotoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationChooseAddressFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationCommissionInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationConsentFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationIDCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationInputNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationOptionalImageListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationPersonalInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationPreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationPreviewOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationRetailerInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationSetNewPasswordFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationVerifyOTPFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneOnlineRegisterComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/activity/OneOnlineRegistrationActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/dialog/OneBusinessTypeDialog;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/dialog/OneOnlineRegisterAddressDialog;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineBankAccountCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlinePreviewBankAccountPhotoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationChooseAddressFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationCommissionInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationConsentFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationIDCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationInputNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationOptionalImageListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationPersonalInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationPreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationPreviewOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationRetailerInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationSetNewPasswordFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationVerifyOTPFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneOnlineRegisterComponent */
/* loaded from: classes7.dex */
public interface OneOnlineRegisterComponent extends AbstractActivityComponent<OneOnlineRegistrationActivity> {
    void inject(@NotNull OneBusinessTypeDialog oneBusinessTypeDialog);

    void inject(@NotNull OneOnlineRegisterAddressDialog oneOnlineRegisterAddressDialog);

    void inject(@NotNull OneOnlineBankAccountCameraFragment oneOnlineBankAccountCameraFragment);

    void inject(@NotNull OneOnlinePreviewBankAccountPhotoFragment oneOnlinePreviewBankAccountPhotoFragment);

    void inject(@NotNull OneOnlineRegistrationChooseAddressFragment oneOnlineRegistrationChooseAddressFragment);

    void inject(@NotNull OneOnlineRegistrationCommissionInfoFragment oneOnlineRegistrationCommissionInfoFragment);

    void inject(@NotNull OneOnlineRegistrationConsentFragment oneOnlineRegistrationConsentFragment);

    void inject(@NotNull OneOnlineRegistrationFragment oneOnlineRegistrationFragment);

    void inject(@NotNull OneOnlineRegistrationIDCameraFragment oneOnlineRegistrationIDCameraFragment);

    void inject(@NotNull OneOnlineRegistrationInputNumberFragment oneOnlineRegistrationInputNumberFragment);

    void inject(@NotNull OneOnlineRegistrationOptionalImageListFragment oneOnlineRegistrationOptionalImageListFragment);

    void inject(@NotNull OneOnlineRegistrationPersonalInfoFragment oneOnlineRegistrationPersonalInfoFragment);

    void inject(@NotNull OneOnlineRegistrationPreviewImageFragment oneOnlineRegistrationPreviewImageFragment);

    void inject(@NotNull OneOnlineRegistrationPreviewOptionalImageFragment oneOnlineRegistrationPreviewOptionalImageFragment);

    void inject(@NotNull OneOnlineRegistrationRetailerInfoFragment oneOnlineRegistrationRetailerInfoFragment);

    void inject(@NotNull OneOnlineRegistrationSetNewPasswordFragment oneOnlineRegistrationSetNewPasswordFragment);

    void inject(@NotNull OneOnlineRegistrationSuccessFragment oneOnlineRegistrationSuccessFragment);

    void inject(@NotNull OneOnlineRegistrationSummaryFragment oneOnlineRegistrationSummaryFragment);

    void inject(@NotNull OneOnlineRegistrationVerifyOTPFragment oneOnlineRegistrationVerifyOTPFragment);
}
