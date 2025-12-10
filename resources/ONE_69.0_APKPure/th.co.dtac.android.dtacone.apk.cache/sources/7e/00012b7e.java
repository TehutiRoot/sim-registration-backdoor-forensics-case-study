package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerVerifyOtpFragment$setUpView$4 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerVerifyOtpFragment$setUpView$4 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ OneChangeOwnerVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerVerifyOtpFragment$setUpView$4(OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment) {
        super(1);
        this.this$0 = oneChangeOwnerVerifyOtpFragment;
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
        OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment = this.this$0;
        String obj = charSequence.toString();
        oneEditText = this.this$0.f89099o;
        OneEditText oneEditText3 = null;
        if (oneEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit2");
            oneEditText = null;
        }
        OneChangeOwnerVerifyOtpFragment.m15580k0(oneChangeOwnerVerifyOtpFragment, obj, oneEditText);
        String obj2 = charSequence.toString();
        oneEditText2 = this.this$0.f89100p;
        if (oneEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit3");
        } else {
            oneEditText3 = oneEditText2;
        }
        OneChangeOwnerVerifyOtpFragment.m15592Y(obj2, oneEditText3);
    }
}