package th.p047co.dtac.android.dtacone.presenter.self_update;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.presenter.self_update.SelfUpdateConsentPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.SelfUpdateConsentPresenter$acceptConsent$2 */
/* loaded from: classes8.dex */
public final class SelfUpdateConsentPresenter$acceptConsent$2 extends Lambda implements Function1<StatusResponse, Unit> {
    final /* synthetic */ int $requestId;
    final /* synthetic */ SelfUpdateConsentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfUpdateConsentPresenter$acceptConsent$2(SelfUpdateConsentPresenter selfUpdateConsentPresenter, int i) {
        super(1);
        this.this$0 = selfUpdateConsentPresenter;
        this.$requestId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StatusResponse statusResponse) {
        invoke2(statusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StatusResponse statusResponse) {
        SelfUpdateConsentPresenter.View view;
        view = this.this$0.f86416e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onAcceptConsentSuccess(this.$requestId);
    }
}