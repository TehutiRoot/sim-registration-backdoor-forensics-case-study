package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "consentContent", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationConsentFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationConsentFragment$setupObserve$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneOnlineRegistrationConsentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationConsentFragment$setupObserve$1(OneOnlineRegistrationConsentFragment oneOnlineRegistrationConsentFragment) {
        super(1);
        this.this$0 = oneOnlineRegistrationConsentFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String consentContent) {
        OneFontTextView oneFontTextView;
        Intrinsics.checkNotNullExpressionValue(consentContent, "consentContent");
        String replace$default = AbstractC19741eO1.replace$default(consentContent, "\\n", "\n", false, 4, (Object) null);
        oneFontTextView = this.this$0.f92654l;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentDetailTextView");
            oneFontTextView = null;
        }
        oneFontTextView.setText(replace$default);
    }
}