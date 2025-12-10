package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.change_sim.ChangeSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.ChangeSimFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.ChangeSimFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.ChangeSimSignatureFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.ChangeSimWriteSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.camera.ChangeSimCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.camera.ChangeSimIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.camera.ChangeSimIdFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.camera.ChangeSimPreviewIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.changesim.smart_card.ChangeSimSmartCardFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/ChangeSimComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/change_sim/ChangeSimActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/changesim/ChangeSimFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/ChangeSimFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/ChangeSimSignatureFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/ChangeSimWriteSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/camera/ChangeSimCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/camera/ChangeSimIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/camera/ChangeSimIdFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/camera/ChangeSimPreviewIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/changesim/smart_card/ChangeSimSmartCardFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ChangeSimComponent */
/* loaded from: classes7.dex */
public interface ChangeSimComponent extends AbstractActivityComponent<ChangeSimActivity> {
    void inject(@NotNull ChangeSimFaceRecognitionFragment changeSimFaceRecognitionFragment);

    void inject(@NotNull ChangeSimFormFragment changeSimFormFragment);

    void inject(@NotNull ChangeSimSignatureFragment changeSimSignatureFragment);

    void inject(@NotNull ChangeSimWriteSimFragment changeSimWriteSimFragment);

    void inject(@NotNull ChangeSimCustomerCameraFragment changeSimCustomerCameraFragment);

    void inject(@NotNull ChangeSimIdCardCameraFragment changeSimIdCardCameraFragment);

    void inject(@NotNull ChangeSimIdFormFragment changeSimIdFormFragment);

    void inject(@NotNull ChangeSimPreviewIdCardFragment changeSimPreviewIdCardFragment);

    void inject(@NotNull ChangeSimSmartCardFragment changeSimSmartCardFragment);
}
