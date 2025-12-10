package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolConsent;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.presenter.buy_dol.BuyDolConsentPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consentList", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolConsentPresenter$getBuyDOLConsent$2 */
/* loaded from: classes8.dex */
public final class BuyDolConsentPresenter$getBuyDOLConsent$2 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ BuyDolConsentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolConsentPresenter$getBuyDOLConsent$2(BuyDolConsentPresenter buyDolConsentPresenter) {
        super(1);
        this.this$0 = buyDolConsentPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsentNonTelcoResponse consentNonTelcoResponse) {
        BuyDolConsentPresenter.View view;
        BuyDolConsentPresenter.View view2;
        List<ConsentNonTelco> consent;
        List<ConsentNonTelco> consent2 = consentNonTelcoResponse.getConsent();
        ConsentNonTelco consentNonTelco = ((consent2 != null ? consent2.size() : 0) <= 0 || (consent = consentNonTelcoResponse.getConsent()) == null) ? null : consent.get(0);
        if ((consentNonTelco != null ? consentNonTelco.getConsent() : null) != null) {
            view2 = this.this$0.f85418f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view2 = null;
            }
            BuyDolConsentPresenter.View.DefaultImpls.onDisplayConsent$default(view2, new BuyDolConsent(consentNonTelco.getMrtrConsentId(), consentNonTelco.getConsent()), null, 2, null);
            return;
        }
        view = this.this$0.f85418f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        BuyDolConsentPresenter.View.DefaultImpls.onGoToNextPage$default(view, null, 1, null);
    }
}