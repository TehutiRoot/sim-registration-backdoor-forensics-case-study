package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.CampaignItem;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter.OnePrepaidCampaignAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.OnCampaignSelectedListener;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.adapter.OnePrepaidCampaignAdapter$CampaignViewHolder$bind$2 */
/* loaded from: classes10.dex */
public final class OnePrepaidCampaignAdapter$CampaignViewHolder$bind$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CampaignItem $campaign;
    final /* synthetic */ Function1<Integer, Unit> $onItemSelected;
    final /* synthetic */ OnePrepaidCampaignAdapter.CampaignViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnePrepaidCampaignAdapter$CampaignViewHolder$bind$2(OnePrepaidCampaignAdapter.CampaignViewHolder campaignViewHolder, CampaignItem campaignItem, Function1<? super Integer, Unit> function1) {
        super(0);
        this.this$0 = campaignViewHolder;
        this.$campaign = campaignItem;
        this.$onItemSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnCampaignSelectedListener onCampaignSelectedListener;
        onCampaignSelectedListener = this.this$0.f95669b;
        onCampaignSelectedListener.setCampaignSelectedListener(this.$campaign);
        Function1<Integer, Unit> function1 = this.$onItemSelected;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.this$0.getAbsoluteAdapterPosition()));
        }
    }
}