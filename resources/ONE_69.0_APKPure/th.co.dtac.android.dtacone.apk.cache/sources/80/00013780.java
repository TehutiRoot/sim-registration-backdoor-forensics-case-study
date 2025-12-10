package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

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

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentNonTelcoFragment$initView$5 */
/* loaded from: classes10.dex */
public final class OnePostpaidConsentNonTelcoFragment$initView$5 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OnePostpaidConsentNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidConsentNonTelcoFragment$initView$5(OnePostpaidConsentNonTelcoFragment onePostpaidConsentNonTelcoFragment) {
        super(1);
        this.this$0 = onePostpaidConsentNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse it) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        OneFontButton oneFontButton;
        OneFontButton oneFontButton2;
        ConsentNonTelco consentNonTelco;
        String consentDecline;
        ConsentNonTelco consentNonTelco2;
        ConsentNonTelco consentNonTelco3;
        ConsentNonTelco consentNonTelco4;
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.getViewModelRegistration().setConsentNonTelcoResponse(it);
        oneFontTextView = this.this$0.f93866l;
        OneFontButton oneFontButton3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nontelcoTitle");
            oneFontTextView = null;
        }
        List<ConsentNonTelco> consent = it.getConsent();
        String str = "";
        oneFontTextView.setText((consent == null || (consentNonTelco4 = consent.get(0)) == null || (r2 = consentNonTelco4.getConsentTitle()) == null) ? "" : "");
        oneFontTextView2 = this.this$0.f93867m;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nontelcoDetail");
            oneFontTextView2 = null;
        }
        List<ConsentNonTelco> consent2 = it.getConsent();
        oneFontTextView2.setText((consent2 == null || (consentNonTelco3 = consent2.get(0)) == null || (r2 = consentNonTelco3.getConsent()) == null) ? "" : "");
        oneFontButton = this.this$0.f93868n;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnAllow");
            oneFontButton = null;
        }
        List<ConsentNonTelco> consent3 = it.getConsent();
        oneFontButton.setText((consent3 == null || (consentNonTelco2 = consent3.get(0)) == null || (r2 = consentNonTelco2.getConsentAgree()) == null) ? "" : "");
        oneFontButton2 = this.this$0.f93869o;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnNotAllow");
        } else {
            oneFontButton3 = oneFontButton2;
        }
        List<ConsentNonTelco> consent4 = it.getConsent();
        if (consent4 != null && (consentNonTelco = consent4.get(0)) != null && (consentDecline = consentNonTelco.getConsentDecline()) != null) {
            str = consentDecline;
        }
        oneFontButton3.setText(str);
        OnePostpaidConsentNonTelcoFragment onePostpaidConsentNonTelcoFragment = this.this$0;
        List<ConsentNonTelco> consent5 = it.getConsent();
        Intrinsics.checkNotNull(consent5);
        onePostpaidConsentNonTelcoFragment.m12321q(consent5);
        this.this$0.m12323o();
    }
}