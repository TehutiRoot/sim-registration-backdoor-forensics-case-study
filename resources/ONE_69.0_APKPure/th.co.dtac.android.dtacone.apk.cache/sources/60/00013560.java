package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationVerifyOTPFragment$setupEditText$6 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationVerifyOTPFragment$setupEditText$6 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ OneOnlineRegistrationVerifyOTPFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationVerifyOTPFragment$setupEditText$6(OneOnlineRegistrationVerifyOTPFragment oneOnlineRegistrationVerifyOTPFragment) {
        super(1);
        this.this$0 = oneOnlineRegistrationVerifyOTPFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        OneEditText oneEditText;
        OneEditText oneEditText2;
        String obj = charSequence.toString();
        oneEditText = this.this$0.f92895q;
        OneEditText oneEditText3 = null;
        if (oneEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit3");
            oneEditText = null;
        }
        OneOnlineRegistrationVerifyOTPFragment.m12920U(obj, oneEditText);
        String obj2 = charSequence.toString();
        oneEditText2 = this.this$0.f92896r;
        if (oneEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit4");
        } else {
            oneEditText3 = oneEditText2;
        }
        OneOnlineRegistrationVerifyOTPFragment.m12931J(obj2, oneEditText3);
    }
}