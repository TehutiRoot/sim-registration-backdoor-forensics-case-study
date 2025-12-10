package th.p047co.dtac.android.dtacone.view.activity.mrtr_changesim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrChangeSimActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrChangeSimActivity.kt\nth/co/dtac/android/dtacone/view/activity/mrtr_changesim/MrtrChangeSimActivity$ComposeContent$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,542:1\n230#2,5:543\n*S KotlinDebug\n*F\n+ 1 MrtrChangeSimActivity.kt\nth/co/dtac/android/dtacone/view/activity/mrtr_changesim/MrtrChangeSimActivity$ComposeContent$2\n*L\n179#1:543,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.activity.mrtr_changesim.MrtrChangeSimActivity$ComposeContent$2 */
/* loaded from: classes10.dex */
public final class MrtrChangeSimActivity$ComposeContent$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrChangeSimActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimActivity$ComposeContent$2(MrtrChangeSimActivity mrtrChangeSimActivity) {
        super(0);
        this.this$0 = mrtrChangeSimActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableStateFlow mutableStateFlow;
        Object value;
        mutableStateFlow = this.this$0.f87592r;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
        this.this$0.getOnDismissDialog().invoke();
        this.this$0.setCancelText(null);
        this.this$0.setConfirmText(null);
    }
}