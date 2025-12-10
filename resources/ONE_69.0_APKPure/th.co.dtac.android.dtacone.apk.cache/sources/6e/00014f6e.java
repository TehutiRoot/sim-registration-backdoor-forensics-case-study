package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.consent_non_telco.MrtrPostpaidConsentTelcoFragment$initView$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidConsentTelcoFragment$initView$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPostpaidConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidConsentTelcoFragment$initView$3(MrtrPostpaidConsentTelcoFragment mrtrPostpaidConsentTelcoFragment) {
        super(0);
        this.this$0 = mrtrPostpaidConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MrtrPostpaidRegistrationActivity m5898p;
        m5898p = this.this$0.m5898p();
        MrtrPostpaidConsentNonTelcoFragment.Companion companion = MrtrPostpaidConsentNonTelcoFragment.Companion;
        ConsentNonTelcoViewModel consentNonTelcoViewModel = this.this$0.f102354i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        ConsentNonTelco value = consentNonTelcoViewModel.getConsentNonTelco().getValue();
        m5898p.addFragment(companion.newInstant((value == null || (r2 = value.getMrtrConsentId()) == null) ? "" : ""), null);
    }
}