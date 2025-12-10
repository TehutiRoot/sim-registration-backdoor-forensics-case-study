package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent;

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
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentTMNFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostConsentTMNFragment$setupObserve$2 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OnePre2PostConsentTMNFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostConsentTMNFragment$setupObserve$2(OnePre2PostConsentTMNFragment onePre2PostConsentTMNFragment) {
        super(1);
        this.this$0 = onePre2PostConsentTMNFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentNonTelco) {
        OnePre2PostViewModel m11128o;
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        OneFontButton oneFontButton;
        OneFontButton oneFontButton2;
        Intrinsics.checkNotNullParameter(consentNonTelco, "consentNonTelco");
        List<ConsentNonTelco> consent = consentNonTelco.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        m11128o = this.this$0.m11128o();
        m11128o.getOneModel().setConsentVersionLabel(consent.get(0).getConsentVersionLabel());
        oneFontTextView = this.this$0.f95202n;
        OneFontButton oneFontButton3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentTMNTitleTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setText(consent.get(0).getConsentTitle());
        oneFontTextView2 = this.this$0.f95203o;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentTMNDetailTextView");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setText(consent.get(0).getConsent());
        oneFontButton = this.this$0.f95201m;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allowConsentTMNButton");
            oneFontButton = null;
        }
        oneFontButton.setText(consent.get(0).getConsentAgree());
        oneFontButton2 = this.this$0.f95200l;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notAllowConsentTMNScrollButton");
        } else {
            oneFontButton3 = oneFontButton2;
        }
        oneFontButton3.setText(consent.get(0).getConsentDecline());
    }
}