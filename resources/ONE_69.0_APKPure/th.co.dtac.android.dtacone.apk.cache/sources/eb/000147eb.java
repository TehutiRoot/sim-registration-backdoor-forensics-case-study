package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.UpPassFormScreenKt$UpPassFormScreen$12$1 */
/* loaded from: classes10.dex */
public final class UpPassFormScreenKt$UpPassFormScreen$12$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<Boolean> $showConfirmUseCardReader$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormScreenKt$UpPassFormScreen$12$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showConfirmUseCardReader$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UpPassFormScreenKt.m9158A(this.$showConfirmUseCardReader$delegate, false);
    }
}