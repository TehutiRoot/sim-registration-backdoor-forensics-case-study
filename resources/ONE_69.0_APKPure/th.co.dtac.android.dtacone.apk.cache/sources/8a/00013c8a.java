package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.consent.OnePrepaidNonTelcoFragment$initView$1$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidNonTelcoFragment$initView$1$3 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OnePrepaidNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidNonTelcoFragment$initView$1$3(OnePrepaidNonTelcoFragment onePrepaidNonTelcoFragment) {
        super(1);
        this.this$0 = onePrepaidNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        OnePrepaidViewModel m10641q;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2;
        Intrinsics.checkNotNullParameter(it, "it");
        m10641q = this.this$0.m10641q();
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel3 = null;
        if (m10641q.isTrue()) {
            oneConsentNonTelcoViewModel2 = this.this$0.f95785j;
            if (oneConsentNonTelcoViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
            } else {
                oneConsentNonTelcoViewModel3 = oneConsentNonTelcoViewModel2;
            }
            oneConsentNonTelcoViewModel3.getConsentTmn(it);
            return;
        }
        oneConsentNonTelcoViewModel = this.this$0.f95785j;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
        } else {
            oneConsentNonTelcoViewModel3 = oneConsentNonTelcoViewModel;
        }
        oneConsentNonTelcoViewModel3.getConsentNonTelco(it);
    }
}