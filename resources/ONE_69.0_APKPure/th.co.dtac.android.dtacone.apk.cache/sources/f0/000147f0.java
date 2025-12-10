package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$UpPassFormScreen$17 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$UpPassFormScreen$17 extends Lambda implements Function0<Unit> {
    final /* synthetic */ UpPassFormType $formType;
    final /* synthetic */ MutableState<Boolean> $isShowRetryUrl$delegate;
    final /* synthetic */ Function1<ExitCallbackState, Unit> $onExit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassFormScreenKt$UpPassFormScreen$17(Function1<? super ExitCallbackState, Unit> function1, UpPassFormType upPassFormType, MutableState<Boolean> mutableState) {
        super(0);
        this.$onExit = function1;
        this.$formType = upPassFormType;
        this.$isShowRetryUrl$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UpPassFormScreenKt.m9134r(this.$isShowRetryUrl$delegate, false);
        this.$onExit.invoke(new ExitCallbackState.UpPassForm(this.$formType, false, false, 6, null));
    }
}