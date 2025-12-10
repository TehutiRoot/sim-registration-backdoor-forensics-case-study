package th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel$getConsentTmn$1 */
/* loaded from: classes10.dex */
public final class OneConsentNonTelcoViewModel$getConsentTmn$1 extends Lambda implements Function1<OneConsentDataTmnResponse, Unit> {
    final /* synthetic */ OneConsentNonTelcoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentNonTelcoViewModel$getConsentTmn$1(OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel) {
        super(1);
        this.this$0 = oneConsentNonTelcoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneConsentDataTmnResponse oneConsentDataTmnResponse) {
        invoke2(oneConsentDataTmnResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneConsentDataTmnResponse oneConsentDataTmnResponse) {
        OneConsentNonTelcoViewModel.View view;
        List<ConsentNonTelco> consent;
        view = this.this$0.f89637f;
        ConsentNonTelco consentNonTelco = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
        this.this$0.getConsentNonTelcoResponse().setValue(oneConsentDataTmnResponse.getData());
        MutableLiveData<ConsentNonTelco> consentNonTelco2 = this.this$0.getConsentNonTelco();
        ConsentNonTelcoResponse data = oneConsentDataTmnResponse.getData();
        if (data != null && (consent = data.getConsent()) != null) {
            consentNonTelco = consent.get(0);
        }
        consentNonTelco2.setValue(consentNonTelco);
    }
}