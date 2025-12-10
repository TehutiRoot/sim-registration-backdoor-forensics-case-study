package th.p047co.dtac.android.dtacone.presenter.campaign.detail;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.HistoryResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/HistoryResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.detail.CampaignDetailPresenter$getCampaignDetail$2 */
/* loaded from: classes8.dex */
public final class CampaignDetailPresenter$getCampaignDetail$2 extends Lambda implements Function1<Throwable, HistoryResponse> {
    public static final CampaignDetailPresenter$getCampaignDetail$2 INSTANCE = new CampaignDetailPresenter$getCampaignDetail$2();

    public CampaignDetailPresenter$getCampaignDetail$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final HistoryResponse invoke(@NotNull Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new HistoryResponse(Boolean.TRUE, CollectionsKt__CollectionsKt.emptyList());
    }
}