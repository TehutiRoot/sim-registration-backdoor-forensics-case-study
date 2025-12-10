package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistVerifyOtpFragment$setUpView$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistVerifyOtpFragment$setUpView$3 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ MrtrPrepaidReregistVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistVerifyOtpFragment$setUpView$3(MrtrPrepaidReregistVerifyOtpFragment mrtrPrepaidReregistVerifyOtpFragment) {
        super(1);
        this.this$0 = mrtrPrepaidReregistVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        DtacEditText dtacEditText;
        String obj = charSequence.toString();
        dtacEditText = this.this$0.f103858u;
        if (dtacEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpDigit2");
            dtacEditText = null;
        }
        MrtrPrepaidReregistVerifyOtpFragment.m4544U(obj, dtacEditText);
    }
}