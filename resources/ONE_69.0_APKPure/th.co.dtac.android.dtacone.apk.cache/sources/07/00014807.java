package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$UpPassFormScreen$9$1 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$UpPassFormScreen$9$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onSwitchCardReaderMode;
    final /* synthetic */ MutableState<Boolean> $showDetectCardReader$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpPassFormScreenKt$UpPassFormScreen$9$1(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState) {
        super(0);
        this.$onSwitchCardReaderMode = function1;
        this.$showDetectCardReader$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSwitchCardReaderMode.invoke(Boolean.TRUE);
        UpPassFormScreenKt.m9130v(this.$showDetectCardReader$delegate, false);
    }
}