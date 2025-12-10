package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpVerifyOtpFragment$setUpView$7 */
/* loaded from: classes10.dex */
public final class OneMnpVerifyOtpFragment$setUpView$7 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ OneMnpVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpVerifyOtpFragment$setUpView$7(OneMnpVerifyOtpFragment oneMnpVerifyOtpFragment) {
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
        String m13713A;
        OneMnpActivity m13682z;
        OneMnpViewModel viewModel;
        OneMnpViewModel viewModel2;
        OneMnpVerifyOtpFragment oneMnpVerifyOtpFragment = this.this$0;
        String obj = charSequence.toString();
        oneEditText = this.this$0.f91819n;
        if (oneEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit4");
            oneEditText = null;
        }
        OneMnpVerifyOtpFragment.m13697Q(oneMnpVerifyOtpFragment, obj, oneEditText);
        m13713A = this.this$0.m13713A();
        if (m13713A.length() == 4) {
            m13682z = this.this$0.m13682z();
            if (m13682z.getPfViewModel().isCompanyTrue()) {
                viewModel2 = this.this$0.getViewModel();
                viewModel2.verifyOtpTransactionTrueCompany(m13713A);
                return;
            }
            viewModel = this.this$0.getViewModel();
            viewModel.verifyOtp(m13713A);
        }
    }
}