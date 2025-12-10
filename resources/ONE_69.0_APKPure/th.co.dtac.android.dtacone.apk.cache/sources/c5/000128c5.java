package th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist.MrtrPrepaidReRegistActivity$ComposeContent$dismissDialog$1 */
/* loaded from: classes10.dex */
public final class MrtrPrepaidReRegistActivity$ComposeContent$dismissDialog$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidReRegistActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReRegistActivity$ComposeContent$dismissDialog$1(MrtrPrepaidReRegistActivity mrtrPrepaidReRegistActivity) {
        super(0);
        this.this$0 = mrtrPrepaidReRegistActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0 function0;
        this.this$0.getMrtrPrepaidReregistViewModel().dismissMessageDialog();
        function0 = this.this$0.f87784s;
        function0.invoke();
    }
}