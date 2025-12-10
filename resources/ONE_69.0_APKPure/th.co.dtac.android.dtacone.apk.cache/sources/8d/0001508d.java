package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.databinding.FragmentConsentTelcoBinding;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentTelcoFragment$initView$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostConsentTelcoFragment$initView$1 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ MrtrPre2PostConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostConsentTelcoFragment$initView$1(MrtrPre2PostConsentTelcoFragment mrtrPre2PostConsentTelcoFragment) {
        super(1);
        this.this$0 = mrtrPre2PostConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentNonTelco) {
        FragmentConsentTelcoBinding m5235o;
        FragmentConsentTelcoBinding m5235o2;
        FragmentConsentTelcoBinding m5235o3;
        ConsentNonTelcoViewModel consentNonTelcoViewModel;
        Intrinsics.checkNotNullParameter(consentNonTelco, "consentNonTelco");
        List<ConsentNonTelco> consent = consentNonTelco.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        m5235o = this.this$0.m5235o();
        m5235o.telcoTitle.setText(consent.get(0).getConsentTitle());
        m5235o2 = this.this$0.m5235o();
        m5235o2.telcoDetail.setText(consent.get(0).getConsent());
        m5235o3 = this.this$0.m5235o();
        m5235o3.btnAllow.setText(consent.get(0).getConsentAgree());
        consentNonTelcoViewModel = this.this$0.f103086i;
        if (consentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            consentNonTelcoViewModel = null;
        }
        consentNonTelcoViewModel.getConsentNonTelco().setValue(consent.get(0));
        this.this$0.m5236n(consent);
    }
}