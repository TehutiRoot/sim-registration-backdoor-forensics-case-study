package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidTelcoFragment$initView$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidTelcoFragment$initView$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidTelcoFragment$initView$3(OnePrepaidTelcoFragment onePrepaidTelcoFragment) {
        super(0);
        this.this$0 = onePrepaidTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePrepaidViewModel m10618p;
        String mrtrConsentId;
        m10618p = this.this$0.m10618p();
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel = this.this$0.f95826j;
        Integer num = null;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            oneConsentNonTelcoViewModel = null;
        }
        ConsentNonTelco value = oneConsentNonTelcoViewModel.getConsentNonTelco().getValue();
        if (value != null && (mrtrConsentId = value.getMrtrConsentId()) != null) {
            num = Integer.valueOf(Integer.parseInt(mrtrConsentId));
        }
        m10618p.acceptConsent(num);
    }
}