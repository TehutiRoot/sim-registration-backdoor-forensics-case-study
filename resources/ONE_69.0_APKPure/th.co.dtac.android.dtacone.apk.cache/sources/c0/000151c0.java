package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistVerifyOtpFragment$navigateNextToCommon$onSuccessCallback$1 */
/* loaded from: classes9.dex */
public final class C16390x83a9ed73 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ MrtrPrepaidReregistVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16390x83a9ed73(MrtrPrepaidReregistVerifyOtpFragment mrtrPrepaidReregistVerifyOtpFragment) {
        super(1);
        this.this$0 = mrtrPrepaidReregistVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getFormType() instanceof UpPassFormType.Ocr) {
            this.this$0.m4550O(result);
        } else {
            this.this$0.m4553L(result);
        }
    }
}