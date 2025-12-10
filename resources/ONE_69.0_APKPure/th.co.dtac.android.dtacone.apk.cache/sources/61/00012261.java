package th.p047co.dtac.android.dtacone.presenter.campaign.count;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.presenter.campaign.count.CampaignCountPresenter;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.campaign.count.CampaignCountPresenter$getCampaignCount$4 */
/* loaded from: classes8.dex */
public final class CampaignCountPresenter$getCampaignCount$4 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CampaignCountPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignCountPresenter$getCampaignCount$4(CampaignCountPresenter campaignCountPresenter) {
        super(1);
        this.this$0 = campaignCountPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ServerErrorService errorService = this.this$0.getErrorService();
        final CampaignCountPresenter campaignCountPresenter = this.this$0;
        errorService.handleException(th2, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.campaign.count.CampaignCountPresenter$getCampaignCount$4.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                CampaignCountPresenter.View view;
                CampaignCountPresenter.this.getPref().setInt(Constant.PREF_TOTAL_NEW, 0);
                CampaignCountPresenter.this.getPref().setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, 0);
                CampaignCountPresenter.this.getPref().setInt(Constant.PREF_NEW_MISSION_COUNT, 0);
                view = CampaignCountPresenter.this.f85516f;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view = null;
                }
                String errorMessage = CampaignCountPresenter.this.getErrorService().getErrorMessage(th3);
                Intrinsics.checkNotNullExpressionValue(errorMessage, "errorService.getErrorMessage(e)");
                view.onGetCampaignCountFailed(errorMessage);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}