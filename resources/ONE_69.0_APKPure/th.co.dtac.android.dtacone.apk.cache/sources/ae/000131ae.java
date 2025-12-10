package th.p047co.dtac.android.dtacone.view.appOne.mnp.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$navigateToOcr$upPassFormFragment$2 */
/* loaded from: classes10.dex */
public final class OneMnpActivity$navigateToOcr$upPassFormFragment$2 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ OneMnpActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpActivity$navigateToOcr$upPassFormFragment$2(OneMnpActivity oneMnpActivity) {
        super(1);
        this.this$0 = oneMnpActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        boolean z;
        Intrinsics.checkNotNullParameter(result, "result");
        z = this.this$0.f91352x;
        if (z) {
            return;
        }
        this.this$0.f91352x = true;
        this.this$0.m13994o0(result);
    }
}