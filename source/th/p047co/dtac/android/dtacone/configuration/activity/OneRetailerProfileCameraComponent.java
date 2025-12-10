package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.activity.OneRetailerProfileCameraActivity;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileCustomCameraFragment;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfilePreviewCustomCameraFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&¨\u0006\b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneRetailerProfileCameraComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/activity/OneRetailerProfileCameraActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfileCustomCameraFragment;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/fragment/OneRetailerProfilePreviewCustomCameraFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneRetailerProfileCameraComponent */
/* loaded from: classes7.dex */
public interface OneRetailerProfileCameraComponent extends AbstractActivityComponent<OneRetailerProfileCameraActivity> {
    void inject(@NotNull OneRetailerProfileCustomCameraFragment oneRetailerProfileCustomCameraFragment);

    void inject(@NotNull OneRetailerProfilePreviewCustomCameraFragment oneRetailerProfilePreviewCustomCameraFragment);
}
