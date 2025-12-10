package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneConsentNonTelcoBinding;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidNonTelcoFragment$initView$1$4 */
/* loaded from: classes10.dex */
public final class OnePrepaidNonTelcoFragment$initView$1$4 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ FragmentOneConsentNonTelcoBinding $this_apply;
    final /* synthetic */ OnePrepaidNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidNonTelcoFragment$initView$1$4(OnePrepaidNonTelcoFragment onePrepaidNonTelcoFragment, FragmentOneConsentNonTelcoBinding fragmentOneConsentNonTelcoBinding) {
        super(1);
        this.this$0 = onePrepaidNonTelcoFragment;
        this.$this_apply = fragmentOneConsentNonTelcoBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentNonTelco) {
        OnePrepaidViewModel m10641q;
        Intrinsics.checkNotNullParameter(consentNonTelco, "consentNonTelco");
        List<ConsentNonTelco> consent = consentNonTelco.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        m10641q = this.this$0.m10641q();
        m10641q.setConsentVersionLabel(consent.get(0).getConsentVersionLabel());
        this.$this_apply.nontelcoTitle.setText(consent.get(0).getConsentTitle());
        this.$this_apply.nontelcoDetail.setText(consent.get(0).getConsent());
        this.$this_apply.btnAllow.setText(consent.get(0).getConsentAgree());
        this.$this_apply.btnNotAllow.setText(consent.get(0).getConsentDecline());
        this.this$0.m10644n(consent);
    }
}