package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistVerifyOtpFragment$onStart$2$1 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistVerifyOtpFragment$onStart$2$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MrtrPrepaidReregistVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistVerifyOtpFragment$onStart$2$1(MrtrPrepaidReregistVerifyOtpFragment mrtrPrepaidReregistVerifyOtpFragment) {
        super(1);
        this.this$0 = mrtrPrepaidReregistVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.m4564A();
        this.this$0.navigateNextToCommon(new UpPassFormType.Ocr(null, null, false, null, 15, null));
    }
}