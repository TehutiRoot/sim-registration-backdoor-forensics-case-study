package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidCampaignListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidPreviewOptionalImageForSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidPreviewOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidSuccessFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OneScanBarcodeSimFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTMNFragment;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OnePrepaidRegistrationComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/activity/OnePrepaidRegistrationActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnePrepaidCampaignListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnePrepaidPreviewOptionalImageForSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnePrepaidPreviewOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnePrepaidSuccessFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OnePrepaidSummaryFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/OneScanBarcodeSimFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/common/OnePrepaidNavigateToCommonFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/consent/OnePrepaidNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/consent/OnePrepaidTMNFragment;", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/fragment/consent/OnePrepaidTelcoFragment;", "slideImageFragment", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OnePrepaidRegistrationComponent */
/* loaded from: classes7.dex */
public interface OnePrepaidRegistrationComponent extends AbstractActivityComponent<OnePrepaidRegistrationActivity> {
    void inject(@NotNull OnePrepaidCampaignListFragment onePrepaidCampaignListFragment);

    void inject(@NotNull OnePrepaidPreviewOptionalImageForSummaryFragment onePrepaidPreviewOptionalImageForSummaryFragment);

    void inject(@NotNull OnePrepaidPreviewOptionalImageFragment onePrepaidPreviewOptionalImageFragment);

    void inject(@NotNull OnePrepaidSuccessFragment onePrepaidSuccessFragment);

    void inject(@NotNull OnePrepaidSummaryFragment onePrepaidSummaryFragment);

    void inject(@NotNull OneScanBarcodeSimFragment oneScanBarcodeSimFragment);

    void inject(@NotNull OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment);

    void inject(@NotNull OnePrepaidNonTelcoFragment onePrepaidNonTelcoFragment);

    void inject(@NotNull OnePrepaidTMNFragment onePrepaidTMNFragment);

    void inject(@NotNull OnePrepaidTelcoFragment onePrepaidTelcoFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);
}
