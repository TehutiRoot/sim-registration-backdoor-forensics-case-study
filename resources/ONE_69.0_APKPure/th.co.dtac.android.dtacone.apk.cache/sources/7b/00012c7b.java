package th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel$getConsentNonTelco$5 */
/* loaded from: classes10.dex */
public final class OneConsentNonTelcoViewModel$getConsentNonTelco$5 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OneConsentNonTelcoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentNonTelcoViewModel$getConsentNonTelco$5(OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel) {
        super(1);
        this.this$0 = oneConsentNonTelcoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsentNonTelcoResponse consentNonTelcoResponse) {
        OneConsentNonTelcoViewModel.View view;
        view = this.this$0.f89637f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
        this.this$0.getConsentNonTelcoResponse().setValue(consentNonTelcoResponse);
        MutableLiveData<ConsentNonTelco> consentNonTelco = this.this$0.getConsentNonTelco();
        List<ConsentNonTelco> consent = consentNonTelcoResponse.getConsent();
        consentNonTelco.setValue(consent != null ? consent.get(0) : null);
    }
}