package th.p047co.dtac.android.dtacone.presenter.campaign.detail;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.CampaignDetailResponse;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.CampaignDetailHistoryItem;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.HistoryResponse;
import th.p047co.dtac.android.dtacone.presenter.campaign.detail.CampaignDetailPresenter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/CampaignDetailResponse;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/HistoryResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.detail.CampaignDetailPresenter$getCampaignDetail$5 */
/* loaded from: classes8.dex */
public final class CampaignDetailPresenter$getCampaignDetail$5 extends Lambda implements Function1<Pair<? extends CampaignDetailResponse, ? extends HistoryResponse>, Unit> {
    final /* synthetic */ CampaignDetailPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignDetailPresenter$getCampaignDetail$5(CampaignDetailPresenter campaignDetailPresenter) {
        super(1);
        this.this$0 = campaignDetailPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends CampaignDetailResponse, ? extends HistoryResponse> pair) {
        invoke2((Pair<CampaignDetailResponse, HistoryResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<CampaignDetailResponse, HistoryResponse> pair) {
        CampaignDetailPresenter.View view;
        CampaignDetailPresenter.View view2 = null;
        if (Intrinsics.areEqual(pair.getSecond().getError(), Boolean.TRUE)) {
            pair.getFirst().setHistoryList(null);
        } else {
            List<CampaignDetailHistoryItem> historyList = pair.getSecond().getHistoryList();
            if (historyList != null && !historyList.isEmpty()) {
                pair.getFirst().setHistoryList(pair.getSecond().getHistoryList());
            } else {
                pair.getFirst().setHistoryList(CollectionsKt__CollectionsKt.emptyList());
            }
        }
        view = this.this$0.f85530d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view2 = view;
        }
        view2.onGetCampaignDetailSuccess(pair.getFirst());
    }
}