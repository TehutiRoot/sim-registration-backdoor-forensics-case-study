package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.activity.OneCampaignActivity;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.OneCampaignListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.OneCampaignOptInDetailFragment;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.OnePreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.OnePreviewTrueImageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.OneTrueCampaignListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.register.OneCampaignDetailRegisterFragment;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.fragment.reward.OneCampaignDetailRewardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignDetailWebViewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignHappyPointDetailFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/OneCampaignComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/activity/OneCampaignActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/OneCampaignListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/OneCampaignOptInDetailFragment;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/OnePreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/OnePreviewTrueImageFragment;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/OneTrueCampaignListFragment;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/register/OneCampaignDetailRegisterFragment;", "Lth/co/dtac/android/dtacone/view/appOne/campaign/fragment/reward/OneCampaignDetailRewardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignDetailWebViewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignHappyPointDetailFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.OneCampaignComponent */
/* loaded from: classes7.dex */
public interface OneCampaignComponent extends AbstractActivityComponent<OneCampaignActivity> {
    void inject(@NotNull OneCampaignListFragment oneCampaignListFragment);

    void inject(@NotNull OneCampaignOptInDetailFragment oneCampaignOptInDetailFragment);

    void inject(@NotNull OnePreviewImageFragment onePreviewImageFragment);

    void inject(@NotNull OnePreviewTrueImageFragment onePreviewTrueImageFragment);

    void inject(@NotNull OneTrueCampaignListFragment oneTrueCampaignListFragment);

    void inject(@NotNull OneCampaignDetailRegisterFragment oneCampaignDetailRegisterFragment);

    void inject(@NotNull OneCampaignDetailRewardFragment oneCampaignDetailRewardFragment);

    void inject(@NotNull CampaignDetailWebViewFragment campaignDetailWebViewFragment);

    void inject(@NotNull CampaignHappyPointDetailFragment campaignHappyPointDetailFragment);
}
