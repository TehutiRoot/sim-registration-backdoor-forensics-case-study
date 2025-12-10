package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.withDevice.WithDeviceActivity;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.InputIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.ScanIMEIFragment;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.WithDeviceCampaignDetailConfirmFragment;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.WithDeviceConfirmFragment;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.WithDeviceInputUssdFragment;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.WithDeviceSelectCampaignFragment;
import th.p047co.dtac.android.dtacone.view.fragment.withDevice.WithDeviceSuccessFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/WithDeviceComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/withDevice/WithDeviceActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/InputIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/ScanIMEIFragment;", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/WithDeviceCampaignDetailConfirmFragment;", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/WithDeviceConfirmFragment;", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/WithDeviceInputUssdFragment;", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/WithDeviceSelectCampaignFragment;", "Fragment", "Lth/co/dtac/android/dtacone/view/fragment/withDevice/WithDeviceSuccessFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.WithDeviceComponent */
/* loaded from: classes7.dex */
public interface WithDeviceComponent extends AbstractActivityComponent<WithDeviceActivity> {
    void inject(@NotNull InputIMEIFragment inputIMEIFragment);

    void inject(@NotNull ScanIMEIFragment scanIMEIFragment);

    void inject(@NotNull WithDeviceCampaignDetailConfirmFragment withDeviceCampaignDetailConfirmFragment);

    void inject(@NotNull WithDeviceConfirmFragment withDeviceConfirmFragment);

    void inject(@NotNull WithDeviceInputUssdFragment withDeviceInputUssdFragment);

    void inject(@NotNull WithDeviceSelectCampaignFragment withDeviceSelectCampaignFragment);

    void inject(@NotNull WithDeviceSuccessFragment withDeviceSuccessFragment);
}
