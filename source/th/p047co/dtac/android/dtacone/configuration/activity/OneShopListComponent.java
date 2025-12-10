package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.activity.OneShopListActivity;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneShopListFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneShopListComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/activity/OneShopListActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/fragment/OneShopListFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneShopListComponent */
/* loaded from: classes7.dex */
public interface OneShopListComponent extends AbstractActivityComponent<OneShopListActivity> {
    void inject(@NotNull OneShopListFragment oneShopListFragment);
}
