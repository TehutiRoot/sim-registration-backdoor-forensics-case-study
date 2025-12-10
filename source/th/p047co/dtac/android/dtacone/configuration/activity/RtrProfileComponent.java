package th.p047co.dtac.android.dtacone.configuration.activity;

import androidx.navigation.compose.DialogNavigator;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.self_update.RtrProfileActivity;
import th.p047co.dtac.android.dtacone.view.fragment.self_update.RtrProfileViewerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.self_update.UpdateRtrAddressFragment;
import th.p047co.dtac.android.dtacone.view.fragment.self_update.UpdateRtrProfileFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH&¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/RtrProfileComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/self_update/RtrProfileActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/self_update/RtrProfileViewerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/self_update/UpdateRtrAddressFragment;", "Lth/co/dtac/android/dtacone/view/fragment/self_update/UpdateRtrProfileFragment;", DialogNavigator.NAME, "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.RtrProfileComponent */
/* loaded from: classes7.dex */
public interface RtrProfileComponent extends AbstractActivityComponent<RtrProfileActivity> {
    void inject(@NotNull RtrProfileViewerFragment rtrProfileViewerFragment);

    void inject(@NotNull UpdateRtrAddressFragment updateRtrAddressFragment);

    void inject(@NotNull UpdateRtrProfileFragment updateRtrProfileFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
