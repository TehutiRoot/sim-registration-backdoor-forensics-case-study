package th.p047co.dtac.android.dtacone.presenter.campaign.history;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.CampaignDetailHistoryItem;
import th.p047co.dtac.android.dtacone.presenter.campaign.history.CampaignDetailHistoryPresenter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.history.CampaignDetailHistoryPresenter$getCampaignDetailHistory$2 */
/* loaded from: classes8.dex */
public final class CampaignDetailHistoryPresenter$getCampaignDetailHistory$2 extends Lambda implements Function1<List<? extends CampaignDetailHistoryItem>, Unit> {
    final /* synthetic */ CampaignDetailHistoryPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignDetailHistoryPresenter$getCampaignDetailHistory$2(CampaignDetailHistoryPresenter campaignDetailHistoryPresenter) {
        super(1);
        this.this$0 = campaignDetailHistoryPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CampaignDetailHistoryItem> list) {
        invoke2((List<CampaignDetailHistoryItem>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CampaignDetailHistoryItem> it) {
        CampaignDetailHistoryPresenter.View view;
        view = this.this$0.f85549d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onGetCampaignDetailHistorySuccess(it);
    }
}