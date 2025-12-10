package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.KeyboardUtil;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpVerifyOTPFragment$initView$5 */
/* loaded from: classes9.dex */
public final class MrtrMnpVerifyOTPFragment$initView$5 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ MrtrMnpVerifyOTPFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpVerifyOTPFragment$initView$5(MrtrMnpVerifyOTPFragment mrtrMnpVerifyOTPFragment) {
        super(1);
        this.this$0 = mrtrMnpVerifyOTPFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        String m6119x;
        MrtrMnpValidateViewModel mrtrMnpValidateViewModel;
        KeyboardUtil keyboardUtil;
        m6119x = this.this$0.m6119x();
        if (m6119x.length() == 4) {
            mrtrMnpValidateViewModel = this.this$0.f102164o;
            if (mrtrMnpValidateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mrtrMnpValidateViewModel");
                mrtrMnpValidateViewModel = null;
            }
            mrtrMnpValidateViewModel.callVerifyOtp(m6119x);
            this.this$0.clearOtp();
            keyboardUtil = this.this$0.f102165p;
            if (keyboardUtil != null) {
                keyboardUtil.hideKeyboard();
            }
        }
    }
}