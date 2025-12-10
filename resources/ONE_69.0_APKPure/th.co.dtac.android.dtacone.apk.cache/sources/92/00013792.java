package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentTelcoFragment$initView$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidConsentTelcoFragment$initView$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidConsentTelcoFragment$initView$3(OnePostpaidConsentTelcoFragment onePostpaidConsentTelcoFragment) {
        super(0);
        this.this$0 = onePostpaidConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePostpaidRegistrationActivity m12303n;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        String mrtrConsentId;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2;
        String mrtrConsentId2;
        m12303n = this.this$0.m12303n();
        Integer num = null;
        if (Intrinsics.areEqual(m12303n.getPfViewModel().getCompany(), "TRUE")) {
            OnePostpaidRegistrationViewModel viewModelRegistration = this.this$0.getViewModelRegistration();
            oneConsentNonTelcoViewModel2 = this.this$0.f93903o;
            if (oneConsentNonTelcoViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                oneConsentNonTelcoViewModel2 = null;
            }
            ConsentNonTelco value = oneConsentNonTelcoViewModel2.getConsentNonTelco().getValue();
            if (value != null && (mrtrConsentId2 = value.getMrtrConsentId()) != null) {
                num = Integer.valueOf(Integer.parseInt(mrtrConsentId2));
            }
            viewModelRegistration.acceptConsentTrue(num);
            return;
        }
        OnePostpaidRegistrationViewModel viewModelRegistration2 = this.this$0.getViewModelRegistration();
        oneConsentNonTelcoViewModel = this.this$0.f93903o;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        ConsentNonTelco value2 = oneConsentNonTelcoViewModel.getConsentNonTelco().getValue();
        if (value2 != null && (mrtrConsentId = value2.getMrtrConsentId()) != null) {
            num = Integer.valueOf(Integer.parseInt(mrtrConsentId));
        }
        viewModelRegistration2.acceptConsent(num);
    }
}