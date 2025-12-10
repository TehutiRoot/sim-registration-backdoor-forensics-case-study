package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.rectify.RectifyActivity;
import th.p047co.dtac.android.dtacone.view.fragment.rectify.RectifyConfirmFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rectify.RectifyDetailSearchFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rectify.RectifyListFragment;
import th.p047co.dtac.android.dtacone.view.fragment.rectify.RectifyStvConfirmFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/RectifyComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/rectify/RectifyActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/rectify/RectifyConfirmFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rectify/RectifyDetailSearchFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rectify/RectifyListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/rectify/RectifyStvConfirmFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.RectifyComponent */
/* loaded from: classes7.dex */
public interface RectifyComponent extends AbstractActivityComponent<RectifyActivity> {
    void inject(@NotNull RectifyConfirmFragment rectifyConfirmFragment);

    void inject(@NotNull RectifyDetailSearchFragment rectifyDetailSearchFragment);

    void inject(@NotNull RectifyListFragment rectifyListFragment);

    void inject(@NotNull RectifyStvConfirmFragment rectifyStvConfirmFragment);
}
