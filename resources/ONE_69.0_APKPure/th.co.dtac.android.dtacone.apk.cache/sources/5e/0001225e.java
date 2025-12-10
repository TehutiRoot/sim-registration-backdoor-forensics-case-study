package th.p047co.dtac.android.dtacone.presenter.campaign.count;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.campaign.count.Campaign;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Mission;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nCampaignCountPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignCountPresenter.kt\nth/co/dtac/android/dtacone/presenter/campaign/count/CampaignCountPresenter$getCampaignCount$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.count.CampaignCountPresenter$getCampaignCount$1 */
/* loaded from: classes8.dex */
public final class CampaignCountPresenter$getCampaignCount$1 extends Lambda implements Function1<CampaignCountResponse, ObservableSource<? extends CampaignCountResponse>> {
    final /* synthetic */ CampaignCountPresenter this$0;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.campaign.count.CampaignCountPresenter$getCampaignCount$1$2 */
    /* loaded from: classes8.dex */
    public static final class C142792 extends Lambda implements Function1<Unit, CampaignCountResponse> {
        final /* synthetic */ CampaignCountResponse $response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142792(CampaignCountResponse campaignCountResponse) {
            super(1);
            this.$response = campaignCountResponse;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CampaignCountResponse invoke(@NotNull Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$response;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignCountPresenter$getCampaignCount$1(CampaignCountPresenter campaignCountPresenter) {
        super(1);
        this.this$0 = campaignCountPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(CampaignCountResponse response, CampaignCountPresenter this$0) {
        Integer newMissionCount;
        Integer newCampaignCount;
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Integer totalNew = response.getTotalNew();
        if (totalNew != null) {
            this$0.getPref().setInt(Constant.PREF_TOTAL_NEW, totalNew.intValue());
        }
        Campaign campaign = response.getCampaign();
        if (campaign != null && (newCampaignCount = campaign.getNewCampaignCount()) != null) {
            this$0.getPref().setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, newCampaignCount.intValue());
        }
        Mission mission = response.getMission();
        if (mission != null && (newMissionCount = mission.getNewMissionCount()) != null) {
            this$0.getPref().setInt(Constant.PREF_NEW_MISSION_COUNT, newMissionCount.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CampaignCountResponse invoke$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CampaignCountResponse) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends CampaignCountResponse> invoke(@NotNull final CampaignCountResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        final CampaignCountPresenter campaignCountPresenter = this.this$0;
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.campaign.count.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit invoke$lambda$3;
                invoke$lambda$3 = CampaignCountPresenter$getCampaignCount$1.invoke$lambda$3(CampaignCountResponse.this, campaignCountPresenter);
                return invoke$lambda$3;
            }
        });
        final C142792 c142792 = new C142792(response);
        return fromCallable.map(new Function() { // from class: th.co.dtac.android.dtacone.presenter.campaign.count.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CampaignCountResponse invoke$lambda$4;
                invoke$lambda$4 = CampaignCountPresenter$getCampaignCount$1.invoke$lambda$4(Function1.this, obj);
                return invoke$lambda$4;
            }
        });
    }
}