package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.dtacAtHome.DtacAtHomeActivity;
import th.p047co.dtac.android.dtacone.view.fragment.dtacAtHome.DtacAtHomeCheckMapFragment;
import th.p047co.dtac.android.dtacone.view.fragment.dtacAtHome.DtacAtHomeRequestOtpFragment;
import th.p047co.dtac.android.dtacone.view.fragment.dtacAtHome.DtacAtHomeVerifyOtpFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&¨\u0006\t"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/DtacAtHomeComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/dtacAtHome/DtacAtHomeActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/dtacAtHome/DtacAtHomeCheckMapFragment;", "Lth/co/dtac/android/dtacone/view/fragment/dtacAtHome/DtacAtHomeRequestOtpFragment;", "Lth/co/dtac/android/dtacone/view/fragment/dtacAtHome/DtacAtHomeVerifyOtpFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.DtacAtHomeComponent */
/* loaded from: classes7.dex */
public interface DtacAtHomeComponent extends AbstractActivityComponent<DtacAtHomeActivity> {
    void inject(@NotNull DtacAtHomeCheckMapFragment dtacAtHomeCheckMapFragment);

    void inject(@NotNull DtacAtHomeRequestOtpFragment dtacAtHomeRequestOtpFragment);

    void inject(@NotNull DtacAtHomeVerifyOtpFragment dtacAtHomeVerifyOtpFragment);
}
