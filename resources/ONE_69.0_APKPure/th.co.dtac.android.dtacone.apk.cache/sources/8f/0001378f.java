package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

import androidx.lifecycle.MutableLiveData;
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

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentTelcoFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidConsentTelcoFragment$initView$1 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OnePostpaidConsentTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidConsentTelcoFragment$initView$1(OnePostpaidConsentTelcoFragment onePostpaidConsentTelcoFragment) {
        super(1);
        this.this$0 = onePostpaidConsentTelcoFragment;
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
        OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel;
        ConsentNonTelco consentNonTelco;
        String consentAgree;
        ConsentNonTelco consentNonTelco2;
        ConsentNonTelco consentNonTelco3;
        Intrinsics.checkNotNullParameter(it, "it");
        oneFontTextView = this.this$0.f93900l;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("telcoTitle");
            oneFontTextView = null;
        }
        List<ConsentNonTelco> consent = it.getConsent();
        String str = "";
        oneFontTextView.setText((consent == null || (consentNonTelco3 = consent.get(0)) == null || (r2 = consentNonTelco3.getConsentTitle()) == null) ? "" : "");
        oneFontTextView2 = this.this$0.f93901m;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("telcoDetail");
            oneFontTextView2 = null;
        }
        List<ConsentNonTelco> consent2 = it.getConsent();
        oneFontTextView2.setText((consent2 == null || (consentNonTelco2 = consent2.get(0)) == null || (r2 = consentNonTelco2.getConsent()) == null) ? "" : "");
        oneFontButton = this.this$0.f93902n;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnAllow");
            oneFontButton = null;
        }
        List<ConsentNonTelco> consent3 = it.getConsent();
        if (consent3 != null && (consentNonTelco = consent3.get(0)) != null && (consentAgree = consentNonTelco.getConsentAgree()) != null) {
            str = consentAgree;
        }
        oneFontButton.setText(str);
        oneConsentNonTelcoViewModel = this.this$0.f93903o;
        if (oneConsentNonTelcoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            oneConsentNonTelcoViewModel = null;
        }
        MutableLiveData<ConsentNonTelco> consentNonTelco4 = oneConsentNonTelcoViewModel.getConsentNonTelco();
        List<ConsentNonTelco> consent4 = it.getConsent();
        consentNonTelco4.setValue(consent4 != null ? consent4.get(0) : null);
        this.this$0.m12304m(it.getConsent());
    }
}