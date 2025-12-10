package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.activity.OneOwnerManagementActivity;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementDetailFragment;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.fragment.OneOwnerManagementListFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&¨\u0006\b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneOwnerManagementComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/activity/OneOwnerManagementActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/fragment/OneOwnerManagementDetailFragment;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/fragment/OneOwnerManagementListFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneOwnerManagementComponent */
/* loaded from: classes7.dex */
public interface OneOwnerManagementComponent extends AbstractActivityComponent<OneOwnerManagementActivity> {
    void inject(@NotNull OneOwnerManagementDetailFragment oneOwnerManagementDetailFragment);

    void inject(@NotNull OneOwnerManagementListFragment oneOwnerManagementListFragment);
}
