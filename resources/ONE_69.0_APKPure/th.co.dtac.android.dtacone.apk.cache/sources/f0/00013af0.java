package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentTelcoFragment$setupView$1$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostConsentTelcoFragment$setupView$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePre2PostConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostConsentTelcoFragment$setupView$1$1(OnePre2PostConsentTelcoFragment onePre2PostConsentTelcoFragment) {
        super(0);
        this.this$0 = onePre2PostConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePre2PostViewModel m11119o;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        String mrtrConsentId;
        m11119o = this.this$0.m11119o();
        oneConsentNonTelcoViewModel = this.this$0.f95215i;
        Integer num = null;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneConsentNonTelcoViewModel");
            oneConsentNonTelcoViewModel = null;
        }
        ConsentNonTelco value = oneConsentNonTelcoViewModel.getConsentNonTelco().getValue();
        if (value != null && (mrtrConsentId = value.getMrtrConsentId()) != null) {
            num = Integer.valueOf(Integer.parseInt(mrtrConsentId));
        }
        m11119o.acceptConsentTelco(num);
    }
}