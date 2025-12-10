package th.p047co.dtac.android.dtacone.presenter.change_sim;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.reason.response.MrtrChangeSimReasonResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.presenter.change_sim.ChangeSimReasonPresenter;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimReasonPresenter$getMrtrReasonChangeSim$2 */
/* loaded from: classes8.dex */
public final class ChangeSimReasonPresenter$getMrtrReasonChangeSim$2 extends Lambda implements Function1<MrtrChangeSimReasonResponse, Unit> {
    final /* synthetic */ GetAuthorizationByRtrResponse $response;
    final /* synthetic */ ChangeSimReasonPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSimReasonPresenter$getMrtrReasonChangeSim$2(ChangeSimReasonPresenter changeSimReasonPresenter, GetAuthorizationByRtrResponse getAuthorizationByRtrResponse) {
        super(1);
        this.this$0 = changeSimReasonPresenter;
        this.$response = getAuthorizationByRtrResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse) {
        invoke2(mrtrChangeSimReasonResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrChangeSimReasonResponse it) {
        PreferencesRepository preferencesRepository;
        ConfigurationRepository configurationRepository;
        PreferencesRepository preferencesRepository2;
        ConfigurationRepository configurationRepository2;
        ChangeSimReasonPresenter.View view;
        preferencesRepository = this.this$0.f85662d;
        configurationRepository = this.this$0.f85663e;
        preferencesRepository.setInt(Constant.FACE_DETECTION_CUSTOMER_COUNTER, configurationRepository.getPrepaidReregistFaceDetectionAttemptMax());
        preferencesRepository2 = this.this$0.f85662d;
        configurationRepository2 = this.this$0.f85663e;
        preferencesRepository2.setInt(Constant.FACE_DETECTION_ID_CARD_COUNTER, configurationRepository2.getPrepaidReregistFaceDetectionAttemptMax());
        view = this.this$0.f85666h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.redirectToMrtrChangeSim(it, this.$response);
    }
}