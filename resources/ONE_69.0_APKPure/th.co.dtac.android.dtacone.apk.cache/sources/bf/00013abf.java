package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentDomain", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment$setupObserve$2$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostConsentNonTelcoFragment$setupObserve$2$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OnePre2PostConsentNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostConsentNonTelcoFragment$setupObserve$2$1(OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment) {
        super(1);
        this.this$0 = onePre2PostConsentNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String consentDomain) {
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        OnePre2PostViewModel m11142p;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2;
        Intrinsics.checkNotNullParameter(consentDomain, "consentDomain");
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel3 = null;
        if (this.this$0.getPfViewModel().isCompanyTrue()) {
            oneConsentNonTelcoViewModel2 = this.this$0.f95169i;
            if (oneConsentNonTelcoViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oneConsentNonTelcoViewModel");
            } else {
                oneConsentNonTelcoViewModel3 = oneConsentNonTelcoViewModel2;
            }
            oneConsentNonTelcoViewModel3.getConsentNonTelco(consentDomain);
            return;
        }
        oneConsentNonTelcoViewModel = this.this$0.f95169i;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneConsentNonTelcoViewModel");
        } else {
            oneConsentNonTelcoViewModel3 = oneConsentNonTelcoViewModel;
        }
        m11142p = this.this$0.m11142p();
        oneConsentNonTelcoViewModel3.getConsentNonTelco(consentDomain, m11142p.getOneModel().getConsentType());
    }
}