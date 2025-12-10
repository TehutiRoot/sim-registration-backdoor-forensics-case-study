package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpVerifyOtpFragment$setUpView$5 */
/* loaded from: classes10.dex */
public final class OneMnpVerifyOtpFragment$setUpView$5 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ OneMnpVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpVerifyOtpFragment$setUpView$5(OneMnpVerifyOtpFragment oneMnpVerifyOtpFragment) {
        super(1);
        this.this$0 = oneMnpVerifyOtpFragment;
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
        OneMnpVerifyOtpFragment oneMnpVerifyOtpFragment = this.this$0;
        String obj = charSequence.toString();
        oneEditText = this.this$0.f91817l;
        OneEditText oneEditText3 = null;
        if (oneEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit2");
            oneEditText = null;
        }
        OneMnpVerifyOtpFragment.m13697Q(oneMnpVerifyOtpFragment, obj, oneEditText);
        String obj2 = charSequence.toString();
        oneEditText2 = this.this$0.f91818m;
        if (oneEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit3");
        } else {
            oneEditText3 = oneEditText2;
        }
        OneMnpVerifyOtpFragment.m13709E(obj2, oneEditText3);
    }
}