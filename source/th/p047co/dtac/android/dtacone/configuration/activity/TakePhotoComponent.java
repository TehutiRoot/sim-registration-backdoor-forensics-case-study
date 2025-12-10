package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.take_photo.TakePhotoActivity;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.CameraViewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.PreviewPhotoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.QrFragment;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.TakePhotoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.TakePhotoSuccessFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&¨\u0006\u000b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/TakePhotoComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/take_photo/TakePhotoActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/CameraViewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/PreviewPhotoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/QrFragment;", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/TakePhotoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/TakePhotoSuccessFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.TakePhotoComponent */
/* loaded from: classes7.dex */
public interface TakePhotoComponent extends AbstractActivityComponent<TakePhotoActivity> {
    void inject(@NotNull CameraViewFragment cameraViewFragment);

    void inject(@NotNull PreviewPhotoFragment previewPhotoFragment);

    void inject(@NotNull QrFragment qrFragment);

    void inject(@NotNull TakePhotoFragment takePhotoFragment);

    void inject(@NotNull TakePhotoSuccessFragment takePhotoSuccessFragment);
}
