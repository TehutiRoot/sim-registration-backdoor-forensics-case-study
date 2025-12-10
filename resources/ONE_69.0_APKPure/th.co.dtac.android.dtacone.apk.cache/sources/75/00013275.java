package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

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
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentTmn", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpTMNFragment$initView$4 */
/* loaded from: classes10.dex */
public final class OneMnpTMNFragment$initView$4 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OneMnpTMNFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpTMNFragment$initView$4(OneMnpTMNFragment oneMnpTMNFragment) {
        super(1);
        this.this$0 = oneMnpTMNFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentTmn) {
        OneFontTextView oneFontTextView;
        OneFontTextView oneFontTextView2;
        OneFontButton oneFontButton;
        OneFontButton oneFontButton2;
        OneMnpViewModel viewModel;
        Intrinsics.checkNotNullParameter(consentTmn, "consentTmn");
        List<ConsentNonTelco> consent = consentTmn.getConsent();
        if (consent == null) {
            consent = new ArrayList<>();
        }
        oneFontTextView = this.this$0.f91791l;
        OneFontButton oneFontButton3 = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentTmnTitleTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setText(consent.get(0).getConsentTitle());
        oneFontTextView2 = this.this$0.f91793n;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentTmnDetailTextView");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setText(consent.get(0).getConsent());
        oneFontButton = this.this$0.f91794o;
        if (oneFontButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allowConsentTmnButton");
            oneFontButton = null;
        }
        oneFontButton.setText(consent.get(0).getConsentAgree());
        oneFontButton2 = this.this$0.f91795p;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notAllowConsentTmnButton");
        } else {
            oneFontButton3 = oneFontButton2;
        }
        oneFontButton3.setText(consent.get(0).getConsentDecline());
        viewModel = this.this$0.getViewModel();
        viewModel.setConsentTMNDataResponse(consentTmn);
    }
}