package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.activity.OneRetailerProfileUpdateActivity;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneAddressDialogFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileAddressInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileContactInfoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileCustomCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfilePreviewCustomCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileUpdateFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneRetailerProfileUpdateComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/activity/OneRetailerProfileUpdateActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneAddressDialogFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfileAddressInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfileContactInfoFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfileCustomCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfilePreviewCustomCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfileUpdateFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneRetailerProfileUpdateComponent */
/* loaded from: classes7.dex */
public interface OneRetailerProfileUpdateComponent extends AbstractActivityComponent<OneRetailerProfileUpdateActivity> {
    void inject(@NotNull OneAddressDialogFragment oneAddressDialogFragment);

    void inject(@NotNull OneRetailerProfileAddressInfoFragment oneRetailerProfileAddressInfoFragment);

    void inject(@NotNull OneRetailerProfileContactInfoFragment oneRetailerProfileContactInfoFragment);

    void inject(@NotNull OneRetailerProfileCustomCameraFragment oneRetailerProfileCustomCameraFragment);

    void inject(@NotNull OneRetailerProfilePreviewCustomCameraFragment oneRetailerProfilePreviewCustomCameraFragment);

    void inject(@NotNull OneRetailerProfileUpdateFragment oneRetailerProfileUpdateFragment);
}
