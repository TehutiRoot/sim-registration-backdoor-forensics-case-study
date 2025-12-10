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

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentNonTelco", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.consent.OneMnpConsentNonTelcoFragment$initView$3 */
/* loaded from: classes10.dex */
public final class OneMnpConsentNonTelcoFragment$initView$3 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OneMnpConsentNonTelcoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpConsentNonTelcoFragment$initView$3(OneMnpConsentNonTelcoFragment oneMnpConsentNonTelcoFragment) {
        super(1);
        this.this$0 = oneMnpConsentNonTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentNonTelco) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        OneFontButton oneFontButton;
        OneFontButton oneFontButton2;
        Intrinsics.checkNotNullParameter(consentNonTelco, "consentNonTelco");
        List<ConsentNonTelco> consent = consentNonTelco.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        oneFontTextView = this.this$0.f91848n;
        OneFontButton oneFontButton3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentNontelcoTitleTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setText(consent.get(0).getConsentTitle());
        oneFontTextView2 = this.this$0.f91852r;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentNontelcoTitleDetailTextView");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setText(consent.get(0).getConsent());
        oneFontButton = this.this$0.f91847m;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allowConsentTMNButton");
            oneFontButton = null;
        }
        oneFontButton.setText(consent.get(0).getConsentAgree());
        oneFontButton2 = this.this$0.f91846l;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notAllowConsentTMNScrollButton");
        } else {
            oneFontButton3 = oneFontButton2;
        }
        oneFontButton3.setText(consent.get(0).getConsentDecline());
        this.this$0.m13673n(consent);
    }
}