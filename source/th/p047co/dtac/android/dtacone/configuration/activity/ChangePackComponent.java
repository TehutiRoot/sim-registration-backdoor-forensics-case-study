package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.change_pack.ChangePackActivity;
import th.p047co.dtac.android.dtacone.view.fragment.change_pack.ChangePackIdentityFragment;
import th.p047co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSearchFragment;
import th.p047co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSelectPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSubscriberFragment;
import th.p047co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSuccessFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&¨\u0006\u000b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/ChangePackComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/change_pack/ChangePackActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/change_pack/ChangePackIdentityFragment;", "Lth/co/dtac/android/dtacone/view/fragment/change_pack/ChangePackSearchFragment;", "Lth/co/dtac/android/dtacone/view/fragment/change_pack/ChangePackSelectPackageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/change_pack/ChangePackSubscriberFragment;", "Lth/co/dtac/android/dtacone/view/fragment/change_pack/ChangePackSuccessFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ChangePackComponent */
/* loaded from: classes7.dex */
public interface ChangePackComponent extends AbstractActivityComponent<ChangePackActivity> {
    void inject(@NotNull ChangePackIdentityFragment changePackIdentityFragment);

    void inject(@NotNull ChangePackSearchFragment changePackSearchFragment);

    void inject(@NotNull ChangePackSelectPackageFragment changePackSelectPackageFragment);

    void inject(@NotNull ChangePackSubscriberFragment changePackSubscriberFragment);

    void inject(@NotNull ChangePackSuccessFragment changePackSuccessFragment);
}
