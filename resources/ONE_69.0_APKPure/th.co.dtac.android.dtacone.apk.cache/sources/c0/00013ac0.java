package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment$setupObserve$2$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostConsentNonTelcoFragment$setupObserve$2$2 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OnePre2PostConsentNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostConsentNonTelcoFragment$setupObserve$2$2(OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment) {
        super(1);
        this.this$0 = onePre2PostConsentNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentNonTelco) {
        OnePre2PostViewModel m11142p;
        Intrinsics.checkNotNullParameter(consentNonTelco, "consentNonTelco");
        List<ConsentNonTelco> consent = consentNonTelco.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        m11142p = this.this$0.m11142p();
        m11142p.setConsentNonTelcoListTemp(consent);
        OnePre2PostConsentNonTelcoFragment.m11136v(this.this$0, consent, null, 2, null);
    }
}