package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.campaign.CampaignActivity;
import th.p047co.dtac.android.dtacone.view.fragment.PreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignDetailImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignDetailPointHistoryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignDetailRewardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignDetailWebViewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignHappyPointDetailFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.detail.CampaignOptInDetailFragment;
import th.p047co.dtac.android.dtacone.view.fragment.campaign.list.CampaignListFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/CampaignComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/campaign/CampaignActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/PreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignDetailImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignDetailPointHistoryFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignDetailRewardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignDetailWebViewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignHappyPointDetailFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/detail/CampaignOptInDetailFragment;", "Lth/co/dtac/android/dtacone/view/fragment/campaign/list/CampaignListFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.CampaignComponent */
/* loaded from: classes7.dex */
public interface CampaignComponent extends AbstractActivityComponent<CampaignActivity> {
    void inject(@NotNull PreviewImageFragment previewImageFragment);

    void inject(@NotNull CampaignDetailImageFragment campaignDetailImageFragment);

    void inject(@NotNull CampaignDetailPointHistoryFragment campaignDetailPointHistoryFragment);

    void inject(@NotNull CampaignDetailRewardFragment campaignDetailRewardFragment);

    void inject(@NotNull CampaignDetailWebViewFragment campaignDetailWebViewFragment);

    void inject(@NotNull CampaignHappyPointDetailFragment campaignHappyPointDetailFragment);

    void inject(@NotNull CampaignOptInDetailFragment campaignOptInDetailFragment);

    void inject(@NotNull CampaignListFragment campaignListFragment);
}
