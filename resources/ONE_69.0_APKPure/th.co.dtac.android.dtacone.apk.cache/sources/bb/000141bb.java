package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$2$1 */
/* loaded from: classes10.dex */
public final class ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $isShowError$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessErrorSharedFlowKt$ProcessErrorSharedFlow$2$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isShowError$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ProcessErrorSharedFlowKt.m9590d(this.$isShowError$delegate, false);
    }
}