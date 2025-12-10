package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueBlackListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueInputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueInputSubscriberNumberFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueModelPackageInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTruePreviewReferenceDocFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueProtectFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueReviewAdditionalImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectCampaignFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectMaterialFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSignatureFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueTakeReferenceDocFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueVerifyCampaignFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueWithContractFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.common.OneDeviceSaleNavigateToCommonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneDeviceSalesComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/activity/OneDeviceSaleTrueActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePhoneListDialog;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueAdditionalAdvanceFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueBlackListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueInputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueInputSubscriberNumberFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueModelPackageInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTruePreviewReferenceDocFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueProtectFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueReviewAdditionalImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueSelectCampaignFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueSelectMaterialFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueSelectPackageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueSignatureFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueTakeReferenceDocFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueVerifyCampaignFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/OneDeviceSaleTrueWithContractFragment;", "Lth/co/dtac/android/dtacone/view/appOne/deviceSaleTrueCompany/fragment/common/OneDeviceSaleNavigateToCommonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneDeviceSalesComponent */
/* loaded from: classes7.dex */
public interface OneDeviceSalesComponent extends AbstractActivityComponent<OneDeviceSaleTrueActivity> {
    void inject(@NotNull OnePhoneListDialog onePhoneListDialog);

    void inject(@NotNull OneDeviceSaleTrueAdditionalAdvanceFragment oneDeviceSaleTrueAdditionalAdvanceFragment);

    void inject(@NotNull OneDeviceSaleTrueBlackListFragment oneDeviceSaleTrueBlackListFragment);

    void inject(@NotNull OneDeviceSaleTrueInputIMEIFragment oneDeviceSaleTrueInputIMEIFragment);

    void inject(@NotNull OneDeviceSaleTrueInputSubscriberNumberFragment oneDeviceSaleTrueInputSubscriberNumberFragment);

    void inject(@NotNull OneDeviceSaleTrueModelPackageInfoFragment oneDeviceSaleTrueModelPackageInfoFragment);

    void inject(@NotNull OneDeviceSaleTruePreviewReferenceDocFragment oneDeviceSaleTruePreviewReferenceDocFragment);

    void inject(@NotNull OneDeviceSaleTrueProtectFragment oneDeviceSaleTrueProtectFragment);

    void inject(@NotNull OneDeviceSaleTrueReviewAdditionalImageFragment oneDeviceSaleTrueReviewAdditionalImageFragment);

    void inject(@NotNull OneDeviceSaleTrueScanIMEIFragment oneDeviceSaleTrueScanIMEIFragment);

    void inject(@NotNull OneDeviceSaleTrueSelectCampaignFragment oneDeviceSaleTrueSelectCampaignFragment);

    void inject(@NotNull OneDeviceSaleTrueSelectMaterialFragment oneDeviceSaleTrueSelectMaterialFragment);

    void inject(@NotNull OneDeviceSaleTrueSelectPackageFragment oneDeviceSaleTrueSelectPackageFragment);

    void inject(@NotNull OneDeviceSaleTrueSignatureFragment oneDeviceSaleTrueSignatureFragment);

    void inject(@NotNull OneDeviceSaleTrueSuccessFragment oneDeviceSaleTrueSuccessFragment);

    void inject(@NotNull OneDeviceSaleTrueTakeReferenceDocFragment oneDeviceSaleTrueTakeReferenceDocFragment);

    void inject(@NotNull OneDeviceSaleTrueVerifyCampaignFragment oneDeviceSaleTrueVerifyCampaignFragment);

    void inject(@NotNull OneDeviceSaleTrueWithContractFragment oneDeviceSaleTrueWithContractFragment);

    void inject(@NotNull OneDeviceSaleNavigateToCommonFragment oneDeviceSaleNavigateToCommonFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);
}
