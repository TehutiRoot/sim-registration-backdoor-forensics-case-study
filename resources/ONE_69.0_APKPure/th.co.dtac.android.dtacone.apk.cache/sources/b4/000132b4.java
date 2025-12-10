package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.consent;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentTelcoFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OneMnpConsentTelcoFragment$initView$1 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OneMnpConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpConsentTelcoFragment$initView$1(OneMnpConsentTelcoFragment oneMnpConsentTelcoFragment) {
        super(1);
        this.this$0 = oneMnpConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentTelco) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        OneFontButton oneFontButton;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        Intrinsics.checkNotNullParameter(consentTelco, "consentTelco");
        List<ConsentNonTelco> consent = consentTelco.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        oneFontTextView = this.this$0.f91875m;
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel2 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentTelcoTitleTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setText(consent.get(0).getConsentTitle());
        oneFontTextView2 = this.this$0.f91878p;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentTelcoDetailTextView");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setText(consent.get(0).getConsent());
        oneFontButton = this.this$0.f91876n;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allowConsentTelcoButton");
            oneFontButton = null;
        }
        oneFontButton.setText(consent.get(0).getConsentAgree());
        oneConsentNonTelcoViewModel = this.this$0.f91871i;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            oneConsentNonTelcoViewModel2 = oneConsentNonTelcoViewModel;
        }
        oneConsentNonTelcoViewModel2.getConsentNonTelco().setValue(consent.get(0));
        this.this$0.m13665n(consent);
    }
}