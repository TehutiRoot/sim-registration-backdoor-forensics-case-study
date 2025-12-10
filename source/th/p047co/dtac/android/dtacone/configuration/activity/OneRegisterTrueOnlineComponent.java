package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineDiscountListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlinePeriodListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlinePreviewCustomerImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlinePreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineSmartCardFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneRegisterTrueOnlineComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineDiscountListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineFormFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlinePeriodListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlinePreviewCustomerImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlinePreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineSmartCardFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneRegisterTrueOnlineComponent */
/* loaded from: classes7.dex */
public interface OneRegisterTrueOnlineComponent extends AbstractActivityComponent<OneRegisterTrueOnlineActivity> {
    void inject(@NotNull OneRegisterTrueOnlineCameraFragment oneRegisterTrueOnlineCameraFragment);

    void inject(@NotNull OneRegisterTrueOnlineCustomerCameraFragment oneRegisterTrueOnlineCustomerCameraFragment);

    void inject(@NotNull OneRegisterTrueOnlineDiscountListFragment oneRegisterTrueOnlineDiscountListFragment);

    void inject(@NotNull OneRegisterTrueOnlineFaceRecognitionFragment oneRegisterTrueOnlineFaceRecognitionFragment);

    void inject(@NotNull OneRegisterTrueOnlineFormFragment oneRegisterTrueOnlineFormFragment);

    void inject(@NotNull OneRegisterTrueOnlineOptionalImageFragment oneRegisterTrueOnlineOptionalImageFragment);

    void inject(@NotNull OneRegisterTrueOnlinePeriodListFragment oneRegisterTrueOnlinePeriodListFragment);

    void inject(@NotNull OneRegisterTrueOnlinePreviewCustomerImageFragment oneRegisterTrueOnlinePreviewCustomerImageFragment);

    void inject(@NotNull OneRegisterTrueOnlinePreviewImageFragment oneRegisterTrueOnlinePreviewImageFragment);

    void inject(@NotNull OneRegisterTrueOnlineSmartCardFragment oneRegisterTrueOnlineSmartCardFragment);
}
