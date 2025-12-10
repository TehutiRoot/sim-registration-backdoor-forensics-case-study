package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter.OnePrepaidCampaignAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/adapter/OnePrepaidCampaignAdapter;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnePrepaidCampaignListFragment$adapterCampaign$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidCampaignListFragment$adapterCampaign$2 extends Lambda implements Function0<OnePrepaidCampaignAdapter> {
    final /* synthetic */ OnePrepaidCampaignListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidCampaignListFragment$adapterCampaign$2(OnePrepaidCampaignListFragment onePrepaidCampaignListFragment) {
        super(0);
        this.this$0 = onePrepaidCampaignListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final OnePrepaidCampaignAdapter invoke() {
        OnePrepaidViewModel m10747o;
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        m10747o = this.this$0.m10747o();
        List<CampaignItem> campaignList = m10747o.getCampaignList();
        Intrinsics.checkNotNull(campaignList, "null cannot be cast to non-null type kotlin.collections.List<th.co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem>");
        return new OnePrepaidCampaignAdapter(requireContext, campaignList, this.this$0);
    }
}